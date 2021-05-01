package com.github.krystalics.lsql.parser;

import com.github.krystalics.lsql.trees.TreeNode;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.misc.Interval;

import java.util.Optional;

/**
 * @author linjiabao001
 * @date 2021/4/8
 * @description
 */
public class ParserUtils {
    /**
     * 得到创建token的command
     * Get the command which created the token
     * @param ctx
     * @return
     */
    public static String command(ParserRuleContext ctx) {
        final CharStream stream = ctx.getStart().getInputStream();
        return stream.getText(Interval.of(0, stream.size() - 1));
    }

    public void operationNotAllowed(String message,ParserRuleContext ctx){
        throw new ParseDriver.ParseException("Operation not allowed: "+message,ctx);
    }

    public static TreeNode.Origin position(Token token){
        final Optional<Token> opt = Optional.of(token);
        new TreeNode.Origin(opt.map(Token::getLine),opt.map(Token::getCharPositionInLine))
    }
}
