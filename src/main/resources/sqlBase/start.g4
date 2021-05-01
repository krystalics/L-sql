grammar start;
//采用深度递归的方式将所有的语法规则进行组合、重新理解整个文件
@members {
  /**
   * When false, INTERSECT is given the greater precedence over the other set
   * operations (UNION, EXCEPT and MINUS) as per the SQL standard.
   */
  public boolean legacy_setops_precedence_enbled = false;

  /**
   * When false, a literal with an exponent would be converted into
   * double type rather than decimal type.
   */
  public boolean legacy_exponent_literal_as_decimal_enabled = false;

  /**
   * Verify whether current token is a valid decimal token (which contains dot).
   * Returns true if the character that follows the token is not a digit or letter or underscore.
   *
   * For example:
   * For char stream "2.3", "2." is not a valid decimal token, because it is followed by digit '3'.
   * For char stream "2.3_", "2.3" is not a valid decimal token, because it is followed by '_'.
   * For char stream "2.3W", "2.3" is not a valid decimal token, because it is followed by 'W'.
   * For char stream "12.0D 34.E2+0.12 "  12.0D is a valid decimal token because it is followed
   * by a space. 34.E2 is a valid decimal token because it is followed by symbol '+'
   * which is not a digit or letter or underscore.
   */
  public boolean isValidDecimal() {
    int nextChar = _input.LA(1);
    if (nextChar >= 'A' && nextChar <= 'Z' || nextChar >= '0' && nextChar <= '9' ||
      nextChar == '_') {
      return false;
    } else {
      return true;
    }
  }

  /**
   * When true, the behavior of keywords follows ANSI SQL standard.
   */
  public boolean SQL_standard_keyword_behavior = false;
}

//1。语法从 singleStatement开始、表示单独的语句
singleStatement
    : statement ';'* EOF
    ;
//sql语句的语法规则
statement
    : query             #statementDefault
    | ctes? dmlStatementNoWith                                         #dmlStatement

    ;
dmlStatementNoWith
    : insertInto queryTerm queryOrganization                                       #singleInsertQuery
    | fromClause multiInsertQueryBody+                                             #multiInsertQuery
    | DELETE FROM multipartIdentifier tableAlias whereClause?                      #deleteFromTable
    | UPDATE multipartIdentifier tableAlias setClause whereClause?                 #updateTable
    | MERGE INTO target=multipartIdentifier targetAlias=tableAlias
        USING (source=multipartIdentifier |
          '(' sourceQuery=query')') sourceAlias=tableAlias
        ON mergeCondition=booleanExpression
        matchedClause*
        notMatchedClause*                                                          #mergeIntoTable
    ;
insertInto
    : INSERT OVERWRITE TABLE? multipartIdentifier (partitionSpec (IF NOT EXISTS)?)?                         #insertOverwriteTable
    | INSERT INTO TABLE? multipartIdentifier partitionSpec? (IF NOT EXISTS)?                                #insertIntoTable
    | INSERT OVERWRITE LOCAL? DIRECTORY path=STRING rowFormat? createFileFormat?                            #insertOverwriteHiveDir
    | INSERT OVERWRITE LOCAL? DIRECTORY (path=STRING)? tableProvider (OPTIONS options=tablePropertyList)?   #insertOverwriteDir
    ;

query
    : ctes? queryTerm queryOrganization
    ;
//    with语句
ctes
    : WITH namedQuery (',' namedQuery)*
    ;
//将query，命名
namedQuery
    : name=errorCapturingIdentifier (columnAliases=identifierList)? AS? '(' query ')'
    ;
// 这个规则是用来显示捕捉错误的 标识符、例如test-table 、它本该是 'test-table'
// 应该在所有的 一开始的符号不是表达式的 语法规则中使用  errorCapturingIdentifier 来代替 identifier
// 否则合法的表达式 "a-b" 会被认为是标识符
errorCapturingIdentifier
    : identifier errorCapturingIdentifierExtra
    ;
identifier
    : strictIdentifier
    | {!SQL_standard_keyword_behavior}? strictNonReserved
    ;
strictIdentifier
    : IDENTIFIER            #unquotedIdentifier
    | quotedIdentifier      #quotedIdentifierAlternative
    | {SQL_standard_keyword_behavior}? ansiNonReserved #unquotedIdentifier
    | {!SQL_standard_keyword_behavior}? nonReserved    #unquotedIdentifier
    ;
//    使用 ` ` 符号包围的标识符 、标识符就是 字母、数字、下划线的组合
quotedIdentifier
    : BACKQUOTED_IDENTIFIER
    ;
//     额外的 left-factoring 语法、使用 - 符号连接是错误的标识符
errorCapturingIdentifierExtra
    : (MINUS identifier)+   #errorIdent
    |                       #realIdent
    ;
//    标识符列表、里面的seq是序列、+= 表示数组、这里是多个数组的结合 [xxx,xxx],[ssx,xxx]
identifierList
    : '(' identifierSeq ')'
    ;
identifierSeq
    : ident+=errorCapturingIdentifier (',' ident+=errorCapturingIdentifier)*
    ;

//查询条件
queryTerm
    : queryPrimary                                                                       #queryTermDefault
    | left=queryTerm {legacy_setops_precedence_enbled}?
        operator=(INTERSECT | UNION | EXCEPT | SETMINUS) setQuantifier? right=queryTerm  #setOperation
    | left=queryTerm {!legacy_setops_precedence_enbled}?
        operator=INTERSECT setQuantifier? right=queryTerm                                #setOperation
    | left=queryTerm {!legacy_setops_precedence_enbled}?
        operator=(UNION | EXCEPT | SETMINUS) setQuantifier? right=queryTerm              #setOperation
    ;

queryPrimary
    : querySpecification                                                    #queryPrimaryDefault
    | fromStatement                                                         #fromStmt
    | TABLE multipartIdentifier                                             #table
    | inlineTable                                                           #inlineTableDefault1
    | '(' query ')'                                                         #subquery
    ;

fromStatement
    : fromClause fromStatementBody+
    ;

fromStatementBody
    : transformClause
      whereClause?
      queryOrganization
    | selectClause
      lateralView*
      whereClause?
      aggregationClause?
      havingClause?
      windowClause?
      queryOrganization
    ;
whereClause
    : WHERE booleanExpression
    ;
selectClause
    : SELECT (hints+=hint)* setQuantifier? namedExpressionSeq
    ;
querySpecification
    : transformClause fromClause?
    ;
aggregationClause
    : GROUP BY groupingExpressions+=expression (',' groupingExpressions+=expression)* (
      WITH kind=ROLLUP
    | WITH kind=CUBE
    | kind=GROUPING SETS '(' groupingSet (',' groupingSet)* ')')?
    | GROUP BY kind=GROUPING SETS '(' groupingSet (',' groupingSet)* ')'
    ;
groupingSet
    : '(' (expression (',' expression)*)? ')'
    | expression
    ;
havingClause
    : HAVING booleanExpression
    ;
hint
    : '/*+' hintStatements+=hintStatement (','? hintStatements+=hintStatement)* '*/'
    ;
hintStatement
    : hintName=identifier
    | hintName=identifier '(' parameters+=primaryExpression (',' parameters+=primaryExpression)* ')'
    ;
//
/**
 1。transform 语句 ：使用函数转换数组中的元素
  SELECT transform(array(1, 2, 3), x -> x + 1);
    [2,3,4]
   SELECT transform(array(1, 2, 3), (x, i) -> x + i);
    [1,3,5]

 2。map 语句 、构成map
   map(key0, value0, key1, value1, ...) - Creates a map with the given key/value pairs.
     SELECT map(1.0, '2', 3.0, '4');
     {1.0:"2",3.0:"4"}

     reduce 语句目前还没有找到case
 */
transformClause
    : (SELECT kind=TRANSFORM '(' namedExpressionSeq ')'
            | kind=MAP namedExpressionSeq
            | kind=REDUCE namedExpressionSeq)
            inRowFormat=rowFormat?
            (RECORDWRITER recordWriter=STRING)?
            USING script=STRING
            (AS (identifierSeq|colTypeList|('(' (identifierSeq|colTypeList)')')))?
            outRowFormat=rowFormat?
            (RECORDREADER recordReader=STRING)?
    ;
namedExpressionSeq
    : namedExpression (',' namedExpression)*
    ;
//    数据行的格式
rowFormat
    : ROW FORMAT SERDE name=STRING (WITH SERDEPROPERTIES props=tablePropertyList)? #rowFormatSerde
    | ROW FOMMAT DELIMITED
      (FIELDS TERMINATED BY fieldsTerminatedBy=STRING (ESCAPED BY escapedBy=STRING)?)?
      (COLLECTION ITEMS TERMINATED BY collectionItemsTerminatedBy=STRING)?
      (MAP KEYS TERMINATED BY keysTerminatedBy=STRING)?
      (LINES TERMINATED BY linesSeparatedBy=STRING)?
      (NULL DEFINED AS nullDefinedAs=STRING)?                                       #rowFormatDelimited
    ;
//    表的属性列表 (标识符='x',xx) key是标识符或者字符串、value是常量数据、例如字符串、数字、bool表达式
tablePropertyList
    : '(' tableProperty (',' tableProperty)* ')'
    ;
tableProperty
    : key=tablePropertyKey (EQ? value=tablePropertyValue)?
    ;
tablePropertyKey
    : identifier ('.' identifier)*
    | STRING
    ;
tablePropertyValue
    : INTEGER_VALUE
    | DECIMAL_VALUE
    | booleanValue
    | STRING
    ;
booleanValue
    : TRUE | FALSE
    ;

fromClause
    : FROM relation (',' relation)* lateralView* pivotClause?
    ;
//    表
relation
    : relationPrimary joinRelation*
    ;

relationPrimary
    : multipartIdentifier sample? tableAlias  #tableName
    | '(' query ')' sample? tableAlias        #aliasedQuery
    | '(' relation ')' sample? tableAlias     #aliasedRelation
    | inlineTable                             #inlineTableDefault2
    | functionTable                           #tableValuedFunction
    ;

inlineTable
    : VALUES expression (',' expression)* tableAlias
    ;

functionTable
    : funcName=errorCapturingIdentifier '(' (expression (',' expression)*)? ')' tableAlias
    ;


sample
    : TABLESAMPLE '(' sampleMethod? ')'
    ;
sampleMethod
    : negativeSign=MINUS? percentage=(INTEGER_VALUE | DECIMAL_VALUE) PERCENTLIT     #sampleByPercentile
    | expression ROWS

    ;
//    表达式、
expression
    : booleanExpression
    ;
booleanExpression
    : NOT booleanExpression             # logicalNot
    | EXISTS '(' query ')'              # exists
    | valueExpression predicate?        # predicated
    | left=booleanExpression operation=AND right=booleanExpression # logicalBinary
    | left=booleanExpression operation=AND right=booleanExpression # logicalBinary
    ;
valueExpression
    : primaryExpression                 #valueExpressionDefault
    ;
//    表达式是 每个分支都需要额外处理
/*
    主要的表达式包括
    1。当前时间
    2。case when语句、(两种)
    3。强转数据类型
    4。结构体
    5。获取所有行中的第一行
    6。获取所有行中的最后一行
    7。类似于java的 indexOf 功能、返回前面字符串在后面字符串中的位置
    8。常量：包括 NULL、interval 时间间隔计算、标识符、数字、bool、字符串
    9。* 号
    10。合格的名字.* 、应该是选择表中的所有字段
    11。(表达式的别名 或者表达式自己)加上标识符列表
    12。也可以是查询 query
    13。函数调用
    14。标识符->表达式
    15。(标识符,标识符...) -> 表达式 、这个和14应该是识别 lambda表达式
    16。数组[xx] 子数组
    17。标识符 列的引用
    18。pe.filedname 取消引用
    19。(表达式) 用括号包围的表达式
    20。EXTRACT (id FROM tb) 从tb中抽取信息
    21。SUBSTR|SUBSTRING ('source string',1,2)获取source string第一个字符开始后的2位
    22.TRIM（both|leading|trailing 'd' FROM xx）trim是去除字符串两边的空格，both表示前后都去掉、leading表示只去掉前面的空格、traling去掉末尾的空格
    23。overlay(input, replace, pos[, len]) - Replace input with replace that starts at pos and is of length len.
*/
primaryExpression
    : name=(CURRENT_DATE | CURRENT_TIMESTAMP)                                                  #currentDatetime
    | CASE whenClause+ (ELSE elseExpression=expression)? END                                   #searchedCase
    | CASE value=expression whenClause+ (ELSE elseExpression=expression)? END                  #simpleCase
    | CAST '(' expression AS dataType ')'                                                      #cast
    | STRUCT '(' (argument+=namedExpression (',' argument+=namedExpression)*)? ')'             #struct
    | FIRST '(' expression (IGNORE NULLS)? ')'                                                 #first
    | LAST '(' expression (IGNORE NULLS)? ')'                                                  #last
    | POSITION '(' substr=valueExpression IN str=valueExpression ')'                           #position
    | constant                                                                                 #constantDefault
    | ASTERISK                                                                                 #star
    | qualifiedName '.' ASTERISK                                                               #star
    | '(' namedExpression (',' namedExpression)+ ')'                                           #rowConstructor
    | '(' query ')'                                                                            #subqueryExpression
    | functionName '(' (setQuantifier? argument+=expression (',' argument+=expression)*)? ')'
       (FILTER '(' WHERE where=booleanExpression ')')? (OVER windowSpec)?                      #functionCall
    | identifier '->' expression                                                               #lambda
    | '(' identifier (',' identifier)+ ')' '->' expression                                     #lambda
    | value=primaryExpression '[' index=valueExpression ']'                                    #subscript
    | identifier                                                                               #columnReference
    | base=primaryExpression '.' fieldName=identifier                                          #dereference
    | '(' expression ')'                                                                       #parenthesizedExpression
    | EXTRACT '(' field=identifier FROM source=valueExpression ')'                             #extract
    | (SUBSTR | SUBSTRING) '(' str=valueExpression (FROM | ',') pos=valueExpression
      ((FOR | ',') len=valueExpression)? ')'                                                   #substring
    | TRIM '(' trimOption=(BOTH | LEADING | TRAILING)? (trimStr=valueExpression)?
       FROM srcStr=valueExpression ')'                                                         #trim
    | OVERLAY '(' input=valueExpression PLACING replace=valueExpression
      FROM position=valueExpression (FOR length=valueExpression)? ')'                          #overlay
    ;

whenClause
    : WHEN conditino=expression THEN result=expression
    ;
//一列拆分为多行 、把数组拆成单个词
//name    food
//Lily	apple、milk、rice
//Amy	meat、water

//name	Food
//Lily	apple
//Lily	milk
//Lily	rice
//Amy	    meat
//Amy 	water
lateralView
    :
    ;

constant
    : NULL
    | interval
    | identifier STRING
    | number
    | booleanValue
    | STRING+
    ;
//    表示间隔、用于时间函数
interval
    : INTERVAL (errorCapturingMultiUnitsInterval | errorCapturingUnitToUnitInterval)?
    ;

errorCapturingMultiUnitsInterval
    : multiUnitsInterval unitToUnitInterval?
    ;

multiUnitsInterval
    : (intervalValue unit+=identifier)+
    ;

errorCapturingUnitToUnitInterval
    : body=unitToUnitInterval (error1=multiUnitsInterval | error2=unitToUnitInterval)?
    ;

unitToUnitInterval
    : value=intervalValue from=identifier TO to=identifier
    ;

intervalValue
    : (PLUS | MINUS)? (INTEGER_VALUE | DECIMAL_VALUE)
    | STRING
    ;

number
    : {!legacy_exponent_literal_as_decimal_enabled}? MINUS? EXPONENT_VALUE #exponentLiteral
    | {!legacy_exponent_literal_as_decimal_enabled}? MINUS? DECIMAL_VALUE  #decimalLiteral
    | {legacy_exponent_literal_as_decimal_enabled}? MINUS? (EXPONENT_VALUE | DECIMAL_VALUE) #legacyDecimalLiteral
    | MINUS? INTEGER_VALUE            #integerLiteral
    | MINUS? BIGINT_LITERAL           #bigIntLiteral
    | MINUS? SMALLINT_LITERAL         #smallIntLiteral
    | MINUS? TINYINT_LITERAL          #tinyIntLiteral
    | MINUS? DOUBLE_LITERAL           #doubleLiteral
    | MINUS? BIGDECIMAL_LITERAL       #bigDecimalLiteral
    ;
//合格的名字
qualifiedName
    : identifier ('.' identifier)*
    ;

functionName
    : qualifiedName
    | FILTER
    | LEFT
    | RIGHT
    ;

setQuantifier
    : DISTINCT
    | ALL
    ;
//开窗函数
windowSpec
    : name=errorCapturingIdentifier         #windowRef
    | '('name=errorCapturingIdentifier')'   #windowRef
    | '('
      ( CLUSTER BY partition+=expression (',' partition+=expression)*
      | ((PARTITION | DISTRIBUTE) BY partition+=expression (',' partition+=expression)*)?
        ((ORDER | SORT) BY sortItem (',' sortItem)*)?)
      windowFrame?
      ')'                                   #windowDef
    ;
sortItem
    : expression ordering=(ASC | DESC)? (NULLS nullOrder=(LAST | FIRST))?
    ;
//    窗口范围
windowFrame
    : frameType=RANGE start=frameBound
    | frameType=ROWS start=frameBound
    | frameType=RANGE BETWEEN start=frameBound AND end=frameBound
    | frameType=ROWS BETWEEN start=frameBound AND end=frameBound
    ;
frameBound
    : UNBOUNDED boundType=(PRECEDING | FOLLOWING)
    | boundType=CURRENT ROW
    | expression boundType=(PRECEDING | FOLLOWING)
    ;

// 断言
predicate
    : NOT? kind=BETWEEN lower=valueExpression AND upper=valueExpression
    | NOT? kind=IN '(' expression (',' expression)* ')'
    | NOT? kind=IN '(' query ')'
    | NOT? kind=RLIKE pattern=valueExpression
    | NOT? kind=LIKE pattern=valueExpression (ESCAPE escapeChar=STRING)?
    | IS NOT? kind=NULL
    | IS NOT? kind=(TRUE | FALSE | UNKNOWN)
    | IS NOT? kind=DISTINCT FROM right=valueExpression
    ;

tableAlias
    : (AS? strictIdentifier identifierList?)?
    ;

joinRelation
    : (joinType) JOIN right=relationPrimary joinCriteria?
    | NATURAL joinType JOIN right=relationPrimary
    ;
joinType
    : INNER?
    | CROSS
    | LEFT OUTER?
    | LEFT? SEMI
    | RIGHT OUTER?
    | FULL OUTER?
    | LEFT? ANTI
    ;

joinCriteria
    : ON booleanExpression
    | USING identifierList
    ;

pivotClause
    : PIVOT '(' aggregates=namedExpressionSeq FOR pivotColumn IN '(' pivotValues+=pivotValue (',' pivotValues+=pivotValue)* ')' ')'
    ;
pivotColumn
    : identifiers+=identifier
    | '(' identifiers+=identifier (',' identifiers+=identifier)* ')'
    ;

pivotValue
    : expression (AS? identifier)?
    ;

queryOrganization
    : (ORDER BY order+=sortItem (',' order+=sortItem)*)?
      (CLUSTER BY clusterBy+=expression (',' clusterBy+=expression)*)?
      (DISTRIBUTE BY distributeBy+=expression (',' distributeBy+=expression)*)?
      (SORT BY sort+=sortItem (',' sort+=sortItem)*)?
      windowClause?
      (LIMIT (ALL | limit=expression))?
    ;

windowClause
    : WINDOW namedWindow (',' namedWindow)*
    ;

namedWindow
    : name=errorCapturingIdentifier AS windowSpec
    ;




//2。然后是表达式
singleExpression
    : namedExpression EOF;

namedExpression
    : expression (AS? (name=errorCapturingIdentifier | identifierList))?
    ;

//3。表名的标识符
singleTableIdentifier
    : tableIdentifier EOF
    ;
tableIdentifier
    :
    ;

//todo 4。用于多部分标识符、具体作用是捕捉错误的 标识符定义？ 例如 a-b test-table
singleMultipartIdentifier
    : multipartIdentifier EOF
    ;
multipartIdentifier
    :
    ;

//5。关于函数的定义
singleFunctionIdentifier
    : functionIdentifier EOF
    ;
functionIdentifier
    :
    ;

//6。数据类型
singleDataType
    : dataType EOF
    ;
dataType
    :
    ;

//7。表的元数据定义
singleTableSchama
    : colTypeList EOF
    ;
colTypeList
    :
    ;





// When `SQL_standard_keyword_behavior=true`, there are 2 kinds of keywords in Spark SQL.
// - Reserved keywords:
//     Keywords that are reserved and can't be used as identifiers for table, view, column,
//     function, alias, etc.
// - Non-reserved keywords:
//     Keywords that have a special meaning only in particular contexts and can be used as
//     identifiers in other contexts. For example, `EXPLAIN SELECT ...` is a command, but EXPLAIN
//     can be used as identifiers in other places.
// You can find the full keywords list by searching "Start of the keywords list" in this file.
// The non-reserved keywords are listed below. Keywords not in this list are reserved keywords.
ansiNonReserved
//--ANSI-NON-RESERVED-START
    : ADD
    | AFTER
    | ALTER
    | ANALYZE
    | ANTI
    | ARCHIVE
    | ARRAY
    | ASC
    | AT
    | BETWEEN
    | BUCKET
    | BUCKETS
    | BY
    | CACHE
    | CASCADE
    | CHANGE
    | CLEAR
    | CLUSTER
    | CLUSTERED
    | CODEGEN
    | COLLECTION
    | COLUMNS
    | COMMENT
    | COMMIT
    | COMPACT
    | COMPACTIONS
    | COMPUTE
    | CONCATENATE
    | COST
    | CUBE
    | CURRENT
    | DATA
    | DATABASE
    | DATABASES
    | DBPROPERTIES
    | DEFINED
    | DELETE
    | DELIMITED
    | DESC
    | DESCRIBE
    | DFS
    | DIRECTORIES
    | DIRECTORY
    | DISTRIBUTE
    | DIV
    | DROP
    | ESCAPED
    | EXCHANGE
    | EXISTS
    | EXPLAIN
    | EXPORT
    | EXTENDED
    | EXTERNAL
    | EXTRACT
    | FIELDS
    | FILEFORMAT
    | FIRST
    | FOLLOWING
    | FORMAT
    | FORMATTED
    | FUNCTION
    | FUNCTIONS
    | GLOBAL
    | GROUPING
    | IF
    | IGNORE
    | IMPORT
    | INDEX
    | INDEXES
    | INPATH
    | INPUTFORMAT
    | INSERT
    | INTERVAL
    | ITEMS
    | KEYS
    | LAST
    | LATERAL
    | LAZY
    | LIKE
    | LIMIT
    | LINES
    | LIST
    | LOAD
    | LOCAL
    | LOCATION
    | LOCK
    | LOCKS
    | LOGICAL
    | MACRO
    | MAP
    | MATCHED
    | MERGE
    | MSCK
    | NAMESPACE
    | NAMESPACES
    | NO
    | NULLS
    | OF
    | OPTION
    | OPTIONS
    | OUT
    | OUTPUTFORMAT
    | OVER
    | OVERLAY
    | OVERWRITE
    | PARTITION
    | PARTITIONED
    | PARTITIONS
    | PERCENTLIT
    | PIVOT
    | PLACING
    | POSITION
    | PRECEDING
    | PRINCIPALS
    | PROPERTIES
    | PURGE
    | QUERY
    | RANGE
    | RECORDREADER
    | RECORDWRITER
    | RECOVER
    | REDUCE
    | REFRESH
    | RENAME
    | REPAIR
    | REPLACE
    | RESET
    | RESTRICT
    | REVOKE
    | RLIKE
    | ROLE
    | ROLES
    | ROLLBACK
    | ROLLUP
    | ROW
    | ROWS
    | SCHEMA
    | SEMI
    | SEPARATED
    | SERDE
    | SERDEPROPERTIES
    | SET
    | SETMINUS
    | SETS
    | SHOW
    | SKEWED
    | SORT
    | SORTED
    | START
    | STATISTICS
    | STORED
    | STRATIFY
    | STRUCT
    | SUBSTR
    | SUBSTRING
    | TABLES
    | TABLESAMPLE
    | TBLPROPERTIES
    | TEMPORARY
    | TERMINATED
    | TOUCH
    | TRANSACTION
    | TRANSACTIONS
    | TRANSFORM
    | TRIM
    | TRUE
    | TRUNCATE
    | TYPE
    | UNARCHIVE
    | UNBOUNDED
    | UNCACHE
    | UNLOCK
    | UNSET
    | UPDATE
    | USE
    | VALUES
    | VIEW
    | VIEWS
    | WINDOW
//--ANSI-NON-RESERVED-END
    ;
// 当采用非ANSI-SQL时 spark sql会有两套保留关键字
// When `SQL_standard_keyword_behavior=false`, there are 2 kinds of keywords in Spark SQL.
// - Non-reserved keywords:
//     Same definition as the one when `SQL_standard_keyword_behavior=true`.
// - Strict-non-reserved keywords:
//     A strict version of non-reserved keywords, which can not be used as table alias.
// You can find the full keywords list by searching "Start of the keywords list" in this file.
// The strict-non-reserved keywords are listed in `strictNonReserved`.
// The non-reserved keywords are listed in `nonReserved`.
// These 2 together contain all the keywords.
strictNonReserved
    : ANTI
    | CROSS
    | EXCEPT
    | FULL
    | INNER
    | INTERSECT
    | JOIN
    | LEFT
    | NATURAL
    | ON
    | RIGHT
    | SEMI
    | SETMINUS
    | UNION
    | USING
    ;

nonReserved
//--DEFAULT-NON-RESERVED-START
    : ADD
    | AFTER
    | ALL
    | ALTER
    | ANALYZE
    | AND
    | ANY
    | ARCHIVE
    | ARRAY
    | AS
    | ASC
    | AT
    | AUTHORIZATION
    | BETWEEN
    | BOTH
    | BUCKET
    | BUCKETS
    | BY
    | CACHE
    | CASCADE
    | CASE
    | CAST
    | CHANGE
    | CHECK
    | CLEAR
    | CLUSTER
    | CLUSTERED
    | CODEGEN
    | COLLATE
    | COLLECTION
    | COLUMN
    | COLUMNS
    | COMMENT
    | COMMIT
    | COMPACT
    | COMPACTIONS
    | COMPUTE
    | CONCATENATE
    | CONSTRAINT
    | COST
    | CREATE
    | CUBE
    | CURRENT
    | CURRENT_DATE
    | CURRENT_TIME
    | CURRENT_TIMESTAMP
    | CURRENT_USER
    | DATA
    | DATABASE
    | DATABASES
    | DBPROPERTIES
    | DEFINED
    | DELETE
    | DELIMITED
    | DESC
    | DESCRIBE
    | DFS
    | DIRECTORIES
    | DIRECTORY
    | DISTINCT
    | DISTRIBUTE
    | DIV
    | DROP
    | ELSE
    | END
    | ESCAPE
    | ESCAPED
    | EXCHANGE
    | EXISTS
    | EXPLAIN
    | EXPORT
    | EXTENDED
    | EXTERNAL
    | EXTRACT
    | FALSE
    | FETCH
    | FILTER
    | FIELDS
    | FILEFORMAT
    | FIRST
    | FOLLOWING
    | FOR
    | FOREIGN
    | FORMAT
    | FORMATTED
    | FROM
    | FUNCTION
    | FUNCTIONS
    | GLOBAL
    | GRANT
    | GROUP
    | GROUPING
    | HAVING
    | IF
    | IGNORE
    | IMPORT
    | IN
    | INDEX
    | INDEXES
    | INPATH
    | INPUTFORMAT
    | INSERT
    | INTERVAL
    | INTO
    | IS
    | ITEMS
    | KEYS
    | LAST
    | LATERAL
    | LAZY
    | LEADING
    | LIKE
    | LIMIT
    | LINES
    | LIST
    | LOAD
    | LOCAL
    | LOCATION
    | LOCK
    | LOCKS
    | LOGICAL
    | MACRO
    | MAP
    | MATCHED
    | MERGE
    | MSCK
    | NAMESPACE
    | NAMESPACES
    | NO
    | NOT
    | NULL
    | NULLS
    | OF
    | ONLY
    | OPTION
    | OPTIONS
    | OR
    | ORDER
    | OUT
    | OUTER
    | OUTPUTFORMAT
    | OVER
    | OVERLAPS
    | OVERLAY
    | OVERWRITE
    | PARTITION
    | PARTITIONED
    | PARTITIONS
    | PERCENTLIT
    | PIVOT
    | PLACING
    | POSITION
    | PRECEDING
    | PRIMARY
    | PRINCIPALS
    | PROPERTIES
    | PURGE
    | QUERY
    | RANGE
    | RECORDREADER
    | RECORDWRITER
    | RECOVER
    | REDUCE
    | REFERENCES
    | REFRESH
    | RENAME
    | REPAIR
    | REPLACE
    | RESET
    | RESTRICT
    | REVOKE
    | RLIKE
    | ROLE
    | ROLES
    | ROLLBACK
    | ROLLUP
    | ROW
    | ROWS
    | SCHEMA
    | SELECT
    | SEPARATED
    | SERDE
    | SERDEPROPERTIES
    | SESSION_USER
    | SET
    | SETS
    | SHOW
    | SKEWED
    | SOME
    | SORT
    | SORTED
    | START
    | STATISTICS
    | STORED
    | STRATIFY
    | STRUCT
    | SUBSTR
    | SUBSTRING
    | TABLE
    | TABLES
    | TABLESAMPLE
    | TBLPROPERTIES
    | TEMPORARY
    | TERMINATED
    | THEN
    | TO
    | TOUCH
    | TRAILING
    | TRANSACTION
    | TRANSACTIONS
    | TRANSFORM
    | TRIM
    | TRUE
    | TRUNCATE
    | TYPE
    | UNARCHIVE
    | UNBOUNDED
    | UNCACHE
    | UNIQUE
    | UNKNOWN
    | UNLOCK
    | UNSET
    | UPDATE
    | USE
    | USER
    | VALUES
    | VIEW
    | VIEWS
    | WHEN
    | WHERE
    | WINDOW
    | WITH
//--DEFAULT-NON-RESERVED-END
    ;

// NOTE: If you add a new token in the list below, you should update the list of keywords
// and reserved tag in `docs/sql-ref-ansi-compliance.md#sql-keywords`.

//============================
// Start of the keywords list
//============================
//--SPARK-KEYWORD-LIST-START
ADD: 'ADD';
AFTER: 'AFTER';
ALL: 'ALL';
ALTER: 'ALTER';
ANALYZE: 'ANALYZE';
AND: 'AND';
ANTI: 'ANTI';
ANY: 'ANY';
ARCHIVE: 'ARCHIVE';
ARRAY: 'ARRAY';
AS: 'AS';
ASC: 'ASC';
AT: 'AT';
AUTHORIZATION: 'AUTHORIZATION';
BETWEEN: 'BETWEEN';
BOTH: 'BOTH';
BUCKET: 'BUCKET';
BUCKETS: 'BUCKETS';
BY: 'BY';
CACHE: 'CACHE';
CASCADE: 'CASCADE';
CASE: 'CASE';
CAST: 'CAST';
CHANGE: 'CHANGE';
CHECK: 'CHECK';
CLEAR: 'CLEAR';
CLUSTER: 'CLUSTER';
CLUSTERED: 'CLUSTERED';
CODEGEN: 'CODEGEN';
COLLATE: 'COLLATE';
COLLECTION: 'COLLECTION';
COLUMN: 'COLUMN';
COLUMNS: 'COLUMNS';
COMMENT: 'COMMENT';
COMMIT: 'COMMIT';
COMPACT: 'COMPACT';
COMPACTIONS: 'COMPACTIONS';
COMPUTE: 'COMPUTE';
CONCATENATE: 'CONCATENATE';
CONSTRAINT: 'CONSTRAINT';
COST: 'COST';
CREATE: 'CREATE';
CROSS: 'CROSS';
CUBE: 'CUBE';
CURRENT: 'CURRENT';
CURRENT_DATE: 'CURRENT_DATE';
CURRENT_TIME: 'CURRENT_TIME';
CURRENT_TIMESTAMP: 'CURRENT_TIMESTAMP';
CURRENT_USER: 'CURRENT_USER';
DATA: 'DATA';
DATABASE: 'DATABASE';
DATABASES: 'DATABASES' | 'SCHEMAS';
DBPROPERTIES: 'DBPROPERTIES';
DEFINED: 'DEFINED';
DELETE: 'DELETE';
DELIMITED: 'DELIMITED';
DESC: 'DESC';
DESCRIBE: 'DESCRIBE';
DFS: 'DFS';
DIRECTORIES: 'DIRECTORIES';
DIRECTORY: 'DIRECTORY';
DISTINCT: 'DISTINCT';
DISTRIBUTE: 'DISTRIBUTE';
DIV: 'DIV';
DROP: 'DROP';
ELSE: 'ELSE';
END: 'END';
ESCAPE: 'ESCAPE';
ESCAPED: 'ESCAPED';
EXCEPT: 'EXCEPT';
EXCHANGE: 'EXCHANGE';
EXISTS: 'EXISTS';
EXPLAIN: 'EXPLAIN';
EXPORT: 'EXPORT';
EXTENDED: 'EXTENDED';
EXTERNAL: 'EXTERNAL';
EXTRACT: 'EXTRACT';
FALSE: 'FALSE';
FETCH: 'FETCH';
FIELDS: 'FIELDS';
FILTER: 'FILTER';
FILEFORMAT: 'FILEFORMAT';
FIRST: 'FIRST';
FOLLOWING: 'FOLLOWING';
FOR: 'FOR';
FOREIGN: 'FOREIGN';
FORMAT: 'FORMAT';
FORMATTED: 'FORMATTED';
FROM: 'FROM';
FULL: 'FULL';
FUNCTION: 'FUNCTION';
FUNCTIONS: 'FUNCTIONS';
GLOBAL: 'GLOBAL';
GRANT: 'GRANT';
GROUP: 'GROUP';
GROUPING: 'GROUPING';
HAVING: 'HAVING';
IF: 'IF';
IGNORE: 'IGNORE';
IMPORT: 'IMPORT';
IN: 'IN';
INDEX: 'INDEX';
INDEXES: 'INDEXES';
INNER: 'INNER';
INPATH: 'INPATH';
INPUTFORMAT: 'INPUTFORMAT';
INSERT: 'INSERT';
INTERSECT: 'INTERSECT';
INTERVAL: 'INTERVAL';
INTO: 'INTO';
IS: 'IS';
ITEMS: 'ITEMS';
JOIN: 'JOIN';
KEYS: 'KEYS';
LAST: 'LAST';
LATERAL: 'LATERAL';
LAZY: 'LAZY';
LEADING: 'LEADING';
LEFT: 'LEFT';
LIKE: 'LIKE';
LIMIT: 'LIMIT';
LINES: 'LINES';
LIST: 'LIST';
LOAD: 'LOAD';
LOCAL: 'LOCAL';
LOCATION: 'LOCATION';
LOCK: 'LOCK';
LOCKS: 'LOCKS';
LOGICAL: 'LOGICAL';
MACRO: 'MACRO';
MAP: 'MAP';
MATCHED: 'MATCHED';
MERGE: 'MERGE';
MSCK: 'MSCK';
NAMESPACE: 'NAMESPACE';
NAMESPACES: 'NAMESPACES';
NATURAL: 'NATURAL';
NO: 'NO';
NOT: 'NOT' | '!';
NULL: 'NULL';
NULLS: 'NULLS';
OF: 'OF';
ON: 'ON';
ONLY: 'ONLY';
OPTION: 'OPTION';
OPTIONS: 'OPTIONS';
OR: 'OR';
ORDER: 'ORDER';
OUT: 'OUT';
OUTER: 'OUTER';
OUTPUTFORMAT: 'OUTPUTFORMAT';
OVER: 'OVER';
OVERLAPS: 'OVERLAPS';
OVERLAY: 'OVERLAY';
OVERWRITE: 'OVERWRITE';
PARTITION: 'PARTITION';
PARTITIONED: 'PARTITIONED';
PARTITIONS: 'PARTITIONS';
PERCENTLIT: 'PERCENT';
PIVOT: 'PIVOT';
PLACING: 'PLACING';
POSITION: 'POSITION';
PRECEDING: 'PRECEDING';
PRIMARY: 'PRIMARY';
PRINCIPALS: 'PRINCIPALS';
PROPERTIES: 'PROPERTIES';
PURGE: 'PURGE';
QUERY: 'QUERY';
RANGE: 'RANGE';
RECORDREADER: 'RECORDREADER';
RECORDWRITER: 'RECORDWRITER';
RECOVER: 'RECOVER';
REDUCE: 'REDUCE';
REFERENCES: 'REFERENCES';
REFRESH: 'REFRESH';
RENAME: 'RENAME';
REPAIR: 'REPAIR';
REPLACE: 'REPLACE';
RESET: 'RESET';
RESTRICT: 'RESTRICT';
REVOKE: 'REVOKE';
RIGHT: 'RIGHT';
RLIKE: 'RLIKE' | 'REGEXP';
ROLE: 'ROLE';
ROLES: 'ROLES';
ROLLBACK: 'ROLLBACK';
ROLLUP: 'ROLLUP';
ROW: 'ROW';
ROWS: 'ROWS';
SCHEMA: 'SCHEMA';
SELECT: 'SELECT';
SEMI: 'SEMI';
SEPARATED: 'SEPARATED';
SERDE: 'SERDE';
SERDEPROPERTIES: 'SERDEPROPERTIES';
SESSION_USER: 'SESSION_USER';
SET: 'SET';
SETMINUS: 'MINUS';
SETS: 'SETS';
SHOW: 'SHOW';
SKEWED: 'SKEWED';
SOME: 'SOME';
SORT: 'SORT';
SORTED: 'SORTED';
START: 'START';
STATISTICS: 'STATISTICS';
STORED: 'STORED';
STRATIFY: 'STRATIFY';
STRUCT: 'STRUCT';
SUBSTR: 'SUBSTR';
SUBSTRING: 'SUBSTRING';
TABLE: 'TABLE';
TABLES: 'TABLES';
TABLESAMPLE: 'TABLESAMPLE';
TBLPROPERTIES: 'TBLPROPERTIES';
TEMPORARY: 'TEMPORARY' | 'TEMP';
TERMINATED: 'TERMINATED';
THEN: 'THEN';
TO: 'TO';
TOUCH: 'TOUCH';
TRAILING: 'TRAILING';
TRANSACTION: 'TRANSACTION';
TRANSACTIONS: 'TRANSACTIONS';
TRANSFORM: 'TRANSFORM';
TRIM: 'TRIM';
TRUE: 'TRUE';
TRUNCATE: 'TRUNCATE';
TYPE: 'TYPE';
UNARCHIVE: 'UNARCHIVE';
UNBOUNDED: 'UNBOUNDED';
UNCACHE: 'UNCACHE';
UNION: 'UNION';
UNIQUE: 'UNIQUE';
UNKNOWN: 'UNKNOWN';
UNLOCK: 'UNLOCK';
UNSET: 'UNSET';
UPDATE: 'UPDATE';
USE: 'USE';
USER: 'USER';
USING: 'USING';
VALUES: 'VALUES';
VIEW: 'VIEW';
VIEWS: 'VIEWS';
WHEN: 'WHEN';
WHERE: 'WHERE';
WINDOW: 'WINDOW';
WITH: 'WITH';
//--SPARK-KEYWORD-LIST-END
//============================
// End of the keywords list
//============================

EQ  : '=' | '==';
NSEQ: '<=>';
NEQ : '<>';
NEQJ: '!=';
LT  : '<';
LTE : '<=' | '!>';
GT  : '>';
GTE : '>=' | '!<';

PLUS: '+';
MINUS: '-';
ASTERISK: '*';
SLASH: '/';
PERCENT: '%';
TILDE: '~';
AMPERSAND: '&';
PIPE: '|';
CONCAT_PIPE: '||';
HAT: '^';

STRING
    : '\'' ( ~('\''|'\\') | ('\\' .) )* '\''
    | '"' ( ~('"'|'\\') | ('\\' .) )* '"'
    ;

BIGINT_LITERAL
    : DIGIT+ 'L'
    ;

SMALLINT_LITERAL
    : DIGIT+ 'S'
    ;

TINYINT_LITERAL
    : DIGIT+ 'Y'
    ;

INTEGER_VALUE
    : DIGIT+
    ;

EXPONENT_VALUE
    : DIGIT+ EXPONENT
    | DECIMAL_DIGITS EXPONENT {isValidDecimal()}?
    ;

DECIMAL_VALUE
    : DECIMAL_DIGITS {isValidDecimal()}?
    ;

DOUBLE_LITERAL
    : DIGIT+ EXPONENT? 'D'
    | DECIMAL_DIGITS EXPONENT? 'D' {isValidDecimal()}?
    ;

BIGDECIMAL_LITERAL
    : DIGIT+ EXPONENT? 'BD'
    | DECIMAL_DIGITS EXPONENT? 'BD' {isValidDecimal()}?
    ;

IDENTIFIER
    : (LETTER | DIGIT | '_')+
    ;

BACKQUOTED_IDENTIFIER
    : '`' ( ~'`' | '``' )* '`'
    ;

fragment DECIMAL_DIGITS
    : DIGIT+ '.' DIGIT*
    | '.' DIGIT+
    ;

fragment EXPONENT
    : 'E' [+-]? DIGIT+
    ;

fragment DIGIT
    : [0-9]
    ;

fragment LETTER
    : [A-Z]
    ;

SIMPLE_COMMENT
    : '--' ('\\\n' | ~[\r\n])* '\r'? '\n'? -> channel(HIDDEN)
    ;

BRACKETED_EMPTY_COMMENT
    : '/**/' -> channel(HIDDEN)
    ;

BRACKETED_COMMENT
    : '/*' ~[+] .*? '*/' -> channel(HIDDEN)
    ;

WS
    : [ \r\n\t]+ -> channel(HIDDEN)
    ;

// Catch-all for anything we can't recognize.
// We use this to be able to ignore and recover all the text
// when splitting statements with DelimiterLexer
UNRECOGNIZED
    : .
    ;














