// Generated from /Users/krysta/study/L-sql/src/main/resources/DQL.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link DQLParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface DQLVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link DQLParser#dql}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDql(DQLParser.DqlContext ctx);
	/**
	 * Visit a parse tree produced by {@link DQLParser#groupByStat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroupByStat(DQLParser.GroupByStatContext ctx);
	/**
	 * Visit a parse tree produced by {@link DQLParser#orderByStat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrderByStat(DQLParser.OrderByStatContext ctx);
	/**
	 * Visit a parse tree produced by {@link DQLParser#limitStat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLimitStat(DQLParser.LimitStatContext ctx);
	/**
	 * Visit a parse tree produced by {@link DQLParser#whereStat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhereStat(DQLParser.WhereStatContext ctx);
	/**
	 * Visit a parse tree produced by {@link DQLParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(DQLParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link DQLParser#columns}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumns(DQLParser.ColumnsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DQLParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(DQLParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link DQLParser#item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitItem(DQLParser.ItemContext ctx);
}