grammar LSQL;

sql    : (stat ';')+;  //表示可以有多个执行语句
stat   : dml
       | ddl
       | dql
       ;
dml    : insert
       | delete
       | update ;

insert    : 'insert' 'into' 'table' ID ('(' columns ')')? 'values' values ; //ID表示标识符
columns   : ID (',' ID)* ;
values    : value (',' value)* ;
value     : '(' item (',' item)* ')';
item      : STRING
          | NUMBER
          | BOOLEAN
          ; //item可以是字符串，数字也可以是布尔类型。

delete    : 'delete' 'from' ID wherestat;
expr      : expr '=' expr
          | expr '>' expr
          | expr '>=' expr
          | expr '<' expr
          | expr '<=' expr
          | expr '!=' expr
          | item ; //这里简化了算数表达式，没有了+-*/等更加复杂的东西
wherestat : 'where' expr (('and'|'or') expr)* ;

update    : 'update' ID setstat wherestat;
assign    :  ID '=' item ; //简化的赋值语句
setstat   : 'set' assign (',' assign)* ;

ddl       : 'ddl';
dql       : 'dql';


BOOLEAN         : 'true'|'false';
ID              : LETTER (LETTER|DIGIT)*;
fragment
LETTER          : [a-zA-Z\u0080-\u00FF_];
NUMBER          : ('.' DIGIT+|DIGIT+ ('.' DIGIT*)?);
fragment
DIGIT           : [0-9];


STRING          : '"' ('\\"'|.)*? '"' ;
WS              : [ \t\r\n]          -> skip; //[]内空格和其他词法符号不用单引号包围了，符号间也不用空格隔空，直接打上去就可以
LINE_COMMENT    : '//' .*? '\n'      -> channel(HIDDEN);
COMMENT         : '/*' .*? '*/'      -> channel(HIDDEN);