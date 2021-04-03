// Generated from /Users/krysta/study/L-sql/src/main/resources/LSQL.g4 by ANTLR 4.9.1
package com.github.krystalics.lsql.compile;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LSQLLexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
			"T__25", "T__26", "T__27", "T__28", "T__29", "T__30", "T__31", "T__32", 
			"T__33", "T__34", "T__35", "T__36", "T__37", "T__38", "T__39", "T__40", 
			"T__41", "BOOLEAN", "ID", "LETTER", "NUMBER", "DIGIT", "STRING", "WS", 
			"LINE_COMMENT", "COMMENT"
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


	public LSQLLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "LSQL.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\63\u0193\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16"+
		"\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27"+
		"\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\32\3\32\3\32"+
		"\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 "+
		"\3 \3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$"+
		"\3$\3$\3%\3%\3%\3%\3%\3%\3&\3&\3\'\3\'\3\'\3(\3(\3)\3)\3)\3*\3*\3*\3+"+
		"\3+\3+\3,\3,\3,\3,\3,\3,\3,\3,\3,\5,\u0146\n,\3-\3-\3-\7-\u014b\n-\f-"+
		"\16-\u014e\13-\3.\3.\3/\3/\6/\u0154\n/\r/\16/\u0155\3/\6/\u0159\n/\r/"+
		"\16/\u015a\3/\3/\7/\u015f\n/\f/\16/\u0162\13/\5/\u0164\n/\5/\u0166\n/"+
		"\3\60\3\60\3\61\3\61\3\61\3\61\7\61\u016e\n\61\f\61\16\61\u0171\13\61"+
		"\3\61\3\61\3\62\3\62\3\62\3\62\3\63\3\63\3\63\3\63\7\63\u017d\n\63\f\63"+
		"\16\63\u0180\13\63\3\63\3\63\3\63\3\63\3\64\3\64\3\64\3\64\7\64\u018a"+
		"\n\64\f\64\16\64\u018d\13\64\3\64\3\64\3\64\3\64\3\64\5\u016f\u017e\u018b"+
		"\2\65\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36"+
		";\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[\2]/_\2a\60c\61e\62g\63\3\2\5\6\2"+
		"C\\aac|\u0082\u0101\3\2\62;\5\2\13\f\17\17\"\"\2\u019c\2\3\3\2\2\2\2\5"+
		"\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2"+
		"\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33"+
		"\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2"+
		"\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2"+
		"\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2"+
		"\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K"+
		"\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2"+
		"\2\2\2Y\3\2\2\2\2]\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2"+
		"\3i\3\2\2\2\5k\3\2\2\2\7r\3\2\2\2\t{\3\2\2\2\13\u0081\3\2\2\2\r\u0083"+
		"\3\2\2\2\17\u0085\3\2\2\2\21\u0087\3\2\2\2\23\u008f\3\2\2\2\25\u0097\3"+
		"\2\2\2\27\u009b\3\2\2\2\31\u00a2\3\2\2\2\33\u00aa\3\2\2\2\35\u00af\3\2"+
		"\2\2\37\u00b5\3\2\2\2!\u00b9\3\2\2\2#\u00c0\3\2\2\2%\u00c7\3\2\2\2\'\u00ce"+
		"\3\2\2\2)\u00d3\3\2\2\2+\u00da\3\2\2\2-\u00e1\3\2\2\2/\u00e6\3\2\2\2\61"+
		"\u00ed\3\2\2\2\63\u00ef\3\2\2\2\65\u00f3\3\2\2\2\67\u00fa\3\2\2\29\u00fc"+
		"\3\2\2\2;\u0102\3\2\2\2=\u0105\3\2\2\2?\u010c\3\2\2\2A\u0110\3\2\2\2C"+
		"\u0113\3\2\2\2E\u0119\3\2\2\2G\u011f\3\2\2\2I\u0126\3\2\2\2K\u012c\3\2"+
		"\2\2M\u012e\3\2\2\2O\u0131\3\2\2\2Q\u0133\3\2\2\2S\u0136\3\2\2\2U\u0139"+
		"\3\2\2\2W\u0145\3\2\2\2Y\u0147\3\2\2\2[\u014f\3\2\2\2]\u0165\3\2\2\2_"+
		"\u0167\3\2\2\2a\u0169\3\2\2\2c\u0174\3\2\2\2e\u0178\3\2\2\2g\u0185\3\2"+
		"\2\2ij\7=\2\2j\4\3\2\2\2kl\7e\2\2lm\7t\2\2mn\7g\2\2no\7c\2\2op\7v\2\2"+
		"pq\7g\2\2q\6\3\2\2\2rs\7f\2\2st\7c\2\2tu\7v\2\2uv\7c\2\2vw\7d\2\2wx\7"+
		"c\2\2xy\7u\2\2yz\7g\2\2z\b\3\2\2\2{|\7v\2\2|}\7c\2\2}~\7d\2\2~\177\7n"+
		"\2\2\177\u0080\7g\2\2\u0080\n\3\2\2\2\u0081\u0082\7*\2\2\u0082\f\3\2\2"+
		"\2\u0083\u0084\7+\2\2\u0084\16\3\2\2\2\u0085\u0086\7.\2\2\u0086\20\3\2"+
		"\2\2\u0087\u0088\7f\2\2\u0088\u0089\7g\2\2\u0089\u008a\7h\2\2\u008a\u008b"+
		"\7c\2\2\u008b\u008c\7w\2\2\u008c\u008d\7n\2\2\u008d\u008e\7v\2\2\u008e"+
		"\22\3\2\2\2\u008f\u0090\7e\2\2\u0090\u0091\7q\2\2\u0091\u0092\7o\2\2\u0092"+
		"\u0093\7o\2\2\u0093\u0094\7g\2\2\u0094\u0095\7p\2\2\u0095\u0096\7v\2\2"+
		"\u0096\24\3\2\2\2\u0097\u0098\7k\2\2\u0098\u0099\7p\2\2\u0099\u009a\7"+
		"v\2\2\u009a\26\3\2\2\2\u009b\u009c\7u\2\2\u009c\u009d\7v\2\2\u009d\u009e"+
		"\7t\2\2\u009e\u009f\7k\2\2\u009f\u00a0\7p\2\2\u00a0\u00a1\7i\2\2\u00a1"+
		"\30\3\2\2\2\u00a2\u00a3\7d\2\2\u00a3\u00a4\7q\2\2\u00a4\u00a5\7q\2\2\u00a5"+
		"\u00a6\7n\2\2\u00a6\u00a7\7g\2\2\u00a7\u00a8\7c\2\2\u00a8\u00a9\7p\2\2"+
		"\u00a9\32\3\2\2\2\u00aa\u00ab\7f\2\2\u00ab\u00ac\7t\2\2\u00ac\u00ad\7"+
		"q\2\2\u00ad\u00ae\7r\2\2\u00ae\34\3\2\2\2\u00af\u00b0\7c\2\2\u00b0\u00b1"+
		"\7n\2\2\u00b1\u00b2\7v\2\2\u00b2\u00b3\7g\2\2\u00b3\u00b4\7t\2\2\u00b4"+
		"\36\3\2\2\2\u00b5\u00b6\7c\2\2\u00b6\u00b7\7f\2\2\u00b7\u00b8\7f\2\2\u00b8"+
		" \3\2\2\2\u00b9\u00ba\7e\2\2\u00ba\u00bb\7q\2\2\u00bb\u00bc\7n\2\2\u00bc"+
		"\u00bd\7w\2\2\u00bd\u00be\7o\2\2\u00be\u00bf\7p\2\2\u00bf\"\3\2\2\2\u00c0"+
		"\u00c1\7o\2\2\u00c1\u00c2\7q\2\2\u00c2\u00c3\7f\2\2\u00c3\u00c4\7k\2\2"+
		"\u00c4\u00c5\7h\2\2\u00c5\u00c6\7{\2\2\u00c6$\3\2\2\2\u00c7\u00c8\7k\2"+
		"\2\u00c8\u00c9\7p\2\2\u00c9\u00ca\7u\2\2\u00ca\u00cb\7g\2\2\u00cb\u00cc"+
		"\7t\2\2\u00cc\u00cd\7v\2\2\u00cd&\3\2\2\2\u00ce\u00cf\7k\2\2\u00cf\u00d0"+
		"\7p\2\2\u00d0\u00d1\7v\2\2\u00d1\u00d2\7q\2\2\u00d2(\3\2\2\2\u00d3\u00d4"+
		"\7x\2\2\u00d4\u00d5\7c\2\2\u00d5\u00d6\7n\2\2\u00d6\u00d7\7w\2\2\u00d7"+
		"\u00d8\7g\2\2\u00d8\u00d9\7u\2\2\u00d9*\3\2\2\2\u00da\u00db\7f\2\2\u00db"+
		"\u00dc\7g\2\2\u00dc\u00dd\7n\2\2\u00dd\u00de\7g\2\2\u00de\u00df\7v\2\2"+
		"\u00df\u00e0\7g\2\2\u00e0,\3\2\2\2\u00e1\u00e2\7h\2\2\u00e2\u00e3\7t\2"+
		"\2\u00e3\u00e4\7q\2\2\u00e4\u00e5\7o\2\2\u00e5.\3\2\2\2\u00e6\u00e7\7"+
		"w\2\2\u00e7\u00e8\7r\2\2\u00e8\u00e9\7f\2\2\u00e9\u00ea\7c\2\2\u00ea\u00eb"+
		"\7v\2\2\u00eb\u00ec\7g\2\2\u00ec\60\3\2\2\2\u00ed\u00ee\7?\2\2\u00ee\62"+
		"\3\2\2\2\u00ef\u00f0\7u\2\2\u00f0\u00f1\7g\2\2\u00f1\u00f2\7v\2\2\u00f2"+
		"\64\3\2\2\2\u00f3\u00f4\7u\2\2\u00f4\u00f5\7g\2\2\u00f5\u00f6\7n\2\2\u00f6"+
		"\u00f7\7g\2\2\u00f7\u00f8\7e\2\2\u00f8\u00f9\7v\2\2\u00f9\66\3\2\2\2\u00fa"+
		"\u00fb\7,\2\2\u00fb8\3\2\2\2\u00fc\u00fd\7i\2\2\u00fd\u00fe\7t\2\2\u00fe"+
		"\u00ff\7q\2\2\u00ff\u0100\7w\2\2\u0100\u0101\7r\2\2\u0101:\3\2\2\2\u0102"+
		"\u0103\7d\2\2\u0103\u0104\7{\2\2\u0104<\3\2\2\2\u0105\u0106\7j\2\2\u0106"+
		"\u0107\7c\2\2\u0107\u0108\7x\2\2\u0108\u0109\7k\2\2\u0109\u010a\7p\2\2"+
		"\u010a\u010b\7i\2\2\u010b>\3\2\2\2\u010c\u010d\7c\2\2\u010d\u010e\7p\2"+
		"\2\u010e\u010f\7f\2\2\u010f@\3\2\2\2\u0110\u0111\7q\2\2\u0111\u0112\7"+
		"t\2\2\u0112B\3\2\2\2\u0113\u0114\7q\2\2\u0114\u0115\7t\2\2\u0115\u0116"+
		"\7f\2\2\u0116\u0117\7g\2\2\u0117\u0118\7t\2\2\u0118D\3\2\2\2\u0119\u011a"+
		"\7n\2\2\u011a\u011b\7k\2\2\u011b\u011c\7o\2\2\u011c\u011d\7k\2\2\u011d"+
		"\u011e\7v\2\2\u011eF\3\2\2\2\u011f\u0120\7q\2\2\u0120\u0121\7h\2\2\u0121"+
		"\u0122\7h\2\2\u0122\u0123\7u\2\2\u0123\u0124\7g\2\2\u0124\u0125\7v\2\2"+
		"\u0125H\3\2\2\2\u0126\u0127\7y\2\2\u0127\u0128\7j\2\2\u0128\u0129\7g\2"+
		"\2\u0129\u012a\7t\2\2\u012a\u012b\7g\2\2\u012bJ\3\2\2\2\u012c\u012d\7"+
		"@\2\2\u012dL\3\2\2\2\u012e\u012f\7@\2\2\u012f\u0130\7?\2\2\u0130N\3\2"+
		"\2\2\u0131\u0132\7>\2\2\u0132P\3\2\2\2\u0133\u0134\7>\2\2\u0134\u0135"+
		"\7?\2\2\u0135R\3\2\2\2\u0136\u0137\7#\2\2\u0137\u0138\7?\2\2\u0138T\3"+
		"\2\2\2\u0139\u013a\7k\2\2\u013a\u013b\7p\2\2\u013bV\3\2\2\2\u013c\u013d"+
		"\7v\2\2\u013d\u013e\7t\2\2\u013e\u013f\7w\2\2\u013f\u0146\7g\2\2\u0140"+
		"\u0141\7h\2\2\u0141\u0142\7c\2\2\u0142\u0143\7n\2\2\u0143\u0144\7u\2\2"+
		"\u0144\u0146\7g\2\2\u0145\u013c\3\2\2\2\u0145\u0140\3\2\2\2\u0146X\3\2"+
		"\2\2\u0147\u014c\5[.\2\u0148\u014b\5[.\2\u0149\u014b\5_\60\2\u014a\u0148"+
		"\3\2\2\2\u014a\u0149\3\2\2\2\u014b\u014e\3\2\2\2\u014c\u014a\3\2\2\2\u014c"+
		"\u014d\3\2\2\2\u014dZ\3\2\2\2\u014e\u014c\3\2\2\2\u014f\u0150\t\2\2\2"+
		"\u0150\\\3\2\2\2\u0151\u0153\7\60\2\2\u0152\u0154\5_\60\2\u0153\u0152"+
		"\3\2\2\2\u0154\u0155\3\2\2\2\u0155\u0153\3\2\2\2\u0155\u0156\3\2\2\2\u0156"+
		"\u0166\3\2\2\2\u0157\u0159\5_\60\2\u0158\u0157\3\2\2\2\u0159\u015a\3\2"+
		"\2\2\u015a\u0158\3\2\2\2\u015a\u015b\3\2\2\2\u015b\u0163\3\2\2\2\u015c"+
		"\u0160\7\60\2\2\u015d\u015f\5_\60\2\u015e\u015d\3\2\2\2\u015f\u0162\3"+
		"\2\2\2\u0160\u015e\3\2\2\2\u0160\u0161\3\2\2\2\u0161\u0164\3\2\2\2\u0162"+
		"\u0160\3\2\2\2\u0163\u015c\3\2\2\2\u0163\u0164\3\2\2\2\u0164\u0166\3\2"+
		"\2\2\u0165\u0151\3\2\2\2\u0165\u0158\3\2\2\2\u0166^\3\2\2\2\u0167\u0168"+
		"\t\3\2\2\u0168`\3\2\2\2\u0169\u016f\7$\2\2\u016a\u016b\7^\2\2\u016b\u016e"+
		"\7$\2\2\u016c\u016e\13\2\2\2\u016d\u016a\3\2\2\2\u016d\u016c\3\2\2\2\u016e"+
		"\u0171\3\2\2\2\u016f\u0170\3\2\2\2\u016f\u016d\3\2\2\2\u0170\u0172\3\2"+
		"\2\2\u0171\u016f\3\2\2\2\u0172\u0173\7$\2\2\u0173b\3\2\2\2\u0174\u0175"+
		"\t\4\2\2\u0175\u0176\3\2\2\2\u0176\u0177\b\62\2\2\u0177d\3\2\2\2\u0178"+
		"\u0179\7\61\2\2\u0179\u017a\7\61\2\2\u017a\u017e\3\2\2\2\u017b\u017d\13"+
		"\2\2\2\u017c\u017b\3\2\2\2\u017d\u0180\3\2\2\2\u017e\u017f\3\2\2\2\u017e"+
		"\u017c\3\2\2\2\u017f\u0181\3\2\2\2\u0180\u017e\3\2\2\2\u0181\u0182\7\f"+
		"\2\2\u0182\u0183\3\2\2\2\u0183\u0184\b\63\3\2\u0184f\3\2\2\2\u0185\u0186"+
		"\7\61\2\2\u0186\u0187\7,\2\2\u0187\u018b\3\2\2\2\u0188\u018a\13\2\2\2"+
		"\u0189\u0188\3\2\2\2\u018a\u018d\3\2\2\2\u018b\u018c\3\2\2\2\u018b\u0189"+
		"\3\2\2\2\u018c\u018e\3\2\2\2\u018d\u018b\3\2\2\2\u018e\u018f\7,\2\2\u018f"+
		"\u0190\7\61\2\2\u0190\u0191\3\2\2\2\u0191\u0192\b\64\3\2\u0192h\3\2\2"+
		"\2\17\2\u0145\u014a\u014c\u0155\u015a\u0160\u0163\u0165\u016d\u016f\u017e"+
		"\u018b\4\b\2\2\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}