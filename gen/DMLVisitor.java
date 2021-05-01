// Generated from /Users/krysta/study/L-sql/src/main/resources/DML.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link DMLParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface DMLVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link DMLParser#dml}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDml(DMLParser.DmlContext ctx);
	/**
	 * Visit a parse tree produced by {@link DMLParser#insert}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsert(DMLParser.InsertContext ctx);
	/**
	 * Visit a parse tree produced by {@link DMLParser#values}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValues(DMLParser.ValuesContext ctx);
	/**
	 * Visit a parse tree produced by {@link DMLParser#delete}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelete(DMLParser.DeleteContext ctx);
	/**
	 * Visit a parse tree produced by {@link DMLParser#update}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdate(DMLParser.UpdateContext ctx);
	/**
	 * Visit a parse tree produced by {@link DMLParser#assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(DMLParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by {@link DMLParser#setStat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetStat(DMLParser.SetStatContext ctx);
	/**
	 * Visit a parse tree produced by {@link DMLParser#dql}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDql(DMLParser.DqlContext ctx);
	/**
	 * Visit a parse tree produced by {@link DMLParser#groupByStat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroupByStat(DMLParser.GroupByStatContext ctx);
	/**
	 * Visit a parse tree produced by {@link DMLParser#orderByStat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrderByStat(DMLParser.OrderByStatContext ctx);
	/**
	 * Visit a parse tree produced by {@link DMLParser#limitStat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLimitStat(DMLParser.LimitStatContext ctx);
	/**
	 * Visit a parse tree produced by {@link DMLParser#whereStat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhereStat(DMLParser.WhereStatContext ctx);
	/**
	 * Visit a parse tree produced by {@link DMLParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(DMLParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link DMLParser#columns}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumns(DMLParser.ColumnsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DMLParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(DMLParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link DMLParser#item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitItem(DMLParser.ItemContext ctx);
}