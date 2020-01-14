// Generated from /home/damm1t/IdeaProjects/mt_lab3/src/gen.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class genParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, FUNCTION=2, INTEGER=3, LONG=4, SHORT=5, REAL=6, BEGIN=7, END=8, 
		VAR=9, READ=10, READLN=11, WRITE=12, WRITELN=13, COLON=14, SEMICOLON=15, 
		COMMA=16, LPAR=17, RPAR=18, AP=19, PLUS=20, MINUS=21, DIV=22, MUL=23, 
		EQ=24, STRING=25, NUMBER=26, NAME=27, WS=28;
	public static final int
		RULE_program = 0, RULE_function = 1, RULE_header = 2, RULE_variables = 3, 
		RULE_declaration = 4, RULE_type = 5, RULE_op = 6, RULE_commands = 7, RULE_command = 8, 
		RULE_arithmetic = 9;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "function", "header", "variables", "declaration", "type", 
			"op", "commands", "command", "arithmetic"
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

	@Override
	public String getGrammarFileName() { return "gen.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public genParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode BEGIN() { return getToken(genParser.BEGIN, 0); }
		public CommandsContext commands() {
			return getRuleContext(CommandsContext.class,0);
		}
		public TerminalNode END() { return getToken(genParser.END, 0); }
		public TerminalNode VAR() { return getToken(genParser.VAR, 0); }
		public VariablesContext variables() {
			return getRuleContext(VariablesContext.class,0);
		}
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof genListener ) ((genListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof genListener ) ((genListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof genVisitor ) return ((genVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(22);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VAR) {
				{
				setState(20);
				match(VAR);
				setState(21);
				variables();
				}
			}

			setState(27);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FUNCTION) {
				{
				{
				setState(24);
				function();
				}
				}
				setState(29);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(30);
			match(BEGIN);
			setState(31);
			commands();
			setState(32);
			match(END);
			setState(33);
			match(T__0);
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

	public static class FunctionContext extends ParserRuleContext {
		public HeaderContext h;
		public Token n;
		public TerminalNode BEGIN() { return getToken(genParser.BEGIN, 0); }
		public CommandsContext commands() {
			return getRuleContext(CommandsContext.class,0);
		}
		public TerminalNode COLON() { return getToken(genParser.COLON, 0); }
		public TerminalNode EQ() { return getToken(genParser.EQ, 0); }
		public ArithmeticContext arithmetic() {
			return getRuleContext(ArithmeticContext.class,0);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(genParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(genParser.SEMICOLON, i);
		}
		public TerminalNode END() { return getToken(genParser.END, 0); }
		public HeaderContext header() {
			return getRuleContext(HeaderContext.class,0);
		}
		public TerminalNode NAME() { return getToken(genParser.NAME, 0); }
		public TerminalNode VAR() { return getToken(genParser.VAR, 0); }
		public VariablesContext variables() {
			return getRuleContext(VariablesContext.class,0);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof genListener ) ((genListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof genListener ) ((genListener)listener).exitFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof genVisitor ) return ((genVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(35);
			((FunctionContext)_localctx).h = header();
			setState(38);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VAR) {
				{
				setState(36);
				match(VAR);
				setState(37);
				variables();
				}
			}

			setState(40);
			match(BEGIN);
			setState(41);
			commands();
			setState(42);
			((FunctionContext)_localctx).n = match(NAME);
			setState(43);
			match(COLON);
			setState(44);
			match(EQ);
			setState(45);
			arithmetic(0);
			setState(46);
			match(SEMICOLON);
			setState(47);
			match(END);
			setState(48);
			match(SEMICOLON);
			setState(49);
			if (!(((FunctionContext)_localctx).h.name.equals(((FunctionContext)_localctx).n.getText()))) throw new FailedPredicateException(this, "$h.name.equals($n.getText())");
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

	public static class HeaderContext extends ParserRuleContext {
		public String name;
		public Token n;
		public TerminalNode FUNCTION() { return getToken(genParser.FUNCTION, 0); }
		public TerminalNode LPAR() { return getToken(genParser.LPAR, 0); }
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public TerminalNode RPAR() { return getToken(genParser.RPAR, 0); }
		public TerminalNode COLON() { return getToken(genParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(genParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(genParser.SEMICOLON, i);
		}
		public TerminalNode NAME() { return getToken(genParser.NAME, 0); }
		public List<TerminalNode> VAR() { return getTokens(genParser.VAR); }
		public TerminalNode VAR(int i) {
			return getToken(genParser.VAR, i);
		}
		public HeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_header; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof genListener ) ((genListener)listener).enterHeader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof genListener ) ((genListener)listener).exitHeader(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof genVisitor ) return ((genVisitor<? extends T>)visitor).visitHeader(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HeaderContext header() throws RecognitionException {
		HeaderContext _localctx = new HeaderContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_header);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			match(FUNCTION);
			setState(52);
			((HeaderContext)_localctx).n = match(NAME);
			setState(53);
			match(LPAR);
			setState(62);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(55);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==VAR) {
						{
						setState(54);
						match(VAR);
						}
					}

					setState(57);
					declaration();
					setState(58);
					match(SEMICOLON);
					}
					} 
				}
				setState(64);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			setState(66);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VAR) {
				{
				setState(65);
				match(VAR);
				}
			}

			setState(68);
			declaration();
			setState(69);
			match(RPAR);
			setState(70);
			match(COLON);
			setState(71);
			type();
			setState(72);
			match(SEMICOLON);
			((HeaderContext)_localctx).name =  ((HeaderContext)_localctx).n.getText();
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

	public static class VariablesContext extends ParserRuleContext {
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(genParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(genParser.SEMICOLON, i);
		}
		public VariablesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variables; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof genListener ) ((genListener)listener).enterVariables(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof genListener ) ((genListener)listener).exitVariables(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof genVisitor ) return ((genVisitor<? extends T>)visitor).visitVariables(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariablesContext variables() throws RecognitionException {
		VariablesContext _localctx = new VariablesContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_variables);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(75);
				declaration();
				setState(76);
				match(SEMICOLON);
				}
				}
				setState(80); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NAME );
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

	public static class DeclarationContext extends ParserRuleContext {
		public List<TerminalNode> NAME() { return getTokens(genParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(genParser.NAME, i);
		}
		public TerminalNode COLON() { return getToken(genParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(genParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(genParser.COMMA, i);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof genListener ) ((genListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof genListener ) ((genListener)listener).exitDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof genVisitor ) return ((genVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_declaration);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(82);
					match(NAME);
					setState(83);
					match(COMMA);
					}
					} 
				}
				setState(88);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			setState(89);
			match(NAME);
			setState(90);
			match(COLON);
			setState(91);
			type();
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
		public TerminalNode INTEGER() { return getToken(genParser.INTEGER, 0); }
		public TerminalNode LONG() { return getToken(genParser.LONG, 0); }
		public TerminalNode SHORT() { return getToken(genParser.SHORT, 0); }
		public TerminalNode REAL() { return getToken(genParser.REAL, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof genListener ) ((genListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof genListener ) ((genListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof genVisitor ) return ((genVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTEGER) | (1L << LONG) | (1L << SHORT) | (1L << REAL))) != 0)) ) {
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

	public static class OpContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(genParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(genParser.MINUS, 0); }
		public TerminalNode DIV() { return getToken(genParser.DIV, 0); }
		public TerminalNode MUL() { return getToken(genParser.MUL, 0); }
		public OpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof genListener ) ((genListener)listener).enterOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof genListener ) ((genListener)listener).exitOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof genVisitor ) return ((genVisitor<? extends T>)visitor).visitOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpContext op() throws RecognitionException {
		OpContext _localctx = new OpContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << DIV) | (1L << MUL))) != 0)) ) {
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

	public static class CommandsContext extends ParserRuleContext {
		public List<CommandContext> command() {
			return getRuleContexts(CommandContext.class);
		}
		public CommandContext command(int i) {
			return getRuleContext(CommandContext.class,i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(genParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(genParser.SEMICOLON, i);
		}
		public CommandsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commands; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof genListener ) ((genListener)listener).enterCommands(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof genListener ) ((genListener)listener).exitCommands(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof genVisitor ) return ((genVisitor<? extends T>)visitor).visitCommands(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommandsContext commands() throws RecognitionException {
		CommandsContext _localctx = new CommandsContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_commands);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(97);
					command();
					setState(98);
					match(SEMICOLON);
					}
					} 
				}
				setState(104);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
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

	public static class CommandContext extends ParserRuleContext {
		public List<TerminalNode> NAME() { return getTokens(genParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(genParser.NAME, i);
		}
		public TerminalNode EQ() { return getToken(genParser.EQ, 0); }
		public List<ArithmeticContext> arithmetic() {
			return getRuleContexts(ArithmeticContext.class);
		}
		public ArithmeticContext arithmetic(int i) {
			return getRuleContext(ArithmeticContext.class,i);
		}
		public TerminalNode LPAR() { return getToken(genParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(genParser.RPAR, 0); }
		public TerminalNode READ() { return getToken(genParser.READ, 0); }
		public TerminalNode READLN() { return getToken(genParser.READLN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(genParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(genParser.COMMA, i);
		}
		public TerminalNode WRITE() { return getToken(genParser.WRITE, 0); }
		public TerminalNode WRITELN() { return getToken(genParser.WRITELN, 0); }
		public List<TerminalNode> STRING() { return getTokens(genParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(genParser.STRING, i);
		}
		public CommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_command; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof genListener ) ((genListener)listener).enterCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof genListener ) ((genListener)listener).exitCommand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof genVisitor ) return ((genVisitor<? extends T>)visitor).visitCommand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommandContext command() throws RecognitionException {
		CommandContext _localctx = new CommandContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_command);
		int _la;
		try {
			int _alt;
			setState(149);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(105);
				match(NAME);
				setState(106);
				match(EQ);
				setState(107);
				arithmetic(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(108);
				_la = _input.LA(1);
				if ( !(_la==READ || _la==READLN) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(109);
				match(LPAR);
				setState(114);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(110);
						match(NAME);
						setState(111);
						match(COMMA);
						}
						} 
					}
					setState(116);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				}
				setState(117);
				match(NAME);
				setState(118);
				match(RPAR);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(119);
				_la = _input.LA(1);
				if ( !(_la==WRITE || _la==WRITELN) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(120);
				match(LPAR);
				setState(128);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(123);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case LPAR:
						case NUMBER:
						case NAME:
							{
							setState(121);
							arithmetic(0);
							}
							break;
						case STRING:
							{
							setState(122);
							match(STRING);
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(125);
						match(COMMA);
						}
						} 
					}
					setState(130);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				}
				setState(133);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LPAR:
				case NUMBER:
				case NAME:
					{
					setState(131);
					arithmetic(0);
					}
					break;
				case STRING:
					{
					setState(132);
					match(STRING);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(135);
				match(RPAR);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(136);
				match(NAME);
				setState(137);
				match(LPAR);
				setState(146);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NAME) {
					{
					setState(142);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(138);
							match(NAME);
							setState(139);
							match(COMMA);
							}
							} 
						}
						setState(144);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
					}
					setState(145);
					match(NAME);
					}
				}

				setState(148);
				match(RPAR);
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

	public static class ArithmeticContext extends ParserRuleContext {
		public TerminalNode LPAR() { return getToken(genParser.LPAR, 0); }
		public List<ArithmeticContext> arithmetic() {
			return getRuleContexts(ArithmeticContext.class);
		}
		public ArithmeticContext arithmetic(int i) {
			return getRuleContext(ArithmeticContext.class,i);
		}
		public TerminalNode RPAR() { return getToken(genParser.RPAR, 0); }
		public List<TerminalNode> NAME() { return getTokens(genParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(genParser.NAME, i);
		}
		public TerminalNode NUMBER() { return getToken(genParser.NUMBER, 0); }
		public List<TerminalNode> COMMA() { return getTokens(genParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(genParser.COMMA, i);
		}
		public OpContext op() {
			return getRuleContext(OpContext.class,0);
		}
		public ArithmeticContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmetic; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof genListener ) ((genListener)listener).enterArithmetic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof genListener ) ((genListener)listener).exitArithmetic(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof genVisitor ) return ((genVisitor<? extends T>)visitor).visitArithmetic(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArithmeticContext arithmetic() throws RecognitionException {
		return arithmetic(0);
	}

	private ArithmeticContext arithmetic(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ArithmeticContext _localctx = new ArithmeticContext(_ctx, _parentState);
		ArithmeticContext _prevctx = _localctx;
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_arithmetic, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(152);
				match(LPAR);
				setState(153);
				arithmetic(0);
				setState(154);
				match(RPAR);
				}
				break;
			case 2:
				{
				setState(156);
				match(NAME);
				}
				break;
			case 3:
				{
				setState(157);
				match(NUMBER);
				}
				break;
			case 4:
				{
				setState(158);
				match(NAME);
				setState(159);
				match(LPAR);
				setState(168);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NAME) {
					{
					setState(164);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(160);
							match(NAME);
							setState(161);
							match(COMMA);
							}
							} 
						}
						setState(166);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
					}
					setState(167);
					match(NAME);
					}
				}

				setState(170);
				match(RPAR);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(179);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ArithmeticContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_arithmetic);
					setState(173);
					if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
					setState(174);
					op();
					setState(175);
					arithmetic(6);
					}
					} 
				}
				setState(181);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 1:
			return function_sempred((FunctionContext)_localctx, predIndex);
		case 9:
			return arithmetic_sempred((ArithmeticContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean function_sempred(FunctionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return ((FunctionContext)_localctx).h.name.equals(((FunctionContext)_localctx).n.getText());
		}
		return true;
	}
	private boolean arithmetic_sempred(ArithmeticContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 5);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\36\u00b9\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\3\2\3\2\5\2\31\n\2\3\2\7\2\34\n\2\f\2\16\2\37\13\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\3\3\3\3\3\5\3)\n\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\4\3\4\3\4\3\4\5\4:\n\4\3\4\3\4\3\4\7\4?\n\4\f\4\16\4B\13\4\3\4\5"+
		"\4E\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\6\5Q\n\5\r\5\16\5R\3\6"+
		"\3\6\7\6W\n\6\f\6\16\6Z\13\6\3\6\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3"+
		"\t\7\tg\n\t\f\t\16\tj\13\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\ns\n\n\f\n\16"+
		"\nv\13\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n~\n\n\3\n\7\n\u0081\n\n\f\n\16\n\u0084"+
		"\13\n\3\n\3\n\5\n\u0088\n\n\3\n\3\n\3\n\3\n\3\n\7\n\u008f\n\n\f\n\16\n"+
		"\u0092\13\n\3\n\5\n\u0095\n\n\3\n\5\n\u0098\n\n\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u00a5\n\13\f\13\16\13\u00a8\13"+
		"\13\3\13\5\13\u00ab\n\13\3\13\5\13\u00ae\n\13\3\13\3\13\3\13\3\13\7\13"+
		"\u00b4\n\13\f\13\16\13\u00b7\13\13\3\13\2\3\24\f\2\4\6\b\n\f\16\20\22"+
		"\24\2\6\3\2\5\b\3\2\26\31\3\2\f\r\3\2\16\17\2\u00c6\2\30\3\2\2\2\4%\3"+
		"\2\2\2\6\65\3\2\2\2\bP\3\2\2\2\nX\3\2\2\2\f_\3\2\2\2\16a\3\2\2\2\20h\3"+
		"\2\2\2\22\u0097\3\2\2\2\24\u00ad\3\2\2\2\26\27\7\13\2\2\27\31\5\b\5\2"+
		"\30\26\3\2\2\2\30\31\3\2\2\2\31\35\3\2\2\2\32\34\5\4\3\2\33\32\3\2\2\2"+
		"\34\37\3\2\2\2\35\33\3\2\2\2\35\36\3\2\2\2\36 \3\2\2\2\37\35\3\2\2\2 "+
		"!\7\t\2\2!\"\5\20\t\2\"#\7\n\2\2#$\7\3\2\2$\3\3\2\2\2%(\5\6\4\2&\'\7\13"+
		"\2\2\')\5\b\5\2(&\3\2\2\2()\3\2\2\2)*\3\2\2\2*+\7\t\2\2+,\5\20\t\2,-\7"+
		"\35\2\2-.\7\20\2\2./\7\32\2\2/\60\5\24\13\2\60\61\7\21\2\2\61\62\7\n\2"+
		"\2\62\63\7\21\2\2\63\64\6\3\2\3\64\5\3\2\2\2\65\66\7\4\2\2\66\67\7\35"+
		"\2\2\67@\7\23\2\28:\7\13\2\298\3\2\2\29:\3\2\2\2:;\3\2\2\2;<\5\n\6\2<"+
		"=\7\21\2\2=?\3\2\2\2>9\3\2\2\2?B\3\2\2\2@>\3\2\2\2@A\3\2\2\2AD\3\2\2\2"+
		"B@\3\2\2\2CE\7\13\2\2DC\3\2\2\2DE\3\2\2\2EF\3\2\2\2FG\5\n\6\2GH\7\24\2"+
		"\2HI\7\20\2\2IJ\5\f\7\2JK\7\21\2\2KL\b\4\1\2L\7\3\2\2\2MN\5\n\6\2NO\7"+
		"\21\2\2OQ\3\2\2\2PM\3\2\2\2QR\3\2\2\2RP\3\2\2\2RS\3\2\2\2S\t\3\2\2\2T"+
		"U\7\35\2\2UW\7\22\2\2VT\3\2\2\2WZ\3\2\2\2XV\3\2\2\2XY\3\2\2\2Y[\3\2\2"+
		"\2ZX\3\2\2\2[\\\7\35\2\2\\]\7\20\2\2]^\5\f\7\2^\13\3\2\2\2_`\t\2\2\2`"+
		"\r\3\2\2\2ab\t\3\2\2b\17\3\2\2\2cd\5\22\n\2de\7\21\2\2eg\3\2\2\2fc\3\2"+
		"\2\2gj\3\2\2\2hf\3\2\2\2hi\3\2\2\2i\21\3\2\2\2jh\3\2\2\2kl\7\35\2\2lm"+
		"\7\32\2\2m\u0098\5\24\13\2no\t\4\2\2ot\7\23\2\2pq\7\35\2\2qs\7\22\2\2"+
		"rp\3\2\2\2sv\3\2\2\2tr\3\2\2\2tu\3\2\2\2uw\3\2\2\2vt\3\2\2\2wx\7\35\2"+
		"\2x\u0098\7\24\2\2yz\t\5\2\2z\u0082\7\23\2\2{~\5\24\13\2|~\7\33\2\2}{"+
		"\3\2\2\2}|\3\2\2\2~\177\3\2\2\2\177\u0081\7\22\2\2\u0080}\3\2\2\2\u0081"+
		"\u0084\3\2\2\2\u0082\u0080\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0087\3\2"+
		"\2\2\u0084\u0082\3\2\2\2\u0085\u0088\5\24\13\2\u0086\u0088\7\33\2\2\u0087"+
		"\u0085\3\2\2\2\u0087\u0086\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u0098\7\24"+
		"\2\2\u008a\u008b\7\35\2\2\u008b\u0094\7\23\2\2\u008c\u008d\7\35\2\2\u008d"+
		"\u008f\7\22\2\2\u008e\u008c\3\2\2\2\u008f\u0092\3\2\2\2\u0090\u008e\3"+
		"\2\2\2\u0090\u0091\3\2\2\2\u0091\u0093\3\2\2\2\u0092\u0090\3\2\2\2\u0093"+
		"\u0095\7\35\2\2\u0094\u0090\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0096\3"+
		"\2\2\2\u0096\u0098\7\24\2\2\u0097k\3\2\2\2\u0097n\3\2\2\2\u0097y\3\2\2"+
		"\2\u0097\u008a\3\2\2\2\u0098\23\3\2\2\2\u0099\u009a\b\13\1\2\u009a\u009b"+
		"\7\23\2\2\u009b\u009c\5\24\13\2\u009c\u009d\7\24\2\2\u009d\u00ae\3\2\2"+
		"\2\u009e\u00ae\7\35\2\2\u009f\u00ae\7\34\2\2\u00a0\u00a1\7\35\2\2\u00a1"+
		"\u00aa\7\23\2\2\u00a2\u00a3\7\35\2\2\u00a3\u00a5\7\22\2\2\u00a4\u00a2"+
		"\3\2\2\2\u00a5\u00a8\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7"+
		"\u00a9\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a9\u00ab\7\35\2\2\u00aa\u00a6\3"+
		"\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00ae\7\24\2\2\u00ad"+
		"\u0099\3\2\2\2\u00ad\u009e\3\2\2\2\u00ad\u009f\3\2\2\2\u00ad\u00a0\3\2"+
		"\2\2\u00ae\u00b5\3\2\2\2\u00af\u00b0\f\7\2\2\u00b0\u00b1\5\16\b\2\u00b1"+
		"\u00b2\5\24\13\b\u00b2\u00b4\3\2\2\2\u00b3\u00af\3\2\2\2\u00b4\u00b7\3"+
		"\2\2\2\u00b5\u00b3\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\25\3\2\2\2\u00b7"+
		"\u00b5\3\2\2\2\26\30\35(9@DRXht}\u0082\u0087\u0090\u0094\u0097\u00a6\u00aa"+
		"\u00ad\u00b5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}