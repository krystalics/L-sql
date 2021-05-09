package com.github.krystalics.lsql.parser;

import com.github.krystalics.lsql.internal.enums.SQLType;
import lombok.Data;

import java.util.List;

/**
 * @author linjiabao001
 * @date 2021/5/1
 * @description 记录sql所有的特性
 */
@Data
public class SQLTemplate {
    SQLType type;
    private String database;
    private String table;
    private List<String> columns;

    private String where;
    private String join;
    private String on;
    private String groupBy;
    private String orderBy;
    private String limit;
}
