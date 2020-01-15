// Generated from /home/damm1t/IdeaProjects/mt_lab3/src/gen.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class genLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, FUNCTION=2, INTEGER=3, LONG=4, SHORT=5, REAL=6, BEGIN=7, END=8, 
		VAR=9, READ=10, READLN=11, WRITE=12, WRITELN=13, COLON=14, SEMICOLON=15, 
		COMMA=16, LPAR=17, RPAR=18, AP=19, PLUS=20, MINUS=21, DIV=22, MUL=23, 
		EQ=24, STRING=25, NUMBER=26, NAME=27, WS=28;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "FUNCTION", "INTEGER", "LONG", "SHORT", "REAL", "BEGIN", "END", 
			"VAR", "READ", "READLN", "WRITE", "WRITELN", "COLON", "SEMICOLON", "COMMA", 
			"LPAR", "RPAR", "AP", "PLUS", "MINUS", "DIV", "MUL", "EQ", "STRING", 
			"NUMBER", "NAME", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'.'", "'function'", "'integer'", "'longint'", "'shortint'", "'real'", 
			"'begin'", "'end'", "'var'", "'read'", "'readln'", "'write'", "'writeln'", 
			"':'", "';'", "','", "'('", "')'", "'''", "'+'", "'-'", "'/'", "'*'", 
			"'='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "FUNCTION", "INTEGER", "LONG", "SHORT", "REAL", "BEGIN", 
			"END", "VAR", "READ", "READLN", "WRITE", "WRITELN", "COLON", "SEMICOLON", 
			"COMMA", "LPAR", "RPAR", "AP", "PLUS", "MINUS", "DIV", "MUL", "EQ", "STRING", 
			"NUMBER", "NAME", "WS"
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


	public genLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "gen.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\36\u00c8\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\3\2\3\2\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13"+
		"\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3"+
		"\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3"+
		"\31\3\32\3\32\7\32\u00a5\n\32\f\32\16\32\u00a8\13\32\3\32\3\32\3\33\3"+
		"\33\7\33\u00ae\n\33\f\33\16\33\u00b1\13\33\3\33\3\33\6\33\u00b5\n\33\r"+
		"\33\16\33\u00b6\5\33\u00b9\n\33\3\34\3\34\7\34\u00bd\n\34\f\34\16\34\u00c0"+
		"\13\34\3\35\6\35\u00c3\n\35\r\35\16\35\u00c4\3\35\3\35\2\2\36\3\3\5\4"+
		"\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22"+
		"#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36\3\2\b\b\2\""+
		"\"*;??C\\aac|\3\2\63;\3\2\62;\5\2C\\aac|\6\2\62;C\\aac|\5\2\13\f\17\17"+
		"\"\"\2\u00cd\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2"+
		"\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2"+
		"\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2"+
		"\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2"+
		"\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3"+
		"\2\2\2\3;\3\2\2\2\5=\3\2\2\2\7F\3\2\2\2\tN\3\2\2\2\13V\3\2\2\2\r_\3\2"+
		"\2\2\17d\3\2\2\2\21j\3\2\2\2\23n\3\2\2\2\25r\3\2\2\2\27w\3\2\2\2\31~\3"+
		"\2\2\2\33\u0084\3\2\2\2\35\u008c\3\2\2\2\37\u008e\3\2\2\2!\u0090\3\2\2"+
		"\2#\u0092\3\2\2\2%\u0094\3\2\2\2\'\u0096\3\2\2\2)\u0098\3\2\2\2+\u009a"+
		"\3\2\2\2-\u009c\3\2\2\2/\u009e\3\2\2\2\61\u00a0\3\2\2\2\63\u00a2\3\2\2"+
		"\2\65\u00ab\3\2\2\2\67\u00ba\3\2\2\29\u00c2\3\2\2\2;<\7\60\2\2<\4\3\2"+
		"\2\2=>\7h\2\2>?\7w\2\2?@\7p\2\2@A\7e\2\2AB\7v\2\2BC\7k\2\2CD\7q\2\2DE"+
		"\7p\2\2E\6\3\2\2\2FG\7k\2\2GH\7p\2\2HI\7v\2\2IJ\7g\2\2JK\7i\2\2KL\7g\2"+
		"\2LM\7t\2\2M\b\3\2\2\2NO\7n\2\2OP\7q\2\2PQ\7p\2\2QR\7i\2\2RS\7k\2\2ST"+
		"\7p\2\2TU\7v\2\2U\n\3\2\2\2VW\7u\2\2WX\7j\2\2XY\7q\2\2YZ\7t\2\2Z[\7v\2"+
		"\2[\\\7k\2\2\\]\7p\2\2]^\7v\2\2^\f\3\2\2\2_`\7t\2\2`a\7g\2\2ab\7c\2\2"+
		"bc\7n\2\2c\16\3\2\2\2de\7d\2\2ef\7g\2\2fg\7i\2\2gh\7k\2\2hi\7p\2\2i\20"+
		"\3\2\2\2jk\7g\2\2kl\7p\2\2lm\7f\2\2m\22\3\2\2\2no\7x\2\2op\7c\2\2pq\7"+
		"t\2\2q\24\3\2\2\2rs\7t\2\2st\7g\2\2tu\7c\2\2uv\7f\2\2v\26\3\2\2\2wx\7"+
		"t\2\2xy\7g\2\2yz\7c\2\2z{\7f\2\2{|\7n\2\2|}\7p\2\2}\30\3\2\2\2~\177\7"+
		"y\2\2\177\u0080\7t\2\2\u0080\u0081\7k\2\2\u0081\u0082\7v\2\2\u0082\u0083"+
		"\7g\2\2\u0083\32\3\2\2\2\u0084\u0085\7y\2\2\u0085\u0086\7t\2\2\u0086\u0087"+
		"\7k\2\2\u0087\u0088\7v\2\2\u0088\u0089\7g\2\2\u0089\u008a\7n\2\2\u008a"+
		"\u008b\7p\2\2\u008b\34\3\2\2\2\u008c\u008d\7<\2\2\u008d\36\3\2\2\2\u008e"+
		"\u008f\7=\2\2\u008f \3\2\2\2\u0090\u0091\7.\2\2\u0091\"\3\2\2\2\u0092"+
		"\u0093\7*\2\2\u0093$\3\2\2\2\u0094\u0095\7+\2\2\u0095&\3\2\2\2\u0096\u0097"+
		"\7)\2\2\u0097(\3\2\2\2\u0098\u0099\7-\2\2\u0099*\3\2\2\2\u009a\u009b\7"+
		"/\2\2\u009b,\3\2\2\2\u009c\u009d\7\61\2\2\u009d.\3\2\2\2\u009e\u009f\7"+
		",\2\2\u009f\60\3\2\2\2\u00a0\u00a1\7?\2\2\u00a1\62\3\2\2\2\u00a2\u00a6"+
		"\5\'\24\2\u00a3\u00a5\t\2\2\2\u00a4\u00a3\3\2\2\2\u00a5\u00a8\3\2\2\2"+
		"\u00a6\u00a4\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a9\3\2\2\2\u00a8\u00a6"+
		"\3\2\2\2\u00a9\u00aa\5\'\24\2\u00aa\64\3\2\2\2\u00ab\u00af\t\3\2\2\u00ac"+
		"\u00ae\t\4\2\2\u00ad\u00ac\3\2\2\2\u00ae\u00b1\3\2\2\2\u00af\u00ad\3\2"+
		"\2\2\u00af\u00b0\3\2\2\2\u00b0\u00b8\3\2\2\2\u00b1\u00af\3\2\2\2\u00b2"+
		"\u00b4\7\60\2\2\u00b3\u00b5\t\4\2\2\u00b4\u00b3\3\2\2\2\u00b5\u00b6\3"+
		"\2\2\2\u00b6\u00b4\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00b9\3\2\2\2\u00b8"+
		"\u00b2\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\66\3\2\2\2\u00ba\u00be\t\5\2"+
		"\2\u00bb\u00bd\t\6\2\2\u00bc\u00bb\3\2\2\2\u00bd\u00c0\3\2\2\2\u00be\u00bc"+
		"\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf8\3\2\2\2\u00c0\u00be\3\2\2\2\u00c1"+
		"\u00c3\t\7\2\2\u00c2\u00c1\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c2\3\2"+
		"\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c7\b\35\2\2\u00c7"+
		":\3\2\2\2\t\2\u00a6\u00af\u00b6\u00b8\u00be\u00c4\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}