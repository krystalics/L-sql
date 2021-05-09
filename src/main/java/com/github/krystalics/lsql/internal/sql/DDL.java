package com.github.krystalics.lsql.internal.sql;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author linjiabao001
 * @date 2021/5/9
 * @description
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class DDL extends SQL{

    String namespace;
    String table;
    String comment;
    String properties;
}
