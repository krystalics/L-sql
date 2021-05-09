package com.github.krystalics.lsql.internal.sql;

import com.github.krystalics.lsql.internal.enums.SQLType;
import lombok.Data;

/**
 * @author linjiabao001
 * @date 2021/5/9
 * @description
 */
@Data
public abstract class SQL {
    SQLType type;
}
