package com.github.krystalics.lsql.parser;

import com.github.krystalics.lsql.AnalysisException;
import com.github.krystalics.lsql.trees.TreeNode;
import lombok.Data;
import org.antlr.v4.runtime.ParserRuleContext;

/**
 * @author linjiabao001
 * @date 2021/4/8
 * @description
 */
public class ParseDriver {

    public static class ParseException extends AnalysisException {
        private String command;
        private String message;
        private TreeNode.Origin start;
        private TreeNode.Origin stop;
        public ParseException(String message, int line, int startPosition) {
            super(message, line, startPosition);
        }

        public ParseException(String message, ParserRuleContext ctx) {
            this(ParserUtils.command(ctx),message,ParserUtils.position(ctx.getStart()),ParserUtils.position(ctx.getStop()));
        }

        public ParseException(String command, String message, TreeNode.Origin position, TreeNode.Origin position1) {
            super();
        }
    }
}
