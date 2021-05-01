// Generated from /Users/krysta/study/L-sql/src/main/resources/DDL.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DDLParser extends Parser {
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
		T__38=39, T__39=40, T__40=41, BOOLEAN=42, ID=43, NUMBER=44, STRING=45, 
		WS=46, LINE_COMMENT=47, COMMENT=48, CREATE=49, DATABASE=50;
	public static final int
		RULE_ddl = 0, RULE_create = 1, RULE_createDb = 2, RULE_createTable = 3, 
		RULE_fieldDeifnitions = 4, RULE_fieldDeifnition = 5, RULE_type = 6, RULE_drop = 7, 
		RULE_alter = 8, RULE_alterOperation = 9, RULE_addOperation = 10, RULE_dropOperation = 11, 
		RULE_modifyOperation = 12, RULE_dml = 13, RULE_insert = 14, RULE_values = 15, 
		RULE_delete = 16, RULE_update = 17, RULE_assign = 18, RULE_setStat = 19, 
		RULE_dql = 20, RULE_groupByStat = 21, RULE_orderByStat = 22, RULE_limitStat = 23, 
		RULE_whereStat = 24, RULE_expr = 25, RULE_columns = 26, RULE_value = 27, 
		RULE_item = 28;
	private static String[] makeRuleNames() {
		return new String[] {
			"ddl", "create", "createDb", "createTable", "fieldDeifnitions", "fieldDeifnition", 
			"type", "drop", "alter", "alterOperation", "addOperation", "dropOperation", 
			"modifyOperation", "dml", "insert", "values", "delete", "update", "assign", 
			"setStat", "dql", "groupByStat", "orderByStat", "limitStat", "whereStat", 
			"expr", "columns", "value", "item"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'create'", "'table'", "'('", "')'", "','", "'default'", "'comment'", 
			"'int'", "'string'", "'boolean'", "'drop'", "'database'", "'alter'", 
			"'add'", "'column'", "'modify'", "'insert'", "'into'", "'values'", "'delete'", 
			"'from'", "'update'", "'='", "'set'", "'select'", "'*'", "'group'", "'by'", 
			"'having'", "'and'", "'or'", "'order'", "'limit'", "'offset'", "'where'", 
			"'>'", "'>='", "'<'", "'<='", "'!='", "'in'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, "BOOLEAN", "ID", "NUMBER", "STRING", 
			"WS", "LINE_COMMENT", "COMMENT", "CREATE", "DATABASE"
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
	public String getGrammarFileName() { return "DDL.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public DDLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
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
			if ( listener instanceof DDLListener ) ((DDLListener)listener).enterDdl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DDLListener ) ((DDLListener)listener).exitDdl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DDLVisitor ) return ((DDLVisitor<? extends T>)visitor).visitDdl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DdlContext ddl() throws RecognitionException {
		DdlContext _localctx = new DdlContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_ddl);
		try {
			setState(61);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case CREATE:
				enterOuterAlt(_localctx, 1);
				{
				setState(58);
				create();
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 2);
				{
				setState(59);
				drop();
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 3);
				{
				setState(60);
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
			if ( listener instanceof DDLListener ) ((DDLListener)listener).enterCreate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DDLListener ) ((DDLListener)listener).exitCreate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DDLVisitor ) return ((DDLVisitor<? extends T>)visitor).visitCreate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateContext create() throws RecognitionException {
		CreateContext _localctx = new CreateContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_create);
		try {
			setState(65);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CREATE:
				enterOuterAlt(_localctx, 1);
				{
				setState(63);
				createDb();
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 2);
				{
				setState(64);
				createTable();
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

	public static class CreateDbContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(DDLParser.CREATE, 0); }
		public TerminalNode DATABASE() { return getToken(DDLParser.DATABASE, 0); }
		public TerminalNode ID() { return getToken(DDLParser.ID, 0); }
		public CreateDbContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createDb; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DDLListener ) ((DDLListener)listener).enterCreateDb(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DDLListener ) ((DDLListener)listener).exitCreateDb(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DDLVisitor ) return ((DDLVisitor<? extends T>)visitor).visitCreateDb(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateDbContext createDb() throws RecognitionException {
		CreateDbContext _localctx = new CreateDbContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_createDb);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			match(CREATE);
			setState(68);
			match(DATABASE);
			setState(69);
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
		public TerminalNode ID() { return getToken(DDLParser.ID, 0); }
		public FieldDeifnitionsContext fieldDeifnitions() {
			return getRuleContext(FieldDeifnitionsContext.class,0);
		}
		public CreateTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createTable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DDLListener ) ((DDLListener)listener).enterCreateTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DDLListener ) ((DDLListener)listener).exitCreateTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DDLVisitor ) return ((DDLVisitor<? extends T>)visitor).visitCreateTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateTableContext createTable() throws RecognitionException {
		CreateTableContext _localctx = new CreateTableContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_createTable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			match(T__0);
			setState(72);
			match(T__1);
			setState(73);
			match(ID);
			setState(74);
			match(T__2);
			setState(75);
			fieldDeifnitions();
			setState(76);
			match(T__3);
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
			if ( listener instanceof DDLListener ) ((DDLListener)listener).enterFieldDeifnitions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DDLListener ) ((DDLListener)listener).exitFieldDeifnitions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DDLVisitor ) return ((DDLVisitor<? extends T>)visitor).visitFieldDeifnitions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldDeifnitionsContext fieldDeifnitions() throws RecognitionException {
		FieldDeifnitionsContext _localctx = new FieldDeifnitionsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_fieldDeifnitions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			fieldDeifnition();
			setState(83);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(79);
				match(T__4);
				setState(80);
				fieldDeifnition();
				}
				}
				setState(85);
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
		public TerminalNode ID() { return getToken(DDLParser.ID, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ItemContext item() {
			return getRuleContext(ItemContext.class,0);
		}
		public TerminalNode STRING() { return getToken(DDLParser.STRING, 0); }
		public FieldDeifnitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldDeifnition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DDLListener ) ((DDLListener)listener).enterFieldDeifnition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DDLListener ) ((DDLListener)listener).exitFieldDeifnition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DDLVisitor ) return ((DDLVisitor<? extends T>)visitor).visitFieldDeifnition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldDeifnitionContext fieldDeifnition() throws RecognitionException {
		FieldDeifnitionContext _localctx = new FieldDeifnitionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_fieldDeifnition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			match(ID);
			setState(87);
			type();
			setState(90);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(88);
				match(T__5);
				setState(89);
				item();
				}
			}

			setState(94);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__6) {
				{
				setState(92);
				match(T__6);
				setState(93);
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
			if ( listener instanceof DDLListener ) ((DDLListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DDLListener ) ((DDLListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DDLVisitor ) return ((DDLVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__8) | (1L << T__9))) != 0)) ) {
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
		public TerminalNode ID() { return getToken(DDLParser.ID, 0); }
		public DropContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DDLListener ) ((DDLListener)listener).enterDrop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DDLListener ) ((DDLListener)listener).exitDrop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DDLVisitor ) return ((DDLVisitor<? extends T>)visitor).visitDrop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DropContext drop() throws RecognitionException {
		DropContext _localctx = new DropContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_drop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			match(T__10);
			setState(99);
			_la = _input.LA(1);
			if ( !(_la==T__1 || _la==T__11) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(100);
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
		public TerminalNode ID() { return getToken(DDLParser.ID, 0); }
		public AlterOperationContext alterOperation() {
			return getRuleContext(AlterOperationContext.class,0);
		}
		public AlterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DDLListener ) ((DDLListener)listener).enterAlter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DDLListener ) ((DDLListener)listener).exitAlter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DDLVisitor ) return ((DDLVisitor<? extends T>)visitor).visitAlter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlterContext alter() throws RecognitionException {
		AlterContext _localctx = new AlterContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_alter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			match(T__12);
			setState(103);
			match(T__1);
			setState(104);
			match(ID);
			setState(105);
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
			if ( listener instanceof DDLListener ) ((DDLListener)listener).enterAlterOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DDLListener ) ((DDLListener)listener).exitAlterOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DDLVisitor ) return ((DDLVisitor<? extends T>)visitor).visitAlterOperation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlterOperationContext alterOperation() throws RecognitionException {
		AlterOperationContext _localctx = new AlterOperationContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_alterOperation);
		try {
			setState(110);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__13:
				enterOuterAlt(_localctx, 1);
				{
				setState(107);
				addOperation();
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 2);
				{
				setState(108);
				dropOperation();
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 3);
				{
				setState(109);
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
			if ( listener instanceof DDLListener ) ((DDLListener)listener).enterAddOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DDLListener ) ((DDLListener)listener).exitAddOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DDLVisitor ) return ((DDLVisitor<? extends T>)visitor).visitAddOperation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AddOperationContext addOperation() throws RecognitionException {
		AddOperationContext _localctx = new AddOperationContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_addOperation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			match(T__13);
			setState(113);
			match(T__2);
			setState(114);
			fieldDeifnitions();
			setState(115);
			match(T__3);
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
		public TerminalNode ID() { return getToken(DDLParser.ID, 0); }
		public DropOperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropOperation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DDLListener ) ((DDLListener)listener).enterDropOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DDLListener ) ((DDLListener)listener).exitDropOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DDLVisitor ) return ((DDLVisitor<? extends T>)visitor).visitDropOperation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DropOperationContext dropOperation() throws RecognitionException {
		DropOperationContext _localctx = new DropOperationContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_dropOperation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			match(T__10);
			setState(118);
			match(T__14);
			setState(119);
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
			if ( listener instanceof DDLListener ) ((DDLListener)listener).enterModifyOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DDLListener ) ((DDLListener)listener).exitModifyOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DDLVisitor ) return ((DDLVisitor<? extends T>)visitor).visitModifyOperation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModifyOperationContext modifyOperation() throws RecognitionException {
		ModifyOperationContext _localctx = new ModifyOperationContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_modifyOperation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			match(T__15);
			setState(122);
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
			if ( listener instanceof DDLListener ) ((DDLListener)listener).enterDml(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DDLListener ) ((DDLListener)listener).exitDml(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DDLVisitor ) return ((DDLVisitor<? extends T>)visitor).visitDml(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DmlContext dml() throws RecognitionException {
		DmlContext _localctx = new DmlContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_dml);
		try {
			setState(127);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__16:
				enterOuterAlt(_localctx, 1);
				{
				setState(124);
				insert();
				}
				break;
			case T__19:
				enterOuterAlt(_localctx, 2);
				{
				setState(125);
				delete();
				}
				break;
			case T__21:
				enterOuterAlt(_localctx, 3);
				{
				setState(126);
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
		public TerminalNode ID() { return getToken(DDLParser.ID, 0); }
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
			if ( listener instanceof DDLListener ) ((DDLListener)listener).enterInsert(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DDLListener ) ((DDLListener)listener).exitInsert(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DDLVisitor ) return ((DDLVisitor<? extends T>)visitor).visitInsert(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InsertContext insert() throws RecognitionException {
		InsertContext _localctx = new InsertContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_insert);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			match(T__16);
			setState(130);
			match(T__17);
			setState(131);
			match(T__1);
			setState(132);
			match(ID);
			setState(137);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(133);
				match(T__2);
				setState(134);
				columns();
				setState(135);
				match(T__3);
				}
			}

			setState(139);
			match(T__18);
			setState(140);
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
			if ( listener instanceof DDLListener ) ((DDLListener)listener).enterValues(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DDLListener ) ((DDLListener)listener).exitValues(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DDLVisitor ) return ((DDLVisitor<? extends T>)visitor).visitValues(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValuesContext values() throws RecognitionException {
		ValuesContext _localctx = new ValuesContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_values);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			value();
			setState(147);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(143);
				match(T__4);
				setState(144);
				value();
				}
				}
				setState(149);
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
		public TerminalNode ID() { return getToken(DDLParser.ID, 0); }
		public WhereStatContext whereStat() {
			return getRuleContext(WhereStatContext.class,0);
		}
		public DeleteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delete; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DDLListener ) ((DDLListener)listener).enterDelete(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DDLListener ) ((DDLListener)listener).exitDelete(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DDLVisitor ) return ((DDLVisitor<? extends T>)visitor).visitDelete(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeleteContext delete() throws RecognitionException {
		DeleteContext _localctx = new DeleteContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_delete);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			match(T__19);
			setState(151);
			match(T__20);
			setState(152);
			match(ID);
			setState(153);
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
		public TerminalNode ID() { return getToken(DDLParser.ID, 0); }
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
			if ( listener instanceof DDLListener ) ((DDLListener)listener).enterUpdate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DDLListener ) ((DDLListener)listener).exitUpdate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DDLVisitor ) return ((DDLVisitor<? extends T>)visitor).visitUpdate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UpdateContext update() throws RecognitionException {
		UpdateContext _localctx = new UpdateContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_update);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			match(T__21);
			setState(156);
			match(ID);
			setState(157);
			setStat();
			setState(158);
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
		public TerminalNode ID() { return getToken(DDLParser.ID, 0); }
		public ItemContext item() {
			return getRuleContext(ItemContext.class,0);
		}
		public AssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DDLListener ) ((DDLListener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DDLListener ) ((DDLListener)listener).exitAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DDLVisitor ) return ((DDLVisitor<? extends T>)visitor).visitAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			match(ID);
			setState(161);
			match(T__22);
			setState(162);
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
			if ( listener instanceof DDLListener ) ((DDLListener)listener).enterSetStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DDLListener ) ((DDLListener)listener).exitSetStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DDLVisitor ) return ((DDLVisitor<? extends T>)visitor).visitSetStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetStatContext setStat() throws RecognitionException {
		SetStatContext _localctx = new SetStatContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_setStat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			match(T__23);
			setState(165);
			assign();
			setState(170);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(166);
				match(T__4);
				setState(167);
				assign();
				}
				}
				setState(172);
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
		public TerminalNode ID() { return getToken(DDLParser.ID, 0); }
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
			if ( listener instanceof DDLListener ) ((DDLListener)listener).enterDql(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DDLListener ) ((DDLListener)listener).exitDql(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DDLVisitor ) return ((DDLVisitor<? extends T>)visitor).visitDql(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DqlContext dql() throws RecognitionException {
		DqlContext _localctx = new DqlContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_dql);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			match(T__24);
			setState(176);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__25:
				{
				setState(174);
				match(T__25);
				}
				break;
			case ID:
				{
				setState(175);
				columns();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(178);
			match(T__20);
			setState(179);
			match(ID);
			setState(181);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__34) {
				{
				setState(180);
				whereStat();
				}
			}

			setState(184);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__26) {
				{
				setState(183);
				groupByStat();
				}
			}

			setState(187);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__31) {
				{
				setState(186);
				orderByStat();
				}
			}

			setState(190);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__32) {
				{
				setState(189);
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
			if ( listener instanceof DDLListener ) ((DDLListener)listener).enterGroupByStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DDLListener ) ((DDLListener)listener).exitGroupByStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DDLVisitor ) return ((DDLVisitor<? extends T>)visitor).visitGroupByStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GroupByStatContext groupByStat() throws RecognitionException {
		GroupByStatContext _localctx = new GroupByStatContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_groupByStat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			match(T__26);
			setState(193);
			match(T__27);
			setState(194);
			columns();
			setState(204);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__28) {
				{
				setState(195);
				match(T__28);
				setState(196);
				expr(0);
				setState(201);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__29 || _la==T__30) {
					{
					{
					setState(197);
					_la = _input.LA(1);
					if ( !(_la==T__29 || _la==T__30) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(198);
					expr(0);
					}
					}
					setState(203);
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
			if ( listener instanceof DDLListener ) ((DDLListener)listener).enterOrderByStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DDLListener ) ((DDLListener)listener).exitOrderByStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DDLVisitor ) return ((DDLVisitor<? extends T>)visitor).visitOrderByStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrderByStatContext orderByStat() throws RecognitionException {
		OrderByStatContext _localctx = new OrderByStatContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_orderByStat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			match(T__31);
			setState(207);
			match(T__27);
			setState(208);
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
		public List<TerminalNode> NUMBER() { return getTokens(DDLParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(DDLParser.NUMBER, i);
		}
		public LimitStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_limitStat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DDLListener ) ((DDLListener)listener).enterLimitStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DDLListener ) ((DDLListener)listener).exitLimitStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DDLVisitor ) return ((DDLVisitor<? extends T>)visitor).visitLimitStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LimitStatContext limitStat() throws RecognitionException {
		LimitStatContext _localctx = new LimitStatContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_limitStat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			match(T__32);
			setState(211);
			match(NUMBER);
			setState(214);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__33) {
				{
				setState(212);
				match(T__33);
				setState(213);
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
			if ( listener instanceof DDLListener ) ((DDLListener)listener).enterWhereStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DDLListener ) ((DDLListener)listener).exitWhereStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DDLVisitor ) return ((DDLVisitor<? extends T>)visitor).visitWhereStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhereStatContext whereStat() throws RecognitionException {
		WhereStatContext _localctx = new WhereStatContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_whereStat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			match(T__34);
			setState(217);
			expr(0);
			setState(222);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__29 || _la==T__30) {
				{
				{
				setState(218);
				_la = _input.LA(1);
				if ( !(_la==T__29 || _la==T__30) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(219);
				expr(0);
				}
				}
				setState(224);
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
		public TerminalNode ID() { return getToken(DDLParser.ID, 0); }
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
			if ( listener instanceof DDLListener ) ((DDLListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DDLListener ) ((DDLListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DDLVisitor ) return ((DDLVisitor<? extends T>)visitor).visitExpr(this);
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
		int _startState = 50;
		enterRecursionRule(_localctx, 50, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(233);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(226);
				match(T__2);
				setState(227);
				dql();
				setState(228);
				match(T__3);
				}
				break;
			case 2:
				{
				setState(230);
				value();
				}
				break;
			case 3:
				{
				setState(231);
				match(ID);
				}
				break;
			case 4:
				{
				setState(232);
				item();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(258);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(256);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(235);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(236);
						match(T__22);
						setState(237);
						expr(12);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(238);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(239);
						match(T__35);
						setState(240);
						expr(11);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(241);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(242);
						match(T__36);
						setState(243);
						expr(10);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(244);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(245);
						match(T__37);
						setState(246);
						expr(9);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(247);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(248);
						match(T__38);
						setState(249);
						expr(8);
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(250);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(251);
						match(T__39);
						setState(252);
						expr(7);
						}
						break;
					case 7:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(253);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(254);
						match(T__40);
						setState(255);
						expr(6);
						}
						break;
					}
					} 
				}
				setState(260);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
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
		public List<TerminalNode> ID() { return getTokens(DDLParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(DDLParser.ID, i);
		}
		public ColumnsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columns; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DDLListener ) ((DDLListener)listener).enterColumns(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DDLListener ) ((DDLListener)listener).exitColumns(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DDLVisitor ) return ((DDLVisitor<? extends T>)visitor).visitColumns(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnsContext columns() throws RecognitionException {
		ColumnsContext _localctx = new ColumnsContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_columns);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(261);
			match(ID);
			setState(266);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(262);
				match(T__4);
				setState(263);
				match(ID);
				}
				}
				setState(268);
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
			if ( listener instanceof DDLListener ) ((DDLListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DDLListener ) ((DDLListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DDLVisitor ) return ((DDLVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(269);
			match(T__2);
			setState(270);
			item();
			setState(275);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(271);
				match(T__4);
				setState(272);
				item();
				}
				}
				setState(277);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(278);
			match(T__3);
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
		public TerminalNode STRING() { return getToken(DDLParser.STRING, 0); }
		public TerminalNode NUMBER() { return getToken(DDLParser.NUMBER, 0); }
		public TerminalNode BOOLEAN() { return getToken(DDLParser.BOOLEAN, 0); }
		public ItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DDLListener ) ((DDLListener)listener).enterItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DDLListener ) ((DDLListener)listener).exitItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DDLVisitor ) return ((DDLVisitor<? extends T>)visitor).visitItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ItemContext item() throws RecognitionException {
		ItemContext _localctx = new ItemContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_item);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(280);
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
		case 25:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\64\u011d\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\3\2\3\2\3\2\5\2@\n"+
		"\2\3\3\3\3\5\3D\n\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3"+
		"\6\3\6\7\6T\n\6\f\6\16\6W\13\6\3\7\3\7\3\7\3\7\5\7]\n\7\3\7\3\7\5\7a\n"+
		"\7\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\5\13q\n"+
		"\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17"+
		"\5\17\u0082\n\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u008c\n"+
		"\20\3\20\3\20\3\20\3\21\3\21\3\21\7\21\u0094\n\21\f\21\16\21\u0097\13"+
		"\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3"+
		"\24\3\25\3\25\3\25\3\25\7\25\u00ab\n\25\f\25\16\25\u00ae\13\25\3\26\3"+
		"\26\3\26\5\26\u00b3\n\26\3\26\3\26\3\26\5\26\u00b8\n\26\3\26\5\26\u00bb"+
		"\n\26\3\26\5\26\u00be\n\26\3\26\5\26\u00c1\n\26\3\27\3\27\3\27\3\27\3"+
		"\27\3\27\3\27\7\27\u00ca\n\27\f\27\16\27\u00cd\13\27\5\27\u00cf\n\27\3"+
		"\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\5\31\u00d9\n\31\3\32\3\32\3\32"+
		"\3\32\7\32\u00df\n\32\f\32\16\32\u00e2\13\32\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\5\33\u00ec\n\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\7\33"+
		"\u0103\n\33\f\33\16\33\u0106\13\33\3\34\3\34\3\34\7\34\u010b\n\34\f\34"+
		"\16\34\u010e\13\34\3\35\3\35\3\35\3\35\7\35\u0114\n\35\f\35\16\35\u0117"+
		"\13\35\3\35\3\35\3\36\3\36\3\36\2\3\64\37\2\4\6\b\n\f\16\20\22\24\26\30"+
		"\32\34\36 \"$&(*,.\60\62\64\668:\2\6\3\2\n\f\4\2\4\4\16\16\3\2 !\4\2,"+
		",./\2\u0121\2?\3\2\2\2\4C\3\2\2\2\6E\3\2\2\2\bI\3\2\2\2\nP\3\2\2\2\fX"+
		"\3\2\2\2\16b\3\2\2\2\20d\3\2\2\2\22h\3\2\2\2\24p\3\2\2\2\26r\3\2\2\2\30"+
		"w\3\2\2\2\32{\3\2\2\2\34\u0081\3\2\2\2\36\u0083\3\2\2\2 \u0090\3\2\2\2"+
		"\"\u0098\3\2\2\2$\u009d\3\2\2\2&\u00a2\3\2\2\2(\u00a6\3\2\2\2*\u00af\3"+
		"\2\2\2,\u00c2\3\2\2\2.\u00d0\3\2\2\2\60\u00d4\3\2\2\2\62\u00da\3\2\2\2"+
		"\64\u00eb\3\2\2\2\66\u0107\3\2\2\28\u010f\3\2\2\2:\u011a\3\2\2\2<@\5\4"+
		"\3\2=@\5\20\t\2>@\5\22\n\2?<\3\2\2\2?=\3\2\2\2?>\3\2\2\2@\3\3\2\2\2AD"+
		"\5\6\4\2BD\5\b\5\2CA\3\2\2\2CB\3\2\2\2D\5\3\2\2\2EF\7\63\2\2FG\7\64\2"+
		"\2GH\7-\2\2H\7\3\2\2\2IJ\7\3\2\2JK\7\4\2\2KL\7-\2\2LM\7\5\2\2MN\5\n\6"+
		"\2NO\7\6\2\2O\t\3\2\2\2PU\5\f\7\2QR\7\7\2\2RT\5\f\7\2SQ\3\2\2\2TW\3\2"+
		"\2\2US\3\2\2\2UV\3\2\2\2V\13\3\2\2\2WU\3\2\2\2XY\7-\2\2Y\\\5\16\b\2Z["+
		"\7\b\2\2[]\5:\36\2\\Z\3\2\2\2\\]\3\2\2\2]`\3\2\2\2^_\7\t\2\2_a\7/\2\2"+
		"`^\3\2\2\2`a\3\2\2\2a\r\3\2\2\2bc\t\2\2\2c\17\3\2\2\2de\7\r\2\2ef\t\3"+
		"\2\2fg\7-\2\2g\21\3\2\2\2hi\7\17\2\2ij\7\4\2\2jk\7-\2\2kl\5\24\13\2l\23"+
		"\3\2\2\2mq\5\26\f\2nq\5\30\r\2oq\5\32\16\2pm\3\2\2\2pn\3\2\2\2po\3\2\2"+
		"\2q\25\3\2\2\2rs\7\20\2\2st\7\5\2\2tu\5\n\6\2uv\7\6\2\2v\27\3\2\2\2wx"+
		"\7\r\2\2xy\7\21\2\2yz\7-\2\2z\31\3\2\2\2{|\7\22\2\2|}\5\f\7\2}\33\3\2"+
		"\2\2~\u0082\5\36\20\2\177\u0082\5\"\22\2\u0080\u0082\5$\23\2\u0081~\3"+
		"\2\2\2\u0081\177\3\2\2\2\u0081\u0080\3\2\2\2\u0082\35\3\2\2\2\u0083\u0084"+
		"\7\23\2\2\u0084\u0085\7\24\2\2\u0085\u0086\7\4\2\2\u0086\u008b\7-\2\2"+
		"\u0087\u0088\7\5\2\2\u0088\u0089\5\66\34\2\u0089\u008a\7\6\2\2\u008a\u008c"+
		"\3\2\2\2\u008b\u0087\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008d\3\2\2\2\u008d"+
		"\u008e\7\25\2\2\u008e\u008f\5 \21\2\u008f\37\3\2\2\2\u0090\u0095\58\35"+
		"\2\u0091\u0092\7\7\2\2\u0092\u0094\58\35\2\u0093\u0091\3\2\2\2\u0094\u0097"+
		"\3\2\2\2\u0095\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096!\3\2\2\2\u0097"+
		"\u0095\3\2\2\2\u0098\u0099\7\26\2\2\u0099\u009a\7\27\2\2\u009a\u009b\7"+
		"-\2\2\u009b\u009c\5\62\32\2\u009c#\3\2\2\2\u009d\u009e\7\30\2\2\u009e"+
		"\u009f\7-\2\2\u009f\u00a0\5(\25\2\u00a0\u00a1\5\62\32\2\u00a1%\3\2\2\2"+
		"\u00a2\u00a3\7-\2\2\u00a3\u00a4\7\31\2\2\u00a4\u00a5\5:\36\2\u00a5\'\3"+
		"\2\2\2\u00a6\u00a7\7\32\2\2\u00a7\u00ac\5&\24\2\u00a8\u00a9\7\7\2\2\u00a9"+
		"\u00ab\5&\24\2\u00aa\u00a8\3\2\2\2\u00ab\u00ae\3\2\2\2\u00ac\u00aa\3\2"+
		"\2\2\u00ac\u00ad\3\2\2\2\u00ad)\3\2\2\2\u00ae\u00ac\3\2\2\2\u00af\u00b2"+
		"\7\33\2\2\u00b0\u00b3\7\34\2\2\u00b1\u00b3\5\66\34\2\u00b2\u00b0\3\2\2"+
		"\2\u00b2\u00b1\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b5\7\27\2\2\u00b5"+
		"\u00b7\7-\2\2\u00b6\u00b8\5\62\32\2\u00b7\u00b6\3\2\2\2\u00b7\u00b8\3"+
		"\2\2\2\u00b8\u00ba\3\2\2\2\u00b9\u00bb\5,\27\2\u00ba\u00b9\3\2\2\2\u00ba"+
		"\u00bb\3\2\2\2\u00bb\u00bd\3\2\2\2\u00bc\u00be\5.\30\2\u00bd\u00bc\3\2"+
		"\2\2\u00bd\u00be\3\2\2\2\u00be\u00c0\3\2\2\2\u00bf\u00c1\5\60\31\2\u00c0"+
		"\u00bf\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1+\3\2\2\2\u00c2\u00c3\7\35\2\2"+
		"\u00c3\u00c4\7\36\2\2\u00c4\u00ce\5\66\34\2\u00c5\u00c6\7\37\2\2\u00c6"+
		"\u00cb\5\64\33\2\u00c7\u00c8\t\4\2\2\u00c8\u00ca\5\64\33\2\u00c9\u00c7"+
		"\3\2\2\2\u00ca\u00cd\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc"+
		"\u00cf\3\2\2\2\u00cd\u00cb\3\2\2\2\u00ce\u00c5\3\2\2\2\u00ce\u00cf\3\2"+
		"\2\2\u00cf-\3\2\2\2\u00d0\u00d1\7\"\2\2\u00d1\u00d2\7\36\2\2\u00d2\u00d3"+
		"\5\66\34\2\u00d3/\3\2\2\2\u00d4\u00d5\7#\2\2\u00d5\u00d8\7.\2\2\u00d6"+
		"\u00d7\7$\2\2\u00d7\u00d9\7.\2\2\u00d8\u00d6\3\2\2\2\u00d8\u00d9\3\2\2"+
		"\2\u00d9\61\3\2\2\2\u00da\u00db\7%\2\2\u00db\u00e0\5\64\33\2\u00dc\u00dd"+
		"\t\4\2\2\u00dd\u00df\5\64\33\2\u00de\u00dc\3\2\2\2\u00df\u00e2\3\2\2\2"+
		"\u00e0\u00de\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\63\3\2\2\2\u00e2\u00e0"+
		"\3\2\2\2\u00e3\u00e4\b\33\1\2\u00e4\u00e5\7\5\2\2\u00e5\u00e6\5*\26\2"+
		"\u00e6\u00e7\7\6\2\2\u00e7\u00ec\3\2\2\2\u00e8\u00ec\58\35\2\u00e9\u00ec"+
		"\7-\2\2\u00ea\u00ec\5:\36\2\u00eb\u00e3\3\2\2\2\u00eb\u00e8\3\2\2\2\u00eb"+
		"\u00e9\3\2\2\2\u00eb\u00ea\3\2\2\2\u00ec\u0104\3\2\2\2\u00ed\u00ee\f\r"+
		"\2\2\u00ee\u00ef\7\31\2\2\u00ef\u0103\5\64\33\16\u00f0\u00f1\f\f\2\2\u00f1"+
		"\u00f2\7&\2\2\u00f2\u0103\5\64\33\r\u00f3\u00f4\f\13\2\2\u00f4\u00f5\7"+
		"\'\2\2\u00f5\u0103\5\64\33\f\u00f6\u00f7\f\n\2\2\u00f7\u00f8\7(\2\2\u00f8"+
		"\u0103\5\64\33\13\u00f9\u00fa\f\t\2\2\u00fa\u00fb\7)\2\2\u00fb\u0103\5"+
		"\64\33\n\u00fc\u00fd\f\b\2\2\u00fd\u00fe\7*\2\2\u00fe\u0103\5\64\33\t"+
		"\u00ff\u0100\f\7\2\2\u0100\u0101\7+\2\2\u0101\u0103\5\64\33\b\u0102\u00ed"+
		"\3\2\2\2\u0102\u00f0\3\2\2\2\u0102\u00f3\3\2\2\2\u0102\u00f6\3\2\2\2\u0102"+
		"\u00f9\3\2\2\2\u0102\u00fc\3\2\2\2\u0102\u00ff\3\2\2\2\u0103\u0106\3\2"+
		"\2\2\u0104\u0102\3\2\2\2\u0104\u0105\3\2\2\2\u0105\65\3\2\2\2\u0106\u0104"+
		"\3\2\2\2\u0107\u010c\7-\2\2\u0108\u0109\7\7\2\2\u0109\u010b\7-\2\2\u010a"+
		"\u0108\3\2\2\2\u010b\u010e\3\2\2\2\u010c\u010a\3\2\2\2\u010c\u010d\3\2"+
		"\2\2\u010d\67\3\2\2\2\u010e\u010c\3\2\2\2\u010f\u0110\7\5\2\2\u0110\u0115"+
		"\5:\36\2\u0111\u0112\7\7\2\2\u0112\u0114\5:\36\2\u0113\u0111\3\2\2\2\u0114"+
		"\u0117\3\2\2\2\u0115\u0113\3\2\2\2\u0115\u0116\3\2\2\2\u0116\u0118\3\2"+
		"\2\2\u0117\u0115\3\2\2\2\u0118\u0119\7\6\2\2\u01199\3\2\2\2\u011a\u011b"+
		"\t\5\2\2\u011b;\3\2\2\2\32?CU\\`p\u0081\u008b\u0095\u00ac\u00b2\u00b7"+
		"\u00ba\u00bd\u00c0\u00cb\u00ce\u00d8\u00e0\u00eb\u0102\u0104\u010c\u0115";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}