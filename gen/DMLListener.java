// Generated from /Users/krysta/study/L-sql/src/main/resources/DML.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link DMLParser}.
 */
public interface DMLListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link DMLParser#dml}.
	 * @param ctx the parse tree
	 */
	void enterDml(DMLParser.DmlContext ctx);
	/**
	 * Exit a parse tree produced by {@link DMLParser#dml}.
	 * @param ctx the parse tree
	 */
	void exitDml(DMLParser.DmlContext ctx);
	/**
	 * Enter a parse tree produced by {@link DMLParser#insert}.
	 * @param ctx the parse tree
	 */
	void enterInsert(DMLParser.InsertContext ctx);
	/**
	 * Exit a parse tree produced by {@link DMLParser#insert}.
	 * @param ctx the parse tree
	 */
	void exitInsert(DMLParser.InsertContext ctx);
	/**
	 * Enter a parse tree produced by {@link DMLParser#values}.
	 * @param ctx the parse tree
	 */
	void enterValues(DMLParser.ValuesContext ctx);
	/**
	 * Exit a parse tree produced by {@link DMLParser#values}.
	 * @param ctx the parse tree
	 */
	void exitValues(DMLParser.ValuesContext ctx);
	/**
	 * Enter a parse tree produced by {@link DMLParser#delete}.
	 * @param ctx the parse tree
	 */
	void enterDelete(DMLParser.DeleteContext ctx);
	/**
	 * Exit a parse tree produced by {@link DMLParser#delete}.
	 * @param ctx the parse tree
	 */
	void exitDelete(DMLParser.DeleteContext ctx);
	/**
	 * Enter a parse tree produced by {@link DMLParser#update}.
	 * @param ctx the parse tree
	 */
	void enterUpdate(DMLParser.UpdateContext ctx);
	/**
	 * Exit a parse tree produced by {@link DMLParser#update}.
	 * @param ctx the parse tree
	 */
	void exitUpdate(DMLParser.UpdateContext ctx);
	/**
	 * Enter a parse tree produced by {@link DMLParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(DMLParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link DMLParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(DMLParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link DMLParser#setStat}.
	 * @param ctx the parse tree
	 */
	void enterSetStat(DMLParser.SetStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link DMLParser#setStat}.
	 * @param ctx the parse tree
	 */
	void exitSetStat(DMLParser.SetStatContext ctx);
	/**
	 * Enter a parse tree produced by {@link DMLParser#dql}.
	 * @param ctx the parse tree
	 */
	void enterDql(DMLParser.DqlContext ctx);
	/**
	 * Exit a parse tree produced by {@link DMLParser#dql}.
	 * @param ctx the parse tree
	 */
	void exitDql(DMLParser.DqlContext ctx);
	/**
	 * Enter a parse tree produced by {@link DMLParser#groupByStat}.
	 * @param ctx the parse tree
	 */
	void enterGroupByStat(DMLParser.GroupByStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link DMLParser#groupByStat}.
	 * @param ctx the parse tree
	 */
	void exitGroupByStat(DMLParser.GroupByStatContext ctx);
	/**
	 * Enter a parse tree produced by {@link DMLParser#orderByStat}.
	 * @param ctx the parse tree
	 */
	void enterOrderByStat(DMLParser.OrderByStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link DMLParser#orderByStat}.
	 * @param ctx the parse tree
	 */
	void exitOrderByStat(DMLParser.OrderByStatContext ctx);
	/**
	 * Enter a parse tree produced by {@link DMLParser#limitStat}.
	 * @param ctx the parse tree
	 */
	void enterLimitStat(DMLParser.LimitStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link DMLParser#limitStat}.
	 * @param ctx the parse tree
	 */
	void exitLimitStat(DMLParser.LimitStatContext ctx);
	/**
	 * Enter a parse tree produced by {@link DMLParser#whereStat}.
	 * @param ctx the parse tree
	 */
	void enterWhereStat(DMLParser.WhereStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link DMLParser#whereStat}.
	 * @param ctx the parse tree
	 */
	void exitWhereStat(DMLParser.WhereStatContext ctx);
	/**
	 * Enter a parse tree produced by {@link DMLParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(DMLParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link DMLParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(DMLParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link DMLParser#columns}.
	 * @param ctx the parse tree
	 */
	void enterColumns(DMLParser.ColumnsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DMLParser#columns}.
	 * @param ctx the parse tree
	 */
	void exitColumns(DMLParser.ColumnsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DMLParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(DMLParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link DMLParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(DMLParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link DMLParser#item}.
	 * @param ctx the parse tree
	 */
	void enterItem(DMLParser.ItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link DMLParser#item}.
	 * @param ctx the parse tree
	 */
	void exitItem(DMLParser.ItemContext ctx);
}