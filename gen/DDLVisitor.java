// Generated from /Users/krysta/study/L-sql/src/main/resources/DDL.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link DDLParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface DDLVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link DDLParser#ddl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDdl(DDLParser.DdlContext ctx);
	/**
	 * Visit a parse tree produced by {@link DDLParser#create}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate(DDLParser.CreateContext ctx);
	/**
	 * Visit a parse tree produced by {@link DDLParser#createDb}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateDb(DDLParser.CreateDbContext ctx);
	/**
	 * Visit a parse tree produced by {@link DDLParser#createTable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateTable(DDLParser.CreateTableContext ctx);
	/**
	 * Visit a parse tree produced by {@link DDLParser#fieldDeifnitions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldDeifnitions(DDLParser.FieldDeifnitionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DDLParser#fieldDeifnition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldDeifnition(DDLParser.FieldDeifnitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DDLParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(DDLParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DDLParser#drop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop(DDLParser.DropContext ctx);
	/**
	 * Visit a parse tree produced by {@link DDLParser#alter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter(DDLParser.AlterContext ctx);
	/**
	 * Visit a parse tree produced by {@link DDLParser#alterOperation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterOperation(DDLParser.AlterOperationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DDLParser#addOperation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddOperation(DDLParser.AddOperationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DDLParser#dropOperation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropOperation(DDLParser.DropOperationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DDLParser#modifyOperation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModifyOperation(DDLParser.ModifyOperationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DDLParser#dml}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDml(DDLParser.DmlContext ctx);
	/**
	 * Visit a parse tree produced by {@link DDLParser#insert}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsert(DDLParser.InsertContext ctx);
	/**
	 * Visit a parse tree produced by {@link DDLParser#values}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValues(DDLParser.ValuesContext ctx);
	/**
	 * Visit a parse tree produced by {@link DDLParser#delete}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelete(DDLParser.DeleteContext ctx);
	/**
	 * Visit a parse tree produced by {@link DDLParser#update}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdate(DDLParser.UpdateContext ctx);
	/**
	 * Visit a parse tree produced by {@link DDLParser#assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(DDLParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by {@link DDLParser#setStat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetStat(DDLParser.SetStatContext ctx);
	/**
	 * Visit a parse tree produced by {@link DDLParser#dql}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDql(DDLParser.DqlContext ctx);
	/**
	 * Visit a parse tree produced by {@link DDLParser#groupByStat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroupByStat(DDLParser.GroupByStatContext ctx);
	/**
	 * Visit a parse tree produced by {@link DDLParser#orderByStat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrderByStat(DDLParser.OrderByStatContext ctx);
	/**
	 * Visit a parse tree produced by {@link DDLParser#limitStat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLimitStat(DDLParser.LimitStatContext ctx);
	/**
	 * Visit a parse tree produced by {@link DDLParser#whereStat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhereStat(DDLParser.WhereStatContext ctx);
	/**
	 * Visit a parse tree produced by {@link DDLParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(DDLParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link DDLParser#columns}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumns(DDLParser.ColumnsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DDLParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(DDLParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link DDLParser#item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitItem(DDLParser.ItemContext ctx);
}