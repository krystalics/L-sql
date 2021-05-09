package com.github.krystalics.lsql.internal.exceptions;

import com.github.krystalics.lsql.plans.LogicalPlan;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * @author linjiabao001
 * @date 2021/4/8
 * @description
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class AnalysisException extends Exception implements Serializable {
    private String message;
    private int line;
    private int startPosition;
    /**
     * plan 序列化时是可选的，原代码中使用的时scala自带的@transient注解
     * todo 这里暂时不管
     * Some plans fail to serialize due to bugs in scala collections
     */
    LogicalPlan plan;
    Throwable cause;

    public AnalysisException(String message, int line, int startPosition) {

    }


    public AnalysisException withPosition(int line, int startPosition) {
        final AnalysisException newException = new AnalysisException(message, line, startPosition);
        newException.setStackTrace(getStackTrace());
        return newException;
    }


}
