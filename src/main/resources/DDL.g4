grammar DDL;
import DML;

ddl       : create
          | drop
          | alter
          ;
create    : createDb | createTable ;
createDb  : CREATE DATABASE ID ;
createTable
          : 'create' 'table' ID '(' fieldDeifnitions ')' ;
fieldDeifnitions
          : fieldDeifnition (',' fieldDeifnition)* ;
fieldDeifnition
          :  ID  type ('default' item)? ('comment' STRING)? ;
type      : 'int' | 'string' | 'boolean' ;

drop      : 'drop' ('database'|'table') ID;
alter     : 'alter' 'table' ID alterOperation;
alterOperation
          : addOperation | dropOperation | modifyOperation;
addOperation
          : 'add' '(' fieldDeifnitions ')' ;
dropOperation
          : 'drop' 'column' ID ;
modifyOperation
          : 'modify' fieldDeifnition;