package com.github.krystalics.lsql.parser.executor.handler;

import com.github.krystalics.lsql.internal.sql.SQL;

/**
 * @author linjiabao001
 * @date 2021/5/9
 * @description
 */
public abstract class AbstractSQLHandler implements SQLHandler {

    SQL sql;

    public AbstractSQLHandler(SQL sql) {
        this.sql = sql;
    }


}
