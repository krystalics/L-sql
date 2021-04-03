// Generated from /Users/krysta/study/L-sql/src/main/resources/LSQL.g4 by ANTLR 4.9.1
package com.github.krystalics.lsql.compile;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link LSQLParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface LSQLVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link LSQLParser#sql}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSql(LSQLParser.SqlContext ctx);
	/**
	 * Visit a parse tree produced by {@link LSQLParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat(LSQLParser.StatContext ctx);
	/**
	 * Visit a parse tree produced by {@link LSQLParser#ddl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDdl(LSQLParser.DdlContext ctx);
	/**
	 * Visit a parse tree produced by {@link LSQLParser#create}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate(LSQLParser.CreateContext ctx);
	/**
	 * Visit a parse tree produced by {@link LSQLParser#createDb}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateDb(LSQLParser.CreateDbContext ctx);
	/**
	 * Visit a parse tree produced by {@link LSQLParser#createTable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateTable(LSQLParser.CreateTableContext ctx);
	/**
	 * Visit a parse tree produced by {@link LSQLParser#fieldDeifnitions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldDeifnitions(LSQLParser.FieldDeifnitionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link LSQLParser#fieldDeifnition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldDeifnition(LSQLParser.FieldDeifnitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LSQLParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(LSQLParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link LSQLParser#drop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop(LSQLParser.DropContext ctx);
	/**
	 * Visit a parse tree produced by {@link LSQLParser#alter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter(LSQLParser.AlterContext ctx);
	/**
	 * Visit a parse tree produced by {@link LSQLParser#alterOperation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterOperation(LSQLParser.AlterOperationContext ctx);
	/**
	 * Visit a parse tree produced by {@link LSQLParser#addOperation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddOperation(LSQLParser.AddOperationContext ctx);
	/**
	 * Visit a parse tree produced by {@link LSQLParser#dropOperation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropOperation(LSQLParser.DropOperationContext ctx);
	/**
	 * Visit a parse tree produced by {@link LSQLParser#modifyOperation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModifyOperation(LSQLParser.ModifyOperationContext ctx);
	/**
	 * Visit a parse tree produced by {@link LSQLParser#dml}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDml(LSQLParser.DmlContext ctx);
	/**
	 * Visit a parse tree produced by {@link LSQLParser#insert}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsert(LSQLParser.InsertContext ctx);
	/**
	 * Visit a parse tree produced by {@link LSQLParser#values}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValues(LSQLParser.ValuesContext ctx);
	/**
	 * Visit a parse tree produced by {@link LSQLParser#delete}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelete(LSQLParser.DeleteContext ctx);
	/**
	 * Visit a parse tree produced by {@link LSQLParser#update}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdate(LSQLParser.UpdateContext ctx);
	/**
	 * Visit a parse tree produced by {@link LSQLParser#assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(LSQLParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by {@link LSQLParser#setStat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetStat(LSQLParser.SetStatContext ctx);
	/**
	 * Visit a parse tree produced by {@link LSQLParser#dql}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDql(LSQLParser.DqlContext ctx);
	/**
	 * Visit a parse tree produced by {@link LSQLParser#groupByStat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroupByStat(LSQLParser.GroupByStatContext ctx);
	/**
	 * Visit a parse tree produced by {@link LSQLParser#orderByStat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrderByStat(LSQLParser.OrderByStatContext ctx);
	/**
	 * Visit a parse tree produced by {@link LSQLParser#limitStat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLimitStat(LSQLParser.LimitStatContext ctx);
	/**
	 * Visit a parse tree produced by {@link LSQLParser#whereStat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhereStat(LSQLParser.WhereStatContext ctx);
	/**
	 * Visit a parse tree produced by {@link LSQLParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(LSQLParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link LSQLParser#columns}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumns(LSQLParser.ColumnsContext ctx);
	/**
	 * Visit a parse tree produced by {@link LSQLParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(LSQLParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link LSQLParser#item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitItem(LSQLParser.ItemContext ctx);
}