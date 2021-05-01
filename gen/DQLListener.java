// Generated from /Users/krysta/study/L-sql/src/main/resources/DQL.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link DQLParser}.
 */
public interface DQLListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link DQLParser#dql}.
	 * @param ctx the parse tree
	 */
	void enterDql(DQLParser.DqlContext ctx);
	/**
	 * Exit a parse tree produced by {@link DQLParser#dql}.
	 * @param ctx the parse tree
	 */
	void exitDql(DQLParser.DqlContext ctx);
	/**
	 * Enter a parse tree produced by {@link DQLParser#groupByStat}.
	 * @param ctx the parse tree
	 */
	void enterGroupByStat(DQLParser.GroupByStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link DQLParser#groupByStat}.
	 * @param ctx the parse tree
	 */
	void exitGroupByStat(DQLParser.GroupByStatContext ctx);
	/**
	 * Enter a parse tree produced by {@link DQLParser#orderByStat}.
	 * @param ctx the parse tree
	 */
	void enterOrderByStat(DQLParser.OrderByStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link DQLParser#orderByStat}.
	 * @param ctx the parse tree
	 */
	void exitOrderByStat(DQLParser.OrderByStatContext ctx);
	/**
	 * Enter a parse tree produced by {@link DQLParser#limitStat}.
	 * @param ctx the parse tree
	 */
	void enterLimitStat(DQLParser.LimitStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link DQLParser#limitStat}.
	 * @param ctx the parse tree
	 */
	void exitLimitStat(DQLParser.LimitStatContext ctx);
	/**
	 * Enter a parse tree produced by {@link DQLParser#whereStat}.
	 * @param ctx the parse tree
	 */
	void enterWhereStat(DQLParser.WhereStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link DQLParser#whereStat}.
	 * @param ctx the parse tree
	 */
	void exitWhereStat(DQLParser.WhereStatContext ctx);
	/**
	 * Enter a parse tree produced by {@link DQLParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(DQLParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link DQLParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(DQLParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link DQLParser#columns}.
	 * @param ctx the parse tree
	 */
	void enterColumns(DQLParser.ColumnsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DQLParser#columns}.
	 * @param ctx the parse tree
	 */
	void exitColumns(DQLParser.ColumnsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DQLParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(DQLParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link DQLParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(DQLParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link DQLParser#item}.
	 * @param ctx the parse tree
	 */
	void enterItem(DQLParser.ItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link DQLParser#item}.
	 * @param ctx the parse tree
	 */
	void exitItem(DQLParser.ItemContext ctx);
}