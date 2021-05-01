// Generated from /Users/krysta/study/L-sql/src/main/resources/DML.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DMLParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, ADD=26, AFTER=27, ALL=28, ALTER=29, ANALYZE=30, AND=31, ANTI=32, 
		ANY=33, ARCHIVE=34, ARRAY=35, AS=36, ASC=37, AT=38, AUTHORIZATION=39, 
		BETWEEN=40, BOTH=41, BUCKET=42, BUCKETS=43, BY=44, CACHE=45, CASCADE=46, 
		CASE=47, CAST=48, CHANGE=49, CHECK=50, CLEAR=51, CLUSTER=52, CLUSTERED=53, 
		CODEGEN=54, COLLATE=55, COLLECTION=56, COLUMN=57, COLUMNS=58, COMMENT=59, 
		COMMIT=60, COMPACT=61, COMPACTIONS=62, COMPUTE=63, CONCATENATE=64, CONSTRAINT=65, 
		COST=66, CREATE=67, CROSS=68, CUBE=69, CURRENT=70, CURRENT_DATE=71, CURRENT_TIME=72, 
		CURRENT_TIMESTAMP=73, CURRENT_USER=74, DATA=75, DATABASE=76, DATABASES=77, 
		DBPROPERTIES=78, DEFINED=79, DELETE=80, DELIMITED=81, DESC=82, DESCRIBE=83, 
		DFS=84, DIRECTORIES=85, DIRECTORY=86, DISTINCT=87, DISTRIBUTE=88, DIV=89, 
		DROP=90, ELSE=91, END=92, ESCAPE=93, ESCAPED=94, EXCEPT=95, EXCHANGE=96, 
		EXISTS=97, EXPLAIN=98, EXPORT=99, EXTENDED=100, EXTERNAL=101, EXTRACT=102, 
		FALSE=103, FETCH=104, FIELDS=105, FILTER=106, FILEFORMAT=107, FIRST=108, 
		FOLLOWING=109, FOR=110, FOREIGN=111, FORMAT=112, FORMATTED=113, FROM=114, 
		FULL=115, FUNCTION=116, FUNCTIONS=117, GLOBAL=118, GRANT=119, GROUP=120, 
		GROUPING=121, HAVING=122, IF=123, IGNORE=124, IMPORT=125, IN=126, INDEX=127, 
		INDEXES=128, INNER=129, INPATH=130, INPUTFORMAT=131, INSERT=132, INTERSECT=133, 
		INTERVAL=134, INTO=135, IS=136, ITEMS=137, JOIN=138, KEYS=139, LAST=140, 
		LATERAL=141, LAZY=142, LEADING=143, LEFT=144, LIKE=145, LIMIT=146, LINES=147, 
		LIST=148, LOAD=149, LOCAL=150, LOCATION=151, LOCK=152, LOCKS=153, LOGICAL=154, 
		MACRO=155, MAP=156, MATCHED=157, MERGE=158, MSCK=159, NAMESPACE=160, NAMESPACES=161, 
		NATURAL=162, NO=163, NOT=164, NULL=165, NULLS=166, OF=167, ON=168, ONLY=169, 
		OPTION=170, OPTIONS=171, OR=172, ORDER=173, OUT=174, OUTER=175, OUTPUTFORMAT=176, 
		OVER=177, OVERLAPS=178, OVERLAY=179, OVERWRITE=180, PARTITION=181, PARTITIONED=182, 
		PARTITIONS=183, PERCENTLIT=184, PIVOT=185, PLACING=186, POSITION=187, 
		PRECEDING=188, PRIMARY=189, PRINCIPALS=190, PROPERTIES=191, PURGE=192, 
		QUERY=193, RANGE=194, RECORDREADER=195, RECORDWRITER=196, RECOVER=197, 
		REDUCE=198, REFERENCES=199, REFRESH=200, RENAME=201, REPAIR=202, REPLACE=203, 
		RESET=204, RESTRICT=205, REVOKE=206, RIGHT=207, RLIKE=208, ROLE=209, ROLES=210, 
		ROLLBACK=211, ROLLUP=212, ROW=213, ROWS=214, SCHEMA=215, SELECT=216, SEMI=217, 
		SEPARATED=218, SERDE=219, SERDEPROPERTIES=220, SESSION_USER=221, SET=222, 
		SETMINUS=223, SETS=224, SHOW=225, SKEWED=226, SOME=227, SORT=228, SORTED=229, 
		START=230, STATISTICS=231, STORED=232, STRATIFY=233, STRUCT=234, SUBSTR=235, 
		SUBSTRING=236, TABLE=237, TABLES=238, TABLESAMPLE=239, TBLPROPERTIES=240, 
		TEMPORARY=241, TERMINATED=242, THEN=243, TO=244, TOUCH=245, TRAILING=246, 
		TRANSACTION=247, TRANSACTIONS=248, TRANSFORM=249, TRIM=250, TRUE=251, 
		TRUNCATE=252, TYPE=253, UNARCHIVE=254, UNBOUNDED=255, UNCACHE=256, UNION=257, 
		UNIQUE=258, UNKNOWN=259, UNLOCK=260, UNSET=261, UPDATE=262, USE=263, USER=264, 
		USING=265, VALUES=266, VIEW=267, VIEWS=268, WHEN=269, WHERE=270, WINDOW=271, 
		WITH=272, EQ=273, NSEQ=274, NEQ=275, NEQJ=276, LT=277, LTE=278, GT=279, 
		GTE=280, PLUS=281, MINUS=282, ASTERISK=283, SLASH=284, PERCENT=285, TILDE=286, 
		AMPERSAND=287, PIPE=288, CONCAT_PIPE=289, HAT=290, STRING=291, BIGINT_LITERAL=292, 
		SMALLINT_LITERAL=293, TINYINT_LITERAL=294, INTEGER_VALUE=295, EXPONENT_VALUE=296, 
		DECIMAL_VALUE=297, DOUBLE_LITERAL=298, BIGDECIMAL_LITERAL=299, IDENTIFIER=300, 
		BACKQUOTED_IDENTIFIER=301, SIMPLE_COMMENT=302, BRACKETED_EMPTY_COMMENT=303, 
		BRACKETED_COMMENT=304, WS=305, UNRECOGNIZED=306, ID=307, NUMBER=308, BOOLEAN=309;
	public static final int
		RULE_dml = 0, RULE_insert = 1, RULE_values = 2, RULE_delete = 3, RULE_update = 4, 
		RULE_assign = 5, RULE_setStat = 6, RULE_dql = 7, RULE_groupByStat = 8, 
		RULE_orderByStat = 9, RULE_limitStat = 10, RULE_whereStat = 11, RULE_expr = 12, 
		RULE_columns = 13, RULE_value = 14, RULE_item = 15;
	private static String[] makeRuleNames() {
		return new String[] {
			"dml", "insert", "values", "delete", "update", "assign", "setStat", "dql", 
			"groupByStat", "orderByStat", "limitStat", "whereStat", "expr", "columns", 
			"value", "item"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'insert'", "'into'", "'table'", "'('", "')'", "'values'", "','", 
			"'delete'", "'from'", "'update'", "'='", "'set'", "'select'", "'group'", 
			"'by'", "'having'", "'and'", "'or'", "'order'", "'limit'", "'offset'", 
			"'where'", "'>='", "'<='", "'in'", "'ADD'", "'AFTER'", "'ALL'", "'ALTER'", 
			"'ANALYZE'", "'AND'", "'ANTI'", "'ANY'", "'ARCHIVE'", "'ARRAY'", "'AS'", 
			"'ASC'", "'AT'", "'AUTHORIZATION'", "'BETWEEN'", "'BOTH'", "'BUCKET'", 
			"'BUCKETS'", "'BY'", "'CACHE'", "'CASCADE'", "'CASE'", "'CAST'", "'CHANGE'", 
			"'CHECK'", "'CLEAR'", "'CLUSTER'", "'CLUSTERED'", "'CODEGEN'", "'COLLATE'", 
			"'COLLECTION'", "'COLUMN'", "'COLUMNS'", "'COMMENT'", "'COMMIT'", "'COMPACT'", 
			"'COMPACTIONS'", "'COMPUTE'", "'CONCATENATE'", "'CONSTRAINT'", "'COST'", 
			"'CREATE'", "'CROSS'", "'CUBE'", "'CURRENT'", "'CURRENT_DATE'", "'CURRENT_TIME'", 
			"'CURRENT_TIMESTAMP'", "'CURRENT_USER'", "'DATA'", "'DATABASE'", null, 
			"'DBPROPERTIES'", "'DEFINED'", "'DELETE'", "'DELIMITED'", "'DESC'", "'DESCRIBE'", 
			"'DFS'", "'DIRECTORIES'", "'DIRECTORY'", "'DISTINCT'", "'DISTRIBUTE'", 
			"'DIV'", "'DROP'", "'ELSE'", "'END'", "'ESCAPE'", "'ESCAPED'", "'EXCEPT'", 
			"'EXCHANGE'", "'EXISTS'", "'EXPLAIN'", "'EXPORT'", "'EXTENDED'", "'EXTERNAL'", 
			"'EXTRACT'", "'FALSE'", "'FETCH'", "'FIELDS'", "'FILTER'", "'FILEFORMAT'", 
			"'FIRST'", "'FOLLOWING'", "'FOR'", "'FOREIGN'", "'FORMAT'", "'FORMATTED'", 
			"'FROM'", "'FULL'", "'FUNCTION'", "'FUNCTIONS'", "'GLOBAL'", "'GRANT'", 
			"'GROUP'", "'GROUPING'", "'HAVING'", "'IF'", "'IGNORE'", "'IMPORT'", 
			"'IN'", "'INDEX'", "'INDEXES'", "'INNER'", "'INPATH'", "'INPUTFORMAT'", 
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
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "ADD", "AFTER", "ALL", "ALTER", "ANALYZE", "AND", "ANTI", 
			"ANY", "ARCHIVE", "ARRAY", "AS", "ASC", "AT", "AUTHORIZATION", "BETWEEN", 
			"BOTH", "BUCKET", "BUCKETS", "BY", "CACHE", "CASCADE", "CASE", "CAST", 
			"CHANGE", "CHECK", "CLEAR", "CLUSTER", "CLUSTERED", "CODEGEN", "COLLATE", 
			"COLLECTION", "COLUMN", "COLUMNS", "COMMENT", "COMMIT", "COMPACT", "COMPACTIONS", 
			"COMPUTE", "CONCATENATE", "CONSTRAINT", "COST", "CREATE", "CROSS", "CUBE", 
			"CURRENT", "CURRENT_DATE", "CURRENT_TIME", "CURRENT_TIMESTAMP", "CURRENT_USER", 
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
			"BRACKETED_COMMENT", "WS", "UNRECOGNIZED", "ID", "NUMBER", "BOOLEAN"
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
	public String getGrammarFileName() { return "DML.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public DMLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class DmlContext extends ParserRuleContext {
		public InsertContext insert() {
			return getRuleContext(InsertContext.class,0);
		}
		public DeleteContext delete() {
			return getRuleContext(DeleteContext.class,0);
		}
		public UpdateContext update() {
			return getRuleContext(UpdateContext.class,0);
		}
		public DmlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dml; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DMLListener ) ((DMLListener)listener).enterDml(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DMLListener ) ((DMLListener)listener).exitDml(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DMLVisitor ) return ((DMLVisitor<? extends T>)visitor).visitDml(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DmlContext dml() throws RecognitionException {
		DmlContext _localctx = new DmlContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_dml);
		try {
			setState(35);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(32);
				insert();
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 2);
				{
				setState(33);
				delete();
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 3);
				{
				setState(34);
				update();
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

	public static class InsertContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(DMLParser.ID, 0); }
		public ValuesContext values() {
			return getRuleContext(ValuesContext.class,0);
		}
		public ColumnsContext columns() {
			return getRuleContext(ColumnsContext.class,0);
		}
		public InsertContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insert; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DMLListener ) ((DMLListener)listener).enterInsert(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DMLListener ) ((DMLListener)listener).exitInsert(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DMLVisitor ) return ((DMLVisitor<? extends T>)visitor).visitInsert(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InsertContext insert() throws RecognitionException {
		InsertContext _localctx = new InsertContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_insert);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
			match(T__0);
			setState(38);
			match(T__1);
			setState(39);
			match(T__2);
			setState(40);
			match(ID);
			setState(45);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(41);
				match(T__3);
				setState(42);
				columns();
				setState(43);
				match(T__4);
				}
			}

			setState(47);
			match(T__5);
			setState(48);
			values();
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

	public static class ValuesContext extends ParserRuleContext {
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public ValuesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_values; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DMLListener ) ((DMLListener)listener).enterValues(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DMLListener ) ((DMLListener)listener).exitValues(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DMLVisitor ) return ((DMLVisitor<? extends T>)visitor).visitValues(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValuesContext values() throws RecognitionException {
		ValuesContext _localctx = new ValuesContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_values);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			value();
			setState(55);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(51);
				match(T__6);
				setState(52);
				value();
				}
				}
				setState(57);
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

	public static class DeleteContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(DMLParser.ID, 0); }
		public WhereStatContext whereStat() {
			return getRuleContext(WhereStatContext.class,0);
		}
		public DeleteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delete; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DMLListener ) ((DMLListener)listener).enterDelete(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DMLListener ) ((DMLListener)listener).exitDelete(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DMLVisitor ) return ((DMLVisitor<? extends T>)visitor).visitDelete(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeleteContext delete() throws RecognitionException {
		DeleteContext _localctx = new DeleteContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_delete);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			match(T__7);
			setState(59);
			match(T__8);
			setState(60);
			match(ID);
			setState(61);
			whereStat();
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

	public static class UpdateContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(DMLParser.ID, 0); }
		public SetStatContext setStat() {
			return getRuleContext(SetStatContext.class,0);
		}
		public WhereStatContext whereStat() {
			return getRuleContext(WhereStatContext.class,0);
		}
		public UpdateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_update; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DMLListener ) ((DMLListener)listener).enterUpdate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DMLListener ) ((DMLListener)listener).exitUpdate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DMLVisitor ) return ((DMLVisitor<? extends T>)visitor).visitUpdate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UpdateContext update() throws RecognitionException {
		UpdateContext _localctx = new UpdateContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_update);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			match(T__9);
			setState(64);
			match(ID);
			setState(65);
			setStat();
			setState(66);
			whereStat();
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

	public static class AssignContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(DMLParser.ID, 0); }
		public ItemContext item() {
			return getRuleContext(ItemContext.class,0);
		}
		public AssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DMLListener ) ((DMLListener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DMLListener ) ((DMLListener)listener).exitAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DMLVisitor ) return ((DMLVisitor<? extends T>)visitor).visitAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			match(ID);
			setState(69);
			match(T__10);
			setState(70);
			item();
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

	public static class SetStatContext extends ParserRuleContext {
		public List<AssignContext> assign() {
			return getRuleContexts(AssignContext.class);
		}
		public AssignContext assign(int i) {
			return getRuleContext(AssignContext.class,i);
		}
		public SetStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setStat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DMLListener ) ((DMLListener)listener).enterSetStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DMLListener ) ((DMLListener)listener).exitSetStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DMLVisitor ) return ((DMLVisitor<? extends T>)visitor).visitSetStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetStatContext setStat() throws RecognitionException {
		SetStatContext _localctx = new SetStatContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_setStat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			match(T__11);
			setState(73);
			assign();
			setState(78);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(74);
				match(T__6);
				setState(75);
				assign();
				}
				}
				setState(80);
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

	public static class DqlContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(DMLParser.ID, 0); }
		public TerminalNode ASTERISK() { return getToken(DMLParser.ASTERISK, 0); }
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
			if ( listener instanceof DMLListener ) ((DMLListener)listener).enterDql(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DMLListener ) ((DMLListener)listener).exitDql(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DMLVisitor ) return ((DMLVisitor<? extends T>)visitor).visitDql(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DqlContext dql() throws RecognitionException {
		DqlContext _localctx = new DqlContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_dql);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			match(T__12);
			setState(84);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ASTERISK:
				{
				setState(82);
				match(ASTERISK);
				}
				break;
			case ID:
				{
				setState(83);
				columns();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(86);
			match(T__8);
			setState(87);
			match(ID);
			setState(89);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__21) {
				{
				setState(88);
				whereStat();
				}
			}

			setState(92);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__13) {
				{
				setState(91);
				groupByStat();
				}
			}

			setState(95);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__18) {
				{
				setState(94);
				orderByStat();
				}
			}

			setState(98);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__19) {
				{
				setState(97);
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
			if ( listener instanceof DMLListener ) ((DMLListener)listener).enterGroupByStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DMLListener ) ((DMLListener)listener).exitGroupByStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DMLVisitor ) return ((DMLVisitor<? extends T>)visitor).visitGroupByStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GroupByStatContext groupByStat() throws RecognitionException {
		GroupByStatContext _localctx = new GroupByStatContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_groupByStat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			match(T__13);
			setState(101);
			match(T__14);
			setState(102);
			columns();
			setState(112);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__15) {
				{
				setState(103);
				match(T__15);
				setState(104);
				expr(0);
				setState(109);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__16 || _la==T__17) {
					{
					{
					setState(105);
					_la = _input.LA(1);
					if ( !(_la==T__16 || _la==T__17) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(106);
					expr(0);
					}
					}
					setState(111);
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
			if ( listener instanceof DMLListener ) ((DMLListener)listener).enterOrderByStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DMLListener ) ((DMLListener)listener).exitOrderByStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DMLVisitor ) return ((DMLVisitor<? extends T>)visitor).visitOrderByStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrderByStatContext orderByStat() throws RecognitionException {
		OrderByStatContext _localctx = new OrderByStatContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_orderByStat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			match(T__18);
			setState(115);
			match(T__14);
			setState(116);
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
		public List<TerminalNode> NUMBER() { return getTokens(DMLParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(DMLParser.NUMBER, i);
		}
		public LimitStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_limitStat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DMLListener ) ((DMLListener)listener).enterLimitStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DMLListener ) ((DMLListener)listener).exitLimitStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DMLVisitor ) return ((DMLVisitor<? extends T>)visitor).visitLimitStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LimitStatContext limitStat() throws RecognitionException {
		LimitStatContext _localctx = new LimitStatContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_limitStat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			match(T__19);
			setState(119);
			match(NUMBER);
			setState(122);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__20) {
				{
				setState(120);
				match(T__20);
				setState(121);
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
			if ( listener instanceof DMLListener ) ((DMLListener)listener).enterWhereStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DMLListener ) ((DMLListener)listener).exitWhereStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DMLVisitor ) return ((DMLVisitor<? extends T>)visitor).visitWhereStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhereStatContext whereStat() throws RecognitionException {
		WhereStatContext _localctx = new WhereStatContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_whereStat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			match(T__21);
			setState(125);
			expr(0);
			setState(130);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__16 || _la==T__17) {
				{
				{
				setState(126);
				_la = _input.LA(1);
				if ( !(_la==T__16 || _la==T__17) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(127);
				expr(0);
				}
				}
				setState(132);
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
		public TerminalNode ID() { return getToken(DMLParser.ID, 0); }
		public ItemContext item() {
			return getRuleContext(ItemContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode GT() { return getToken(DMLParser.GT, 0); }
		public TerminalNode LT() { return getToken(DMLParser.LT, 0); }
		public TerminalNode NEQJ() { return getToken(DMLParser.NEQJ, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DMLListener ) ((DMLListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DMLListener ) ((DMLListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DMLVisitor ) return ((DMLVisitor<? extends T>)visitor).visitExpr(this);
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
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(134);
				match(T__3);
				setState(135);
				dql();
				setState(136);
				match(T__4);
				}
				break;
			case 2:
				{
				setState(138);
				value();
				}
				break;
			case 3:
				{
				setState(139);
				match(ID);
				}
				break;
			case 4:
				{
				setState(140);
				item();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(166);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(164);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(143);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(144);
						match(T__10);
						setState(145);
						expr(12);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(146);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(147);
						match(GT);
						setState(148);
						expr(11);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(149);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(150);
						match(T__22);
						setState(151);
						expr(10);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(152);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(153);
						match(LT);
						setState(154);
						expr(9);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(155);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(156);
						match(T__23);
						setState(157);
						expr(8);
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(158);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(159);
						match(NEQJ);
						setState(160);
						expr(7);
						}
						break;
					case 7:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(161);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(162);
						match(T__24);
						setState(163);
						expr(6);
						}
						break;
					}
					} 
				}
				setState(168);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
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
		public List<TerminalNode> ID() { return getTokens(DMLParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(DMLParser.ID, i);
		}
		public ColumnsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columns; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DMLListener ) ((DMLListener)listener).enterColumns(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DMLListener ) ((DMLListener)listener).exitColumns(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DMLVisitor ) return ((DMLVisitor<? extends T>)visitor).visitColumns(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnsContext columns() throws RecognitionException {
		ColumnsContext _localctx = new ColumnsContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_columns);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			match(ID);
			setState(174);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(170);
				match(T__6);
				setState(171);
				match(ID);
				}
				}
				setState(176);
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
			if ( listener instanceof DMLListener ) ((DMLListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DMLListener ) ((DMLListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DMLVisitor ) return ((DMLVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			match(T__3);
			setState(178);
			item();
			setState(183);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(179);
				match(T__6);
				setState(180);
				item();
				}
				}
				setState(185);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(186);
			match(T__4);
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
		public TerminalNode STRING() { return getToken(DMLParser.STRING, 0); }
		public TerminalNode NUMBER() { return getToken(DMLParser.NUMBER, 0); }
		public TerminalNode BOOLEAN() { return getToken(DMLParser.BOOLEAN, 0); }
		public ItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DMLListener ) ((DMLListener)listener).enterItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DMLListener ) ((DMLListener)listener).exitItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DMLVisitor ) return ((DMLVisitor<? extends T>)visitor).visitItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ItemContext item() throws RecognitionException {
		ItemContext _localctx = new ItemContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_item);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			_la = _input.LA(1);
			if ( !(((((_la - 291)) & ~0x3f) == 0 && ((1L << (_la - 291)) & ((1L << (STRING - 291)) | (1L << (NUMBER - 291)) | (1L << (BOOLEAN - 291)))) != 0)) ) {
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
		case 12:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u0137\u00c1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3\2"+
		"\3\2\5\2&\n\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\60\n\3\3\3\3\3\3\3\3"+
		"\4\3\4\3\4\7\48\n\4\f\4\16\4;\13\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6"+
		"\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\7\bO\n\b\f\b\16\bR\13\b\3\t\3\t\3"+
		"\t\5\tW\n\t\3\t\3\t\3\t\5\t\\\n\t\3\t\5\t_\n\t\3\t\5\tb\n\t\3\t\5\te\n"+
		"\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\nn\n\n\f\n\16\nq\13\n\5\ns\n\n\3\13\3"+
		"\13\3\13\3\13\3\f\3\f\3\f\3\f\5\f}\n\f\3\r\3\r\3\r\3\r\7\r\u0083\n\r\f"+
		"\r\16\r\u0086\13\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u0090"+
		"\n\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\7\16\u00a7\n\16\f\16\16\16\u00aa"+
		"\13\16\3\17\3\17\3\17\7\17\u00af\n\17\f\17\16\17\u00b2\13\17\3\20\3\20"+
		"\3\20\3\20\7\20\u00b8\n\20\f\20\16\20\u00bb\13\20\3\20\3\20\3\21\3\21"+
		"\3\21\2\3\32\22\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \2\4\3\2\23\24"+
		"\4\2\u0125\u0125\u0136\u0137\2\u00ca\2%\3\2\2\2\4\'\3\2\2\2\6\64\3\2\2"+
		"\2\b<\3\2\2\2\nA\3\2\2\2\fF\3\2\2\2\16J\3\2\2\2\20S\3\2\2\2\22f\3\2\2"+
		"\2\24t\3\2\2\2\26x\3\2\2\2\30~\3\2\2\2\32\u008f\3\2\2\2\34\u00ab\3\2\2"+
		"\2\36\u00b3\3\2\2\2 \u00be\3\2\2\2\"&\5\4\3\2#&\5\b\5\2$&\5\n\6\2%\"\3"+
		"\2\2\2%#\3\2\2\2%$\3\2\2\2&\3\3\2\2\2\'(\7\3\2\2()\7\4\2\2)*\7\5\2\2*"+
		"/\7\u0135\2\2+,\7\6\2\2,-\5\34\17\2-.\7\7\2\2.\60\3\2\2\2/+\3\2\2\2/\60"+
		"\3\2\2\2\60\61\3\2\2\2\61\62\7\b\2\2\62\63\5\6\4\2\63\5\3\2\2\2\649\5"+
		"\36\20\2\65\66\7\t\2\2\668\5\36\20\2\67\65\3\2\2\28;\3\2\2\29\67\3\2\2"+
		"\29:\3\2\2\2:\7\3\2\2\2;9\3\2\2\2<=\7\n\2\2=>\7\13\2\2>?\7\u0135\2\2?"+
		"@\5\30\r\2@\t\3\2\2\2AB\7\f\2\2BC\7\u0135\2\2CD\5\16\b\2DE\5\30\r\2E\13"+
		"\3\2\2\2FG\7\u0135\2\2GH\7\r\2\2HI\5 \21\2I\r\3\2\2\2JK\7\16\2\2KP\5\f"+
		"\7\2LM\7\t\2\2MO\5\f\7\2NL\3\2\2\2OR\3\2\2\2PN\3\2\2\2PQ\3\2\2\2Q\17\3"+
		"\2\2\2RP\3\2\2\2SV\7\17\2\2TW\7\u011d\2\2UW\5\34\17\2VT\3\2\2\2VU\3\2"+
		"\2\2WX\3\2\2\2XY\7\13\2\2Y[\7\u0135\2\2Z\\\5\30\r\2[Z\3\2\2\2[\\\3\2\2"+
		"\2\\^\3\2\2\2]_\5\22\n\2^]\3\2\2\2^_\3\2\2\2_a\3\2\2\2`b\5\24\13\2a`\3"+
		"\2\2\2ab\3\2\2\2bd\3\2\2\2ce\5\26\f\2dc\3\2\2\2de\3\2\2\2e\21\3\2\2\2"+
		"fg\7\20\2\2gh\7\21\2\2hr\5\34\17\2ij\7\22\2\2jo\5\32\16\2kl\t\2\2\2ln"+
		"\5\32\16\2mk\3\2\2\2nq\3\2\2\2om\3\2\2\2op\3\2\2\2ps\3\2\2\2qo\3\2\2\2"+
		"ri\3\2\2\2rs\3\2\2\2s\23\3\2\2\2tu\7\25\2\2uv\7\21\2\2vw\5\34\17\2w\25"+
		"\3\2\2\2xy\7\26\2\2y|\7\u0136\2\2z{\7\27\2\2{}\7\u0136\2\2|z\3\2\2\2|"+
		"}\3\2\2\2}\27\3\2\2\2~\177\7\30\2\2\177\u0084\5\32\16\2\u0080\u0081\t"+
		"\2\2\2\u0081\u0083\5\32\16\2\u0082\u0080\3\2\2\2\u0083\u0086\3\2\2\2\u0084"+
		"\u0082\3\2\2\2\u0084\u0085\3\2\2\2\u0085\31\3\2\2\2\u0086\u0084\3\2\2"+
		"\2\u0087\u0088\b\16\1\2\u0088\u0089\7\6\2\2\u0089\u008a\5\20\t\2\u008a"+
		"\u008b\7\7\2\2\u008b\u0090\3\2\2\2\u008c\u0090\5\36\20\2\u008d\u0090\7"+
		"\u0135\2\2\u008e\u0090\5 \21\2\u008f\u0087\3\2\2\2\u008f\u008c\3\2\2\2"+
		"\u008f\u008d\3\2\2\2\u008f\u008e\3\2\2\2\u0090\u00a8\3\2\2\2\u0091\u0092"+
		"\f\r\2\2\u0092\u0093\7\r\2\2\u0093\u00a7\5\32\16\16\u0094\u0095\f\f\2"+
		"\2\u0095\u0096\7\u0119\2\2\u0096\u00a7\5\32\16\r\u0097\u0098\f\13\2\2"+
		"\u0098\u0099\7\31\2\2\u0099\u00a7\5\32\16\f\u009a\u009b\f\n\2\2\u009b"+
		"\u009c\7\u0117\2\2\u009c\u00a7\5\32\16\13\u009d\u009e\f\t\2\2\u009e\u009f"+
		"\7\32\2\2\u009f\u00a7\5\32\16\n\u00a0\u00a1\f\b\2\2\u00a1\u00a2\7\u0116"+
		"\2\2\u00a2\u00a7\5\32\16\t\u00a3\u00a4\f\7\2\2\u00a4\u00a5\7\33\2\2\u00a5"+
		"\u00a7\5\32\16\b\u00a6\u0091\3\2\2\2\u00a6\u0094\3\2\2\2\u00a6\u0097\3"+
		"\2\2\2\u00a6\u009a\3\2\2\2\u00a6\u009d\3\2\2\2\u00a6\u00a0\3\2\2\2\u00a6"+
		"\u00a3\3\2\2\2\u00a7\u00aa\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a8\u00a9\3\2"+
		"\2\2\u00a9\33\3\2\2\2\u00aa\u00a8\3\2\2\2\u00ab\u00b0\7\u0135\2\2\u00ac"+
		"\u00ad\7\t\2\2\u00ad\u00af\7\u0135\2\2\u00ae\u00ac\3\2\2\2\u00af\u00b2"+
		"\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\35\3\2\2\2\u00b2"+
		"\u00b0\3\2\2\2\u00b3\u00b4\7\6\2\2\u00b4\u00b9\5 \21\2\u00b5\u00b6\7\t"+
		"\2\2\u00b6\u00b8\5 \21\2\u00b7\u00b5\3\2\2\2\u00b8\u00bb\3\2\2\2\u00b9"+
		"\u00b7\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00bc\3\2\2\2\u00bb\u00b9\3\2"+
		"\2\2\u00bc\u00bd\7\7\2\2\u00bd\37\3\2\2\2\u00be\u00bf\t\3\2\2\u00bf!\3"+
		"\2\2\2\24%/9PV[^ador|\u0084\u008f\u00a6\u00a8\u00b0\u00b9";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}