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
		T__31=32, BOOLEAN=33, ID=34, NUMBER=35, STRING=36, WS=37, LINE_COMMENT=38, 
		COMMENT=39;
	public static final int
		RULE_ddl = 0, RULE_create = 1, RULE_createDb = 2, RULE_createTable = 3, 
		RULE_fieldDeifnitions = 4, RULE_fieldDeifnition = 5, RULE_type = 6, RULE_drop = 7, 
		RULE_alter = 8, RULE_alterOperation = 9, RULE_addOperation = 10, RULE_dropOperation = 11, 
		RULE_modifyOperation = 12, RULE_dml = 13, RULE_insert = 14, RULE_columns = 15, 
		RULE_values = 16, RULE_value = 17, RULE_item = 18, RULE_delete = 19, RULE_expr = 20, 
		RULE_whereStat = 21, RULE_update = 22, RULE_assign = 23, RULE_setStat = 24;
	private static String[] makeRuleNames() {
		return new String[] {
			"ddl", "create", "createDb", "createTable", "fieldDeifnitions", "fieldDeifnition", 
			"type", "drop", "alter", "alterOperation", "addOperation", "dropOperation", 
			"modifyOperation", "dml", "insert", "columns", "values", "value", "item", 
			"delete", "expr", "whereStat", "update", "assign", "setStat"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'create'", "'database'", "'table'", "'('", "')'", "','", "'default'", 
			"'comment'", "'int'", "'string'", "'boolean'", "'drop'", "'alter'", "'add'", 
			"'column'", "'modify'", "'insert'", "'into'", "'values'", "'delete'", 
			"'from'", "'='", "'>'", "'>='", "'<'", "'<='", "'!='", "'where'", "'and'", 
			"'or'", "'update'", "'set'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, "BOOLEAN", "ID", 
			"NUMBER", "STRING", "WS", "LINE_COMMENT", "COMMENT"
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
			setState(53);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(50);
				create();
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 2);
				{
				setState(51);
				drop();
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 3);
				{
				setState(52);
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
			setState(57);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(55);
				createDb();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(56);
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
			setState(59);
			match(T__0);
			setState(60);
			match(T__1);
			setState(61);
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
			setState(63);
			match(T__0);
			setState(64);
			match(T__2);
			setState(65);
			match(ID);
			setState(66);
			match(T__3);
			setState(67);
			fieldDeifnitions();
			setState(68);
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
			setState(70);
			fieldDeifnition();
			setState(75);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(71);
				match(T__5);
				setState(72);
				fieldDeifnition();
				}
				}
				setState(77);
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
			setState(78);
			match(ID);
			setState(79);
			type();
			setState(82);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__6) {
				{
				setState(80);
				match(T__6);
				setState(81);
				item();
				}
			}

			setState(86);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(84);
				match(T__7);
				setState(85);
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
			setState(88);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__9) | (1L << T__10))) != 0)) ) {
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
			setState(90);
			match(T__11);
			setState(91);
			_la = _input.LA(1);
			if ( !(_la==T__1 || _la==T__2) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(92);
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
			setState(94);
			match(T__12);
			setState(95);
			match(T__2);
			setState(96);
			match(ID);
			setState(97);
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
			setState(102);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__13:
				enterOuterAlt(_localctx, 1);
				{
				setState(99);
				addOperation();
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 2);
				{
				setState(100);
				dropOperation();
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 3);
				{
				setState(101);
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
			setState(104);
			match(T__13);
			setState(105);
			match(T__3);
			setState(106);
			fieldDeifnitions();
			setState(107);
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
			setState(109);
			match(T__11);
			setState(110);
			match(T__14);
			setState(111);
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
			setState(113);
			match(T__15);
			setState(114);
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
			setState(119);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__16:
				enterOuterAlt(_localctx, 1);
				{
				setState(116);
				insert();
				}
				break;
			case T__19:
				enterOuterAlt(_localctx, 2);
				{
				setState(117);
				delete();
				}
				break;
			case T__30:
				enterOuterAlt(_localctx, 3);
				{
				setState(118);
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
			setState(121);
			match(T__16);
			setState(122);
			match(T__17);
			setState(123);
			match(T__2);
			setState(124);
			match(ID);
			setState(129);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(125);
				match(T__3);
				setState(126);
				columns();
				setState(127);
				match(T__4);
				}
			}

			setState(131);
			match(T__18);
			setState(132);
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
		enterRule(_localctx, 30, RULE_columns);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			match(ID);
			setState(139);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(135);
				match(T__5);
				setState(136);
				match(ID);
				}
				}
				setState(141);
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
		enterRule(_localctx, 32, RULE_values);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			value();
			setState(147);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(143);
				match(T__5);
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
		enterRule(_localctx, 34, RULE_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			match(T__3);
			setState(151);
			item();
			setState(156);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(152);
				match(T__5);
				setState(153);
				item();
				}
				}
				setState(158);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(159);
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
		enterRule(_localctx, 36, RULE_item);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
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
		enterRule(_localctx, 38, RULE_delete);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			match(T__19);
			setState(164);
			match(T__20);
			setState(165);
			match(ID);
			setState(166);
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

	public static class ExprContext extends ParserRuleContext {
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
		int _startState = 40;
		enterRecursionRule(_localctx, 40, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(169);
			item();
			}
			_ctx.stop = _input.LT(-1);
			setState(191);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(189);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(171);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(172);
						match(T__21);
						setState(173);
						expr(8);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(174);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(175);
						match(T__22);
						setState(176);
						expr(7);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(177);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(178);
						match(T__23);
						setState(179);
						expr(6);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(180);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(181);
						match(T__24);
						setState(182);
						expr(5);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(183);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(184);
						match(T__25);
						setState(185);
						expr(4);
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(186);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(187);
						match(T__26);
						setState(188);
						expr(3);
						}
						break;
					}
					} 
				}
				setState(193);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
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
		enterRule(_localctx, 42, RULE_whereStat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			match(T__27);
			setState(195);
			expr(0);
			setState(200);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__28 || _la==T__29) {
				{
				{
				setState(196);
				_la = _input.LA(1);
				if ( !(_la==T__28 || _la==T__29) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(197);
				expr(0);
				}
				}
				setState(202);
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
		enterRule(_localctx, 44, RULE_update);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			match(T__30);
			setState(204);
			match(ID);
			setState(205);
			setStat();
			setState(206);
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
		enterRule(_localctx, 46, RULE_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			match(ID);
			setState(209);
			match(T__21);
			setState(210);
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
		enterRule(_localctx, 48, RULE_setStat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			match(T__31);
			setState(213);
			assign();
			setState(218);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(214);
				match(T__5);
				setState(215);
				assign();
				}
				}
				setState(220);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 20:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 7);
		case 1:
			return precpred(_ctx, 6);
		case 2:
			return precpred(_ctx, 5);
		case 3:
			return precpred(_ctx, 4);
		case 4:
			return precpred(_ctx, 3);
		case 5:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3)\u00e0\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\3\2\3\2\3\2\5\28\n\2\3\3\3\3\5\3<\n\3\3\4\3\4\3\4\3\4\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\7\6L\n\6\f\6\16\6O\13\6\3\7\3\7\3\7"+
		"\3\7\5\7U\n\7\3\7\3\7\5\7Y\n\7\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n"+
		"\3\n\3\13\3\13\3\13\5\13i\n\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16"+
		"\3\16\3\16\3\17\3\17\3\17\5\17z\n\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\5\20\u0084\n\20\3\20\3\20\3\20\3\21\3\21\3\21\7\21\u008c\n\21\f"+
		"\21\16\21\u008f\13\21\3\22\3\22\3\22\7\22\u0094\n\22\f\22\16\22\u0097"+
		"\13\22\3\23\3\23\3\23\3\23\7\23\u009d\n\23\f\23\16\23\u00a0\13\23\3\23"+
		"\3\23\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\7\26\u00c0\n\26\f\26\16\26\u00c3\13\26\3\27\3\27\3\27\3\27\7\27"+
		"\u00c9\n\27\f\27\16\27\u00cc\13\27\3\30\3\30\3\30\3\30\3\30\3\31\3\31"+
		"\3\31\3\31\3\32\3\32\3\32\3\32\7\32\u00db\n\32\f\32\16\32\u00de\13\32"+
		"\3\32\2\3*\33\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\2"+
		"\6\3\2\13\r\3\2\4\5\4\2##%&\3\2\37 \2\u00dc\2\67\3\2\2\2\4;\3\2\2\2\6"+
		"=\3\2\2\2\bA\3\2\2\2\nH\3\2\2\2\fP\3\2\2\2\16Z\3\2\2\2\20\\\3\2\2\2\22"+
		"`\3\2\2\2\24h\3\2\2\2\26j\3\2\2\2\30o\3\2\2\2\32s\3\2\2\2\34y\3\2\2\2"+
		"\36{\3\2\2\2 \u0088\3\2\2\2\"\u0090\3\2\2\2$\u0098\3\2\2\2&\u00a3\3\2"+
		"\2\2(\u00a5\3\2\2\2*\u00aa\3\2\2\2,\u00c4\3\2\2\2.\u00cd\3\2\2\2\60\u00d2"+
		"\3\2\2\2\62\u00d6\3\2\2\2\648\5\4\3\2\658\5\20\t\2\668\5\22\n\2\67\64"+
		"\3\2\2\2\67\65\3\2\2\2\67\66\3\2\2\28\3\3\2\2\29<\5\6\4\2:<\5\b\5\2;9"+
		"\3\2\2\2;:\3\2\2\2<\5\3\2\2\2=>\7\3\2\2>?\7\4\2\2?@\7$\2\2@\7\3\2\2\2"+
		"AB\7\3\2\2BC\7\5\2\2CD\7$\2\2DE\7\6\2\2EF\5\n\6\2FG\7\7\2\2G\t\3\2\2\2"+
		"HM\5\f\7\2IJ\7\b\2\2JL\5\f\7\2KI\3\2\2\2LO\3\2\2\2MK\3\2\2\2MN\3\2\2\2"+
		"N\13\3\2\2\2OM\3\2\2\2PQ\7$\2\2QT\5\16\b\2RS\7\t\2\2SU\5&\24\2TR\3\2\2"+
		"\2TU\3\2\2\2UX\3\2\2\2VW\7\n\2\2WY\7&\2\2XV\3\2\2\2XY\3\2\2\2Y\r\3\2\2"+
		"\2Z[\t\2\2\2[\17\3\2\2\2\\]\7\16\2\2]^\t\3\2\2^_\7$\2\2_\21\3\2\2\2`a"+
		"\7\17\2\2ab\7\5\2\2bc\7$\2\2cd\5\24\13\2d\23\3\2\2\2ei\5\26\f\2fi\5\30"+
		"\r\2gi\5\32\16\2he\3\2\2\2hf\3\2\2\2hg\3\2\2\2i\25\3\2\2\2jk\7\20\2\2"+
		"kl\7\6\2\2lm\5\n\6\2mn\7\7\2\2n\27\3\2\2\2op\7\16\2\2pq\7\21\2\2qr\7$"+
		"\2\2r\31\3\2\2\2st\7\22\2\2tu\5\f\7\2u\33\3\2\2\2vz\5\36\20\2wz\5(\25"+
		"\2xz\5.\30\2yv\3\2\2\2yw\3\2\2\2yx\3\2\2\2z\35\3\2\2\2{|\7\23\2\2|}\7"+
		"\24\2\2}~\7\5\2\2~\u0083\7$\2\2\177\u0080\7\6\2\2\u0080\u0081\5 \21\2"+
		"\u0081\u0082\7\7\2\2\u0082\u0084\3\2\2\2\u0083\177\3\2\2\2\u0083\u0084"+
		"\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0086\7\25\2\2\u0086\u0087\5\"\22\2"+
		"\u0087\37\3\2\2\2\u0088\u008d\7$\2\2\u0089\u008a\7\b\2\2\u008a\u008c\7"+
		"$\2\2\u008b\u0089\3\2\2\2\u008c\u008f\3\2\2\2\u008d\u008b\3\2\2\2\u008d"+
		"\u008e\3\2\2\2\u008e!\3\2\2\2\u008f\u008d\3\2\2\2\u0090\u0095\5$\23\2"+
		"\u0091\u0092\7\b\2\2\u0092\u0094\5$\23\2\u0093\u0091\3\2\2\2\u0094\u0097"+
		"\3\2\2\2\u0095\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096#\3\2\2\2\u0097"+
		"\u0095\3\2\2\2\u0098\u0099\7\6\2\2\u0099\u009e\5&\24\2\u009a\u009b\7\b"+
		"\2\2\u009b\u009d\5&\24\2\u009c\u009a\3\2\2\2\u009d\u00a0\3\2\2\2\u009e"+
		"\u009c\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u00a1\3\2\2\2\u00a0\u009e\3\2"+
		"\2\2\u00a1\u00a2\7\7\2\2\u00a2%\3\2\2\2\u00a3\u00a4\t\4\2\2\u00a4\'\3"+
		"\2\2\2\u00a5\u00a6\7\26\2\2\u00a6\u00a7\7\27\2\2\u00a7\u00a8\7$\2\2\u00a8"+
		"\u00a9\5,\27\2\u00a9)\3\2\2\2\u00aa\u00ab\b\26\1\2\u00ab\u00ac\5&\24\2"+
		"\u00ac\u00c1\3\2\2\2\u00ad\u00ae\f\t\2\2\u00ae\u00af\7\30\2\2\u00af\u00c0"+
		"\5*\26\n\u00b0\u00b1\f\b\2\2\u00b1\u00b2\7\31\2\2\u00b2\u00c0\5*\26\t"+
		"\u00b3\u00b4\f\7\2\2\u00b4\u00b5\7\32\2\2\u00b5\u00c0\5*\26\b\u00b6\u00b7"+
		"\f\6\2\2\u00b7\u00b8\7\33\2\2\u00b8\u00c0\5*\26\7\u00b9\u00ba\f\5\2\2"+
		"\u00ba\u00bb\7\34\2\2\u00bb\u00c0\5*\26\6\u00bc\u00bd\f\4\2\2\u00bd\u00be"+
		"\7\35\2\2\u00be\u00c0\5*\26\5\u00bf\u00ad\3\2\2\2\u00bf\u00b0\3\2\2\2"+
		"\u00bf\u00b3\3\2\2\2\u00bf\u00b6\3\2\2\2\u00bf\u00b9\3\2\2\2\u00bf\u00bc"+
		"\3\2\2\2\u00c0\u00c3\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2"+
		"+\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c4\u00c5\7\36\2\2\u00c5\u00ca\5*\26\2"+
		"\u00c6\u00c7\t\5\2\2\u00c7\u00c9\5*\26\2\u00c8\u00c6\3\2\2\2\u00c9\u00cc"+
		"\3\2\2\2\u00ca\u00c8\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb-\3\2\2\2\u00cc"+
		"\u00ca\3\2\2\2\u00cd\u00ce\7!\2\2\u00ce\u00cf\7$\2\2\u00cf\u00d0\5\62"+
		"\32\2\u00d0\u00d1\5,\27\2\u00d1/\3\2\2\2\u00d2\u00d3\7$\2\2\u00d3\u00d4"+
		"\7\30\2\2\u00d4\u00d5\5&\24\2\u00d5\61\3\2\2\2\u00d6\u00d7\7\"\2\2\u00d7"+
		"\u00dc\5\60\31\2\u00d8\u00d9\7\b\2\2\u00d9\u00db\5\60\31\2\u00da\u00d8"+
		"\3\2\2\2\u00db\u00de\3\2\2\2\u00dc\u00da\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd"+
		"\63\3\2\2\2\u00de\u00dc\3\2\2\2\21\67;MTXhy\u0083\u008d\u0095\u009e\u00bf"+
		"\u00c1\u00ca\u00dc";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}