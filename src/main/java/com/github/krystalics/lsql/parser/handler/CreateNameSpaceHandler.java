package com.github.krystalics.lsql.parser.handler;

import com.github.krystalics.lsql.parser.internal.DDL;
import com.github.krystalics.lsql.parser.internal.SQL;

/**
 * @author linjiabao001
 * @date 2021/5/9
 * @description
 */
public class CreateNameSpaceHandler extends AbstractSQLHandler {


    public CreateNameSpaceHandler(SQL sql) {
        super(sql);
    }

    @Override
    public void run() {
        DDL ddl = (DDL) sql;

    }
}
