// Generated from /Users/krysta/study/L-sql/src/main/resources/KrystaSql.g4 by ANTLR 4.9.1
package com.github.krystalics.lsql.compile;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link KrystaSqlParser}.
 */
public interface KrystaSqlListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link KrystaSqlParser#singleStatement}.
	 * @param ctx the parse tree
	 */
	void enterSingleStatement(KrystaSqlParser.SingleStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link KrystaSqlParser#singleStatement}.
	 * @param ctx the parse tree
	 */
	void exitSingleStatement(KrystaSqlParser.SingleStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code statementDefault}
	 * labeled alternative in {@link KrystaSqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatementDefault(KrystaSqlParser.StatementDefaultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code statementDefault}
	 * labeled alternative in {@link KrystaSqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatementDefault(KrystaSqlParser.StatementDefaultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dmlStatement}
	 * labeled alternative in {@link KrystaSqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterDmlStatement(KrystaSqlParser.DmlStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dmlStatement}
	 * labeled alternative in {@link KrystaSqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitDmlStatement(KrystaSqlParser.DmlStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code use}
	 * labeled alternative in {@link KrystaSqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterUse(KrystaSqlParser.UseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code use}
	 * labeled alternative in {@link KrystaSqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitUse(KrystaSqlParser.UseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code createNamespace}
	 * labeled alternative in {@link KrystaSqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterCreateNamespace(KrystaSqlParser.CreateNamespaceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code createNamespace}
	 * labeled alternative in {@link KrystaSqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitCreateNamespace(KrystaSqlParser.CreateNamespaceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code setNamespaceProperties}
	 * labeled alternative in {@link KrystaSqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterSetNamespaceProperties(KrystaSqlParser.SetNamespacePropertiesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code setNamespaceProperties}
	 * labeled alternative in {@link KrystaSqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitSetNamespaceProperties(KrystaSqlParser.SetNamespacePropertiesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code setNamespaceLocation}
	 * labeled alternative in {@link KrystaSqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterSetNamespaceLocation(KrystaSqlParser.SetNamespaceLocationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code setNamespaceLocation}
	 * labeled alternative in {@link KrystaSqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitSetNamespaceLocation(KrystaSqlParser.SetNamespaceLocationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dropNamespace}
	 * labeled alternative in {@link KrystaSqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterDropNamespace(KrystaSqlParser.DropNamespaceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dropNamespace}
	 * labeled alternative in {@link KrystaSqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitDropNamespace(KrystaSqlParser.DropNamespaceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code showNamespaces}
	 * labeled alternative in {@link KrystaSqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterShowNamespaces(KrystaSqlParser.ShowNamespacesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showNamespaces}
	 * labeled alternative in {@link KrystaSqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitShowNamespaces(KrystaSqlParser.ShowNamespacesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code createTable}
	 * labeled alternative in {@link KrystaSqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterCreateTable(KrystaSqlParser.CreateTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code createTable}
	 * labeled alternative in {@link KrystaSqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitCreateTable(KrystaSqlParser.CreateTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code createHiveTable}
	 * labeled alternative in {@link KrystaSqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterCreateHiveTable(KrystaSqlParser.CreateHiveTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code createHiveTable}
	 * labeled alternative in {@link KrystaSqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitCreateHiveTable(KrystaSqlParser.CreateHiveTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code createTableLike}
	 * labeled alternative in {@link KrystaSqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterCreateTableLike(KrystaSqlParser.CreateTableLikeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code createTableLike}
	 * labeled alternative in {@link KrystaSqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitCreateTableLike(KrystaSqlParser.CreateTableLikeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code analyze}
	 * labeled alternative in {@link KrystaSqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterAnalyze(KrystaSqlParser.AnalyzeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code analyze}
	 * labeled alternative in {@link KrystaSqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitAnalyze(KrystaSqlParser.AnalyzeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dropTable}
	 * labeled alternative in {@link KrystaSqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterDropTable(KrystaSqlParser.DropTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dropTable}
	 * labeled alternative in {@link KrystaSqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitDropTable(KrystaSqlParser.DropTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code explain}
	 * labeled alternative in {@link KrystaSqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterExplain(KrystaSqlParser.ExplainContext ctx);
	/**
	 * Exit a parse tree produced by the {@code explain}
	 * labeled alternative in {@link KrystaSqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitExplain(KrystaSqlParser.ExplainContext ctx);
	/**
	 * Enter a parse tree produced by the {@code showTables}
	 * labeled alternative in {@link KrystaSqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterShowTables(KrystaSqlParser.ShowTablesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showTables}
	 * labeled alternative in {@link KrystaSqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitShowTables(KrystaSqlParser.ShowTablesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code showTable}
	 * labeled alternative in {@link KrystaSqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterShowTable(KrystaSqlParser.ShowTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showTable}
	 * labeled alternative in {@link KrystaSqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitShowTable(KrystaSqlParser.ShowTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code showTblProperties}
	 * labeled alternative in {@link KrystaSqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterShowTblProperties(KrystaSqlParser.ShowTblPropertiesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showTblProperties}
	 * labeled alternative in {@link KrystaSqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitShowTblProperties(KrystaSqlParser.ShowTblPropertiesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code showColumns}
	 * labeled alternative in {@link KrystaSqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterShowColumns(KrystaSqlParser.ShowColumnsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showColumns}
	 * labeled alternative in {@link KrystaSqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitShowColumns(KrystaSqlParser.ShowColumnsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code showPartitions}
	 * labeled alternative in {@link KrystaSqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterShowPartitions(KrystaSqlParser.ShowPartitionsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showPartitions}
	 * labeled alternative in {@link KrystaSqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitShowPartitions(KrystaSqlParser.ShowPartitionsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code showCreateTable}
	 * labeled alternative in {@link KrystaSqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterShowCreateTable(KrystaSqlParser.ShowCreateTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showCreateTable}
	 * labeled alternative in {@link KrystaSqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitShowCreateTable(KrystaSqlParser.ShowCreateTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code showCurrentNamespace}
	 * labeled alternative in {@link KrystaSqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterShowCurrentNamespace(KrystaSqlParser.ShowCurrentNamespaceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showCurrentNamespace}
	 * labeled alternative in {@link KrystaSqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitShowCurrentNamespace(KrystaSqlParser.ShowCurrentNamespaceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code describeNamespace}
	 * labeled alternative in {@link KrystaSqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterDescribeNamespace(KrystaSqlParser.DescribeNamespaceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code describeNamespace}
	 * labeled alternative in {@link KrystaSqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitDescribeNamespace(KrystaSqlParser.DescribeNamespaceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code describeRelation}
	 * labeled alternative in {@link KrystaSqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterDescribeRelation(KrystaSqlParser.DescribeRelationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code describeRelation}
	 * labeled alternative in {@link KrystaSqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitDescribeRelation(KrystaSqlParser.DescribeRelationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code describeQuery}
	 * labeled alternative in {@link KrystaSqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterDescribeQuery(KrystaSqlParser.DescribeQueryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code describeQuery}
	 * labeled alternative in {@link KrystaSqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitDescribeQuery(KrystaSqlParser.DescribeQueryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code commentNamespace}
	 * labeled alternative in {@link KrystaSqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterCommentNamespace(KrystaSqlParser.CommentNamespaceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code commentNamespace}
	 * labeled alternative in {@link KrystaSqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitCommentNamespace(KrystaSqlParser.CommentNamespaceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code commentTable}
	 * labeled alternative in {@link KrystaSqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterCommentTable(KrystaSqlParser.CommentTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code commentTable}
	 * labeled alternative in {@link KrystaSqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitCommentTable(KrystaSqlParser.CommentTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code refreshTable}
	 * labeled alternative in {@link KrystaSqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterRefreshTable(KrystaSqlParser.RefreshTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code refreshTable}
	 * labeled alternative in {@link KrystaSqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitRefreshTable(KrystaSqlParser.RefreshTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code refreshResource}
	 * labeled alternative in {@link KrystaSqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterRefreshResource(KrystaSqlParser.RefreshResourceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code refreshResource}
	 * labeled alternative in {@link KrystaSqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitRefreshResource(KrystaSqlParser.RefreshResourceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cacheTable}
	 * labeled alternative in {@link KrystaSqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterCacheTable(KrystaSqlParser.CacheTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cacheTable}
	 * labeled alternative in {@link KrystaSqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitCacheTable(KrystaSqlParser.CacheTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code uncacheTable}
	 * labeled alternative in {@link KrystaSqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterUncacheTable(KrystaSqlParser.UncacheTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code uncacheTable}
	 * labeled alternative in {@link KrystaSqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitUncacheTable(KrystaSqlParser.UncacheTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code clearCache}
	 * labeled alternative in {@link KrystaSqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterClearCache(KrystaSqlParser.ClearCacheContext ctx);
	/**
	 * Exit a parse tree produced by the {@code clearCache}
	 * labeled alternative in {@link KrystaSqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitClearCache(KrystaSqlParser.ClearCacheContext ctx);
	/**
	 * Enter a parse tree produced by the {@code loadData}
	 * labeled alternative in {@link KrystaSqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterLoadData(KrystaSqlParser.LoadDataContext ctx);
	/**
	 * Exit a parse tree produced by the {@code loadData}
	 * labeled alternative in {@link KrystaSqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitLoadData(KrystaSqlParser.LoadDataContext ctx);
	/**
	 * Enter a parse tree produced by the {@code truncateTable}
	 * labeled alternative in {@link KrystaSqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterTruncateTable(KrystaSqlParser.TruncateTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code truncateTable}
	 * labeled alternative in {@link KrystaSqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitTruncateTable(KrystaSqlParser.TruncateTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code repairTable}
	 * labeled alternative in {@link KrystaSqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterRepairTable(KrystaSqlParser.RepairTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code repairTable}
	 * labeled alternative in {@link KrystaSqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitRepairTable(KrystaSqlParser.RepairTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code manageResource}
	 * labeled alternative in {@link KrystaSqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterManageResource(KrystaSqlParser.ManageResourceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code manageResource}
	 * labeled alternative in {@link KrystaSqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitManageResource(KrystaSqlParser.ManageResourceContext ctx);
	/**
	 * Enter a parse tree produced by {@link KrystaSqlParser#query}.
	 * @param ctx the parse tree
	 */
	void enterQuery(KrystaSqlParser.QueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link KrystaSqlParser#query}.
	 * @param ctx the parse tree
	 */
	void exitQuery(KrystaSqlParser.QueryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code queryTermDefault}
	 * labeled alternative in {@link KrystaSqlParser#queryTerm}.
	 * @param ctx the parse tree
	 */
	void enterQueryTermDefault(KrystaSqlParser.QueryTermDefaultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code queryTermDefault}
	 * labeled alternative in {@link KrystaSqlParser#queryTerm}.
	 * @param ctx the parse tree
	 */
	void exitQueryTermDefault(KrystaSqlParser.QueryTermDefaultContext ctx);
	/**
	 * Enter a parse tree produced by {@link KrystaSqlParser#queryOrganization}.
	 * @param ctx the parse tree
	 */
	void enterQueryOrganization(KrystaSqlParser.QueryOrganizationContext ctx);
	/**
	 * Exit a parse tree produced by {@link KrystaSqlParser#queryOrganization}.
	 * @param ctx the parse tree
	 */
	void exitQueryOrganization(KrystaSqlParser.QueryOrganizationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code queryPrimaryDefault}
	 * labeled alternative in {@link KrystaSqlParser#queryPrimary}.
	 * @param ctx the parse tree
	 */
	void enterQueryPrimaryDefault(KrystaSqlParser.QueryPrimaryDefaultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code queryPrimaryDefault}
	 * labeled alternative in {@link KrystaSqlParser#queryPrimary}.
	 * @param ctx the parse tree
	 */
	void exitQueryPrimaryDefault(KrystaSqlParser.QueryPrimaryDefaultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code fromStmt}
	 * labeled alternative in {@link KrystaSqlParser#queryPrimary}.
	 * @param ctx the parse tree
	 */
	void enterFromStmt(KrystaSqlParser.FromStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code fromStmt}
	 * labeled alternative in {@link KrystaSqlParser#queryPrimary}.
	 * @param ctx the parse tree
	 */
	void exitFromStmt(KrystaSqlParser.FromStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code table}
	 * labeled alternative in {@link KrystaSqlParser#queryPrimary}.
	 * @param ctx the parse tree
	 */
	void enterTable(KrystaSqlParser.TableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code table}
	 * labeled alternative in {@link KrystaSqlParser#queryPrimary}.
	 * @param ctx the parse tree
	 */
	void exitTable(KrystaSqlParser.TableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code subquery}
	 * labeled alternative in {@link KrystaSqlParser#queryPrimary}.
	 * @param ctx the parse tree
	 */
	void enterSubquery(KrystaSqlParser.SubqueryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code subquery}
	 * labeled alternative in {@link KrystaSqlParser#queryPrimary}.
	 * @param ctx the parse tree
	 */
	void exitSubquery(KrystaSqlParser.SubqueryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code regularQuerySpecification}
	 * labeled alternative in {@link KrystaSqlParser#querySpecification}.
	 * @param ctx the parse tree
	 */
	void enterRegularQuerySpecification(KrystaSqlParser.RegularQuerySpecificationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code regularQuerySpecification}
	 * labeled alternative in {@link KrystaSqlParser#querySpecification}.
	 * @param ctx the parse tree
	 */
	void exitRegularQuerySpecification(KrystaSqlParser.RegularQuerySpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link KrystaSqlParser#fromStatement}.
	 * @param ctx the parse tree
	 */
	void enterFromStatement(KrystaSqlParser.FromStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link KrystaSqlParser#fromStatement}.
	 * @param ctx the parse tree
	 */
	void exitFromStatement(KrystaSqlParser.FromStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link KrystaSqlParser#fromStatementBody}.
	 * @param ctx the parse tree
	 */
	void enterFromStatementBody(KrystaSqlParser.FromStatementBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link KrystaSqlParser#fromStatementBody}.
	 * @param ctx the parse tree
	 */
	void exitFromStatementBody(KrystaSqlParser.FromStatementBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link KrystaSqlParser#selectClause}.
	 * @param ctx the parse tree
	 */
	void enterSelectClause(KrystaSqlParser.SelectClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link KrystaSqlParser#selectClause}.
	 * @param ctx the parse tree
	 */
	void exitSelectClause(KrystaSqlParser.SelectClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link KrystaSqlParser#whereClause}.
	 * @param ctx the parse tree
	 */
	void enterWhereClause(KrystaSqlParser.WhereClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link KrystaSqlParser#whereClause}.
	 * @param ctx the parse tree
	 */
	void exitWhereClause(KrystaSqlParser.WhereClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link KrystaSqlParser#aggregationClause}.
	 * @param ctx the parse tree
	 */
	void enterAggregationClause(KrystaSqlParser.AggregationClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link KrystaSqlParser#aggregationClause}.
	 * @param ctx the parse tree
	 */
	void exitAggregationClause(KrystaSqlParser.AggregationClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link KrystaSqlParser#havingClause}.
	 * @param ctx the parse tree
	 */
	void enterHavingClause(KrystaSqlParser.HavingClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link KrystaSqlParser#havingClause}.
	 * @param ctx the parse tree
	 */
	void exitHavingClause(KrystaSqlParser.HavingClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link KrystaSqlParser#windowClause}.
	 * @param ctx the parse tree
	 */
	void enterWindowClause(KrystaSqlParser.WindowClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link KrystaSqlParser#windowClause}.
	 * @param ctx the parse tree
	 */
	void exitWindowClause(KrystaSqlParser.WindowClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link KrystaSqlParser#fromClause}.
	 * @param ctx the parse tree
	 */
	void enterFromClause(KrystaSqlParser.FromClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link KrystaSqlParser#fromClause}.
	 * @param ctx the parse tree
	 */
	void exitFromClause(KrystaSqlParser.FromClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link KrystaSqlParser#whenClause}.
	 * @param ctx the parse tree
	 */
	void enterWhenClause(KrystaSqlParser.WhenClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link KrystaSqlParser#whenClause}.
	 * @param ctx the parse tree
	 */
	void exitWhenClause(KrystaSqlParser.WhenClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link KrystaSqlParser#setClause}.
	 * @param ctx the parse tree
	 */
	void enterSetClause(KrystaSqlParser.SetClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link KrystaSqlParser#setClause}.
	 * @param ctx the parse tree
	 */
	void exitSetClause(KrystaSqlParser.SetClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link KrystaSqlParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(KrystaSqlParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link KrystaSqlParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(KrystaSqlParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code logicalNot}
	 * labeled alternative in {@link KrystaSqlParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalNot(KrystaSqlParser.LogicalNotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code logicalNot}
	 * labeled alternative in {@link KrystaSqlParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalNot(KrystaSqlParser.LogicalNotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code predicated}
	 * labeled alternative in {@link KrystaSqlParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void enterPredicated(KrystaSqlParser.PredicatedContext ctx);
	/**
	 * Exit a parse tree produced by the {@code predicated}
	 * labeled alternative in {@link KrystaSqlParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void exitPredicated(KrystaSqlParser.PredicatedContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exists}
	 * labeled alternative in {@link KrystaSqlParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void enterExists(KrystaSqlParser.ExistsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exists}
	 * labeled alternative in {@link KrystaSqlParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void exitExists(KrystaSqlParser.ExistsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code logicalBinary}
	 * labeled alternative in {@link KrystaSqlParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalBinary(KrystaSqlParser.LogicalBinaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code logicalBinary}
	 * labeled alternative in {@link KrystaSqlParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalBinary(KrystaSqlParser.LogicalBinaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link KrystaSqlParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterPredicate(KrystaSqlParser.PredicateContext ctx);
	/**
	 * Exit a parse tree produced by {@link KrystaSqlParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitPredicate(KrystaSqlParser.PredicateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code valueExpressionDefault}
	 * labeled alternative in {@link KrystaSqlParser#valueExpression}.
	 * @param ctx the parse tree
	 */
	void enterValueExpressionDefault(KrystaSqlParser.ValueExpressionDefaultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code valueExpressionDefault}
	 * labeled alternative in {@link KrystaSqlParser#valueExpression}.
	 * @param ctx the parse tree
	 */
	void exitValueExpressionDefault(KrystaSqlParser.ValueExpressionDefaultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code comparison}
	 * labeled alternative in {@link KrystaSqlParser#valueExpression}.
	 * @param ctx the parse tree
	 */
	void enterComparison(KrystaSqlParser.ComparisonContext ctx);
	/**
	 * Exit a parse tree produced by the {@code comparison}
	 * labeled alternative in {@link KrystaSqlParser#valueExpression}.
	 * @param ctx the parse tree
	 */
	void exitComparison(KrystaSqlParser.ComparisonContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arithmeticBinary}
	 * labeled alternative in {@link KrystaSqlParser#valueExpression}.
	 * @param ctx the parse tree
	 */
	void enterArithmeticBinary(KrystaSqlParser.ArithmeticBinaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arithmeticBinary}
	 * labeled alternative in {@link KrystaSqlParser#valueExpression}.
	 * @param ctx the parse tree
	 */
	void exitArithmeticBinary(KrystaSqlParser.ArithmeticBinaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arithmeticUnary}
	 * labeled alternative in {@link KrystaSqlParser#valueExpression}.
	 * @param ctx the parse tree
	 */
	void enterArithmeticUnary(KrystaSqlParser.ArithmeticUnaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arithmeticUnary}
	 * labeled alternative in {@link KrystaSqlParser#valueExpression}.
	 * @param ctx the parse tree
	 */
	void exitArithmeticUnary(KrystaSqlParser.ArithmeticUnaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code struct}
	 * labeled alternative in {@link KrystaSqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterStruct(KrystaSqlParser.StructContext ctx);
	/**
	 * Exit a parse tree produced by the {@code struct}
	 * labeled alternative in {@link KrystaSqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitStruct(KrystaSqlParser.StructContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dereference}
	 * labeled alternative in {@link KrystaSqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterDereference(KrystaSqlParser.DereferenceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dereference}
	 * labeled alternative in {@link KrystaSqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitDereference(KrystaSqlParser.DereferenceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code simpleCase}
	 * labeled alternative in {@link KrystaSqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterSimpleCase(KrystaSqlParser.SimpleCaseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code simpleCase}
	 * labeled alternative in {@link KrystaSqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitSimpleCase(KrystaSqlParser.SimpleCaseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code columnReference}
	 * labeled alternative in {@link KrystaSqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterColumnReference(KrystaSqlParser.ColumnReferenceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code columnReference}
	 * labeled alternative in {@link KrystaSqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitColumnReference(KrystaSqlParser.ColumnReferenceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rowConstructor}
	 * labeled alternative in {@link KrystaSqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterRowConstructor(KrystaSqlParser.RowConstructorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rowConstructor}
	 * labeled alternative in {@link KrystaSqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitRowConstructor(KrystaSqlParser.RowConstructorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code last}
	 * labeled alternative in {@link KrystaSqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterLast(KrystaSqlParser.LastContext ctx);
	/**
	 * Exit a parse tree produced by the {@code last}
	 * labeled alternative in {@link KrystaSqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitLast(KrystaSqlParser.LastContext ctx);
	/**
	 * Enter a parse tree produced by the {@code star}
	 * labeled alternative in {@link KrystaSqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterStar(KrystaSqlParser.StarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code star}
	 * labeled alternative in {@link KrystaSqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitStar(KrystaSqlParser.StarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code overlay}
	 * labeled alternative in {@link KrystaSqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterOverlay(KrystaSqlParser.OverlayContext ctx);
	/**
	 * Exit a parse tree produced by the {@code overlay}
	 * labeled alternative in {@link KrystaSqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitOverlay(KrystaSqlParser.OverlayContext ctx);
	/**
	 * Enter a parse tree produced by the {@code subscript}
	 * labeled alternative in {@link KrystaSqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterSubscript(KrystaSqlParser.SubscriptContext ctx);
	/**
	 * Exit a parse tree produced by the {@code subscript}
	 * labeled alternative in {@link KrystaSqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitSubscript(KrystaSqlParser.SubscriptContext ctx);
	/**
	 * Enter a parse tree produced by the {@code subqueryExpression}
	 * labeled alternative in {@link KrystaSqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterSubqueryExpression(KrystaSqlParser.SubqueryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code subqueryExpression}
	 * labeled alternative in {@link KrystaSqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitSubqueryExpression(KrystaSqlParser.SubqueryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code substring}
	 * labeled alternative in {@link KrystaSqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterSubstring(KrystaSqlParser.SubstringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code substring}
	 * labeled alternative in {@link KrystaSqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitSubstring(KrystaSqlParser.SubstringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code currentDatetime}
	 * labeled alternative in {@link KrystaSqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterCurrentDatetime(KrystaSqlParser.CurrentDatetimeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code currentDatetime}
	 * labeled alternative in {@link KrystaSqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitCurrentDatetime(KrystaSqlParser.CurrentDatetimeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cast}
	 * labeled alternative in {@link KrystaSqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterCast(KrystaSqlParser.CastContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cast}
	 * labeled alternative in {@link KrystaSqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitCast(KrystaSqlParser.CastContext ctx);
	/**
	 * Enter a parse tree produced by the {@code constantDefault}
	 * labeled alternative in {@link KrystaSqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterConstantDefault(KrystaSqlParser.ConstantDefaultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code constantDefault}
	 * labeled alternative in {@link KrystaSqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitConstantDefault(KrystaSqlParser.ConstantDefaultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lambda}
	 * labeled alternative in {@link KrystaSqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterLambda(KrystaSqlParser.LambdaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lambda}
	 * labeled alternative in {@link KrystaSqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitLambda(KrystaSqlParser.LambdaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parenthesizedExpression}
	 * labeled alternative in {@link KrystaSqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterParenthesizedExpression(KrystaSqlParser.ParenthesizedExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parenthesizedExpression}
	 * labeled alternative in {@link KrystaSqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitParenthesizedExpression(KrystaSqlParser.ParenthesizedExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code extract}
	 * labeled alternative in {@link KrystaSqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterExtract(KrystaSqlParser.ExtractContext ctx);
	/**
	 * Exit a parse tree produced by the {@code extract}
	 * labeled alternative in {@link KrystaSqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitExtract(KrystaSqlParser.ExtractContext ctx);
	/**
	 * Enter a parse tree produced by the {@code trim}
	 * labeled alternative in {@link KrystaSqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterTrim(KrystaSqlParser.TrimContext ctx);
	/**
	 * Exit a parse tree produced by the {@code trim}
	 * labeled alternative in {@link KrystaSqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitTrim(KrystaSqlParser.TrimContext ctx);
	/**
	 * Enter a parse tree produced by the {@code searchedCase}
	 * labeled alternative in {@link KrystaSqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterSearchedCase(KrystaSqlParser.SearchedCaseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code searchedCase}
	 * labeled alternative in {@link KrystaSqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitSearchedCase(KrystaSqlParser.SearchedCaseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code position}
	 * labeled alternative in {@link KrystaSqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterPosition(KrystaSqlParser.PositionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code position}
	 * labeled alternative in {@link KrystaSqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitPosition(KrystaSqlParser.PositionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code first}
	 * labeled alternative in {@link KrystaSqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterFirst(KrystaSqlParser.FirstContext ctx);
	/**
	 * Exit a parse tree produced by the {@code first}
	 * labeled alternative in {@link KrystaSqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitFirst(KrystaSqlParser.FirstContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nullLiteral}
	 * labeled alternative in {@link KrystaSqlParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterNullLiteral(KrystaSqlParser.NullLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nullLiteral}
	 * labeled alternative in {@link KrystaSqlParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitNullLiteral(KrystaSqlParser.NullLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code typeConstructor}
	 * labeled alternative in {@link KrystaSqlParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterTypeConstructor(KrystaSqlParser.TypeConstructorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code typeConstructor}
	 * labeled alternative in {@link KrystaSqlParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitTypeConstructor(KrystaSqlParser.TypeConstructorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numericLiteral}
	 * labeled alternative in {@link KrystaSqlParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterNumericLiteral(KrystaSqlParser.NumericLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numericLiteral}
	 * labeled alternative in {@link KrystaSqlParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitNumericLiteral(KrystaSqlParser.NumericLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code booleanLiteral}
	 * labeled alternative in {@link KrystaSqlParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterBooleanLiteral(KrystaSqlParser.BooleanLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code booleanLiteral}
	 * labeled alternative in {@link KrystaSqlParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitBooleanLiteral(KrystaSqlParser.BooleanLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringLiteral}
	 * labeled alternative in {@link KrystaSqlParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterStringLiteral(KrystaSqlParser.StringLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringLiteral}
	 * labeled alternative in {@link KrystaSqlParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitStringLiteral(KrystaSqlParser.StringLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link KrystaSqlParser#comparisonOperator}.
	 * @param ctx the parse tree
	 */
	void enterComparisonOperator(KrystaSqlParser.ComparisonOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link KrystaSqlParser#comparisonOperator}.
	 * @param ctx the parse tree
	 */
	void exitComparisonOperator(KrystaSqlParser.ComparisonOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link KrystaSqlParser#namedExpression}.
	 * @param ctx the parse tree
	 */
	void enterNamedExpression(KrystaSqlParser.NamedExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link KrystaSqlParser#namedExpression}.
	 * @param ctx the parse tree
	 */
	void exitNamedExpression(KrystaSqlParser.NamedExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link KrystaSqlParser#namedExpressionSeq}.
	 * @param ctx the parse tree
	 */
	void enterNamedExpressionSeq(KrystaSqlParser.NamedExpressionSeqContext ctx);
	/**
	 * Exit a parse tree produced by {@link KrystaSqlParser#namedExpressionSeq}.
	 * @param ctx the parse tree
	 */
	void exitNamedExpressionSeq(KrystaSqlParser.NamedExpressionSeqContext ctx);
	/**
	 * Enter a parse tree produced by {@link KrystaSqlParser#sortItem}.
	 * @param ctx the parse tree
	 */
	void enterSortItem(KrystaSqlParser.SortItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link KrystaSqlParser#sortItem}.
	 * @param ctx the parse tree
	 */
	void exitSortItem(KrystaSqlParser.SortItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link KrystaSqlParser#namedWindow}.
	 * @param ctx the parse tree
	 */
	void enterNamedWindow(KrystaSqlParser.NamedWindowContext ctx);
	/**
	 * Exit a parse tree produced by {@link KrystaSqlParser#namedWindow}.
	 * @param ctx the parse tree
	 */
	void exitNamedWindow(KrystaSqlParser.NamedWindowContext ctx);
	/**
	 * Enter a parse tree produced by the {@code windowRef}
	 * labeled alternative in {@link KrystaSqlParser#windowSpec}.
	 * @param ctx the parse tree
	 */
	void enterWindowRef(KrystaSqlParser.WindowRefContext ctx);
	/**
	 * Exit a parse tree produced by the {@code windowRef}
	 * labeled alternative in {@link KrystaSqlParser#windowSpec}.
	 * @param ctx the parse tree
	 */
	void exitWindowRef(KrystaSqlParser.WindowRefContext ctx);
	/**
	 * Enter a parse tree produced by the {@code windowDef}
	 * labeled alternative in {@link KrystaSqlParser#windowSpec}.
	 * @param ctx the parse tree
	 */
	void enterWindowDef(KrystaSqlParser.WindowDefContext ctx);
	/**
	 * Exit a parse tree produced by the {@code windowDef}
	 * labeled alternative in {@link KrystaSqlParser#windowSpec}.
	 * @param ctx the parse tree
	 */
	void exitWindowDef(KrystaSqlParser.WindowDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link KrystaSqlParser#windowFrame}.
	 * @param ctx the parse tree
	 */
	void enterWindowFrame(KrystaSqlParser.WindowFrameContext ctx);
	/**
	 * Exit a parse tree produced by {@link KrystaSqlParser#windowFrame}.
	 * @param ctx the parse tree
	 */
	void exitWindowFrame(KrystaSqlParser.WindowFrameContext ctx);
	/**
	 * Enter a parse tree produced by {@link KrystaSqlParser#frameBound}.
	 * @param ctx the parse tree
	 */
	void enterFrameBound(KrystaSqlParser.FrameBoundContext ctx);
	/**
	 * Exit a parse tree produced by {@link KrystaSqlParser#frameBound}.
	 * @param ctx the parse tree
	 */
	void exitFrameBound(KrystaSqlParser.FrameBoundContext ctx);
	/**
	 * Enter a parse tree produced by {@link KrystaSqlParser#relation}.
	 * @param ctx the parse tree
	 */
	void enterRelation(KrystaSqlParser.RelationContext ctx);
	/**
	 * Exit a parse tree produced by {@link KrystaSqlParser#relation}.
	 * @param ctx the parse tree
	 */
	void exitRelation(KrystaSqlParser.RelationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tableName}
	 * labeled alternative in {@link KrystaSqlParser#relationPrimary}.
	 * @param ctx the parse tree
	 */
	void enterTableName(KrystaSqlParser.TableNameContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tableName}
	 * labeled alternative in {@link KrystaSqlParser#relationPrimary}.
	 * @param ctx the parse tree
	 */
	void exitTableName(KrystaSqlParser.TableNameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code aliasedQuery}
	 * labeled alternative in {@link KrystaSqlParser#relationPrimary}.
	 * @param ctx the parse tree
	 */
	void enterAliasedQuery(KrystaSqlParser.AliasedQueryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code aliasedQuery}
	 * labeled alternative in {@link KrystaSqlParser#relationPrimary}.
	 * @param ctx the parse tree
	 */
	void exitAliasedQuery(KrystaSqlParser.AliasedQueryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code aliasedRelation}
	 * labeled alternative in {@link KrystaSqlParser#relationPrimary}.
	 * @param ctx the parse tree
	 */
	void enterAliasedRelation(KrystaSqlParser.AliasedRelationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code aliasedRelation}
	 * labeled alternative in {@link KrystaSqlParser#relationPrimary}.
	 * @param ctx the parse tree
	 */
	void exitAliasedRelation(KrystaSqlParser.AliasedRelationContext ctx);
	/**
	 * Enter a parse tree produced by {@link KrystaSqlParser#tableAlias}.
	 * @param ctx the parse tree
	 */
	void enterTableAlias(KrystaSqlParser.TableAliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link KrystaSqlParser#tableAlias}.
	 * @param ctx the parse tree
	 */
	void exitTableAlias(KrystaSqlParser.TableAliasContext ctx);
	/**
	 * Enter a parse tree produced by {@link KrystaSqlParser#joinRelation}.
	 * @param ctx the parse tree
	 */
	void enterJoinRelation(KrystaSqlParser.JoinRelationContext ctx);
	/**
	 * Exit a parse tree produced by {@link KrystaSqlParser#joinRelation}.
	 * @param ctx the parse tree
	 */
	void exitJoinRelation(KrystaSqlParser.JoinRelationContext ctx);
	/**
	 * Enter a parse tree produced by {@link KrystaSqlParser#joinType}.
	 * @param ctx the parse tree
	 */
	void enterJoinType(KrystaSqlParser.JoinTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link KrystaSqlParser#joinType}.
	 * @param ctx the parse tree
	 */
	void exitJoinType(KrystaSqlParser.JoinTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link KrystaSqlParser#joinCriteria}.
	 * @param ctx the parse tree
	 */
	void enterJoinCriteria(KrystaSqlParser.JoinCriteriaContext ctx);
	/**
	 * Exit a parse tree produced by {@link KrystaSqlParser#joinCriteria}.
	 * @param ctx the parse tree
	 */
	void exitJoinCriteria(KrystaSqlParser.JoinCriteriaContext ctx);
	/**
	 * Enter a parse tree produced by {@link KrystaSqlParser#createTableClauses}.
	 * @param ctx the parse tree
	 */
	void enterCreateTableClauses(KrystaSqlParser.CreateTableClausesContext ctx);
	/**
	 * Exit a parse tree produced by {@link KrystaSqlParser#createTableClauses}.
	 * @param ctx the parse tree
	 */
	void exitCreateTableClauses(KrystaSqlParser.CreateTableClausesContext ctx);
	/**
	 * Enter a parse tree produced by {@link KrystaSqlParser#tablePropertyList}.
	 * @param ctx the parse tree
	 */
	void enterTablePropertyList(KrystaSqlParser.TablePropertyListContext ctx);
	/**
	 * Exit a parse tree produced by {@link KrystaSqlParser#tablePropertyList}.
	 * @param ctx the parse tree
	 */
	void exitTablePropertyList(KrystaSqlParser.TablePropertyListContext ctx);
	/**
	 * Enter a parse tree produced by {@link KrystaSqlParser#tableProperty}.
	 * @param ctx the parse tree
	 */
	void enterTableProperty(KrystaSqlParser.TablePropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link KrystaSqlParser#tableProperty}.
	 * @param ctx the parse tree
	 */
	void exitTableProperty(KrystaSqlParser.TablePropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link KrystaSqlParser#tablePropertyKey}.
	 * @param ctx the parse tree
	 */
	void enterTablePropertyKey(KrystaSqlParser.TablePropertyKeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link KrystaSqlParser#tablePropertyKey}.
	 * @param ctx the parse tree
	 */
	void exitTablePropertyKey(KrystaSqlParser.TablePropertyKeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link KrystaSqlParser#tablePropertyValue}.
	 * @param ctx the parse tree
	 */
	void enterTablePropertyValue(KrystaSqlParser.TablePropertyValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link KrystaSqlParser#tablePropertyValue}.
	 * @param ctx the parse tree
	 */
	void exitTablePropertyValue(KrystaSqlParser.TablePropertyValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link KrystaSqlParser#namespace}.
	 * @param ctx the parse tree
	 */
	void enterNamespace(KrystaSqlParser.NamespaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link KrystaSqlParser#namespace}.
	 * @param ctx the parse tree
	 */
	void exitNamespace(KrystaSqlParser.NamespaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link KrystaSqlParser#createTableHeader}.
	 * @param ctx the parse tree
	 */
	void enterCreateTableHeader(KrystaSqlParser.CreateTableHeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link KrystaSqlParser#createTableHeader}.
	 * @param ctx the parse tree
	 */
	void exitCreateTableHeader(KrystaSqlParser.CreateTableHeaderContext ctx);
	/**
	 * Enter a parse tree produced by the {@code insertIntoValues}
	 * labeled alternative in {@link KrystaSqlParser#dmlStatementNoWith}.
	 * @param ctx the parse tree
	 */
	void enterInsertIntoValues(KrystaSqlParser.InsertIntoValuesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code insertIntoValues}
	 * labeled alternative in {@link KrystaSqlParser#dmlStatementNoWith}.
	 * @param ctx the parse tree
	 */
	void exitInsertIntoValues(KrystaSqlParser.InsertIntoValuesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code singleInsertQuery}
	 * labeled alternative in {@link KrystaSqlParser#dmlStatementNoWith}.
	 * @param ctx the parse tree
	 */
	void enterSingleInsertQuery(KrystaSqlParser.SingleInsertQueryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code singleInsertQuery}
	 * labeled alternative in {@link KrystaSqlParser#dmlStatementNoWith}.
	 * @param ctx the parse tree
	 */
	void exitSingleInsertQuery(KrystaSqlParser.SingleInsertQueryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multiInsertQuery}
	 * labeled alternative in {@link KrystaSqlParser#dmlStatementNoWith}.
	 * @param ctx the parse tree
	 */
	void enterMultiInsertQuery(KrystaSqlParser.MultiInsertQueryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multiInsertQuery}
	 * labeled alternative in {@link KrystaSqlParser#dmlStatementNoWith}.
	 * @param ctx the parse tree
	 */
	void exitMultiInsertQuery(KrystaSqlParser.MultiInsertQueryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code deleteFromTable}
	 * labeled alternative in {@link KrystaSqlParser#dmlStatementNoWith}.
	 * @param ctx the parse tree
	 */
	void enterDeleteFromTable(KrystaSqlParser.DeleteFromTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code deleteFromTable}
	 * labeled alternative in {@link KrystaSqlParser#dmlStatementNoWith}.
	 * @param ctx the parse tree
	 */
	void exitDeleteFromTable(KrystaSqlParser.DeleteFromTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code updateTable}
	 * labeled alternative in {@link KrystaSqlParser#dmlStatementNoWith}.
	 * @param ctx the parse tree
	 */
	void enterUpdateTable(KrystaSqlParser.UpdateTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code updateTable}
	 * labeled alternative in {@link KrystaSqlParser#dmlStatementNoWith}.
	 * @param ctx the parse tree
	 */
	void exitUpdateTable(KrystaSqlParser.UpdateTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code insertOverwriteTable}
	 * labeled alternative in {@link KrystaSqlParser#insertInto}.
	 * @param ctx the parse tree
	 */
	void enterInsertOverwriteTable(KrystaSqlParser.InsertOverwriteTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code insertOverwriteTable}
	 * labeled alternative in {@link KrystaSqlParser#insertInto}.
	 * @param ctx the parse tree
	 */
	void exitInsertOverwriteTable(KrystaSqlParser.InsertOverwriteTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code insertIntoTable}
	 * labeled alternative in {@link KrystaSqlParser#insertInto}.
	 * @param ctx the parse tree
	 */
	void enterInsertIntoTable(KrystaSqlParser.InsertIntoTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code insertIntoTable}
	 * labeled alternative in {@link KrystaSqlParser#insertInto}.
	 * @param ctx the parse tree
	 */
	void exitInsertIntoTable(KrystaSqlParser.InsertIntoTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code insertOverwriteHiveDir}
	 * labeled alternative in {@link KrystaSqlParser#insertInto}.
	 * @param ctx the parse tree
	 */
	void enterInsertOverwriteHiveDir(KrystaSqlParser.InsertOverwriteHiveDirContext ctx);
	/**
	 * Exit a parse tree produced by the {@code insertOverwriteHiveDir}
	 * labeled alternative in {@link KrystaSqlParser#insertInto}.
	 * @param ctx the parse tree
	 */
	void exitInsertOverwriteHiveDir(KrystaSqlParser.InsertOverwriteHiveDirContext ctx);
	/**
	 * Enter a parse tree produced by the {@code insertOverwriteDir}
	 * labeled alternative in {@link KrystaSqlParser#insertInto}.
	 * @param ctx the parse tree
	 */
	void enterInsertOverwriteDir(KrystaSqlParser.InsertOverwriteDirContext ctx);
	/**
	 * Exit a parse tree produced by the {@code insertOverwriteDir}
	 * labeled alternative in {@link KrystaSqlParser#insertInto}.
	 * @param ctx the parse tree
	 */
	void exitInsertOverwriteDir(KrystaSqlParser.InsertOverwriteDirContext ctx);
	/**
	 * Enter a parse tree produced by {@link KrystaSqlParser#constantList}.
	 * @param ctx the parse tree
	 */
	void enterConstantList(KrystaSqlParser.ConstantListContext ctx);
	/**
	 * Exit a parse tree produced by {@link KrystaSqlParser#constantList}.
	 * @param ctx the parse tree
	 */
	void exitConstantList(KrystaSqlParser.ConstantListContext ctx);
	/**
	 * Enter a parse tree produced by {@link KrystaSqlParser#insertValues}.
	 * @param ctx the parse tree
	 */
	void enterInsertValues(KrystaSqlParser.InsertValuesContext ctx);
	/**
	 * Exit a parse tree produced by {@link KrystaSqlParser#insertValues}.
	 * @param ctx the parse tree
	 */
	void exitInsertValues(KrystaSqlParser.InsertValuesContext ctx);
	/**
	 * Enter a parse tree produced by {@link KrystaSqlParser#partitionSpec}.
	 * @param ctx the parse tree
	 */
	void enterPartitionSpec(KrystaSqlParser.PartitionSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link KrystaSqlParser#partitionSpec}.
	 * @param ctx the parse tree
	 */
	void exitPartitionSpec(KrystaSqlParser.PartitionSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link KrystaSqlParser#partitionVal}.
	 * @param ctx the parse tree
	 */
	void enterPartitionVal(KrystaSqlParser.PartitionValContext ctx);
	/**
	 * Exit a parse tree produced by {@link KrystaSqlParser#partitionVal}.
	 * @param ctx the parse tree
	 */
	void exitPartitionVal(KrystaSqlParser.PartitionValContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rowFormatSerde}
	 * labeled alternative in {@link KrystaSqlParser#rowFormat}.
	 * @param ctx the parse tree
	 */
	void enterRowFormatSerde(KrystaSqlParser.RowFormatSerdeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rowFormatSerde}
	 * labeled alternative in {@link KrystaSqlParser#rowFormat}.
	 * @param ctx the parse tree
	 */
	void exitRowFormatSerde(KrystaSqlParser.RowFormatSerdeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rowFormatDelimited}
	 * labeled alternative in {@link KrystaSqlParser#rowFormat}.
	 * @param ctx the parse tree
	 */
	void enterRowFormatDelimited(KrystaSqlParser.RowFormatDelimitedContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rowFormatDelimited}
	 * labeled alternative in {@link KrystaSqlParser#rowFormat}.
	 * @param ctx the parse tree
	 */
	void exitRowFormatDelimited(KrystaSqlParser.RowFormatDelimitedContext ctx);
	/**
	 * Enter a parse tree produced by {@link KrystaSqlParser#createFileFormat}.
	 * @param ctx the parse tree
	 */
	void enterCreateFileFormat(KrystaSqlParser.CreateFileFormatContext ctx);
	/**
	 * Exit a parse tree produced by {@link KrystaSqlParser#createFileFormat}.
	 * @param ctx the parse tree
	 */
	void exitCreateFileFormat(KrystaSqlParser.CreateFileFormatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tableFileFormat}
	 * labeled alternative in {@link KrystaSqlParser#fileFormat}.
	 * @param ctx the parse tree
	 */
	void enterTableFileFormat(KrystaSqlParser.TableFileFormatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tableFileFormat}
	 * labeled alternative in {@link KrystaSqlParser#fileFormat}.
	 * @param ctx the parse tree
	 */
	void exitTableFileFormat(KrystaSqlParser.TableFileFormatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code genericFileFormat}
	 * labeled alternative in {@link KrystaSqlParser#fileFormat}.
	 * @param ctx the parse tree
	 */
	void enterGenericFileFormat(KrystaSqlParser.GenericFileFormatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code genericFileFormat}
	 * labeled alternative in {@link KrystaSqlParser#fileFormat}.
	 * @param ctx the parse tree
	 */
	void exitGenericFileFormat(KrystaSqlParser.GenericFileFormatContext ctx);
	/**
	 * Enter a parse tree produced by {@link KrystaSqlParser#tableProvider}.
	 * @param ctx the parse tree
	 */
	void enterTableProvider(KrystaSqlParser.TableProviderContext ctx);
	/**
	 * Exit a parse tree produced by {@link KrystaSqlParser#tableProvider}.
	 * @param ctx the parse tree
	 */
	void exitTableProvider(KrystaSqlParser.TableProviderContext ctx);
	/**
	 * Enter a parse tree produced by {@link KrystaSqlParser#storageHandler}.
	 * @param ctx the parse tree
	 */
	void enterStorageHandler(KrystaSqlParser.StorageHandlerContext ctx);
	/**
	 * Exit a parse tree produced by {@link KrystaSqlParser#storageHandler}.
	 * @param ctx the parse tree
	 */
	void exitStorageHandler(KrystaSqlParser.StorageHandlerContext ctx);
	/**
	 * Enter a parse tree produced by {@link KrystaSqlParser#multiInsertQueryBody}.
	 * @param ctx the parse tree
	 */
	void enterMultiInsertQueryBody(KrystaSqlParser.MultiInsertQueryBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link KrystaSqlParser#multiInsertQueryBody}.
	 * @param ctx the parse tree
	 */
	void exitMultiInsertQueryBody(KrystaSqlParser.MultiInsertQueryBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link KrystaSqlParser#describeColName}.
	 * @param ctx the parse tree
	 */
	void enterDescribeColName(KrystaSqlParser.DescribeColNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link KrystaSqlParser#describeColName}.
	 * @param ctx the parse tree
	 */
	void exitDescribeColName(KrystaSqlParser.DescribeColNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link KrystaSqlParser#tableIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterTableIdentifier(KrystaSqlParser.TableIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link KrystaSqlParser#tableIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitTableIdentifier(KrystaSqlParser.TableIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link KrystaSqlParser#colTypeList}.
	 * @param ctx the parse tree
	 */
	void enterColTypeList(KrystaSqlParser.ColTypeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link KrystaSqlParser#colTypeList}.
	 * @param ctx the parse tree
	 */
	void exitColTypeList(KrystaSqlParser.ColTypeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link KrystaSqlParser#colType}.
	 * @param ctx the parse tree
	 */
	void enterColType(KrystaSqlParser.ColTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link KrystaSqlParser#colType}.
	 * @param ctx the parse tree
	 */
	void exitColType(KrystaSqlParser.ColTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link KrystaSqlParser#commentSpec}.
	 * @param ctx the parse tree
	 */
	void enterCommentSpec(KrystaSqlParser.CommentSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link KrystaSqlParser#commentSpec}.
	 * @param ctx the parse tree
	 */
	void exitCommentSpec(KrystaSqlParser.CommentSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link KrystaSqlParser#locationSpec}.
	 * @param ctx the parse tree
	 */
	void enterLocationSpec(KrystaSqlParser.LocationSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link KrystaSqlParser#locationSpec}.
	 * @param ctx the parse tree
	 */
	void exitLocationSpec(KrystaSqlParser.LocationSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link KrystaSqlParser#assignmentList}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentList(KrystaSqlParser.AssignmentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link KrystaSqlParser#assignmentList}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentList(KrystaSqlParser.AssignmentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link KrystaSqlParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(KrystaSqlParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link KrystaSqlParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(KrystaSqlParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link KrystaSqlParser#booleanValue}.
	 * @param ctx the parse tree
	 */
	void enterBooleanValue(KrystaSqlParser.BooleanValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link KrystaSqlParser#booleanValue}.
	 * @param ctx the parse tree
	 */
	void exitBooleanValue(KrystaSqlParser.BooleanValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link KrystaSqlParser#setQuantifier}.
	 * @param ctx the parse tree
	 */
	void enterSetQuantifier(KrystaSqlParser.SetQuantifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link KrystaSqlParser#setQuantifier}.
	 * @param ctx the parse tree
	 */
	void exitSetQuantifier(KrystaSqlParser.SetQuantifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code complexDataType}
	 * labeled alternative in {@link KrystaSqlParser#dataType}.
	 * @param ctx the parse tree
	 */
	void enterComplexDataType(KrystaSqlParser.ComplexDataTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code complexDataType}
	 * labeled alternative in {@link KrystaSqlParser#dataType}.
	 * @param ctx the parse tree
	 */
	void exitComplexDataType(KrystaSqlParser.ComplexDataTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code primitiveDataType}
	 * labeled alternative in {@link KrystaSqlParser#dataType}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveDataType(KrystaSqlParser.PrimitiveDataTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code primitiveDataType}
	 * labeled alternative in {@link KrystaSqlParser#dataType}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveDataType(KrystaSqlParser.PrimitiveDataTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link KrystaSqlParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(KrystaSqlParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link KrystaSqlParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(KrystaSqlParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unquotedIdentifier}
	 * labeled alternative in {@link KrystaSqlParser#strictIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterUnquotedIdentifier(KrystaSqlParser.UnquotedIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unquotedIdentifier}
	 * labeled alternative in {@link KrystaSqlParser#strictIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitUnquotedIdentifier(KrystaSqlParser.UnquotedIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code quotedIdentifierAlternative}
	 * labeled alternative in {@link KrystaSqlParser#strictIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterQuotedIdentifierAlternative(KrystaSqlParser.QuotedIdentifierAlternativeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code quotedIdentifierAlternative}
	 * labeled alternative in {@link KrystaSqlParser#strictIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitQuotedIdentifierAlternative(KrystaSqlParser.QuotedIdentifierAlternativeContext ctx);
	/**
	 * Enter a parse tree produced by {@link KrystaSqlParser#quotedIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterQuotedIdentifier(KrystaSqlParser.QuotedIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link KrystaSqlParser#quotedIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitQuotedIdentifier(KrystaSqlParser.QuotedIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link KrystaSqlParser#identifierList}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierList(KrystaSqlParser.IdentifierListContext ctx);
	/**
	 * Exit a parse tree produced by {@link KrystaSqlParser#identifierList}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierList(KrystaSqlParser.IdentifierListContext ctx);
	/**
	 * Enter a parse tree produced by {@link KrystaSqlParser#identifierSeq}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierSeq(KrystaSqlParser.IdentifierSeqContext ctx);
	/**
	 * Exit a parse tree produced by {@link KrystaSqlParser#identifierSeq}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierSeq(KrystaSqlParser.IdentifierSeqContext ctx);
	/**
	 * Enter a parse tree produced by {@link KrystaSqlParser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedName(KrystaSqlParser.QualifiedNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link KrystaSqlParser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedName(KrystaSqlParser.QualifiedNameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code integerLiteral}
	 * labeled alternative in {@link KrystaSqlParser#number}.
	 * @param ctx the parse tree
	 */
	void enterIntegerLiteral(KrystaSqlParser.IntegerLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code integerLiteral}
	 * labeled alternative in {@link KrystaSqlParser#number}.
	 * @param ctx the parse tree
	 */
	void exitIntegerLiteral(KrystaSqlParser.IntegerLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bigIntLiteral}
	 * labeled alternative in {@link KrystaSqlParser#number}.
	 * @param ctx the parse tree
	 */
	void enterBigIntLiteral(KrystaSqlParser.BigIntLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bigIntLiteral}
	 * labeled alternative in {@link KrystaSqlParser#number}.
	 * @param ctx the parse tree
	 */
	void exitBigIntLiteral(KrystaSqlParser.BigIntLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code smallIntLiteral}
	 * labeled alternative in {@link KrystaSqlParser#number}.
	 * @param ctx the parse tree
	 */
	void enterSmallIntLiteral(KrystaSqlParser.SmallIntLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code smallIntLiteral}
	 * labeled alternative in {@link KrystaSqlParser#number}.
	 * @param ctx the parse tree
	 */
	void exitSmallIntLiteral(KrystaSqlParser.SmallIntLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tinyIntLiteral}
	 * labeled alternative in {@link KrystaSqlParser#number}.
	 * @param ctx the parse tree
	 */
	void enterTinyIntLiteral(KrystaSqlParser.TinyIntLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tinyIntLiteral}
	 * labeled alternative in {@link KrystaSqlParser#number}.
	 * @param ctx the parse tree
	 */
	void exitTinyIntLiteral(KrystaSqlParser.TinyIntLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code doubleLiteral}
	 * labeled alternative in {@link KrystaSqlParser#number}.
	 * @param ctx the parse tree
	 */
	void enterDoubleLiteral(KrystaSqlParser.DoubleLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code doubleLiteral}
	 * labeled alternative in {@link KrystaSqlParser#number}.
	 * @param ctx the parse tree
	 */
	void exitDoubleLiteral(KrystaSqlParser.DoubleLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bigDecimalLiteral}
	 * labeled alternative in {@link KrystaSqlParser#number}.
	 * @param ctx the parse tree
	 */
	void enterBigDecimalLiteral(KrystaSqlParser.BigDecimalLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bigDecimalLiteral}
	 * labeled alternative in {@link KrystaSqlParser#number}.
	 * @param ctx the parse tree
	 */
	void exitBigDecimalLiteral(KrystaSqlParser.BigDecimalLiteralContext ctx);
}