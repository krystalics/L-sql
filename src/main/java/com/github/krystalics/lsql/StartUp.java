package com.github.krystalics.lsql;

import com.github.krystalics.lsql.compile.LSQLBaseListener;
import com.github.krystalics.lsql.compile.LSQLLexer;
import com.github.krystalics.lsql.compile.LSQLParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * @author linjiabao001
 * @date 2021/4/3
 * @description
 */
public class StartUp {
    public static void main(String[] args) throws IOException {
        final CharStream charStream = CharStreams.fromStream(new FileInputStream("/Users/krysta/study/L-sql/test.sql"));
        final LSQLLexer lexer = new LSQLLexer(charStream);
        final CommonTokenStream tokens = new CommonTokenStream(lexer);
        final LSQLParser parser = new LSQLParser(tokens);

        ParseTree tree = parser.sql();
        ParseTreeWalker walker=new ParseTreeWalker();
        walker.walk(new LSQLBaseListener(),tree);

    }
}
