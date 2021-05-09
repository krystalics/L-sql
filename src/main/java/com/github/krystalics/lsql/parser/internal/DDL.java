package com.github.krystalics.lsql.parser.internal;

import com.github.krystalics.lsql.parser.enums.SQLType;
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
    SQLType type;
    String namespace;
    String comment;
    String location;
    String properties;
}
