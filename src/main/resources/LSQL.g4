grammar LSQL;
import DQL;

sql    : (stat ';')+;  //表示可以有多个执行语句
stat   : dml
       | ddl
       | dql
       ;