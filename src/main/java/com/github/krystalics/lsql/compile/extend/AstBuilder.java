package com.github.krystalics.lsql.compile.extend;

import com.github.krystalics.lsql.compile.KrystaSqlBaseVisitor;
import com.github.krystalics.lsql.compile.KrystaSqlParser;

/**
 * @author linjiabao001
 * @date 2021/5/1
 * @description visitor 泛形指定的是 所有visit方法的返回值、暂定object
 */
public class AstBuilder extends KrystaSqlBaseVisitor<Object> {
    @Override
    public Object visitSingleStatement(KrystaSqlParser.SingleStatementContext ctx) {
        return super.visitSingleStatement(ctx);
    }

    @Override
    public Object visitCreateNamespace(KrystaSqlParser.CreateNamespaceContext ctx) {
        return super.visitCreateNamespace(ctx);
    }

    @Override
    public Object visitDropNamespace(KrystaSqlParser.DropNamespaceContext ctx) {
        return super.visitDropNamespace(ctx);
    }

    @Override
    public Object visitCreateTable(KrystaSqlParser.CreateTableContext ctx) {
        return super.visitCreateTable(ctx);
    }

    @Override
    public Object visitDropTable(KrystaSqlParser.DropTableContext ctx) {
        return super.visitDropTable(ctx);
    }

    @Override
    public Object visitExplain(KrystaSqlParser.ExplainContext ctx) {
        return super.visitExplain(ctx);
    }

    @Override
    public Object visitShowTables(KrystaSqlParser.ShowTablesContext ctx) {
        return super.visitShowTables(ctx);
    }

    @Override
    public Object visitTruncateTable(KrystaSqlParser.TruncateTableContext ctx) {
        return super.visitTruncateTable(ctx);
    }

    @Override
    public Object visitQuery(KrystaSqlParser.QueryContext ctx) {
        return super.visitQuery(ctx);
    }

    @Override
    public Object visitTable(KrystaSqlParser.TableContext ctx) {
        return super.visitTable(ctx);
    }

    @Override
    public Object visitSubquery(KrystaSqlParser.SubqueryContext ctx) {
        return super.visitSubquery(ctx);
    }

    @Override
    public Object visitFromStatement(KrystaSqlParser.FromStatementContext ctx) {
        return super.visitFromStatement(ctx);
    }

    @Override
    public Object visitSelectClause(KrystaSqlParser.SelectClauseContext ctx) {
        return super.visitSelectClause(ctx);
    }

    @Override
    public Object visitWhereClause(KrystaSqlParser.WhereClauseContext ctx) {
        return super.visitWhereClause(ctx);
    }

    @Override
    public Object visitAggregationClause(KrystaSqlParser.AggregationClauseContext ctx) {
        return super.visitAggregationClause(ctx);
    }

    @Override
    public Object visitHavingClause(KrystaSqlParser.HavingClauseContext ctx) {
        return super.visitHavingClause(ctx);
    }

    @Override
    public Object visitWindowClause(KrystaSqlParser.WindowClauseContext ctx) {
        return super.visitWindowClause(ctx);
    }

    @Override
    public Object visitFromClause(KrystaSqlParser.FromClauseContext ctx) {
        return super.visitFromClause(ctx);
    }

    @Override
    public Object visitWhenClause(KrystaSqlParser.WhenClauseContext ctx) {
        return super.visitWhenClause(ctx);
    }

    @Override
    public Object visitSetClause(KrystaSqlParser.SetClauseContext ctx) {
        return super.visitSetClause(ctx);
    }

    @Override
    public Object visitExpression(KrystaSqlParser.ExpressionContext ctx) {
        return super.visitExpression(ctx);
    }
}
