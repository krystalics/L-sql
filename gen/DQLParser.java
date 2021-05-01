// Generated from /Users/krysta/study/L-sql/src/main/resources/DQL.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DQLParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, ADD=19, AFTER=20, ALL=21, ALTER=22, ANALYZE=23, AND=24, ANTI=25, 
		ANY=26, ARCHIVE=27, ARRAY=28, AS=29, ASC=30, AT=31, AUTHORIZATION=32, 
		BETWEEN=33, BOTH=34, BUCKET=35, BUCKETS=36, BY=37, CACHE=38, CASCADE=39, 
		CASE=40, CAST=41, CHANGE=42, CHECK=43, CLEAR=44, CLUSTER=45, CLUSTERED=46, 
		CODEGEN=47, COLLATE=48, COLLECTION=49, COLUMN=50, COLUMNS=51, COMMENT=52, 
		COMMIT=53, COMPACT=54, COMPACTIONS=55, COMPUTE=56, CONCATENATE=57, CONSTRAINT=58, 
		COST=59, CREATE=60, CROSS=61, CUBE=62, CURRENT=63, CURRENT_DATE=64, CURRENT_TIME=65, 
		CURRENT_TIMESTAMP=66, CURRENT_USER=67, DATA=68, DATABASE=69, DATABASES=70, 
		DBPROPERTIES=71, DEFINED=72, DELETE=73, DELIMITED=74, DESC=75, DESCRIBE=76, 
		DFS=77, DIRECTORIES=78, DIRECTORY=79, DISTINCT=80, DISTRIBUTE=81, DIV=82, 
		DROP=83, ELSE=84, END=85, ESCAPE=86, ESCAPED=87, EXCEPT=88, EXCHANGE=89, 
		EXISTS=90, EXPLAIN=91, EXPORT=92, EXTENDED=93, EXTERNAL=94, EXTRACT=95, 
		FALSE=96, FETCH=97, FIELDS=98, FILTER=99, FILEFORMAT=100, FIRST=101, FOLLOWING=102, 
		FOR=103, FOREIGN=104, FORMAT=105, FORMATTED=106, FROM=107, FULL=108, FUNCTION=109, 
		FUNCTIONS=110, GLOBAL=111, GRANT=112, GROUP=113, GROUPING=114, HAVING=115, 
		IF=116, IGNORE=117, IMPORT=118, IN=119, INDEX=120, INDEXES=121, INNER=122, 
		INPATH=123, INPUTFORMAT=124, INSERT=125, INTERSECT=126, INTERVAL=127, 
		INTO=128, IS=129, ITEMS=130, JOIN=131, KEYS=132, LAST=133, LATERAL=134, 
		LAZY=135, LEADING=136, LEFT=137, LIKE=138, LIMIT=139, LINES=140, LIST=141, 
		LOAD=142, LOCAL=143, LOCATION=144, LOCK=145, LOCKS=146, LOGICAL=147, MACRO=148, 
		MAP=149, MATCHED=150, MERGE=151, MSCK=152, NAMESPACE=153, NAMESPACES=154, 
		NATURAL=155, NO=156, NOT=157, NULL=158, NULLS=159, OF=160, ON=161, ONLY=162, 
		OPTION=163, OPTIONS=164, OR=165, ORDER=166, OUT=167, OUTER=168, OUTPUTFORMAT=169, 
		OVER=170, OVERLAPS=171, OVERLAY=172, OVERWRITE=173, PARTITION=174, PARTITIONED=175, 
		PARTITIONS=176, PERCENTLIT=177, PIVOT=178, PLACING=179, POSITION=180, 
		PRECEDING=181, PRIMARY=182, PRINCIPALS=183, PROPERTIES=184, PURGE=185, 
		QUERY=186, RANGE=187, RECORDREADER=188, RECORDWRITER=189, RECOVER=190, 
		REDUCE=191, REFERENCES=192, REFRESH=193, RENAME=194, REPAIR=195, REPLACE=196, 
		RESET=197, RESTRICT=198, REVOKE=199, RIGHT=200, RLIKE=201, ROLE=202, ROLES=203, 
		ROLLBACK=204, ROLLUP=205, ROW=206, ROWS=207, SCHEMA=208, SELECT=209, SEMI=210, 
		SEPARATED=211, SERDE=212, SERDEPROPERTIES=213, SESSION_USER=214, SET=215, 
		SETMINUS=216, SETS=217, SHOW=218, SKEWED=219, SOME=220, SORT=221, SORTED=222, 
		START=223, STATISTICS=224, STORED=225, STRATIFY=226, STRUCT=227, SUBSTR=228, 
		SUBSTRING=229, TABLE=230, TABLES=231, TABLESAMPLE=232, TBLPROPERTIES=233, 
		TEMPORARY=234, TERMINATED=235, THEN=236, TO=237, TOUCH=238, TRAILING=239, 
		TRANSACTION=240, TRANSACTIONS=241, TRANSFORM=242, TRIM=243, TRUE=244, 
		TRUNCATE=245, TYPE=246, UNARCHIVE=247, UNBOUNDED=248, UNCACHE=249, UNION=250, 
		UNIQUE=251, UNKNOWN=252, UNLOCK=253, UNSET=254, UPDATE=255, USE=256, USER=257, 
		USING=258, VALUES=259, VIEW=260, VIEWS=261, WHEN=262, WHERE=263, WINDOW=264, 
		WITH=265, EQ=266, NSEQ=267, NEQ=268, NEQJ=269, LT=270, LTE=271, GT=272, 
		GTE=273, PLUS=274, MINUS=275, ASTERISK=276, SLASH=277, PERCENT=278, TILDE=279, 
		AMPERSAND=280, PIPE=281, CONCAT_PIPE=282, HAT=283, STRING=284, BIGINT_LITERAL=285, 
		SMALLINT_LITERAL=286, TINYINT_LITERAL=287, INTEGER_VALUE=288, EXPONENT_VALUE=289, 
		DECIMAL_VALUE=290, DOUBLE_LITERAL=291, BIGDECIMAL_LITERAL=292, IDENTIFIER=293, 
		BACKQUOTED_IDENTIFIER=294, SIMPLE_COMMENT=295, BRACKETED_EMPTY_COMMENT=296, 
		BRACKETED_COMMENT=297, WS=298, UNRECOGNIZED=299, ID=300, NUMBER=301, BOOLEAN=302;
	public static final int
		RULE_dql = 0, RULE_groupByStat = 1, RULE_orderByStat = 2, RULE_limitStat = 3, 
		RULE_whereStat = 4, RULE_expr = 5, RULE_columns = 6, RULE_value = 7, RULE_item = 8;
	private static String[] makeRuleNames() {
		return new String[] {
			"dql", "groupByStat", "orderByStat", "limitStat", "whereStat", "expr", 
			"columns", "value", "item"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'select'", "'from'", "'group'", "'by'", "'having'", "'and'", "'or'", 
			"'order'", "'limit'", "'offset'", "'where'", "'='", "'>='", "'<='", "'in'", 
			"'('", "')'", "','", "'ADD'", "'AFTER'", "'ALL'", "'ALTER'", "'ANALYZE'", 
			"'AND'", "'ANTI'", "'ANY'", "'ARCHIVE'", "'ARRAY'", "'AS'", "'ASC'", 
			"'AT'", "'AUTHORIZATION'", "'BETWEEN'", "'BOTH'", "'BUCKET'", "'BUCKETS'", 
			"'BY'", "'CACHE'", "'CASCADE'", "'CASE'", "'CAST'", "'CHANGE'", "'CHECK'", 
			"'CLEAR'", "'CLUSTER'", "'CLUSTERED'", "'CODEGEN'", "'COLLATE'", "'COLLECTION'", 
			"'COLUMN'", "'COLUMNS'", "'COMMENT'", "'COMMIT'", "'COMPACT'", "'COMPACTIONS'", 
			"'COMPUTE'", "'CONCATENATE'", "'CONSTRAINT'", "'COST'", "'CREATE'", "'CROSS'", 
			"'CUBE'", "'CURRENT'", "'CURRENT_DATE'", "'CURRENT_TIME'", "'CURRENT_TIMESTAMP'", 
			"'CURRENT_USER'", "'DATA'", "'DATABASE'", null, "'DBPROPERTIES'", "'DEFINED'", 
			"'DELETE'", "'DELIMITED'", "'DESC'", "'DESCRIBE'", "'DFS'", "'DIRECTORIES'", 
			"'DIRECTORY'", "'DISTINCT'", "'DISTRIBUTE'", "'DIV'", "'DROP'", "'ELSE'", 
			"'END'", "'ESCAPE'", "'ESCAPED'", "'EXCEPT'", "'EXCHANGE'", "'EXISTS'", 
			"'EXPLAIN'", "'EXPORT'", "'EXTENDED'", "'EXTERNAL'", "'EXTRACT'", "'FALSE'", 
			"'FETCH'", "'FIELDS'", "'FILTER'", "'FILEFORMAT'", "'FIRST'", "'FOLLOWING'", 
			"'FOR'", "'FOREIGN'", "'FORMAT'", "'FORMATTED'", "'FROM'", "'FULL'", 
			"'FUNCTION'", "'FUNCTIONS'", "'GLOBAL'", "'GRANT'", "'GROUP'", "'GROUPING'", 
			"'HAVING'", "'IF'", "'IGNORE'", "'IMPORT'", "'IN'", "'INDEX'", "'INDEXES'", 
			"'INNER'", "'INPATH'", "'INPUTFORMAT'", "'INSERT'", "'INTERSECT'", "'INTERVAL'", 
			"'INTO'", "'IS'", "'ITEMS'", "'JOIN'", "'KEYS'", "'LAST'", "'LATERAL'", 
			"'LAZY'", "'LEADING'", "'LEFT'", "'LIKE'", "'LIMIT'", "'LINES'", "'LIST'", 
			"'LOAD'", "'LOCAL'", "'LOCATION'", "'LOCK'", "'LOCKS'", "'LOGICAL'", 
			"'MACRO'", "'MAP'", "'MATCHED'", "'MERGE'", "'MSCK'", "'NAMESPACE'", 
			"'NAMESPACES'", "'NATURAL'", "'NO'", null, "'NULL'", "'NULLS'", "'OF'", 
			"'ON'", "'ONLY'", "'OPTION'", "'OPTIONS'", "'OR'", "'ORDER'", "'OUT'", 
			"'OUTER'", "'OUTPUTFORMAT'", "'OVER'", "'OVERLAPS'", "'OVERLAY'", "'OVERWRITE'", 
			"'PARTITION'", "'PARTITIONED'", "'PARTITIONS'", "'PERCENT'", "'PIVOT'", 
			"'PLACING'", "'POSITION'", "'PRECEDING'", "'PRIMARY'", "'PRINCIPALS'", 
			"'PROPERTIES'", "'PURGE'", "'QUERY'", "'RANGE'", "'RECORDREADER'", "'RECORDWRITER'", 
			"'RECOVER'", "'REDUCE'", "'REFERENCES'", "'REFRESH'", "'RENAME'", "'REPAIR'", 
			"'REPLACE'", "'RESET'", "'RESTRICT'", "'REVOKE'", "'RIGHT'", null, "'ROLE'", 
			"'ROLES'", "'ROLLBACK'", "'ROLLUP'", "'ROW'", "'ROWS'", "'SCHEMA'", "'SELECT'", 
			"'SEMI'", "'SEPARATED'", "'SERDE'", "'SERDEPROPERTIES'", "'SESSION_USER'", 
			"'SET'", "'MINUS'", "'SETS'", "'SHOW'", "'SKEWED'", "'SOME'", "'SORT'", 
			"'SORTED'", "'START'", "'STATISTICS'", "'STORED'", "'STRATIFY'", "'STRUCT'", 
			"'SUBSTR'", "'SUBSTRING'", "'TABLE'", "'TABLES'", "'TABLESAMPLE'", "'TBLPROPERTIES'", 
			null, "'TERMINATED'", "'THEN'", "'TO'", "'TOUCH'", "'TRAILING'", "'TRANSACTION'", 
			"'TRANSACTIONS'", "'TRANSFORM'", "'TRIM'", "'TRUE'", "'TRUNCATE'", "'TYPE'", 
			"'UNARCHIVE'", "'UNBOUNDED'", "'UNCACHE'", "'UNION'", "'UNIQUE'", "'UNKNOWN'", 
			"'UNLOCK'", "'UNSET'", "'UPDATE'", "'USE'", "'USER'", "'USING'", "'VALUES'", 
			"'VIEW'", "'VIEWS'", "'WHEN'", "'WHERE'", "'WINDOW'", "'WITH'", null, 
			"'<=>'", "'<>'", "'!='", "'<'", null, "'>'", null, "'+'", "'-'", "'*'", 
			"'/'", "'%'", "'~'", "'&'", "'|'", "'||'", "'^'", null, null, null, null, 
			null, null, null, null, null, null, null, null, "'/**/'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, "ADD", "AFTER", "ALL", "ALTER", 
			"ANALYZE", "AND", "ANTI", "ANY", "ARCHIVE", "ARRAY", "AS", "ASC", "AT", 
			"AUTHORIZATION", "BETWEEN", "BOTH", "BUCKET", "BUCKETS", "BY", "CACHE", 
			"CASCADE", "CASE", "CAST", "CHANGE", "CHECK", "CLEAR", "CLUSTER", "CLUSTERED", 
			"CODEGEN", "COLLATE", "COLLECTION", "COLUMN", "COLUMNS", "COMMENT", "COMMIT", 
			"COMPACT", "COMPACTIONS", "COMPUTE", "CONCATENATE", "CONSTRAINT", "COST", 
			"CREATE", "CROSS", "CUBE", "CURRENT", "CURRENT_DATE", "CURRENT_TIME", 
			"CURRENT_TIMESTAMP", "CURRENT_USER", "DATA", "DATABASE", "DATABASES", 
			"DBPROPERTIES", "DEFINED", "DELETE", "DELIMITED", "DESC", "DESCRIBE", 
			"DFS", "DIRECTORIES", "DIRECTORY", "DISTINCT", "DISTRIBUTE", "DIV", "DROP", 
			"ELSE", "END", "ESCAPE", "ESCAPED", "EXCEPT", "EXCHANGE", "EXISTS", "EXPLAIN", 
			"EXPORT", "EXTENDED", "EXTERNAL", "EXTRACT", "FALSE", "FETCH", "FIELDS", 
			"FILTER", "FILEFORMAT", "FIRST", "FOLLOWING", "FOR", "FOREIGN", "FORMAT", 
			"FORMATTED", "FROM", "FULL", "FUNCTION", "FUNCTIONS", "GLOBAL", "GRANT", 
			"GROUP", "GROUPING", "HAVING", "IF", "IGNORE", "IMPORT", "IN", "INDEX", 
			"INDEXES", "INNER", "INPATH", "INPUTFORMAT", "INSERT", "INTERSECT", "INTERVAL", 
			"INTO", "IS", "ITEMS", "JOIN", "KEYS", "LAST", "LATERAL", "LAZY", "LEADING", 
			"LEFT", "LIKE", "LIMIT", "LINES", "LIST", "LOAD", "LOCAL", "LOCATION", 
			"LOCK", "LOCKS", "LOGICAL", "MACRO", "MAP", "MATCHED", "MERGE", "MSCK", 
			"NAMESPACE", "NAMESPACES", "NATURAL", "NO", "NOT", "NULL", "NULLS", "OF", 
			"ON", "ONLY", "OPTION", "OPTIONS", "OR", "ORDER", "OUT", "OUTER", "OUTPUTFORMAT", 
			"OVER", "OVERLAPS", "OVERLAY", "OVERWRITE", "PARTITION", "PARTITIONED", 
			"PARTITIONS", "PERCENTLIT", "PIVOT", "PLACING", "POSITION", "PRECEDING", 
			"PRIMARY", "PRINCIPALS", "PROPERTIES", "PURGE", "QUERY", "RANGE", "RECORDREADER", 
			"RECORDWRITER", "RECOVER", "REDUCE", "REFERENCES", "REFRESH", "RENAME", 
			"REPAIR", "REPLACE", "RESET", "RESTRICT", "REVOKE", "RIGHT", "RLIKE", 
			"ROLE", "ROLES", "ROLLBACK", "ROLLUP", "ROW", "ROWS", "SCHEMA", "SELECT", 
			"SEMI", "SEPARATED", "SERDE", "SERDEPROPERTIES", "SESSION_USER", "SET", 
			"SETMINUS", "SETS", "SHOW", "SKEWED", "SOME", "SORT", "SORTED", "START", 
			"STATISTICS", "STORED", "STRATIFY", "STRUCT", "SUBSTR", "SUBSTRING", 
			"TABLE", "TABLES", "TABLESAMPLE", "TBLPROPERTIES", "TEMPORARY", "TERMINATED", 
			"THEN", "TO", "TOUCH", "TRAILING", "TRANSACTION", "TRANSACTIONS", "TRANSFORM", 
			"TRIM", "TRUE", "TRUNCATE", "TYPE", "UNARCHIVE", "UNBOUNDED", "UNCACHE", 
			"UNION", "UNIQUE", "UNKNOWN", "UNLOCK", "UNSET", "UPDATE", "USE", "USER", 
			"USING", "VALUES", "VIEW", "VIEWS", "WHEN", "WHERE", "WINDOW", "WITH", 
			"EQ", "NSEQ", "NEQ", "NEQJ", "LT", "LTE", "GT", "GTE", "PLUS", "MINUS", 
			"ASTERISK", "SLASH", "PERCENT", "TILDE", "AMPERSAND", "PIPE", "CONCAT_PIPE", 
			"HAT", "STRING", "BIGINT_LITERAL", "SMALLINT_LITERAL", "TINYINT_LITERAL", 
			"INTEGER_VALUE", "EXPONENT_VALUE", "DECIMAL_VALUE", "DOUBLE_LITERAL", 
			"BIGDECIMAL_LITERAL", "IDENTIFIER", "BACKQUOTED_IDENTIFIER", "SIMPLE_COMMENT", 
			"BRACKETED_EMPTY_COMMENT", "BRACKETED_COMMENT", "WS", "UNRECOGNIZED", 
			"ID", "NUMBER", "BOOLEAN"
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
	public String getGrammarFileName() { return "DQL.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public DQLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class DqlContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(DQLParser.ID, 0); }
		public TerminalNode ASTERISK() { return getToken(DQLParser.ASTERISK, 0); }
		public ColumnsContext columns() {
			return getRuleContext(ColumnsContext.class,0);
		}
		public WhereStatContext whereStat() {
			return getRuleContext(WhereStatContext.class,0);
		}
		public GroupByStatContext groupByStat() {
			return getRuleContext(GroupByStatContext.class,0);
		}
		public OrderByStatContext orderByStat() {
			return getRuleContext(OrderByStatContext.class,0);
		}
		public LimitStatContext limitStat() {
			return getRuleContext(LimitStatContext.class,0);
		}
		public DqlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dql; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DQLListener ) ((DQLListener)listener).enterDql(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DQLListener ) ((DQLListener)listener).exitDql(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DQLVisitor ) return ((DQLVisitor<? extends T>)visitor).visitDql(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DqlContext dql() throws RecognitionException {
		DqlContext _localctx = new DqlContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_dql);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(18);
			match(T__0);
			setState(21);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ASTERISK:
				{
				setState(19);
				match(ASTERISK);
				}
				break;
			case ID:
				{
				setState(20);
				columns();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(23);
			match(T__1);
			setState(24);
			match(ID);
			setState(26);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__10) {
				{
				setState(25);
				whereStat();
				}
			}

			setState(29);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(28);
				groupByStat();
				}
			}

			setState(32);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(31);
				orderByStat();
				}
			}

			setState(35);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__8) {
				{
				setState(34);
				limitStat();
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

	public static class GroupByStatContext extends ParserRuleContext {
		public ColumnsContext columns() {
			return getRuleContext(ColumnsContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public GroupByStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupByStat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DQLListener ) ((DQLListener)listener).enterGroupByStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DQLListener ) ((DQLListener)listener).exitGroupByStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DQLVisitor ) return ((DQLVisitor<? extends T>)visitor).visitGroupByStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GroupByStatContext groupByStat() throws RecognitionException {
		GroupByStatContext _localctx = new GroupByStatContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_groupByStat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
			match(T__2);
			setState(38);
			match(T__3);
			setState(39);
			columns();
			setState(49);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(40);
				match(T__4);
				setState(41);
				expr(0);
				setState(46);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__5 || _la==T__6) {
					{
					{
					setState(42);
					_la = _input.LA(1);
					if ( !(_la==T__5 || _la==T__6) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(43);
					expr(0);
					}
					}
					setState(48);
					_errHandler.sync(this);
					_la = _input.LA(1);
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

	public static class OrderByStatContext extends ParserRuleContext {
		public ColumnsContext columns() {
			return getRuleContext(ColumnsContext.class,0);
		}
		public OrderByStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderByStat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DQLListener ) ((DQLListener)listener).enterOrderByStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DQLListener ) ((DQLListener)listener).exitOrderByStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DQLVisitor ) return ((DQLVisitor<? extends T>)visitor).visitOrderByStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrderByStatContext orderByStat() throws RecognitionException {
		OrderByStatContext _localctx = new OrderByStatContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_orderByStat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			match(T__7);
			setState(52);
			match(T__3);
			setState(53);
			columns();
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

	public static class LimitStatContext extends ParserRuleContext {
		public List<TerminalNode> NUMBER() { return getTokens(DQLParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(DQLParser.NUMBER, i);
		}
		public LimitStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_limitStat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DQLListener ) ((DQLListener)listener).enterLimitStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DQLListener ) ((DQLListener)listener).exitLimitStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DQLVisitor ) return ((DQLVisitor<? extends T>)visitor).visitLimitStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LimitStatContext limitStat() throws RecognitionException {
		LimitStatContext _localctx = new LimitStatContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_limitStat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			match(T__8);
			setState(56);
			match(NUMBER);
			setState(59);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__9) {
				{
				setState(57);
				match(T__9);
				setState(58);
				match(NUMBER);
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

	public static class WhereStatContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public WhereStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whereStat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DQLListener ) ((DQLListener)listener).enterWhereStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DQLListener ) ((DQLListener)listener).exitWhereStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DQLVisitor ) return ((DQLVisitor<? extends T>)visitor).visitWhereStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhereStatContext whereStat() throws RecognitionException {
		WhereStatContext _localctx = new WhereStatContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_whereStat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			match(T__10);
			setState(62);
			expr(0);
			setState(67);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5 || _la==T__6) {
				{
				{
				setState(63);
				_la = _input.LA(1);
				if ( !(_la==T__5 || _la==T__6) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(64);
				expr(0);
				}
				}
				setState(69);
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

	public static class ExprContext extends ParserRuleContext {
		public DqlContext dql() {
			return getRuleContext(DqlContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode ID() { return getToken(DQLParser.ID, 0); }
		public ItemContext item() {
			return getRuleContext(ItemContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode GT() { return getToken(DQLParser.GT, 0); }
		public TerminalNode LT() { return getToken(DQLParser.LT, 0); }
		public TerminalNode NEQJ() { return getToken(DQLParser.NEQJ, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DQLListener ) ((DQLListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DQLListener ) ((DQLListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DQLVisitor ) return ((DQLVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(71);
				match(T__15);
				setState(72);
				dql();
				setState(73);
				match(T__16);
				}
				break;
			case 2:
				{
				setState(75);
				value();
				}
				break;
			case 3:
				{
				setState(76);
				match(ID);
				}
				break;
			case 4:
				{
				setState(77);
				item();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(103);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(101);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(80);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(81);
						match(T__11);
						setState(82);
						expr(12);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(83);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(84);
						match(GT);
						setState(85);
						expr(11);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(86);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(87);
						match(T__12);
						setState(88);
						expr(10);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(89);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(90);
						match(LT);
						setState(91);
						expr(9);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(92);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(93);
						match(T__13);
						setState(94);
						expr(8);
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(95);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(96);
						match(NEQJ);
						setState(97);
						expr(7);
						}
						break;
					case 7:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(98);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(99);
						match(T__14);
						setState(100);
						expr(6);
						}
						break;
					}
					} 
				}
				setState(105);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
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

	public static class ColumnsContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(DQLParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(DQLParser.ID, i);
		}
		public ColumnsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columns; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DQLListener ) ((DQLListener)listener).enterColumns(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DQLListener ) ((DQLListener)listener).exitColumns(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DQLVisitor ) return ((DQLVisitor<? extends T>)visitor).visitColumns(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnsContext columns() throws RecognitionException {
		ColumnsContext _localctx = new ColumnsContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_columns);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			match(ID);
			setState(111);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__17) {
				{
				{
				setState(107);
				match(T__17);
				setState(108);
				match(ID);
				}
				}
				setState(113);
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

	public static class ValueContext extends ParserRuleContext {
		public List<ItemContext> item() {
			return getRuleContexts(ItemContext.class);
		}
		public ItemContext item(int i) {
			return getRuleContext(ItemContext.class,i);
		}
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DQLListener ) ((DQLListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DQLListener ) ((DQLListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DQLVisitor ) return ((DQLVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			match(T__15);
			setState(115);
			item();
			setState(120);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__17) {
				{
				{
				setState(116);
				match(T__17);
				setState(117);
				item();
				}
				}
				setState(122);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(123);
			match(T__16);
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

	public static class ItemContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(DQLParser.STRING, 0); }
		public TerminalNode NUMBER() { return getToken(DQLParser.NUMBER, 0); }
		public TerminalNode BOOLEAN() { return getToken(DQLParser.BOOLEAN, 0); }
		public ItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DQLListener ) ((DQLListener)listener).enterItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DQLListener ) ((DQLListener)listener).exitItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DQLVisitor ) return ((DQLVisitor<? extends T>)visitor).visitItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ItemContext item() throws RecognitionException {
		ItemContext _localctx = new ItemContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_item);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			_la = _input.LA(1);
			if ( !(((((_la - 284)) & ~0x3f) == 0 && ((1L << (_la - 284)) & ((1L << (STRING - 284)) | (1L << (NUMBER - 284)) | (1L << (BOOLEAN - 284)))) != 0)) ) {
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 5:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 11);
		case 1:
			return precpred(_ctx, 10);
		case 2:
			return precpred(_ctx, 9);
		case 3:
			return precpred(_ctx, 8);
		case 4:
			return precpred(_ctx, 7);
		case 5:
			return precpred(_ctx, 6);
		case 6:
			return precpred(_ctx, 5);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u0130\u0082\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2"+
		"\3\2\3\2\5\2\30\n\2\3\2\3\2\3\2\5\2\35\n\2\3\2\5\2 \n\2\3\2\5\2#\n\2\3"+
		"\2\5\2&\n\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3/\n\3\f\3\16\3\62\13\3\5\3"+
		"\64\n\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\5\5>\n\5\3\6\3\6\3\6\3\6\7\6D"+
		"\n\6\f\6\16\6G\13\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7Q\n\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\7\7h\n\7\f\7\16\7k\13\7\3\b\3\b\3\b\7\bp\n\b\f\b\16\bs\13\b\3\t\3"+
		"\t\3\t\3\t\7\ty\n\t\f\t\16\t|\13\t\3\t\3\t\3\n\3\n\3\n\2\3\f\13\2\4\6"+
		"\b\n\f\16\20\22\2\4\3\2\b\t\4\2\u011e\u011e\u012f\u0130\2\u008d\2\24\3"+
		"\2\2\2\4\'\3\2\2\2\6\65\3\2\2\2\b9\3\2\2\2\n?\3\2\2\2\fP\3\2\2\2\16l\3"+
		"\2\2\2\20t\3\2\2\2\22\177\3\2\2\2\24\27\7\3\2\2\25\30\7\u0116\2\2\26\30"+
		"\5\16\b\2\27\25\3\2\2\2\27\26\3\2\2\2\30\31\3\2\2\2\31\32\7\4\2\2\32\34"+
		"\7\u012e\2\2\33\35\5\n\6\2\34\33\3\2\2\2\34\35\3\2\2\2\35\37\3\2\2\2\36"+
		" \5\4\3\2\37\36\3\2\2\2\37 \3\2\2\2 \"\3\2\2\2!#\5\6\4\2\"!\3\2\2\2\""+
		"#\3\2\2\2#%\3\2\2\2$&\5\b\5\2%$\3\2\2\2%&\3\2\2\2&\3\3\2\2\2\'(\7\5\2"+
		"\2()\7\6\2\2)\63\5\16\b\2*+\7\7\2\2+\60\5\f\7\2,-\t\2\2\2-/\5\f\7\2.,"+
		"\3\2\2\2/\62\3\2\2\2\60.\3\2\2\2\60\61\3\2\2\2\61\64\3\2\2\2\62\60\3\2"+
		"\2\2\63*\3\2\2\2\63\64\3\2\2\2\64\5\3\2\2\2\65\66\7\n\2\2\66\67\7\6\2"+
		"\2\678\5\16\b\28\7\3\2\2\29:\7\13\2\2:=\7\u012f\2\2;<\7\f\2\2<>\7\u012f"+
		"\2\2=;\3\2\2\2=>\3\2\2\2>\t\3\2\2\2?@\7\r\2\2@E\5\f\7\2AB\t\2\2\2BD\5"+
		"\f\7\2CA\3\2\2\2DG\3\2\2\2EC\3\2\2\2EF\3\2\2\2F\13\3\2\2\2GE\3\2\2\2H"+
		"I\b\7\1\2IJ\7\22\2\2JK\5\2\2\2KL\7\23\2\2LQ\3\2\2\2MQ\5\20\t\2NQ\7\u012e"+
		"\2\2OQ\5\22\n\2PH\3\2\2\2PM\3\2\2\2PN\3\2\2\2PO\3\2\2\2Qi\3\2\2\2RS\f"+
		"\r\2\2ST\7\16\2\2Th\5\f\7\16UV\f\f\2\2VW\7\u0112\2\2Wh\5\f\7\rXY\f\13"+
		"\2\2YZ\7\17\2\2Zh\5\f\7\f[\\\f\n\2\2\\]\7\u0110\2\2]h\5\f\7\13^_\f\t\2"+
		"\2_`\7\20\2\2`h\5\f\7\nab\f\b\2\2bc\7\u010f\2\2ch\5\f\7\tde\f\7\2\2ef"+
		"\7\21\2\2fh\5\f\7\bgR\3\2\2\2gU\3\2\2\2gX\3\2\2\2g[\3\2\2\2g^\3\2\2\2"+
		"ga\3\2\2\2gd\3\2\2\2hk\3\2\2\2ig\3\2\2\2ij\3\2\2\2j\r\3\2\2\2ki\3\2\2"+
		"\2lq\7\u012e\2\2mn\7\24\2\2np\7\u012e\2\2om\3\2\2\2ps\3\2\2\2qo\3\2\2"+
		"\2qr\3\2\2\2r\17\3\2\2\2sq\3\2\2\2tu\7\22\2\2uz\5\22\n\2vw\7\24\2\2wy"+
		"\5\22\n\2xv\3\2\2\2y|\3\2\2\2zx\3\2\2\2z{\3\2\2\2{}\3\2\2\2|z\3\2\2\2"+
		"}~\7\23\2\2~\21\3\2\2\2\177\u0080\t\3\2\2\u0080\23\3\2\2\2\20\27\34\37"+
		"\"%\60\63=EPgiqz";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}