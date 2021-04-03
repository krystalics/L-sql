// Generated from /Users/krysta/study/L-sql/src/main/resources/LSQL.g4 by ANTLR 4.9.1
package com.github.krystalics.lsql.compile;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LSQLParser}.
 */
public interface LSQLListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LSQLParser#sql}.
	 * @param ctx the parse tree
	 */
	void enterSql(LSQLParser.SqlContext ctx);
	/**
	 * Exit a parse tree produced by {@link LSQLParser#sql}.
	 * @param ctx the parse tree
	 */
	void exitSql(LSQLParser.SqlContext ctx);
	/**
	 * Enter a parse tree produced by {@link LSQLParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(LSQLParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link LSQLParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(LSQLParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link LSQLParser#ddl}.
	 * @param ctx the parse tree
	 */
	void enterDdl(LSQLParser.DdlContext ctx);
	/**
	 * Exit a parse tree produced by {@link LSQLParser#ddl}.
	 * @param ctx the parse tree
	 */
	void exitDdl(LSQLParser.DdlContext ctx);
	/**
	 * Enter a parse tree produced by {@link LSQLParser#create}.
	 * @param ctx the parse tree
	 */
	void enterCreate(LSQLParser.CreateContext ctx);
	/**
	 * Exit a parse tree produced by {@link LSQLParser#create}.
	 * @param ctx the parse tree
	 */
	void exitCreate(LSQLParser.CreateContext ctx);
	/**
	 * Enter a parse tree produced by {@link LSQLParser#createDb}.
	 * @param ctx the parse tree
	 */
	void enterCreateDb(LSQLParser.CreateDbContext ctx);
	/**
	 * Exit a parse tree produced by {@link LSQLParser#createDb}.
	 * @param ctx the parse tree
	 */
	void exitCreateDb(LSQLParser.CreateDbContext ctx);
	/**
	 * Enter a parse tree produced by {@link LSQLParser#createTable}.
	 * @param ctx the parse tree
	 */
	void enterCreateTable(LSQLParser.CreateTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link LSQLParser#createTable}.
	 * @param ctx the parse tree
	 */
	void exitCreateTable(LSQLParser.CreateTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link LSQLParser#fieldDeifnitions}.
	 * @param ctx the parse tree
	 */
	void enterFieldDeifnitions(LSQLParser.FieldDeifnitionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link LSQLParser#fieldDeifnitions}.
	 * @param ctx the parse tree
	 */
	void exitFieldDeifnitions(LSQLParser.FieldDeifnitionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link LSQLParser#fieldDeifnition}.
	 * @param ctx the parse tree
	 */
	void enterFieldDeifnition(LSQLParser.FieldDeifnitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LSQLParser#fieldDeifnition}.
	 * @param ctx the parse tree
	 */
	void exitFieldDeifnition(LSQLParser.FieldDeifnitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LSQLParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(LSQLParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link LSQLParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(LSQLParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link LSQLParser#drop}.
	 * @param ctx the parse tree
	 */
	void enterDrop(LSQLParser.DropContext ctx);
	/**
	 * Exit a parse tree produced by {@link LSQLParser#drop}.
	 * @param ctx the parse tree
	 */
	void exitDrop(LSQLParser.DropContext ctx);
	/**
	 * Enter a parse tree produced by {@link LSQLParser#alter}.
	 * @param ctx the parse tree
	 */
	void enterAlter(LSQLParser.AlterContext ctx);
	/**
	 * Exit a parse tree produced by {@link LSQLParser#alter}.
	 * @param ctx the parse tree
	 */
	void exitAlter(LSQLParser.AlterContext ctx);
	/**
	 * Enter a parse tree produced by {@link LSQLParser#alterOperation}.
	 * @param ctx the parse tree
	 */
	void enterAlterOperation(LSQLParser.AlterOperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link LSQLParser#alterOperation}.
	 * @param ctx the parse tree
	 */
	void exitAlterOperation(LSQLParser.AlterOperationContext ctx);
	/**
	 * Enter a parse tree produced by {@link LSQLParser#addOperation}.
	 * @param ctx the parse tree
	 */
	void enterAddOperation(LSQLParser.AddOperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link LSQLParser#addOperation}.
	 * @param ctx the parse tree
	 */
	void exitAddOperation(LSQLParser.AddOperationContext ctx);
	/**
	 * Enter a parse tree produced by {@link LSQLParser#dropOperation}.
	 * @param ctx the parse tree
	 */
	void enterDropOperation(LSQLParser.DropOperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link LSQLParser#dropOperation}.
	 * @param ctx the parse tree
	 */
	void exitDropOperation(LSQLParser.DropOperationContext ctx);
	/**
	 * Enter a parse tree produced by {@link LSQLParser#modifyOperation}.
	 * @param ctx the parse tree
	 */
	void enterModifyOperation(LSQLParser.ModifyOperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link LSQLParser#modifyOperation}.
	 * @param ctx the parse tree
	 */
	void exitModifyOperation(LSQLParser.ModifyOperationContext ctx);
	/**
	 * Enter a parse tree produced by {@link LSQLParser#dml}.
	 * @param ctx the parse tree
	 */
	void enterDml(LSQLParser.DmlContext ctx);
	/**
	 * Exit a parse tree produced by {@link LSQLParser#dml}.
	 * @param ctx the parse tree
	 */
	void exitDml(LSQLParser.DmlContext ctx);
	/**
	 * Enter a parse tree produced by {@link LSQLParser#insert}.
	 * @param ctx the parse tree
	 */
	void enterInsert(LSQLParser.InsertContext ctx);
	/**
	 * Exit a parse tree produced by {@link LSQLParser#insert}.
	 * @param ctx the parse tree
	 */
	void exitInsert(LSQLParser.InsertContext ctx);
	/**
	 * Enter a parse tree produced by {@link LSQLParser#values}.
	 * @param ctx the parse tree
	 */
	void enterValues(LSQLParser.ValuesContext ctx);
	/**
	 * Exit a parse tree produced by {@link LSQLParser#values}.
	 * @param ctx the parse tree
	 */
	void exitValues(LSQLParser.ValuesContext ctx);
	/**
	 * Enter a parse tree produced by {@link LSQLParser#delete}.
	 * @param ctx the parse tree
	 */
	void enterDelete(LSQLParser.DeleteContext ctx);
	/**
	 * Exit a parse tree produced by {@link LSQLParser#delete}.
	 * @param ctx the parse tree
	 */
	void exitDelete(LSQLParser.DeleteContext ctx);
	/**
	 * Enter a parse tree produced by {@link LSQLParser#update}.
	 * @param ctx the parse tree
	 */
	void enterUpdate(LSQLParser.UpdateContext ctx);
	/**
	 * Exit a parse tree produced by {@link LSQLParser#update}.
	 * @param ctx the parse tree
	 */
	void exitUpdate(LSQLParser.UpdateContext ctx);
	/**
	 * Enter a parse tree produced by {@link LSQLParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(LSQLParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link LSQLParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(LSQLParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link LSQLParser#setStat}.
	 * @param ctx the parse tree
	 */
	void enterSetStat(LSQLParser.SetStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link LSQLParser#setStat}.
	 * @param ctx the parse tree
	 */
	void exitSetStat(LSQLParser.SetStatContext ctx);
	/**
	 * Enter a parse tree produced by {@link LSQLParser#dql}.
	 * @param ctx the parse tree
	 */
	void enterDql(LSQLParser.DqlContext ctx);
	/**
	 * Exit a parse tree produced by {@link LSQLParser#dql}.
	 * @param ctx the parse tree
	 */
	void exitDql(LSQLParser.DqlContext ctx);
	/**
	 * Enter a parse tree produced by {@link LSQLParser#groupByStat}.
	 * @param ctx the parse tree
	 */
	void enterGroupByStat(LSQLParser.GroupByStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link LSQLParser#groupByStat}.
	 * @param ctx the parse tree
	 */
	void exitGroupByStat(LSQLParser.GroupByStatContext ctx);
	/**
	 * Enter a parse tree produced by {@link LSQLParser#orderByStat}.
	 * @param ctx the parse tree
	 */
	void enterOrderByStat(LSQLParser.OrderByStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link LSQLParser#orderByStat}.
	 * @param ctx the parse tree
	 */
	void exitOrderByStat(LSQLParser.OrderByStatContext ctx);
	/**
	 * Enter a parse tree produced by {@link LSQLParser#limitStat}.
	 * @param ctx the parse tree
	 */
	void enterLimitStat(LSQLParser.LimitStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link LSQLParser#limitStat}.
	 * @param ctx the parse tree
	 */
	void exitLimitStat(LSQLParser.LimitStatContext ctx);
	/**
	 * Enter a parse tree produced by {@link LSQLParser#whereStat}.
	 * @param ctx the parse tree
	 */
	void enterWhereStat(LSQLParser.WhereStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link LSQLParser#whereStat}.
	 * @param ctx the parse tree
	 */
	void exitWhereStat(LSQLParser.WhereStatContext ctx);
	/**
	 * Enter a parse tree produced by {@link LSQLParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(LSQLParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link LSQLParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(LSQLParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link LSQLParser#columns}.
	 * @param ctx the parse tree
	 */
	void enterColumns(LSQLParser.ColumnsContext ctx);
	/**
	 * Exit a parse tree produced by {@link LSQLParser#columns}.
	 * @param ctx the parse tree
	 */
	void exitColumns(LSQLParser.ColumnsContext ctx);
	/**
	 * Enter a parse tree produced by {@link LSQLParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(LSQLParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link LSQLParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(LSQLParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link LSQLParser#item}.
	 * @param ctx the parse tree
	 */
	void enterItem(LSQLParser.ItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link LSQLParser#item}.
	 * @param ctx the parse tree
	 */
	void exitItem(LSQLParser.ItemContext ctx);
}