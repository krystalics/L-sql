// Generated from /Users/krysta/study/L-sql/src/main/resources/KrystaSql.g4 by ANTLR 4.9.1
package com.github.krystalics.lsql.compile;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class KrystaSqlParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, ADD=9, 
		AFTER=10, ALL=11, ALTER=12, ANALYZE=13, AND=14, ANTI=15, ANY=16, ARCHIVE=17, 
		ARRAY=18, AS=19, ASC=20, AT=21, AUTHORIZATION=22, BETWEEN=23, BOTH=24, 
		BUCKET=25, BUCKETS=26, BY=27, CACHE=28, CASCADE=29, CASE=30, CAST=31, 
		CHANGE=32, CHECK=33, CLEAR=34, CLUSTER=35, CLUSTERED=36, CODEGEN=37, COLLATE=38, 
		COLLECTION=39, COLUMN=40, COLUMNS=41, COMMENT=42, COMMIT=43, COMPACT=44, 
		COMPACTIONS=45, COMPUTE=46, CONCATENATE=47, CONSTRAINT=48, COST=49, CREATE=50, 
		CROSS=51, CUBE=52, CURRENT=53, CURRENT_DATE=54, CURRENT_TIME=55, CURRENT_TIMESTAMP=56, 
		CURRENT_USER=57, DATA=58, DATABASE=59, DATABASES=60, DBPROPERTIES=61, 
		DEFINED=62, DELETE=63, DELIMITED=64, DESC=65, DESCRIBE=66, DFS=67, DIRECTORIES=68, 
		DIRECTORY=69, DISTINCT=70, DISTRIBUTE=71, DIV=72, DROP=73, ELSE=74, END=75, 
		ESCAPE=76, ESCAPED=77, EXCEPT=78, EXCHANGE=79, EXISTS=80, EXPLAIN=81, 
		EXPORT=82, EXTENDED=83, EXTERNAL=84, EXTRACT=85, FALSE=86, FETCH=87, FIELDS=88, 
		FILTER=89, FILEFORMAT=90, FIRST=91, FOLLOWING=92, FOR=93, FOREIGN=94, 
		FORMAT=95, FORMATTED=96, FROM=97, FULL=98, FUNCTION=99, FUNCTIONS=100, 
		GLOBAL=101, GRANT=102, GROUP=103, GROUPING=104, HAVING=105, IF=106, IGNORE=107, 
		IMPORT=108, IN=109, INDEX=110, INDEXES=111, INNER=112, INPATH=113, INPUTFORMAT=114, 
		INSERT=115, INTERSECT=116, INTERVAL=117, INTO=118, IS=119, ITEMS=120, 
		JOIN=121, KEYS=122, LAST=123, LATERAL=124, LAZY=125, LEADING=126, LEFT=127, 
		LIKE=128, LIMIT=129, LINES=130, LIST=131, LOAD=132, LOCAL=133, LOCATION=134, 
		LOCK=135, LOCKS=136, LOGICAL=137, MACRO=138, MAP=139, MATCHED=140, MERGE=141, 
		MSCK=142, NAMESPACE=143, NAMESPACES=144, NATURAL=145, NO=146, NOT=147, 
		NULL=148, NULLS=149, OF=150, ON=151, ONLY=152, OPTION=153, OPTIONS=154, 
		OR=155, ORDER=156, OUT=157, OUTER=158, OUTPUTFORMAT=159, OVER=160, OVERLAPS=161, 
		OVERLAY=162, OVERWRITE=163, PARTITION=164, PARTITIONED=165, PARTITIONS=166, 
		PERCENTLIT=167, PIVOT=168, PLACING=169, POSITION=170, PRECEDING=171, PRIMARY=172, 
		PRINCIPALS=173, PROPERTIES=174, PURGE=175, QUERY=176, RANGE=177, RECORDREADER=178, 
		RECORDWRITER=179, RECOVER=180, REDUCE=181, REFERENCES=182, REFRESH=183, 
		RENAME=184, REPAIR=185, REPLACE=186, RESET=187, RESTRICT=188, REVOKE=189, 
		RIGHT=190, RLIKE=191, ROLE=192, ROLES=193, ROLLBACK=194, ROLLUP=195, ROW=196, 
		ROWS=197, SCHEMA=198, SELECT=199, SEMI=200, SEPARATED=201, SERDE=202, 
		SERDEPROPERTIES=203, SESSION_USER=204, SET=205, SETMINUS=206, SETS=207, 
		SHOW=208, SKEWED=209, SOME=210, SORT=211, SORTED=212, START=213, STATISTICS=214, 
		STORED=215, STRATIFY=216, STRUCT=217, SUBSTR=218, SUBSTRING=219, TABLE=220, 
		TABLES=221, TABLESAMPLE=222, TBLPROPERTIES=223, TEMPORARY=224, TERMINATED=225, 
		THEN=226, TO=227, TOUCH=228, TRAILING=229, TRANSACTION=230, TRANSACTIONS=231, 
		TRANSFORM=232, TRIM=233, TRUE=234, TRUNCATE=235, TYPE=236, UNARCHIVE=237, 
		UNBOUNDED=238, UNCACHE=239, UNION=240, UNIQUE=241, UNKNOWN=242, UNLOCK=243, 
		UNSET=244, UPDATE=245, USE=246, USER=247, USING=248, VALUES=249, VIEW=250, 
		VIEWS=251, WHEN=252, WHERE=253, WINDOW=254, WITH=255, EQ=256, NSEQ=257, 
		NEQ=258, NEQJ=259, LT=260, LTE=261, GT=262, GTE=263, PLUS=264, MINUS=265, 
		ASTERISK=266, SLASH=267, PERCENT=268, TILDE=269, AMPERSAND=270, PIPE=271, 
		CONCAT_PIPE=272, HAT=273, STRING=274, BIGINT_LITERAL=275, SMALLINT_LITERAL=276, 
		TINYINT_LITERAL=277, INTEGER_VALUE=278, EXPONENT_VALUE=279, DECIMAL_VALUE=280, 
		DOUBLE_LITERAL=281, BIGDECIMAL_LITERAL=282, IDENTIFIER=283, BACKQUOTED_IDENTIFIER=284, 
		SIMPLE_COMMENT=285, BRACKETED_EMPTY_COMMENT=286, BRACKETED_COMMENT=287, 
		WS=288, UNRECOGNIZED=289;
	public static final int
		RULE_singleStatement = 0, RULE_statement = 1, RULE_query = 2, RULE_queryTerm = 3, 
		RULE_queryOrganization = 4, RULE_queryPrimary = 5, RULE_querySpecification = 6, 
		RULE_fromStatement = 7, RULE_fromStatementBody = 8, RULE_selectClause = 9, 
		RULE_whereClause = 10, RULE_aggregationClause = 11, RULE_havingClause = 12, 
		RULE_windowClause = 13, RULE_fromClause = 14, RULE_whenClause = 15, RULE_setClause = 16, 
		RULE_expression = 17, RULE_booleanExpression = 18, RULE_predicate = 19, 
		RULE_valueExpression = 20, RULE_primaryExpression = 21, RULE_constant = 22, 
		RULE_comparisonOperator = 23, RULE_namedExpression = 24, RULE_namedExpressionSeq = 25, 
		RULE_sortItem = 26, RULE_namedWindow = 27, RULE_windowSpec = 28, RULE_windowFrame = 29, 
		RULE_frameBound = 30, RULE_relation = 31, RULE_relationPrimary = 32, RULE_tableAlias = 33, 
		RULE_joinRelation = 34, RULE_joinType = 35, RULE_joinCriteria = 36, RULE_createTableClauses = 37, 
		RULE_tablePropertyList = 38, RULE_tableProperty = 39, RULE_tablePropertyKey = 40, 
		RULE_tablePropertyValue = 41, RULE_namespace = 42, RULE_createTableHeader = 43, 
		RULE_dmlStatementNoWith = 44, RULE_insertInto = 45, RULE_constantList = 46, 
		RULE_insertValues = 47, RULE_partitionSpec = 48, RULE_partitionVal = 49, 
		RULE_rowFormat = 50, RULE_createFileFormat = 51, RULE_fileFormat = 52, 
		RULE_tableProvider = 53, RULE_storageHandler = 54, RULE_multiInsertQueryBody = 55, 
		RULE_describeColName = 56, RULE_tableIdentifier = 57, RULE_colTypeList = 58, 
		RULE_colType = 59, RULE_commentSpec = 60, RULE_locationSpec = 61, RULE_assignmentList = 62, 
		RULE_assignment = 63, RULE_booleanValue = 64, RULE_setQuantifier = 65, 
		RULE_dataType = 66, RULE_identifier = 67, RULE_identifierList = 68, RULE_identifierSeq = 69, 
		RULE_qualifiedName = 70, RULE_number = 71;
	private static String[] makeRuleNames() {
		return new String[] {
			"singleStatement", "statement", "query", "queryTerm", "queryOrganization", 
			"queryPrimary", "querySpecification", "fromStatement", "fromStatementBody", 
			"selectClause", "whereClause", "aggregationClause", "havingClause", "windowClause", 
			"fromClause", "whenClause", "setClause", "expression", "booleanExpression", 
			"predicate", "valueExpression", "primaryExpression", "constant", "comparisonOperator", 
			"namedExpression", "namedExpressionSeq", "sortItem", "namedWindow", "windowSpec", 
			"windowFrame", "frameBound", "relation", "relationPrimary", "tableAlias", 
			"joinRelation", "joinType", "joinCriteria", "createTableClauses", "tablePropertyList", 
			"tableProperty", "tablePropertyKey", "tablePropertyValue", "namespace", 
			"createTableHeader", "dmlStatementNoWith", "insertInto", "constantList", 
			"insertValues", "partitionSpec", "partitionVal", "rowFormat", "createFileFormat", 
			"fileFormat", "tableProvider", "storageHandler", "multiInsertQueryBody", 
			"describeColName", "tableIdentifier", "colTypeList", "colType", "commentSpec", 
			"locationSpec", "assignmentList", "assignment", "booleanValue", "setQuantifier", 
			"dataType", "identifier", "identifierList", "identifierSeq", "qualifiedName", 
			"number"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'('", "')'", "','", "'.'", "'->'", "'['", "']'", "'ADD'", 
			"'AFTER'", "'ALL'", "'ALTER'", "'ANALYZE'", "'AND'", "'ANTI'", "'ANY'", 
			"'ARCHIVE'", "'ARRAY'", "'AS'", "'ASC'", "'AT'", "'AUTHORIZATION'", "'BETWEEN'", 
			"'BOTH'", "'BUCKET'", "'BUCKETS'", "'BY'", "'CACHE'", "'CASCADE'", "'CASE'", 
			"'CAST'", "'CHANGE'", "'CHECK'", "'CLEAR'", "'CLUSTER'", "'CLUSTERED'", 
			"'CODEGEN'", "'COLLATE'", "'COLLECTION'", "'COLUMN'", "'COLUMNS'", "'COMMENT'", 
			"'COMMIT'", "'COMPACT'", "'COMPACTIONS'", "'COMPUTE'", "'CONCATENATE'", 
			"'CONSTRAINT'", "'COST'", "'CREATE'", "'CROSS'", "'CUBE'", "'CURRENT'", 
			"'CURRENT_DATE'", "'CURRENT_TIME'", "'CURRENT_TIMESTAMP'", "'CURRENT_USER'", 
			"'DATA'", "'DATABASE'", null, "'DBPROPERTIES'", "'DEFINED'", "'DELETE'", 
			"'DELIMITED'", "'DESC'", "'DESCRIBE'", "'DFS'", "'DIRECTORIES'", "'DIRECTORY'", 
			"'DISTINCT'", "'DISTRIBUTE'", "'DIV'", "'DROP'", "'ELSE'", "'END'", "'ESCAPE'", 
			"'ESCAPED'", "'EXCEPT'", "'EXCHANGE'", "'EXISTS'", "'EXPLAIN'", "'EXPORT'", 
			"'EXTENDED'", "'EXTERNAL'", "'EXTRACT'", "'FALSE'", "'FETCH'", "'FIELDS'", 
			"'FILTER'", "'FILEFORMAT'", "'FIRST'", "'FOLLOWING'", "'FOR'", "'FOREIGN'", 
			"'FORMAT'", "'FORMATTED'", "'FROM'", "'FULL'", "'FUNCTION'", "'FUNCTIONS'", 
			"'GLOBAL'", "'GRANT'", "'GROUP'", "'GROUPING'", "'HAVING'", "'IF'", "'IGNORE'", 
			"'IMPORT'", "'IN'", "'INDEX'", "'INDEXES'", "'INNER'", "'INPATH'", "'INPUTFORMAT'", 
			"'INSERT'", "'INTERSECT'", "'INTERVAL'", "'INTO'", "'IS'", "'ITEMS'", 
			"'JOIN'", "'KEYS'", "'LAST'", "'LATERAL'", "'LAZY'", "'LEADING'", "'LEFT'", 
			"'LIKE'", "'LIMIT'", "'LINES'", "'LIST'", "'LOAD'", "'LOCAL'", "'LOCATION'", 
			"'LOCK'", "'LOCKS'", "'LOGICAL'", "'MACRO'", "'MAP'", "'MATCHED'", "'MERGE'", 
			"'MSCK'", "'NAMESPACE'", "'NAMESPACES'", "'NATURAL'", "'NO'", null, "'NULL'", 
			"'NULLS'", "'OF'", "'ON'", "'ONLY'", "'OPTION'", "'OPTIONS'", "'OR'", 
			"'ORDER'", "'OUT'", "'OUTER'", "'OUTPUTFORMAT'", "'OVER'", "'OVERLAPS'", 
			"'OVERLAY'", "'OVERWRITE'", "'PARTITION'", "'PARTITIONED'", "'PARTITIONS'", 
			"'PERCENT'", "'PIVOT'", "'PLACING'", "'POSITION'", "'PRECEDING'", "'PRIMARY'", 
			"'PRINCIPALS'", "'PROPERTIES'", "'PURGE'", "'QUERY'", "'RANGE'", "'RECORDREADER'", 
			"'RECORDWRITER'", "'RECOVER'", "'REDUCE'", "'REFERENCES'", "'REFRESH'", 
			"'RENAME'", "'REPAIR'", "'REPLACE'", "'RESET'", "'RESTRICT'", "'REVOKE'", 
			"'RIGHT'", null, "'ROLE'", "'ROLES'", "'ROLLBACK'", "'ROLLUP'", "'ROW'", 
			"'ROWS'", "'SCHEMA'", "'SELECT'", "'SEMI'", "'SEPARATED'", "'SERDE'", 
			"'SERDEPROPERTIES'", "'SESSION_USER'", "'SET'", "'MINUS'", "'SETS'", 
			"'SHOW'", "'SKEWED'", "'SOME'", "'SORT'", "'SORTED'", "'START'", "'STATISTICS'", 
			"'STORED'", "'STRATIFY'", "'STRUCT'", "'SUBSTR'", "'SUBSTRING'", "'TABLE'", 
			"'TABLES'", "'TABLESAMPLE'", "'TBLPROPERTIES'", null, "'TERMINATED'", 
			"'THEN'", "'TO'", "'TOUCH'", "'TRAILING'", "'TRANSACTION'", "'TRANSACTIONS'", 
			"'TRANSFORM'", "'TRIM'", "'TRUE'", "'TRUNCATE'", "'TYPE'", "'UNARCHIVE'", 
			"'UNBOUNDED'", "'UNCACHE'", "'UNION'", "'UNIQUE'", "'UNKNOWN'", "'UNLOCK'", 
			"'UNSET'", "'UPDATE'", "'USE'", "'USER'", "'USING'", "'VALUES'", "'VIEW'", 
			"'VIEWS'", "'WHEN'", "'WHERE'", "'WINDOW'", "'WITH'", null, "'<=>'", 
			"'<>'", "'!='", "'<'", null, "'>'", null, "'+'", "'-'", "'*'", "'/'", 
			"'%'", "'~'", "'&'", "'|'", "'||'", "'^'", null, null, null, null, null, 
			null, null, null, null, null, null, null, "'/**/'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, "ADD", "AFTER", 
			"ALL", "ALTER", "ANALYZE", "AND", "ANTI", "ANY", "ARCHIVE", "ARRAY", 
			"AS", "ASC", "AT", "AUTHORIZATION", "BETWEEN", "BOTH", "BUCKET", "BUCKETS", 
			"BY", "CACHE", "CASCADE", "CASE", "CAST", "CHANGE", "CHECK", "CLEAR", 
			"CLUSTER", "CLUSTERED", "CODEGEN", "COLLATE", "COLLECTION", "COLUMN", 
			"COLUMNS", "COMMENT", "COMMIT", "COMPACT", "COMPACTIONS", "COMPUTE", 
			"CONCATENATE", "CONSTRAINT", "COST", "CREATE", "CROSS", "CUBE", "CURRENT", 
			"CURRENT_DATE", "CURRENT_TIME", "CURRENT_TIMESTAMP", "CURRENT_USER", 
			"DATA", "DATABASE", "DATABASES", "DBPROPERTIES", "DEFINED", "DELETE", 
			"DELIMITED", "DESC", "DESCRIBE", "DFS", "DIRECTORIES", "DIRECTORY", "DISTINCT", 
			"DISTRIBUTE", "DIV", "DROP", "ELSE", "END", "ESCAPE", "ESCAPED", "EXCEPT", 
			"EXCHANGE", "EXISTS", "EXPLAIN", "EXPORT", "EXTENDED", "EXTERNAL", "EXTRACT", 
			"FALSE", "FETCH", "FIELDS", "FILTER", "FILEFORMAT", "FIRST", "FOLLOWING", 
			"FOR", "FOREIGN", "FORMAT", "FORMATTED", "FROM", "FULL", "FUNCTION", 
			"FUNCTIONS", "GLOBAL", "GRANT", "GROUP", "GROUPING", "HAVING", "IF", 
			"IGNORE", "IMPORT", "IN", "INDEX", "INDEXES", "INNER", "INPATH", "INPUTFORMAT", 
			"INSERT", "INTERSECT", "INTERVAL", "INTO", "IS", "ITEMS", "JOIN", "KEYS", 
			"LAST", "LATERAL", "LAZY", "LEADING", "LEFT", "LIKE", "LIMIT", "LINES", 
			"LIST", "LOAD", "LOCAL", "LOCATION", "LOCK", "LOCKS", "LOGICAL", "MACRO", 
			"MAP", "MATCHED", "MERGE", "MSCK", "NAMESPACE", "NAMESPACES", "NATURAL", 
			"NO", "NOT", "NULL", "NULLS", "OF", "ON", "ONLY", "OPTION", "OPTIONS", 
			"OR", "ORDER", "OUT", "OUTER", "OUTPUTFORMAT", "OVER", "OVERLAPS", "OVERLAY", 
			"OVERWRITE", "PARTITION", "PARTITIONED", "PARTITIONS", "PERCENTLIT", 
			"PIVOT", "PLACING", "POSITION", "PRECEDING", "PRIMARY", "PRINCIPALS", 
			"PROPERTIES", "PURGE", "QUERY", "RANGE", "RECORDREADER", "RECORDWRITER", 
			"RECOVER", "REDUCE", "REFERENCES", "REFRESH", "RENAME", "REPAIR", "REPLACE", 
			"RESET", "RESTRICT", "REVOKE", "RIGHT", "RLIKE", "ROLE", "ROLES", "ROLLBACK", 
			"ROLLUP", "ROW", "ROWS", "SCHEMA", "SELECT", "SEMI", "SEPARATED", "SERDE", 
			"SERDEPROPERTIES", "SESSION_USER", "SET", "SETMINUS", "SETS", "SHOW", 
			"SKEWED", "SOME", "SORT", "SORTED", "START", "STATISTICS", "STORED", 
			"STRATIFY", "STRUCT", "SUBSTR", "SUBSTRING", "TABLE", "TABLES", "TABLESAMPLE", 
			"TBLPROPERTIES", "TEMPORARY", "TERMINATED", "THEN", "TO", "TOUCH", "TRAILING", 
			"TRANSACTION", "TRANSACTIONS", "TRANSFORM", "TRIM", "TRUE", "TRUNCATE", 
			"TYPE", "UNARCHIVE", "UNBOUNDED", "UNCACHE", "UNION", "UNIQUE", "UNKNOWN", 
			"UNLOCK", "UNSET", "UPDATE", "USE", "USER", "USING", "VALUES", "VIEW", 
			"VIEWS", "WHEN", "WHERE", "WINDOW", "WITH", "EQ", "NSEQ", "NEQ", "NEQJ", 
			"LT", "LTE", "GT", "GTE", "PLUS", "MINUS", "ASTERISK", "SLASH", "PERCENT", 
			"TILDE", "AMPERSAND", "PIPE", "CONCAT_PIPE", "HAT", "STRING", "BIGINT_LITERAL", 
			"SMALLINT_LITERAL", "TINYINT_LITERAL", "INTEGER_VALUE", "EXPONENT_VALUE", 
			"DECIMAL_VALUE", "DOUBLE_LITERAL", "BIGDECIMAL_LITERAL", "IDENTIFIER", 
			"BACKQUOTED_IDENTIFIER", "SIMPLE_COMMENT", "BRACKETED_EMPTY_COMMENT", 
			"BRACKETED_COMMENT", "WS", "UNRECOGNIZED"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "KrystaSql.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	  /**
	   * Verify whether current token is a valid decimal token (which contains dot).
	   * Returns true if the character that follows the token is not a digit or letter or underscore.
	   *
	   * For example:
	   * For char stream "2.3", "2." is not a valid decimal token, because it is followed by digit '3'.
	   * For char stream "2.3_", "2.3" is not a valid decimal token, because it is followed by '_'.
	   * For char stream "2.3W", "2.3" is not a valid decimal token, because it is followed by 'W'.
	   * For char stream "12.0D 34.E2+0.12 "  12.0D is a valid decimal token because it is followed
	   * by a space. 34.E2 is a valid decimal token because it is followed by symbol '+'
	   * which is not a digit or letter or underscore.
	   */
	  public boolean isValidDecimal() {
	    int nextChar = _input.LA(1);
	    if (nextChar >= 'A' && nextChar <= 'Z' || nextChar >= '0' && nextChar <= '9' ||
	      nextChar == '_') {
	      return false;
	    } else {
	      return true;
	    }
	  }

	public KrystaSqlParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class SingleStatementContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode EOF() { return getToken(KrystaSqlParser.EOF, 0); }
		public SingleStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).enterSingleStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).exitSingleStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KrystaSqlVisitor ) return ((KrystaSqlVisitor<? extends T>)visitor).visitSingleStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleStatementContext singleStatement() throws RecognitionException {
		SingleStatementContext _localctx = new SingleStatementContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_singleStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			statement();
			setState(148);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(145);
				match(T__0);
				}
				}
				setState(150);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(151);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExplainContext extends StatementContext {
		public TerminalNode EXPLAIN() { return getToken(KrystaSqlParser.EXPLAIN, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode LOGICAL() { return getToken(KrystaSqlParser.LOGICAL, 0); }
		public TerminalNode FORMATTED() { return getToken(KrystaSqlParser.FORMATTED, 0); }
		public TerminalNode EXTENDED() { return getToken(KrystaSqlParser.EXTENDED, 0); }
		public TerminalNode CODEGEN() { return getToken(KrystaSqlParser.CODEGEN, 0); }
		public TerminalNode COST() { return getToken(KrystaSqlParser.COST, 0); }
		public ExplainContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).enterExplain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).exitExplain(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KrystaSqlVisitor ) return ((KrystaSqlVisitor<? extends T>)visitor).visitExplain(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CommentNamespaceContext extends StatementContext {
		public Token comment;
		public TerminalNode COMMENT() { return getToken(KrystaSqlParser.COMMENT, 0); }
		public TerminalNode ON() { return getToken(KrystaSqlParser.ON, 0); }
		public NamespaceContext namespace() {
			return getRuleContext(NamespaceContext.class,0);
		}
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TerminalNode IS() { return getToken(KrystaSqlParser.IS, 0); }
		public TerminalNode STRING() { return getToken(KrystaSqlParser.STRING, 0); }
		public TerminalNode NULL() { return getToken(KrystaSqlParser.NULL, 0); }
		public CommentNamespaceContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).enterCommentNamespace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).exitCommentNamespace(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KrystaSqlVisitor ) return ((KrystaSqlVisitor<? extends T>)visitor).visitCommentNamespace(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CreateTableContext extends StatementContext {
		public CreateTableHeaderContext createTableHeader() {
			return getRuleContext(CreateTableHeaderContext.class,0);
		}
		public TableProviderContext tableProvider() {
			return getRuleContext(TableProviderContext.class,0);
		}
		public CreateTableClausesContext createTableClauses() {
			return getRuleContext(CreateTableClausesContext.class,0);
		}
		public ColTypeListContext colTypeList() {
			return getRuleContext(ColTypeListContext.class,0);
		}
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TerminalNode AS() { return getToken(KrystaSqlParser.AS, 0); }
		public CreateTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).enterCreateTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).exitCreateTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KrystaSqlVisitor ) return ((KrystaSqlVisitor<? extends T>)visitor).visitCreateTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DmlStatementContext extends StatementContext {
		public DmlStatementNoWithContext dmlStatementNoWith() {
			return getRuleContext(DmlStatementNoWithContext.class,0);
		}
		public DmlStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).enterDmlStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).exitDmlStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KrystaSqlVisitor ) return ((KrystaSqlVisitor<? extends T>)visitor).visitDmlStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UseContext extends StatementContext {
		public TerminalNode USE() { return getToken(KrystaSqlParser.USE, 0); }
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TerminalNode NAMESPACE() { return getToken(KrystaSqlParser.NAMESPACE, 0); }
		public UseContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).enterUse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).exitUse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KrystaSqlVisitor ) return ((KrystaSqlVisitor<? extends T>)visitor).visitUse(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DropNamespaceContext extends StatementContext {
		public TerminalNode DROP() { return getToken(KrystaSqlParser.DROP, 0); }
		public NamespaceContext namespace() {
			return getRuleContext(NamespaceContext.class,0);
		}
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TerminalNode IF() { return getToken(KrystaSqlParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(KrystaSqlParser.EXISTS, 0); }
		public TerminalNode RESTRICT() { return getToken(KrystaSqlParser.RESTRICT, 0); }
		public TerminalNode CASCADE() { return getToken(KrystaSqlParser.CASCADE, 0); }
		public DropNamespaceContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).enterDropNamespace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).exitDropNamespace(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KrystaSqlVisitor ) return ((KrystaSqlVisitor<? extends T>)visitor).visitDropNamespace(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CreateTableLikeContext extends StatementContext {
		public TableIdentifierContext target;
		public TableIdentifierContext source;
		public TablePropertyListContext tableProps;
		public TerminalNode CREATE() { return getToken(KrystaSqlParser.CREATE, 0); }
		public TerminalNode TABLE() { return getToken(KrystaSqlParser.TABLE, 0); }
		public TerminalNode LIKE() { return getToken(KrystaSqlParser.LIKE, 0); }
		public List<TableIdentifierContext> tableIdentifier() {
			return getRuleContexts(TableIdentifierContext.class);
		}
		public TableIdentifierContext tableIdentifier(int i) {
			return getRuleContext(TableIdentifierContext.class,i);
		}
		public TerminalNode IF() { return getToken(KrystaSqlParser.IF, 0); }
		public TerminalNode NOT() { return getToken(KrystaSqlParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(KrystaSqlParser.EXISTS, 0); }
		public List<TableProviderContext> tableProvider() {
			return getRuleContexts(TableProviderContext.class);
		}
		public TableProviderContext tableProvider(int i) {
			return getRuleContext(TableProviderContext.class,i);
		}
		public List<RowFormatContext> rowFormat() {
			return getRuleContexts(RowFormatContext.class);
		}
		public RowFormatContext rowFormat(int i) {
			return getRuleContext(RowFormatContext.class,i);
		}
		public List<CreateFileFormatContext> createFileFormat() {
			return getRuleContexts(CreateFileFormatContext.class);
		}
		public CreateFileFormatContext createFileFormat(int i) {
			return getRuleContext(CreateFileFormatContext.class,i);
		}
		public List<LocationSpecContext> locationSpec() {
			return getRuleContexts(LocationSpecContext.class);
		}
		public LocationSpecContext locationSpec(int i) {
			return getRuleContext(LocationSpecContext.class,i);
		}
		public List<TerminalNode> TBLPROPERTIES() { return getTokens(KrystaSqlParser.TBLPROPERTIES); }
		public TerminalNode TBLPROPERTIES(int i) {
			return getToken(KrystaSqlParser.TBLPROPERTIES, i);
		}
		public List<TablePropertyListContext> tablePropertyList() {
			return getRuleContexts(TablePropertyListContext.class);
		}
		public TablePropertyListContext tablePropertyList(int i) {
			return getRuleContext(TablePropertyListContext.class,i);
		}
		public CreateTableLikeContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).enterCreateTableLike(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).exitCreateTableLike(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KrystaSqlVisitor ) return ((KrystaSqlVisitor<? extends T>)visitor).visitCreateTableLike(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UncacheTableContext extends StatementContext {
		public TerminalNode UNCACHE() { return getToken(KrystaSqlParser.UNCACHE, 0); }
		public TerminalNode TABLE() { return getToken(KrystaSqlParser.TABLE, 0); }
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TerminalNode IF() { return getToken(KrystaSqlParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(KrystaSqlParser.EXISTS, 0); }
		public UncacheTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).enterUncacheTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).exitUncacheTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KrystaSqlVisitor ) return ((KrystaSqlVisitor<? extends T>)visitor).visitUncacheTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DescribeRelationContext extends StatementContext {
		public Token option;
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TerminalNode DESC() { return getToken(KrystaSqlParser.DESC, 0); }
		public TerminalNode DESCRIBE() { return getToken(KrystaSqlParser.DESCRIBE, 0); }
		public TerminalNode TABLE() { return getToken(KrystaSqlParser.TABLE, 0); }
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public DescribeColNameContext describeColName() {
			return getRuleContext(DescribeColNameContext.class,0);
		}
		public TerminalNode EXTENDED() { return getToken(KrystaSqlParser.EXTENDED, 0); }
		public TerminalNode FORMATTED() { return getToken(KrystaSqlParser.FORMATTED, 0); }
		public DescribeRelationContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).enterDescribeRelation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).exitDescribeRelation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KrystaSqlVisitor ) return ((KrystaSqlVisitor<? extends T>)visitor).visitDescribeRelation(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LoadDataContext extends StatementContext {
		public Token path;
		public TerminalNode LOAD() { return getToken(KrystaSqlParser.LOAD, 0); }
		public TerminalNode DATA() { return getToken(KrystaSqlParser.DATA, 0); }
		public TerminalNode INPATH() { return getToken(KrystaSqlParser.INPATH, 0); }
		public TerminalNode INTO() { return getToken(KrystaSqlParser.INTO, 0); }
		public TerminalNode TABLE() { return getToken(KrystaSqlParser.TABLE, 0); }
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TerminalNode STRING() { return getToken(KrystaSqlParser.STRING, 0); }
		public TerminalNode LOCAL() { return getToken(KrystaSqlParser.LOCAL, 0); }
		public TerminalNode OVERWRITE() { return getToken(KrystaSqlParser.OVERWRITE, 0); }
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public LoadDataContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).enterLoadData(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).exitLoadData(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KrystaSqlVisitor ) return ((KrystaSqlVisitor<? extends T>)visitor).visitLoadData(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowPartitionsContext extends StatementContext {
		public TerminalNode SHOW() { return getToken(KrystaSqlParser.SHOW, 0); }
		public TerminalNode PARTITIONS() { return getToken(KrystaSqlParser.PARTITIONS, 0); }
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public ShowPartitionsContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).enterShowPartitions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).exitShowPartitions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KrystaSqlVisitor ) return ((KrystaSqlVisitor<? extends T>)visitor).visitShowPartitions(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ClearCacheContext extends StatementContext {
		public TerminalNode CLEAR() { return getToken(KrystaSqlParser.CLEAR, 0); }
		public TerminalNode CACHE() { return getToken(KrystaSqlParser.CACHE, 0); }
		public ClearCacheContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).enterClearCache(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).exitClearCache(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KrystaSqlVisitor ) return ((KrystaSqlVisitor<? extends T>)visitor).visitClearCache(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowTablesContext extends StatementContext {
		public Token pattern;
		public TerminalNode SHOW() { return getToken(KrystaSqlParser.SHOW, 0); }
		public TerminalNode TABLES() { return getToken(KrystaSqlParser.TABLES, 0); }
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TerminalNode FROM() { return getToken(KrystaSqlParser.FROM, 0); }
		public TerminalNode IN() { return getToken(KrystaSqlParser.IN, 0); }
		public TerminalNode STRING() { return getToken(KrystaSqlParser.STRING, 0); }
		public TerminalNode LIKE() { return getToken(KrystaSqlParser.LIKE, 0); }
		public ShowTablesContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).enterShowTables(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).exitShowTables(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KrystaSqlVisitor ) return ((KrystaSqlVisitor<? extends T>)visitor).visitShowTables(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowCurrentNamespaceContext extends StatementContext {
		public TerminalNode SHOW() { return getToken(KrystaSqlParser.SHOW, 0); }
		public TerminalNode CURRENT() { return getToken(KrystaSqlParser.CURRENT, 0); }
		public TerminalNode NAMESPACE() { return getToken(KrystaSqlParser.NAMESPACE, 0); }
		public ShowCurrentNamespaceContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).enterShowCurrentNamespace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).exitShowCurrentNamespace(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KrystaSqlVisitor ) return ((KrystaSqlVisitor<? extends T>)visitor).visitShowCurrentNamespace(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StatementDefaultContext extends StatementContext {
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public StatementDefaultContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).enterStatementDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).exitStatementDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KrystaSqlVisitor ) return ((KrystaSqlVisitor<? extends T>)visitor).visitStatementDefault(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RepairTableContext extends StatementContext {
		public TerminalNode MSCK() { return getToken(KrystaSqlParser.MSCK, 0); }
		public TerminalNode REPAIR() { return getToken(KrystaSqlParser.REPAIR, 0); }
		public TerminalNode TABLE() { return getToken(KrystaSqlParser.TABLE, 0); }
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public RepairTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).enterRepairTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).exitRepairTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KrystaSqlVisitor ) return ((KrystaSqlVisitor<? extends T>)visitor).visitRepairTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RefreshResourceContext extends StatementContext {
		public TerminalNode REFRESH() { return getToken(KrystaSqlParser.REFRESH, 0); }
		public TerminalNode STRING() { return getToken(KrystaSqlParser.STRING, 0); }
		public RefreshResourceContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).enterRefreshResource(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).exitRefreshResource(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KrystaSqlVisitor ) return ((KrystaSqlVisitor<? extends T>)visitor).visitRefreshResource(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DescribeQueryContext extends StatementContext {
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TerminalNode DESC() { return getToken(KrystaSqlParser.DESC, 0); }
		public TerminalNode DESCRIBE() { return getToken(KrystaSqlParser.DESCRIBE, 0); }
		public TerminalNode QUERY() { return getToken(KrystaSqlParser.QUERY, 0); }
		public DescribeQueryContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).enterDescribeQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).exitDescribeQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KrystaSqlVisitor ) return ((KrystaSqlVisitor<? extends T>)visitor).visitDescribeQuery(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TruncateTableContext extends StatementContext {
		public TerminalNode TRUNCATE() { return getToken(KrystaSqlParser.TRUNCATE, 0); }
		public TerminalNode TABLE() { return getToken(KrystaSqlParser.TABLE, 0); }
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public TruncateTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).enterTruncateTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).exitTruncateTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KrystaSqlVisitor ) return ((KrystaSqlVisitor<? extends T>)visitor).visitTruncateTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowCreateTableContext extends StatementContext {
		public TerminalNode SHOW() { return getToken(KrystaSqlParser.SHOW, 0); }
		public TerminalNode CREATE() { return getToken(KrystaSqlParser.CREATE, 0); }
		public TerminalNode TABLE() { return getToken(KrystaSqlParser.TABLE, 0); }
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TerminalNode AS() { return getToken(KrystaSqlParser.AS, 0); }
		public TerminalNode SERDE() { return getToken(KrystaSqlParser.SERDE, 0); }
		public ShowCreateTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).enterShowCreateTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).exitShowCreateTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KrystaSqlVisitor ) return ((KrystaSqlVisitor<? extends T>)visitor).visitShowCreateTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowNamespacesContext extends StatementContext {
		public Token pattern;
		public TerminalNode SHOW() { return getToken(KrystaSqlParser.SHOW, 0); }
		public TerminalNode DATABASES() { return getToken(KrystaSqlParser.DATABASES, 0); }
		public TerminalNode NAMESPACES() { return getToken(KrystaSqlParser.NAMESPACES, 0); }
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TerminalNode FROM() { return getToken(KrystaSqlParser.FROM, 0); }
		public TerminalNode IN() { return getToken(KrystaSqlParser.IN, 0); }
		public TerminalNode STRING() { return getToken(KrystaSqlParser.STRING, 0); }
		public TerminalNode LIKE() { return getToken(KrystaSqlParser.LIKE, 0); }
		public ShowNamespacesContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).enterShowNamespaces(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).exitShowNamespaces(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KrystaSqlVisitor ) return ((KrystaSqlVisitor<? extends T>)visitor).visitShowNamespaces(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DropTableContext extends StatementContext {
		public TerminalNode DROP() { return getToken(KrystaSqlParser.DROP, 0); }
		public TerminalNode TABLE() { return getToken(KrystaSqlParser.TABLE, 0); }
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TerminalNode IF() { return getToken(KrystaSqlParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(KrystaSqlParser.EXISTS, 0); }
		public TerminalNode PURGE() { return getToken(KrystaSqlParser.PURGE, 0); }
		public DropTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).enterDropTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).exitDropTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KrystaSqlVisitor ) return ((KrystaSqlVisitor<? extends T>)visitor).visitDropTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowColumnsContext extends StatementContext {
		public IdentifierListContext table;
		public IdentifierListContext ns;
		public TerminalNode SHOW() { return getToken(KrystaSqlParser.SHOW, 0); }
		public TerminalNode COLUMNS() { return getToken(KrystaSqlParser.COLUMNS, 0); }
		public List<TerminalNode> FROM() { return getTokens(KrystaSqlParser.FROM); }
		public TerminalNode FROM(int i) {
			return getToken(KrystaSqlParser.FROM, i);
		}
		public List<TerminalNode> IN() { return getTokens(KrystaSqlParser.IN); }
		public TerminalNode IN(int i) {
			return getToken(KrystaSqlParser.IN, i);
		}
		public List<IdentifierListContext> identifierList() {
			return getRuleContexts(IdentifierListContext.class);
		}
		public IdentifierListContext identifierList(int i) {
			return getRuleContext(IdentifierListContext.class,i);
		}
		public ShowColumnsContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).enterShowColumns(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).exitShowColumns(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KrystaSqlVisitor ) return ((KrystaSqlVisitor<? extends T>)visitor).visitShowColumns(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DescribeNamespaceContext extends StatementContext {
		public NamespaceContext namespace() {
			return getRuleContext(NamespaceContext.class,0);
		}
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TerminalNode DESC() { return getToken(KrystaSqlParser.DESC, 0); }
		public TerminalNode DESCRIBE() { return getToken(KrystaSqlParser.DESCRIBE, 0); }
		public TerminalNode EXTENDED() { return getToken(KrystaSqlParser.EXTENDED, 0); }
		public DescribeNamespaceContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).enterDescribeNamespace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).exitDescribeNamespace(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KrystaSqlVisitor ) return ((KrystaSqlVisitor<? extends T>)visitor).visitDescribeNamespace(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CommentTableContext extends StatementContext {
		public Token comment;
		public TerminalNode COMMENT() { return getToken(KrystaSqlParser.COMMENT, 0); }
		public TerminalNode ON() { return getToken(KrystaSqlParser.ON, 0); }
		public TerminalNode TABLE() { return getToken(KrystaSqlParser.TABLE, 0); }
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TerminalNode IS() { return getToken(KrystaSqlParser.IS, 0); }
		public TerminalNode STRING() { return getToken(KrystaSqlParser.STRING, 0); }
		public TerminalNode NULL() { return getToken(KrystaSqlParser.NULL, 0); }
		public CommentTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).enterCommentTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).exitCommentTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KrystaSqlVisitor ) return ((KrystaSqlVisitor<? extends T>)visitor).visitCommentTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SetNamespaceLocationContext extends StatementContext {
		public TerminalNode ALTER() { return getToken(KrystaSqlParser.ALTER, 0); }
		public NamespaceContext namespace() {
			return getRuleContext(NamespaceContext.class,0);
		}
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TerminalNode SET() { return getToken(KrystaSqlParser.SET, 0); }
		public LocationSpecContext locationSpec() {
			return getRuleContext(LocationSpecContext.class,0);
		}
		public SetNamespaceLocationContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).enterSetNamespaceLocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).exitSetNamespaceLocation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KrystaSqlVisitor ) return ((KrystaSqlVisitor<? extends T>)visitor).visitSetNamespaceLocation(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RefreshTableContext extends StatementContext {
		public TerminalNode REFRESH() { return getToken(KrystaSqlParser.REFRESH, 0); }
		public TerminalNode TABLE() { return getToken(KrystaSqlParser.TABLE, 0); }
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public RefreshTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).enterRefreshTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).exitRefreshTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KrystaSqlVisitor ) return ((KrystaSqlVisitor<? extends T>)visitor).visitRefreshTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CreateNamespaceContext extends StatementContext {
		public TerminalNode CREATE() { return getToken(KrystaSqlParser.CREATE, 0); }
		public NamespaceContext namespace() {
			return getRuleContext(NamespaceContext.class,0);
		}
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TerminalNode IF() { return getToken(KrystaSqlParser.IF, 0); }
		public TerminalNode NOT() { return getToken(KrystaSqlParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(KrystaSqlParser.EXISTS, 0); }
		public List<CommentSpecContext> commentSpec() {
			return getRuleContexts(CommentSpecContext.class);
		}
		public CommentSpecContext commentSpec(int i) {
			return getRuleContext(CommentSpecContext.class,i);
		}
		public List<LocationSpecContext> locationSpec() {
			return getRuleContexts(LocationSpecContext.class);
		}
		public LocationSpecContext locationSpec(int i) {
			return getRuleContext(LocationSpecContext.class,i);
		}
		public List<TerminalNode> WITH() { return getTokens(KrystaSqlParser.WITH); }
		public TerminalNode WITH(int i) {
			return getToken(KrystaSqlParser.WITH, i);
		}
		public List<TablePropertyListContext> tablePropertyList() {
			return getRuleContexts(TablePropertyListContext.class);
		}
		public TablePropertyListContext tablePropertyList(int i) {
			return getRuleContext(TablePropertyListContext.class,i);
		}
		public List<TerminalNode> DBPROPERTIES() { return getTokens(KrystaSqlParser.DBPROPERTIES); }
		public TerminalNode DBPROPERTIES(int i) {
			return getToken(KrystaSqlParser.DBPROPERTIES, i);
		}
		public List<TerminalNode> PROPERTIES() { return getTokens(KrystaSqlParser.PROPERTIES); }
		public TerminalNode PROPERTIES(int i) {
			return getToken(KrystaSqlParser.PROPERTIES, i);
		}
		public CreateNamespaceContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).enterCreateNamespace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).exitCreateNamespace(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KrystaSqlVisitor ) return ((KrystaSqlVisitor<? extends T>)visitor).visitCreateNamespace(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SetNamespacePropertiesContext extends StatementContext {
		public TerminalNode ALTER() { return getToken(KrystaSqlParser.ALTER, 0); }
		public NamespaceContext namespace() {
			return getRuleContext(NamespaceContext.class,0);
		}
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TerminalNode SET() { return getToken(KrystaSqlParser.SET, 0); }
		public TablePropertyListContext tablePropertyList() {
			return getRuleContext(TablePropertyListContext.class,0);
		}
		public TerminalNode DBPROPERTIES() { return getToken(KrystaSqlParser.DBPROPERTIES, 0); }
		public TerminalNode PROPERTIES() { return getToken(KrystaSqlParser.PROPERTIES, 0); }
		public SetNamespacePropertiesContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).enterSetNamespaceProperties(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).exitSetNamespaceProperties(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KrystaSqlVisitor ) return ((KrystaSqlVisitor<? extends T>)visitor).visitSetNamespaceProperties(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ManageResourceContext extends StatementContext {
		public Token op;
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode ADD() { return getToken(KrystaSqlParser.ADD, 0); }
		public TerminalNode LIST() { return getToken(KrystaSqlParser.LIST, 0); }
		public TerminalNode STRING() { return getToken(KrystaSqlParser.STRING, 0); }
		public ManageResourceContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).enterManageResource(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).exitManageResource(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KrystaSqlVisitor ) return ((KrystaSqlVisitor<? extends T>)visitor).visitManageResource(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowTblPropertiesContext extends StatementContext {
		public IdentifierListContext table;
		public TablePropertyKeyContext key;
		public TerminalNode SHOW() { return getToken(KrystaSqlParser.SHOW, 0); }
		public TerminalNode TBLPROPERTIES() { return getToken(KrystaSqlParser.TBLPROPERTIES, 0); }
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TablePropertyKeyContext tablePropertyKey() {
			return getRuleContext(TablePropertyKeyContext.class,0);
		}
		public ShowTblPropertiesContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).enterShowTblProperties(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).exitShowTblProperties(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KrystaSqlVisitor ) return ((KrystaSqlVisitor<? extends T>)visitor).visitShowTblProperties(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AnalyzeContext extends StatementContext {
		public TerminalNode ANALYZE() { return getToken(KrystaSqlParser.ANALYZE, 0); }
		public TerminalNode TABLE() { return getToken(KrystaSqlParser.TABLE, 0); }
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TerminalNode COMPUTE() { return getToken(KrystaSqlParser.COMPUTE, 0); }
		public TerminalNode STATISTICS() { return getToken(KrystaSqlParser.STATISTICS, 0); }
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode FOR() { return getToken(KrystaSqlParser.FOR, 0); }
		public TerminalNode COLUMNS() { return getToken(KrystaSqlParser.COLUMNS, 0); }
		public IdentifierSeqContext identifierSeq() {
			return getRuleContext(IdentifierSeqContext.class,0);
		}
		public TerminalNode ALL() { return getToken(KrystaSqlParser.ALL, 0); }
		public AnalyzeContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).enterAnalyze(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).exitAnalyze(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KrystaSqlVisitor ) return ((KrystaSqlVisitor<? extends T>)visitor).visitAnalyze(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CreateHiveTableContext extends StatementContext {
		public ColTypeListContext columns;
		public ColTypeListContext partitionColumns;
		public IdentifierListContext partitionColumnNames;
		public TablePropertyListContext tableProps;
		public CreateTableHeaderContext createTableHeader() {
			return getRuleContext(CreateTableHeaderContext.class,0);
		}
		public List<CommentSpecContext> commentSpec() {
			return getRuleContexts(CommentSpecContext.class);
		}
		public CommentSpecContext commentSpec(int i) {
			return getRuleContext(CommentSpecContext.class,i);
		}
		public List<RowFormatContext> rowFormat() {
			return getRuleContexts(RowFormatContext.class);
		}
		public RowFormatContext rowFormat(int i) {
			return getRuleContext(RowFormatContext.class,i);
		}
		public List<CreateFileFormatContext> createFileFormat() {
			return getRuleContexts(CreateFileFormatContext.class);
		}
		public CreateFileFormatContext createFileFormat(int i) {
			return getRuleContext(CreateFileFormatContext.class,i);
		}
		public List<LocationSpecContext> locationSpec() {
			return getRuleContexts(LocationSpecContext.class);
		}
		public LocationSpecContext locationSpec(int i) {
			return getRuleContext(LocationSpecContext.class,i);
		}
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public List<ColTypeListContext> colTypeList() {
			return getRuleContexts(ColTypeListContext.class);
		}
		public ColTypeListContext colTypeList(int i) {
			return getRuleContext(ColTypeListContext.class,i);
		}
		public List<TerminalNode> PARTITIONED() { return getTokens(KrystaSqlParser.PARTITIONED); }
		public TerminalNode PARTITIONED(int i) {
			return getToken(KrystaSqlParser.PARTITIONED, i);
		}
		public List<TerminalNode> BY() { return getTokens(KrystaSqlParser.BY); }
		public TerminalNode BY(int i) {
			return getToken(KrystaSqlParser.BY, i);
		}
		public List<TerminalNode> TBLPROPERTIES() { return getTokens(KrystaSqlParser.TBLPROPERTIES); }
		public TerminalNode TBLPROPERTIES(int i) {
			return getToken(KrystaSqlParser.TBLPROPERTIES, i);
		}
		public List<IdentifierListContext> identifierList() {
			return getRuleContexts(IdentifierListContext.class);
		}
		public IdentifierListContext identifierList(int i) {
			return getRuleContext(IdentifierListContext.class,i);
		}
		public List<TablePropertyListContext> tablePropertyList() {
			return getRuleContexts(TablePropertyListContext.class);
		}
		public TablePropertyListContext tablePropertyList(int i) {
			return getRuleContext(TablePropertyListContext.class,i);
		}
		public TerminalNode AS() { return getToken(KrystaSqlParser.AS, 0); }
		public CreateHiveTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).enterCreateHiveTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).exitCreateHiveTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KrystaSqlVisitor ) return ((KrystaSqlVisitor<? extends T>)visitor).visitCreateHiveTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowTableContext extends StatementContext {
		public IdentifierListContext ns;
		public Token pattern;
		public TerminalNode SHOW() { return getToken(KrystaSqlParser.SHOW, 0); }
		public TerminalNode TABLE() { return getToken(KrystaSqlParser.TABLE, 0); }
		public TerminalNode EXTENDED() { return getToken(KrystaSqlParser.EXTENDED, 0); }
		public TerminalNode LIKE() { return getToken(KrystaSqlParser.LIKE, 0); }
		public TerminalNode STRING() { return getToken(KrystaSqlParser.STRING, 0); }
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public TerminalNode FROM() { return getToken(KrystaSqlParser.FROM, 0); }
		public TerminalNode IN() { return getToken(KrystaSqlParser.IN, 0); }
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public ShowTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).enterShowTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).exitShowTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KrystaSqlVisitor ) return ((KrystaSqlVisitor<? extends T>)visitor).visitShowTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CacheTableContext extends StatementContext {
		public TablePropertyListContext options;
		public TerminalNode CACHE() { return getToken(KrystaSqlParser.CACHE, 0); }
		public TerminalNode TABLE() { return getToken(KrystaSqlParser.TABLE, 0); }
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TerminalNode LAZY() { return getToken(KrystaSqlParser.LAZY, 0); }
		public TerminalNode OPTIONS() { return getToken(KrystaSqlParser.OPTIONS, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TablePropertyListContext tablePropertyList() {
			return getRuleContext(TablePropertyListContext.class,0);
		}
		public TerminalNode AS() { return getToken(KrystaSqlParser.AS, 0); }
		public CacheTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).enterCacheTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).exitCacheTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KrystaSqlVisitor ) return ((KrystaSqlVisitor<? extends T>)visitor).visitCacheTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		int _la;
		try {
			int _alt;
			setState(489);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				_localctx = new StatementDefaultContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(153);
				query();
				}
				break;
			case 2:
				_localctx = new DmlStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(154);
				dmlStatementNoWith();
				}
				break;
			case 3:
				_localctx = new UseContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(155);
				match(USE);
				setState(157);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NAMESPACE) {
					{
					setState(156);
					match(NAMESPACE);
					}
				}

				setState(159);
				identifierList();
				}
				break;
			case 4:
				_localctx = new CreateNamespaceContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(160);
				match(CREATE);
				setState(161);
				namespace();
				setState(165);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IF) {
					{
					setState(162);
					match(IF);
					setState(163);
					match(NOT);
					setState(164);
					match(EXISTS);
					}
				}

				setState(167);
				identifierList();
				setState(175);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMENT || _la==LOCATION || _la==WITH) {
					{
					setState(173);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case COMMENT:
						{
						setState(168);
						commentSpec();
						}
						break;
					case LOCATION:
						{
						setState(169);
						locationSpec();
						}
						break;
					case WITH:
						{
						{
						setState(170);
						match(WITH);
						setState(171);
						_la = _input.LA(1);
						if ( !(_la==DBPROPERTIES || _la==PROPERTIES) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(172);
						tablePropertyList();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(177);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 5:
				_localctx = new SetNamespacePropertiesContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(178);
				match(ALTER);
				setState(179);
				namespace();
				setState(180);
				identifierList();
				setState(181);
				match(SET);
				setState(182);
				_la = _input.LA(1);
				if ( !(_la==DBPROPERTIES || _la==PROPERTIES) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(183);
				tablePropertyList();
				}
				break;
			case 6:
				_localctx = new SetNamespaceLocationContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(185);
				match(ALTER);
				setState(186);
				namespace();
				setState(187);
				identifierList();
				setState(188);
				match(SET);
				setState(189);
				locationSpec();
				}
				break;
			case 7:
				_localctx = new DropNamespaceContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(191);
				match(DROP);
				setState(192);
				namespace();
				setState(195);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IF) {
					{
					setState(193);
					match(IF);
					setState(194);
					match(EXISTS);
					}
				}

				setState(197);
				identifierList();
				setState(199);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CASCADE || _la==RESTRICT) {
					{
					setState(198);
					_la = _input.LA(1);
					if ( !(_la==CASCADE || _la==RESTRICT) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				}
				break;
			case 8:
				_localctx = new ShowNamespacesContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(201);
				match(SHOW);
				setState(202);
				_la = _input.LA(1);
				if ( !(_la==DATABASES || _la==NAMESPACES) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(205);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FROM || _la==IN) {
					{
					setState(203);
					_la = _input.LA(1);
					if ( !(_la==FROM || _la==IN) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(204);
					identifierList();
					}
				}

				setState(211);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LIKE || _la==STRING) {
					{
					setState(208);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LIKE) {
						{
						setState(207);
						match(LIKE);
						}
					}

					setState(210);
					((ShowNamespacesContext)_localctx).pattern = match(STRING);
					}
				}

				}
				break;
			case 9:
				_localctx = new CreateTableContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(213);
				createTableHeader();
				setState(218);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(214);
					match(T__1);
					setState(215);
					colTypeList();
					setState(216);
					match(T__2);
					}
				}

				setState(220);
				tableProvider();
				setState(221);
				createTableClauses();
				setState(226);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1 || _la==AS || _la==FROM || _la==SELECT || _la==TABLE) {
					{
					setState(223);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AS) {
						{
						setState(222);
						match(AS);
						}
					}

					setState(225);
					query();
					}
				}

				}
				break;
			case 10:
				_localctx = new CreateHiveTableContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(228);
				createTableHeader();
				setState(233);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
				case 1:
					{
					setState(229);
					match(T__1);
					setState(230);
					((CreateHiveTableContext)_localctx).columns = colTypeList();
					setState(231);
					match(T__2);
					}
					break;
				}
				setState(254);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMENT || ((((_la - 134)) & ~0x3f) == 0 && ((1L << (_la - 134)) & ((1L << (LOCATION - 134)) | (1L << (PARTITIONED - 134)) | (1L << (ROW - 134)))) != 0) || _la==STORED || _la==TBLPROPERTIES) {
					{
					setState(252);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case COMMENT:
						{
						setState(235);
						commentSpec();
						}
						break;
					case PARTITIONED:
						{
						setState(245);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
						case 1:
							{
							setState(236);
							match(PARTITIONED);
							setState(237);
							match(BY);
							setState(238);
							match(T__1);
							setState(239);
							((CreateHiveTableContext)_localctx).partitionColumns = colTypeList();
							setState(240);
							match(T__2);
							}
							break;
						case 2:
							{
							setState(242);
							match(PARTITIONED);
							setState(243);
							match(BY);
							setState(244);
							((CreateHiveTableContext)_localctx).partitionColumnNames = identifierList();
							}
							break;
						}
						}
						break;
					case ROW:
						{
						setState(247);
						rowFormat();
						}
						break;
					case STORED:
						{
						setState(248);
						createFileFormat();
						}
						break;
					case LOCATION:
						{
						setState(249);
						locationSpec();
						}
						break;
					case TBLPROPERTIES:
						{
						{
						setState(250);
						match(TBLPROPERTIES);
						setState(251);
						((CreateHiveTableContext)_localctx).tableProps = tablePropertyList();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(256);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(261);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1 || _la==AS || _la==FROM || _la==SELECT || _la==TABLE) {
					{
					setState(258);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AS) {
						{
						setState(257);
						match(AS);
						}
					}

					setState(260);
					query();
					}
				}

				}
				break;
			case 11:
				_localctx = new CreateTableLikeContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(263);
				match(CREATE);
				setState(264);
				match(TABLE);
				setState(268);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IF) {
					{
					setState(265);
					match(IF);
					setState(266);
					match(NOT);
					setState(267);
					match(EXISTS);
					}
				}

				setState(270);
				((CreateTableLikeContext)_localctx).target = tableIdentifier();
				setState(271);
				match(LIKE);
				setState(272);
				((CreateTableLikeContext)_localctx).source = tableIdentifier();
				setState(281);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LOCATION || _la==ROW || ((((_la - 215)) & ~0x3f) == 0 && ((1L << (_la - 215)) & ((1L << (STORED - 215)) | (1L << (TBLPROPERTIES - 215)) | (1L << (USING - 215)))) != 0)) {
					{
					setState(279);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case USING:
						{
						setState(273);
						tableProvider();
						}
						break;
					case ROW:
						{
						setState(274);
						rowFormat();
						}
						break;
					case STORED:
						{
						setState(275);
						createFileFormat();
						}
						break;
					case LOCATION:
						{
						setState(276);
						locationSpec();
						}
						break;
					case TBLPROPERTIES:
						{
						{
						setState(277);
						match(TBLPROPERTIES);
						setState(278);
						((CreateTableLikeContext)_localctx).tableProps = tablePropertyList();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(283);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 12:
				_localctx = new AnalyzeContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(284);
				match(ANALYZE);
				setState(285);
				match(TABLE);
				setState(286);
				identifierList();
				setState(288);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(287);
					partitionSpec();
					}
				}

				setState(290);
				match(COMPUTE);
				setState(291);
				match(STATISTICS);
				setState(299);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
				case 1:
					{
					setState(292);
					identifier();
					}
					break;
				case 2:
					{
					setState(293);
					match(FOR);
					setState(294);
					match(COLUMNS);
					setState(295);
					identifierSeq();
					}
					break;
				case 3:
					{
					setState(296);
					match(FOR);
					setState(297);
					match(ALL);
					setState(298);
					match(COLUMNS);
					}
					break;
				}
				}
				break;
			case 13:
				_localctx = new DropTableContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(301);
				match(DROP);
				setState(302);
				match(TABLE);
				setState(305);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IF) {
					{
					setState(303);
					match(IF);
					setState(304);
					match(EXISTS);
					}
				}

				setState(307);
				identifierList();
				setState(309);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PURGE) {
					{
					setState(308);
					match(PURGE);
					}
				}

				}
				break;
			case 14:
				_localctx = new ExplainContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(311);
				match(EXPLAIN);
				setState(313);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CODEGEN || _la==COST || ((((_la - 83)) & ~0x3f) == 0 && ((1L << (_la - 83)) & ((1L << (EXTENDED - 83)) | (1L << (FORMATTED - 83)) | (1L << (LOGICAL - 83)))) != 0)) {
					{
					setState(312);
					_la = _input.LA(1);
					if ( !(_la==CODEGEN || _la==COST || ((((_la - 83)) & ~0x3f) == 0 && ((1L << (_la - 83)) & ((1L << (EXTENDED - 83)) | (1L << (FORMATTED - 83)) | (1L << (LOGICAL - 83)))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(315);
				statement();
				}
				break;
			case 15:
				_localctx = new ShowTablesContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(316);
				match(SHOW);
				setState(317);
				match(TABLES);
				setState(320);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FROM || _la==IN) {
					{
					setState(318);
					_la = _input.LA(1);
					if ( !(_la==FROM || _la==IN) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(319);
					identifierList();
					}
				}

				setState(326);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LIKE || _la==STRING) {
					{
					setState(323);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LIKE) {
						{
						setState(322);
						match(LIKE);
						}
					}

					setState(325);
					((ShowTablesContext)_localctx).pattern = match(STRING);
					}
				}

				}
				break;
			case 16:
				_localctx = new ShowTableContext(_localctx);
				enterOuterAlt(_localctx, 16);
				{
				setState(328);
				match(SHOW);
				setState(329);
				match(TABLE);
				setState(330);
				match(EXTENDED);
				setState(333);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FROM || _la==IN) {
					{
					setState(331);
					_la = _input.LA(1);
					if ( !(_la==FROM || _la==IN) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(332);
					((ShowTableContext)_localctx).ns = identifierList();
					}
				}

				setState(335);
				match(LIKE);
				setState(336);
				((ShowTableContext)_localctx).pattern = match(STRING);
				setState(338);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(337);
					partitionSpec();
					}
				}

				}
				break;
			case 17:
				_localctx = new ShowTblPropertiesContext(_localctx);
				enterOuterAlt(_localctx, 17);
				{
				setState(340);
				match(SHOW);
				setState(341);
				match(TBLPROPERTIES);
				setState(342);
				((ShowTblPropertiesContext)_localctx).table = identifierList();
				setState(347);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(343);
					match(T__1);
					setState(344);
					((ShowTblPropertiesContext)_localctx).key = tablePropertyKey();
					setState(345);
					match(T__2);
					}
				}

				}
				break;
			case 18:
				_localctx = new ShowColumnsContext(_localctx);
				enterOuterAlt(_localctx, 18);
				{
				setState(349);
				match(SHOW);
				setState(350);
				match(COLUMNS);
				setState(351);
				_la = _input.LA(1);
				if ( !(_la==FROM || _la==IN) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(352);
				((ShowColumnsContext)_localctx).table = identifierList();
				setState(355);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FROM || _la==IN) {
					{
					setState(353);
					_la = _input.LA(1);
					if ( !(_la==FROM || _la==IN) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(354);
					((ShowColumnsContext)_localctx).ns = identifierList();
					}
				}

				}
				break;
			case 19:
				_localctx = new ShowPartitionsContext(_localctx);
				enterOuterAlt(_localctx, 19);
				{
				setState(357);
				match(SHOW);
				setState(358);
				match(PARTITIONS);
				setState(359);
				identifierList();
				setState(361);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(360);
					partitionSpec();
					}
				}

				}
				break;
			case 20:
				_localctx = new ShowCreateTableContext(_localctx);
				enterOuterAlt(_localctx, 20);
				{
				setState(363);
				match(SHOW);
				setState(364);
				match(CREATE);
				setState(365);
				match(TABLE);
				setState(366);
				identifierList();
				setState(369);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(367);
					match(AS);
					setState(368);
					match(SERDE);
					}
				}

				}
				break;
			case 21:
				_localctx = new ShowCurrentNamespaceContext(_localctx);
				enterOuterAlt(_localctx, 21);
				{
				setState(371);
				match(SHOW);
				setState(372);
				match(CURRENT);
				setState(373);
				match(NAMESPACE);
				}
				break;
			case 22:
				_localctx = new DescribeNamespaceContext(_localctx);
				enterOuterAlt(_localctx, 22);
				{
				setState(374);
				_la = _input.LA(1);
				if ( !(_la==DESC || _la==DESCRIBE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(375);
				namespace();
				setState(377);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EXTENDED) {
					{
					setState(376);
					match(EXTENDED);
					}
				}

				setState(379);
				identifierList();
				}
				break;
			case 23:
				_localctx = new DescribeRelationContext(_localctx);
				enterOuterAlt(_localctx, 23);
				{
				setState(381);
				_la = _input.LA(1);
				if ( !(_la==DESC || _la==DESCRIBE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(383);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TABLE) {
					{
					setState(382);
					match(TABLE);
					}
				}

				setState(386);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EXTENDED || _la==FORMATTED) {
					{
					setState(385);
					((DescribeRelationContext)_localctx).option = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==EXTENDED || _la==FORMATTED) ) {
						((DescribeRelationContext)_localctx).option = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(388);
				identifierList();
				setState(390);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(389);
					partitionSpec();
					}
				}

				setState(393);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IDENTIFIER || _la==BACKQUOTED_IDENTIFIER) {
					{
					setState(392);
					describeColName();
					}
				}

				}
				break;
			case 24:
				_localctx = new DescribeQueryContext(_localctx);
				enterOuterAlt(_localctx, 24);
				{
				setState(395);
				_la = _input.LA(1);
				if ( !(_la==DESC || _la==DESCRIBE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(397);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==QUERY) {
					{
					setState(396);
					match(QUERY);
					}
				}

				setState(399);
				query();
				}
				break;
			case 25:
				_localctx = new CommentNamespaceContext(_localctx);
				enterOuterAlt(_localctx, 25);
				{
				setState(400);
				match(COMMENT);
				setState(401);
				match(ON);
				setState(402);
				namespace();
				setState(403);
				identifierList();
				setState(404);
				match(IS);
				setState(405);
				((CommentNamespaceContext)_localctx).comment = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==NULL || _la==STRING) ) {
					((CommentNamespaceContext)_localctx).comment = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 26:
				_localctx = new CommentTableContext(_localctx);
				enterOuterAlt(_localctx, 26);
				{
				setState(407);
				match(COMMENT);
				setState(408);
				match(ON);
				setState(409);
				match(TABLE);
				setState(410);
				identifierList();
				setState(411);
				match(IS);
				setState(412);
				((CommentTableContext)_localctx).comment = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==NULL || _la==STRING) ) {
					((CommentTableContext)_localctx).comment = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 27:
				_localctx = new RefreshTableContext(_localctx);
				enterOuterAlt(_localctx, 27);
				{
				setState(414);
				match(REFRESH);
				setState(415);
				match(TABLE);
				setState(416);
				identifierList();
				}
				break;
			case 28:
				_localctx = new RefreshResourceContext(_localctx);
				enterOuterAlt(_localctx, 28);
				{
				setState(417);
				match(REFRESH);
				setState(425);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
				case 1:
					{
					setState(418);
					match(STRING);
					}
					break;
				case 2:
					{
					setState(422);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
					while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1+1 ) {
							{
							{
							setState(419);
							matchWildcard();
							}
							} 
						}
						setState(424);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
					}
					}
					break;
				}
				}
				break;
			case 29:
				_localctx = new CacheTableContext(_localctx);
				enterOuterAlt(_localctx, 29);
				{
				setState(427);
				match(CACHE);
				setState(429);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LAZY) {
					{
					setState(428);
					match(LAZY);
					}
				}

				setState(431);
				match(TABLE);
				setState(432);
				identifierList();
				setState(435);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPTIONS) {
					{
					setState(433);
					match(OPTIONS);
					setState(434);
					((CacheTableContext)_localctx).options = tablePropertyList();
					}
				}

				setState(441);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1 || _la==AS || _la==FROM || _la==SELECT || _la==TABLE) {
					{
					setState(438);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AS) {
						{
						setState(437);
						match(AS);
						}
					}

					setState(440);
					query();
					}
				}

				}
				break;
			case 30:
				_localctx = new UncacheTableContext(_localctx);
				enterOuterAlt(_localctx, 30);
				{
				setState(443);
				match(UNCACHE);
				setState(444);
				match(TABLE);
				setState(447);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IF) {
					{
					setState(445);
					match(IF);
					setState(446);
					match(EXISTS);
					}
				}

				setState(449);
				identifierList();
				}
				break;
			case 31:
				_localctx = new ClearCacheContext(_localctx);
				enterOuterAlt(_localctx, 31);
				{
				setState(450);
				match(CLEAR);
				setState(451);
				match(CACHE);
				}
				break;
			case 32:
				_localctx = new LoadDataContext(_localctx);
				enterOuterAlt(_localctx, 32);
				{
				setState(452);
				match(LOAD);
				setState(453);
				match(DATA);
				setState(455);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LOCAL) {
					{
					setState(454);
					match(LOCAL);
					}
				}

				setState(457);
				match(INPATH);
				setState(458);
				((LoadDataContext)_localctx).path = match(STRING);
				setState(460);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OVERWRITE) {
					{
					setState(459);
					match(OVERWRITE);
					}
				}

				setState(462);
				match(INTO);
				setState(463);
				match(TABLE);
				setState(464);
				identifierList();
				setState(466);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(465);
					partitionSpec();
					}
				}

				}
				break;
			case 33:
				_localctx = new TruncateTableContext(_localctx);
				enterOuterAlt(_localctx, 33);
				{
				setState(468);
				match(TRUNCATE);
				setState(469);
				match(TABLE);
				setState(470);
				identifierList();
				setState(472);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(471);
					partitionSpec();
					}
				}

				}
				break;
			case 34:
				_localctx = new RepairTableContext(_localctx);
				enterOuterAlt(_localctx, 34);
				{
				setState(474);
				match(MSCK);
				setState(475);
				match(REPAIR);
				setState(476);
				match(TABLE);
				setState(477);
				identifierList();
				}
				break;
			case 35:
				_localctx = new ManageResourceContext(_localctx);
				enterOuterAlt(_localctx, 35);
				{
				setState(478);
				((ManageResourceContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ADD || _la==LIST) ) {
					((ManageResourceContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(479);
				identifier();
				setState(487);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
				case 1:
					{
					setState(480);
					match(STRING);
					}
					break;
				case 2:
					{
					setState(484);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
					while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1+1 ) {
							{
							{
							setState(481);
							matchWildcard();
							}
							} 
						}
						setState(486);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
					}
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QueryContext extends ParserRuleContext {
		public QueryTermContext queryTerm() {
			return getRuleContext(QueryTermContext.class,0);
		}
		public QueryOrganizationContext queryOrganization() {
			return getRuleContext(QueryOrganizationContext.class,0);
		}
		public QueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).enterQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).exitQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KrystaSqlVisitor ) return ((KrystaSqlVisitor<? extends T>)visitor).visitQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryContext query() throws RecognitionException {
		QueryContext _localctx = new QueryContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_query);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(491);
			queryTerm();
			setState(492);
			queryOrganization();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QueryTermContext extends ParserRuleContext {
		public QueryTermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_queryTerm; }
	 
		public QueryTermContext() { }
		public void copyFrom(QueryTermContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class QueryTermDefaultContext extends QueryTermContext {
		public QueryPrimaryContext queryPrimary() {
			return getRuleContext(QueryPrimaryContext.class,0);
		}
		public QueryTermDefaultContext(QueryTermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).enterQueryTermDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).exitQueryTermDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KrystaSqlVisitor ) return ((KrystaSqlVisitor<? extends T>)visitor).visitQueryTermDefault(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryTermContext queryTerm() throws RecognitionException {
		QueryTermContext _localctx = new QueryTermContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_queryTerm);
		try {
			_localctx = new QueryTermDefaultContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(494);
			queryPrimary();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QueryOrganizationContext extends ParserRuleContext {
		public SortItemContext sortItem;
		public List<SortItemContext> order = new ArrayList<SortItemContext>();
		public ExpressionContext limit;
		public TerminalNode ORDER() { return getToken(KrystaSqlParser.ORDER, 0); }
		public TerminalNode BY() { return getToken(KrystaSqlParser.BY, 0); }
		public WindowClauseContext windowClause() {
			return getRuleContext(WindowClauseContext.class,0);
		}
		public TerminalNode LIMIT() { return getToken(KrystaSqlParser.LIMIT, 0); }
		public List<SortItemContext> sortItem() {
			return getRuleContexts(SortItemContext.class);
		}
		public SortItemContext sortItem(int i) {
			return getRuleContext(SortItemContext.class,i);
		}
		public TerminalNode ALL() { return getToken(KrystaSqlParser.ALL, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public QueryOrganizationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_queryOrganization; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).enterQueryOrganization(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).exitQueryOrganization(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KrystaSqlVisitor ) return ((KrystaSqlVisitor<? extends T>)visitor).visitQueryOrganization(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryOrganizationContext queryOrganization() throws RecognitionException {
		QueryOrganizationContext _localctx = new QueryOrganizationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_queryOrganization);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(506);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				{
				setState(496);
				match(ORDER);
				setState(497);
				match(BY);
				setState(498);
				((QueryOrganizationContext)_localctx).sortItem = sortItem();
				((QueryOrganizationContext)_localctx).order.add(((QueryOrganizationContext)_localctx).sortItem);
				setState(503);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(499);
					match(T__3);
					setState(500);
					((QueryOrganizationContext)_localctx).sortItem = sortItem();
					((QueryOrganizationContext)_localctx).order.add(((QueryOrganizationContext)_localctx).sortItem);
					}
					}
					setState(505);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(509);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
			case 1:
				{
				setState(508);
				windowClause();
				}
				break;
			}
			setState(516);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
			case 1:
				{
				setState(511);
				match(LIMIT);
				setState(514);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ALL:
					{
					setState(512);
					match(ALL);
					}
					break;
				case T__1:
				case CASE:
				case CAST:
				case CURRENT_DATE:
				case CURRENT_TIMESTAMP:
				case EXISTS:
				case EXTRACT:
				case FALSE:
				case FIRST:
				case LAST:
				case NOT:
				case NULL:
				case OVERLAY:
				case POSITION:
				case STRUCT:
				case SUBSTR:
				case SUBSTRING:
				case TRIM:
				case TRUE:
				case PLUS:
				case MINUS:
				case ASTERISK:
				case TILDE:
				case STRING:
				case BIGINT_LITERAL:
				case SMALLINT_LITERAL:
				case TINYINT_LITERAL:
				case INTEGER_VALUE:
				case DOUBLE_LITERAL:
				case BIGDECIMAL_LITERAL:
				case IDENTIFIER:
				case BACKQUOTED_IDENTIFIER:
					{
					setState(513);
					((QueryOrganizationContext)_localctx).limit = expression();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QueryPrimaryContext extends ParserRuleContext {
		public QueryPrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_queryPrimary; }
	 
		public QueryPrimaryContext() { }
		public void copyFrom(QueryPrimaryContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SubqueryContext extends QueryPrimaryContext {
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public SubqueryContext(QueryPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).enterSubquery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).exitSubquery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KrystaSqlVisitor ) return ((KrystaSqlVisitor<? extends T>)visitor).visitSubquery(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class QueryPrimaryDefaultContext extends QueryPrimaryContext {
		public QuerySpecificationContext querySpecification() {
			return getRuleContext(QuerySpecificationContext.class,0);
		}
		public QueryPrimaryDefaultContext(QueryPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).enterQueryPrimaryDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).exitQueryPrimaryDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KrystaSqlVisitor ) return ((KrystaSqlVisitor<? extends T>)visitor).visitQueryPrimaryDefault(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FromStmtContext extends QueryPrimaryContext {
		public FromStatementContext fromStatement() {
			return getRuleContext(FromStatementContext.class,0);
		}
		public FromStmtContext(QueryPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).enterFromStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).exitFromStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KrystaSqlVisitor ) return ((KrystaSqlVisitor<? extends T>)visitor).visitFromStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TableContext extends QueryPrimaryContext {
		public TerminalNode TABLE() { return getToken(KrystaSqlParser.TABLE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TableContext(QueryPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).enterTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).exitTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KrystaSqlVisitor ) return ((KrystaSqlVisitor<? extends T>)visitor).visitTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryPrimaryContext queryPrimary() throws RecognitionException {
		QueryPrimaryContext _localctx = new QueryPrimaryContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_queryPrimary);
		try {
			setState(526);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELECT:
				_localctx = new QueryPrimaryDefaultContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(518);
				querySpecification();
				}
				break;
			case FROM:
				_localctx = new FromStmtContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(519);
				fromStatement();
				}
				break;
			case TABLE:
				_localctx = new TableContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(520);
				match(TABLE);
				setState(521);
				identifier();
				}
				break;
			case T__1:
				_localctx = new SubqueryContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(522);
				match(T__1);
				setState(523);
				query();
				setState(524);
				match(T__2);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QuerySpecificationContext extends ParserRuleContext {
		public QuerySpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_querySpecification; }
	 
		public QuerySpecificationContext() { }
		public void copyFrom(QuerySpecificationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class RegularQuerySpecificationContext extends QuerySpecificationContext {
		public SelectClauseContext selectClause() {
			return getRuleContext(SelectClauseContext.class,0);
		}
		public FromClauseContext fromClause() {
			return getRuleContext(FromClauseContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public AggregationClauseContext aggregationClause() {
			return getRuleContext(AggregationClauseContext.class,0);
		}
		public HavingClauseContext havingClause() {
			return getRuleContext(HavingClauseContext.class,0);
		}
		public WindowClauseContext windowClause() {
			return getRuleContext(WindowClauseContext.class,0);
		}
		public RegularQuerySpecificationContext(QuerySpecificationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).enterRegularQuerySpecification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).exitRegularQuerySpecification(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KrystaSqlVisitor ) return ((KrystaSqlVisitor<? extends T>)visitor).visitRegularQuerySpecification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QuerySpecificationContext querySpecification() throws RecognitionException {
		QuerySpecificationContext _localctx = new QuerySpecificationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_querySpecification);
		int _la;
		try {
			_localctx = new RegularQuerySpecificationContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(528);
			selectClause();
			setState(530);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FROM) {
				{
				setState(529);
				fromClause();
				}
			}

			setState(533);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(532);
				whereClause();
				}
			}

			setState(536);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==GROUP) {
				{
				setState(535);
				aggregationClause();
				}
			}

			setState(539);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==HAVING) {
				{
				setState(538);
				havingClause();
				}
			}

			setState(542);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
			case 1:
				{
				setState(541);
				windowClause();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FromStatementContext extends ParserRuleContext {
		public FromClauseContext fromClause() {
			return getRuleContext(FromClauseContext.class,0);
		}
		public List<FromStatementBodyContext> fromStatementBody() {
			return getRuleContexts(FromStatementBodyContext.class);
		}
		public FromStatementBodyContext fromStatementBody(int i) {
			return getRuleContext(FromStatementBodyContext.class,i);
		}
		public FromStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fromStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).enterFromStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).exitFromStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KrystaSqlVisitor ) return ((KrystaSqlVisitor<? extends T>)visitor).visitFromStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FromStatementContext fromStatement() throws RecognitionException {
		FromStatementContext _localctx = new FromStatementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_fromStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(544);
			fromClause();
			setState(546); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(545);
				fromStatementBody();
				}
				}
				setState(548); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SELECT );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FromStatementBodyContext extends ParserRuleContext {
		public SelectClauseContext selectClause() {
			return getRuleContext(SelectClauseContext.class,0);
		}
		public QueryOrganizationContext queryOrganization() {
			return getRuleContext(QueryOrganizationContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public AggregationClauseContext aggregationClause() {
			return getRuleContext(AggregationClauseContext.class,0);
		}
		public HavingClauseContext havingClause() {
			return getRuleContext(HavingClauseContext.class,0);
		}
		public WindowClauseContext windowClause() {
			return getRuleContext(WindowClauseContext.class,0);
		}
		public FromStatementBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fromStatementBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).enterFromStatementBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).exitFromStatementBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KrystaSqlVisitor ) return ((KrystaSqlVisitor<? extends T>)visitor).visitFromStatementBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FromStatementBodyContext fromStatementBody() throws RecognitionException {
		FromStatementBodyContext _localctx = new FromStatementBodyContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_fromStatementBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(550);
			selectClause();
			setState(552);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(551);
				whereClause();
				}
			}

			setState(555);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==GROUP) {
				{
				setState(554);
				aggregationClause();
				}
			}

			setState(558);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==HAVING) {
				{
				setState(557);
				havingClause();
				}
			}

			setState(561);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
			case 1:
				{
				setState(560);
				windowClause();
				}
				break;
			}
			setState(563);
			queryOrganization();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelectClauseContext extends ParserRuleContext {
		public TerminalNode SELECT() { return getToken(KrystaSqlParser.SELECT, 0); }
		public NamedExpressionSeqContext namedExpressionSeq() {
			return getRuleContext(NamedExpressionSeqContext.class,0);
		}
		public SetQuantifierContext setQuantifier() {
			return getRuleContext(SetQuantifierContext.class,0);
		}
		public SelectClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).enterSelectClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).exitSelectClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KrystaSqlVisitor ) return ((KrystaSqlVisitor<? extends T>)visitor).visitSelectClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectClauseContext selectClause() throws RecognitionException {
		SelectClauseContext _localctx = new SelectClauseContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_selectClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(565);
			match(SELECT);
			setState(567);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ALL || _la==DISTINCT) {
				{
				setState(566);
				setQuantifier();
				}
			}

			setState(569);
			namedExpressionSeq();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhereClauseContext extends ParserRuleContext {
		public TerminalNode WHERE() { return getToken(KrystaSqlParser.WHERE, 0); }
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public WhereClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whereClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).enterWhereClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).exitWhereClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KrystaSqlVisitor ) return ((KrystaSqlVisitor<? extends T>)visitor).visitWhereClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhereClauseContext whereClause() throws RecognitionException {
		WhereClauseContext _localctx = new WhereClauseContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_whereClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(571);
			match(WHERE);
			setState(572);
			booleanExpression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AggregationClauseContext extends ParserRuleContext {
		public ExpressionContext expression;
		public List<ExpressionContext> groupingExpressions = new ArrayList<ExpressionContext>();
		public TerminalNode GROUP() { return getToken(KrystaSqlParser.GROUP, 0); }
		public TerminalNode BY() { return getToken(KrystaSqlParser.BY, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public AggregationClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aggregationClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).enterAggregationClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).exitAggregationClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KrystaSqlVisitor ) return ((KrystaSqlVisitor<? extends T>)visitor).visitAggregationClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AggregationClauseContext aggregationClause() throws RecognitionException {
		AggregationClauseContext _localctx = new AggregationClauseContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_aggregationClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(574);
			match(GROUP);
			setState(575);
			match(BY);
			setState(576);
			((AggregationClauseContext)_localctx).expression = expression();
			((AggregationClauseContext)_localctx).groupingExpressions.add(((AggregationClauseContext)_localctx).expression);
			setState(581);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(577);
				match(T__3);
				setState(578);
				((AggregationClauseContext)_localctx).expression = expression();
				((AggregationClauseContext)_localctx).groupingExpressions.add(((AggregationClauseContext)_localctx).expression);
				}
				}
				setState(583);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HavingClauseContext extends ParserRuleContext {
		public TerminalNode HAVING() { return getToken(KrystaSqlParser.HAVING, 0); }
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public HavingClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_havingClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).enterHavingClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).exitHavingClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KrystaSqlVisitor ) return ((KrystaSqlVisitor<? extends T>)visitor).visitHavingClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HavingClauseContext havingClause() throws RecognitionException {
		HavingClauseContext _localctx = new HavingClauseContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_havingClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(584);
			match(HAVING);
			setState(585);
			booleanExpression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WindowClauseContext extends ParserRuleContext {
		public TerminalNode WINDOW() { return getToken(KrystaSqlParser.WINDOW, 0); }
		public List<NamedWindowContext> namedWindow() {
			return getRuleContexts(NamedWindowContext.class);
		}
		public NamedWindowContext namedWindow(int i) {
			return getRuleContext(NamedWindowContext.class,i);
		}
		public WindowClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_windowClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).enterWindowClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).exitWindowClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KrystaSqlVisitor ) return ((KrystaSqlVisitor<? extends T>)visitor).visitWindowClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WindowClauseContext windowClause() throws RecognitionException {
		WindowClauseContext _localctx = new WindowClauseContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_windowClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(587);
			match(WINDOW);
			setState(588);
			namedWindow();
			setState(593);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(589);
				match(T__3);
				setState(590);
				namedWindow();
				}
				}
				setState(595);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FromClauseContext extends ParserRuleContext {
		public TerminalNode FROM() { return getToken(KrystaSqlParser.FROM, 0); }
		public List<RelationContext> relation() {
			return getRuleContexts(RelationContext.class);
		}
		public RelationContext relation(int i) {
			return getRuleContext(RelationContext.class,i);
		}
		public FromClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fromClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).enterFromClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).exitFromClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KrystaSqlVisitor ) return ((KrystaSqlVisitor<? extends T>)visitor).visitFromClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FromClauseContext fromClause() throws RecognitionException {
		FromClauseContext _localctx = new FromClauseContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_fromClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(596);
			match(FROM);
			setState(597);
			relation();
			setState(602);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(598);
				match(T__3);
				setState(599);
				relation();
				}
				}
				setState(604);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhenClauseContext extends ParserRuleContext {
		public ExpressionContext condition;
		public ExpressionContext result;
		public TerminalNode WHEN() { return getToken(KrystaSqlParser.WHEN, 0); }
		public TerminalNode THEN() { return getToken(KrystaSqlParser.THEN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public WhenClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whenClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).enterWhenClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).exitWhenClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KrystaSqlVisitor ) return ((KrystaSqlVisitor<? extends T>)visitor).visitWhenClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhenClauseContext whenClause() throws RecognitionException {
		WhenClauseContext _localctx = new WhenClauseContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_whenClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(605);
			match(WHEN);
			setState(606);
			((WhenClauseContext)_localctx).condition = expression();
			setState(607);
			match(THEN);
			setState(608);
			((WhenClauseContext)_localctx).result = expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SetClauseContext extends ParserRuleContext {
		public TerminalNode SET() { return getToken(KrystaSqlParser.SET, 0); }
		public AssignmentListContext assignmentList() {
			return getRuleContext(AssignmentListContext.class,0);
		}
		public SetClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).enterSetClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).exitSetClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KrystaSqlVisitor ) return ((KrystaSqlVisitor<? extends T>)visitor).visitSetClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetClauseContext setClause() throws RecognitionException {
		SetClauseContext _localctx = new SetClauseContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_setClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(610);
			match(SET);
			setState(611);
			assignmentList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KrystaSqlVisitor ) return ((KrystaSqlVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(613);
			booleanExpression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BooleanExpressionContext extends ParserRuleContext {
		public BooleanExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanExpression; }
	 
		public BooleanExpressionContext() { }
		public void copyFrom(BooleanExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LogicalNotContext extends BooleanExpressionContext {
		public TerminalNode NOT() { return getToken(KrystaSqlParser.NOT, 0); }
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public LogicalNotContext(BooleanExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).enterLogicalNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).exitLogicalNot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KrystaSqlVisitor ) return ((KrystaSqlVisitor<? extends T>)visitor).visitLogicalNot(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PredicatedContext extends BooleanExpressionContext {
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public PredicateContext predicate() {
			return getRuleContext(PredicateContext.class,0);
		}
		public PredicatedContext(BooleanExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).enterPredicated(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).exitPredicated(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KrystaSqlVisitor ) return ((KrystaSqlVisitor<? extends T>)visitor).visitPredicated(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExistsContext extends BooleanExpressionContext {
		public TerminalNode EXISTS() { return getToken(KrystaSqlParser.EXISTS, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public ExistsContext(BooleanExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).enterExists(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).exitExists(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KrystaSqlVisitor ) return ((KrystaSqlVisitor<? extends T>)visitor).visitExists(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LogicalBinaryContext extends BooleanExpressionContext {
		public BooleanExpressionContext left;
		public Token operator;
		public BooleanExpressionContext right;
		public List<BooleanExpressionContext> booleanExpression() {
			return getRuleContexts(BooleanExpressionContext.class);
		}
		public BooleanExpressionContext booleanExpression(int i) {
			return getRuleContext(BooleanExpressionContext.class,i);
		}
		public TerminalNode AND() { return getToken(KrystaSqlParser.AND, 0); }
		public TerminalNode OR() { return getToken(KrystaSqlParser.OR, 0); }
		public LogicalBinaryContext(BooleanExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).enterLogicalBinary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).exitLogicalBinary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KrystaSqlVisitor ) return ((KrystaSqlVisitor<? extends T>)visitor).visitLogicalBinary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanExpressionContext booleanExpression() throws RecognitionException {
		return booleanExpression(0);
	}

	private BooleanExpressionContext booleanExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BooleanExpressionContext _localctx = new BooleanExpressionContext(_ctx, _parentState);
		BooleanExpressionContext _prevctx = _localctx;
		int _startState = 36;
		enterRecursionRule(_localctx, 36, RULE_booleanExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(627);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOT:
				{
				_localctx = new LogicalNotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(616);
				match(NOT);
				setState(617);
				booleanExpression(5);
				}
				break;
			case EXISTS:
				{
				_localctx = new ExistsContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(618);
				match(EXISTS);
				setState(619);
				match(T__1);
				setState(620);
				query();
				setState(621);
				match(T__2);
				}
				break;
			case T__1:
			case CASE:
			case CAST:
			case CURRENT_DATE:
			case CURRENT_TIMESTAMP:
			case EXTRACT:
			case FALSE:
			case FIRST:
			case LAST:
			case NULL:
			case OVERLAY:
			case POSITION:
			case STRUCT:
			case SUBSTR:
			case SUBSTRING:
			case TRIM:
			case TRUE:
			case PLUS:
			case MINUS:
			case ASTERISK:
			case TILDE:
			case STRING:
			case BIGINT_LITERAL:
			case SMALLINT_LITERAL:
			case TINYINT_LITERAL:
			case INTEGER_VALUE:
			case DOUBLE_LITERAL:
			case BIGDECIMAL_LITERAL:
			case IDENTIFIER:
			case BACKQUOTED_IDENTIFIER:
				{
				_localctx = new PredicatedContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(623);
				valueExpression(0);
				setState(625);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
				case 1:
					{
					setState(624);
					predicate();
					}
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(637);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,79,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(635);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
					case 1:
						{
						_localctx = new LogicalBinaryContext(new BooleanExpressionContext(_parentctx, _parentState));
						((LogicalBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_booleanExpression);
						setState(629);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(630);
						((LogicalBinaryContext)_localctx).operator = match(AND);
						setState(631);
						((LogicalBinaryContext)_localctx).right = booleanExpression(3);
						}
						break;
					case 2:
						{
						_localctx = new LogicalBinaryContext(new BooleanExpressionContext(_parentctx, _parentState));
						((LogicalBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_booleanExpression);
						setState(632);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(633);
						((LogicalBinaryContext)_localctx).operator = match(OR);
						setState(634);
						((LogicalBinaryContext)_localctx).right = booleanExpression(2);
						}
						break;
					}
					} 
				}
				setState(639);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,79,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class PredicateContext extends ParserRuleContext {
		public Token kind;
		public ValueExpressionContext lower;
		public ValueExpressionContext upper;
		public ValueExpressionContext pattern;
		public Token escapeChar;
		public ValueExpressionContext right;
		public TerminalNode AND() { return getToken(KrystaSqlParser.AND, 0); }
		public TerminalNode BETWEEN() { return getToken(KrystaSqlParser.BETWEEN, 0); }
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public TerminalNode NOT() { return getToken(KrystaSqlParser.NOT, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode IN() { return getToken(KrystaSqlParser.IN, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TerminalNode RLIKE() { return getToken(KrystaSqlParser.RLIKE, 0); }
		public TerminalNode LIKE() { return getToken(KrystaSqlParser.LIKE, 0); }
		public TerminalNode ESCAPE() { return getToken(KrystaSqlParser.ESCAPE, 0); }
		public TerminalNode STRING() { return getToken(KrystaSqlParser.STRING, 0); }
		public TerminalNode IS() { return getToken(KrystaSqlParser.IS, 0); }
		public TerminalNode NULL() { return getToken(KrystaSqlParser.NULL, 0); }
		public TerminalNode TRUE() { return getToken(KrystaSqlParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(KrystaSqlParser.FALSE, 0); }
		public TerminalNode UNKNOWN() { return getToken(KrystaSqlParser.UNKNOWN, 0); }
		public TerminalNode FROM() { return getToken(KrystaSqlParser.FROM, 0); }
		public TerminalNode DISTINCT() { return getToken(KrystaSqlParser.DISTINCT, 0); }
		public PredicateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predicate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).enterPredicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).exitPredicate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KrystaSqlVisitor ) return ((KrystaSqlVisitor<? extends T>)visitor).visitPredicate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PredicateContext predicate() throws RecognitionException {
		PredicateContext _localctx = new PredicateContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_predicate);
		int _la;
		try {
			setState(702);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(641);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(640);
					match(NOT);
					}
				}

				setState(643);
				((PredicateContext)_localctx).kind = match(BETWEEN);
				setState(644);
				((PredicateContext)_localctx).lower = valueExpression(0);
				setState(645);
				match(AND);
				setState(646);
				((PredicateContext)_localctx).upper = valueExpression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(649);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(648);
					match(NOT);
					}
				}

				setState(651);
				((PredicateContext)_localctx).kind = match(IN);
				setState(652);
				match(T__1);
				setState(653);
				expression();
				setState(658);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(654);
					match(T__3);
					setState(655);
					expression();
					}
					}
					setState(660);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(661);
				match(T__2);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(664);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(663);
					match(NOT);
					}
				}

				setState(666);
				((PredicateContext)_localctx).kind = match(IN);
				setState(667);
				match(T__1);
				setState(668);
				query();
				setState(669);
				match(T__2);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(672);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(671);
					match(NOT);
					}
				}

				setState(674);
				((PredicateContext)_localctx).kind = match(RLIKE);
				setState(675);
				((PredicateContext)_localctx).pattern = valueExpression(0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(677);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(676);
					match(NOT);
					}
				}

				setState(679);
				((PredicateContext)_localctx).kind = match(LIKE);
				setState(680);
				((PredicateContext)_localctx).pattern = valueExpression(0);
				setState(683);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
				case 1:
					{
					setState(681);
					match(ESCAPE);
					setState(682);
					((PredicateContext)_localctx).escapeChar = match(STRING);
					}
					break;
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(685);
				match(IS);
				setState(687);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(686);
					match(NOT);
					}
				}

				setState(689);
				((PredicateContext)_localctx).kind = match(NULL);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(690);
				match(IS);
				setState(692);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(691);
					match(NOT);
					}
				}

				setState(694);
				((PredicateContext)_localctx).kind = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==FALSE || _la==TRUE || _la==UNKNOWN) ) {
					((PredicateContext)_localctx).kind = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(695);
				match(IS);
				setState(697);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(696);
					match(NOT);
					}
				}

				setState(699);
				((PredicateContext)_localctx).kind = match(DISTINCT);
				setState(700);
				match(FROM);
				setState(701);
				((PredicateContext)_localctx).right = valueExpression(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValueExpressionContext extends ParserRuleContext {
		public ValueExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valueExpression; }
	 
		public ValueExpressionContext() { }
		public void copyFrom(ValueExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ValueExpressionDefaultContext extends ValueExpressionContext {
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public ValueExpressionDefaultContext(ValueExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).enterValueExpressionDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).exitValueExpressionDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KrystaSqlVisitor ) return ((KrystaSqlVisitor<? extends T>)visitor).visitValueExpressionDefault(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ComparisonContext extends ValueExpressionContext {
		public ValueExpressionContext left;
		public ValueExpressionContext right;
		public ComparisonOperatorContext comparisonOperator() {
			return getRuleContext(ComparisonOperatorContext.class,0);
		}
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public ComparisonContext(ValueExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).enterComparison(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).exitComparison(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KrystaSqlVisitor ) return ((KrystaSqlVisitor<? extends T>)visitor).visitComparison(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArithmeticBinaryContext extends ValueExpressionContext {
		public ValueExpressionContext left;
		public Token operator;
		public ValueExpressionContext right;
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public TerminalNode ASTERISK() { return getToken(KrystaSqlParser.ASTERISK, 0); }
		public TerminalNode SLASH() { return getToken(KrystaSqlParser.SLASH, 0); }
		public TerminalNode PERCENT() { return getToken(KrystaSqlParser.PERCENT, 0); }
		public TerminalNode DIV() { return getToken(KrystaSqlParser.DIV, 0); }
		public TerminalNode PLUS() { return getToken(KrystaSqlParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(KrystaSqlParser.MINUS, 0); }
		public TerminalNode CONCAT_PIPE() { return getToken(KrystaSqlParser.CONCAT_PIPE, 0); }
		public TerminalNode AMPERSAND() { return getToken(KrystaSqlParser.AMPERSAND, 0); }
		public TerminalNode HAT() { return getToken(KrystaSqlParser.HAT, 0); }
		public TerminalNode PIPE() { return getToken(KrystaSqlParser.PIPE, 0); }
		public ArithmeticBinaryContext(ValueExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).enterArithmeticBinary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).exitArithmeticBinary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KrystaSqlVisitor ) return ((KrystaSqlVisitor<? extends T>)visitor).visitArithmeticBinary(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArithmeticUnaryContext extends ValueExpressionContext {
		public Token operator;
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public TerminalNode MINUS() { return getToken(KrystaSqlParser.MINUS, 0); }
		public TerminalNode PLUS() { return getToken(KrystaSqlParser.PLUS, 0); }
		public TerminalNode TILDE() { return getToken(KrystaSqlParser.TILDE, 0); }
		public ArithmeticUnaryContext(ValueExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).enterArithmeticUnary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).exitArithmeticUnary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KrystaSqlVisitor ) return ((KrystaSqlVisitor<? extends T>)visitor).visitArithmeticUnary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueExpressionContext valueExpression() throws RecognitionException {
		return valueExpression(0);
	}

	private ValueExpressionContext valueExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ValueExpressionContext _localctx = new ValueExpressionContext(_ctx, _parentState);
		ValueExpressionContext _prevctx = _localctx;
		int _startState = 40;
		enterRecursionRule(_localctx, 40, RULE_valueExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(708);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,91,_ctx) ) {
			case 1:
				{
				_localctx = new ValueExpressionDefaultContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(705);
				primaryExpression(0);
				}
				break;
			case 2:
				{
				_localctx = new ArithmeticUnaryContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(706);
				((ArithmeticUnaryContext)_localctx).operator = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 264)) & ~0x3f) == 0 && ((1L << (_la - 264)) & ((1L << (PLUS - 264)) | (1L << (MINUS - 264)) | (1L << (TILDE - 264)))) != 0)) ) {
					((ArithmeticUnaryContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(707);
				valueExpression(7);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(731);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,93,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(729);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,92,_ctx) ) {
					case 1:
						{
						_localctx = new ArithmeticBinaryContext(new ValueExpressionContext(_parentctx, _parentState));
						((ArithmeticBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(710);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(711);
						((ArithmeticBinaryContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==DIV || ((((_la - 266)) & ~0x3f) == 0 && ((1L << (_la - 266)) & ((1L << (ASTERISK - 266)) | (1L << (SLASH - 266)) | (1L << (PERCENT - 266)))) != 0)) ) {
							((ArithmeticBinaryContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(712);
						((ArithmeticBinaryContext)_localctx).right = valueExpression(7);
						}
						break;
					case 2:
						{
						_localctx = new ArithmeticBinaryContext(new ValueExpressionContext(_parentctx, _parentState));
						((ArithmeticBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(713);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(714);
						((ArithmeticBinaryContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 264)) & ~0x3f) == 0 && ((1L << (_la - 264)) & ((1L << (PLUS - 264)) | (1L << (MINUS - 264)) | (1L << (CONCAT_PIPE - 264)))) != 0)) ) {
							((ArithmeticBinaryContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(715);
						((ArithmeticBinaryContext)_localctx).right = valueExpression(6);
						}
						break;
					case 3:
						{
						_localctx = new ArithmeticBinaryContext(new ValueExpressionContext(_parentctx, _parentState));
						((ArithmeticBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(716);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(717);
						((ArithmeticBinaryContext)_localctx).operator = match(AMPERSAND);
						setState(718);
						((ArithmeticBinaryContext)_localctx).right = valueExpression(5);
						}
						break;
					case 4:
						{
						_localctx = new ArithmeticBinaryContext(new ValueExpressionContext(_parentctx, _parentState));
						((ArithmeticBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(719);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(720);
						((ArithmeticBinaryContext)_localctx).operator = match(HAT);
						setState(721);
						((ArithmeticBinaryContext)_localctx).right = valueExpression(4);
						}
						break;
					case 5:
						{
						_localctx = new ArithmeticBinaryContext(new ValueExpressionContext(_parentctx, _parentState));
						((ArithmeticBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(722);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(723);
						((ArithmeticBinaryContext)_localctx).operator = match(PIPE);
						setState(724);
						((ArithmeticBinaryContext)_localctx).right = valueExpression(3);
						}
						break;
					case 6:
						{
						_localctx = new ComparisonContext(new ValueExpressionContext(_parentctx, _parentState));
						((ComparisonContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(725);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(726);
						comparisonOperator();
						setState(727);
						((ComparisonContext)_localctx).right = valueExpression(2);
						}
						break;
					}
					} 
				}
				setState(733);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,93,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class PrimaryExpressionContext extends ParserRuleContext {
		public PrimaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryExpression; }
	 
		public PrimaryExpressionContext() { }
		public void copyFrom(PrimaryExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class StructContext extends PrimaryExpressionContext {
		public NamedExpressionContext namedExpression;
		public List<NamedExpressionContext> argument = new ArrayList<NamedExpressionContext>();
		public TerminalNode STRUCT() { return getToken(KrystaSqlParser.STRUCT, 0); }
		public List<NamedExpressionContext> namedExpression() {
			return getRuleContexts(NamedExpressionContext.class);
		}
		public NamedExpressionContext namedExpression(int i) {
			return getRuleContext(NamedExpressionContext.class,i);
		}
		public StructContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).enterStruct(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).exitStruct(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KrystaSqlVisitor ) return ((KrystaSqlVisitor<? extends T>)visitor).visitStruct(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DereferenceContext extends PrimaryExpressionContext {
		public PrimaryExpressionContext base;
		public IdentifierContext fieldName;
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public DereferenceContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).enterDereference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).exitDereference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KrystaSqlVisitor ) return ((KrystaSqlVisitor<? extends T>)visitor).visitDereference(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SimpleCaseContext extends PrimaryExpressionContext {
		public ExpressionContext value;
		public ExpressionContext elseExpression;
		public TerminalNode CASE() { return getToken(KrystaSqlParser.CASE, 0); }
		public TerminalNode END() { return getToken(KrystaSqlParser.END, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<WhenClauseContext> whenClause() {
			return getRuleContexts(WhenClauseContext.class);
		}
		public WhenClauseContext whenClause(int i) {
			return getRuleContext(WhenClauseContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(KrystaSqlParser.ELSE, 0); }
		public SimpleCaseContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).enterSimpleCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).exitSimpleCase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KrystaSqlVisitor ) return ((KrystaSqlVisitor<? extends T>)visitor).visitSimpleCase(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ColumnReferenceContext extends PrimaryExpressionContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ColumnReferenceContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).enterColumnReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).exitColumnReference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KrystaSqlVisitor ) return ((KrystaSqlVisitor<? extends T>)visitor).visitColumnReference(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RowConstructorContext extends PrimaryExpressionContext {
		public List<NamedExpressionContext> namedExpression() {
			return getRuleContexts(NamedExpressionContext.class);
		}
		public NamedExpressionContext namedExpression(int i) {
			return getRuleContext(NamedExpressionContext.class,i);
		}
		public RowConstructorContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).enterRowConstructor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).exitRowConstructor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KrystaSqlVisitor ) return ((KrystaSqlVisitor<? extends T>)visitor).visitRowConstructor(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LastContext extends PrimaryExpressionContext {
		public TerminalNode LAST() { return getToken(KrystaSqlParser.LAST, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode IGNORE() { return getToken(KrystaSqlParser.IGNORE, 0); }
		public TerminalNode NULLS() { return getToken(KrystaSqlParser.NULLS, 0); }
		public LastContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).enterLast(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).exitLast(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KrystaSqlVisitor ) return ((KrystaSqlVisitor<? extends T>)visitor).visitLast(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StarContext extends PrimaryExpressionContext {
		public TerminalNode ASTERISK() { return getToken(KrystaSqlParser.ASTERISK, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public StarContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).enterStar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).exitStar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KrystaSqlVisitor ) return ((KrystaSqlVisitor<? extends T>)visitor).visitStar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OverlayContext extends PrimaryExpressionContext {
		public ValueExpressionContext input;
		public ValueExpressionContext replace;
		public ValueExpressionContext position;
		public ValueExpressionContext length;
		public TerminalNode OVERLAY() { return getToken(KrystaSqlParser.OVERLAY, 0); }
		public TerminalNode PLACING() { return getToken(KrystaSqlParser.PLACING, 0); }
		public TerminalNode FROM() { return getToken(KrystaSqlParser.FROM, 0); }
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public TerminalNode FOR() { return getToken(KrystaSqlParser.FOR, 0); }
		public OverlayContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).enterOverlay(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).exitOverlay(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KrystaSqlVisitor ) return ((KrystaSqlVisitor<? extends T>)visitor).visitOverlay(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SubscriptContext extends PrimaryExpressionContext {
		public PrimaryExpressionContext value;
		public ValueExpressionContext index;
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public SubscriptContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).enterSubscript(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).exitSubscript(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KrystaSqlVisitor ) return ((KrystaSqlVisitor<? extends T>)visitor).visitSubscript(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SubqueryExpressionContext extends PrimaryExpressionContext {
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public SubqueryExpressionContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).enterSubqueryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).exitSubqueryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KrystaSqlVisitor ) return ((KrystaSqlVisitor<? extends T>)visitor).visitSubqueryExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SubstringContext extends PrimaryExpressionContext {
		public ValueExpressionContext str;
		public ValueExpressionContext pos;
		public ValueExpressionContext len;
		public TerminalNode SUBSTR() { return getToken(KrystaSqlParser.SUBSTR, 0); }
		public TerminalNode SUBSTRING() { return getToken(KrystaSqlParser.SUBSTRING, 0); }
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public TerminalNode FROM() { return getToken(KrystaSqlParser.FROM, 0); }
		public TerminalNode FOR() { return getToken(KrystaSqlParser.FOR, 0); }
		public SubstringContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).enterSubstring(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).exitSubstring(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KrystaSqlVisitor ) return ((KrystaSqlVisitor<? extends T>)visitor).visitSubstring(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CurrentDatetimeContext extends PrimaryExpressionContext {
		public Token name;
		public TerminalNode CURRENT_DATE() { return getToken(KrystaSqlParser.CURRENT_DATE, 0); }
		public TerminalNode CURRENT_TIMESTAMP() { return getToken(KrystaSqlParser.CURRENT_TIMESTAMP, 0); }
		public CurrentDatetimeContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).enterCurrentDatetime(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).exitCurrentDatetime(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KrystaSqlVisitor ) return ((KrystaSqlVisitor<? extends T>)visitor).visitCurrentDatetime(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CastContext extends PrimaryExpressionContext {
		public TerminalNode CAST() { return getToken(KrystaSqlParser.CAST, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode AS() { return getToken(KrystaSqlParser.AS, 0); }
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public CastContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).enterCast(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).exitCast(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KrystaSqlVisitor ) return ((KrystaSqlVisitor<? extends T>)visitor).visitCast(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ConstantDefaultContext extends PrimaryExpressionContext {
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public ConstantDefaultContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).enterConstantDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).exitConstantDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KrystaSqlVisitor ) return ((KrystaSqlVisitor<? extends T>)visitor).visitConstantDefault(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LambdaContext extends PrimaryExpressionContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public LambdaContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).enterLambda(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).exitLambda(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KrystaSqlVisitor ) return ((KrystaSqlVisitor<? extends T>)visitor).visitLambda(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParenthesizedExpressionContext extends PrimaryExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ParenthesizedExpressionContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).enterParenthesizedExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).exitParenthesizedExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KrystaSqlVisitor ) return ((KrystaSqlVisitor<? extends T>)visitor).visitParenthesizedExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExtractContext extends PrimaryExpressionContext {
		public IdentifierContext field;
		public ValueExpressionContext source;
		public TerminalNode EXTRACT() { return getToken(KrystaSqlParser.EXTRACT, 0); }
		public TerminalNode FROM() { return getToken(KrystaSqlParser.FROM, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public ExtractContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).enterExtract(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).exitExtract(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KrystaSqlVisitor ) return ((KrystaSqlVisitor<? extends T>)visitor).visitExtract(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TrimContext extends PrimaryExpressionContext {
		public Token trimOption;
		public ValueExpressionContext trimStr;
		public ValueExpressionContext srcStr;
		public TerminalNode TRIM() { return getToken(KrystaSqlParser.TRIM, 0); }
		public TerminalNode FROM() { return getToken(KrystaSqlParser.FROM, 0); }
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public TerminalNode BOTH() { return getToken(KrystaSqlParser.BOTH, 0); }
		public TerminalNode LEADING() { return getToken(KrystaSqlParser.LEADING, 0); }
		public TerminalNode TRAILING() { return getToken(KrystaSqlParser.TRAILING, 0); }
		public TrimContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).enterTrim(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).exitTrim(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KrystaSqlVisitor ) return ((KrystaSqlVisitor<? extends T>)visitor).visitTrim(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SearchedCaseContext extends PrimaryExpressionContext {
		public ExpressionContext elseExpression;
		public TerminalNode CASE() { return getToken(KrystaSqlParser.CASE, 0); }
		public TerminalNode END() { return getToken(KrystaSqlParser.END, 0); }
		public List<WhenClauseContext> whenClause() {
			return getRuleContexts(WhenClauseContext.class);
		}
		public WhenClauseContext whenClause(int i) {
			return getRuleContext(WhenClauseContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(KrystaSqlParser.ELSE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SearchedCaseContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).enterSearchedCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).exitSearchedCase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KrystaSqlVisitor ) return ((KrystaSqlVisitor<? extends T>)visitor).visitSearchedCase(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PositionContext extends PrimaryExpressionContext {
		public ValueExpressionContext substr;
		public ValueExpressionContext str;
		public TerminalNode POSITION() { return getToken(KrystaSqlParser.POSITION, 0); }
		public TerminalNode IN() { return getToken(KrystaSqlParser.IN, 0); }
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public PositionContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).enterPosition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).exitPosition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KrystaSqlVisitor ) return ((KrystaSqlVisitor<? extends T>)visitor).visitPosition(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FirstContext extends PrimaryExpressionContext {
		public TerminalNode FIRST() { return getToken(KrystaSqlParser.FIRST, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode IGNORE() { return getToken(KrystaSqlParser.IGNORE, 0); }
		public TerminalNode NULLS() { return getToken(KrystaSqlParser.NULLS, 0); }
		public FirstContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).enterFirst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).exitFirst(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KrystaSqlVisitor ) return ((KrystaSqlVisitor<? extends T>)visitor).visitFirst(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryExpressionContext primaryExpression() throws RecognitionException {
		return primaryExpression(0);
	}

	private PrimaryExpressionContext primaryExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PrimaryExpressionContext _localctx = new PrimaryExpressionContext(_ctx, _parentState);
		PrimaryExpressionContext _prevctx = _localctx;
		int _startState = 42;
		enterRecursionRule(_localctx, 42, RULE_primaryExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(890);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,108,_ctx) ) {
			case 1:
				{
				_localctx = new CurrentDatetimeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(735);
				((CurrentDatetimeContext)_localctx).name = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==CURRENT_DATE || _la==CURRENT_TIMESTAMP) ) {
					((CurrentDatetimeContext)_localctx).name = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 2:
				{
				_localctx = new SearchedCaseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(736);
				match(CASE);
				setState(738); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(737);
					whenClause();
					}
					}
					setState(740); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==WHEN );
				setState(744);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(742);
					match(ELSE);
					setState(743);
					((SearchedCaseContext)_localctx).elseExpression = expression();
					}
				}

				setState(746);
				match(END);
				}
				break;
			case 3:
				{
				_localctx = new SimpleCaseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(748);
				match(CASE);
				setState(749);
				((SimpleCaseContext)_localctx).value = expression();
				setState(751); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(750);
					whenClause();
					}
					}
					setState(753); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==WHEN );
				setState(757);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(755);
					match(ELSE);
					setState(756);
					((SimpleCaseContext)_localctx).elseExpression = expression();
					}
				}

				setState(759);
				match(END);
				}
				break;
			case 4:
				{
				_localctx = new CastContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(761);
				match(CAST);
				setState(762);
				match(T__1);
				setState(763);
				expression();
				setState(764);
				match(AS);
				setState(765);
				dataType();
				setState(766);
				match(T__2);
				}
				break;
			case 5:
				{
				_localctx = new StructContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(768);
				match(STRUCT);
				setState(769);
				match(T__1);
				setState(778);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << CASE) | (1L << CAST) | (1L << CURRENT_DATE) | (1L << CURRENT_TIMESTAMP))) != 0) || ((((_la - 80)) & ~0x3f) == 0 && ((1L << (_la - 80)) & ((1L << (EXISTS - 80)) | (1L << (EXTRACT - 80)) | (1L << (FALSE - 80)) | (1L << (FIRST - 80)) | (1L << (LAST - 80)))) != 0) || ((((_la - 147)) & ~0x3f) == 0 && ((1L << (_la - 147)) & ((1L << (NOT - 147)) | (1L << (NULL - 147)) | (1L << (OVERLAY - 147)) | (1L << (POSITION - 147)))) != 0) || ((((_la - 217)) & ~0x3f) == 0 && ((1L << (_la - 217)) & ((1L << (STRUCT - 217)) | (1L << (SUBSTR - 217)) | (1L << (SUBSTRING - 217)) | (1L << (TRIM - 217)) | (1L << (TRUE - 217)) | (1L << (PLUS - 217)) | (1L << (MINUS - 217)) | (1L << (ASTERISK - 217)) | (1L << (TILDE - 217)) | (1L << (STRING - 217)) | (1L << (BIGINT_LITERAL - 217)) | (1L << (SMALLINT_LITERAL - 217)) | (1L << (TINYINT_LITERAL - 217)) | (1L << (INTEGER_VALUE - 217)))) != 0) || ((((_la - 281)) & ~0x3f) == 0 && ((1L << (_la - 281)) & ((1L << (DOUBLE_LITERAL - 281)) | (1L << (BIGDECIMAL_LITERAL - 281)) | (1L << (IDENTIFIER - 281)) | (1L << (BACKQUOTED_IDENTIFIER - 281)))) != 0)) {
					{
					setState(770);
					((StructContext)_localctx).namedExpression = namedExpression();
					((StructContext)_localctx).argument.add(((StructContext)_localctx).namedExpression);
					setState(775);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(771);
						match(T__3);
						setState(772);
						((StructContext)_localctx).namedExpression = namedExpression();
						((StructContext)_localctx).argument.add(((StructContext)_localctx).namedExpression);
						}
						}
						setState(777);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(780);
				match(T__2);
				}
				break;
			case 6:
				{
				_localctx = new FirstContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(781);
				match(FIRST);
				setState(782);
				match(T__1);
				setState(783);
				expression();
				setState(786);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IGNORE) {
					{
					setState(784);
					match(IGNORE);
					setState(785);
					match(NULLS);
					}
				}

				setState(788);
				match(T__2);
				}
				break;
			case 7:
				{
				_localctx = new LastContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(790);
				match(LAST);
				setState(791);
				match(T__1);
				setState(792);
				expression();
				setState(795);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IGNORE) {
					{
					setState(793);
					match(IGNORE);
					setState(794);
					match(NULLS);
					}
				}

				setState(797);
				match(T__2);
				}
				break;
			case 8:
				{
				_localctx = new PositionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(799);
				match(POSITION);
				setState(800);
				match(T__1);
				setState(801);
				((PositionContext)_localctx).substr = valueExpression(0);
				setState(802);
				match(IN);
				setState(803);
				((PositionContext)_localctx).str = valueExpression(0);
				setState(804);
				match(T__2);
				}
				break;
			case 9:
				{
				_localctx = new ConstantDefaultContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(806);
				constant();
				}
				break;
			case 10:
				{
				_localctx = new StarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(807);
				match(ASTERISK);
				}
				break;
			case 11:
				{
				_localctx = new StarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(808);
				qualifiedName();
				setState(809);
				match(T__4);
				setState(810);
				match(ASTERISK);
				}
				break;
			case 12:
				{
				_localctx = new RowConstructorContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(812);
				match(T__1);
				setState(813);
				namedExpression();
				setState(816); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(814);
					match(T__3);
					setState(815);
					namedExpression();
					}
					}
					setState(818); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__3 );
				setState(820);
				match(T__2);
				}
				break;
			case 13:
				{
				_localctx = new SubqueryExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(822);
				match(T__1);
				setState(823);
				query();
				setState(824);
				match(T__2);
				}
				break;
			case 14:
				{
				_localctx = new LambdaContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(826);
				identifier();
				setState(827);
				match(T__5);
				setState(828);
				expression();
				}
				break;
			case 15:
				{
				_localctx = new LambdaContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(830);
				match(T__1);
				setState(831);
				identifier();
				setState(834); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(832);
					match(T__3);
					setState(833);
					identifier();
					}
					}
					setState(836); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__3 );
				setState(838);
				match(T__2);
				setState(839);
				match(T__5);
				setState(840);
				expression();
				}
				break;
			case 16:
				{
				_localctx = new ColumnReferenceContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(842);
				identifier();
				}
				break;
			case 17:
				{
				_localctx = new ParenthesizedExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(843);
				match(T__1);
				setState(844);
				expression();
				setState(845);
				match(T__2);
				}
				break;
			case 18:
				{
				_localctx = new ExtractContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(847);
				match(EXTRACT);
				setState(848);
				match(T__1);
				setState(849);
				((ExtractContext)_localctx).field = identifier();
				setState(850);
				match(FROM);
				setState(851);
				((ExtractContext)_localctx).source = valueExpression(0);
				setState(852);
				match(T__2);
				}
				break;
			case 19:
				{
				_localctx = new SubstringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(854);
				_la = _input.LA(1);
				if ( !(_la==SUBSTR || _la==SUBSTRING) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(855);
				match(T__1);
				setState(856);
				((SubstringContext)_localctx).str = valueExpression(0);
				setState(857);
				_la = _input.LA(1);
				if ( !(_la==T__3 || _la==FROM) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(858);
				((SubstringContext)_localctx).pos = valueExpression(0);
				setState(861);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__3 || _la==FOR) {
					{
					setState(859);
					_la = _input.LA(1);
					if ( !(_la==T__3 || _la==FOR) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(860);
					((SubstringContext)_localctx).len = valueExpression(0);
					}
				}

				setState(863);
				match(T__2);
				}
				break;
			case 20:
				{
				_localctx = new TrimContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(865);
				match(TRIM);
				setState(866);
				match(T__1);
				setState(868);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==BOTH || _la==LEADING || _la==TRAILING) {
					{
					setState(867);
					((TrimContext)_localctx).trimOption = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==BOTH || _la==LEADING || _la==TRAILING) ) {
						((TrimContext)_localctx).trimOption = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(871);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << CASE) | (1L << CAST) | (1L << CURRENT_DATE) | (1L << CURRENT_TIMESTAMP))) != 0) || ((((_la - 85)) & ~0x3f) == 0 && ((1L << (_la - 85)) & ((1L << (EXTRACT - 85)) | (1L << (FALSE - 85)) | (1L << (FIRST - 85)) | (1L << (LAST - 85)) | (1L << (NULL - 85)))) != 0) || ((((_la - 162)) & ~0x3f) == 0 && ((1L << (_la - 162)) & ((1L << (OVERLAY - 162)) | (1L << (POSITION - 162)) | (1L << (STRUCT - 162)) | (1L << (SUBSTR - 162)) | (1L << (SUBSTRING - 162)))) != 0) || ((((_la - 233)) & ~0x3f) == 0 && ((1L << (_la - 233)) & ((1L << (TRIM - 233)) | (1L << (TRUE - 233)) | (1L << (PLUS - 233)) | (1L << (MINUS - 233)) | (1L << (ASTERISK - 233)) | (1L << (TILDE - 233)) | (1L << (STRING - 233)) | (1L << (BIGINT_LITERAL - 233)) | (1L << (SMALLINT_LITERAL - 233)) | (1L << (TINYINT_LITERAL - 233)) | (1L << (INTEGER_VALUE - 233)) | (1L << (DOUBLE_LITERAL - 233)) | (1L << (BIGDECIMAL_LITERAL - 233)) | (1L << (IDENTIFIER - 233)) | (1L << (BACKQUOTED_IDENTIFIER - 233)))) != 0)) {
					{
					setState(870);
					((TrimContext)_localctx).trimStr = valueExpression(0);
					}
				}

				setState(873);
				match(FROM);
				setState(874);
				((TrimContext)_localctx).srcStr = valueExpression(0);
				setState(875);
				match(T__2);
				}
				break;
			case 21:
				{
				_localctx = new OverlayContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(877);
				match(OVERLAY);
				setState(878);
				match(T__1);
				setState(879);
				((OverlayContext)_localctx).input = valueExpression(0);
				setState(880);
				match(PLACING);
				setState(881);
				((OverlayContext)_localctx).replace = valueExpression(0);
				setState(882);
				match(FROM);
				setState(883);
				((OverlayContext)_localctx).position = valueExpression(0);
				setState(886);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FOR) {
					{
					setState(884);
					match(FOR);
					setState(885);
					((OverlayContext)_localctx).length = valueExpression(0);
					}
				}

				setState(888);
				match(T__2);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(902);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,110,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(900);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,109,_ctx) ) {
					case 1:
						{
						_localctx = new SubscriptContext(new PrimaryExpressionContext(_parentctx, _parentState));
						((SubscriptContext)_localctx).value = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_primaryExpression);
						setState(892);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(893);
						match(T__6);
						setState(894);
						((SubscriptContext)_localctx).index = valueExpression(0);
						setState(895);
						match(T__7);
						}
						break;
					case 2:
						{
						_localctx = new DereferenceContext(new PrimaryExpressionContext(_parentctx, _parentState));
						((DereferenceContext)_localctx).base = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_primaryExpression);
						setState(897);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(898);
						match(T__4);
						setState(899);
						((DereferenceContext)_localctx).fieldName = identifier();
						}
						break;
					}
					} 
				}
				setState(904);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,110,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ConstantContext extends ParserRuleContext {
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
	 
		public ConstantContext() { }
		public void copyFrom(ConstantContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NullLiteralContext extends ConstantContext {
		public TerminalNode NULL() { return getToken(KrystaSqlParser.NULL, 0); }
		public NullLiteralContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).enterNullLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).exitNullLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KrystaSqlVisitor ) return ((KrystaSqlVisitor<? extends T>)visitor).visitNullLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringLiteralContext extends ConstantContext {
		public List<TerminalNode> STRING() { return getTokens(KrystaSqlParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(KrystaSqlParser.STRING, i);
		}
		public StringLiteralContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).enterStringLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).exitStringLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KrystaSqlVisitor ) return ((KrystaSqlVisitor<? extends T>)visitor).visitStringLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TypeConstructorContext extends ConstantContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode STRING() { return getToken(KrystaSqlParser.STRING, 0); }
		public TypeConstructorContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).enterTypeConstructor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).exitTypeConstructor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KrystaSqlVisitor ) return ((KrystaSqlVisitor<? extends T>)visitor).visitTypeConstructor(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumericLiteralContext extends ConstantContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public NumericLiteralContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).enterNumericLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).exitNumericLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KrystaSqlVisitor ) return ((KrystaSqlVisitor<? extends T>)visitor).visitNumericLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BooleanLiteralContext extends ConstantContext {
		public BooleanValueContext booleanValue() {
			return getRuleContext(BooleanValueContext.class,0);
		}
		public BooleanLiteralContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).enterBooleanLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).exitBooleanLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KrystaSqlVisitor ) return ((KrystaSqlVisitor<? extends T>)visitor).visitBooleanLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_constant);
		try {
			int _alt;
			setState(916);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NULL:
				_localctx = new NullLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(905);
				match(NULL);
				}
				break;
			case IDENTIFIER:
			case BACKQUOTED_IDENTIFIER:
				_localctx = new TypeConstructorContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(906);
				identifier();
				setState(907);
				match(STRING);
				}
				break;
			case MINUS:
			case BIGINT_LITERAL:
			case SMALLINT_LITERAL:
			case TINYINT_LITERAL:
			case INTEGER_VALUE:
			case DOUBLE_LITERAL:
			case BIGDECIMAL_LITERAL:
				_localctx = new NumericLiteralContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(909);
				number();
				}
				break;
			case FALSE:
			case TRUE:
				_localctx = new BooleanLiteralContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(910);
				booleanValue();
				}
				break;
			case STRING:
				_localctx = new StringLiteralContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(912); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(911);
						match(STRING);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(914); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,111,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComparisonOperatorContext extends ParserRuleContext {
		public TerminalNode EQ() { return getToken(KrystaSqlParser.EQ, 0); }
		public TerminalNode NEQ() { return getToken(KrystaSqlParser.NEQ, 0); }
		public TerminalNode NEQJ() { return getToken(KrystaSqlParser.NEQJ, 0); }
		public TerminalNode LT() { return getToken(KrystaSqlParser.LT, 0); }
		public TerminalNode LTE() { return getToken(KrystaSqlParser.LTE, 0); }
		public TerminalNode GT() { return getToken(KrystaSqlParser.GT, 0); }
		public TerminalNode GTE() { return getToken(KrystaSqlParser.GTE, 0); }
		public TerminalNode NSEQ() { return getToken(KrystaSqlParser.NSEQ, 0); }
		public ComparisonOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparisonOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).enterComparisonOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).exitComparisonOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KrystaSqlVisitor ) return ((KrystaSqlVisitor<? extends T>)visitor).visitComparisonOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparisonOperatorContext comparisonOperator() throws RecognitionException {
		ComparisonOperatorContext _localctx = new ComparisonOperatorContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_comparisonOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(918);
			_la = _input.LA(1);
			if ( !(((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (EQ - 256)) | (1L << (NSEQ - 256)) | (1L << (NEQ - 256)) | (1L << (NEQJ - 256)) | (1L << (LT - 256)) | (1L << (LTE - 256)) | (1L << (GT - 256)) | (1L << (GTE - 256)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NamedExpressionContext extends ParserRuleContext {
		public IdentifierContext name;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TerminalNode AS() { return getToken(KrystaSqlParser.AS, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public NamedExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namedExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).enterNamedExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).exitNamedExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KrystaSqlVisitor ) return ((KrystaSqlVisitor<? extends T>)visitor).visitNamedExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamedExpressionContext namedExpression() throws RecognitionException {
		NamedExpressionContext _localctx = new NamedExpressionContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_namedExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(920);
			expression();
			setState(928);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1 || _la==AS || _la==IDENTIFIER || _la==BACKQUOTED_IDENTIFIER) {
				{
				setState(922);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(921);
					match(AS);
					}
				}

				setState(926);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,114,_ctx) ) {
				case 1:
					{
					setState(924);
					((NamedExpressionContext)_localctx).name = identifier();
					}
					break;
				case 2:
					{
					setState(925);
					identifierList();
					}
					break;
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NamedExpressionSeqContext extends ParserRuleContext {
		public List<NamedExpressionContext> namedExpression() {
			return getRuleContexts(NamedExpressionContext.class);
		}
		public NamedExpressionContext namedExpression(int i) {
			return getRuleContext(NamedExpressionContext.class,i);
		}
		public NamedExpressionSeqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namedExpressionSeq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).enterNamedExpressionSeq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).exitNamedExpressionSeq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KrystaSqlVisitor ) return ((KrystaSqlVisitor<? extends T>)visitor).visitNamedExpressionSeq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamedExpressionSeqContext namedExpressionSeq() throws RecognitionException {
		NamedExpressionSeqContext _localctx = new NamedExpressionSeqContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_namedExpressionSeq);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(930);
			namedExpression();
			setState(935);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(931);
				match(T__3);
				setState(932);
				namedExpression();
				}
				}
				setState(937);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SortItemContext extends ParserRuleContext {
		public Token ordering;
		public Token nullOrder;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode NULLS() { return getToken(KrystaSqlParser.NULLS, 0); }
		public TerminalNode ASC() { return getToken(KrystaSqlParser.ASC, 0); }
		public TerminalNode DESC() { return getToken(KrystaSqlParser.DESC, 0); }
		public TerminalNode LAST() { return getToken(KrystaSqlParser.LAST, 0); }
		public TerminalNode FIRST() { return getToken(KrystaSqlParser.FIRST, 0); }
		public SortItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sortItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).enterSortItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).exitSortItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KrystaSqlVisitor ) return ((KrystaSqlVisitor<? extends T>)visitor).visitSortItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SortItemContext sortItem() throws RecognitionException {
		SortItemContext _localctx = new SortItemContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_sortItem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(938);
			expression();
			setState(940);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASC || _la==DESC) {
				{
				setState(939);
				((SortItemContext)_localctx).ordering = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ASC || _la==DESC) ) {
					((SortItemContext)_localctx).ordering = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(944);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NULLS) {
				{
				setState(942);
				match(NULLS);
				setState(943);
				((SortItemContext)_localctx).nullOrder = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==FIRST || _la==LAST) ) {
					((SortItemContext)_localctx).nullOrder = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NamedWindowContext extends ParserRuleContext {
		public IdentifierContext name;
		public TerminalNode AS() { return getToken(KrystaSqlParser.AS, 0); }
		public WindowSpecContext windowSpec() {
			return getRuleContext(WindowSpecContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public NamedWindowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namedWindow; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).enterNamedWindow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).exitNamedWindow(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KrystaSqlVisitor ) return ((KrystaSqlVisitor<? extends T>)visitor).visitNamedWindow(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamedWindowContext namedWindow() throws RecognitionException {
		NamedWindowContext _localctx = new NamedWindowContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_namedWindow);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(946);
			((NamedWindowContext)_localctx).name = identifier();
			setState(947);
			match(AS);
			setState(948);
			windowSpec();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WindowSpecContext extends ParserRuleContext {
		public WindowSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_windowSpec; }
	 
		public WindowSpecContext() { }
		public void copyFrom(WindowSpecContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class WindowRefContext extends WindowSpecContext {
		public IdentifierContext name;
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public WindowRefContext(WindowSpecContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).enterWindowRef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).exitWindowRef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KrystaSqlVisitor ) return ((KrystaSqlVisitor<? extends T>)visitor).visitWindowRef(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WindowDefContext extends WindowSpecContext {
		public ExpressionContext expression;
		public List<ExpressionContext> partition = new ArrayList<ExpressionContext>();
		public TerminalNode CLUSTER() { return getToken(KrystaSqlParser.CLUSTER, 0); }
		public List<TerminalNode> BY() { return getTokens(KrystaSqlParser.BY); }
		public TerminalNode BY(int i) {
			return getToken(KrystaSqlParser.BY, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public WindowFrameContext windowFrame() {
			return getRuleContext(WindowFrameContext.class,0);
		}
		public List<SortItemContext> sortItem() {
			return getRuleContexts(SortItemContext.class);
		}
		public SortItemContext sortItem(int i) {
			return getRuleContext(SortItemContext.class,i);
		}
		public TerminalNode PARTITION() { return getToken(KrystaSqlParser.PARTITION, 0); }
		public TerminalNode DISTRIBUTE() { return getToken(KrystaSqlParser.DISTRIBUTE, 0); }
		public TerminalNode ORDER() { return getToken(KrystaSqlParser.ORDER, 0); }
		public TerminalNode SORT() { return getToken(KrystaSqlParser.SORT, 0); }
		public WindowDefContext(WindowSpecContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).enterWindowDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).exitWindowDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KrystaSqlVisitor ) return ((KrystaSqlVisitor<? extends T>)visitor).visitWindowDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WindowSpecContext windowSpec() throws RecognitionException {
		WindowSpecContext _localctx = new WindowSpecContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_windowSpec);
		int _la;
		try {
			setState(996);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,126,_ctx) ) {
			case 1:
				_localctx = new WindowRefContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(950);
				((WindowRefContext)_localctx).name = identifier();
				}
				break;
			case 2:
				_localctx = new WindowRefContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(951);
				match(T__1);
				setState(952);
				((WindowRefContext)_localctx).name = identifier();
				setState(953);
				match(T__2);
				}
				break;
			case 3:
				_localctx = new WindowDefContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(955);
				match(T__1);
				setState(990);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CLUSTER:
					{
					setState(956);
					match(CLUSTER);
					setState(957);
					match(BY);
					setState(958);
					((WindowDefContext)_localctx).expression = expression();
					((WindowDefContext)_localctx).partition.add(((WindowDefContext)_localctx).expression);
					setState(963);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(959);
						match(T__3);
						setState(960);
						((WindowDefContext)_localctx).expression = expression();
						((WindowDefContext)_localctx).partition.add(((WindowDefContext)_localctx).expression);
						}
						}
						setState(965);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case T__2:
				case DISTRIBUTE:
				case ORDER:
				case PARTITION:
				case RANGE:
				case ROWS:
				case SORT:
					{
					setState(976);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==DISTRIBUTE || _la==PARTITION) {
						{
						setState(966);
						_la = _input.LA(1);
						if ( !(_la==DISTRIBUTE || _la==PARTITION) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(967);
						match(BY);
						setState(968);
						((WindowDefContext)_localctx).expression = expression();
						((WindowDefContext)_localctx).partition.add(((WindowDefContext)_localctx).expression);
						setState(973);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==T__3) {
							{
							{
							setState(969);
							match(T__3);
							setState(970);
							((WindowDefContext)_localctx).expression = expression();
							((WindowDefContext)_localctx).partition.add(((WindowDefContext)_localctx).expression);
							}
							}
							setState(975);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
					}

					setState(988);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ORDER || _la==SORT) {
						{
						setState(978);
						_la = _input.LA(1);
						if ( !(_la==ORDER || _la==SORT) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(979);
						match(BY);
						setState(980);
						sortItem();
						setState(985);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==T__3) {
							{
							{
							setState(981);
							match(T__3);
							setState(982);
							sortItem();
							}
							}
							setState(987);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
					}

					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(993);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==RANGE || _la==ROWS) {
					{
					setState(992);
					windowFrame();
					}
				}

				setState(995);
				match(T__2);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WindowFrameContext extends ParserRuleContext {
		public Token frameType;
		public FrameBoundContext start;
		public FrameBoundContext end;
		public TerminalNode RANGE() { return getToken(KrystaSqlParser.RANGE, 0); }
		public List<FrameBoundContext> frameBound() {
			return getRuleContexts(FrameBoundContext.class);
		}
		public FrameBoundContext frameBound(int i) {
			return getRuleContext(FrameBoundContext.class,i);
		}
		public TerminalNode ROWS() { return getToken(KrystaSqlParser.ROWS, 0); }
		public TerminalNode BETWEEN() { return getToken(KrystaSqlParser.BETWEEN, 0); }
		public TerminalNode AND() { return getToken(KrystaSqlParser.AND, 0); }
		public WindowFrameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_windowFrame; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).enterWindowFrame(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).exitWindowFrame(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KrystaSqlVisitor ) return ((KrystaSqlVisitor<? extends T>)visitor).visitWindowFrame(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WindowFrameContext windowFrame() throws RecognitionException {
		WindowFrameContext _localctx = new WindowFrameContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_windowFrame);
		try {
			setState(1014);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,127,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(998);
				((WindowFrameContext)_localctx).frameType = match(RANGE);
				setState(999);
				((WindowFrameContext)_localctx).start = frameBound();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1000);
				((WindowFrameContext)_localctx).frameType = match(ROWS);
				setState(1001);
				((WindowFrameContext)_localctx).start = frameBound();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1002);
				((WindowFrameContext)_localctx).frameType = match(RANGE);
				setState(1003);
				match(BETWEEN);
				setState(1004);
				((WindowFrameContext)_localctx).start = frameBound();
				setState(1005);
				match(AND);
				setState(1006);
				((WindowFrameContext)_localctx).end = frameBound();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1008);
				((WindowFrameContext)_localctx).frameType = match(ROWS);
				setState(1009);
				match(BETWEEN);
				setState(1010);
				((WindowFrameContext)_localctx).start = frameBound();
				setState(1011);
				match(AND);
				setState(1012);
				((WindowFrameContext)_localctx).end = frameBound();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FrameBoundContext extends ParserRuleContext {
		public Token boundType;
		public TerminalNode UNBOUNDED() { return getToken(KrystaSqlParser.UNBOUNDED, 0); }
		public TerminalNode PRECEDING() { return getToken(KrystaSqlParser.PRECEDING, 0); }
		public TerminalNode FOLLOWING() { return getToken(KrystaSqlParser.FOLLOWING, 0); }
		public TerminalNode ROW() { return getToken(KrystaSqlParser.ROW, 0); }
		public TerminalNode CURRENT() { return getToken(KrystaSqlParser.CURRENT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public FrameBoundContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_frameBound; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).enterFrameBound(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).exitFrameBound(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KrystaSqlVisitor ) return ((KrystaSqlVisitor<? extends T>)visitor).visitFrameBound(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FrameBoundContext frameBound() throws RecognitionException {
		FrameBoundContext _localctx = new FrameBoundContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_frameBound);
		int _la;
		try {
			setState(1023);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case UNBOUNDED:
				enterOuterAlt(_localctx, 1);
				{
				setState(1016);
				match(UNBOUNDED);
				setState(1017);
				((FrameBoundContext)_localctx).boundType = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==FOLLOWING || _la==PRECEDING) ) {
					((FrameBoundContext)_localctx).boundType = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case CURRENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1018);
				((FrameBoundContext)_localctx).boundType = match(CURRENT);
				setState(1019);
				match(ROW);
				}
				break;
			case T__1:
			case CASE:
			case CAST:
			case CURRENT_DATE:
			case CURRENT_TIMESTAMP:
			case EXISTS:
			case EXTRACT:
			case FALSE:
			case FIRST:
			case LAST:
			case NOT:
			case NULL:
			case OVERLAY:
			case POSITION:
			case STRUCT:
			case SUBSTR:
			case SUBSTRING:
			case TRIM:
			case TRUE:
			case PLUS:
			case MINUS:
			case ASTERISK:
			case TILDE:
			case STRING:
			case BIGINT_LITERAL:
			case SMALLINT_LITERAL:
			case TINYINT_LITERAL:
			case INTEGER_VALUE:
			case DOUBLE_LITERAL:
			case BIGDECIMAL_LITERAL:
			case IDENTIFIER:
			case BACKQUOTED_IDENTIFIER:
				enterOuterAlt(_localctx, 3);
				{
				setState(1020);
				expression();
				setState(1021);
				((FrameBoundContext)_localctx).boundType = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==FOLLOWING || _la==PRECEDING) ) {
					((FrameBoundContext)_localctx).boundType = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RelationContext extends ParserRuleContext {
		public RelationPrimaryContext relationPrimary() {
			return getRuleContext(RelationPrimaryContext.class,0);
		}
		public List<JoinRelationContext> joinRelation() {
			return getRuleContexts(JoinRelationContext.class);
		}
		public JoinRelationContext joinRelation(int i) {
			return getRuleContext(JoinRelationContext.class,i);
		}
		public RelationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).enterRelation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).exitRelation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KrystaSqlVisitor ) return ((KrystaSqlVisitor<? extends T>)visitor).visitRelation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationContext relation() throws RecognitionException {
		RelationContext _localctx = new RelationContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_relation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1025);
			relationPrimary();
			setState(1029);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ANTI || _la==CROSS || ((((_la - 98)) & ~0x3f) == 0 && ((1L << (_la - 98)) & ((1L << (FULL - 98)) | (1L << (INNER - 98)) | (1L << (JOIN - 98)) | (1L << (LEFT - 98)) | (1L << (NATURAL - 98)))) != 0) || _la==RIGHT || _la==SEMI) {
				{
				{
				setState(1026);
				joinRelation();
				}
				}
				setState(1031);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RelationPrimaryContext extends ParserRuleContext {
		public RelationPrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationPrimary; }
	 
		public RelationPrimaryContext() { }
		public void copyFrom(RelationPrimaryContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AliasedRelationContext extends RelationPrimaryContext {
		public RelationContext relation() {
			return getRuleContext(RelationContext.class,0);
		}
		public TableAliasContext tableAlias() {
			return getRuleContext(TableAliasContext.class,0);
		}
		public AliasedRelationContext(RelationPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).enterAliasedRelation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).exitAliasedRelation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KrystaSqlVisitor ) return ((KrystaSqlVisitor<? extends T>)visitor).visitAliasedRelation(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AliasedQueryContext extends RelationPrimaryContext {
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TableAliasContext tableAlias() {
			return getRuleContext(TableAliasContext.class,0);
		}
		public AliasedQueryContext(RelationPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).enterAliasedQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).exitAliasedQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KrystaSqlVisitor ) return ((KrystaSqlVisitor<? extends T>)visitor).visitAliasedQuery(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TableNameContext extends RelationPrimaryContext {
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TableAliasContext tableAlias() {
			return getRuleContext(TableAliasContext.class,0);
		}
		public TableNameContext(RelationPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).enterTableName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).exitTableName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KrystaSqlVisitor ) return ((KrystaSqlVisitor<? extends T>)visitor).visitTableName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationPrimaryContext relationPrimary() throws RecognitionException {
		RelationPrimaryContext _localctx = new RelationPrimaryContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_relationPrimary);
		try {
			setState(1045);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,130,_ctx) ) {
			case 1:
				_localctx = new TableNameContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1032);
				identifierList();
				setState(1033);
				tableAlias();
				}
				break;
			case 2:
				_localctx = new AliasedQueryContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1035);
				match(T__1);
				setState(1036);
				query();
				setState(1037);
				match(T__2);
				setState(1038);
				tableAlias();
				}
				break;
			case 3:
				_localctx = new AliasedRelationContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1040);
				match(T__1);
				setState(1041);
				relation();
				setState(1042);
				match(T__2);
				setState(1043);
				tableAlias();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TableAliasContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode AS() { return getToken(KrystaSqlParser.AS, 0); }
		public TableAliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableAlias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).enterTableAlias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).exitTableAlias(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KrystaSqlVisitor ) return ((KrystaSqlVisitor<? extends T>)visitor).visitTableAlias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableAliasContext tableAlias() throws RecognitionException {
		TableAliasContext _localctx = new TableAliasContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_tableAlias);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1051);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS || _la==IDENTIFIER || _la==BACKQUOTED_IDENTIFIER) {
				{
				setState(1048);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(1047);
					match(AS);
					}
				}

				setState(1050);
				identifier();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class JoinRelationContext extends ParserRuleContext {
		public RelationPrimaryContext right;
		public TerminalNode JOIN() { return getToken(KrystaSqlParser.JOIN, 0); }
		public RelationPrimaryContext relationPrimary() {
			return getRuleContext(RelationPrimaryContext.class,0);
		}
		public JoinTypeContext joinType() {
			return getRuleContext(JoinTypeContext.class,0);
		}
		public JoinCriteriaContext joinCriteria() {
			return getRuleContext(JoinCriteriaContext.class,0);
		}
		public TerminalNode NATURAL() { return getToken(KrystaSqlParser.NATURAL, 0); }
		public JoinRelationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinRelation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).enterJoinRelation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).exitJoinRelation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KrystaSqlVisitor ) return ((KrystaSqlVisitor<? extends T>)visitor).visitJoinRelation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JoinRelationContext joinRelation() throws RecognitionException {
		JoinRelationContext _localctx = new JoinRelationContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_joinRelation);
		int _la;
		try {
			setState(1064);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ANTI:
			case CROSS:
			case FULL:
			case INNER:
			case JOIN:
			case LEFT:
			case RIGHT:
			case SEMI:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(1053);
				joinType();
				}
				setState(1054);
				match(JOIN);
				setState(1055);
				((JoinRelationContext)_localctx).right = relationPrimary();
				setState(1057);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ON || _la==USING) {
					{
					setState(1056);
					joinCriteria();
					}
				}

				}
				break;
			case NATURAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(1059);
				match(NATURAL);
				setState(1060);
				joinType();
				setState(1061);
				match(JOIN);
				setState(1062);
				((JoinRelationContext)_localctx).right = relationPrimary();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class JoinTypeContext extends ParserRuleContext {
		public TerminalNode INNER() { return getToken(KrystaSqlParser.INNER, 0); }
		public TerminalNode CROSS() { return getToken(KrystaSqlParser.CROSS, 0); }
		public TerminalNode LEFT() { return getToken(KrystaSqlParser.LEFT, 0); }
		public TerminalNode OUTER() { return getToken(KrystaSqlParser.OUTER, 0); }
		public TerminalNode SEMI() { return getToken(KrystaSqlParser.SEMI, 0); }
		public TerminalNode RIGHT() { return getToken(KrystaSqlParser.RIGHT, 0); }
		public TerminalNode FULL() { return getToken(KrystaSqlParser.FULL, 0); }
		public TerminalNode ANTI() { return getToken(KrystaSqlParser.ANTI, 0); }
		public JoinTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).enterJoinType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).exitJoinType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KrystaSqlVisitor ) return ((KrystaSqlVisitor<? extends T>)visitor).visitJoinType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JoinTypeContext joinType() throws RecognitionException {
		JoinTypeContext _localctx = new JoinTypeContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_joinType);
		int _la;
		try {
			setState(1090);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,141,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1067);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INNER) {
					{
					setState(1066);
					match(INNER);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1069);
				match(CROSS);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1070);
				match(LEFT);
				setState(1072);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OUTER) {
					{
					setState(1071);
					match(OUTER);
					}
				}

				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1075);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LEFT) {
					{
					setState(1074);
					match(LEFT);
					}
				}

				setState(1077);
				match(SEMI);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1078);
				match(RIGHT);
				setState(1080);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OUTER) {
					{
					setState(1079);
					match(OUTER);
					}
				}

				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1082);
				match(FULL);
				setState(1084);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OUTER) {
					{
					setState(1083);
					match(OUTER);
					}
				}

				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1087);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LEFT) {
					{
					setState(1086);
					match(LEFT);
					}
				}

				setState(1089);
				match(ANTI);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class JoinCriteriaContext extends ParserRuleContext {
		public TerminalNode ON() { return getToken(KrystaSqlParser.ON, 0); }
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public TerminalNode USING() { return getToken(KrystaSqlParser.USING, 0); }
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public JoinCriteriaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinCriteria; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).enterJoinCriteria(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).exitJoinCriteria(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KrystaSqlVisitor ) return ((KrystaSqlVisitor<? extends T>)visitor).visitJoinCriteria(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JoinCriteriaContext joinCriteria() throws RecognitionException {
		JoinCriteriaContext _localctx = new JoinCriteriaContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_joinCriteria);
		try {
			setState(1096);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ON:
				enterOuterAlt(_localctx, 1);
				{
				setState(1092);
				match(ON);
				setState(1093);
				booleanExpression(0);
				}
				break;
			case USING:
				enterOuterAlt(_localctx, 2);
				{
				setState(1094);
				match(USING);
				setState(1095);
				identifierList();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CreateTableClausesContext extends ParserRuleContext {
		public TablePropertyListContext options;
		public IdentifierListContext partitioning;
		public TablePropertyListContext tableProps;
		public List<LocationSpecContext> locationSpec() {
			return getRuleContexts(LocationSpecContext.class);
		}
		public LocationSpecContext locationSpec(int i) {
			return getRuleContext(LocationSpecContext.class,i);
		}
		public List<CommentSpecContext> commentSpec() {
			return getRuleContexts(CommentSpecContext.class);
		}
		public CommentSpecContext commentSpec(int i) {
			return getRuleContext(CommentSpecContext.class,i);
		}
		public List<TerminalNode> OPTIONS() { return getTokens(KrystaSqlParser.OPTIONS); }
		public TerminalNode OPTIONS(int i) {
			return getToken(KrystaSqlParser.OPTIONS, i);
		}
		public List<TerminalNode> PARTITIONED() { return getTokens(KrystaSqlParser.PARTITIONED); }
		public TerminalNode PARTITIONED(int i) {
			return getToken(KrystaSqlParser.PARTITIONED, i);
		}
		public List<TerminalNode> BY() { return getTokens(KrystaSqlParser.BY); }
		public TerminalNode BY(int i) {
			return getToken(KrystaSqlParser.BY, i);
		}
		public List<TerminalNode> TBLPROPERTIES() { return getTokens(KrystaSqlParser.TBLPROPERTIES); }
		public TerminalNode TBLPROPERTIES(int i) {
			return getToken(KrystaSqlParser.TBLPROPERTIES, i);
		}
		public List<TablePropertyListContext> tablePropertyList() {
			return getRuleContexts(TablePropertyListContext.class);
		}
		public TablePropertyListContext tablePropertyList(int i) {
			return getRuleContext(TablePropertyListContext.class,i);
		}
		public List<IdentifierListContext> identifierList() {
			return getRuleContexts(IdentifierListContext.class);
		}
		public IdentifierListContext identifierList(int i) {
			return getRuleContext(IdentifierListContext.class,i);
		}
		public CreateTableClausesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createTableClauses; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).enterCreateTableClauses(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).exitCreateTableClauses(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KrystaSqlVisitor ) return ((KrystaSqlVisitor<? extends T>)visitor).visitCreateTableClauses(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateTableClausesContext createTableClauses() throws RecognitionException {
		CreateTableClausesContext _localctx = new CreateTableClausesContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_createTableClauses);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1109);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMENT || ((((_la - 134)) & ~0x3f) == 0 && ((1L << (_la - 134)) & ((1L << (LOCATION - 134)) | (1L << (OPTIONS - 134)) | (1L << (PARTITIONED - 134)))) != 0) || _la==TBLPROPERTIES) {
				{
				setState(1107);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case OPTIONS:
					{
					{
					setState(1098);
					match(OPTIONS);
					setState(1099);
					((CreateTableClausesContext)_localctx).options = tablePropertyList();
					}
					}
					break;
				case PARTITIONED:
					{
					{
					setState(1100);
					match(PARTITIONED);
					setState(1101);
					match(BY);
					setState(1102);
					((CreateTableClausesContext)_localctx).partitioning = identifierList();
					}
					}
					break;
				case LOCATION:
					{
					setState(1103);
					locationSpec();
					}
					break;
				case COMMENT:
					{
					setState(1104);
					commentSpec();
					}
					break;
				case TBLPROPERTIES:
					{
					{
					setState(1105);
					match(TBLPROPERTIES);
					setState(1106);
					((CreateTableClausesContext)_localctx).tableProps = tablePropertyList();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(1111);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TablePropertyListContext extends ParserRuleContext {
		public List<TablePropertyContext> tableProperty() {
			return getRuleContexts(TablePropertyContext.class);
		}
		public TablePropertyContext tableProperty(int i) {
			return getRuleContext(TablePropertyContext.class,i);
		}
		public TablePropertyListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tablePropertyList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).enterTablePropertyList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).exitTablePropertyList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KrystaSqlVisitor ) return ((KrystaSqlVisitor<? extends T>)visitor).visitTablePropertyList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TablePropertyListContext tablePropertyList() throws RecognitionException {
		TablePropertyListContext _localctx = new TablePropertyListContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_tablePropertyList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1112);
			match(T__1);
			setState(1113);
			tableProperty();
			setState(1118);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(1114);
				match(T__3);
				setState(1115);
				tableProperty();
				}
				}
				setState(1120);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1121);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TablePropertyContext extends ParserRuleContext {
		public TablePropertyKeyContext key;
		public TablePropertyValueContext value;
		public TablePropertyKeyContext tablePropertyKey() {
			return getRuleContext(TablePropertyKeyContext.class,0);
		}
		public TablePropertyValueContext tablePropertyValue() {
			return getRuleContext(TablePropertyValueContext.class,0);
		}
		public TerminalNode EQ() { return getToken(KrystaSqlParser.EQ, 0); }
		public TablePropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableProperty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).enterTableProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).exitTableProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KrystaSqlVisitor ) return ((KrystaSqlVisitor<? extends T>)visitor).visitTableProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TablePropertyContext tableProperty() throws RecognitionException {
		TablePropertyContext _localctx = new TablePropertyContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_tableProperty);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1123);
			((TablePropertyContext)_localctx).key = tablePropertyKey();
			setState(1128);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FALSE || ((((_la - 234)) & ~0x3f) == 0 && ((1L << (_la - 234)) & ((1L << (TRUE - 234)) | (1L << (EQ - 234)) | (1L << (STRING - 234)) | (1L << (INTEGER_VALUE - 234)) | (1L << (DECIMAL_VALUE - 234)))) != 0)) {
				{
				setState(1125);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQ) {
					{
					setState(1124);
					match(EQ);
					}
				}

				setState(1127);
				((TablePropertyContext)_localctx).value = tablePropertyValue();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TablePropertyKeyContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode STRING() { return getToken(KrystaSqlParser.STRING, 0); }
		public TablePropertyKeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tablePropertyKey; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).enterTablePropertyKey(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).exitTablePropertyKey(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KrystaSqlVisitor ) return ((KrystaSqlVisitor<? extends T>)visitor).visitTablePropertyKey(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TablePropertyKeyContext tablePropertyKey() throws RecognitionException {
		TablePropertyKeyContext _localctx = new TablePropertyKeyContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_tablePropertyKey);
		int _la;
		try {
			setState(1139);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
			case BACKQUOTED_IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1130);
				identifier();
				setState(1135);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4) {
					{
					{
					setState(1131);
					match(T__4);
					setState(1132);
					identifier();
					}
					}
					setState(1137);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(1138);
				match(STRING);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TablePropertyValueContext extends ParserRuleContext {
		public TerminalNode INTEGER_VALUE() { return getToken(KrystaSqlParser.INTEGER_VALUE, 0); }
		public TerminalNode DECIMAL_VALUE() { return getToken(KrystaSqlParser.DECIMAL_VALUE, 0); }
		public BooleanValueContext booleanValue() {
			return getRuleContext(BooleanValueContext.class,0);
		}
		public TerminalNode STRING() { return getToken(KrystaSqlParser.STRING, 0); }
		public TablePropertyValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tablePropertyValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).enterTablePropertyValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).exitTablePropertyValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KrystaSqlVisitor ) return ((KrystaSqlVisitor<? extends T>)visitor).visitTablePropertyValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TablePropertyValueContext tablePropertyValue() throws RecognitionException {
		TablePropertyValueContext _localctx = new TablePropertyValueContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_tablePropertyValue);
		try {
			setState(1145);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER_VALUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1141);
				match(INTEGER_VALUE);
				}
				break;
			case DECIMAL_VALUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1142);
				match(DECIMAL_VALUE);
				}
				break;
			case FALSE:
			case TRUE:
				enterOuterAlt(_localctx, 3);
				{
				setState(1143);
				booleanValue();
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 4);
				{
				setState(1144);
				match(STRING);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NamespaceContext extends ParserRuleContext {
		public TerminalNode NAMESPACE() { return getToken(KrystaSqlParser.NAMESPACE, 0); }
		public TerminalNode DATABASE() { return getToken(KrystaSqlParser.DATABASE, 0); }
		public TerminalNode SCHEMA() { return getToken(KrystaSqlParser.SCHEMA, 0); }
		public NamespaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namespace; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).enterNamespace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).exitNamespace(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KrystaSqlVisitor ) return ((KrystaSqlVisitor<? extends T>)visitor).visitNamespace(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamespaceContext namespace() throws RecognitionException {
		NamespaceContext _localctx = new NamespaceContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_namespace);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1147);
			_la = _input.LA(1);
			if ( !(_la==DATABASE || _la==NAMESPACE || _la==SCHEMA) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CreateTableHeaderContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(KrystaSqlParser.CREATE, 0); }
		public TerminalNode TABLE() { return getToken(KrystaSqlParser.TABLE, 0); }
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TerminalNode TEMPORARY() { return getToken(KrystaSqlParser.TEMPORARY, 0); }
		public TerminalNode EXTERNAL() { return getToken(KrystaSqlParser.EXTERNAL, 0); }
		public TerminalNode IF() { return getToken(KrystaSqlParser.IF, 0); }
		public TerminalNode NOT() { return getToken(KrystaSqlParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(KrystaSqlParser.EXISTS, 0); }
		public CreateTableHeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createTableHeader; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).enterCreateTableHeader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).exitCreateTableHeader(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KrystaSqlVisitor ) return ((KrystaSqlVisitor<? extends T>)visitor).visitCreateTableHeader(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateTableHeaderContext createTableHeader() throws RecognitionException {
		CreateTableHeaderContext _localctx = new CreateTableHeaderContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_createTableHeader);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1149);
			match(CREATE);
			setState(1151);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TEMPORARY) {
				{
				setState(1150);
				match(TEMPORARY);
				}
			}

			setState(1154);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTERNAL) {
				{
				setState(1153);
				match(EXTERNAL);
				}
			}

			setState(1156);
			match(TABLE);
			setState(1160);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(1157);
				match(IF);
				setState(1158);
				match(NOT);
				setState(1159);
				match(EXISTS);
				}
			}

			setState(1162);
			identifierList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DmlStatementNoWithContext extends ParserRuleContext {
		public DmlStatementNoWithContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dmlStatementNoWith; }
	 
		public DmlStatementNoWithContext() { }
		public void copyFrom(DmlStatementNoWithContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class InsertIntoValuesContext extends DmlStatementNoWithContext {
		public TerminalNode INSERT() { return getToken(KrystaSqlParser.INSERT, 0); }
		public TerminalNode INTO() { return getToken(KrystaSqlParser.INTO, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TerminalNode VALUES() { return getToken(KrystaSqlParser.VALUES, 0); }
		public InsertValuesContext insertValues() {
			return getRuleContext(InsertValuesContext.class,0);
		}
		public InsertIntoValuesContext(DmlStatementNoWithContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).enterInsertIntoValues(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).exitInsertIntoValues(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KrystaSqlVisitor ) return ((KrystaSqlVisitor<? extends T>)visitor).visitInsertIntoValues(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DeleteFromTableContext extends DmlStatementNoWithContext {
		public TerminalNode DELETE() { return getToken(KrystaSqlParser.DELETE, 0); }
		public TerminalNode FROM() { return getToken(KrystaSqlParser.FROM, 0); }
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TableAliasContext tableAlias() {
			return getRuleContext(TableAliasContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public DeleteFromTableContext(DmlStatementNoWithContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).enterDeleteFromTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).exitDeleteFromTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KrystaSqlVisitor ) return ((KrystaSqlVisitor<? extends T>)visitor).visitDeleteFromTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SingleInsertQueryContext extends DmlStatementNoWithContext {
		public InsertIntoContext insertInto() {
			return getRuleContext(InsertIntoContext.class,0);
		}
		public QueryTermContext queryTerm() {
			return getRuleContext(QueryTermContext.class,0);
		}
		public QueryOrganizationContext queryOrganization() {
			return getRuleContext(QueryOrganizationContext.class,0);
		}
		public SingleInsertQueryContext(DmlStatementNoWithContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).enterSingleInsertQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).exitSingleInsertQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KrystaSqlVisitor ) return ((KrystaSqlVisitor<? extends T>)visitor).visitSingleInsertQuery(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MultiInsertQueryContext extends DmlStatementNoWithContext {
		public FromClauseContext fromClause() {
			return getRuleContext(FromClauseContext.class,0);
		}
		public List<MultiInsertQueryBodyContext> multiInsertQueryBody() {
			return getRuleContexts(MultiInsertQueryBodyContext.class);
		}
		public MultiInsertQueryBodyContext multiInsertQueryBody(int i) {
			return getRuleContext(MultiInsertQueryBodyContext.class,i);
		}
		public MultiInsertQueryContext(DmlStatementNoWithContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).enterMultiInsertQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).exitMultiInsertQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KrystaSqlVisitor ) return ((KrystaSqlVisitor<? extends T>)visitor).visitMultiInsertQuery(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UpdateTableContext extends DmlStatementNoWithContext {
		public TerminalNode UPDATE() { return getToken(KrystaSqlParser.UPDATE, 0); }
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TableAliasContext tableAlias() {
			return getRuleContext(TableAliasContext.class,0);
		}
		public SetClauseContext setClause() {
			return getRuleContext(SetClauseContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public UpdateTableContext(DmlStatementNoWithContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).enterUpdateTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).exitUpdateTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KrystaSqlVisitor ) return ((KrystaSqlVisitor<? extends T>)visitor).visitUpdateTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DmlStatementNoWithContext dmlStatementNoWith() throws RecognitionException {
		DmlStatementNoWithContext _localctx = new DmlStatementNoWithContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_dmlStatementNoWith);
		int _la;
		try {
			setState(1197);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,157,_ctx) ) {
			case 1:
				_localctx = new InsertIntoValuesContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1164);
				match(INSERT);
				setState(1165);
				match(INTO);
				setState(1166);
				identifier();
				setState(1167);
				match(T__1);
				setState(1168);
				identifierList();
				setState(1169);
				match(T__2);
				setState(1170);
				match(VALUES);
				setState(1171);
				insertValues();
				}
				break;
			case 2:
				_localctx = new SingleInsertQueryContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1173);
				insertInto();
				setState(1174);
				queryTerm();
				setState(1175);
				queryOrganization();
				}
				break;
			case 3:
				_localctx = new MultiInsertQueryContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1177);
				fromClause();
				setState(1179); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1178);
					multiInsertQueryBody();
					}
					}
					setState(1181); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==INSERT );
				}
				break;
			case 4:
				_localctx = new DeleteFromTableContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1183);
				match(DELETE);
				setState(1184);
				match(FROM);
				setState(1185);
				identifierList();
				setState(1186);
				tableAlias();
				setState(1188);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHERE) {
					{
					setState(1187);
					whereClause();
					}
				}

				}
				break;
			case 5:
				_localctx = new UpdateTableContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1190);
				match(UPDATE);
				setState(1191);
				identifierList();
				setState(1192);
				tableAlias();
				setState(1193);
				setClause();
				setState(1195);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHERE) {
					{
					setState(1194);
					whereClause();
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InsertIntoContext extends ParserRuleContext {
		public InsertIntoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insertInto; }
	 
		public InsertIntoContext() { }
		public void copyFrom(InsertIntoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class InsertOverwriteHiveDirContext extends InsertIntoContext {
		public Token path;
		public TerminalNode INSERT() { return getToken(KrystaSqlParser.INSERT, 0); }
		public TerminalNode OVERWRITE() { return getToken(KrystaSqlParser.OVERWRITE, 0); }
		public TerminalNode DIRECTORY() { return getToken(KrystaSqlParser.DIRECTORY, 0); }
		public TerminalNode STRING() { return getToken(KrystaSqlParser.STRING, 0); }
		public TerminalNode LOCAL() { return getToken(KrystaSqlParser.LOCAL, 0); }
		public RowFormatContext rowFormat() {
			return getRuleContext(RowFormatContext.class,0);
		}
		public CreateFileFormatContext createFileFormat() {
			return getRuleContext(CreateFileFormatContext.class,0);
		}
		public InsertOverwriteHiveDirContext(InsertIntoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).enterInsertOverwriteHiveDir(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).exitInsertOverwriteHiveDir(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KrystaSqlVisitor ) return ((KrystaSqlVisitor<? extends T>)visitor).visitInsertOverwriteHiveDir(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InsertOverwriteDirContext extends InsertIntoContext {
		public Token path;
		public TablePropertyListContext options;
		public TerminalNode INSERT() { return getToken(KrystaSqlParser.INSERT, 0); }
		public TerminalNode OVERWRITE() { return getToken(KrystaSqlParser.OVERWRITE, 0); }
		public TerminalNode DIRECTORY() { return getToken(KrystaSqlParser.DIRECTORY, 0); }
		public TableProviderContext tableProvider() {
			return getRuleContext(TableProviderContext.class,0);
		}
		public TerminalNode LOCAL() { return getToken(KrystaSqlParser.LOCAL, 0); }
		public TerminalNode OPTIONS() { return getToken(KrystaSqlParser.OPTIONS, 0); }
		public TerminalNode STRING() { return getToken(KrystaSqlParser.STRING, 0); }
		public TablePropertyListContext tablePropertyList() {
			return getRuleContext(TablePropertyListContext.class,0);
		}
		public InsertOverwriteDirContext(InsertIntoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).enterInsertOverwriteDir(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).exitInsertOverwriteDir(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KrystaSqlVisitor ) return ((KrystaSqlVisitor<? extends T>)visitor).visitInsertOverwriteDir(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InsertOverwriteTableContext extends InsertIntoContext {
		public TerminalNode INSERT() { return getToken(KrystaSqlParser.INSERT, 0); }
		public TerminalNode OVERWRITE() { return getToken(KrystaSqlParser.OVERWRITE, 0); }
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TerminalNode TABLE() { return getToken(KrystaSqlParser.TABLE, 0); }
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public TerminalNode IF() { return getToken(KrystaSqlParser.IF, 0); }
		public TerminalNode NOT() { return getToken(KrystaSqlParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(KrystaSqlParser.EXISTS, 0); }
		public InsertOverwriteTableContext(InsertIntoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).enterInsertOverwriteTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).exitInsertOverwriteTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KrystaSqlVisitor ) return ((KrystaSqlVisitor<? extends T>)visitor).visitInsertOverwriteTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InsertIntoTableContext extends InsertIntoContext {
		public TerminalNode INSERT() { return getToken(KrystaSqlParser.INSERT, 0); }
		public TerminalNode INTO() { return getToken(KrystaSqlParser.INTO, 0); }
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TerminalNode TABLE() { return getToken(KrystaSqlParser.TABLE, 0); }
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public TerminalNode IF() { return getToken(KrystaSqlParser.IF, 0); }
		public TerminalNode NOT() { return getToken(KrystaSqlParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(KrystaSqlParser.EXISTS, 0); }
		public InsertIntoTableContext(InsertIntoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).enterInsertIntoTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).exitInsertIntoTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KrystaSqlVisitor ) return ((KrystaSqlVisitor<? extends T>)visitor).visitInsertIntoTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InsertIntoContext insertInto() throws RecognitionException {
		InsertIntoContext _localctx = new InsertIntoContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_insertInto);
		int _la;
		try {
			setState(1254);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,170,_ctx) ) {
			case 1:
				_localctx = new InsertOverwriteTableContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1199);
				match(INSERT);
				setState(1200);
				match(OVERWRITE);
				setState(1202);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TABLE) {
					{
					setState(1201);
					match(TABLE);
					}
				}

				setState(1204);
				identifierList();
				setState(1211);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(1205);
					partitionSpec();
					setState(1209);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==IF) {
						{
						setState(1206);
						match(IF);
						setState(1207);
						match(NOT);
						setState(1208);
						match(EXISTS);
						}
					}

					}
				}

				}
				break;
			case 2:
				_localctx = new InsertIntoTableContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1213);
				match(INSERT);
				setState(1214);
				match(INTO);
				setState(1216);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TABLE) {
					{
					setState(1215);
					match(TABLE);
					}
				}

				setState(1218);
				identifierList();
				setState(1220);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(1219);
					partitionSpec();
					}
				}

				setState(1225);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IF) {
					{
					setState(1222);
					match(IF);
					setState(1223);
					match(NOT);
					setState(1224);
					match(EXISTS);
					}
				}

				}
				break;
			case 3:
				_localctx = new InsertOverwriteHiveDirContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1227);
				match(INSERT);
				setState(1228);
				match(OVERWRITE);
				setState(1230);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LOCAL) {
					{
					setState(1229);
					match(LOCAL);
					}
				}

				setState(1232);
				match(DIRECTORY);
				setState(1233);
				((InsertOverwriteHiveDirContext)_localctx).path = match(STRING);
				setState(1235);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ROW) {
					{
					setState(1234);
					rowFormat();
					}
				}

				setState(1238);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STORED) {
					{
					setState(1237);
					createFileFormat();
					}
				}

				}
				break;
			case 4:
				_localctx = new InsertOverwriteDirContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1240);
				match(INSERT);
				setState(1241);
				match(OVERWRITE);
				setState(1243);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LOCAL) {
					{
					setState(1242);
					match(LOCAL);
					}
				}

				setState(1245);
				match(DIRECTORY);
				setState(1247);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STRING) {
					{
					setState(1246);
					((InsertOverwriteDirContext)_localctx).path = match(STRING);
					}
				}

				setState(1249);
				tableProvider();
				setState(1252);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPTIONS) {
					{
					setState(1250);
					match(OPTIONS);
					setState(1251);
					((InsertOverwriteDirContext)_localctx).options = tablePropertyList();
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantListContext extends ParserRuleContext {
		public List<ConstantContext> constant() {
			return getRuleContexts(ConstantContext.class);
		}
		public ConstantContext constant(int i) {
			return getRuleContext(ConstantContext.class,i);
		}
		public ConstantListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).enterConstantList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).exitConstantList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KrystaSqlVisitor ) return ((KrystaSqlVisitor<? extends T>)visitor).visitConstantList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantListContext constantList() throws RecognitionException {
		ConstantListContext _localctx = new ConstantListContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_constantList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1256);
			constant();
			setState(1261);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(1257);
				match(T__3);
				setState(1258);
				constant();
				}
				}
				setState(1263);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InsertValuesContext extends ParserRuleContext {
		public List<ConstantListContext> constantList() {
			return getRuleContexts(ConstantListContext.class);
		}
		public ConstantListContext constantList(int i) {
			return getRuleContext(ConstantListContext.class,i);
		}
		public InsertValuesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insertValues; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).enterInsertValues(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).exitInsertValues(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KrystaSqlVisitor ) return ((KrystaSqlVisitor<? extends T>)visitor).visitInsertValues(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InsertValuesContext insertValues() throws RecognitionException {
		InsertValuesContext _localctx = new InsertValuesContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_insertValues);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1264);
			match(T__1);
			setState(1265);
			constantList();
			setState(1266);
			match(T__2);
			setState(1274);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(1267);
				match(T__3);
				setState(1268);
				match(T__1);
				setState(1269);
				constantList();
				setState(1270);
				match(T__2);
				}
				}
				setState(1276);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PartitionSpecContext extends ParserRuleContext {
		public TerminalNode PARTITION() { return getToken(KrystaSqlParser.PARTITION, 0); }
		public List<PartitionValContext> partitionVal() {
			return getRuleContexts(PartitionValContext.class);
		}
		public PartitionValContext partitionVal(int i) {
			return getRuleContext(PartitionValContext.class,i);
		}
		public PartitionSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partitionSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).enterPartitionSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).exitPartitionSpec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KrystaSqlVisitor ) return ((KrystaSqlVisitor<? extends T>)visitor).visitPartitionSpec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PartitionSpecContext partitionSpec() throws RecognitionException {
		PartitionSpecContext _localctx = new PartitionSpecContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_partitionSpec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1277);
			match(PARTITION);
			setState(1278);
			match(T__1);
			setState(1279);
			partitionVal();
			setState(1284);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(1280);
				match(T__3);
				setState(1281);
				partitionVal();
				}
				}
				setState(1286);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1287);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PartitionValContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode EQ() { return getToken(KrystaSqlParser.EQ, 0); }
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public PartitionValContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partitionVal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).enterPartitionVal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).exitPartitionVal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KrystaSqlVisitor ) return ((KrystaSqlVisitor<? extends T>)visitor).visitPartitionVal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PartitionValContext partitionVal() throws RecognitionException {
		PartitionValContext _localctx = new PartitionValContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_partitionVal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1289);
			identifier();
			setState(1292);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQ) {
				{
				setState(1290);
				match(EQ);
				setState(1291);
				constant();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RowFormatContext extends ParserRuleContext {
		public RowFormatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rowFormat; }
	 
		public RowFormatContext() { }
		public void copyFrom(RowFormatContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class RowFormatSerdeContext extends RowFormatContext {
		public Token name;
		public TablePropertyListContext props;
		public TerminalNode ROW() { return getToken(KrystaSqlParser.ROW, 0); }
		public TerminalNode FORMAT() { return getToken(KrystaSqlParser.FORMAT, 0); }
		public TerminalNode SERDE() { return getToken(KrystaSqlParser.SERDE, 0); }
		public TerminalNode STRING() { return getToken(KrystaSqlParser.STRING, 0); }
		public TerminalNode WITH() { return getToken(KrystaSqlParser.WITH, 0); }
		public TerminalNode SERDEPROPERTIES() { return getToken(KrystaSqlParser.SERDEPROPERTIES, 0); }
		public TablePropertyListContext tablePropertyList() {
			return getRuleContext(TablePropertyListContext.class,0);
		}
		public RowFormatSerdeContext(RowFormatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).enterRowFormatSerde(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).exitRowFormatSerde(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KrystaSqlVisitor ) return ((KrystaSqlVisitor<? extends T>)visitor).visitRowFormatSerde(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RowFormatDelimitedContext extends RowFormatContext {
		public Token fieldsTerminatedBy;
		public Token escapedBy;
		public Token collectionItemsTerminatedBy;
		public Token keysTerminatedBy;
		public Token linesSeparatedBy;
		public Token nullDefinedAs;
		public TerminalNode ROW() { return getToken(KrystaSqlParser.ROW, 0); }
		public TerminalNode FORMAT() { return getToken(KrystaSqlParser.FORMAT, 0); }
		public TerminalNode DELIMITED() { return getToken(KrystaSqlParser.DELIMITED, 0); }
		public TerminalNode FIELDS() { return getToken(KrystaSqlParser.FIELDS, 0); }
		public List<TerminalNode> TERMINATED() { return getTokens(KrystaSqlParser.TERMINATED); }
		public TerminalNode TERMINATED(int i) {
			return getToken(KrystaSqlParser.TERMINATED, i);
		}
		public List<TerminalNode> BY() { return getTokens(KrystaSqlParser.BY); }
		public TerminalNode BY(int i) {
			return getToken(KrystaSqlParser.BY, i);
		}
		public TerminalNode COLLECTION() { return getToken(KrystaSqlParser.COLLECTION, 0); }
		public TerminalNode ITEMS() { return getToken(KrystaSqlParser.ITEMS, 0); }
		public TerminalNode MAP() { return getToken(KrystaSqlParser.MAP, 0); }
		public TerminalNode KEYS() { return getToken(KrystaSqlParser.KEYS, 0); }
		public TerminalNode LINES() { return getToken(KrystaSqlParser.LINES, 0); }
		public TerminalNode NULL() { return getToken(KrystaSqlParser.NULL, 0); }
		public TerminalNode DEFINED() { return getToken(KrystaSqlParser.DEFINED, 0); }
		public TerminalNode AS() { return getToken(KrystaSqlParser.AS, 0); }
		public List<TerminalNode> STRING() { return getTokens(KrystaSqlParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(KrystaSqlParser.STRING, i);
		}
		public TerminalNode ESCAPED() { return getToken(KrystaSqlParser.ESCAPED, 0); }
		public RowFormatDelimitedContext(RowFormatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).enterRowFormatDelimited(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).exitRowFormatDelimited(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KrystaSqlVisitor ) return ((KrystaSqlVisitor<? extends T>)visitor).visitRowFormatDelimited(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RowFormatContext rowFormat() throws RecognitionException {
		RowFormatContext _localctx = new RowFormatContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_rowFormat);
		int _la;
		try {
			setState(1343);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,182,_ctx) ) {
			case 1:
				_localctx = new RowFormatSerdeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1294);
				match(ROW);
				setState(1295);
				match(FORMAT);
				setState(1296);
				match(SERDE);
				setState(1297);
				((RowFormatSerdeContext)_localctx).name = match(STRING);
				setState(1301);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WITH) {
					{
					setState(1298);
					match(WITH);
					setState(1299);
					match(SERDEPROPERTIES);
					setState(1300);
					((RowFormatSerdeContext)_localctx).props = tablePropertyList();
					}
				}

				}
				break;
			case 2:
				_localctx = new RowFormatDelimitedContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1303);
				match(ROW);
				setState(1304);
				match(FORMAT);
				setState(1305);
				match(DELIMITED);
				setState(1315);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FIELDS) {
					{
					setState(1306);
					match(FIELDS);
					setState(1307);
					match(TERMINATED);
					setState(1308);
					match(BY);
					setState(1309);
					((RowFormatDelimitedContext)_localctx).fieldsTerminatedBy = match(STRING);
					setState(1313);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ESCAPED) {
						{
						setState(1310);
						match(ESCAPED);
						setState(1311);
						match(BY);
						setState(1312);
						((RowFormatDelimitedContext)_localctx).escapedBy = match(STRING);
						}
					}

					}
				}

				setState(1322);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLLECTION) {
					{
					setState(1317);
					match(COLLECTION);
					setState(1318);
					match(ITEMS);
					setState(1319);
					match(TERMINATED);
					setState(1320);
					match(BY);
					setState(1321);
					((RowFormatDelimitedContext)_localctx).collectionItemsTerminatedBy = match(STRING);
					}
				}

				setState(1329);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MAP) {
					{
					setState(1324);
					match(MAP);
					setState(1325);
					match(KEYS);
					setState(1326);
					match(TERMINATED);
					setState(1327);
					match(BY);
					setState(1328);
					((RowFormatDelimitedContext)_localctx).keysTerminatedBy = match(STRING);
					}
				}

				setState(1335);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LINES) {
					{
					setState(1331);
					match(LINES);
					setState(1332);
					match(TERMINATED);
					setState(1333);
					match(BY);
					setState(1334);
					((RowFormatDelimitedContext)_localctx).linesSeparatedBy = match(STRING);
					}
				}

				setState(1341);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NULL) {
					{
					setState(1337);
					match(NULL);
					setState(1338);
					match(DEFINED);
					setState(1339);
					match(AS);
					setState(1340);
					((RowFormatDelimitedContext)_localctx).nullDefinedAs = match(STRING);
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CreateFileFormatContext extends ParserRuleContext {
		public TerminalNode STORED() { return getToken(KrystaSqlParser.STORED, 0); }
		public TerminalNode AS() { return getToken(KrystaSqlParser.AS, 0); }
		public FileFormatContext fileFormat() {
			return getRuleContext(FileFormatContext.class,0);
		}
		public TerminalNode BY() { return getToken(KrystaSqlParser.BY, 0); }
		public StorageHandlerContext storageHandler() {
			return getRuleContext(StorageHandlerContext.class,0);
		}
		public CreateFileFormatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createFileFormat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).enterCreateFileFormat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).exitCreateFileFormat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KrystaSqlVisitor ) return ((KrystaSqlVisitor<? extends T>)visitor).visitCreateFileFormat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateFileFormatContext createFileFormat() throws RecognitionException {
		CreateFileFormatContext _localctx = new CreateFileFormatContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_createFileFormat);
		try {
			setState(1351);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,183,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1345);
				match(STORED);
				setState(1346);
				match(AS);
				setState(1347);
				fileFormat();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1348);
				match(STORED);
				setState(1349);
				match(BY);
				setState(1350);
				storageHandler();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FileFormatContext extends ParserRuleContext {
		public FileFormatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fileFormat; }
	 
		public FileFormatContext() { }
		public void copyFrom(FileFormatContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TableFileFormatContext extends FileFormatContext {
		public Token inFmt;
		public Token outFmt;
		public TerminalNode INPUTFORMAT() { return getToken(KrystaSqlParser.INPUTFORMAT, 0); }
		public TerminalNode OUTPUTFORMAT() { return getToken(KrystaSqlParser.OUTPUTFORMAT, 0); }
		public List<TerminalNode> STRING() { return getTokens(KrystaSqlParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(KrystaSqlParser.STRING, i);
		}
		public TableFileFormatContext(FileFormatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).enterTableFileFormat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).exitTableFileFormat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KrystaSqlVisitor ) return ((KrystaSqlVisitor<? extends T>)visitor).visitTableFileFormat(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GenericFileFormatContext extends FileFormatContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public GenericFileFormatContext(FileFormatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).enterGenericFileFormat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).exitGenericFileFormat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KrystaSqlVisitor ) return ((KrystaSqlVisitor<? extends T>)visitor).visitGenericFileFormat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FileFormatContext fileFormat() throws RecognitionException {
		FileFormatContext _localctx = new FileFormatContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_fileFormat);
		try {
			setState(1358);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INPUTFORMAT:
				_localctx = new TableFileFormatContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1353);
				match(INPUTFORMAT);
				setState(1354);
				((TableFileFormatContext)_localctx).inFmt = match(STRING);
				setState(1355);
				match(OUTPUTFORMAT);
				setState(1356);
				((TableFileFormatContext)_localctx).outFmt = match(STRING);
				}
				break;
			case IDENTIFIER:
			case BACKQUOTED_IDENTIFIER:
				_localctx = new GenericFileFormatContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1357);
				identifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TableProviderContext extends ParserRuleContext {
		public TerminalNode USING() { return getToken(KrystaSqlParser.USING, 0); }
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TableProviderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableProvider; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).enterTableProvider(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).exitTableProvider(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KrystaSqlVisitor ) return ((KrystaSqlVisitor<? extends T>)visitor).visitTableProvider(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableProviderContext tableProvider() throws RecognitionException {
		TableProviderContext _localctx = new TableProviderContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_tableProvider);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1360);
			match(USING);
			setState(1361);
			identifierList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StorageHandlerContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(KrystaSqlParser.STRING, 0); }
		public TerminalNode WITH() { return getToken(KrystaSqlParser.WITH, 0); }
		public TerminalNode SERDEPROPERTIES() { return getToken(KrystaSqlParser.SERDEPROPERTIES, 0); }
		public TablePropertyListContext tablePropertyList() {
			return getRuleContext(TablePropertyListContext.class,0);
		}
		public StorageHandlerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_storageHandler; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).enterStorageHandler(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).exitStorageHandler(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KrystaSqlVisitor ) return ((KrystaSqlVisitor<? extends T>)visitor).visitStorageHandler(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StorageHandlerContext storageHandler() throws RecognitionException {
		StorageHandlerContext _localctx = new StorageHandlerContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_storageHandler);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1363);
			match(STRING);
			setState(1367);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(1364);
				match(WITH);
				setState(1365);
				match(SERDEPROPERTIES);
				setState(1366);
				tablePropertyList();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MultiInsertQueryBodyContext extends ParserRuleContext {
		public InsertIntoContext insertInto() {
			return getRuleContext(InsertIntoContext.class,0);
		}
		public FromStatementBodyContext fromStatementBody() {
			return getRuleContext(FromStatementBodyContext.class,0);
		}
		public MultiInsertQueryBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiInsertQueryBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).enterMultiInsertQueryBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).exitMultiInsertQueryBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KrystaSqlVisitor ) return ((KrystaSqlVisitor<? extends T>)visitor).visitMultiInsertQueryBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiInsertQueryBodyContext multiInsertQueryBody() throws RecognitionException {
		MultiInsertQueryBodyContext _localctx = new MultiInsertQueryBodyContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_multiInsertQueryBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1369);
			insertInto();
			setState(1370);
			fromStatementBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DescribeColNameContext extends ParserRuleContext {
		public IdentifierContext identifier;
		public List<IdentifierContext> nameParts = new ArrayList<IdentifierContext>();
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public DescribeColNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_describeColName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).enterDescribeColName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).exitDescribeColName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KrystaSqlVisitor ) return ((KrystaSqlVisitor<? extends T>)visitor).visitDescribeColName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DescribeColNameContext describeColName() throws RecognitionException {
		DescribeColNameContext _localctx = new DescribeColNameContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_describeColName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1372);
			((DescribeColNameContext)_localctx).identifier = identifier();
			((DescribeColNameContext)_localctx).nameParts.add(((DescribeColNameContext)_localctx).identifier);
			setState(1377);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(1373);
				match(T__4);
				setState(1374);
				((DescribeColNameContext)_localctx).identifier = identifier();
				((DescribeColNameContext)_localctx).nameParts.add(((DescribeColNameContext)_localctx).identifier);
				}
				}
				setState(1379);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TableIdentifierContext extends ParserRuleContext {
		public IdentifierContext db;
		public IdentifierContext table;
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TableIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).enterTableIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).exitTableIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KrystaSqlVisitor ) return ((KrystaSqlVisitor<? extends T>)visitor).visitTableIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableIdentifierContext tableIdentifier() throws RecognitionException {
		TableIdentifierContext _localctx = new TableIdentifierContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_tableIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1383);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,187,_ctx) ) {
			case 1:
				{
				setState(1380);
				((TableIdentifierContext)_localctx).db = identifier();
				setState(1381);
				match(T__4);
				}
				break;
			}
			setState(1385);
			((TableIdentifierContext)_localctx).table = identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ColTypeListContext extends ParserRuleContext {
		public List<ColTypeContext> colType() {
			return getRuleContexts(ColTypeContext.class);
		}
		public ColTypeContext colType(int i) {
			return getRuleContext(ColTypeContext.class,i);
		}
		public ColTypeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_colTypeList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).enterColTypeList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).exitColTypeList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KrystaSqlVisitor ) return ((KrystaSqlVisitor<? extends T>)visitor).visitColTypeList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColTypeListContext colTypeList() throws RecognitionException {
		ColTypeListContext _localctx = new ColTypeListContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_colTypeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1387);
			colType();
			setState(1392);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(1388);
				match(T__3);
				setState(1389);
				colType();
				}
				}
				setState(1394);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ColTypeContext extends ParserRuleContext {
		public IdentifierContext colName;
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode NOT() { return getToken(KrystaSqlParser.NOT, 0); }
		public TerminalNode NULL() { return getToken(KrystaSqlParser.NULL, 0); }
		public CommentSpecContext commentSpec() {
			return getRuleContext(CommentSpecContext.class,0);
		}
		public ColTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_colType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).enterColType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).exitColType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KrystaSqlVisitor ) return ((KrystaSqlVisitor<? extends T>)visitor).visitColType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColTypeContext colType() throws RecognitionException {
		ColTypeContext _localctx = new ColTypeContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_colType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1395);
			((ColTypeContext)_localctx).colName = identifier();
			setState(1396);
			dataType();
			setState(1399);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(1397);
				match(NOT);
				setState(1398);
				match(NULL);
				}
			}

			setState(1402);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMENT) {
				{
				setState(1401);
				commentSpec();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CommentSpecContext extends ParserRuleContext {
		public TerminalNode COMMENT() { return getToken(KrystaSqlParser.COMMENT, 0); }
		public TerminalNode STRING() { return getToken(KrystaSqlParser.STRING, 0); }
		public CommentSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commentSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).enterCommentSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).exitCommentSpec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KrystaSqlVisitor ) return ((KrystaSqlVisitor<? extends T>)visitor).visitCommentSpec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommentSpecContext commentSpec() throws RecognitionException {
		CommentSpecContext _localctx = new CommentSpecContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_commentSpec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1404);
			match(COMMENT);
			setState(1405);
			match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LocationSpecContext extends ParserRuleContext {
		public TerminalNode LOCATION() { return getToken(KrystaSqlParser.LOCATION, 0); }
		public TerminalNode STRING() { return getToken(KrystaSqlParser.STRING, 0); }
		public LocationSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_locationSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).enterLocationSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).exitLocationSpec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KrystaSqlVisitor ) return ((KrystaSqlVisitor<? extends T>)visitor).visitLocationSpec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocationSpecContext locationSpec() throws RecognitionException {
		LocationSpecContext _localctx = new LocationSpecContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_locationSpec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1407);
			match(LOCATION);
			setState(1408);
			match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentListContext extends ParserRuleContext {
		public List<AssignmentContext> assignment() {
			return getRuleContexts(AssignmentContext.class);
		}
		public AssignmentContext assignment(int i) {
			return getRuleContext(AssignmentContext.class,i);
		}
		public AssignmentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).enterAssignmentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).exitAssignmentList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KrystaSqlVisitor ) return ((KrystaSqlVisitor<? extends T>)visitor).visitAssignmentList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentListContext assignmentList() throws RecognitionException {
		AssignmentListContext _localctx = new AssignmentListContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_assignmentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1410);
			assignment();
			setState(1415);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(1411);
				match(T__3);
				setState(1412);
				assignment();
				}
				}
				setState(1417);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentContext extends ParserRuleContext {
		public IdentifierListContext key;
		public ExpressionContext value;
		public TerminalNode EQ() { return getToken(KrystaSqlParser.EQ, 0); }
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KrystaSqlVisitor ) return ((KrystaSqlVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1418);
			((AssignmentContext)_localctx).key = identifierList();
			setState(1419);
			match(EQ);
			setState(1420);
			((AssignmentContext)_localctx).value = expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BooleanValueContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(KrystaSqlParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(KrystaSqlParser.FALSE, 0); }
		public BooleanValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).enterBooleanValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).exitBooleanValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KrystaSqlVisitor ) return ((KrystaSqlVisitor<? extends T>)visitor).visitBooleanValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanValueContext booleanValue() throws RecognitionException {
		BooleanValueContext _localctx = new BooleanValueContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_booleanValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1422);
			_la = _input.LA(1);
			if ( !(_la==FALSE || _la==TRUE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SetQuantifierContext extends ParserRuleContext {
		public TerminalNode DISTINCT() { return getToken(KrystaSqlParser.DISTINCT, 0); }
		public TerminalNode ALL() { return getToken(KrystaSqlParser.ALL, 0); }
		public SetQuantifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setQuantifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).enterSetQuantifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).exitSetQuantifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KrystaSqlVisitor ) return ((KrystaSqlVisitor<? extends T>)visitor).visitSetQuantifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetQuantifierContext setQuantifier() throws RecognitionException {
		SetQuantifierContext _localctx = new SetQuantifierContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_setQuantifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1424);
			_la = _input.LA(1);
			if ( !(_la==ALL || _la==DISTINCT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DataTypeContext extends ParserRuleContext {
		public DataTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataType; }
	 
		public DataTypeContext() { }
		public void copyFrom(DataTypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ComplexDataTypeContext extends DataTypeContext {
		public Token complex;
		public TerminalNode LT() { return getToken(KrystaSqlParser.LT, 0); }
		public List<DataTypeContext> dataType() {
			return getRuleContexts(DataTypeContext.class);
		}
		public DataTypeContext dataType(int i) {
			return getRuleContext(DataTypeContext.class,i);
		}
		public TerminalNode GT() { return getToken(KrystaSqlParser.GT, 0); }
		public TerminalNode ARRAY() { return getToken(KrystaSqlParser.ARRAY, 0); }
		public TerminalNode MAP() { return getToken(KrystaSqlParser.MAP, 0); }
		public ComplexDataTypeContext(DataTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).enterComplexDataType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).exitComplexDataType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KrystaSqlVisitor ) return ((KrystaSqlVisitor<? extends T>)visitor).visitComplexDataType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrimitiveDataTypeContext extends DataTypeContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<TerminalNode> INTEGER_VALUE() { return getTokens(KrystaSqlParser.INTEGER_VALUE); }
		public TerminalNode INTEGER_VALUE(int i) {
			return getToken(KrystaSqlParser.INTEGER_VALUE, i);
		}
		public PrimitiveDataTypeContext(DataTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).enterPrimitiveDataType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).exitPrimitiveDataType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KrystaSqlVisitor ) return ((KrystaSqlVisitor<? extends T>)visitor).visitPrimitiveDataType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataTypeContext dataType() throws RecognitionException {
		DataTypeContext _localctx = new DataTypeContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_dataType);
		int _la;
		try {
			setState(1451);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ARRAY:
				_localctx = new ComplexDataTypeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1426);
				((ComplexDataTypeContext)_localctx).complex = match(ARRAY);
				setState(1427);
				match(LT);
				setState(1428);
				dataType();
				setState(1429);
				match(GT);
				}
				break;
			case MAP:
				_localctx = new ComplexDataTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1431);
				((ComplexDataTypeContext)_localctx).complex = match(MAP);
				setState(1432);
				match(LT);
				setState(1433);
				dataType();
				setState(1434);
				match(T__3);
				setState(1435);
				dataType();
				setState(1436);
				match(GT);
				}
				break;
			case IDENTIFIER:
			case BACKQUOTED_IDENTIFIER:
				_localctx = new PrimitiveDataTypeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1438);
				identifier();
				setState(1449);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(1439);
					match(T__1);
					setState(1440);
					match(INTEGER_VALUE);
					setState(1445);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(1441);
						match(T__3);
						setState(1442);
						match(INTEGER_VALUE);
						}
						}
						setState(1447);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1448);
					match(T__2);
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierContext extends ParserRuleContext {
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
	 
		public IdentifierContext() { }
		public void copyFrom(IdentifierContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class QuotedIdentifierContext extends IdentifierContext {
		public TerminalNode BACKQUOTED_IDENTIFIER() { return getToken(KrystaSqlParser.BACKQUOTED_IDENTIFIER, 0); }
		public QuotedIdentifierContext(IdentifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).enterQuotedIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).exitQuotedIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KrystaSqlVisitor ) return ((KrystaSqlVisitor<? extends T>)visitor).visitQuotedIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnquotedIdentifierContext extends IdentifierContext {
		public TerminalNode IDENTIFIER() { return getToken(KrystaSqlParser.IDENTIFIER, 0); }
		public UnquotedIdentifierContext(IdentifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).enterUnquotedIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).exitUnquotedIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KrystaSqlVisitor ) return ((KrystaSqlVisitor<? extends T>)visitor).visitUnquotedIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_identifier);
		try {
			setState(1455);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				_localctx = new UnquotedIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1453);
				match(IDENTIFIER);
				}
				break;
			case BACKQUOTED_IDENTIFIER:
				_localctx = new QuotedIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1454);
				match(BACKQUOTED_IDENTIFIER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierListContext extends ParserRuleContext {
		public IdentifierSeqContext identifierSeq() {
			return getRuleContext(IdentifierSeqContext.class,0);
		}
		public IdentifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).enterIdentifierList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).exitIdentifierList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KrystaSqlVisitor ) return ((KrystaSqlVisitor<? extends T>)visitor).visitIdentifierList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierListContext identifierList() throws RecognitionException {
		IdentifierListContext _localctx = new IdentifierListContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_identifierList);
		try {
			setState(1462);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1457);
				match(T__1);
				setState(1458);
				identifierSeq();
				setState(1459);
				match(T__2);
				}
				break;
			case IDENTIFIER:
			case BACKQUOTED_IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(1461);
				identifierSeq();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierSeqContext extends ParserRuleContext {
		public IdentifierContext identifier;
		public List<IdentifierContext> ident = new ArrayList<IdentifierContext>();
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public IdentifierSeqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierSeq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).enterIdentifierSeq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).exitIdentifierSeq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KrystaSqlVisitor ) return ((KrystaSqlVisitor<? extends T>)visitor).visitIdentifierSeq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierSeqContext identifierSeq() throws RecognitionException {
		IdentifierSeqContext _localctx = new IdentifierSeqContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_identifierSeq);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1464);
			((IdentifierSeqContext)_localctx).identifier = identifier();
			((IdentifierSeqContext)_localctx).ident.add(((IdentifierSeqContext)_localctx).identifier);
			setState(1469);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,197,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1465);
					match(T__3);
					setState(1466);
					((IdentifierSeqContext)_localctx).identifier = identifier();
					((IdentifierSeqContext)_localctx).ident.add(((IdentifierSeqContext)_localctx).identifier);
					}
					} 
				}
				setState(1471);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,197,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QualifiedNameContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public QualifiedNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).enterQualifiedName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).exitQualifiedName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KrystaSqlVisitor ) return ((KrystaSqlVisitor<? extends T>)visitor).visitQualifiedName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualifiedNameContext qualifiedName() throws RecognitionException {
		QualifiedNameContext _localctx = new QualifiedNameContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_qualifiedName);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1472);
			identifier();
			setState(1477);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,198,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1473);
					match(T__4);
					setState(1474);
					identifier();
					}
					} 
				}
				setState(1479);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,198,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumberContext extends ParserRuleContext {
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
	 
		public NumberContext() { }
		public void copyFrom(NumberContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BigIntLiteralContext extends NumberContext {
		public TerminalNode BIGINT_LITERAL() { return getToken(KrystaSqlParser.BIGINT_LITERAL, 0); }
		public TerminalNode MINUS() { return getToken(KrystaSqlParser.MINUS, 0); }
		public BigIntLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).enterBigIntLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).exitBigIntLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KrystaSqlVisitor ) return ((KrystaSqlVisitor<? extends T>)visitor).visitBigIntLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TinyIntLiteralContext extends NumberContext {
		public TerminalNode TINYINT_LITERAL() { return getToken(KrystaSqlParser.TINYINT_LITERAL, 0); }
		public TerminalNode MINUS() { return getToken(KrystaSqlParser.MINUS, 0); }
		public TinyIntLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).enterTinyIntLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).exitTinyIntLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KrystaSqlVisitor ) return ((KrystaSqlVisitor<? extends T>)visitor).visitTinyIntLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BigDecimalLiteralContext extends NumberContext {
		public TerminalNode BIGDECIMAL_LITERAL() { return getToken(KrystaSqlParser.BIGDECIMAL_LITERAL, 0); }
		public TerminalNode MINUS() { return getToken(KrystaSqlParser.MINUS, 0); }
		public BigDecimalLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).enterBigDecimalLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).exitBigDecimalLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KrystaSqlVisitor ) return ((KrystaSqlVisitor<? extends T>)visitor).visitBigDecimalLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DoubleLiteralContext extends NumberContext {
		public TerminalNode DOUBLE_LITERAL() { return getToken(KrystaSqlParser.DOUBLE_LITERAL, 0); }
		public TerminalNode MINUS() { return getToken(KrystaSqlParser.MINUS, 0); }
		public DoubleLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).enterDoubleLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).exitDoubleLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KrystaSqlVisitor ) return ((KrystaSqlVisitor<? extends T>)visitor).visitDoubleLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntegerLiteralContext extends NumberContext {
		public TerminalNode INTEGER_VALUE() { return getToken(KrystaSqlParser.INTEGER_VALUE, 0); }
		public TerminalNode MINUS() { return getToken(KrystaSqlParser.MINUS, 0); }
		public IntegerLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).enterIntegerLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).exitIntegerLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KrystaSqlVisitor ) return ((KrystaSqlVisitor<? extends T>)visitor).visitIntegerLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SmallIntLiteralContext extends NumberContext {
		public TerminalNode SMALLINT_LITERAL() { return getToken(KrystaSqlParser.SMALLINT_LITERAL, 0); }
		public TerminalNode MINUS() { return getToken(KrystaSqlParser.MINUS, 0); }
		public SmallIntLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).enterSmallIntLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KrystaSqlListener ) ((KrystaSqlListener)listener).exitSmallIntLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KrystaSqlVisitor ) return ((KrystaSqlVisitor<? extends T>)visitor).visitSmallIntLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_number);
		int _la;
		try {
			setState(1504);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,205,_ctx) ) {
			case 1:
				_localctx = new IntegerLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1481);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(1480);
					match(MINUS);
					}
				}

				setState(1483);
				match(INTEGER_VALUE);
				}
				break;
			case 2:
				_localctx = new BigIntLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1485);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(1484);
					match(MINUS);
					}
				}

				setState(1487);
				match(BIGINT_LITERAL);
				}
				break;
			case 3:
				_localctx = new SmallIntLiteralContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1489);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(1488);
					match(MINUS);
					}
				}

				setState(1491);
				match(SMALLINT_LITERAL);
				}
				break;
			case 4:
				_localctx = new TinyIntLiteralContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1493);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(1492);
					match(MINUS);
					}
				}

				setState(1495);
				match(TINYINT_LITERAL);
				}
				break;
			case 5:
				_localctx = new DoubleLiteralContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1497);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(1496);
					match(MINUS);
					}
				}

				setState(1499);
				match(DOUBLE_LITERAL);
				}
				break;
			case 6:
				_localctx = new BigDecimalLiteralContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(1501);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(1500);
					match(MINUS);
					}
				}

				setState(1503);
				match(BIGDECIMAL_LITERAL);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 18:
			return booleanExpression_sempred((BooleanExpressionContext)_localctx, predIndex);
		case 20:
			return valueExpression_sempred((ValueExpressionContext)_localctx, predIndex);
		case 21:
			return primaryExpression_sempred((PrimaryExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean booleanExpression_sempred(BooleanExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean valueExpression_sempred(ValueExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 6);
		case 3:
			return precpred(_ctx, 5);
		case 4:
			return precpred(_ctx, 4);
		case 5:
			return precpred(_ctx, 3);
		case 6:
			return precpred(_ctx, 2);
		case 7:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean primaryExpression_sempred(PrimaryExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 8:
			return precpred(_ctx, 8);
		case 9:
			return precpred(_ctx, 6);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u0123\u05e5\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\3\2\3\2\7\2\u0095\n\2\f\2\16\2\u0098\13\2\3\2\3\2\3\3\3\3\3\3\3\3"+
		"\5\3\u00a0\n\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\u00a8\n\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\7\3\u00b0\n\3\f\3\16\3\u00b3\13\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\u00c6\n\3\3\3\3\3\5\3\u00ca"+
		"\n\3\3\3\3\3\3\3\3\3\5\3\u00d0\n\3\3\3\5\3\u00d3\n\3\3\3\5\3\u00d6\n\3"+
		"\3\3\3\3\3\3\3\3\3\3\5\3\u00dd\n\3\3\3\3\3\3\3\5\3\u00e2\n\3\3\3\5\3\u00e5"+
		"\n\3\3\3\3\3\3\3\3\3\3\3\5\3\u00ec\n\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\5\3\u00f8\n\3\3\3\3\3\3\3\3\3\3\3\7\3\u00ff\n\3\f\3\16\3\u0102"+
		"\13\3\3\3\5\3\u0105\n\3\3\3\5\3\u0108\n\3\3\3\3\3\3\3\3\3\3\3\5\3\u010f"+
		"\n\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3\u011a\n\3\f\3\16\3\u011d"+
		"\13\3\3\3\3\3\3\3\3\3\5\3\u0123\n\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\5\3\u012e\n\3\3\3\3\3\3\3\3\3\5\3\u0134\n\3\3\3\3\3\5\3\u0138\n\3\3"+
		"\3\3\3\5\3\u013c\n\3\3\3\3\3\3\3\3\3\3\3\5\3\u0143\n\3\3\3\5\3\u0146\n"+
		"\3\3\3\5\3\u0149\n\3\3\3\3\3\3\3\3\3\3\3\5\3\u0150\n\3\3\3\3\3\3\3\5\3"+
		"\u0155\n\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\u015e\n\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\5\3\u0166\n\3\3\3\3\3\3\3\3\3\5\3\u016c\n\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\5\3\u0174\n\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\u017c\n\3\3\3\3\3\3\3\3"+
		"\3\5\3\u0182\n\3\3\3\5\3\u0185\n\3\3\3\3\3\5\3\u0189\n\3\3\3\5\3\u018c"+
		"\n\3\3\3\3\3\5\3\u0190\n\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3\u01a7\n\3\f\3\16\3\u01aa"+
		"\13\3\5\3\u01ac\n\3\3\3\3\3\5\3\u01b0\n\3\3\3\3\3\3\3\3\3\5\3\u01b6\n"+
		"\3\3\3\5\3\u01b9\n\3\3\3\5\3\u01bc\n\3\3\3\3\3\3\3\3\3\5\3\u01c2\n\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\5\3\u01ca\n\3\3\3\3\3\3\3\5\3\u01cf\n\3\3\3\3\3"+
		"\3\3\3\3\5\3\u01d5\n\3\3\3\3\3\3\3\3\3\5\3\u01db\n\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\7\3\u01e5\n\3\f\3\16\3\u01e8\13\3\5\3\u01ea\n\3\5\3\u01ec"+
		"\n\3\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\7\6\u01f8\n\6\f\6\16\6\u01fb"+
		"\13\6\5\6\u01fd\n\6\3\6\5\6\u0200\n\6\3\6\3\6\3\6\5\6\u0205\n\6\5\6\u0207"+
		"\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u0211\n\7\3\b\3\b\5\b\u0215\n"+
		"\b\3\b\5\b\u0218\n\b\3\b\5\b\u021b\n\b\3\b\5\b\u021e\n\b\3\b\5\b\u0221"+
		"\n\b\3\t\3\t\6\t\u0225\n\t\r\t\16\t\u0226\3\n\3\n\5\n\u022b\n\n\3\n\5"+
		"\n\u022e\n\n\3\n\5\n\u0231\n\n\3\n\5\n\u0234\n\n\3\n\3\n\3\13\3\13\5\13"+
		"\u023a\n\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\7\r\u0246\n\r\f"+
		"\r\16\r\u0249\13\r\3\16\3\16\3\16\3\17\3\17\3\17\3\17\7\17\u0252\n\17"+
		"\f\17\16\17\u0255\13\17\3\20\3\20\3\20\3\20\7\20\u025b\n\20\f\20\16\20"+
		"\u025e\13\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\24\3"+
		"\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u0274\n\24\5\24\u0276"+
		"\n\24\3\24\3\24\3\24\3\24\3\24\3\24\7\24\u027e\n\24\f\24\16\24\u0281\13"+
		"\24\3\25\5\25\u0284\n\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u028c\n\25"+
		"\3\25\3\25\3\25\3\25\3\25\7\25\u0293\n\25\f\25\16\25\u0296\13\25\3\25"+
		"\3\25\3\25\5\25\u029b\n\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u02a3\n"+
		"\25\3\25\3\25\3\25\5\25\u02a8\n\25\3\25\3\25\3\25\3\25\5\25\u02ae\n\25"+
		"\3\25\3\25\5\25\u02b2\n\25\3\25\3\25\3\25\5\25\u02b7\n\25\3\25\3\25\3"+
		"\25\5\25\u02bc\n\25\3\25\3\25\3\25\5\25\u02c1\n\25\3\26\3\26\3\26\3\26"+
		"\5\26\u02c7\n\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\7\26\u02dc\n\26\f\26\16\26\u02df"+
		"\13\26\3\27\3\27\3\27\3\27\6\27\u02e5\n\27\r\27\16\27\u02e6\3\27\3\27"+
		"\5\27\u02eb\n\27\3\27\3\27\3\27\3\27\3\27\6\27\u02f2\n\27\r\27\16\27\u02f3"+
		"\3\27\3\27\5\27\u02f8\n\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\7\27\u0308\n\27\f\27\16\27\u030b\13\27\5\27"+
		"\u030d\n\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u0315\n\27\3\27\3\27\3"+
		"\27\3\27\3\27\3\27\3\27\5\27\u031e\n\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\6\27"+
		"\u0333\n\27\r\27\16\27\u0334\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3"+
		"\27\3\27\3\27\3\27\3\27\3\27\6\27\u0345\n\27\r\27\16\27\u0346\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u0360\n\27\3\27\3\27\3\27\3\27"+
		"\3\27\5\27\u0367\n\27\3\27\5\27\u036a\n\27\3\27\3\27\3\27\3\27\3\27\3"+
		"\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u0379\n\27\3\27\3\27\5\27"+
		"\u037d\n\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\7\27\u0387\n\27\f"+
		"\27\16\27\u038a\13\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\6\30\u0393\n"+
		"\30\r\30\16\30\u0394\5\30\u0397\n\30\3\31\3\31\3\32\3\32\5\32\u039d\n"+
		"\32\3\32\3\32\5\32\u03a1\n\32\5\32\u03a3\n\32\3\33\3\33\3\33\7\33\u03a8"+
		"\n\33\f\33\16\33\u03ab\13\33\3\34\3\34\5\34\u03af\n\34\3\34\3\34\5\34"+
		"\u03b3\n\34\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\7\36\u03c4\n\36\f\36\16\36\u03c7\13\36\3\36\3\36\3\36"+
		"\3\36\3\36\7\36\u03ce\n\36\f\36\16\36\u03d1\13\36\5\36\u03d3\n\36\3\36"+
		"\3\36\3\36\3\36\3\36\7\36\u03da\n\36\f\36\16\36\u03dd\13\36\5\36\u03df"+
		"\n\36\5\36\u03e1\n\36\3\36\5\36\u03e4\n\36\3\36\5\36\u03e7\n\36\3\37\3"+
		"\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3"+
		"\37\5\37\u03f9\n\37\3 \3 \3 \3 \3 \3 \3 \5 \u0402\n \3!\3!\7!\u0406\n"+
		"!\f!\16!\u0409\13!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\""+
		"\5\"\u0418\n\"\3#\5#\u041b\n#\3#\5#\u041e\n#\3$\3$\3$\3$\5$\u0424\n$\3"+
		"$\3$\3$\3$\3$\5$\u042b\n$\3%\5%\u042e\n%\3%\3%\3%\5%\u0433\n%\3%\5%\u0436"+
		"\n%\3%\3%\3%\5%\u043b\n%\3%\3%\5%\u043f\n%\3%\5%\u0442\n%\3%\5%\u0445"+
		"\n%\3&\3&\3&\3&\5&\u044b\n&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\7\'\u0456"+
		"\n\'\f\'\16\'\u0459\13\'\3(\3(\3(\3(\7(\u045f\n(\f(\16(\u0462\13(\3(\3"+
		"(\3)\3)\5)\u0468\n)\3)\5)\u046b\n)\3*\3*\3*\7*\u0470\n*\f*\16*\u0473\13"+
		"*\3*\5*\u0476\n*\3+\3+\3+\3+\5+\u047c\n+\3,\3,\3-\3-\5-\u0482\n-\3-\5"+
		"-\u0485\n-\3-\3-\3-\3-\5-\u048b\n-\3-\3-\3.\3.\3.\3.\3.\3.\3.\3.\3.\3"+
		".\3.\3.\3.\3.\3.\6.\u049e\n.\r.\16.\u049f\3.\3.\3.\3.\3.\5.\u04a7\n.\3"+
		".\3.\3.\3.\3.\5.\u04ae\n.\5.\u04b0\n.\3/\3/\3/\5/\u04b5\n/\3/\3/\3/\3"+
		"/\3/\5/\u04bc\n/\5/\u04be\n/\3/\3/\3/\5/\u04c3\n/\3/\3/\5/\u04c7\n/\3"+
		"/\3/\3/\5/\u04cc\n/\3/\3/\3/\5/\u04d1\n/\3/\3/\3/\5/\u04d6\n/\3/\5/\u04d9"+
		"\n/\3/\3/\3/\5/\u04de\n/\3/\3/\5/\u04e2\n/\3/\3/\3/\5/\u04e7\n/\5/\u04e9"+
		"\n/\3\60\3\60\3\60\7\60\u04ee\n\60\f\60\16\60\u04f1\13\60\3\61\3\61\3"+
		"\61\3\61\3\61\3\61\3\61\3\61\7\61\u04fb\n\61\f\61\16\61\u04fe\13\61\3"+
		"\62\3\62\3\62\3\62\3\62\7\62\u0505\n\62\f\62\16\62\u0508\13\62\3\62\3"+
		"\62\3\63\3\63\3\63\5\63\u050f\n\63\3\64\3\64\3\64\3\64\3\64\3\64\3\64"+
		"\5\64\u0518\n\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\5\64"+
		"\u0524\n\64\5\64\u0526\n\64\3\64\3\64\3\64\3\64\3\64\5\64\u052d\n\64\3"+
		"\64\3\64\3\64\3\64\3\64\5\64\u0534\n\64\3\64\3\64\3\64\3\64\5\64\u053a"+
		"\n\64\3\64\3\64\3\64\3\64\5\64\u0540\n\64\5\64\u0542\n\64\3\65\3\65\3"+
		"\65\3\65\3\65\3\65\5\65\u054a\n\65\3\66\3\66\3\66\3\66\3\66\5\66\u0551"+
		"\n\66\3\67\3\67\3\67\38\38\38\38\58\u055a\n8\39\39\39\3:\3:\3:\7:\u0562"+
		"\n:\f:\16:\u0565\13:\3;\3;\3;\5;\u056a\n;\3;\3;\3<\3<\3<\7<\u0571\n<\f"+
		"<\16<\u0574\13<\3=\3=\3=\3=\5=\u057a\n=\3=\5=\u057d\n=\3>\3>\3>\3?\3?"+
		"\3?\3@\3@\3@\7@\u0588\n@\f@\16@\u058b\13@\3A\3A\3A\3A\3B\3B\3C\3C\3D\3"+
		"D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\7D\u05a6\nD\fD\16D\u05a9"+
		"\13D\3D\5D\u05ac\nD\5D\u05ae\nD\3E\3E\5E\u05b2\nE\3F\3F\3F\3F\3F\5F\u05b9"+
		"\nF\3G\3G\3G\7G\u05be\nG\fG\16G\u05c1\13G\3H\3H\3H\7H\u05c6\nH\fH\16H"+
		"\u05c9\13H\3I\5I\u05cc\nI\3I\3I\5I\u05d0\nI\3I\3I\5I\u05d4\nI\3I\3I\5"+
		"I\u05d8\nI\3I\3I\5I\u05dc\nI\3I\3I\5I\u05e0\nI\3I\5I\u05e3\nI\3I\4\u01a8"+
		"\u01e6\5&*,J\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64"+
		"\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088"+
		"\u008a\u008c\u008e\u0090\2\35\4\2??\u00b0\u00b0\4\2\37\37\u00be\u00be"+
		"\4\2>>\u0092\u0092\4\2ccoo\7\2\'\'\63\63UUbb\u008b\u008b\3\2CD\4\2UUb"+
		"b\4\2\u0096\u0096\u0114\u0114\4\2\13\13\u0085\u0085\5\2XX\u00ec\u00ec"+
		"\u00f4\u00f4\4\2\u010a\u010b\u010f\u010f\4\2JJ\u010c\u010e\4\2\u010a\u010b"+
		"\u0112\u0112\4\288::\3\2\u00dc\u00dd\4\2\6\6cc\4\2\6\6__\5\2\32\32\u0080"+
		"\u0080\u00e7\u00e7\3\2\u0102\u0109\4\2\26\26CC\4\2]]}}\4\2II\u00a6\u00a6"+
		"\4\2\u009e\u009e\u00d5\u00d5\4\2^^\u00ad\u00ad\5\2==\u0091\u0091\u00c8"+
		"\u00c8\4\2XX\u00ec\u00ec\4\2\r\rHH\2\u06d1\2\u0092\3\2\2\2\4\u01eb\3\2"+
		"\2\2\6\u01ed\3\2\2\2\b\u01f0\3\2\2\2\n\u01fc\3\2\2\2\f\u0210\3\2\2\2\16"+
		"\u0212\3\2\2\2\20\u0222\3\2\2\2\22\u0228\3\2\2\2\24\u0237\3\2\2\2\26\u023d"+
		"\3\2\2\2\30\u0240\3\2\2\2\32\u024a\3\2\2\2\34\u024d\3\2\2\2\36\u0256\3"+
		"\2\2\2 \u025f\3\2\2\2\"\u0264\3\2\2\2$\u0267\3\2\2\2&\u0275\3\2\2\2(\u02c0"+
		"\3\2\2\2*\u02c6\3\2\2\2,\u037c\3\2\2\2.\u0396\3\2\2\2\60\u0398\3\2\2\2"+
		"\62\u039a\3\2\2\2\64\u03a4\3\2\2\2\66\u03ac\3\2\2\28\u03b4\3\2\2\2:\u03e6"+
		"\3\2\2\2<\u03f8\3\2\2\2>\u0401\3\2\2\2@\u0403\3\2\2\2B\u0417\3\2\2\2D"+
		"\u041d\3\2\2\2F\u042a\3\2\2\2H\u0444\3\2\2\2J\u044a\3\2\2\2L\u0457\3\2"+
		"\2\2N\u045a\3\2\2\2P\u0465\3\2\2\2R\u0475\3\2\2\2T\u047b\3\2\2\2V\u047d"+
		"\3\2\2\2X\u047f\3\2\2\2Z\u04af\3\2\2\2\\\u04e8\3\2\2\2^\u04ea\3\2\2\2"+
		"`\u04f2\3\2\2\2b\u04ff\3\2\2\2d\u050b\3\2\2\2f\u0541\3\2\2\2h\u0549\3"+
		"\2\2\2j\u0550\3\2\2\2l\u0552\3\2\2\2n\u0555\3\2\2\2p\u055b\3\2\2\2r\u055e"+
		"\3\2\2\2t\u0569\3\2\2\2v\u056d\3\2\2\2x\u0575\3\2\2\2z\u057e\3\2\2\2|"+
		"\u0581\3\2\2\2~\u0584\3\2\2\2\u0080\u058c\3\2\2\2\u0082\u0590\3\2\2\2"+
		"\u0084\u0592\3\2\2\2\u0086\u05ad\3\2\2\2\u0088\u05b1\3\2\2\2\u008a\u05b8"+
		"\3\2\2\2\u008c\u05ba\3\2\2\2\u008e\u05c2\3\2\2\2\u0090\u05e2\3\2\2\2\u0092"+
		"\u0096\5\4\3\2\u0093\u0095\7\3\2\2\u0094\u0093\3\2\2\2\u0095\u0098\3\2"+
		"\2\2\u0096\u0094\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u0099\3\2\2\2\u0098"+
		"\u0096\3\2\2\2\u0099\u009a\7\2\2\3\u009a\3\3\2\2\2\u009b\u01ec\5\6\4\2"+
		"\u009c\u01ec\5Z.\2\u009d\u009f\7\u00f8\2\2\u009e\u00a0\7\u0091\2\2\u009f"+
		"\u009e\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u01ec\5\u008a"+
		"F\2\u00a2\u00a3\7\64\2\2\u00a3\u00a7\5V,\2\u00a4\u00a5\7l\2\2\u00a5\u00a6"+
		"\7\u0095\2\2\u00a6\u00a8\7R\2\2\u00a7\u00a4\3\2\2\2\u00a7\u00a8\3\2\2"+
		"\2\u00a8\u00a9\3\2\2\2\u00a9\u00b1\5\u008aF\2\u00aa\u00b0\5z>\2\u00ab"+
		"\u00b0\5|?\2\u00ac\u00ad\7\u0101\2\2\u00ad\u00ae\t\2\2\2\u00ae\u00b0\5"+
		"N(\2\u00af\u00aa\3\2\2\2\u00af\u00ab\3\2\2\2\u00af\u00ac\3\2\2\2\u00b0"+
		"\u00b3\3\2\2\2\u00b1\u00af\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\u01ec\3\2"+
		"\2\2\u00b3\u00b1\3\2\2\2\u00b4\u00b5\7\16\2\2\u00b5\u00b6\5V,\2\u00b6"+
		"\u00b7\5\u008aF\2\u00b7\u00b8\7\u00cf\2\2\u00b8\u00b9\t\2\2\2\u00b9\u00ba"+
		"\5N(\2\u00ba\u01ec\3\2\2\2\u00bb\u00bc\7\16\2\2\u00bc\u00bd\5V,\2\u00bd"+
		"\u00be\5\u008aF\2\u00be\u00bf\7\u00cf\2\2\u00bf\u00c0\5|?\2\u00c0\u01ec"+
		"\3\2\2\2\u00c1\u00c2\7K\2\2\u00c2\u00c5\5V,\2\u00c3\u00c4\7l\2\2\u00c4"+
		"\u00c6\7R\2\2\u00c5\u00c3\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c7\3\2"+
		"\2\2\u00c7\u00c9\5\u008aF\2\u00c8\u00ca\t\3\2\2\u00c9\u00c8\3\2\2\2\u00c9"+
		"\u00ca\3\2\2\2\u00ca\u01ec\3\2\2\2\u00cb\u00cc\7\u00d2\2\2\u00cc\u00cf"+
		"\t\4\2\2\u00cd\u00ce\t\5\2\2\u00ce\u00d0\5\u008aF\2\u00cf\u00cd\3\2\2"+
		"\2\u00cf\u00d0\3\2\2\2\u00d0\u00d5\3\2\2\2\u00d1\u00d3\7\u0082\2\2\u00d2"+
		"\u00d1\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00d6\7\u0114"+
		"\2\2\u00d5\u00d2\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\u01ec\3\2\2\2\u00d7"+
		"\u00dc\5X-\2\u00d8\u00d9\7\4\2\2\u00d9\u00da\5v<\2\u00da\u00db\7\5\2\2"+
		"\u00db\u00dd\3\2\2\2\u00dc\u00d8\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00de"+
		"\3\2\2\2\u00de\u00df\5l\67\2\u00df\u00e4\5L\'\2\u00e0\u00e2\7\25\2\2\u00e1"+
		"\u00e0\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e5\5\6"+
		"\4\2\u00e4\u00e1\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\u01ec\3\2\2\2\u00e6"+
		"\u00eb\5X-\2\u00e7\u00e8\7\4\2\2\u00e8\u00e9\5v<\2\u00e9\u00ea\7\5\2\2"+
		"\u00ea\u00ec\3\2\2\2\u00eb\u00e7\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\u0100"+
		"\3\2\2\2\u00ed\u00ff\5z>\2\u00ee\u00ef\7\u00a7\2\2\u00ef\u00f0\7\35\2"+
		"\2\u00f0\u00f1\7\4\2\2\u00f1\u00f2\5v<\2\u00f2\u00f3\7\5\2\2\u00f3\u00f8"+
		"\3\2\2\2\u00f4\u00f5\7\u00a7\2\2\u00f5\u00f6\7\35\2\2\u00f6\u00f8\5\u008a"+
		"F\2\u00f7\u00ee\3\2\2\2\u00f7\u00f4\3\2\2\2\u00f8\u00ff\3\2\2\2\u00f9"+
		"\u00ff\5f\64\2\u00fa\u00ff\5h\65\2\u00fb\u00ff\5|?\2\u00fc\u00fd\7\u00e1"+
		"\2\2\u00fd\u00ff\5N(\2\u00fe\u00ed\3\2\2\2\u00fe\u00f7\3\2\2\2\u00fe\u00f9"+
		"\3\2\2\2\u00fe\u00fa\3\2\2\2\u00fe\u00fb\3\2\2\2\u00fe\u00fc\3\2\2\2\u00ff"+
		"\u0102\3\2\2\2\u0100\u00fe\3\2\2\2\u0100\u0101\3\2\2\2\u0101\u0107\3\2"+
		"\2\2\u0102\u0100\3\2\2\2\u0103\u0105\7\25\2\2\u0104\u0103\3\2\2\2\u0104"+
		"\u0105\3\2\2\2\u0105\u0106\3\2\2\2\u0106\u0108\5\6\4\2\u0107\u0104\3\2"+
		"\2\2\u0107\u0108\3\2\2\2\u0108\u01ec\3\2\2\2\u0109\u010a\7\64\2\2\u010a"+
		"\u010e\7\u00de\2\2\u010b\u010c\7l\2\2\u010c\u010d\7\u0095\2\2\u010d\u010f"+
		"\7R\2\2\u010e\u010b\3\2\2\2\u010e\u010f\3\2\2\2\u010f\u0110\3\2\2\2\u0110"+
		"\u0111\5t;\2\u0111\u0112\7\u0082\2\2\u0112\u011b\5t;\2\u0113\u011a\5l"+
		"\67\2\u0114\u011a\5f\64\2\u0115\u011a\5h\65\2\u0116\u011a\5|?\2\u0117"+
		"\u0118\7\u00e1\2\2\u0118\u011a\5N(\2\u0119\u0113\3\2\2\2\u0119\u0114\3"+
		"\2\2\2\u0119\u0115\3\2\2\2\u0119\u0116\3\2\2\2\u0119\u0117\3\2\2\2\u011a"+
		"\u011d\3\2\2\2\u011b\u0119\3\2\2\2\u011b\u011c\3\2\2\2\u011c\u01ec\3\2"+
		"\2\2\u011d\u011b\3\2\2\2\u011e\u011f\7\17\2\2\u011f\u0120\7\u00de\2\2"+
		"\u0120\u0122\5\u008aF\2\u0121\u0123\5b\62\2\u0122\u0121\3\2\2\2\u0122"+
		"\u0123\3\2\2\2\u0123\u0124\3\2\2\2\u0124\u0125\7\60\2\2\u0125\u012d\7"+
		"\u00d8\2\2\u0126\u012e\5\u0088E\2\u0127\u0128\7_\2\2\u0128\u0129\7+\2"+
		"\2\u0129\u012e\5\u008cG\2\u012a\u012b\7_\2\2\u012b\u012c\7\r\2\2\u012c"+
		"\u012e\7+\2\2\u012d\u0126\3\2\2\2\u012d\u0127\3\2\2\2\u012d\u012a\3\2"+
		"\2\2\u012d\u012e\3\2\2\2\u012e\u01ec\3\2\2\2\u012f\u0130\7K\2\2\u0130"+
		"\u0133\7\u00de\2\2\u0131\u0132\7l\2\2\u0132\u0134\7R\2\2\u0133\u0131\3"+
		"\2\2\2\u0133\u0134\3\2\2\2\u0134\u0135\3\2\2\2\u0135\u0137\5\u008aF\2"+
		"\u0136\u0138\7\u00b1\2\2\u0137\u0136\3\2\2\2\u0137\u0138\3\2\2\2\u0138"+
		"\u01ec\3\2\2\2\u0139\u013b\7S\2\2\u013a\u013c\t\6\2\2\u013b\u013a\3\2"+
		"\2\2\u013b\u013c\3\2\2\2\u013c\u013d\3\2\2\2\u013d\u01ec\5\4\3\2\u013e"+
		"\u013f\7\u00d2\2\2\u013f\u0142\7\u00df\2\2\u0140\u0141\t\5\2\2\u0141\u0143"+
		"\5\u008aF\2\u0142\u0140\3\2\2\2\u0142\u0143\3\2\2\2\u0143\u0148\3\2\2"+
		"\2\u0144\u0146\7\u0082\2\2\u0145\u0144\3\2\2\2\u0145\u0146\3\2\2\2\u0146"+
		"\u0147\3\2\2\2\u0147\u0149\7\u0114\2\2\u0148\u0145\3\2\2\2\u0148\u0149"+
		"\3\2\2\2\u0149\u01ec\3\2\2\2\u014a\u014b\7\u00d2\2\2\u014b\u014c\7\u00de"+
		"\2\2\u014c\u014f\7U\2\2\u014d\u014e\t\5\2\2\u014e\u0150\5\u008aF\2\u014f"+
		"\u014d\3\2\2\2\u014f\u0150\3\2\2\2\u0150\u0151\3\2\2\2\u0151\u0152\7\u0082"+
		"\2\2\u0152\u0154\7\u0114\2\2\u0153\u0155\5b\62\2\u0154\u0153\3\2\2\2\u0154"+
		"\u0155\3\2\2\2\u0155\u01ec\3\2\2\2\u0156\u0157\7\u00d2\2\2\u0157\u0158"+
		"\7\u00e1\2\2\u0158\u015d\5\u008aF\2\u0159\u015a\7\4\2\2\u015a\u015b\5"+
		"R*\2\u015b\u015c\7\5\2\2\u015c\u015e\3\2\2\2\u015d\u0159\3\2\2\2\u015d"+
		"\u015e\3\2\2\2\u015e\u01ec\3\2\2\2\u015f\u0160\7\u00d2\2\2\u0160\u0161"+
		"\7+\2\2\u0161\u0162\t\5\2\2\u0162\u0165\5\u008aF\2\u0163\u0164\t\5\2\2"+
		"\u0164\u0166\5\u008aF\2\u0165\u0163\3\2\2\2\u0165\u0166\3\2\2\2\u0166"+
		"\u01ec\3\2\2\2\u0167\u0168\7\u00d2\2\2\u0168\u0169\7\u00a8\2\2\u0169\u016b"+
		"\5\u008aF\2\u016a\u016c\5b\62\2\u016b\u016a\3\2\2\2\u016b\u016c\3\2\2"+
		"\2\u016c\u01ec\3\2\2\2\u016d\u016e\7\u00d2\2\2\u016e\u016f\7\64\2\2\u016f"+
		"\u0170\7\u00de\2\2\u0170\u0173\5\u008aF\2\u0171\u0172\7\25\2\2\u0172\u0174"+
		"\7\u00cc\2\2\u0173\u0171\3\2\2\2\u0173\u0174\3\2\2\2\u0174\u01ec\3\2\2"+
		"\2\u0175\u0176\7\u00d2\2\2\u0176\u0177\7\67\2\2\u0177\u01ec\7\u0091\2"+
		"\2\u0178\u0179\t\7\2\2\u0179\u017b\5V,\2\u017a\u017c\7U\2\2\u017b\u017a"+
		"\3\2\2\2\u017b\u017c\3\2\2\2\u017c\u017d\3\2\2\2\u017d\u017e\5\u008aF"+
		"\2\u017e\u01ec\3\2\2\2\u017f\u0181\t\7\2\2\u0180\u0182\7\u00de\2\2\u0181"+
		"\u0180\3\2\2\2\u0181\u0182\3\2\2\2\u0182\u0184\3\2\2\2\u0183\u0185\t\b"+
		"\2\2\u0184\u0183\3\2\2\2\u0184\u0185\3\2\2\2\u0185\u0186\3\2\2\2\u0186"+
		"\u0188\5\u008aF\2\u0187\u0189\5b\62\2\u0188\u0187\3\2\2\2\u0188\u0189"+
		"\3\2\2\2\u0189\u018b\3\2\2\2\u018a\u018c\5r:\2\u018b\u018a\3\2\2\2\u018b"+
		"\u018c\3\2\2\2\u018c\u01ec\3\2\2\2\u018d\u018f\t\7\2\2\u018e\u0190\7\u00b2"+
		"\2\2\u018f\u018e\3\2\2\2\u018f\u0190\3\2\2\2\u0190\u0191\3\2\2\2\u0191"+
		"\u01ec\5\6\4\2\u0192\u0193\7,\2\2\u0193\u0194\7\u0099\2\2\u0194\u0195"+
		"\5V,\2\u0195\u0196\5\u008aF\2\u0196\u0197\7y\2\2\u0197\u0198\t\t\2\2\u0198"+
		"\u01ec\3\2\2\2\u0199\u019a\7,\2\2\u019a\u019b\7\u0099\2\2\u019b\u019c"+
		"\7\u00de\2\2\u019c\u019d\5\u008aF\2\u019d\u019e\7y\2\2\u019e\u019f\t\t"+
		"\2\2\u019f\u01ec\3\2\2\2\u01a0\u01a1\7\u00b9\2\2\u01a1\u01a2\7\u00de\2"+
		"\2\u01a2\u01ec\5\u008aF\2\u01a3\u01ab\7\u00b9\2\2\u01a4\u01ac\7\u0114"+
		"\2\2\u01a5\u01a7\13\2\2\2\u01a6\u01a5\3\2\2\2\u01a7\u01aa\3\2\2\2\u01a8"+
		"\u01a9\3\2\2\2\u01a8\u01a6\3\2\2\2\u01a9\u01ac\3\2\2\2\u01aa\u01a8\3\2"+
		"\2\2\u01ab\u01a4\3\2\2\2\u01ab\u01a8\3\2\2\2\u01ac\u01ec\3\2\2\2\u01ad"+
		"\u01af\7\36\2\2\u01ae\u01b0\7\177\2\2\u01af\u01ae\3\2\2\2\u01af\u01b0"+
		"\3\2\2\2\u01b0\u01b1\3\2\2\2\u01b1\u01b2\7\u00de\2\2\u01b2\u01b5\5\u008a"+
		"F\2\u01b3\u01b4\7\u009c\2\2\u01b4\u01b6\5N(\2\u01b5\u01b3\3\2\2\2\u01b5"+
		"\u01b6\3\2\2\2\u01b6\u01bb\3\2\2\2\u01b7\u01b9\7\25\2\2\u01b8\u01b7\3"+
		"\2\2\2\u01b8\u01b9\3\2\2\2\u01b9\u01ba\3\2\2\2\u01ba\u01bc\5\6\4\2\u01bb"+
		"\u01b8\3\2\2\2\u01bb\u01bc\3\2\2\2\u01bc\u01ec\3\2\2\2\u01bd\u01be\7\u00f1"+
		"\2\2\u01be\u01c1\7\u00de\2\2\u01bf\u01c0\7l\2\2\u01c0\u01c2\7R\2\2\u01c1"+
		"\u01bf\3\2\2\2\u01c1\u01c2\3\2\2\2\u01c2\u01c3\3\2\2\2\u01c3\u01ec\5\u008a"+
		"F\2\u01c4\u01c5\7$\2\2\u01c5\u01ec\7\36\2\2\u01c6\u01c7\7\u0086\2\2\u01c7"+
		"\u01c9\7<\2\2\u01c8\u01ca\7\u0087\2\2\u01c9\u01c8\3\2\2\2\u01c9\u01ca"+
		"\3\2\2\2\u01ca\u01cb\3\2\2\2\u01cb\u01cc\7s\2\2\u01cc\u01ce\7\u0114\2"+
		"\2\u01cd\u01cf\7\u00a5\2\2\u01ce\u01cd\3\2\2\2\u01ce\u01cf\3\2\2\2\u01cf"+
		"\u01d0\3\2\2\2\u01d0\u01d1\7x\2\2\u01d1\u01d2\7\u00de\2\2\u01d2\u01d4"+
		"\5\u008aF\2\u01d3\u01d5\5b\62\2\u01d4\u01d3\3\2\2\2\u01d4\u01d5\3\2\2"+
		"\2\u01d5\u01ec\3\2\2\2\u01d6\u01d7\7\u00ed\2\2\u01d7\u01d8\7\u00de\2\2"+
		"\u01d8\u01da\5\u008aF\2\u01d9\u01db\5b\62\2\u01da\u01d9\3\2\2\2\u01da"+
		"\u01db\3\2\2\2\u01db\u01ec\3\2\2\2\u01dc\u01dd\7\u0090\2\2\u01dd\u01de"+
		"\7\u00bb\2\2\u01de\u01df\7\u00de\2\2\u01df\u01ec\5\u008aF\2\u01e0\u01e1"+
		"\t\n\2\2\u01e1\u01e9\5\u0088E\2\u01e2\u01ea\7\u0114\2\2\u01e3\u01e5\13"+
		"\2\2\2\u01e4\u01e3\3\2\2\2\u01e5\u01e8\3\2\2\2\u01e6\u01e7\3\2\2\2\u01e6"+
		"\u01e4\3\2\2\2\u01e7\u01ea\3\2\2\2\u01e8\u01e6\3\2\2\2\u01e9\u01e2\3\2"+
		"\2\2\u01e9\u01e6\3\2\2\2\u01ea\u01ec\3\2\2\2\u01eb\u009b\3\2\2\2\u01eb"+
		"\u009c\3\2\2\2\u01eb\u009d\3\2\2\2\u01eb\u00a2\3\2\2\2\u01eb\u00b4\3\2"+
		"\2\2\u01eb\u00bb\3\2\2\2\u01eb\u00c1\3\2\2\2\u01eb\u00cb\3\2\2\2\u01eb"+
		"\u00d7\3\2\2\2\u01eb\u00e6\3\2\2\2\u01eb\u0109\3\2\2\2\u01eb\u011e\3\2"+
		"\2\2\u01eb\u012f\3\2\2\2\u01eb\u0139\3\2\2\2\u01eb\u013e\3\2\2\2\u01eb"+
		"\u014a\3\2\2\2\u01eb\u0156\3\2\2\2\u01eb\u015f\3\2\2\2\u01eb\u0167\3\2"+
		"\2\2\u01eb\u016d\3\2\2\2\u01eb\u0175\3\2\2\2\u01eb\u0178\3\2\2\2\u01eb"+
		"\u017f\3\2\2\2\u01eb\u018d\3\2\2\2\u01eb\u0192\3\2\2\2\u01eb\u0199\3\2"+
		"\2\2\u01eb\u01a0\3\2\2\2\u01eb\u01a3\3\2\2\2\u01eb\u01ad\3\2\2\2\u01eb"+
		"\u01bd\3\2\2\2\u01eb\u01c4\3\2\2\2\u01eb\u01c6\3\2\2\2\u01eb\u01d6\3\2"+
		"\2\2\u01eb\u01dc\3\2\2\2\u01eb\u01e0\3\2\2\2\u01ec\5\3\2\2\2\u01ed\u01ee"+
		"\5\b\5\2\u01ee\u01ef\5\n\6\2\u01ef\7\3\2\2\2\u01f0\u01f1\5\f\7\2\u01f1"+
		"\t\3\2\2\2\u01f2\u01f3\7\u009e\2\2\u01f3\u01f4\7\35\2\2\u01f4\u01f9\5"+
		"\66\34\2\u01f5\u01f6\7\6\2\2\u01f6\u01f8\5\66\34\2\u01f7\u01f5\3\2\2\2"+
		"\u01f8\u01fb\3\2\2\2\u01f9\u01f7\3\2\2\2\u01f9\u01fa\3\2\2\2\u01fa\u01fd"+
		"\3\2\2\2\u01fb\u01f9\3\2\2\2\u01fc\u01f2\3\2\2\2\u01fc\u01fd\3\2\2\2\u01fd"+
		"\u01ff\3\2\2\2\u01fe\u0200\5\34\17\2\u01ff\u01fe\3\2\2\2\u01ff\u0200\3"+
		"\2\2\2\u0200\u0206\3\2\2\2\u0201\u0204\7\u0083\2\2\u0202\u0205\7\r\2\2"+
		"\u0203\u0205\5$\23\2\u0204\u0202\3\2\2\2\u0204\u0203\3\2\2\2\u0205\u0207"+
		"\3\2\2\2\u0206\u0201\3\2\2\2\u0206\u0207\3\2\2\2\u0207\13\3\2\2\2\u0208"+
		"\u0211\5\16\b\2\u0209\u0211\5\20\t\2\u020a\u020b\7\u00de\2\2\u020b\u0211"+
		"\5\u0088E\2\u020c\u020d\7\4\2\2\u020d\u020e\5\6\4\2\u020e\u020f\7\5\2"+
		"\2\u020f\u0211\3\2\2\2\u0210\u0208\3\2\2\2\u0210\u0209\3\2\2\2\u0210\u020a"+
		"\3\2\2\2\u0210\u020c\3\2\2\2\u0211\r\3\2\2\2\u0212\u0214\5\24\13\2\u0213"+
		"\u0215\5\36\20\2\u0214\u0213\3\2\2\2\u0214\u0215\3\2\2\2\u0215\u0217\3"+
		"\2\2\2\u0216\u0218\5\26\f\2\u0217\u0216\3\2\2\2\u0217\u0218\3\2\2\2\u0218"+
		"\u021a\3\2\2\2\u0219\u021b\5\30\r\2\u021a\u0219\3\2\2\2\u021a\u021b\3"+
		"\2\2\2\u021b\u021d\3\2\2\2\u021c\u021e\5\32\16\2\u021d\u021c\3\2\2\2\u021d"+
		"\u021e\3\2\2\2\u021e\u0220\3\2\2\2\u021f\u0221\5\34\17\2\u0220\u021f\3"+
		"\2\2\2\u0220\u0221\3\2\2\2\u0221\17\3\2\2\2\u0222\u0224\5\36\20\2\u0223"+
		"\u0225\5\22\n\2\u0224\u0223\3\2\2\2\u0225\u0226\3\2\2\2\u0226\u0224\3"+
		"\2\2\2\u0226\u0227\3\2\2\2\u0227\21\3\2\2\2\u0228\u022a\5\24\13\2\u0229"+
		"\u022b\5\26\f\2\u022a\u0229\3\2\2\2\u022a\u022b\3\2\2\2\u022b\u022d\3"+
		"\2\2\2\u022c\u022e\5\30\r\2\u022d\u022c\3\2\2\2\u022d\u022e\3\2\2\2\u022e"+
		"\u0230\3\2\2\2\u022f\u0231\5\32\16\2\u0230\u022f\3\2\2\2\u0230\u0231\3"+
		"\2\2\2\u0231\u0233\3\2\2\2\u0232\u0234\5\34\17\2\u0233\u0232\3\2\2\2\u0233"+
		"\u0234\3\2\2\2\u0234\u0235\3\2\2\2\u0235\u0236\5\n\6\2\u0236\23\3\2\2"+
		"\2\u0237\u0239\7\u00c9\2\2\u0238\u023a\5\u0084C\2\u0239\u0238\3\2\2\2"+
		"\u0239\u023a\3\2\2\2\u023a\u023b\3\2\2\2\u023b\u023c\5\64\33\2\u023c\25"+
		"\3\2\2\2\u023d\u023e\7\u00ff\2\2\u023e\u023f\5&\24\2\u023f\27\3\2\2\2"+
		"\u0240\u0241\7i\2\2\u0241\u0242\7\35\2\2\u0242\u0247\5$\23\2\u0243\u0244"+
		"\7\6\2\2\u0244\u0246\5$\23\2\u0245\u0243\3\2\2\2\u0246\u0249\3\2\2\2\u0247"+
		"\u0245\3\2\2\2\u0247\u0248\3\2\2\2\u0248\31\3\2\2\2\u0249\u0247\3\2\2"+
		"\2\u024a\u024b\7k\2\2\u024b\u024c\5&\24\2\u024c\33\3\2\2\2\u024d\u024e"+
		"\7\u0100\2\2\u024e\u0253\58\35\2\u024f\u0250\7\6\2\2\u0250\u0252\58\35"+
		"\2\u0251\u024f\3\2\2\2\u0252\u0255\3\2\2\2\u0253\u0251\3\2\2\2\u0253\u0254"+
		"\3\2\2\2\u0254\35\3\2\2\2\u0255\u0253\3\2\2\2\u0256\u0257\7c\2\2\u0257"+
		"\u025c\5@!\2\u0258\u0259\7\6\2\2\u0259\u025b\5@!\2\u025a\u0258\3\2\2\2"+
		"\u025b\u025e\3\2\2\2\u025c\u025a\3\2\2\2\u025c\u025d\3\2\2\2\u025d\37"+
		"\3\2\2\2\u025e\u025c\3\2\2\2\u025f\u0260\7\u00fe\2\2\u0260\u0261\5$\23"+
		"\2\u0261\u0262\7\u00e4\2\2\u0262\u0263\5$\23\2\u0263!\3\2\2\2\u0264\u0265"+
		"\7\u00cf\2\2\u0265\u0266\5~@\2\u0266#\3\2\2\2\u0267\u0268\5&\24\2\u0268"+
		"%\3\2\2\2\u0269\u026a\b\24\1\2\u026a\u026b\7\u0095\2\2\u026b\u0276\5&"+
		"\24\7\u026c\u026d\7R\2\2\u026d\u026e\7\4\2\2\u026e\u026f\5\6\4\2\u026f"+
		"\u0270\7\5\2\2\u0270\u0276\3\2\2\2\u0271\u0273\5*\26\2\u0272\u0274\5("+
		"\25\2\u0273\u0272\3\2\2\2\u0273\u0274\3\2\2\2\u0274\u0276\3\2\2\2\u0275"+
		"\u0269\3\2\2\2\u0275\u026c\3\2\2\2\u0275\u0271\3\2\2\2\u0276\u027f\3\2"+
		"\2\2\u0277\u0278\f\4\2\2\u0278\u0279\7\20\2\2\u0279\u027e\5&\24\5\u027a"+
		"\u027b\f\3\2\2\u027b\u027c\7\u009d\2\2\u027c\u027e\5&\24\4\u027d\u0277"+
		"\3\2\2\2\u027d\u027a\3\2\2\2\u027e\u0281\3\2\2\2\u027f\u027d\3\2\2\2\u027f"+
		"\u0280\3\2\2\2\u0280\'\3\2\2\2\u0281\u027f\3\2\2\2\u0282\u0284\7\u0095"+
		"\2\2\u0283\u0282\3\2\2\2\u0283\u0284\3\2\2\2\u0284\u0285\3\2\2\2\u0285"+
		"\u0286\7\31\2\2\u0286\u0287\5*\26\2\u0287\u0288\7\20\2\2\u0288\u0289\5"+
		"*\26\2\u0289\u02c1\3\2\2\2\u028a\u028c\7\u0095\2\2\u028b\u028a\3\2\2\2"+
		"\u028b\u028c\3\2\2\2\u028c\u028d\3\2\2\2\u028d\u028e\7o\2\2\u028e\u028f"+
		"\7\4\2\2\u028f\u0294\5$\23\2\u0290\u0291\7\6\2\2\u0291\u0293\5$\23\2\u0292"+
		"\u0290\3\2\2\2\u0293\u0296\3\2\2\2\u0294\u0292\3\2\2\2\u0294\u0295\3\2"+
		"\2\2\u0295\u0297\3\2\2\2\u0296\u0294\3\2\2\2\u0297\u0298\7\5\2\2\u0298"+
		"\u02c1\3\2\2\2\u0299\u029b\7\u0095\2\2\u029a\u0299\3\2\2\2\u029a\u029b"+
		"\3\2\2\2\u029b\u029c\3\2\2\2\u029c\u029d\7o\2\2\u029d\u029e\7\4\2\2\u029e"+
		"\u029f\5\6\4\2\u029f\u02a0\7\5\2\2\u02a0\u02c1\3\2\2\2\u02a1\u02a3\7\u0095"+
		"\2\2\u02a2\u02a1\3\2\2\2\u02a2\u02a3\3\2\2\2\u02a3\u02a4\3\2\2\2\u02a4"+
		"\u02a5\7\u00c1\2\2\u02a5\u02c1\5*\26\2\u02a6\u02a8\7\u0095\2\2\u02a7\u02a6"+
		"\3\2\2\2\u02a7\u02a8\3\2\2\2\u02a8\u02a9\3\2\2\2\u02a9\u02aa\7\u0082\2"+
		"\2\u02aa\u02ad\5*\26\2\u02ab\u02ac\7N\2\2\u02ac\u02ae\7\u0114\2\2\u02ad"+
		"\u02ab\3\2\2\2\u02ad\u02ae\3\2\2\2\u02ae\u02c1\3\2\2\2\u02af\u02b1\7y"+
		"\2\2\u02b0\u02b2\7\u0095\2\2\u02b1\u02b0\3\2\2\2\u02b1\u02b2\3\2\2\2\u02b2"+
		"\u02b3\3\2\2\2\u02b3\u02c1\7\u0096\2\2\u02b4\u02b6\7y\2\2\u02b5\u02b7"+
		"\7\u0095\2\2\u02b6\u02b5\3\2\2\2\u02b6\u02b7\3\2\2\2\u02b7\u02b8\3\2\2"+
		"\2\u02b8\u02c1\t\13\2\2\u02b9\u02bb\7y\2\2\u02ba\u02bc\7\u0095\2\2\u02bb"+
		"\u02ba\3\2\2\2\u02bb\u02bc\3\2\2\2\u02bc\u02bd\3\2\2\2\u02bd\u02be\7H"+
		"\2\2\u02be\u02bf\7c\2\2\u02bf\u02c1\5*\26\2\u02c0\u0283\3\2\2\2\u02c0"+
		"\u028b\3\2\2\2\u02c0\u029a\3\2\2\2\u02c0\u02a2\3\2\2\2\u02c0\u02a7\3\2"+
		"\2\2\u02c0\u02af\3\2\2\2\u02c0\u02b4\3\2\2\2\u02c0\u02b9\3\2\2\2\u02c1"+
		")\3\2\2\2\u02c2\u02c3\b\26\1\2\u02c3\u02c7\5,\27\2\u02c4\u02c5\t\f\2\2"+
		"\u02c5\u02c7\5*\26\t\u02c6\u02c2\3\2\2\2\u02c6\u02c4\3\2\2\2\u02c7\u02dd"+
		"\3\2\2\2\u02c8\u02c9\f\b\2\2\u02c9\u02ca\t\r\2\2\u02ca\u02dc\5*\26\t\u02cb"+
		"\u02cc\f\7\2\2\u02cc\u02cd\t\16\2\2\u02cd\u02dc\5*\26\b\u02ce\u02cf\f"+
		"\6\2\2\u02cf\u02d0\7\u0110\2\2\u02d0\u02dc\5*\26\7\u02d1\u02d2\f\5\2\2"+
		"\u02d2\u02d3\7\u0113\2\2\u02d3\u02dc\5*\26\6\u02d4\u02d5\f\4\2\2\u02d5"+
		"\u02d6\7\u0111\2\2\u02d6\u02dc\5*\26\5\u02d7\u02d8\f\3\2\2\u02d8\u02d9"+
		"\5\60\31\2\u02d9\u02da\5*\26\4\u02da\u02dc\3\2\2\2\u02db\u02c8\3\2\2\2"+
		"\u02db\u02cb\3\2\2\2\u02db\u02ce\3\2\2\2\u02db\u02d1\3\2\2\2\u02db\u02d4"+
		"\3\2\2\2\u02db\u02d7\3\2\2\2\u02dc\u02df\3\2\2\2\u02dd\u02db\3\2\2\2\u02dd"+
		"\u02de\3\2\2\2\u02de+\3\2\2\2\u02df\u02dd\3\2\2\2\u02e0\u02e1\b\27\1\2"+
		"\u02e1\u037d\t\17\2\2\u02e2\u02e4\7 \2\2\u02e3\u02e5\5 \21\2\u02e4\u02e3"+
		"\3\2\2\2\u02e5\u02e6\3\2\2\2\u02e6\u02e4\3\2\2\2\u02e6\u02e7\3\2\2\2\u02e7"+
		"\u02ea\3\2\2\2\u02e8\u02e9\7L\2\2\u02e9\u02eb\5$\23\2\u02ea\u02e8\3\2"+
		"\2\2\u02ea\u02eb\3\2\2\2\u02eb\u02ec\3\2\2\2\u02ec\u02ed\7M\2\2\u02ed"+
		"\u037d\3\2\2\2\u02ee\u02ef\7 \2\2\u02ef\u02f1\5$\23\2\u02f0\u02f2\5 \21"+
		"\2\u02f1\u02f0\3\2\2\2\u02f2\u02f3\3\2\2\2\u02f3\u02f1\3\2\2\2\u02f3\u02f4"+
		"\3\2\2\2\u02f4\u02f7\3\2\2\2\u02f5\u02f6\7L\2\2\u02f6\u02f8\5$\23\2\u02f7"+
		"\u02f5\3\2\2\2\u02f7\u02f8\3\2\2\2\u02f8\u02f9\3\2\2\2\u02f9\u02fa\7M"+
		"\2\2\u02fa\u037d\3\2\2\2\u02fb\u02fc\7!\2\2\u02fc\u02fd\7\4\2\2\u02fd"+
		"\u02fe\5$\23\2\u02fe\u02ff\7\25\2\2\u02ff\u0300\5\u0086D\2\u0300\u0301"+
		"\7\5\2\2\u0301\u037d\3\2\2\2\u0302\u0303\7\u00db\2\2\u0303\u030c\7\4\2"+
		"\2\u0304\u0309\5\62\32\2\u0305\u0306\7\6\2\2\u0306\u0308\5\62\32\2\u0307"+
		"\u0305\3\2\2\2\u0308\u030b\3\2\2\2\u0309\u0307\3\2\2\2\u0309\u030a\3\2"+
		"\2\2\u030a\u030d\3\2\2\2\u030b\u0309\3\2\2\2\u030c\u0304\3\2\2\2\u030c"+
		"\u030d\3\2\2\2\u030d\u030e\3\2\2\2\u030e\u037d\7\5\2\2\u030f\u0310\7]"+
		"\2\2\u0310\u0311\7\4\2\2\u0311\u0314\5$\23\2\u0312\u0313\7m\2\2\u0313"+
		"\u0315\7\u0097\2\2\u0314\u0312\3\2\2\2\u0314\u0315\3\2\2\2\u0315\u0316"+
		"\3\2\2\2\u0316\u0317\7\5\2\2\u0317\u037d\3\2\2\2\u0318\u0319\7}\2\2\u0319"+
		"\u031a\7\4\2\2\u031a\u031d\5$\23\2\u031b\u031c\7m\2\2\u031c\u031e\7\u0097"+
		"\2\2\u031d\u031b\3\2\2\2\u031d\u031e\3\2\2\2\u031e\u031f\3\2\2\2\u031f"+
		"\u0320\7\5\2\2\u0320\u037d\3\2\2\2\u0321\u0322\7\u00ac\2\2\u0322\u0323"+
		"\7\4\2\2\u0323\u0324\5*\26\2\u0324\u0325\7o\2\2\u0325\u0326\5*\26\2\u0326"+
		"\u0327\7\5\2\2\u0327\u037d\3\2\2\2\u0328\u037d\5.\30\2\u0329\u037d\7\u010c"+
		"\2\2\u032a\u032b\5\u008eH\2\u032b\u032c\7\7\2\2\u032c\u032d\7\u010c\2"+
		"\2\u032d\u037d\3\2\2\2\u032e\u032f\7\4\2\2\u032f\u0332\5\62\32\2\u0330"+
		"\u0331\7\6\2\2\u0331\u0333\5\62\32\2\u0332\u0330\3\2\2\2\u0333\u0334\3"+
		"\2\2\2\u0334\u0332\3\2\2\2\u0334\u0335\3\2\2\2\u0335\u0336\3\2\2\2\u0336"+
		"\u0337\7\5\2\2\u0337\u037d\3\2\2\2\u0338\u0339\7\4\2\2\u0339\u033a\5\6"+
		"\4\2\u033a\u033b\7\5\2\2\u033b\u037d\3\2\2\2\u033c\u033d\5\u0088E\2\u033d"+
		"\u033e\7\b\2\2\u033e\u033f\5$\23\2\u033f\u037d\3\2\2\2\u0340\u0341\7\4"+
		"\2\2\u0341\u0344\5\u0088E\2\u0342\u0343\7\6\2\2\u0343\u0345\5\u0088E\2"+
		"\u0344\u0342\3\2\2\2\u0345\u0346\3\2\2\2\u0346\u0344\3\2\2\2\u0346\u0347"+
		"\3\2\2\2\u0347\u0348\3\2\2\2\u0348\u0349\7\5\2\2\u0349\u034a\7\b\2\2\u034a"+
		"\u034b\5$\23\2\u034b\u037d\3\2\2\2\u034c\u037d\5\u0088E\2\u034d\u034e"+
		"\7\4\2\2\u034e\u034f\5$\23\2\u034f\u0350\7\5\2\2\u0350\u037d\3\2\2\2\u0351"+
		"\u0352\7W\2\2\u0352\u0353\7\4\2\2\u0353\u0354\5\u0088E\2\u0354\u0355\7"+
		"c\2\2\u0355\u0356\5*\26\2\u0356\u0357\7\5\2\2\u0357\u037d\3\2\2\2\u0358"+
		"\u0359\t\20\2\2\u0359\u035a\7\4\2\2\u035a\u035b\5*\26\2\u035b\u035c\t"+
		"\21\2\2\u035c\u035f\5*\26\2\u035d\u035e\t\22\2\2\u035e\u0360\5*\26\2\u035f"+
		"\u035d\3\2\2\2\u035f\u0360\3\2\2\2\u0360\u0361\3\2\2\2\u0361\u0362\7\5"+
		"\2\2\u0362\u037d\3\2\2\2\u0363\u0364\7\u00eb\2\2\u0364\u0366\7\4\2\2\u0365"+
		"\u0367\t\23\2\2\u0366\u0365\3\2\2\2\u0366\u0367\3\2\2\2\u0367\u0369\3"+
		"\2\2\2\u0368\u036a\5*\26\2\u0369\u0368\3\2\2\2\u0369\u036a\3\2\2\2\u036a"+
		"\u036b\3\2\2\2\u036b\u036c\7c\2\2\u036c\u036d\5*\26\2\u036d\u036e\7\5"+
		"\2\2\u036e\u037d\3\2\2\2\u036f\u0370\7\u00a4\2\2\u0370\u0371\7\4\2\2\u0371"+
		"\u0372\5*\26\2\u0372\u0373\7\u00ab\2\2\u0373\u0374\5*\26\2\u0374\u0375"+
		"\7c\2\2\u0375\u0378\5*\26\2\u0376\u0377\7_\2\2\u0377\u0379\5*\26\2\u0378"+
		"\u0376\3\2\2\2\u0378\u0379\3\2\2\2\u0379\u037a\3\2\2\2\u037a\u037b\7\5"+
		"\2\2\u037b\u037d\3\2\2\2\u037c\u02e0\3\2\2\2\u037c\u02e2\3\2\2\2\u037c"+
		"\u02ee\3\2\2\2\u037c\u02fb\3\2\2\2\u037c\u0302\3\2\2\2\u037c\u030f\3\2"+
		"\2\2\u037c\u0318\3\2\2\2\u037c\u0321\3\2\2\2\u037c\u0328\3\2\2\2\u037c"+
		"\u0329\3\2\2\2\u037c\u032a\3\2\2\2\u037c\u032e\3\2\2\2\u037c\u0338\3\2"+
		"\2\2\u037c\u033c\3\2\2\2\u037c\u0340\3\2\2\2\u037c\u034c\3\2\2\2\u037c"+
		"\u034d\3\2\2\2\u037c\u0351\3\2\2\2\u037c\u0358\3\2\2\2\u037c\u0363\3\2"+
		"\2\2\u037c\u036f\3\2\2\2\u037d\u0388\3\2\2\2\u037e\u037f\f\n\2\2\u037f"+
		"\u0380\7\t\2\2\u0380\u0381\5*\26\2\u0381\u0382\7\n\2\2\u0382\u0387\3\2"+
		"\2\2\u0383\u0384\f\b\2\2\u0384\u0385\7\7\2\2\u0385\u0387\5\u0088E\2\u0386"+
		"\u037e\3\2\2\2\u0386\u0383\3\2\2\2\u0387\u038a\3\2\2\2\u0388\u0386\3\2"+
		"\2\2\u0388\u0389\3\2\2\2\u0389-\3\2\2\2\u038a\u0388\3\2\2\2\u038b\u0397"+
		"\7\u0096\2\2\u038c\u038d\5\u0088E\2\u038d\u038e\7\u0114\2\2\u038e\u0397"+
		"\3\2\2\2\u038f\u0397\5\u0090I\2\u0390\u0397\5\u0082B\2\u0391\u0393\7\u0114"+
		"\2\2\u0392\u0391\3\2\2\2\u0393\u0394\3\2\2\2\u0394\u0392\3\2\2\2\u0394"+
		"\u0395\3\2\2\2\u0395\u0397\3\2\2\2\u0396\u038b\3\2\2\2\u0396\u038c\3\2"+
		"\2\2\u0396\u038f\3\2\2\2\u0396\u0390\3\2\2\2\u0396\u0392\3\2\2\2\u0397"+
		"/\3\2\2\2\u0398\u0399\t\24\2\2\u0399\61\3\2\2\2\u039a\u03a2\5$\23\2\u039b"+
		"\u039d\7\25\2\2\u039c\u039b\3\2\2\2\u039c\u039d\3\2\2\2\u039d\u03a0\3"+
		"\2\2\2\u039e\u03a1\5\u0088E\2\u039f\u03a1\5\u008aF\2\u03a0\u039e\3\2\2"+
		"\2\u03a0\u039f\3\2\2\2\u03a1\u03a3\3\2\2\2\u03a2\u039c\3\2\2\2\u03a2\u03a3"+
		"\3\2\2\2\u03a3\63\3\2\2\2\u03a4\u03a9\5\62\32\2\u03a5\u03a6\7\6\2\2\u03a6"+
		"\u03a8\5\62\32\2\u03a7\u03a5\3\2\2\2\u03a8\u03ab\3\2\2\2\u03a9\u03a7\3"+
		"\2\2\2\u03a9\u03aa\3\2\2\2\u03aa\65\3\2\2\2\u03ab\u03a9\3\2\2\2\u03ac"+
		"\u03ae\5$\23\2\u03ad\u03af\t\25\2\2\u03ae\u03ad\3\2\2\2\u03ae\u03af\3"+
		"\2\2\2\u03af\u03b2\3\2\2\2\u03b0\u03b1\7\u0097\2\2\u03b1\u03b3\t\26\2"+
		"\2\u03b2\u03b0\3\2\2\2\u03b2\u03b3\3\2\2\2\u03b3\67\3\2\2\2\u03b4\u03b5"+
		"\5\u0088E\2\u03b5\u03b6\7\25\2\2\u03b6\u03b7\5:\36\2\u03b79\3\2\2\2\u03b8"+
		"\u03e7\5\u0088E\2\u03b9\u03ba\7\4\2\2\u03ba\u03bb\5\u0088E\2\u03bb\u03bc"+
		"\7\5\2\2\u03bc\u03e7\3\2\2\2\u03bd\u03e0\7\4\2\2\u03be\u03bf\7%\2\2\u03bf"+
		"\u03c0\7\35\2\2\u03c0\u03c5\5$\23\2\u03c1\u03c2\7\6\2\2\u03c2\u03c4\5"+
		"$\23\2\u03c3\u03c1\3\2\2\2\u03c4\u03c7\3\2\2\2\u03c5\u03c3\3\2\2\2\u03c5"+
		"\u03c6\3\2\2\2\u03c6\u03e1\3\2\2\2\u03c7\u03c5\3\2\2\2\u03c8\u03c9\t\27"+
		"\2\2\u03c9\u03ca\7\35\2\2\u03ca\u03cf\5$\23\2\u03cb\u03cc\7\6\2\2\u03cc"+
		"\u03ce\5$\23\2\u03cd\u03cb\3\2\2\2\u03ce\u03d1\3\2\2\2\u03cf\u03cd\3\2"+
		"\2\2\u03cf\u03d0\3\2\2\2\u03d0\u03d3\3\2\2\2\u03d1\u03cf\3\2\2\2\u03d2"+
		"\u03c8\3\2\2\2\u03d2\u03d3\3\2\2\2\u03d3\u03de\3\2\2\2\u03d4\u03d5\t\30"+
		"\2\2\u03d5\u03d6\7\35\2\2\u03d6\u03db\5\66\34\2\u03d7\u03d8\7\6\2\2\u03d8"+
		"\u03da\5\66\34\2\u03d9\u03d7\3\2\2\2\u03da\u03dd\3\2\2\2\u03db\u03d9\3"+
		"\2\2\2\u03db\u03dc\3\2\2\2\u03dc\u03df\3\2\2\2\u03dd\u03db\3\2\2\2\u03de"+
		"\u03d4\3\2\2\2\u03de\u03df\3\2\2\2\u03df\u03e1\3\2\2\2\u03e0\u03be\3\2"+
		"\2\2\u03e0\u03d2\3\2\2\2\u03e1\u03e3\3\2\2\2\u03e2\u03e4\5<\37\2\u03e3"+
		"\u03e2\3\2\2\2\u03e3\u03e4\3\2\2\2\u03e4\u03e5\3\2\2\2\u03e5\u03e7\7\5"+
		"\2\2\u03e6\u03b8\3\2\2\2\u03e6\u03b9\3\2\2\2\u03e6\u03bd\3\2\2\2\u03e7"+
		";\3\2\2\2\u03e8\u03e9\7\u00b3\2\2\u03e9\u03f9\5> \2\u03ea\u03eb\7\u00c7"+
		"\2\2\u03eb\u03f9\5> \2\u03ec\u03ed\7\u00b3\2\2\u03ed\u03ee\7\31\2\2\u03ee"+
		"\u03ef\5> \2\u03ef\u03f0\7\20\2\2\u03f0\u03f1\5> \2\u03f1\u03f9\3\2\2"+
		"\2\u03f2\u03f3\7\u00c7\2\2\u03f3\u03f4\7\31\2\2\u03f4\u03f5\5> \2\u03f5"+
		"\u03f6\7\20\2\2\u03f6\u03f7\5> \2\u03f7\u03f9\3\2\2\2\u03f8\u03e8\3\2"+
		"\2\2\u03f8\u03ea\3\2\2\2\u03f8\u03ec\3\2\2\2\u03f8\u03f2\3\2\2\2\u03f9"+
		"=\3\2\2\2\u03fa\u03fb\7\u00f0\2\2\u03fb\u0402\t\31\2\2\u03fc\u03fd\7\67"+
		"\2\2\u03fd\u0402\7\u00c6\2\2\u03fe\u03ff\5$\23\2\u03ff\u0400\t\31\2\2"+
		"\u0400\u0402\3\2\2\2\u0401\u03fa\3\2\2\2\u0401\u03fc\3\2\2\2\u0401\u03fe"+
		"\3\2\2\2\u0402?\3\2\2\2\u0403\u0407\5B\"\2\u0404\u0406\5F$\2\u0405\u0404"+
		"\3\2\2\2\u0406\u0409\3\2\2\2\u0407\u0405\3\2\2\2\u0407\u0408\3\2\2\2\u0408"+
		"A\3\2\2\2\u0409\u0407\3\2\2\2\u040a\u040b\5\u008aF\2\u040b\u040c\5D#\2"+
		"\u040c\u0418\3\2\2\2\u040d\u040e\7\4\2\2\u040e\u040f\5\6\4\2\u040f\u0410"+
		"\7\5\2\2\u0410\u0411\5D#\2\u0411\u0418\3\2\2\2\u0412\u0413\7\4\2\2\u0413"+
		"\u0414\5@!\2\u0414\u0415\7\5\2\2\u0415\u0416\5D#\2\u0416\u0418\3\2\2\2"+
		"\u0417\u040a\3\2\2\2\u0417\u040d\3\2\2\2\u0417\u0412\3\2\2\2\u0418C\3"+
		"\2\2\2\u0419\u041b\7\25\2\2\u041a\u0419\3\2\2\2\u041a\u041b\3\2\2\2\u041b"+
		"\u041c\3\2\2\2\u041c\u041e\5\u0088E\2\u041d\u041a\3\2\2\2\u041d\u041e"+
		"\3\2\2\2\u041eE\3\2\2\2\u041f\u0420\5H%\2\u0420\u0421\7{\2\2\u0421\u0423"+
		"\5B\"\2\u0422\u0424\5J&\2\u0423\u0422\3\2\2\2\u0423\u0424\3\2\2\2\u0424"+
		"\u042b\3\2\2\2\u0425\u0426\7\u0093\2\2\u0426\u0427\5H%\2\u0427\u0428\7"+
		"{\2\2\u0428\u0429\5B\"\2\u0429\u042b\3\2\2\2\u042a\u041f\3\2\2\2\u042a"+
		"\u0425\3\2\2\2\u042bG\3\2\2\2\u042c\u042e\7r\2\2\u042d\u042c\3\2\2\2\u042d"+
		"\u042e\3\2\2\2\u042e\u0445\3\2\2\2\u042f\u0445\7\65\2\2\u0430\u0432\7"+
		"\u0081\2\2\u0431\u0433\7\u00a0\2\2\u0432\u0431\3\2\2\2\u0432\u0433\3\2"+
		"\2\2\u0433\u0445\3\2\2\2\u0434\u0436\7\u0081\2\2\u0435\u0434\3\2\2\2\u0435"+
		"\u0436\3\2\2\2\u0436\u0437\3\2\2\2\u0437\u0445\7\u00ca\2\2\u0438\u043a"+
		"\7\u00c0\2\2\u0439\u043b\7\u00a0\2\2\u043a\u0439\3\2\2\2\u043a\u043b\3"+
		"\2\2\2\u043b\u0445\3\2\2\2\u043c\u043e\7d\2\2\u043d\u043f\7\u00a0\2\2"+
		"\u043e\u043d\3\2\2\2\u043e\u043f\3\2\2\2\u043f\u0445\3\2\2\2\u0440\u0442"+
		"\7\u0081\2\2\u0441\u0440\3\2\2\2\u0441\u0442\3\2\2\2\u0442\u0443\3\2\2"+
		"\2\u0443\u0445\7\21\2\2\u0444\u042d\3\2\2\2\u0444\u042f\3\2\2\2\u0444"+
		"\u0430\3\2\2\2\u0444\u0435\3\2\2\2\u0444\u0438\3\2\2\2\u0444\u043c\3\2"+
		"\2\2\u0444\u0441\3\2\2\2\u0445I\3\2\2\2\u0446\u0447\7\u0099\2\2\u0447"+
		"\u044b\5&\24\2\u0448\u0449\7\u00fa\2\2\u0449\u044b\5\u008aF\2\u044a\u0446"+
		"\3\2\2\2\u044a\u0448\3\2\2\2\u044bK\3\2\2\2\u044c\u044d\7\u009c\2\2\u044d"+
		"\u0456\5N(\2\u044e\u044f\7\u00a7\2\2\u044f\u0450\7\35\2\2\u0450\u0456"+
		"\5\u008aF\2\u0451\u0456\5|?\2\u0452\u0456\5z>\2\u0453\u0454\7\u00e1\2"+
		"\2\u0454\u0456\5N(\2\u0455\u044c\3\2\2\2\u0455\u044e\3\2\2\2\u0455\u0451"+
		"\3\2\2\2\u0455\u0452\3\2\2\2\u0455\u0453\3\2\2\2\u0456\u0459\3\2\2\2\u0457"+
		"\u0455\3\2\2\2\u0457\u0458\3\2\2\2\u0458M\3\2\2\2\u0459\u0457\3\2\2\2"+
		"\u045a\u045b\7\4\2\2\u045b\u0460\5P)\2\u045c\u045d\7\6\2\2\u045d\u045f"+
		"\5P)\2\u045e\u045c\3\2\2\2\u045f\u0462\3\2\2\2\u0460\u045e\3\2\2\2\u0460"+
		"\u0461\3\2\2\2\u0461\u0463\3\2\2\2\u0462\u0460\3\2\2\2\u0463\u0464\7\5"+
		"\2\2\u0464O\3\2\2\2\u0465\u046a\5R*\2\u0466\u0468\7\u0102\2\2\u0467\u0466"+
		"\3\2\2\2\u0467\u0468\3\2\2\2\u0468\u0469\3\2\2\2\u0469\u046b\5T+\2\u046a"+
		"\u0467\3\2\2\2\u046a\u046b\3\2\2\2\u046bQ\3\2\2\2\u046c\u0471\5\u0088"+
		"E\2\u046d\u046e\7\7\2\2\u046e\u0470\5\u0088E\2\u046f\u046d\3\2\2\2\u0470"+
		"\u0473\3\2\2\2\u0471\u046f\3\2\2\2\u0471\u0472\3\2\2\2\u0472\u0476\3\2"+
		"\2\2\u0473\u0471\3\2\2\2\u0474\u0476\7\u0114\2\2\u0475\u046c\3\2\2\2\u0475"+
		"\u0474\3\2\2\2\u0476S\3\2\2\2\u0477\u047c\7\u0118\2\2\u0478\u047c\7\u011a"+
		"\2\2\u0479\u047c\5\u0082B\2\u047a\u047c\7\u0114\2\2\u047b\u0477\3\2\2"+
		"\2\u047b\u0478\3\2\2\2\u047b\u0479\3\2\2\2\u047b\u047a\3\2\2\2\u047cU"+
		"\3\2\2\2\u047d\u047e\t\32\2\2\u047eW\3\2\2\2\u047f\u0481\7\64\2\2\u0480"+
		"\u0482\7\u00e2\2\2\u0481\u0480\3\2\2\2\u0481\u0482\3\2\2\2\u0482\u0484"+
		"\3\2\2\2\u0483\u0485\7V\2\2\u0484\u0483\3\2\2\2\u0484\u0485\3\2\2\2\u0485"+
		"\u0486\3\2\2\2\u0486\u048a\7\u00de\2\2\u0487\u0488\7l\2\2\u0488\u0489"+
		"\7\u0095\2\2\u0489\u048b\7R\2\2\u048a\u0487\3\2\2\2\u048a\u048b\3\2\2"+
		"\2\u048b\u048c\3\2\2\2\u048c\u048d\5\u008aF\2\u048dY\3\2\2\2\u048e\u048f"+
		"\7u\2\2\u048f\u0490\7x\2\2\u0490\u0491\5\u0088E\2\u0491\u0492\7\4\2\2"+
		"\u0492\u0493\5\u008aF\2\u0493\u0494\7\5\2\2\u0494\u0495\7\u00fb\2\2\u0495"+
		"\u0496\5`\61\2\u0496\u04b0\3\2\2\2\u0497\u0498\5\\/\2\u0498\u0499\5\b"+
		"\5\2\u0499\u049a\5\n\6\2\u049a\u04b0\3\2\2\2\u049b\u049d\5\36\20\2\u049c"+
		"\u049e\5p9\2\u049d\u049c\3\2\2\2\u049e\u049f\3\2\2\2\u049f\u049d\3\2\2"+
		"\2\u049f\u04a0\3\2\2\2\u04a0\u04b0\3\2\2\2\u04a1\u04a2\7A\2\2\u04a2\u04a3"+
		"\7c\2\2\u04a3\u04a4\5\u008aF\2\u04a4\u04a6\5D#\2\u04a5\u04a7\5\26\f\2"+
		"\u04a6\u04a5\3\2\2\2\u04a6\u04a7\3\2\2\2\u04a7\u04b0\3\2\2\2\u04a8\u04a9"+
		"\7\u00f7\2\2\u04a9\u04aa\5\u008aF\2\u04aa\u04ab\5D#\2\u04ab\u04ad\5\""+
		"\22\2\u04ac\u04ae\5\26\f\2\u04ad\u04ac\3\2\2\2\u04ad\u04ae\3\2\2\2\u04ae"+
		"\u04b0\3\2\2\2\u04af\u048e\3\2\2\2\u04af\u0497\3\2\2\2\u04af\u049b\3\2"+
		"\2\2\u04af\u04a1\3\2\2\2\u04af\u04a8\3\2\2\2\u04b0[\3\2\2\2\u04b1\u04b2"+
		"\7u\2\2\u04b2\u04b4\7\u00a5\2\2\u04b3\u04b5\7\u00de\2\2\u04b4\u04b3\3"+
		"\2\2\2\u04b4\u04b5\3\2\2\2\u04b5\u04b6\3\2\2\2\u04b6\u04bd\5\u008aF\2"+
		"\u04b7\u04bb\5b\62\2\u04b8\u04b9\7l\2\2\u04b9\u04ba\7\u0095\2\2\u04ba"+
		"\u04bc\7R\2\2\u04bb\u04b8\3\2\2\2\u04bb\u04bc\3\2\2\2\u04bc\u04be\3\2"+
		"\2\2\u04bd\u04b7\3\2\2\2\u04bd\u04be\3\2\2\2\u04be\u04e9\3\2\2\2\u04bf"+
		"\u04c0\7u\2\2\u04c0\u04c2\7x\2\2\u04c1\u04c3\7\u00de\2\2\u04c2\u04c1\3"+
		"\2\2\2\u04c2\u04c3\3\2\2\2\u04c3\u04c4\3\2\2\2\u04c4\u04c6\5\u008aF\2"+
		"\u04c5\u04c7\5b\62\2\u04c6\u04c5\3\2\2\2\u04c6\u04c7\3\2\2\2\u04c7\u04cb"+
		"\3\2\2\2\u04c8\u04c9\7l\2\2\u04c9\u04ca\7\u0095\2\2\u04ca\u04cc\7R\2\2"+
		"\u04cb\u04c8\3\2\2\2\u04cb\u04cc\3\2\2\2\u04cc\u04e9\3\2\2\2\u04cd\u04ce"+
		"\7u\2\2\u04ce\u04d0\7\u00a5\2\2\u04cf\u04d1\7\u0087\2\2\u04d0\u04cf\3"+
		"\2\2\2\u04d0\u04d1\3\2\2\2\u04d1\u04d2\3\2\2\2\u04d2\u04d3\7G\2\2\u04d3"+
		"\u04d5\7\u0114\2\2\u04d4\u04d6\5f\64\2\u04d5\u04d4\3\2\2\2\u04d5\u04d6"+
		"\3\2\2\2\u04d6\u04d8\3\2\2\2\u04d7\u04d9\5h\65\2\u04d8\u04d7\3\2\2\2\u04d8"+
		"\u04d9\3\2\2\2\u04d9\u04e9\3\2\2\2\u04da\u04db\7u\2\2\u04db\u04dd\7\u00a5"+
		"\2\2\u04dc\u04de\7\u0087\2\2\u04dd\u04dc\3\2\2\2\u04dd\u04de\3\2\2\2\u04de"+
		"\u04df\3\2\2\2\u04df\u04e1\7G\2\2\u04e0\u04e2\7\u0114\2\2\u04e1\u04e0"+
		"\3\2\2\2\u04e1\u04e2\3\2\2\2\u04e2\u04e3\3\2\2\2\u04e3\u04e6\5l\67\2\u04e4"+
		"\u04e5\7\u009c\2\2\u04e5\u04e7\5N(\2\u04e6\u04e4\3\2\2\2\u04e6\u04e7\3"+
		"\2\2\2\u04e7\u04e9\3\2\2\2\u04e8\u04b1\3\2\2\2\u04e8\u04bf\3\2\2\2\u04e8"+
		"\u04cd\3\2\2\2\u04e8\u04da\3\2\2\2\u04e9]\3\2\2\2\u04ea\u04ef\5.\30\2"+
		"\u04eb\u04ec\7\6\2\2\u04ec\u04ee\5.\30\2\u04ed\u04eb\3\2\2\2\u04ee\u04f1"+
		"\3\2\2\2\u04ef\u04ed\3\2\2\2\u04ef\u04f0\3\2\2\2\u04f0_\3\2\2\2\u04f1"+
		"\u04ef\3\2\2\2\u04f2\u04f3\7\4\2\2\u04f3\u04f4\5^\60\2\u04f4\u04fc\7\5"+
		"\2\2\u04f5\u04f6\7\6\2\2\u04f6\u04f7\7\4\2\2\u04f7\u04f8\5^\60\2\u04f8"+
		"\u04f9\7\5\2\2\u04f9\u04fb\3\2\2\2\u04fa\u04f5\3\2\2\2\u04fb\u04fe\3\2"+
		"\2\2\u04fc\u04fa\3\2\2\2\u04fc\u04fd\3\2\2\2\u04fda\3\2\2\2\u04fe\u04fc"+
		"\3\2\2\2\u04ff\u0500\7\u00a6\2\2\u0500\u0501\7\4\2\2\u0501\u0506\5d\63"+
		"\2\u0502\u0503\7\6\2\2\u0503\u0505\5d\63\2\u0504\u0502\3\2\2\2\u0505\u0508"+
		"\3\2\2\2\u0506\u0504\3\2\2\2\u0506\u0507\3\2\2\2\u0507\u0509\3\2\2\2\u0508"+
		"\u0506\3\2\2\2\u0509\u050a\7\5\2\2\u050ac\3\2\2\2\u050b\u050e\5\u0088"+
		"E\2\u050c\u050d\7\u0102\2\2\u050d\u050f\5.\30\2\u050e\u050c\3\2\2\2\u050e"+
		"\u050f\3\2\2\2\u050fe\3\2\2\2\u0510\u0511\7\u00c6\2\2\u0511\u0512\7a\2"+
		"\2\u0512\u0513\7\u00cc\2\2\u0513\u0517\7\u0114\2\2\u0514\u0515\7\u0101"+
		"\2\2\u0515\u0516\7\u00cd\2\2\u0516\u0518\5N(\2\u0517\u0514\3\2\2\2\u0517"+
		"\u0518\3\2\2\2\u0518\u0542\3\2\2\2\u0519\u051a\7\u00c6\2\2\u051a\u051b"+
		"\7a\2\2\u051b\u0525\7B\2\2\u051c\u051d\7Z\2\2\u051d\u051e\7\u00e3\2\2"+
		"\u051e\u051f\7\35\2\2\u051f\u0523\7\u0114\2\2\u0520\u0521\7O\2\2\u0521"+
		"\u0522\7\35\2\2\u0522\u0524\7\u0114\2\2\u0523\u0520\3\2\2\2\u0523\u0524"+
		"\3\2\2\2\u0524\u0526\3\2\2\2\u0525\u051c\3\2\2\2\u0525\u0526\3\2\2\2\u0526"+
		"\u052c\3\2\2\2\u0527\u0528\7)\2\2\u0528\u0529\7z\2\2\u0529\u052a\7\u00e3"+
		"\2\2\u052a\u052b\7\35\2\2\u052b\u052d\7\u0114\2\2\u052c\u0527\3\2\2\2"+
		"\u052c\u052d\3\2\2\2\u052d\u0533\3\2\2\2\u052e\u052f\7\u008d\2\2\u052f"+
		"\u0530\7|\2\2\u0530\u0531\7\u00e3\2\2\u0531\u0532\7\35\2\2\u0532\u0534"+
		"\7\u0114\2\2\u0533\u052e\3\2\2\2\u0533\u0534\3\2\2\2\u0534\u0539\3\2\2"+
		"\2\u0535\u0536\7\u0084\2\2\u0536\u0537\7\u00e3\2\2\u0537\u0538\7\35\2"+
		"\2\u0538\u053a\7\u0114\2\2\u0539\u0535\3\2\2\2\u0539\u053a\3\2\2\2\u053a"+
		"\u053f\3\2\2\2\u053b\u053c\7\u0096\2\2\u053c\u053d\7@\2\2\u053d\u053e"+
		"\7\25\2\2\u053e\u0540\7\u0114\2\2\u053f\u053b\3\2\2\2\u053f\u0540\3\2"+
		"\2\2\u0540\u0542\3\2\2\2\u0541\u0510\3\2\2\2\u0541\u0519\3\2\2\2\u0542"+
		"g\3\2\2\2\u0543\u0544\7\u00d9\2\2\u0544\u0545\7\25\2\2\u0545\u054a\5j"+
		"\66\2\u0546\u0547\7\u00d9\2\2\u0547\u0548\7\35\2\2\u0548\u054a\5n8\2\u0549"+
		"\u0543\3\2\2\2\u0549\u0546\3\2\2\2\u054ai\3\2\2\2\u054b\u054c\7t\2\2\u054c"+
		"\u054d\7\u0114\2\2\u054d\u054e\7\u00a1\2\2\u054e\u0551\7\u0114\2\2\u054f"+
		"\u0551\5\u0088E\2\u0550\u054b\3\2\2\2\u0550\u054f\3\2\2\2\u0551k\3\2\2"+
		"\2\u0552\u0553\7\u00fa\2\2\u0553\u0554\5\u008aF\2\u0554m\3\2\2\2\u0555"+
		"\u0559\7\u0114\2\2\u0556\u0557\7\u0101\2\2\u0557\u0558\7\u00cd\2\2\u0558"+
		"\u055a\5N(\2\u0559\u0556\3\2\2\2\u0559\u055a\3\2\2\2\u055ao\3\2\2\2\u055b"+
		"\u055c\5\\/\2\u055c\u055d\5\22\n\2\u055dq\3\2\2\2\u055e\u0563\5\u0088"+
		"E\2\u055f\u0560\7\7\2\2\u0560\u0562\5\u0088E\2\u0561\u055f\3\2\2\2\u0562"+
		"\u0565\3\2\2\2\u0563\u0561\3\2\2\2\u0563\u0564\3\2\2\2\u0564s\3\2\2\2"+
		"\u0565\u0563\3\2\2\2\u0566\u0567\5\u0088E\2\u0567\u0568\7\7\2\2\u0568"+
		"\u056a\3\2\2\2\u0569\u0566\3\2\2\2\u0569\u056a\3\2\2\2\u056a\u056b\3\2"+
		"\2\2\u056b\u056c\5\u0088E\2\u056cu\3\2\2\2\u056d\u0572\5x=\2\u056e\u056f"+
		"\7\6\2\2\u056f\u0571\5x=\2\u0570\u056e\3\2\2\2\u0571\u0574\3\2\2\2\u0572"+
		"\u0570\3\2\2\2\u0572\u0573\3\2\2\2\u0573w\3\2\2\2\u0574\u0572\3\2\2\2"+
		"\u0575\u0576\5\u0088E\2\u0576\u0579\5\u0086D\2\u0577\u0578\7\u0095\2\2"+
		"\u0578\u057a\7\u0096\2\2\u0579\u0577\3\2\2\2\u0579\u057a\3\2\2\2\u057a"+
		"\u057c\3\2\2\2\u057b\u057d\5z>\2\u057c\u057b\3\2\2\2\u057c\u057d\3\2\2"+
		"\2\u057dy\3\2\2\2\u057e\u057f\7,\2\2\u057f\u0580\7\u0114\2\2\u0580{\3"+
		"\2\2\2\u0581\u0582\7\u0088\2\2\u0582\u0583\7\u0114\2\2\u0583}\3\2\2\2"+
		"\u0584\u0589\5\u0080A\2\u0585\u0586\7\6\2\2\u0586\u0588\5\u0080A\2\u0587"+
		"\u0585\3\2\2\2\u0588\u058b\3\2\2\2\u0589\u0587\3\2\2\2\u0589\u058a\3\2"+
		"\2\2\u058a\177\3\2\2\2\u058b\u0589\3\2\2\2\u058c\u058d\5\u008aF\2\u058d"+
		"\u058e\7\u0102\2\2\u058e\u058f\5$\23\2\u058f\u0081\3\2\2\2\u0590\u0591"+
		"\t\33\2\2\u0591\u0083\3\2\2\2\u0592\u0593\t\34\2\2\u0593\u0085\3\2\2\2"+
		"\u0594\u0595\7\24\2\2\u0595\u0596\7\u0106\2\2\u0596\u0597\5\u0086D\2\u0597"+
		"\u0598\7\u0108\2\2\u0598\u05ae\3\2\2\2\u0599\u059a\7\u008d\2\2\u059a\u059b"+
		"\7\u0106\2\2\u059b\u059c\5\u0086D\2\u059c\u059d\7\6\2\2\u059d\u059e\5"+
		"\u0086D\2\u059e\u059f\7\u0108\2\2\u059f\u05ae\3\2\2\2\u05a0\u05ab\5\u0088"+
		"E\2\u05a1\u05a2\7\4\2\2\u05a2\u05a7\7\u0118\2\2\u05a3\u05a4\7\6\2\2\u05a4"+
		"\u05a6\7\u0118\2\2\u05a5\u05a3\3\2\2\2\u05a6\u05a9\3\2\2\2\u05a7\u05a5"+
		"\3\2\2\2\u05a7\u05a8\3\2\2\2\u05a8\u05aa\3\2\2\2\u05a9\u05a7\3\2\2\2\u05aa"+
		"\u05ac\7\5\2\2\u05ab\u05a1\3\2\2\2\u05ab\u05ac\3\2\2\2\u05ac\u05ae\3\2"+
		"\2\2\u05ad\u0594\3\2\2\2\u05ad\u0599\3\2\2\2\u05ad\u05a0\3\2\2\2\u05ae"+
		"\u0087\3\2\2\2\u05af\u05b2\7\u011d\2\2\u05b0\u05b2\7\u011e\2\2\u05b1\u05af"+
		"\3\2\2\2\u05b1\u05b0\3\2\2\2\u05b2\u0089\3\2\2\2\u05b3\u05b4\7\4\2\2\u05b4"+
		"\u05b5\5\u008cG\2\u05b5\u05b6\7\5\2\2\u05b6\u05b9\3\2\2\2\u05b7\u05b9"+
		"\5\u008cG\2\u05b8\u05b3\3\2\2\2\u05b8\u05b7\3\2\2\2\u05b9\u008b\3\2\2"+
		"\2\u05ba\u05bf\5\u0088E\2\u05bb\u05bc\7\6\2\2\u05bc\u05be\5\u0088E\2\u05bd"+
		"\u05bb\3\2\2\2\u05be\u05c1\3\2\2\2\u05bf\u05bd\3\2\2\2\u05bf\u05c0\3\2"+
		"\2\2\u05c0\u008d\3\2\2\2\u05c1\u05bf\3\2\2\2\u05c2\u05c7\5\u0088E\2\u05c3"+
		"\u05c4\7\7\2\2\u05c4\u05c6\5\u0088E\2\u05c5\u05c3\3\2\2\2\u05c6\u05c9"+
		"\3\2\2\2\u05c7\u05c5\3\2\2\2\u05c7\u05c8\3\2\2\2\u05c8\u008f\3\2\2\2\u05c9"+
		"\u05c7\3\2\2\2\u05ca\u05cc\7\u010b\2\2\u05cb\u05ca\3\2\2\2\u05cb\u05cc"+
		"\3\2\2\2\u05cc\u05cd\3\2\2\2\u05cd\u05e3\7\u0118\2\2\u05ce\u05d0\7\u010b"+
		"\2\2\u05cf\u05ce\3\2\2\2\u05cf\u05d0\3\2\2\2\u05d0\u05d1\3\2\2\2\u05d1"+
		"\u05e3\7\u0115\2\2\u05d2\u05d4\7\u010b\2\2\u05d3\u05d2\3\2\2\2\u05d3\u05d4"+
		"\3\2\2\2\u05d4\u05d5\3\2\2\2\u05d5\u05e3\7\u0116\2\2\u05d6\u05d8\7\u010b"+
		"\2\2\u05d7\u05d6\3\2\2\2\u05d7\u05d8\3\2\2\2\u05d8\u05d9\3\2\2\2\u05d9"+
		"\u05e3\7\u0117\2\2\u05da\u05dc\7\u010b\2\2\u05db\u05da\3\2\2\2\u05db\u05dc"+
		"\3\2\2\2\u05dc\u05dd\3\2\2\2\u05dd\u05e3\7\u011b\2\2\u05de\u05e0\7\u010b"+
		"\2\2\u05df\u05de\3\2\2\2\u05df\u05e0\3\2\2\2\u05e0\u05e1\3\2\2\2\u05e1"+
		"\u05e3\7\u011c\2\2\u05e2\u05cb\3\2\2\2\u05e2\u05cf\3\2\2\2\u05e2\u05d3"+
		"\3\2\2\2\u05e2\u05d7\3\2\2\2\u05e2\u05db\3\2\2\2\u05e2\u05df\3\2\2\2\u05e3"+
		"\u0091\3\2\2\2\u00d0\u0096\u009f\u00a7\u00af\u00b1\u00c5\u00c9\u00cf\u00d2"+
		"\u00d5\u00dc\u00e1\u00e4\u00eb\u00f7\u00fe\u0100\u0104\u0107\u010e\u0119"+
		"\u011b\u0122\u012d\u0133\u0137\u013b\u0142\u0145\u0148\u014f\u0154\u015d"+
		"\u0165\u016b\u0173\u017b\u0181\u0184\u0188\u018b\u018f\u01a8\u01ab\u01af"+
		"\u01b5\u01b8\u01bb\u01c1\u01c9\u01ce\u01d4\u01da\u01e6\u01e9\u01eb\u01f9"+
		"\u01fc\u01ff\u0204\u0206\u0210\u0214\u0217\u021a\u021d\u0220\u0226\u022a"+
		"\u022d\u0230\u0233\u0239\u0247\u0253\u025c\u0273\u0275\u027d\u027f\u0283"+
		"\u028b\u0294\u029a\u02a2\u02a7\u02ad\u02b1\u02b6\u02bb\u02c0\u02c6\u02db"+
		"\u02dd\u02e6\u02ea\u02f3\u02f7\u0309\u030c\u0314\u031d\u0334\u0346\u035f"+
		"\u0366\u0369\u0378\u037c\u0386\u0388\u0394\u0396\u039c\u03a0\u03a2\u03a9"+
		"\u03ae\u03b2\u03c5\u03cf\u03d2\u03db\u03de\u03e0\u03e3\u03e6\u03f8\u0401"+
		"\u0407\u0417\u041a\u041d\u0423\u042a\u042d\u0432\u0435\u043a\u043e\u0441"+
		"\u0444\u044a\u0455\u0457\u0460\u0467\u046a\u0471\u0475\u047b\u0481\u0484"+
		"\u048a\u049f\u04a6\u04ad\u04af\u04b4\u04bb\u04bd\u04c2\u04c6\u04cb\u04d0"+
		"\u04d5\u04d8\u04dd\u04e1\u04e6\u04e8\u04ef\u04fc\u0506\u050e\u0517\u0523"+
		"\u0525\u052c\u0533\u0539\u053f\u0541\u0549\u0550\u0559\u0563\u0569\u0572"+
		"\u0579\u057c\u0589\u05a7\u05ab\u05ad\u05b1\u05b8\u05bf\u05c7\u05cb\u05cf"+
		"\u05d3\u05d7\u05db\u05df\u05e2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}