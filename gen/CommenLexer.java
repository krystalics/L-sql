// Generated from /Users/krysta/study/L-sql/src/main/resources/CommenLexer.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CommenLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		BOOLEAN=1, ID=2, NUMBER=3, STRING=4, WS=5, LINE_COMMENT=6, COMMENT=7;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"BOOLEAN", "ID", "LETTER", "NUMBER", "DIGIT", "STRING", "WS", "LINE_COMMENT", 
			"COMMENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "BOOLEAN", "ID", "NUMBER", "STRING", "WS", "LINE_COMMENT", "COMMENT"
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


	public CommenLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "CommenLexer.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\tl\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2\37\n\2\3\3\3\3\3\3\7\3$\n\3\f\3\16\3"+
		"\'\13\3\3\4\3\4\3\5\3\5\6\5-\n\5\r\5\16\5.\3\5\6\5\62\n\5\r\5\16\5\63"+
		"\3\5\3\5\7\58\n\5\f\5\16\5;\13\5\5\5=\n\5\5\5?\n\5\3\6\3\6\3\7\3\7\3\7"+
		"\3\7\7\7G\n\7\f\7\16\7J\13\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\7"+
		"\tV\n\t\f\t\16\tY\13\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\7\nc\n\n\f\n\16"+
		"\nf\13\n\3\n\3\n\3\n\3\n\3\n\5HWd\2\13\3\3\5\4\7\2\t\5\13\2\r\6\17\7\21"+
		"\b\23\t\3\2\5\6\2C\\aac|\u0082\u0101\3\2\62;\5\2\13\f\17\17\"\"\2u\2\3"+
		"\3\2\2\2\2\5\3\2\2\2\2\t\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2"+
		"\2\23\3\2\2\2\3\36\3\2\2\2\5 \3\2\2\2\7(\3\2\2\2\t>\3\2\2\2\13@\3\2\2"+
		"\2\rB\3\2\2\2\17M\3\2\2\2\21Q\3\2\2\2\23^\3\2\2\2\25\26\7v\2\2\26\27\7"+
		"t\2\2\27\30\7w\2\2\30\37\7g\2\2\31\32\7h\2\2\32\33\7c\2\2\33\34\7n\2\2"+
		"\34\35\7u\2\2\35\37\7g\2\2\36\25\3\2\2\2\36\31\3\2\2\2\37\4\3\2\2\2 %"+
		"\5\7\4\2!$\5\7\4\2\"$\5\13\6\2#!\3\2\2\2#\"\3\2\2\2$\'\3\2\2\2%#\3\2\2"+
		"\2%&\3\2\2\2&\6\3\2\2\2\'%\3\2\2\2()\t\2\2\2)\b\3\2\2\2*,\7\60\2\2+-\5"+
		"\13\6\2,+\3\2\2\2-.\3\2\2\2.,\3\2\2\2./\3\2\2\2/?\3\2\2\2\60\62\5\13\6"+
		"\2\61\60\3\2\2\2\62\63\3\2\2\2\63\61\3\2\2\2\63\64\3\2\2\2\64<\3\2\2\2"+
		"\659\7\60\2\2\668\5\13\6\2\67\66\3\2\2\28;\3\2\2\29\67\3\2\2\29:\3\2\2"+
		"\2:=\3\2\2\2;9\3\2\2\2<\65\3\2\2\2<=\3\2\2\2=?\3\2\2\2>*\3\2\2\2>\61\3"+
		"\2\2\2?\n\3\2\2\2@A\t\3\2\2A\f\3\2\2\2BH\7$\2\2CD\7^\2\2DG\7$\2\2EG\13"+
		"\2\2\2FC\3\2\2\2FE\3\2\2\2GJ\3\2\2\2HI\3\2\2\2HF\3\2\2\2IK\3\2\2\2JH\3"+
		"\2\2\2KL\7$\2\2L\16\3\2\2\2MN\t\4\2\2NO\3\2\2\2OP\b\b\2\2P\20\3\2\2\2"+
		"QR\7\61\2\2RS\7\61\2\2SW\3\2\2\2TV\13\2\2\2UT\3\2\2\2VY\3\2\2\2WX\3\2"+
		"\2\2WU\3\2\2\2XZ\3\2\2\2YW\3\2\2\2Z[\7\f\2\2[\\\3\2\2\2\\]\b\t\3\2]\22"+
		"\3\2\2\2^_\7\61\2\2_`\7,\2\2`d\3\2\2\2ac\13\2\2\2ba\3\2\2\2cf\3\2\2\2"+
		"de\3\2\2\2db\3\2\2\2eg\3\2\2\2fd\3\2\2\2gh\7,\2\2hi\7\61\2\2ij\3\2\2\2"+
		"jk\b\n\3\2k\24\3\2\2\2\17\2\36#%.\639<>FHWd\4\b\2\2\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}