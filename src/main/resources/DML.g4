grammar DML;
import DQL;

dml    : insert
       | delete
       | update ;

insert    : 'insert' 'into' 'table' ID ('(' columns ')')? 'values' values ; //ID表示标识符
values    : value (',' value)* ;
delete    : 'delete' 'from' ID whereStat;
update    : 'update' ID setStat whereStat;
assign    :  ID '=' item ; //简化的赋值语句
setStat   : 'set' assign (',' assign)* ;
