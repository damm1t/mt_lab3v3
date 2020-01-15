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
		RULE_program = 0, RULE_function = 1, RULE_returnValue = 2, RULE_header = 3, 
		RULE_variables = 4, RULE_declaration = 5, RULE_type = 6, RULE_op = 7, 
		RULE_commands = 8, RULE_command = 9, RULE_arithmetic = 10;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "function", "returnValue", "header", "variables", "declaration", 
			"type", "op", "commands", "command", "arithmetic"
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
			setState(24);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VAR) {
				{
				setState(22);
				match(VAR);
				setState(23);
				variables();
				}
			}

			setState(29);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FUNCTION) {
				{
				{
				setState(26);
				function();
				}
				}
				setState(31);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(32);
			match(BEGIN);
			setState(33);
			commands();
			setState(34);
			match(END);
			setState(35);
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
		public ReturnValueContext v;
		public TerminalNode BEGIN() { return getToken(genParser.BEGIN, 0); }
		public CommandsContext commands() {
			return getRuleContext(CommandsContext.class,0);
		}
		public TerminalNode END() { return getToken(genParser.END, 0); }
		public TerminalNode SEMICOLON() { return getToken(genParser.SEMICOLON, 0); }
		public HeaderContext header() {
			return getRuleContext(HeaderContext.class,0);
		}
		public ReturnValueContext returnValue() {
			return getRuleContext(ReturnValueContext.class,0);
		}
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
			setState(37);
			((FunctionContext)_localctx).h = header();
			setState(40);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VAR) {
				{
				setState(38);
				match(VAR);
				setState(39);
				variables();
				}
			}

			setState(42);
			match(BEGIN);
			setState(43);
			commands();
			setState(44);
			((FunctionContext)_localctx).v = returnValue();
			setState(45);
			match(END);
			setState(46);
			match(SEMICOLON);
			setState(47);
			if (!(((FunctionContext)_localctx).h.name.equals(((FunctionContext)_localctx).v.name))) throw new FailedPredicateException(this, "$h.name.equals($v.name)");
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

	public static class ReturnValueContext extends ParserRuleContext {
		public String name;
		public Token n;
		public TerminalNode COLON() { return getToken(genParser.COLON, 0); }
		public TerminalNode EQ() { return getToken(genParser.EQ, 0); }
		public ArithmeticContext arithmetic() {
			return getRuleContext(ArithmeticContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(genParser.SEMICOLON, 0); }
		public TerminalNode NAME() { return getToken(genParser.NAME, 0); }
		public ReturnValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof genListener ) ((genListener)listener).enterReturnValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof genListener ) ((genListener)listener).exitReturnValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof genVisitor ) return ((genVisitor<? extends T>)visitor).visitReturnValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnValueContext returnValue() throws RecognitionException {
		ReturnValueContext _localctx = new ReturnValueContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_returnValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			((ReturnValueContext)_localctx).n = match(NAME);
			setState(50);
			match(COLON);
			setState(51);
			match(EQ);
			setState(52);
			arithmetic(0);
			setState(53);
			match(SEMICOLON);
			((ReturnValueContext)_localctx).name =  ((ReturnValueContext)_localctx).n.getText();
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
		enterRule(_localctx, 6, RULE_header);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			match(FUNCTION);
			setState(57);
			((HeaderContext)_localctx).n = match(NAME);
			setState(58);
			match(LPAR);
			setState(67);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(60);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==VAR) {
						{
						setState(59);
						match(VAR);
						}
					}

					setState(62);
					declaration();
					setState(63);
					match(SEMICOLON);
					}
					} 
				}
				setState(69);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			setState(71);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VAR) {
				{
				setState(70);
				match(VAR);
				}
			}

			setState(73);
			declaration();
			setState(74);
			match(RPAR);
			setState(75);
			match(COLON);
			setState(76);
			type();
			setState(77);
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
		enterRule(_localctx, 8, RULE_variables);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(80);
				declaration();
				setState(81);
				match(SEMICOLON);
				}
				}
				setState(85); 
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
		enterRule(_localctx, 10, RULE_declaration);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(87);
					match(NAME);
					setState(88);
					match(COMMA);
					}
					} 
				}
				setState(93);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			setState(94);
			match(NAME);
			setState(95);
			match(COLON);
			setState(96);
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
		enterRule(_localctx, 12, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
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
		enterRule(_localctx, 14, RULE_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
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
		enterRule(_localctx, 16, RULE_commands);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(102);
					command();
					setState(103);
					match(SEMICOLON);
					}
					} 
				}
				setState(109);
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
		enterRule(_localctx, 18, RULE_command);
		int _la;
		try {
			int _alt;
			setState(154);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(110);
				match(NAME);
				setState(111);
				match(EQ);
				setState(112);
				arithmetic(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(113);
				_la = _input.LA(1);
				if ( !(_la==READ || _la==READLN) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(114);
				match(LPAR);
				setState(119);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(115);
						match(NAME);
						setState(116);
						match(COMMA);
						}
						} 
					}
					setState(121);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				}
				setState(122);
				match(NAME);
				setState(123);
				match(RPAR);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(124);
				_la = _input.LA(1);
				if ( !(_la==WRITE || _la==WRITELN) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(125);
				match(LPAR);
				setState(133);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(128);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case LPAR:
						case NUMBER:
						case NAME:
							{
							setState(126);
							arithmetic(0);
							}
							break;
						case STRING:
							{
							setState(127);
							match(STRING);
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(130);
						match(COMMA);
						}
						} 
					}
					setState(135);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				}
				setState(138);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LPAR:
				case NUMBER:
				case NAME:
					{
					setState(136);
					arithmetic(0);
					}
					break;
				case STRING:
					{
					setState(137);
					match(STRING);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(140);
				match(RPAR);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(141);
				match(NAME);
				setState(142);
				match(LPAR);
				setState(151);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NAME) {
					{
					setState(147);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(143);
							match(NAME);
							setState(144);
							match(COMMA);
							}
							} 
						}
						setState(149);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
					}
					setState(150);
					match(NAME);
					}
				}

				setState(153);
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
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_arithmetic, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(157);
				match(LPAR);
				setState(158);
				arithmetic(0);
				setState(159);
				match(RPAR);
				}
				break;
			case 2:
				{
				setState(161);
				match(NAME);
				}
				break;
			case 3:
				{
				setState(162);
				match(NUMBER);
				}
				break;
			case 4:
				{
				setState(163);
				match(NAME);
				setState(164);
				match(LPAR);
				setState(173);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NAME) {
					{
					setState(169);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(165);
							match(NAME);
							setState(166);
							match(COMMA);
							}
							} 
						}
						setState(171);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
					}
					setState(172);
					match(NAME);
					}
				}

				setState(175);
				match(RPAR);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(184);
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
					setState(178);
					if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
					setState(179);
					op();
					setState(180);
					arithmetic(6);
					}
					} 
				}
				setState(186);
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
		case 10:
			return arithmetic_sempred((ArithmeticContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean function_sempred(FunctionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return ((FunctionContext)_localctx).h.name.equals(((FunctionContext)_localctx).v.name);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\36\u00be\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\3\2\3\2\5\2\33\n\2\3\2\7\2\36\n\2\f\2\16\2!\13\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\3\3\3\3\3\5\3+\n\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\5\5?\n\5\3\5\3\5\3\5\7\5D\n\5\f\5"+
		"\16\5G\13\5\3\5\5\5J\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\6\6V"+
		"\n\6\r\6\16\6W\3\7\3\7\7\7\\\n\7\f\7\16\7_\13\7\3\7\3\7\3\7\3\7\3\b\3"+
		"\b\3\t\3\t\3\n\3\n\3\n\7\nl\n\n\f\n\16\no\13\n\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\7\13x\n\13\f\13\16\13{\13\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\5\13\u0083\n\13\3\13\7\13\u0086\n\13\f\13\16\13\u0089\13\13\3\13\3\13"+
		"\5\13\u008d\n\13\3\13\3\13\3\13\3\13\3\13\7\13\u0094\n\13\f\13\16\13\u0097"+
		"\13\13\3\13\5\13\u009a\n\13\3\13\5\13\u009d\n\13\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\7\f\u00aa\n\f\f\f\16\f\u00ad\13\f\3\f\5\f\u00b0"+
		"\n\f\3\f\5\f\u00b3\n\f\3\f\3\f\3\f\3\f\7\f\u00b9\n\f\f\f\16\f\u00bc\13"+
		"\f\3\f\2\3\26\r\2\4\6\b\n\f\16\20\22\24\26\2\6\3\2\5\b\3\2\26\31\3\2\f"+
		"\r\3\2\16\17\2\u00ca\2\32\3\2\2\2\4\'\3\2\2\2\6\63\3\2\2\2\b:\3\2\2\2"+
		"\nU\3\2\2\2\f]\3\2\2\2\16d\3\2\2\2\20f\3\2\2\2\22m\3\2\2\2\24\u009c\3"+
		"\2\2\2\26\u00b2\3\2\2\2\30\31\7\13\2\2\31\33\5\n\6\2\32\30\3\2\2\2\32"+
		"\33\3\2\2\2\33\37\3\2\2\2\34\36\5\4\3\2\35\34\3\2\2\2\36!\3\2\2\2\37\35"+
		"\3\2\2\2\37 \3\2\2\2 \"\3\2\2\2!\37\3\2\2\2\"#\7\t\2\2#$\5\22\n\2$%\7"+
		"\n\2\2%&\7\3\2\2&\3\3\2\2\2\'*\5\b\5\2()\7\13\2\2)+\5\n\6\2*(\3\2\2\2"+
		"*+\3\2\2\2+,\3\2\2\2,-\7\t\2\2-.\5\22\n\2./\5\6\4\2/\60\7\n\2\2\60\61"+
		"\7\21\2\2\61\62\6\3\2\3\62\5\3\2\2\2\63\64\7\35\2\2\64\65\7\20\2\2\65"+
		"\66\7\32\2\2\66\67\5\26\f\2\678\7\21\2\289\b\4\1\29\7\3\2\2\2:;\7\4\2"+
		"\2;<\7\35\2\2<E\7\23\2\2=?\7\13\2\2>=\3\2\2\2>?\3\2\2\2?@\3\2\2\2@A\5"+
		"\f\7\2AB\7\21\2\2BD\3\2\2\2C>\3\2\2\2DG\3\2\2\2EC\3\2\2\2EF\3\2\2\2FI"+
		"\3\2\2\2GE\3\2\2\2HJ\7\13\2\2IH\3\2\2\2IJ\3\2\2\2JK\3\2\2\2KL\5\f\7\2"+
		"LM\7\24\2\2MN\7\20\2\2NO\5\16\b\2OP\7\21\2\2PQ\b\5\1\2Q\t\3\2\2\2RS\5"+
		"\f\7\2ST\7\21\2\2TV\3\2\2\2UR\3\2\2\2VW\3\2\2\2WU\3\2\2\2WX\3\2\2\2X\13"+
		"\3\2\2\2YZ\7\35\2\2Z\\\7\22\2\2[Y\3\2\2\2\\_\3\2\2\2][\3\2\2\2]^\3\2\2"+
		"\2^`\3\2\2\2_]\3\2\2\2`a\7\35\2\2ab\7\20\2\2bc\5\16\b\2c\r\3\2\2\2de\t"+
		"\2\2\2e\17\3\2\2\2fg\t\3\2\2g\21\3\2\2\2hi\5\24\13\2ij\7\21\2\2jl\3\2"+
		"\2\2kh\3\2\2\2lo\3\2\2\2mk\3\2\2\2mn\3\2\2\2n\23\3\2\2\2om\3\2\2\2pq\7"+
		"\35\2\2qr\7\32\2\2r\u009d\5\26\f\2st\t\4\2\2ty\7\23\2\2uv\7\35\2\2vx\7"+
		"\22\2\2wu\3\2\2\2x{\3\2\2\2yw\3\2\2\2yz\3\2\2\2z|\3\2\2\2{y\3\2\2\2|}"+
		"\7\35\2\2}\u009d\7\24\2\2~\177\t\5\2\2\177\u0087\7\23\2\2\u0080\u0083"+
		"\5\26\f\2\u0081\u0083\7\33\2\2\u0082\u0080\3\2\2\2\u0082\u0081\3\2\2\2"+
		"\u0083\u0084\3\2\2\2\u0084\u0086\7\22\2\2\u0085\u0082\3\2\2\2\u0086\u0089"+
		"\3\2\2\2\u0087\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u008c\3\2\2\2\u0089"+
		"\u0087\3\2\2\2\u008a\u008d\5\26\f\2\u008b\u008d\7\33\2\2\u008c\u008a\3"+
		"\2\2\2\u008c\u008b\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u009d\7\24\2\2\u008f"+
		"\u0090\7\35\2\2\u0090\u0099\7\23\2\2\u0091\u0092\7\35\2\2\u0092\u0094"+
		"\7\22\2\2\u0093\u0091\3\2\2\2\u0094\u0097\3\2\2\2\u0095\u0093\3\2\2\2"+
		"\u0095\u0096\3\2\2\2\u0096\u0098\3\2\2\2\u0097\u0095\3\2\2\2\u0098\u009a"+
		"\7\35\2\2\u0099\u0095\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u009b\3\2\2\2"+
		"\u009b\u009d\7\24\2\2\u009cp\3\2\2\2\u009cs\3\2\2\2\u009c~\3\2\2\2\u009c"+
		"\u008f\3\2\2\2\u009d\25\3\2\2\2\u009e\u009f\b\f\1\2\u009f\u00a0\7\23\2"+
		"\2\u00a0\u00a1\5\26\f\2\u00a1\u00a2\7\24\2\2\u00a2\u00b3\3\2\2\2\u00a3"+
		"\u00b3\7\35\2\2\u00a4\u00b3\7\34\2\2\u00a5\u00a6\7\35\2\2\u00a6\u00af"+
		"\7\23\2\2\u00a7\u00a8\7\35\2\2\u00a8\u00aa\7\22\2\2\u00a9\u00a7\3\2\2"+
		"\2\u00aa\u00ad\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00ae"+
		"\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ae\u00b0\7\35\2\2\u00af\u00ab\3\2\2\2"+
		"\u00af\u00b0\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00b3\7\24\2\2\u00b2\u009e"+
		"\3\2\2\2\u00b2\u00a3\3\2\2\2\u00b2\u00a4\3\2\2\2\u00b2\u00a5\3\2\2\2\u00b3"+
		"\u00ba\3\2\2\2\u00b4\u00b5\f\7\2\2\u00b5\u00b6\5\20\t\2\u00b6\u00b7\5"+
		"\26\f\b\u00b7\u00b9\3\2\2\2\u00b8\u00b4\3\2\2\2\u00b9\u00bc\3\2\2\2\u00ba"+
		"\u00b8\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\27\3\2\2\2\u00bc\u00ba\3\2\2"+
		"\2\26\32\37*>EIW]my\u0082\u0087\u008c\u0095\u0099\u009c\u00ab\u00af\u00b2"+
		"\u00ba";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}