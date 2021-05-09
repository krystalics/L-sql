package com.github.krystalics.lsql.compile.extend;

import com.github.krystalics.lsql.compile.KrystaSqlBaseVisitor;
import com.github.krystalics.lsql.compile.KrystaSqlParser;
import com.github.krystalics.lsql.parser.SQLTemplate;
import com.github.krystalics.lsql.parser.enums.SQLType;
import com.github.krystalics.lsql.parser.executor.SQLExecutors;
import com.github.krystalics.lsql.parser.handler.CreateNameSpaceHandler;
import com.github.krystalics.lsql.parser.internal.DDL;

import java.util.ArrayList;
import java.util.List;
/**
 * 对于DDL 创建表和库来说可以直接将构造的对象提给对应的Handler
 */

/**
 * @author linjiabao001
 * @date 2021/5/1
 * @description visitor 泛形指定的是 所有visit方法的返回值、暂定object
 */
public class AstBuilder extends KrystaSqlBaseVisitor<String> {
    /**
     * 1. DDL-CREATE
     * - DB
     * - TABLE
     */

    /**
     * 获取完关键信息之后、希望能够构成一个标准的对象出去完成工作
     * @param ctx
     * @return
     */
    @Override
    public String visitCreateNamespace(KrystaSqlParser.CreateNamespaceContext ctx) {

        DDL ddl=new DDL();
        ddl.setType(SQLType.CREATE_DB);
        ddl.setNamespace(visit(ctx.identifierList()));
        ddl.setComment(visit(ctx.commentSpec(0)));
        ddl.setLocation(visit(ctx.locationSpec(0)));
        ddl.setProperties(visit(ctx.tablePropertyList(0)));

        SQLExecutors.execute(new CreateNameSpaceHandler(ddl));
        return super.visitCreateNamespace(ctx);
    }

    @Override
    public String visitCreateTable(KrystaSqlParser.CreateTableContext ctx) {
        return super.visitCreateTable(ctx);
    }

    @Override
    public String visitCommentSpec(KrystaSqlParser.CommentSpecContext ctx) {
        return ctx.STRING().getText();
    }

    @Override
    public String visitLocationSpec(KrystaSqlParser.LocationSpecContext ctx) {
        return ctx.STRING().getText();
    }

    /**
     * 下面都是基础的语法规则、比如
     * 1。identifier的获取
     * 2。tablePropertyList获取
     */


    @Override
    public String visitIdentifierList(KrystaSqlParser.IdentifierListContext ctx) {
        return visit(ctx.identifierSeq());
    }

    /**
     * 需要处理列表
     *
     * @param ctx
     * @return
     */
    @Override
    public String visitIdentifierSeq(KrystaSqlParser.IdentifierSeqContext ctx) {
        List<String> list = new ArrayList<>();
        for (KrystaSqlParser.IdentifierContext identifierContext : ctx.ident) {
            final String item = visit(identifierContext);
            list.add(item);
        }
        return String.join(",", list);
    }

    @Override
    public String visitUnquotedIdentifier(KrystaSqlParser.UnquotedIdentifierContext ctx) {
        return ctx.IDENTIFIER().getText();
    }

    /**
     * 例子：`test` 需要把两边的引号去掉
     *
     * @param ctx
     * @return
     */
    @Override
    public String visitQuotedIdentifier(KrystaSqlParser.QuotedIdentifierContext ctx) {
        String text = ctx.BACKQUOTED_IDENTIFIER().getText();
        text = text.substring(1, text.length() - 1);
        return text;
    }

    /**
     * 处理列表
     *
     * @param ctx
     * @return
     */
    @Override
    public String visitTablePropertyList(KrystaSqlParser.TablePropertyListContext ctx) {
        List<String> list = new ArrayList<>();
        for (KrystaSqlParser.TablePropertyContext tablePropertyContext : ctx.tableProperty()) {
            final String item = visit(tablePropertyContext);
            list.add(item);
        }
        return String.join(",", list);
    }

    @Override
    public String visitTableProperty(KrystaSqlParser.TablePropertyContext ctx) {
        final String key = visit(ctx.key);
        String value = "";
        if (ctx.value != null) {
            value = visit(ctx.value);
        } else {
            return key;
        }
        return key + ":" + value;
    }

    /**
     * 处理包名的递进、com.example.demo
     *
     * @param ctx
     * @return
     */
    @Override
    public String visitTablePropertyKey(KrystaSqlParser.TablePropertyKeyContext ctx) {
        if (ctx.STRING() != null) {
            return ctx.STRING().getText();
        }
        List<String> keys = new ArrayList<>();
        for (KrystaSqlParser.IdentifierContext identifierContext : ctx.identifier()) {
            keys.add(visit(identifierContext));
        }

        return String.join(".", keys);
    }

    @Override
    public String visitTablePropertyValue(KrystaSqlParser.TablePropertyValueContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitBooleanValue(KrystaSqlParser.BooleanValueContext ctx) {
        return ctx.TRUE() != null ? ctx.TRUE().getText() : ctx.FALSE().getText();
    }
}
