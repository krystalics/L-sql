// Generated from /Users/krysta/study/L-sql/src/main/resources/LSQL.g4 by ANTLR 4.9.1
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
public class LSQLParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, BOOLEAN=43, ID=44, NUMBER=45, 
		STRING=46, WS=47, LINE_COMMENT=48, COMMENT=49;
	public static final int
		RULE_sql = 0, RULE_stat = 1, RULE_ddl = 2, RULE_create = 3, RULE_createDb = 4, 
		RULE_createTable = 5, RULE_fieldDeifnitions = 6, RULE_fieldDeifnition = 7, 
		RULE_type = 8, RULE_drop = 9, RULE_alter = 10, RULE_alterOperation = 11, 
		RULE_addOperation = 12, RULE_dropOperation = 13, RULE_modifyOperation = 14, 
		RULE_dml = 15, RULE_insert = 16, RULE_values = 17, RULE_delete = 18, RULE_update = 19, 
		RULE_assign = 20, RULE_setStat = 21, RULE_dql = 22, RULE_groupByStat = 23, 
		RULE_orderByStat = 24, RULE_limitStat = 25, RULE_whereStat = 26, RULE_expr = 27, 
		RULE_columns = 28, RULE_value = 29, RULE_item = 30;
	private static String[] makeRuleNames() {
		return new String[] {
			"sql", "stat", "ddl", "create", "createDb", "createTable", "fieldDeifnitions", 
			"fieldDeifnition", "type", "drop", "alter", "alterOperation", "addOperation", 
			"dropOperation", "modifyOperation", "dml", "insert", "values", "delete", 
			"update", "assign", "setStat", "dql", "groupByStat", "orderByStat", "limitStat", 
			"whereStat", "expr", "columns", "value", "item"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'create'", "'database'", "'table'", "'('", "')'", "','", 
			"'default'", "'comment'", "'int'", "'string'", "'boolean'", "'drop'", 
			"'alter'", "'add'", "'column'", "'modify'", "'insert'", "'into'", "'values'", 
			"'delete'", "'from'", "'update'", "'='", "'set'", "'select'", "'*'", 
			"'group'", "'by'", "'having'", "'and'", "'or'", "'order'", "'limit'", 
			"'offset'", "'where'", "'>'", "'>='", "'<'", "'<='", "'!='", "'in'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, "BOOLEAN", "ID", "NUMBER", 
			"STRING", "WS", "LINE_COMMENT", "COMMENT"
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
	public String getGrammarFileName() { return "LSQL.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public LSQLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class SqlContext extends ParserRuleContext {
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public SqlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sql; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LSQLListener ) ((LSQLListener)listener).enterSql(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LSQLListener ) ((LSQLListener)listener).exitSql(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LSQLVisitor ) return ((LSQLVisitor<? extends T>)visitor).visitSql(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SqlContext sql() throws RecognitionException {
		SqlContext _localctx = new SqlContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_sql);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(62);
				stat();
				setState(63);
				match(T__0);
				}
				}
				setState(67); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__12) | (1L << T__13) | (1L << T__17) | (1L << T__20) | (1L << T__22) | (1L << T__25))) != 0) );
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

	public static class StatContext extends ParserRuleContext {
		public DmlContext dml() {
			return getRuleContext(DmlContext.class,0);
		}
		public DdlContext ddl() {
			return getRuleContext(DdlContext.class,0);
		}
		public DqlContext dql() {
			return getRuleContext(DqlContext.class,0);
		}
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LSQLListener ) ((LSQLListener)listener).enterStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LSQLListener ) ((LSQLListener)listener).exitStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LSQLVisitor ) return ((LSQLVisitor<? extends T>)visitor).visitStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stat);
		try {
			setState(72);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__17:
			case T__20:
			case T__22:
				enterOuterAlt(_localctx, 1);
				{
				setState(69);
				dml();
				}
				break;
			case T__1:
			case T__12:
			case T__13:
				enterOuterAlt(_localctx, 2);
				{
				setState(70);
				ddl();
				}
				break;
			case T__25:
				enterOuterAlt(_localctx, 3);
				{
				setState(71);
				dql();
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

	public static class DdlContext extends ParserRuleContext {
		public CreateContext create() {
			return getRuleContext(CreateContext.class,0);
		}
		public DropContext drop() {
			return getRuleContext(DropContext.class,0);
		}
		public AlterContext alter() {
			return getRuleContext(AlterContext.class,0);
		}
		public DdlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ddl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LSQLListener ) ((LSQLListener)listener).enterDdl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LSQLListener ) ((LSQLListener)listener).exitDdl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LSQLVisitor ) return ((LSQLVisitor<? extends T>)visitor).visitDdl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DdlContext ddl() throws RecognitionException {
		DdlContext _localctx = new DdlContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_ddl);
		try {
			setState(77);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(74);
				create();
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 2);
				{
				setState(75);
				drop();
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 3);
				{
				setState(76);
				alter();
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

	public static class CreateContext extends ParserRuleContext {
		public CreateDbContext createDb() {
			return getRuleContext(CreateDbContext.class,0);
		}
		public CreateTableContext createTable() {
			return getRuleContext(CreateTableContext.class,0);
		}
		public CreateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LSQLListener ) ((LSQLListener)listener).enterCreate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LSQLListener ) ((LSQLListener)listener).exitCreate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LSQLVisitor ) return ((LSQLVisitor<? extends T>)visitor).visitCreate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateContext create() throws RecognitionException {
		CreateContext _localctx = new CreateContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_create);
		try {
			setState(81);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(79);
				createDb();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(80);
				createTable();
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

	public static class CreateDbContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(LSQLParser.ID, 0); }
		public CreateDbContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createDb; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LSQLListener ) ((LSQLListener)listener).enterCreateDb(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LSQLListener ) ((LSQLListener)listener).exitCreateDb(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LSQLVisitor ) return ((LSQLVisitor<? extends T>)visitor).visitCreateDb(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateDbContext createDb() throws RecognitionException {
		CreateDbContext _localctx = new CreateDbContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_createDb);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			match(T__1);
			setState(84);
			match(T__2);
			setState(85);
			match(ID);
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

	public static class CreateTableContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(LSQLParser.ID, 0); }
		public FieldDeifnitionsContext fieldDeifnitions() {
			return getRuleContext(FieldDeifnitionsContext.class,0);
		}
		public CreateTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createTable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LSQLListener ) ((LSQLListener)listener).enterCreateTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LSQLListener ) ((LSQLListener)listener).exitCreateTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LSQLVisitor ) return ((LSQLVisitor<? extends T>)visitor).visitCreateTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateTableContext createTable() throws RecognitionException {
		CreateTableContext _localctx = new CreateTableContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_createTable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			match(T__1);
			setState(88);
			match(T__3);
			setState(89);
			match(ID);
			setState(90);
			match(T__4);
			setState(91);
			fieldDeifnitions();
			setState(92);
			match(T__5);
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

	public static class FieldDeifnitionsContext extends ParserRuleContext {
		public List<FieldDeifnitionContext> fieldDeifnition() {
			return getRuleContexts(FieldDeifnitionContext.class);
		}
		public FieldDeifnitionContext fieldDeifnition(int i) {
			return getRuleContext(FieldDeifnitionContext.class,i);
		}
		public FieldDeifnitionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldDeifnitions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LSQLListener ) ((LSQLListener)listener).enterFieldDeifnitions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LSQLListener ) ((LSQLListener)listener).exitFieldDeifnitions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LSQLVisitor ) return ((LSQLVisitor<? extends T>)visitor).visitFieldDeifnitions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldDeifnitionsContext fieldDeifnitions() throws RecognitionException {
		FieldDeifnitionsContext _localctx = new FieldDeifnitionsContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_fieldDeifnitions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			fieldDeifnition();
			setState(99);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(95);
				match(T__6);
				setState(96);
				fieldDeifnition();
				}
				}
				setState(101);
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

	public static class FieldDeifnitionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(LSQLParser.ID, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ItemContext item() {
			return getRuleContext(ItemContext.class,0);
		}
		public TerminalNode STRING() { return getToken(LSQLParser.STRING, 0); }
		public FieldDeifnitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldDeifnition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LSQLListener ) ((LSQLListener)listener).enterFieldDeifnition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LSQLListener ) ((LSQLListener)listener).exitFieldDeifnition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LSQLVisitor ) return ((LSQLVisitor<? extends T>)visitor).visitFieldDeifnition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldDeifnitionContext fieldDeifnition() throws RecognitionException {
		FieldDeifnitionContext _localctx = new FieldDeifnitionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_fieldDeifnition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			match(ID);
			setState(103);
			type();
			setState(106);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(104);
				match(T__7);
				setState(105);
				item();
				}
			}

			setState(110);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__8) {
				{
				setState(108);
				match(T__8);
				setState(109);
				match(STRING);
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

	public static class TypeContext extends ParserRuleContext {
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LSQLListener ) ((LSQLListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LSQLListener ) ((LSQLListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LSQLVisitor ) return ((LSQLVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__10) | (1L << T__11))) != 0)) ) {
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

	public static class DropContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(LSQLParser.ID, 0); }
		public DropContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LSQLListener ) ((LSQLListener)listener).enterDrop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LSQLListener ) ((LSQLListener)listener).exitDrop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LSQLVisitor ) return ((LSQLVisitor<? extends T>)visitor).visitDrop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DropContext drop() throws RecognitionException {
		DropContext _localctx = new DropContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_drop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			match(T__12);
			setState(115);
			_la = _input.LA(1);
			if ( !(_la==T__2 || _la==T__3) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(116);
			match(ID);
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

	public static class AlterContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(LSQLParser.ID, 0); }
		public AlterOperationContext alterOperation() {
			return getRuleContext(AlterOperationContext.class,0);
		}
		public AlterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LSQLListener ) ((LSQLListener)listener).enterAlter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LSQLListener ) ((LSQLListener)listener).exitAlter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LSQLVisitor ) return ((LSQLVisitor<? extends T>)visitor).visitAlter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlterContext alter() throws RecognitionException {
		AlterContext _localctx = new AlterContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_alter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			match(T__13);
			setState(119);
			match(T__3);
			setState(120);
			match(ID);
			setState(121);
			alterOperation();
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

	public static class AlterOperationContext extends ParserRuleContext {
		public AddOperationContext addOperation() {
			return getRuleContext(AddOperationContext.class,0);
		}
		public DropOperationContext dropOperation() {
			return getRuleContext(DropOperationContext.class,0);
		}
		public ModifyOperationContext modifyOperation() {
			return getRuleContext(ModifyOperationContext.class,0);
		}
		public AlterOperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterOperation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LSQLListener ) ((LSQLListener)listener).enterAlterOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LSQLListener ) ((LSQLListener)listener).exitAlterOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LSQLVisitor ) return ((LSQLVisitor<? extends T>)visitor).visitAlterOperation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlterOperationContext alterOperation() throws RecognitionException {
		AlterOperationContext _localctx = new AlterOperationContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_alterOperation);
		try {
			setState(126);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__14:
				enterOuterAlt(_localctx, 1);
				{
				setState(123);
				addOperation();
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 2);
				{
				setState(124);
				dropOperation();
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 3);
				{
				setState(125);
				modifyOperation();
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

	public static class AddOperationContext extends ParserRuleContext {
		public FieldDeifnitionsContext fieldDeifnitions() {
			return getRuleContext(FieldDeifnitionsContext.class,0);
		}
		public AddOperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addOperation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LSQLListener ) ((LSQLListener)listener).enterAddOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LSQLListener ) ((LSQLListener)listener).exitAddOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LSQLVisitor ) return ((LSQLVisitor<? extends T>)visitor).visitAddOperation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AddOperationContext addOperation() throws RecognitionException {
		AddOperationContext _localctx = new AddOperationContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_addOperation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			match(T__14);
			setState(129);
			match(T__4);
			setState(130);
			fieldDeifnitions();
			setState(131);
			match(T__5);
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

	public static class DropOperationContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(LSQLParser.ID, 0); }
		public DropOperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropOperation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LSQLListener ) ((LSQLListener)listener).enterDropOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LSQLListener ) ((LSQLListener)listener).exitDropOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LSQLVisitor ) return ((LSQLVisitor<? extends T>)visitor).visitDropOperation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DropOperationContext dropOperation() throws RecognitionException {
		DropOperationContext _localctx = new DropOperationContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_dropOperation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			match(T__12);
			setState(134);
			match(T__15);
			setState(135);
			match(ID);
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

	public static class ModifyOperationContext extends ParserRuleContext {
		public FieldDeifnitionContext fieldDeifnition() {
			return getRuleContext(FieldDeifnitionContext.class,0);
		}
		public ModifyOperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifyOperation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LSQLListener ) ((LSQLListener)listener).enterModifyOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LSQLListener ) ((LSQLListener)listener).exitModifyOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LSQLVisitor ) return ((LSQLVisitor<? extends T>)visitor).visitModifyOperation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModifyOperationContext modifyOperation() throws RecognitionException {
		ModifyOperationContext _localctx = new ModifyOperationContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_modifyOperation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			match(T__16);
			setState(138);
			fieldDeifnition();
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
			if ( listener instanceof LSQLListener ) ((LSQLListener)listener).enterDml(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LSQLListener ) ((LSQLListener)listener).exitDml(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LSQLVisitor ) return ((LSQLVisitor<? extends T>)visitor).visitDml(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DmlContext dml() throws RecognitionException {
		DmlContext _localctx = new DmlContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_dml);
		try {
			setState(143);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__17:
				enterOuterAlt(_localctx, 1);
				{
				setState(140);
				insert();
				}
				break;
			case T__20:
				enterOuterAlt(_localctx, 2);
				{
				setState(141);
				delete();
				}
				break;
			case T__22:
				enterOuterAlt(_localctx, 3);
				{
				setState(142);
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
		public TerminalNode ID() { return getToken(LSQLParser.ID, 0); }
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
			if ( listener instanceof LSQLListener ) ((LSQLListener)listener).enterInsert(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LSQLListener ) ((LSQLListener)listener).exitInsert(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LSQLVisitor ) return ((LSQLVisitor<? extends T>)visitor).visitInsert(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InsertContext insert() throws RecognitionException {
		InsertContext _localctx = new InsertContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_insert);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			match(T__17);
			setState(146);
			match(T__18);
			setState(147);
			match(T__3);
			setState(148);
			match(ID);
			setState(153);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(149);
				match(T__4);
				setState(150);
				columns();
				setState(151);
				match(T__5);
				}
			}

			setState(155);
			match(T__19);
			setState(156);
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
			if ( listener instanceof LSQLListener ) ((LSQLListener)listener).enterValues(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LSQLListener ) ((LSQLListener)listener).exitValues(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LSQLVisitor ) return ((LSQLVisitor<? extends T>)visitor).visitValues(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValuesContext values() throws RecognitionException {
		ValuesContext _localctx = new ValuesContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_values);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			value();
			setState(163);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(159);
				match(T__6);
				setState(160);
				value();
				}
				}
				setState(165);
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
		public TerminalNode ID() { return getToken(LSQLParser.ID, 0); }
		public WhereStatContext whereStat() {
			return getRuleContext(WhereStatContext.class,0);
		}
		public DeleteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delete; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LSQLListener ) ((LSQLListener)listener).enterDelete(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LSQLListener ) ((LSQLListener)listener).exitDelete(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LSQLVisitor ) return ((LSQLVisitor<? extends T>)visitor).visitDelete(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeleteContext delete() throws RecognitionException {
		DeleteContext _localctx = new DeleteContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_delete);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			match(T__20);
			setState(167);
			match(T__21);
			setState(168);
			match(ID);
			setState(169);
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
		public TerminalNode ID() { return getToken(LSQLParser.ID, 0); }
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
			if ( listener instanceof LSQLListener ) ((LSQLListener)listener).enterUpdate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LSQLListener ) ((LSQLListener)listener).exitUpdate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LSQLVisitor ) return ((LSQLVisitor<? extends T>)visitor).visitUpdate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UpdateContext update() throws RecognitionException {
		UpdateContext _localctx = new UpdateContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_update);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			match(T__22);
			setState(172);
			match(ID);
			setState(173);
			setStat();
			setState(174);
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
		public TerminalNode ID() { return getToken(LSQLParser.ID, 0); }
		public ItemContext item() {
			return getRuleContext(ItemContext.class,0);
		}
		public AssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LSQLListener ) ((LSQLListener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LSQLListener ) ((LSQLListener)listener).exitAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LSQLVisitor ) return ((LSQLVisitor<? extends T>)visitor).visitAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			match(ID);
			setState(177);
			match(T__23);
			setState(178);
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
			if ( listener instanceof LSQLListener ) ((LSQLListener)listener).enterSetStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LSQLListener ) ((LSQLListener)listener).exitSetStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LSQLVisitor ) return ((LSQLVisitor<? extends T>)visitor).visitSetStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetStatContext setStat() throws RecognitionException {
		SetStatContext _localctx = new SetStatContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_setStat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			match(T__24);
			setState(181);
			assign();
			setState(186);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(182);
				match(T__6);
				setState(183);
				assign();
				}
				}
				setState(188);
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
		public TerminalNode ID() { return getToken(LSQLParser.ID, 0); }
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
			if ( listener instanceof LSQLListener ) ((LSQLListener)listener).enterDql(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LSQLListener ) ((LSQLListener)listener).exitDql(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LSQLVisitor ) return ((LSQLVisitor<? extends T>)visitor).visitDql(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DqlContext dql() throws RecognitionException {
		DqlContext _localctx = new DqlContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_dql);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			match(T__25);
			setState(192);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__26:
				{
				setState(190);
				match(T__26);
				}
				break;
			case ID:
				{
				setState(191);
				columns();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(194);
			match(T__21);
			setState(195);
			match(ID);
			setState(197);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__35) {
				{
				setState(196);
				whereStat();
				}
			}

			setState(200);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__27) {
				{
				setState(199);
				groupByStat();
				}
			}

			setState(203);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__32) {
				{
				setState(202);
				orderByStat();
				}
			}

			setState(206);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__33) {
				{
				setState(205);
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
			if ( listener instanceof LSQLListener ) ((LSQLListener)listener).enterGroupByStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LSQLListener ) ((LSQLListener)listener).exitGroupByStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LSQLVisitor ) return ((LSQLVisitor<? extends T>)visitor).visitGroupByStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GroupByStatContext groupByStat() throws RecognitionException {
		GroupByStatContext _localctx = new GroupByStatContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_groupByStat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			match(T__27);
			setState(209);
			match(T__28);
			setState(210);
			columns();
			setState(220);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__29) {
				{
				setState(211);
				match(T__29);
				setState(212);
				expr(0);
				setState(217);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__30 || _la==T__31) {
					{
					{
					setState(213);
					_la = _input.LA(1);
					if ( !(_la==T__30 || _la==T__31) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(214);
					expr(0);
					}
					}
					setState(219);
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
			if ( listener instanceof LSQLListener ) ((LSQLListener)listener).enterOrderByStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LSQLListener ) ((LSQLListener)listener).exitOrderByStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LSQLVisitor ) return ((LSQLVisitor<? extends T>)visitor).visitOrderByStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrderByStatContext orderByStat() throws RecognitionException {
		OrderByStatContext _localctx = new OrderByStatContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_orderByStat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			match(T__32);
			setState(223);
			match(T__28);
			setState(224);
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
		public List<TerminalNode> NUMBER() { return getTokens(LSQLParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(LSQLParser.NUMBER, i);
		}
		public LimitStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_limitStat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LSQLListener ) ((LSQLListener)listener).enterLimitStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LSQLListener ) ((LSQLListener)listener).exitLimitStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LSQLVisitor ) return ((LSQLVisitor<? extends T>)visitor).visitLimitStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LimitStatContext limitStat() throws RecognitionException {
		LimitStatContext _localctx = new LimitStatContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_limitStat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			match(T__33);
			setState(227);
			match(NUMBER);
			setState(230);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__34) {
				{
				setState(228);
				match(T__34);
				setState(229);
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
			if ( listener instanceof LSQLListener ) ((LSQLListener)listener).enterWhereStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LSQLListener ) ((LSQLListener)listener).exitWhereStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LSQLVisitor ) return ((LSQLVisitor<? extends T>)visitor).visitWhereStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhereStatContext whereStat() throws RecognitionException {
		WhereStatContext _localctx = new WhereStatContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_whereStat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			match(T__35);
			setState(233);
			expr(0);
			setState(238);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__30 || _la==T__31) {
				{
				{
				setState(234);
				_la = _input.LA(1);
				if ( !(_la==T__30 || _la==T__31) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(235);
				expr(0);
				}
				}
				setState(240);
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
		public TerminalNode ID() { return getToken(LSQLParser.ID, 0); }
		public ItemContext item() {
			return getRuleContext(ItemContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LSQLListener ) ((LSQLListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LSQLListener ) ((LSQLListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LSQLVisitor ) return ((LSQLVisitor<? extends T>)visitor).visitExpr(this);
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
		int _startState = 54;
		enterRecursionRule(_localctx, 54, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(242);
				match(T__4);
				setState(243);
				dql();
				setState(244);
				match(T__5);
				}
				break;
			case 2:
				{
				setState(246);
				value();
				}
				break;
			case 3:
				{
				setState(247);
				match(ID);
				}
				break;
			case 4:
				{
				setState(248);
				item();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(274);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(272);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(251);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(252);
						match(T__23);
						setState(253);
						expr(12);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(254);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(255);
						match(T__36);
						setState(256);
						expr(11);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(257);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(258);
						match(T__37);
						setState(259);
						expr(10);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(260);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(261);
						match(T__38);
						setState(262);
						expr(9);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(263);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(264);
						match(T__39);
						setState(265);
						expr(8);
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(266);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(267);
						match(T__40);
						setState(268);
						expr(7);
						}
						break;
					case 7:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(269);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(270);
						match(T__41);
						setState(271);
						expr(6);
						}
						break;
					}
					} 
				}
				setState(276);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
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
		public List<TerminalNode> ID() { return getTokens(LSQLParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(LSQLParser.ID, i);
		}
		public ColumnsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columns; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LSQLListener ) ((LSQLListener)listener).enterColumns(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LSQLListener ) ((LSQLListener)listener).exitColumns(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LSQLVisitor ) return ((LSQLVisitor<? extends T>)visitor).visitColumns(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnsContext columns() throws RecognitionException {
		ColumnsContext _localctx = new ColumnsContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_columns);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			match(ID);
			setState(282);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(278);
				match(T__6);
				setState(279);
				match(ID);
				}
				}
				setState(284);
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
			if ( listener instanceof LSQLListener ) ((LSQLListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LSQLListener ) ((LSQLListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LSQLVisitor ) return ((LSQLVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(285);
			match(T__4);
			setState(286);
			item();
			setState(291);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(287);
				match(T__6);
				setState(288);
				item();
				}
				}
				setState(293);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(294);
			match(T__5);
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
		public TerminalNode STRING() { return getToken(LSQLParser.STRING, 0); }
		public TerminalNode NUMBER() { return getToken(LSQLParser.NUMBER, 0); }
		public TerminalNode BOOLEAN() { return getToken(LSQLParser.BOOLEAN, 0); }
		public ItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LSQLListener ) ((LSQLListener)listener).enterItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LSQLListener ) ((LSQLListener)listener).exitItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LSQLVisitor ) return ((LSQLVisitor<? extends T>)visitor).visitItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ItemContext item() throws RecognitionException {
		ItemContext _localctx = new ItemContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_item);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(296);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << NUMBER) | (1L << STRING))) != 0)) ) {
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
		case 27:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\63\u012d\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \3\2"+
		"\3\2\3\2\6\2D\n\2\r\2\16\2E\3\3\3\3\3\3\5\3K\n\3\3\4\3\4\3\4\5\4P\n\4"+
		"\3\5\3\5\5\5T\n\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b"+
		"\3\b\7\bd\n\b\f\b\16\bg\13\b\3\t\3\t\3\t\3\t\5\tm\n\t\3\t\3\t\5\tq\n\t"+
		"\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\5\r\u0081"+
		"\n\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\21"+
		"\3\21\3\21\5\21\u0092\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22"+
		"\u009c\n\22\3\22\3\22\3\22\3\23\3\23\3\23\7\23\u00a4\n\23\f\23\16\23\u00a7"+
		"\13\23\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26"+
		"\3\26\3\27\3\27\3\27\3\27\7\27\u00bb\n\27\f\27\16\27\u00be\13\27\3\30"+
		"\3\30\3\30\5\30\u00c3\n\30\3\30\3\30\3\30\5\30\u00c8\n\30\3\30\5\30\u00cb"+
		"\n\30\3\30\5\30\u00ce\n\30\3\30\5\30\u00d1\n\30\3\31\3\31\3\31\3\31\3"+
		"\31\3\31\3\31\7\31\u00da\n\31\f\31\16\31\u00dd\13\31\5\31\u00df\n\31\3"+
		"\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\5\33\u00e9\n\33\3\34\3\34\3\34"+
		"\3\34\7\34\u00ef\n\34\f\34\16\34\u00f2\13\34\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\5\35\u00fc\n\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\7\35"+
		"\u0113\n\35\f\35\16\35\u0116\13\35\3\36\3\36\3\36\7\36\u011b\n\36\f\36"+
		"\16\36\u011e\13\36\3\37\3\37\3\37\3\37\7\37\u0124\n\37\f\37\16\37\u0127"+
		"\13\37\3\37\3\37\3 \3 \3 \2\38!\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
		" \"$&(*,.\60\62\64\668:<>\2\6\3\2\f\16\3\2\5\6\3\2!\"\4\2--/\60\2\u0132"+
		"\2C\3\2\2\2\4J\3\2\2\2\6O\3\2\2\2\bS\3\2\2\2\nU\3\2\2\2\fY\3\2\2\2\16"+
		"`\3\2\2\2\20h\3\2\2\2\22r\3\2\2\2\24t\3\2\2\2\26x\3\2\2\2\30\u0080\3\2"+
		"\2\2\32\u0082\3\2\2\2\34\u0087\3\2\2\2\36\u008b\3\2\2\2 \u0091\3\2\2\2"+
		"\"\u0093\3\2\2\2$\u00a0\3\2\2\2&\u00a8\3\2\2\2(\u00ad\3\2\2\2*\u00b2\3"+
		"\2\2\2,\u00b6\3\2\2\2.\u00bf\3\2\2\2\60\u00d2\3\2\2\2\62\u00e0\3\2\2\2"+
		"\64\u00e4\3\2\2\2\66\u00ea\3\2\2\28\u00fb\3\2\2\2:\u0117\3\2\2\2<\u011f"+
		"\3\2\2\2>\u012a\3\2\2\2@A\5\4\3\2AB\7\3\2\2BD\3\2\2\2C@\3\2\2\2DE\3\2"+
		"\2\2EC\3\2\2\2EF\3\2\2\2F\3\3\2\2\2GK\5 \21\2HK\5\6\4\2IK\5.\30\2JG\3"+
		"\2\2\2JH\3\2\2\2JI\3\2\2\2K\5\3\2\2\2LP\5\b\5\2MP\5\24\13\2NP\5\26\f\2"+
		"OL\3\2\2\2OM\3\2\2\2ON\3\2\2\2P\7\3\2\2\2QT\5\n\6\2RT\5\f\7\2SQ\3\2\2"+
		"\2SR\3\2\2\2T\t\3\2\2\2UV\7\4\2\2VW\7\5\2\2WX\7.\2\2X\13\3\2\2\2YZ\7\4"+
		"\2\2Z[\7\6\2\2[\\\7.\2\2\\]\7\7\2\2]^\5\16\b\2^_\7\b\2\2_\r\3\2\2\2`e"+
		"\5\20\t\2ab\7\t\2\2bd\5\20\t\2ca\3\2\2\2dg\3\2\2\2ec\3\2\2\2ef\3\2\2\2"+
		"f\17\3\2\2\2ge\3\2\2\2hi\7.\2\2il\5\22\n\2jk\7\n\2\2km\5> \2lj\3\2\2\2"+
		"lm\3\2\2\2mp\3\2\2\2no\7\13\2\2oq\7\60\2\2pn\3\2\2\2pq\3\2\2\2q\21\3\2"+
		"\2\2rs\t\2\2\2s\23\3\2\2\2tu\7\17\2\2uv\t\3\2\2vw\7.\2\2w\25\3\2\2\2x"+
		"y\7\20\2\2yz\7\6\2\2z{\7.\2\2{|\5\30\r\2|\27\3\2\2\2}\u0081\5\32\16\2"+
		"~\u0081\5\34\17\2\177\u0081\5\36\20\2\u0080}\3\2\2\2\u0080~\3\2\2\2\u0080"+
		"\177\3\2\2\2\u0081\31\3\2\2\2\u0082\u0083\7\21\2\2\u0083\u0084\7\7\2\2"+
		"\u0084\u0085\5\16\b\2\u0085\u0086\7\b\2\2\u0086\33\3\2\2\2\u0087\u0088"+
		"\7\17\2\2\u0088\u0089\7\22\2\2\u0089\u008a\7.\2\2\u008a\35\3\2\2\2\u008b"+
		"\u008c\7\23\2\2\u008c\u008d\5\20\t\2\u008d\37\3\2\2\2\u008e\u0092\5\""+
		"\22\2\u008f\u0092\5&\24\2\u0090\u0092\5(\25\2\u0091\u008e\3\2\2\2\u0091"+
		"\u008f\3\2\2\2\u0091\u0090\3\2\2\2\u0092!\3\2\2\2\u0093\u0094\7\24\2\2"+
		"\u0094\u0095\7\25\2\2\u0095\u0096\7\6\2\2\u0096\u009b\7.\2\2\u0097\u0098"+
		"\7\7\2\2\u0098\u0099\5:\36\2\u0099\u009a\7\b\2\2\u009a\u009c\3\2\2\2\u009b"+
		"\u0097\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u009e\7\26"+
		"\2\2\u009e\u009f\5$\23\2\u009f#\3\2\2\2\u00a0\u00a5\5<\37\2\u00a1\u00a2"+
		"\7\t\2\2\u00a2\u00a4\5<\37\2\u00a3\u00a1\3\2\2\2\u00a4\u00a7\3\2\2\2\u00a5"+
		"\u00a3\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6%\3\2\2\2\u00a7\u00a5\3\2\2\2"+
		"\u00a8\u00a9\7\27\2\2\u00a9\u00aa\7\30\2\2\u00aa\u00ab\7.\2\2\u00ab\u00ac"+
		"\5\66\34\2\u00ac\'\3\2\2\2\u00ad\u00ae\7\31\2\2\u00ae\u00af\7.\2\2\u00af"+
		"\u00b0\5,\27\2\u00b0\u00b1\5\66\34\2\u00b1)\3\2\2\2\u00b2\u00b3\7.\2\2"+
		"\u00b3\u00b4\7\32\2\2\u00b4\u00b5\5> \2\u00b5+\3\2\2\2\u00b6\u00b7\7\33"+
		"\2\2\u00b7\u00bc\5*\26\2\u00b8\u00b9\7\t\2\2\u00b9\u00bb\5*\26\2\u00ba"+
		"\u00b8\3\2\2\2\u00bb\u00be\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bc\u00bd\3\2"+
		"\2\2\u00bd-\3\2\2\2\u00be\u00bc\3\2\2\2\u00bf\u00c2\7\34\2\2\u00c0\u00c3"+
		"\7\35\2\2\u00c1\u00c3\5:\36\2\u00c2\u00c0\3\2\2\2\u00c2\u00c1\3\2\2\2"+
		"\u00c3\u00c4\3\2\2\2\u00c4\u00c5\7\30\2\2\u00c5\u00c7\7.\2\2\u00c6\u00c8"+
		"\5\66\34\2\u00c7\u00c6\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00ca\3\2\2\2"+
		"\u00c9\u00cb\5\60\31\2\u00ca\u00c9\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00cd"+
		"\3\2\2\2\u00cc\u00ce\5\62\32\2\u00cd\u00cc\3\2\2\2\u00cd\u00ce\3\2\2\2"+
		"\u00ce\u00d0\3\2\2\2\u00cf\u00d1\5\64\33\2\u00d0\u00cf\3\2\2\2\u00d0\u00d1"+
		"\3\2\2\2\u00d1/\3\2\2\2\u00d2\u00d3\7\36\2\2\u00d3\u00d4\7\37\2\2\u00d4"+
		"\u00de\5:\36\2\u00d5\u00d6\7 \2\2\u00d6\u00db\58\35\2\u00d7\u00d8\t\4"+
		"\2\2\u00d8\u00da\58\35\2\u00d9\u00d7\3\2\2\2\u00da\u00dd\3\2\2\2\u00db"+
		"\u00d9\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\u00df\3\2\2\2\u00dd\u00db\3\2"+
		"\2\2\u00de\u00d5\3\2\2\2\u00de\u00df\3\2\2\2\u00df\61\3\2\2\2\u00e0\u00e1"+
		"\7#\2\2\u00e1\u00e2\7\37\2\2\u00e2\u00e3\5:\36\2\u00e3\63\3\2\2\2\u00e4"+
		"\u00e5\7$\2\2\u00e5\u00e8\7/\2\2\u00e6\u00e7\7%\2\2\u00e7\u00e9\7/\2\2"+
		"\u00e8\u00e6\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\65\3\2\2\2\u00ea\u00eb"+
		"\7&\2\2\u00eb\u00f0\58\35\2\u00ec\u00ed\t\4\2\2\u00ed\u00ef\58\35\2\u00ee"+
		"\u00ec\3\2\2\2\u00ef\u00f2\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f0\u00f1\3\2"+
		"\2\2\u00f1\67\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f3\u00f4\b\35\1\2\u00f4\u00f5"+
		"\7\7\2\2\u00f5\u00f6\5.\30\2\u00f6\u00f7\7\b\2\2\u00f7\u00fc\3\2\2\2\u00f8"+
		"\u00fc\5<\37\2\u00f9\u00fc\7.\2\2\u00fa\u00fc\5> \2\u00fb\u00f3\3\2\2"+
		"\2\u00fb\u00f8\3\2\2\2\u00fb\u00f9\3\2\2\2\u00fb\u00fa\3\2\2\2\u00fc\u0114"+
		"\3\2\2\2\u00fd\u00fe\f\r\2\2\u00fe\u00ff\7\32\2\2\u00ff\u0113\58\35\16"+
		"\u0100\u0101\f\f\2\2\u0101\u0102\7\'\2\2\u0102\u0113\58\35\r\u0103\u0104"+
		"\f\13\2\2\u0104\u0105\7(\2\2\u0105\u0113\58\35\f\u0106\u0107\f\n\2\2\u0107"+
		"\u0108\7)\2\2\u0108\u0113\58\35\13\u0109\u010a\f\t\2\2\u010a\u010b\7*"+
		"\2\2\u010b\u0113\58\35\n\u010c\u010d\f\b\2\2\u010d\u010e\7+\2\2\u010e"+
		"\u0113\58\35\t\u010f\u0110\f\7\2\2\u0110\u0111\7,\2\2\u0111\u0113\58\35"+
		"\b\u0112\u00fd\3\2\2\2\u0112\u0100\3\2\2\2\u0112\u0103\3\2\2\2\u0112\u0106"+
		"\3\2\2\2\u0112\u0109\3\2\2\2\u0112\u010c\3\2\2\2\u0112\u010f\3\2\2\2\u0113"+
		"\u0116\3\2\2\2\u0114\u0112\3\2\2\2\u0114\u0115\3\2\2\2\u01159\3\2\2\2"+
		"\u0116\u0114\3\2\2\2\u0117\u011c\7.\2\2\u0118\u0119\7\t\2\2\u0119\u011b"+
		"\7.\2\2\u011a\u0118\3\2\2\2\u011b\u011e\3\2\2\2\u011c\u011a\3\2\2\2\u011c"+
		"\u011d\3\2\2\2\u011d;\3\2\2\2\u011e\u011c\3\2\2\2\u011f\u0120\7\7\2\2"+
		"\u0120\u0125\5> \2\u0121\u0122\7\t\2\2\u0122\u0124\5> \2\u0123\u0121\3"+
		"\2\2\2\u0124\u0127\3\2\2\2\u0125\u0123\3\2\2\2\u0125\u0126\3\2\2\2\u0126"+
		"\u0128\3\2\2\2\u0127\u0125\3\2\2\2\u0128\u0129\7\b\2\2\u0129=\3\2\2\2"+
		"\u012a\u012b\t\5\2\2\u012b?\3\2\2\2\34EJOSelp\u0080\u0091\u009b\u00a5"+
		"\u00bc\u00c2\u00c7\u00ca\u00cd\u00d0\u00db\u00de\u00e8\u00f0\u00fb\u0112"+
		"\u0114\u011c\u0125";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}