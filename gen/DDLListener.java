// Generated from /Users/krysta/study/L-sql/src/main/resources/DDL.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link DDLParser}.
 */
public interface DDLListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link DDLParser#ddl}.
	 * @param ctx the parse tree
	 */
	void enterDdl(DDLParser.DdlContext ctx);
	/**
	 * Exit a parse tree produced by {@link DDLParser#ddl}.
	 * @param ctx the parse tree
	 */
	void exitDdl(DDLParser.DdlContext ctx);
	/**
	 * Enter a parse tree produced by {@link DDLParser#create}.
	 * @param ctx the parse tree
	 */
	void enterCreate(DDLParser.CreateContext ctx);
	/**
	 * Exit a parse tree produced by {@link DDLParser#create}.
	 * @param ctx the parse tree
	 */
	void exitCreate(DDLParser.CreateContext ctx);
	/**
	 * Enter a parse tree produced by {@link DDLParser#createDb}.
	 * @param ctx the parse tree
	 */
	void enterCreateDb(DDLParser.CreateDbContext ctx);
	/**
	 * Exit a parse tree produced by {@link DDLParser#createDb}.
	 * @param ctx the parse tree
	 */
	void exitCreateDb(DDLParser.CreateDbContext ctx);
	/**
	 * Enter a parse tree produced by {@link DDLParser#createTable}.
	 * @param ctx the parse tree
	 */
	void enterCreateTable(DDLParser.CreateTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link DDLParser#createTable}.
	 * @param ctx the parse tree
	 */
	void exitCreateTable(DDLParser.CreateTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link DDLParser#fieldDeifnitions}.
	 * @param ctx the parse tree
	 */
	void enterFieldDeifnitions(DDLParser.FieldDeifnitionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DDLParser#fieldDeifnitions}.
	 * @param ctx the parse tree
	 */
	void exitFieldDeifnitions(DDLParser.FieldDeifnitionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DDLParser#fieldDeifnition}.
	 * @param ctx the parse tree
	 */
	void enterFieldDeifnition(DDLParser.FieldDeifnitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DDLParser#fieldDeifnition}.
	 * @param ctx the parse tree
	 */
	void exitFieldDeifnition(DDLParser.FieldDeifnitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DDLParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(DDLParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DDLParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(DDLParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DDLParser#drop}.
	 * @param ctx the parse tree
	 */
	void enterDrop(DDLParser.DropContext ctx);
	/**
	 * Exit a parse tree produced by {@link DDLParser#drop}.
	 * @param ctx the parse tree
	 */
	void exitDrop(DDLParser.DropContext ctx);
	/**
	 * Enter a parse tree produced by {@link DDLParser#alter}.
	 * @param ctx the parse tree
	 */
	void enterAlter(DDLParser.AlterContext ctx);
	/**
	 * Exit a parse tree produced by {@link DDLParser#alter}.
	 * @param ctx the parse tree
	 */
	void exitAlter(DDLParser.AlterContext ctx);
	/**
	 * Enter a parse tree produced by {@link DDLParser#alterOperation}.
	 * @param ctx the parse tree
	 */
	void enterAlterOperation(DDLParser.AlterOperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DDLParser#alterOperation}.
	 * @param ctx the parse tree
	 */
	void exitAlterOperation(DDLParser.AlterOperationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DDLParser#addOperation}.
	 * @param ctx the parse tree
	 */
	void enterAddOperation(DDLParser.AddOperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DDLParser#addOperation}.
	 * @param ctx the parse tree
	 */
	void exitAddOperation(DDLParser.AddOperationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DDLParser#dropOperation}.
	 * @param ctx the parse tree
	 */
	void enterDropOperation(DDLParser.DropOperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DDLParser#dropOperation}.
	 * @param ctx the parse tree
	 */
	void exitDropOperation(DDLParser.DropOperationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DDLParser#modifyOperation}.
	 * @param ctx the parse tree
	 */
	void enterModifyOperation(DDLParser.ModifyOperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DDLParser#modifyOperation}.
	 * @param ctx the parse tree
	 */
	void exitModifyOperation(DDLParser.ModifyOperationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DDLParser#dml}.
	 * @param ctx the parse tree
	 */
	void enterDml(DDLParser.DmlContext ctx);
	/**
	 * Exit a parse tree produced by {@link DDLParser#dml}.
	 * @param ctx the parse tree
	 */
	void exitDml(DDLParser.DmlContext ctx);
	/**
	 * Enter a parse tree produced by {@link DDLParser#insert}.
	 * @param ctx the parse tree
	 */
	void enterInsert(DDLParser.InsertContext ctx);
	/**
	 * Exit a parse tree produced by {@link DDLParser#insert}.
	 * @param ctx the parse tree
	 */
	void exitInsert(DDLParser.InsertContext ctx);
	/**
	 * Enter a parse tree produced by {@link DDLParser#values}.
	 * @param ctx the parse tree
	 */
	void enterValues(DDLParser.ValuesContext ctx);
	/**
	 * Exit a parse tree produced by {@link DDLParser#values}.
	 * @param ctx the parse tree
	 */
	void exitValues(DDLParser.ValuesContext ctx);
	/**
	 * Enter a parse tree produced by {@link DDLParser#delete}.
	 * @param ctx the parse tree
	 */
	void enterDelete(DDLParser.DeleteContext ctx);
	/**
	 * Exit a parse tree produced by {@link DDLParser#delete}.
	 * @param ctx the parse tree
	 */
	void exitDelete(DDLParser.DeleteContext ctx);
	/**
	 * Enter a parse tree produced by {@link DDLParser#update}.
	 * @param ctx the parse tree
	 */
	void enterUpdate(DDLParser.UpdateContext ctx);
	/**
	 * Exit a parse tree produced by {@link DDLParser#update}.
	 * @param ctx the parse tree
	 */
	void exitUpdate(DDLParser.UpdateContext ctx);
	/**
	 * Enter a parse tree produced by {@link DDLParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(DDLParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link DDLParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(DDLParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link DDLParser#setStat}.
	 * @param ctx the parse tree
	 */
	void enterSetStat(DDLParser.SetStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link DDLParser#setStat}.
	 * @param ctx the parse tree
	 */
	void exitSetStat(DDLParser.SetStatContext ctx);
	/**
	 * Enter a parse tree produced by {@link DDLParser#dql}.
	 * @param ctx the parse tree
	 */
	void enterDql(DDLParser.DqlContext ctx);
	/**
	 * Exit a parse tree produced by {@link DDLParser#dql}.
	 * @param ctx the parse tree
	 */
	void exitDql(DDLParser.DqlContext ctx);
	/**
	 * Enter a parse tree produced by {@link DDLParser#groupByStat}.
	 * @param ctx the parse tree
	 */
	void enterGroupByStat(DDLParser.GroupByStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link DDLParser#groupByStat}.
	 * @param ctx the parse tree
	 */
	void exitGroupByStat(DDLParser.GroupByStatContext ctx);
	/**
	 * Enter a parse tree produced by {@link DDLParser#orderByStat}.
	 * @param ctx the parse tree
	 */
	void enterOrderByStat(DDLParser.OrderByStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link DDLParser#orderByStat}.
	 * @param ctx the parse tree
	 */
	void exitOrderByStat(DDLParser.OrderByStatContext ctx);
	/**
	 * Enter a parse tree produced by {@link DDLParser#limitStat}.
	 * @param ctx the parse tree
	 */
	void enterLimitStat(DDLParser.LimitStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link DDLParser#limitStat}.
	 * @param ctx the parse tree
	 */
	void exitLimitStat(DDLParser.LimitStatContext ctx);
	/**
	 * Enter a parse tree produced by {@link DDLParser#whereStat}.
	 * @param ctx the parse tree
	 */
	void enterWhereStat(DDLParser.WhereStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link DDLParser#whereStat}.
	 * @param ctx the parse tree
	 */
	void exitWhereStat(DDLParser.WhereStatContext ctx);
	/**
	 * Enter a parse tree produced by {@link DDLParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(DDLParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link DDLParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(DDLParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link DDLParser#columns}.
	 * @param ctx the parse tree
	 */
	void enterColumns(DDLParser.ColumnsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DDLParser#columns}.
	 * @param ctx the parse tree
	 */
	void exitColumns(DDLParser.ColumnsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DDLParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(DDLParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link DDLParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(DDLParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link DDLParser#item}.
	 * @param ctx the parse tree
	 */
	void enterItem(DDLParser.ItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link DDLParser#item}.
	 * @param ctx the parse tree
	 */
	void exitItem(DDLParser.ItemContext ctx);
}