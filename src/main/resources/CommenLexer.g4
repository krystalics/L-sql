lexer grammar CommenLexer;

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
