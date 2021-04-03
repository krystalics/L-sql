grammar DQL;
import CommenLexer;

dql         : 'select' ('*' | columns) 'from' ID whereStat? groupByStat? orderByStat? limitStat? ;
groupByStat : 'group' 'by' columns ('having' expr (('and'|'or') expr)*)?;
orderByStat : 'order' 'by' columns ;
limitStat   : 'limit' NUMBER ('offset' NUMBER)?;

whereStat : 'where' expr (('and'|'or') expr)* ;
expr      : expr '=' expr
          | expr '>' expr
          | expr '>=' expr
          | expr '<' expr
          | expr '<=' expr
          | expr '!=' expr
          | expr 'in' expr //in value 或者 一个子查询
          | '(' dql ')'  //表达子查询
          | value
          | ID
          | item ; //这里简化了算数表达式，没有了+-*/等更加复杂的东西

columns   : ID (',' ID)* ;

value     : '(' item (',' item)* ')';

item      : STRING
          | NUMBER
          | BOOLEAN
          ; //item可以是字符串，数字也可以是布尔类型。