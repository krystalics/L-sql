grammar KrystaSql;
/*
    只支持下面7种语句种最简单的形式
    DDL:
        - Create
        - Drop
    DML:
        - Insert
        - Update
        - Delete
    DQL:
        - Select
*/
@members {
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
}

singleStatement
    : statement ';'* EOF
    ;

statement
    : query                                                            #statementDefault
    | dmlStatementNoWith                                               #dmlStatement
    | USE NAMESPACE? identifierList                                    #use
    | CREATE namespace (IF NOT EXISTS)? identifierList
        (commentSpec |
         locationSpec |
         (WITH (DBPROPERTIES | PROPERTIES) tablePropertyList))*        #createNamespace
    | ALTER namespace identifierList
        SET (DBPROPERTIES | PROPERTIES) tablePropertyList              #setNamespaceProperties
    | ALTER namespace identifierList
        SET locationSpec                                               #setNamespaceLocation
    | DROP namespace (IF EXISTS)? identifierList
        (RESTRICT | CASCADE)?                                          #dropNamespace
    | SHOW (DATABASES | NAMESPACES) ((FROM | IN) identifierList)?
        (LIKE? pattern=STRING)?                                        #showNamespaces
    | createTableHeader ('(' colTypeList ')')? tableProvider
        createTableClauses
        (AS? query)?                                                   #createTable
    | createTableHeader ('(' columns=colTypeList ')')?
        (commentSpec |
        (PARTITIONED BY '(' partitionColumns=colTypeList ')' |
        PARTITIONED BY partitionColumnNames=identifierList) |
        rowFormat |
        createFileFormat |
        locationSpec |
        (TBLPROPERTIES tableProps=tablePropertyList))*
        (AS? query)?                                                   #createHiveTable
    | CREATE TABLE (IF NOT EXISTS)? target=tableIdentifier
        LIKE source=tableIdentifier
        (tableProvider |
        rowFormat |
        createFileFormat |
        locationSpec |
        (TBLPROPERTIES tableProps=tablePropertyList))*                 #createTableLike
    | ANALYZE TABLE identifierList partitionSpec? COMPUTE STATISTICS
        (identifier | FOR COLUMNS identifierSeq | FOR ALL COLUMNS)?    #analyze
    | DROP TABLE (IF EXISTS)? identifierList PURGE?                    #dropTable
    | EXPLAIN (LOGICAL | FORMATTED | EXTENDED | CODEGEN | COST)?
        statement                                                      #explain
    | SHOW TABLES ((FROM | IN) identifierList)?
        (LIKE? pattern=STRING)?                                        #showTables
    | SHOW TABLE EXTENDED ((FROM | IN) ns=identifierList)?
        LIKE pattern=STRING partitionSpec?                             #showTable
    | SHOW TBLPROPERTIES table=identifierList
        ('(' key=tablePropertyKey ')')?                                #showTblProperties
    | SHOW COLUMNS (FROM | IN) table=identifierList
        ((FROM | IN) ns=identifierList)?                          #showColumns
    | SHOW PARTITIONS identifierList partitionSpec?               #showPartitions
    | SHOW CREATE TABLE identifierList (AS SERDE)?                #showCreateTable
    | SHOW CURRENT NAMESPACE                                      #showCurrentNamespace
    | (DESC | DESCRIBE) namespace EXTENDED?
        identifierList                                            #describeNamespace
    | (DESC | DESCRIBE) TABLE? option=(EXTENDED | FORMATTED)?
        identifierList partitionSpec? describeColName?            #describeRelation
    | (DESC | DESCRIBE) QUERY? query                              #describeQuery
    | COMMENT ON namespace identifierList IS
        comment=(STRING | NULL)                                   #commentNamespace
    | COMMENT ON TABLE identifierList IS comment=(STRING | NULL)  #commentTable
    | REFRESH TABLE identifierList                                #refreshTable
    | REFRESH (STRING | .*?)                                      #refreshResource
    | CACHE LAZY? TABLE identifierList
        (OPTIONS options=tablePropertyList)? (AS? query)?         #cacheTable
    | UNCACHE TABLE (IF EXISTS)? identifierList                   #uncacheTable
    | CLEAR CACHE                                                 #clearCache
    | LOAD DATA LOCAL? INPATH path=STRING OVERWRITE? INTO TABLE
        identifierList partitionSpec?                             #loadData
    | TRUNCATE TABLE identifierList partitionSpec?                #truncateTable
    | MSCK REPAIR TABLE identifierList                            #repairTable
    | op=(ADD | LIST) identifier (STRING | .*?)                   #manageResource
    ;

// query相关规则
query
    : queryTerm queryOrganization
    ;

queryTerm
    : queryPrimary                                    #queryTermDefault
    ;

queryOrganization
    : (ORDER BY order+=sortItem (',' order+=sortItem)*)?
      windowClause?
      (LIMIT (ALL | limit=expression))?
    ;
//
queryPrimary
    : querySpecification                                                    #queryPrimaryDefault
    | fromStatement                                                         #fromStmt
    | TABLE identifier                                                      #table
    | '(' query ')'                                                         #subquery
    ;
querySpecification
    : selectClause fromClause? whereClause?  aggregationClause? havingClause? windowClause?                                                         #regularQuerySpecification
    ;

// from相关规则
fromStatement
    : fromClause fromStatementBody+
    ;

fromStatementBody
    : selectClause
      whereClause?
      aggregationClause?
      havingClause?
      windowClause?
      queryOrganization
    ;


// 各种clause

selectClause
    : SELECT setQuantifier? namedExpressionSeq
    ;

whereClause
    : WHERE booleanExpression
    ;

aggregationClause
    : GROUP BY groupingExpressions+=expression (',' groupingExpressions+=expression)*
    ;

havingClause
    : HAVING booleanExpression
    ;

windowClause
    : WINDOW namedWindow (',' namedWindow)*
    ;

fromClause
    : FROM relation (',' relation)*
    ;

whenClause
    : WHEN condition=expression THEN result=expression
    ;
    
setClause
    : SET assignmentList
    ;
// expression 表达式
expression
    : booleanExpression
    ;

booleanExpression
    : NOT booleanExpression                                        #logicalNot
    | EXISTS '(' query ')'                                         #exists
    | valueExpression predicate?                                   #predicated
    | left=booleanExpression operator=AND right=booleanExpression  #logicalBinary
    | left=booleanExpression operator=OR right=booleanExpression   #logicalBinary
    ;

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

valueExpression
    : primaryExpression                                                                      #valueExpressionDefault
    | operator=(MINUS | PLUS | TILDE) valueExpression                                        #arithmeticUnary
    | left=valueExpression operator=(ASTERISK | SLASH | PERCENT | DIV) right=valueExpression #arithmeticBinary
    | left=valueExpression operator=(PLUS | MINUS | CONCAT_PIPE) right=valueExpression       #arithmeticBinary
    | left=valueExpression operator=AMPERSAND right=valueExpression                          #arithmeticBinary
    | left=valueExpression operator=HAT right=valueExpression                                #arithmeticBinary
    | left=valueExpression operator=PIPE right=valueExpression                               #arithmeticBinary
    | left=valueExpression comparisonOperator right=valueExpression                          #comparison
    ;

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

constant
    : NULL                                                                                     #nullLiteral
    | identifier STRING                                                                        #typeConstructor
    | number                                                                                   #numericLiteral
    | booleanValue                                                                             #booleanLiteral
    | STRING+                                                                                  #stringLiteral
    ;

comparisonOperator
    : EQ | NEQ | NEQJ | LT | LTE | GT | GTE | NSEQ
    ;

namedExpression
    : expression (AS? (name=identifier | identifierList))?
    ;

namedExpressionSeq
    : namedExpression (',' namedExpression)*
    ;

// 排序
sortItem
    : expression ordering=(ASC | DESC)? (NULLS nullOrder=(LAST | FIRST))?
    ;

// 开窗函数
namedWindow
    : name=identifier AS windowSpec
    ;

windowSpec
    : name=identifier         #windowRef
    | '('name=identifier')'   #windowRef
    | '('
      ( CLUSTER BY partition+=expression (',' partition+=expression)*
      | ((PARTITION | DISTRIBUTE) BY partition+=expression (',' partition+=expression)*)?
        ((ORDER | SORT) BY sortItem (',' sortItem)*)?)
      windowFrame?
      ')'                                   #windowDef
    ;

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

// 表相关 计算、以及join
relation
    : relationPrimary joinRelation*
    ;

relationPrimary
    : identifierList tableAlias        #tableName
    | '(' query ')'  tableAlias        #aliasedQuery
    | '(' relation ')'  tableAlias     #aliasedRelation
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

createTableClauses
    :((OPTIONS options=tablePropertyList) |
     (PARTITIONED BY partitioning=identifierList) |
     locationSpec |
     commentSpec |
     (TBLPROPERTIES tableProps=tablePropertyList))*
    ;

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
    
namespace
    : NAMESPACE
    | DATABASE
    | SCHEMA
    ;

createTableHeader
    : CREATE TEMPORARY? EXTERNAL? TABLE (IF NOT EXISTS)? identifierList
    ;

//dml
dmlStatementNoWith
    : insertInto queryTerm queryOrganization                                       #singleInsertQuery
    | fromClause multiInsertQueryBody+                                             #multiInsertQuery
    | DELETE FROM identifierList tableAlias whereClause?                           #deleteFromTable
    | UPDATE identifierList tableAlias setClause whereClause?                      #updateTable
    ;
    
insertInto
    : INSERT OVERWRITE TABLE? identifierList (partitionSpec (IF NOT EXISTS)?)?                              #insertOverwriteTable
    | INSERT INTO TABLE? identifierList partitionSpec? (IF NOT EXISTS)?                                     #insertIntoTable
    | INSERT OVERWRITE LOCAL? DIRECTORY path=STRING rowFormat? createFileFormat?                            #insertOverwriteHiveDir
    | INSERT OVERWRITE LOCAL? DIRECTORY (path=STRING)? tableProvider (OPTIONS options=tablePropertyList)?   #insertOverwriteDir
    ;
partitionSpec
    : PARTITION '(' partitionVal (',' partitionVal)* ')'
    ;
    
partitionVal
    : identifier (EQ constant)?
    ;    
    
rowFormat
    : ROW FORMAT SERDE name=STRING (WITH SERDEPROPERTIES props=tablePropertyList)?  #rowFormatSerde
    | ROW FORMAT DELIMITED
      (FIELDS TERMINATED BY fieldsTerminatedBy=STRING (ESCAPED BY escapedBy=STRING)?)?
      (COLLECTION ITEMS TERMINATED BY collectionItemsTerminatedBy=STRING)?
      (MAP KEYS TERMINATED BY keysTerminatedBy=STRING)?
      (LINES TERMINATED BY linesSeparatedBy=STRING)?
      (NULL DEFINED AS nullDefinedAs=STRING)?                                       #rowFormatDelimited
    ;
    
createFileFormat
    : STORED AS fileFormat
    | STORED BY storageHandler
    ;

fileFormat
    : INPUTFORMAT inFmt=STRING OUTPUTFORMAT outFmt=STRING    #tableFileFormat
    | identifier                                             #genericFileFormat
    ;
    
tableProvider
    : USING identifierList
    ;
    
storageHandler
    : STRING (WITH SERDEPROPERTIES tablePropertyList)?
    ; 
      
multiInsertQueryBody
    : insertInto fromStatementBody
    ;
// 基础的语法规则
describeColName
    : nameParts+=identifier ('.' nameParts+=identifier)*
    ;

tableIdentifier
    : (db=identifier '.')? table=identifier
    ;

colTypeList
    : colType (',' colType)*
    ;

colType
    : colName=identifier dataType (NOT NULL)? commentSpec?
    ;

commentSpec
    : COMMENT STRING
    ;
    
locationSpec
    : LOCATION STRING
    ;
 
assignmentList
    : assignment (',' assignment)*
    ;

assignment
    : key=identifierList EQ value=expression
    ;

booleanValue
    : TRUE | FALSE
    ;
    
setQuantifier
    : DISTINCT
    | ALL
    ;

dataType
    : complex=ARRAY '<' dataType '>'                            #complexDataType
    | complex=MAP '<' dataType ',' dataType '>'                 #complexDataType
    | identifier ('(' INTEGER_VALUE (',' INTEGER_VALUE)* ')')?  #primitiveDataType
    ;

identifier
    : strictIdentifier
    ;

strictIdentifier
    : IDENTIFIER              #unquotedIdentifier
    | quotedIdentifier        #quotedIdentifierAlternative
    ;

quotedIdentifier
    : BACKQUOTED_IDENTIFIER
    ;


identifierList
    : '(' identifierSeq ')'
    | identifierSeq
    ;

identifierSeq
    : ident+=identifier (',' ident+=identifier)*
    ;

qualifiedName
    : identifier ('.' identifier)*
    ;
    
number
    : MINUS? INTEGER_VALUE            #integerLiteral
    | MINUS? BIGINT_LITERAL           #bigIntLiteral
    | MINUS? SMALLINT_LITERAL         #smallIntLiteral
    | MINUS? TINYINT_LITERAL          #tinyIntLiteral
    | MINUS? DOUBLE_LITERAL           #doubleLiteral
    | MINUS? BIGDECIMAL_LITERAL       #bigDecimalLiteral
    ;

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

// 词法规则
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