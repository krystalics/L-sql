package com.github.krystalics.lsql.internal.enums;

import com.github.krystalics.lsql.parser.executor.handler.SQLHandler;

import java.util.HashMap;
import java.util.Map;

/**
 * @author linjiabao001
 * @date 2021/5/9
 * @description
 * todo 设计handler 注册模式来完成 代码结构简化
 */
public enum SQLType {
    /**
     * DDL
     */
    CREATE_DB,
    CREATE_TABLE;

    Map<SQLType, SQLHandler> handlerMap = new HashMap<>();

    SQLType() {
        for (SQLType value : SQLType.values()) {

        }
    }
}
