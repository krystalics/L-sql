package com.github.krystalics.lsql.compile;

import com.github.krystalics.lsql.BaseTest;
import com.github.krystalics.lsql.compile.extend.AstBuilder;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author linjiabao001
 * @date 2021/5/6
 * @description
 */
public class AstBuilderTest extends BaseTest {



    @Test
    public void createNamespace(){
        String testcase="CREATE NAMESPACE (`TEST`,TEST2) \n" +
                "COMMENT '这是测试库'\n" +
                "LOCATION '/tmp/test/'\n" +
                "WITH PROPERTIES (STORE='PARQUET',COM.EXAMPLE.DEMO.LSQL)";
        ByteArrayInputStream inputStream = new ByteArrayInputStream(testcase.getBytes());
        testMain(inputStream);
    }

    private void testMain(InputStream is){
        final CharStream charStream;
        try {
            charStream = CharStreams.fromStream(is);
            KrystaSqlLexer lexer = new KrystaSqlLexer(charStream);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            KrystaSqlParser parser = new KrystaSqlParser(tokens);
            ParseTree tree = parser.statement();

            AstBuilder ast=new AstBuilder();
            ast.visit(tree);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
