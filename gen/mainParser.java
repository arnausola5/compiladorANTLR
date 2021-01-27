// Generated from C:/Users/arnau/OneDrive/UdG/Quart/Compiladors/Pràctiques/Tokens\main.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class mainParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		TK_WS=1, TK_COMENTARI=2, TK_LPAREN=3, TK_RPAREN=4, TK_OVECTOR=5, TK_TVECTOR=6, 
		TK_STAR=7, TK_OP_PLUS=8, TK_OP_MENYS=9, TK_OP_DIVISIO_REAL=10, TK_OP_DIVISIO_ENTERA=11, 
		TK_OP_MODUL=12, TK_OP_MENYS_UNARI=13, TK_OP_IGUALTAT=14, TK_OP_DESIGUALTAT=15, 
		TK_SEMI=16, TK_COMA=17, TK_PUNT=18, TK_PC_PROGRAMA=19, TK_PC_FPROGRAMA=20, 
		TK_PC_PERIODE=21, TK_PC_PER=22, TK_PC_FPER=23, TK_PC_DE=24, TK_PC_FINS=25, 
		TK_PC_FER=26, TK_PC_SI=27, TK_PC_FSI=28, TK_PC_LLAVORS=29, TK_PC_ALTRAMENT=30, 
		TK_PC_MENTRE=31, TK_PC_FMENTRE=32, TK_PC_LLEGIR=33, TK_PC_ESCRIURE=34, 
		TK_PC_ESCRIURELN=35, TK_PC_ACCIO=36, TK_PC_FACCIO=37, TK_PC_FUNCIO=38, 
		TK_PC_FFUNCIO=39, TK_PC_RETORNA=40, TK_PC_ENT=41, TK_PC_ENTSOR=42, TK_PC_CONSTANTS=43, 
		TK_PC_FCONSTANTS=44, TK_PC_TIPUS=45, TK_PC_FTIPUS=46, TK_PC_VECTOR=47, 
		TK_PC_MIDA=48, TK_PC_INICI=49, TK_PC_TUPLA=50, TK_PC_FTUPLA=51, TK_PC_VARIABLES=52, 
		TK_PC_FVARIABLES=53, TK_MESGRAN=54, TK_MESPETIT=55, TK_MESPETIT_IGUAL=56, 
		TK_MESGRAN_IGUAL=57, TK_NEGACIO=58, TK_AND=59, TK_OR=60, TK_INTERROGANT=61, 
		TK_DOSPUNTS=62, TK_TB_ENTER=63, TK_TB_REAL=64, TK_TB_CAR=65, TK_TB_BOOLEA=66, 
		TK_TB_DATA=67, TK_ASSIGNACIO=68, TK_BOOLEA=69, TK_DATA=70, TK_ZERO=71, 
		TK_ENTER=72, TK_IDENT=73, TK_REAL=74, TK_CAR=75, TK_STRING=76;
	public static final int
		RULE_inici = 0, RULE_blocDeclaracioConstants = 1, RULE_variableConstants = 2, 
		RULE_tipusBasic = 3, RULE_valorTipusBasic = 4, RULE_valorEnter = 5, RULE_blocDeclaracioTipus = 6, 
		RULE_tipus = 7, RULE_tipusBasicVector = 8, RULE_tipusBasicTupla = 9, RULE_campTupla = 10, 
		RULE_blocAccionsFuncions = 11, RULE_declaracioFuncio = 12, RULE_parametres = 13, 
		RULE_parametre = 14, RULE_declaracioAccio = 15, RULE_programa = 16, RULE_blocDeclaracioVariables = 17, 
		RULE_variable = 18, RULE_ifThenElse = 19, RULE_expressio = 20, RULE_expressio2 = 21, 
		RULE_operadorsBooleans = 22, RULE_expressio3 = 23, RULE_expressio4 = 24, 
		RULE_expressio5 = 25, RULE_expressio6 = 26, RULE_valor = 27, RULE_accesTupla = 28, 
		RULE_accesVector = 29, RULE_cridaFuncio = 30, RULE_sentencia = 31, RULE_asignacio = 32, 
		RULE_condicional = 33, RULE_per = 34, RULE_mentre = 35, RULE_cridaAccio = 36, 
		RULE_llegir = 37, RULE_escriure = 38, RULE_escriureln = 39, RULE_blocImplementacio = 40, 
		RULE_implementacioAccio = 41, RULE_implementacioFuncio = 42;
	private static String[] makeRuleNames() {
		return new String[] {
			"inici", "blocDeclaracioConstants", "variableConstants", "tipusBasic", 
			"valorTipusBasic", "valorEnter", "blocDeclaracioTipus", "tipus", "tipusBasicVector", 
			"tipusBasicTupla", "campTupla", "blocAccionsFuncions", "declaracioFuncio", 
			"parametres", "parametre", "declaracioAccio", "programa", "blocDeclaracioVariables", 
			"variable", "ifThenElse", "expressio", "expressio2", "operadorsBooleans", 
			"expressio3", "expressio4", "expressio5", "expressio6", "valor", "accesTupla", 
			"accesVector", "cridaFuncio", "sentencia", "asignacio", "condicional", 
			"per", "mentre", "cridaAccio", "llegir", "escriure", "escriureln", "blocImplementacio", 
			"implementacioAccio", "implementacioFuncio"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "'('", "')'", "'['", "']'", "'*'", "'+'", "'-'", "'/'", 
			"'\\'", "'%'", "'~'", "'=='", "'!='", "';'", "','", "'.'", "'programa'", 
			"'fprograma'", "'periode'", "'per'", "'fper'", "'de'", "'fins'", "'fer'", 
			"'si'", "'fsi'", "'llavors'", "'altrament'", "'mentre'", "'fmentre'", 
			"'llegir'", "'escriure'", "'escriureln'", "'accio'", "'faccio'", "'funcio'", 
			"'ffuncio'", "'retorna'", "'ent'", "'entsor'", "'constants'", "'fconstants'", 
			"'tipus'", "'ftipus'", "'vector'", "'mida'", "'inici'", "'tupla'", "'ftupla'", 
			"'variables'", "'fvariables'", "'>'", "'<'", "'<='", "'>='", "'no'", 
			"'&'", "'|'", "'?'", "':'", "'enter'", "'real'", "'car'", "'boolea'", 
			"'data'", "':='", null, null, "'0'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "TK_WS", "TK_COMENTARI", "TK_LPAREN", "TK_RPAREN", "TK_OVECTOR", 
			"TK_TVECTOR", "TK_STAR", "TK_OP_PLUS", "TK_OP_MENYS", "TK_OP_DIVISIO_REAL", 
			"TK_OP_DIVISIO_ENTERA", "TK_OP_MODUL", "TK_OP_MENYS_UNARI", "TK_OP_IGUALTAT", 
			"TK_OP_DESIGUALTAT", "TK_SEMI", "TK_COMA", "TK_PUNT", "TK_PC_PROGRAMA", 
			"TK_PC_FPROGRAMA", "TK_PC_PERIODE", "TK_PC_PER", "TK_PC_FPER", "TK_PC_DE", 
			"TK_PC_FINS", "TK_PC_FER", "TK_PC_SI", "TK_PC_FSI", "TK_PC_LLAVORS", 
			"TK_PC_ALTRAMENT", "TK_PC_MENTRE", "TK_PC_FMENTRE", "TK_PC_LLEGIR", "TK_PC_ESCRIURE", 
			"TK_PC_ESCRIURELN", "TK_PC_ACCIO", "TK_PC_FACCIO", "TK_PC_FUNCIO", "TK_PC_FFUNCIO", 
			"TK_PC_RETORNA", "TK_PC_ENT", "TK_PC_ENTSOR", "TK_PC_CONSTANTS", "TK_PC_FCONSTANTS", 
			"TK_PC_TIPUS", "TK_PC_FTIPUS", "TK_PC_VECTOR", "TK_PC_MIDA", "TK_PC_INICI", 
			"TK_PC_TUPLA", "TK_PC_FTUPLA", "TK_PC_VARIABLES", "TK_PC_FVARIABLES", 
			"TK_MESGRAN", "TK_MESPETIT", "TK_MESPETIT_IGUAL", "TK_MESGRAN_IGUAL", 
			"TK_NEGACIO", "TK_AND", "TK_OR", "TK_INTERROGANT", "TK_DOSPUNTS", "TK_TB_ENTER", 
			"TK_TB_REAL", "TK_TB_CAR", "TK_TB_BOOLEA", "TK_TB_DATA", "TK_ASSIGNACIO", 
			"TK_BOOLEA", "TK_DATA", "TK_ZERO", "TK_ENTER", "TK_IDENT", "TK_REAL", 
			"TK_CAR", "TK_STRING"
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
	public String getGrammarFileName() { return "main.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public mainParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class IniciContext extends ParserRuleContext {
		public ProgramaContext programa() {
			return getRuleContext(ProgramaContext.class,0);
		}
		public BlocDeclaracioConstantsContext blocDeclaracioConstants() {
			return getRuleContext(BlocDeclaracioConstantsContext.class,0);
		}
		public BlocDeclaracioTipusContext blocDeclaracioTipus() {
			return getRuleContext(BlocDeclaracioTipusContext.class,0);
		}
		public BlocAccionsFuncionsContext blocAccionsFuncions() {
			return getRuleContext(BlocAccionsFuncionsContext.class,0);
		}
		public BlocImplementacioContext blocImplementacio() {
			return getRuleContext(BlocImplementacioContext.class,0);
		}
		public IniciContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inici; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mainListener ) ((mainListener)listener).enterInici(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mainListener ) ((mainListener)listener).exitInici(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mainVisitor ) return ((mainVisitor<? extends T>)visitor).visitInici(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IniciContext inici() throws RecognitionException {
		IniciContext _localctx = new IniciContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_inici);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TK_PC_CONSTANTS) {
				{
				setState(86);
				blocDeclaracioConstants();
				}
			}

			setState(90);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TK_PC_TIPUS) {
				{
				setState(89);
				blocDeclaracioTipus();
				}
			}

			setState(93);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(92);
				blocAccionsFuncions();
				}
				break;
			}
			setState(95);
			programa();
			setState(97);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(96);
				blocImplementacio();
				}
				break;
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

	public static class BlocDeclaracioConstantsContext extends ParserRuleContext {
		public TerminalNode TK_PC_CONSTANTS() { return getToken(mainParser.TK_PC_CONSTANTS, 0); }
		public TerminalNode TK_PC_FCONSTANTS() { return getToken(mainParser.TK_PC_FCONSTANTS, 0); }
		public List<VariableConstantsContext> variableConstants() {
			return getRuleContexts(VariableConstantsContext.class);
		}
		public VariableConstantsContext variableConstants(int i) {
			return getRuleContext(VariableConstantsContext.class,i);
		}
		public BlocDeclaracioConstantsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blocDeclaracioConstants; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mainListener ) ((mainListener)listener).enterBlocDeclaracioConstants(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mainListener ) ((mainListener)listener).exitBlocDeclaracioConstants(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mainVisitor ) return ((mainVisitor<? extends T>)visitor).visitBlocDeclaracioConstants(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlocDeclaracioConstantsContext blocDeclaracioConstants() throws RecognitionException {
		BlocDeclaracioConstantsContext _localctx = new BlocDeclaracioConstantsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_blocDeclaracioConstants);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			match(TK_PC_CONSTANTS);
			setState(103);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 63)) & ~0x3f) == 0 && ((1L << (_la - 63)) & ((1L << (TK_TB_ENTER - 63)) | (1L << (TK_TB_REAL - 63)) | (1L << (TK_TB_CAR - 63)) | (1L << (TK_TB_BOOLEA - 63)) | (1L << (TK_TB_DATA - 63)))) != 0)) {
				{
				{
				setState(100);
				variableConstants();
				}
				}
				setState(105);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(106);
			match(TK_PC_FCONSTANTS);
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

	public static class VariableConstantsContext extends ParserRuleContext {
		public TipusBasicContext tipusBasic() {
			return getRuleContext(TipusBasicContext.class,0);
		}
		public TerminalNode TK_IDENT() { return getToken(mainParser.TK_IDENT, 0); }
		public TerminalNode TK_ASSIGNACIO() { return getToken(mainParser.TK_ASSIGNACIO, 0); }
		public ValorTipusBasicContext valorTipusBasic() {
			return getRuleContext(ValorTipusBasicContext.class,0);
		}
		public TerminalNode TK_SEMI() { return getToken(mainParser.TK_SEMI, 0); }
		public VariableConstantsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableConstants; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mainListener ) ((mainListener)listener).enterVariableConstants(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mainListener ) ((mainListener)listener).exitVariableConstants(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mainVisitor ) return ((mainVisitor<? extends T>)visitor).visitVariableConstants(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableConstantsContext variableConstants() throws RecognitionException {
		VariableConstantsContext _localctx = new VariableConstantsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_variableConstants);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			tipusBasic();
			setState(109);
			match(TK_IDENT);
			setState(110);
			match(TK_ASSIGNACIO);
			setState(111);
			valorTipusBasic();
			setState(112);
			match(TK_SEMI);
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

	public static class TipusBasicContext extends ParserRuleContext {
		public TerminalNode TK_TB_BOOLEA() { return getToken(mainParser.TK_TB_BOOLEA, 0); }
		public TerminalNode TK_TB_REAL() { return getToken(mainParser.TK_TB_REAL, 0); }
		public TerminalNode TK_TB_ENTER() { return getToken(mainParser.TK_TB_ENTER, 0); }
		public TerminalNode TK_TB_CAR() { return getToken(mainParser.TK_TB_CAR, 0); }
		public TerminalNode TK_TB_DATA() { return getToken(mainParser.TK_TB_DATA, 0); }
		public TipusBasicContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipusBasic; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mainListener ) ((mainListener)listener).enterTipusBasic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mainListener ) ((mainListener)listener).exitTipusBasic(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mainVisitor ) return ((mainVisitor<? extends T>)visitor).visitTipusBasic(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TipusBasicContext tipusBasic() throws RecognitionException {
		TipusBasicContext _localctx = new TipusBasicContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_tipusBasic);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			_la = _input.LA(1);
			if ( !(((((_la - 63)) & ~0x3f) == 0 && ((1L << (_la - 63)) & ((1L << (TK_TB_ENTER - 63)) | (1L << (TK_TB_REAL - 63)) | (1L << (TK_TB_CAR - 63)) | (1L << (TK_TB_BOOLEA - 63)) | (1L << (TK_TB_DATA - 63)))) != 0)) ) {
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

	public static class ValorTipusBasicContext extends ParserRuleContext {
		public TerminalNode TK_BOOLEA() { return getToken(mainParser.TK_BOOLEA, 0); }
		public TerminalNode TK_DATA() { return getToken(mainParser.TK_DATA, 0); }
		public ValorEnterContext valorEnter() {
			return getRuleContext(ValorEnterContext.class,0);
		}
		public TerminalNode TK_REAL() { return getToken(mainParser.TK_REAL, 0); }
		public TerminalNode TK_CAR() { return getToken(mainParser.TK_CAR, 0); }
		public ValorTipusBasicContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valorTipusBasic; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mainListener ) ((mainListener)listener).enterValorTipusBasic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mainListener ) ((mainListener)listener).exitValorTipusBasic(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mainVisitor ) return ((mainVisitor<? extends T>)visitor).visitValorTipusBasic(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValorTipusBasicContext valorTipusBasic() throws RecognitionException {
		ValorTipusBasicContext _localctx = new ValorTipusBasicContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_valorTipusBasic);
		try {
			setState(121);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_BOOLEA:
				enterOuterAlt(_localctx, 1);
				{
				setState(116);
				match(TK_BOOLEA);
				}
				break;
			case TK_DATA:
				enterOuterAlt(_localctx, 2);
				{
				setState(117);
				match(TK_DATA);
				}
				break;
			case TK_ZERO:
			case TK_ENTER:
				enterOuterAlt(_localctx, 3);
				{
				setState(118);
				valorEnter();
				}
				break;
			case TK_REAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(119);
				match(TK_REAL);
				}
				break;
			case TK_CAR:
				enterOuterAlt(_localctx, 5);
				{
				setState(120);
				match(TK_CAR);
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

	public static class ValorEnterContext extends ParserRuleContext {
		public TerminalNode TK_ZERO() { return getToken(mainParser.TK_ZERO, 0); }
		public TerminalNode TK_ENTER() { return getToken(mainParser.TK_ENTER, 0); }
		public ValorEnterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valorEnter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mainListener ) ((mainListener)listener).enterValorEnter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mainListener ) ((mainListener)listener).exitValorEnter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mainVisitor ) return ((mainVisitor<? extends T>)visitor).visitValorEnter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValorEnterContext valorEnter() throws RecognitionException {
		ValorEnterContext _localctx = new ValorEnterContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_valorEnter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			_la = _input.LA(1);
			if ( !(_la==TK_ZERO || _la==TK_ENTER) ) {
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

	public static class BlocDeclaracioTipusContext extends ParserRuleContext {
		public TerminalNode TK_PC_TIPUS() { return getToken(mainParser.TK_PC_TIPUS, 0); }
		public TerminalNode TK_PC_FTIPUS() { return getToken(mainParser.TK_PC_FTIPUS, 0); }
		public List<TipusContext> tipus() {
			return getRuleContexts(TipusContext.class);
		}
		public TipusContext tipus(int i) {
			return getRuleContext(TipusContext.class,i);
		}
		public BlocDeclaracioTipusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blocDeclaracioTipus; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mainListener ) ((mainListener)listener).enterBlocDeclaracioTipus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mainListener ) ((mainListener)listener).exitBlocDeclaracioTipus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mainVisitor ) return ((mainVisitor<? extends T>)visitor).visitBlocDeclaracioTipus(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlocDeclaracioTipusContext blocDeclaracioTipus() throws RecognitionException {
		BlocDeclaracioTipusContext _localctx = new BlocDeclaracioTipusContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_blocDeclaracioTipus);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			match(TK_PC_TIPUS);
			setState(129);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TK_IDENT) {
				{
				{
				setState(126);
				tipus();
				}
				}
				setState(131);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(132);
			match(TK_PC_FTIPUS);
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

	public static class TipusContext extends ParserRuleContext {
		public TerminalNode TK_IDENT() { return getToken(mainParser.TK_IDENT, 0); }
		public TerminalNode TK_DOSPUNTS() { return getToken(mainParser.TK_DOSPUNTS, 0); }
		public TerminalNode TK_SEMI() { return getToken(mainParser.TK_SEMI, 0); }
		public TipusBasicContext tipusBasic() {
			return getRuleContext(TipusBasicContext.class,0);
		}
		public TipusBasicVectorContext tipusBasicVector() {
			return getRuleContext(TipusBasicVectorContext.class,0);
		}
		public TipusBasicTuplaContext tipusBasicTupla() {
			return getRuleContext(TipusBasicTuplaContext.class,0);
		}
		public TipusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipus; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mainListener ) ((mainListener)listener).enterTipus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mainListener ) ((mainListener)listener).exitTipus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mainVisitor ) return ((mainVisitor<? extends T>)visitor).visitTipus(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TipusContext tipus() throws RecognitionException {
		TipusContext _localctx = new TipusContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_tipus);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			match(TK_IDENT);
			setState(135);
			match(TK_DOSPUNTS);
			setState(139);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_TB_ENTER:
			case TK_TB_REAL:
			case TK_TB_CAR:
			case TK_TB_BOOLEA:
			case TK_TB_DATA:
				{
				setState(136);
				tipusBasic();
				}
				break;
			case TK_PC_VECTOR:
				{
				setState(137);
				tipusBasicVector();
				}
				break;
			case TK_PC_TUPLA:
				{
				setState(138);
				tipusBasicTupla();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(141);
			match(TK_SEMI);
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

	public static class TipusBasicVectorContext extends ParserRuleContext {
		public TerminalNode TK_PC_VECTOR() { return getToken(mainParser.TK_PC_VECTOR, 0); }
		public TipusBasicContext tipusBasic() {
			return getRuleContext(TipusBasicContext.class,0);
		}
		public TerminalNode TK_PC_MIDA() { return getToken(mainParser.TK_PC_MIDA, 0); }
		public List<ValorEnterContext> valorEnter() {
			return getRuleContexts(ValorEnterContext.class);
		}
		public ValorEnterContext valorEnter(int i) {
			return getRuleContext(ValorEnterContext.class,i);
		}
		public TerminalNode TK_PC_INICI() { return getToken(mainParser.TK_PC_INICI, 0); }
		public TipusBasicVectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipusBasicVector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mainListener ) ((mainListener)listener).enterTipusBasicVector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mainListener ) ((mainListener)listener).exitTipusBasicVector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mainVisitor ) return ((mainVisitor<? extends T>)visitor).visitTipusBasicVector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TipusBasicVectorContext tipusBasicVector() throws RecognitionException {
		TipusBasicVectorContext _localctx = new TipusBasicVectorContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_tipusBasicVector);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			match(TK_PC_VECTOR);
			setState(144);
			tipusBasic();
			setState(145);
			match(TK_PC_MIDA);
			setState(146);
			valorEnter();
			setState(149);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TK_PC_INICI) {
				{
				setState(147);
				match(TK_PC_INICI);
				setState(148);
				valorEnter();
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

	public static class TipusBasicTuplaContext extends ParserRuleContext {
		public TerminalNode TK_PC_TUPLA() { return getToken(mainParser.TK_PC_TUPLA, 0); }
		public TerminalNode TK_PC_FTUPLA() { return getToken(mainParser.TK_PC_FTUPLA, 0); }
		public List<CampTuplaContext> campTupla() {
			return getRuleContexts(CampTuplaContext.class);
		}
		public CampTuplaContext campTupla(int i) {
			return getRuleContext(CampTuplaContext.class,i);
		}
		public TipusBasicTuplaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipusBasicTupla; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mainListener ) ((mainListener)listener).enterTipusBasicTupla(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mainListener ) ((mainListener)listener).exitTipusBasicTupla(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mainVisitor ) return ((mainVisitor<? extends T>)visitor).visitTipusBasicTupla(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TipusBasicTuplaContext tipusBasicTupla() throws RecognitionException {
		TipusBasicTuplaContext _localctx = new TipusBasicTuplaContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_tipusBasicTupla);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			match(TK_PC_TUPLA);
			setState(153); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(152);
				campTupla();
				}
				}
				setState(155); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==TK_IDENT );
			setState(157);
			match(TK_PC_FTUPLA);
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

	public static class CampTuplaContext extends ParserRuleContext {
		public TerminalNode TK_IDENT() { return getToken(mainParser.TK_IDENT, 0); }
		public TerminalNode TK_DOSPUNTS() { return getToken(mainParser.TK_DOSPUNTS, 0); }
		public TipusBasicContext tipusBasic() {
			return getRuleContext(TipusBasicContext.class,0);
		}
		public TerminalNode TK_SEMI() { return getToken(mainParser.TK_SEMI, 0); }
		public CampTuplaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_campTupla; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mainListener ) ((mainListener)listener).enterCampTupla(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mainListener ) ((mainListener)listener).exitCampTupla(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mainVisitor ) return ((mainVisitor<? extends T>)visitor).visitCampTupla(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CampTuplaContext campTupla() throws RecognitionException {
		CampTuplaContext _localctx = new CampTuplaContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_campTupla);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			match(TK_IDENT);
			setState(160);
			match(TK_DOSPUNTS);
			setState(161);
			tipusBasic();
			setState(162);
			match(TK_SEMI);
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

	public static class BlocAccionsFuncionsContext extends ParserRuleContext {
		public List<DeclaracioFuncioContext> declaracioFuncio() {
			return getRuleContexts(DeclaracioFuncioContext.class);
		}
		public DeclaracioFuncioContext declaracioFuncio(int i) {
			return getRuleContext(DeclaracioFuncioContext.class,i);
		}
		public List<DeclaracioAccioContext> declaracioAccio() {
			return getRuleContexts(DeclaracioAccioContext.class);
		}
		public DeclaracioAccioContext declaracioAccio(int i) {
			return getRuleContext(DeclaracioAccioContext.class,i);
		}
		public BlocAccionsFuncionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blocAccionsFuncions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mainListener ) ((mainListener)listener).enterBlocAccionsFuncions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mainListener ) ((mainListener)listener).exitBlocAccionsFuncions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mainVisitor ) return ((mainVisitor<? extends T>)visitor).visitBlocAccionsFuncions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlocAccionsFuncionsContext blocAccionsFuncions() throws RecognitionException {
		BlocAccionsFuncionsContext _localctx = new BlocAccionsFuncionsContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_blocAccionsFuncions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TK_PC_ACCIO || _la==TK_PC_FUNCIO) {
				{
				setState(166);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case TK_PC_FUNCIO:
					{
					setState(164);
					declaracioFuncio();
					}
					break;
				case TK_PC_ACCIO:
					{
					setState(165);
					declaracioAccio();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(170);
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

	public static class DeclaracioFuncioContext extends ParserRuleContext {
		public TerminalNode TK_PC_FUNCIO() { return getToken(mainParser.TK_PC_FUNCIO, 0); }
		public TerminalNode TK_IDENT() { return getToken(mainParser.TK_IDENT, 0); }
		public TerminalNode TK_LPAREN() { return getToken(mainParser.TK_LPAREN, 0); }
		public TerminalNode TK_RPAREN() { return getToken(mainParser.TK_RPAREN, 0); }
		public TerminalNode TK_PC_RETORNA() { return getToken(mainParser.TK_PC_RETORNA, 0); }
		public TipusBasicContext tipusBasic() {
			return getRuleContext(TipusBasicContext.class,0);
		}
		public TerminalNode TK_SEMI() { return getToken(mainParser.TK_SEMI, 0); }
		public ParametresContext parametres() {
			return getRuleContext(ParametresContext.class,0);
		}
		public DeclaracioFuncioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracioFuncio; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mainListener ) ((mainListener)listener).enterDeclaracioFuncio(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mainListener ) ((mainListener)listener).exitDeclaracioFuncio(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mainVisitor ) return ((mainVisitor<? extends T>)visitor).visitDeclaracioFuncio(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracioFuncioContext declaracioFuncio() throws RecognitionException {
		DeclaracioFuncioContext _localctx = new DeclaracioFuncioContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_declaracioFuncio);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			match(TK_PC_FUNCIO);
			setState(172);
			match(TK_IDENT);
			setState(173);
			match(TK_LPAREN);
			setState(175);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 41)) & ~0x3f) == 0 && ((1L << (_la - 41)) & ((1L << (TK_PC_ENT - 41)) | (1L << (TK_PC_ENTSOR - 41)) | (1L << (TK_IDENT - 41)))) != 0)) {
				{
				setState(174);
				parametres();
				}
			}

			setState(177);
			match(TK_RPAREN);
			setState(178);
			match(TK_PC_RETORNA);
			setState(179);
			tipusBasic();
			setState(180);
			match(TK_SEMI);
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

	public static class ParametresContext extends ParserRuleContext {
		public List<ParametreContext> parametre() {
			return getRuleContexts(ParametreContext.class);
		}
		public ParametreContext parametre(int i) {
			return getRuleContext(ParametreContext.class,i);
		}
		public List<TerminalNode> TK_COMA() { return getTokens(mainParser.TK_COMA); }
		public TerminalNode TK_COMA(int i) {
			return getToken(mainParser.TK_COMA, i);
		}
		public ParametresContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametres; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mainListener ) ((mainListener)listener).enterParametres(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mainListener ) ((mainListener)listener).exitParametres(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mainVisitor ) return ((mainVisitor<? extends T>)visitor).visitParametres(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametresContext parametres() throws RecognitionException {
		ParametresContext _localctx = new ParametresContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_parametres);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			parametre();
			setState(187);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TK_COMA) {
				{
				{
				setState(183);
				match(TK_COMA);
				setState(184);
				parametre();
				}
				}
				setState(189);
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

	public static class ParametreContext extends ParserRuleContext {
		public List<TerminalNode> TK_IDENT() { return getTokens(mainParser.TK_IDENT); }
		public TerminalNode TK_IDENT(int i) {
			return getToken(mainParser.TK_IDENT, i);
		}
		public TerminalNode TK_DOSPUNTS() { return getToken(mainParser.TK_DOSPUNTS, 0); }
		public TipusBasicContext tipusBasic() {
			return getRuleContext(TipusBasicContext.class,0);
		}
		public TerminalNode TK_PC_ENT() { return getToken(mainParser.TK_PC_ENT, 0); }
		public TerminalNode TK_PC_ENTSOR() { return getToken(mainParser.TK_PC_ENTSOR, 0); }
		public ParametreContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametre; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mainListener ) ((mainListener)listener).enterParametre(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mainListener ) ((mainListener)listener).exitParametre(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mainVisitor ) return ((mainVisitor<? extends T>)visitor).visitParametre(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametreContext parametre() throws RecognitionException {
		ParametreContext _localctx = new ParametreContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_parametre);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TK_PC_ENT || _la==TK_PC_ENTSOR) {
				{
				setState(190);
				_la = _input.LA(1);
				if ( !(_la==TK_PC_ENT || _la==TK_PC_ENTSOR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(193);
			match(TK_IDENT);
			setState(194);
			match(TK_DOSPUNTS);
			setState(197);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_TB_ENTER:
			case TK_TB_REAL:
			case TK_TB_CAR:
			case TK_TB_BOOLEA:
			case TK_TB_DATA:
				{
				setState(195);
				tipusBasic();
				}
				break;
			case TK_IDENT:
				{
				setState(196);
				match(TK_IDENT);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class DeclaracioAccioContext extends ParserRuleContext {
		public TerminalNode TK_PC_ACCIO() { return getToken(mainParser.TK_PC_ACCIO, 0); }
		public TerminalNode TK_IDENT() { return getToken(mainParser.TK_IDENT, 0); }
		public TerminalNode TK_LPAREN() { return getToken(mainParser.TK_LPAREN, 0); }
		public TerminalNode TK_RPAREN() { return getToken(mainParser.TK_RPAREN, 0); }
		public TerminalNode TK_SEMI() { return getToken(mainParser.TK_SEMI, 0); }
		public ParametresContext parametres() {
			return getRuleContext(ParametresContext.class,0);
		}
		public DeclaracioAccioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracioAccio; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mainListener ) ((mainListener)listener).enterDeclaracioAccio(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mainListener ) ((mainListener)listener).exitDeclaracioAccio(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mainVisitor ) return ((mainVisitor<? extends T>)visitor).visitDeclaracioAccio(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracioAccioContext declaracioAccio() throws RecognitionException {
		DeclaracioAccioContext _localctx = new DeclaracioAccioContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_declaracioAccio);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			match(TK_PC_ACCIO);
			setState(200);
			match(TK_IDENT);
			setState(201);
			match(TK_LPAREN);
			setState(203);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 41)) & ~0x3f) == 0 && ((1L << (_la - 41)) & ((1L << (TK_PC_ENT - 41)) | (1L << (TK_PC_ENTSOR - 41)) | (1L << (TK_IDENT - 41)))) != 0)) {
				{
				setState(202);
				parametres();
				}
			}

			setState(205);
			match(TK_RPAREN);
			setState(206);
			match(TK_SEMI);
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

	public static class ProgramaContext extends ParserRuleContext {
		public TerminalNode TK_PC_PROGRAMA() { return getToken(mainParser.TK_PC_PROGRAMA, 0); }
		public TerminalNode TK_IDENT() { return getToken(mainParser.TK_IDENT, 0); }
		public TerminalNode TK_PC_FPROGRAMA() { return getToken(mainParser.TK_PC_FPROGRAMA, 0); }
		public BlocDeclaracioVariablesContext blocDeclaracioVariables() {
			return getRuleContext(BlocDeclaracioVariablesContext.class,0);
		}
		public List<SentenciaContext> sentencia() {
			return getRuleContexts(SentenciaContext.class);
		}
		public SentenciaContext sentencia(int i) {
			return getRuleContext(SentenciaContext.class,i);
		}
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mainListener ) ((mainListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mainListener ) ((mainListener)listener).exitPrograma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mainVisitor ) return ((mainVisitor<? extends T>)visitor).visitPrograma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_programa);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			match(TK_PC_PROGRAMA);
			setState(209);
			match(TK_IDENT);
			setState(211);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TK_PC_VARIABLES) {
				{
				setState(210);
				blocDeclaracioVariables();
				}
			}

			setState(216);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 22)) & ~0x3f) == 0 && ((1L << (_la - 22)) & ((1L << (TK_PC_PER - 22)) | (1L << (TK_PC_SI - 22)) | (1L << (TK_PC_MENTRE - 22)) | (1L << (TK_PC_LLEGIR - 22)) | (1L << (TK_PC_ESCRIURE - 22)) | (1L << (TK_PC_ESCRIURELN - 22)) | (1L << (TK_IDENT - 22)))) != 0)) {
				{
				{
				setState(213);
				sentencia();
				}
				}
				setState(218);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(219);
			match(TK_PC_FPROGRAMA);
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

	public static class BlocDeclaracioVariablesContext extends ParserRuleContext {
		public TerminalNode TK_PC_VARIABLES() { return getToken(mainParser.TK_PC_VARIABLES, 0); }
		public TerminalNode TK_PC_FVARIABLES() { return getToken(mainParser.TK_PC_FVARIABLES, 0); }
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public BlocDeclaracioVariablesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blocDeclaracioVariables; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mainListener ) ((mainListener)listener).enterBlocDeclaracioVariables(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mainListener ) ((mainListener)listener).exitBlocDeclaracioVariables(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mainVisitor ) return ((mainVisitor<? extends T>)visitor).visitBlocDeclaracioVariables(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlocDeclaracioVariablesContext blocDeclaracioVariables() throws RecognitionException {
		BlocDeclaracioVariablesContext _localctx = new BlocDeclaracioVariablesContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_blocDeclaracioVariables);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			match(TK_PC_VARIABLES);
			setState(225);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TK_IDENT) {
				{
				{
				setState(222);
				variable();
				}
				}
				setState(227);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(228);
			match(TK_PC_FVARIABLES);
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

	public static class VariableContext extends ParserRuleContext {
		public List<TerminalNode> TK_IDENT() { return getTokens(mainParser.TK_IDENT); }
		public TerminalNode TK_IDENT(int i) {
			return getToken(mainParser.TK_IDENT, i);
		}
		public TerminalNode TK_DOSPUNTS() { return getToken(mainParser.TK_DOSPUNTS, 0); }
		public TerminalNode TK_SEMI() { return getToken(mainParser.TK_SEMI, 0); }
		public TipusBasicContext tipusBasic() {
			return getRuleContext(TipusBasicContext.class,0);
		}
		public List<TerminalNode> TK_COMA() { return getTokens(mainParser.TK_COMA); }
		public TerminalNode TK_COMA(int i) {
			return getToken(mainParser.TK_COMA, i);
		}
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mainListener ) ((mainListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mainListener ) ((mainListener)listener).exitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mainVisitor ) return ((mainVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_variable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			match(TK_IDENT);
			setState(235);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TK_COMA) {
				{
				{
				setState(231);
				match(TK_COMA);
				setState(232);
				match(TK_IDENT);
				}
				}
				setState(237);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(238);
			match(TK_DOSPUNTS);
			setState(241);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_TB_ENTER:
			case TK_TB_REAL:
			case TK_TB_CAR:
			case TK_TB_BOOLEA:
			case TK_TB_DATA:
				{
				setState(239);
				tipusBasic();
				}
				break;
			case TK_IDENT:
				{
				setState(240);
				match(TK_IDENT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(243);
			match(TK_SEMI);
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

	public static class IfThenElseContext extends ParserRuleContext {
		public List<ExpressioContext> expressio() {
			return getRuleContexts(ExpressioContext.class);
		}
		public ExpressioContext expressio(int i) {
			return getRuleContext(ExpressioContext.class,i);
		}
		public TerminalNode TK_INTERROGANT() { return getToken(mainParser.TK_INTERROGANT, 0); }
		public TerminalNode TK_DOSPUNTS() { return getToken(mainParser.TK_DOSPUNTS, 0); }
		public IfThenElseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifThenElse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mainListener ) ((mainListener)listener).enterIfThenElse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mainListener ) ((mainListener)listener).exitIfThenElse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mainVisitor ) return ((mainVisitor<? extends T>)visitor).visitIfThenElse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfThenElseContext ifThenElse() throws RecognitionException {
		IfThenElseContext _localctx = new IfThenElseContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_ifThenElse);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
			expressio();
			setState(246);
			match(TK_INTERROGANT);
			setState(247);
			expressio();
			setState(248);
			match(TK_DOSPUNTS);
			setState(249);
			expressio();
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

	public static class ExpressioContext extends ParserRuleContext {
		public List<Expressio2Context> expressio2() {
			return getRuleContexts(Expressio2Context.class);
		}
		public Expressio2Context expressio2(int i) {
			return getRuleContext(Expressio2Context.class,i);
		}
		public List<TerminalNode> TK_AND() { return getTokens(mainParser.TK_AND); }
		public TerminalNode TK_AND(int i) {
			return getToken(mainParser.TK_AND, i);
		}
		public List<TerminalNode> TK_OR() { return getTokens(mainParser.TK_OR); }
		public TerminalNode TK_OR(int i) {
			return getToken(mainParser.TK_OR, i);
		}
		public ExpressioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressio; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mainListener ) ((mainListener)listener).enterExpressio(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mainListener ) ((mainListener)listener).exitExpressio(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mainVisitor ) return ((mainVisitor<? extends T>)visitor).visitExpressio(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressioContext expressio() throws RecognitionException {
		ExpressioContext _localctx = new ExpressioContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_expressio);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(251);
			expressio2();
			setState(256);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TK_AND || _la==TK_OR) {
				{
				{
				setState(252);
				_la = _input.LA(1);
				if ( !(_la==TK_AND || _la==TK_OR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(253);
				expressio2();
				}
				}
				setState(258);
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

	public static class Expressio2Context extends ParserRuleContext {
		public List<Expressio3Context> expressio3() {
			return getRuleContexts(Expressio3Context.class);
		}
		public Expressio3Context expressio3(int i) {
			return getRuleContext(Expressio3Context.class,i);
		}
		public List<OperadorsBooleansContext> operadorsBooleans() {
			return getRuleContexts(OperadorsBooleansContext.class);
		}
		public OperadorsBooleansContext operadorsBooleans(int i) {
			return getRuleContext(OperadorsBooleansContext.class,i);
		}
		public Expressio2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressio2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mainListener ) ((mainListener)listener).enterExpressio2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mainListener ) ((mainListener)listener).exitExpressio2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mainVisitor ) return ((mainVisitor<? extends T>)visitor).visitExpressio2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expressio2Context expressio2() throws RecognitionException {
		Expressio2Context _localctx = new Expressio2Context(_ctx, getState());
		enterRule(_localctx, 42, RULE_expressio2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
			expressio3();
			setState(265);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TK_OP_IGUALTAT) | (1L << TK_OP_DESIGUALTAT) | (1L << TK_MESGRAN) | (1L << TK_MESPETIT) | (1L << TK_MESPETIT_IGUAL) | (1L << TK_MESGRAN_IGUAL))) != 0)) {
				{
				{
				setState(260);
				operadorsBooleans();
				setState(261);
				expressio3();
				}
				}
				setState(267);
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

	public static class OperadorsBooleansContext extends ParserRuleContext {
		public TerminalNode TK_OP_IGUALTAT() { return getToken(mainParser.TK_OP_IGUALTAT, 0); }
		public TerminalNode TK_OP_DESIGUALTAT() { return getToken(mainParser.TK_OP_DESIGUALTAT, 0); }
		public TerminalNode TK_MESPETIT() { return getToken(mainParser.TK_MESPETIT, 0); }
		public TerminalNode TK_MESPETIT_IGUAL() { return getToken(mainParser.TK_MESPETIT_IGUAL, 0); }
		public TerminalNode TK_MESGRAN() { return getToken(mainParser.TK_MESGRAN, 0); }
		public TerminalNode TK_MESGRAN_IGUAL() { return getToken(mainParser.TK_MESGRAN_IGUAL, 0); }
		public OperadorsBooleansContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operadorsBooleans; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mainListener ) ((mainListener)listener).enterOperadorsBooleans(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mainListener ) ((mainListener)listener).exitOperadorsBooleans(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mainVisitor ) return ((mainVisitor<? extends T>)visitor).visitOperadorsBooleans(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperadorsBooleansContext operadorsBooleans() throws RecognitionException {
		OperadorsBooleansContext _localctx = new OperadorsBooleansContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_operadorsBooleans);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TK_OP_IGUALTAT) | (1L << TK_OP_DESIGUALTAT) | (1L << TK_MESGRAN) | (1L << TK_MESPETIT) | (1L << TK_MESPETIT_IGUAL) | (1L << TK_MESGRAN_IGUAL))) != 0)) ) {
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

	public static class Expressio3Context extends ParserRuleContext {
		public List<Expressio4Context> expressio4() {
			return getRuleContexts(Expressio4Context.class);
		}
		public Expressio4Context expressio4(int i) {
			return getRuleContext(Expressio4Context.class,i);
		}
		public List<TerminalNode> TK_OP_PLUS() { return getTokens(mainParser.TK_OP_PLUS); }
		public TerminalNode TK_OP_PLUS(int i) {
			return getToken(mainParser.TK_OP_PLUS, i);
		}
		public List<TerminalNode> TK_OP_MENYS() { return getTokens(mainParser.TK_OP_MENYS); }
		public TerminalNode TK_OP_MENYS(int i) {
			return getToken(mainParser.TK_OP_MENYS, i);
		}
		public Expressio3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressio3; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mainListener ) ((mainListener)listener).enterExpressio3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mainListener ) ((mainListener)listener).exitExpressio3(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mainVisitor ) return ((mainVisitor<? extends T>)visitor).visitExpressio3(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expressio3Context expressio3() throws RecognitionException {
		Expressio3Context _localctx = new Expressio3Context(_ctx, getState());
		enterRule(_localctx, 46, RULE_expressio3);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(270);
			expressio4();
			setState(275);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TK_OP_PLUS || _la==TK_OP_MENYS) {
				{
				{
				setState(271);
				_la = _input.LA(1);
				if ( !(_la==TK_OP_PLUS || _la==TK_OP_MENYS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(272);
				expressio4();
				}
				}
				setState(277);
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

	public static class Expressio4Context extends ParserRuleContext {
		public List<Expressio5Context> expressio5() {
			return getRuleContexts(Expressio5Context.class);
		}
		public Expressio5Context expressio5(int i) {
			return getRuleContext(Expressio5Context.class,i);
		}
		public List<TerminalNode> TK_STAR() { return getTokens(mainParser.TK_STAR); }
		public TerminalNode TK_STAR(int i) {
			return getToken(mainParser.TK_STAR, i);
		}
		public List<TerminalNode> TK_OP_DIVISIO_REAL() { return getTokens(mainParser.TK_OP_DIVISIO_REAL); }
		public TerminalNode TK_OP_DIVISIO_REAL(int i) {
			return getToken(mainParser.TK_OP_DIVISIO_REAL, i);
		}
		public List<TerminalNode> TK_OP_DIVISIO_ENTERA() { return getTokens(mainParser.TK_OP_DIVISIO_ENTERA); }
		public TerminalNode TK_OP_DIVISIO_ENTERA(int i) {
			return getToken(mainParser.TK_OP_DIVISIO_ENTERA, i);
		}
		public List<TerminalNode> TK_OP_MODUL() { return getTokens(mainParser.TK_OP_MODUL); }
		public TerminalNode TK_OP_MODUL(int i) {
			return getToken(mainParser.TK_OP_MODUL, i);
		}
		public Expressio4Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressio4; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mainListener ) ((mainListener)listener).enterExpressio4(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mainListener ) ((mainListener)listener).exitExpressio4(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mainVisitor ) return ((mainVisitor<? extends T>)visitor).visitExpressio4(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expressio4Context expressio4() throws RecognitionException {
		Expressio4Context _localctx = new Expressio4Context(_ctx, getState());
		enterRule(_localctx, 48, RULE_expressio4);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
			expressio5();
			setState(283);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TK_STAR) | (1L << TK_OP_DIVISIO_REAL) | (1L << TK_OP_DIVISIO_ENTERA) | (1L << TK_OP_MODUL))) != 0)) {
				{
				{
				setState(279);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TK_STAR) | (1L << TK_OP_DIVISIO_REAL) | (1L << TK_OP_DIVISIO_ENTERA) | (1L << TK_OP_MODUL))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(280);
				expressio5();
				}
				}
				setState(285);
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

	public static class Expressio5Context extends ParserRuleContext {
		public Expressio6Context expressio6() {
			return getRuleContext(Expressio6Context.class,0);
		}
		public TerminalNode TK_NEGACIO() { return getToken(mainParser.TK_NEGACIO, 0); }
		public TerminalNode TK_OP_MENYS_UNARI() { return getToken(mainParser.TK_OP_MENYS_UNARI, 0); }
		public Expressio5Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressio5; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mainListener ) ((mainListener)listener).enterExpressio5(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mainListener ) ((mainListener)listener).exitExpressio5(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mainVisitor ) return ((mainVisitor<? extends T>)visitor).visitExpressio5(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expressio5Context expressio5() throws RecognitionException {
		Expressio5Context _localctx = new Expressio5Context(_ctx, getState());
		enterRule(_localctx, 50, RULE_expressio5);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(287);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TK_OP_MENYS_UNARI || _la==TK_NEGACIO) {
				{
				setState(286);
				_la = _input.LA(1);
				if ( !(_la==TK_OP_MENYS_UNARI || _la==TK_NEGACIO) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(289);
			expressio6();
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

	public static class Expressio6Context extends ParserRuleContext {
		public ValorContext valor() {
			return getRuleContext(ValorContext.class,0);
		}
		public TerminalNode TK_LPAREN() { return getToken(mainParser.TK_LPAREN, 0); }
		public ExpressioContext expressio() {
			return getRuleContext(ExpressioContext.class,0);
		}
		public TerminalNode TK_RPAREN() { return getToken(mainParser.TK_RPAREN, 0); }
		public Expressio6Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressio6; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mainListener ) ((mainListener)listener).enterExpressio6(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mainListener ) ((mainListener)listener).exitExpressio6(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mainVisitor ) return ((mainVisitor<? extends T>)visitor).visitExpressio6(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expressio6Context expressio6() throws RecognitionException {
		Expressio6Context _localctx = new Expressio6Context(_ctx, getState());
		enterRule(_localctx, 52, RULE_expressio6);
		try {
			setState(296);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_BOOLEA:
			case TK_DATA:
			case TK_ZERO:
			case TK_ENTER:
			case TK_IDENT:
			case TK_REAL:
			case TK_CAR:
			case TK_STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(291);
				valor();
				}
				break;
			case TK_LPAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(292);
				match(TK_LPAREN);
				setState(293);
				expressio();
				setState(294);
				match(TK_RPAREN);
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

	public static class ValorContext extends ParserRuleContext {
		public ValorTipusBasicContext valorTipusBasic() {
			return getRuleContext(ValorTipusBasicContext.class,0);
		}
		public TerminalNode TK_STRING() { return getToken(mainParser.TK_STRING, 0); }
		public TerminalNode TK_IDENT() { return getToken(mainParser.TK_IDENT, 0); }
		public AccesTuplaContext accesTupla() {
			return getRuleContext(AccesTuplaContext.class,0);
		}
		public AccesVectorContext accesVector() {
			return getRuleContext(AccesVectorContext.class,0);
		}
		public CridaFuncioContext cridaFuncio() {
			return getRuleContext(CridaFuncioContext.class,0);
		}
		public ValorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mainListener ) ((mainListener)listener).enterValor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mainListener ) ((mainListener)listener).exitValor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mainVisitor ) return ((mainVisitor<? extends T>)visitor).visitValor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValorContext valor() throws RecognitionException {
		ValorContext _localctx = new ValorContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_valor);
		try {
			setState(304);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(298);
				valorTipusBasic();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(299);
				match(TK_STRING);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(300);
				match(TK_IDENT);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(301);
				accesTupla();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(302);
				accesVector();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(303);
				cridaFuncio();
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

	public static class AccesTuplaContext extends ParserRuleContext {
		public List<TerminalNode> TK_IDENT() { return getTokens(mainParser.TK_IDENT); }
		public TerminalNode TK_IDENT(int i) {
			return getToken(mainParser.TK_IDENT, i);
		}
		public TerminalNode TK_PUNT() { return getToken(mainParser.TK_PUNT, 0); }
		public AccesTuplaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_accesTupla; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mainListener ) ((mainListener)listener).enterAccesTupla(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mainListener ) ((mainListener)listener).exitAccesTupla(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mainVisitor ) return ((mainVisitor<? extends T>)visitor).visitAccesTupla(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AccesTuplaContext accesTupla() throws RecognitionException {
		AccesTuplaContext _localctx = new AccesTuplaContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_accesTupla);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(306);
			match(TK_IDENT);
			setState(307);
			match(TK_PUNT);
			setState(308);
			match(TK_IDENT);
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

	public static class AccesVectorContext extends ParserRuleContext {
		public TerminalNode TK_IDENT() { return getToken(mainParser.TK_IDENT, 0); }
		public TerminalNode TK_OVECTOR() { return getToken(mainParser.TK_OVECTOR, 0); }
		public ExpressioContext expressio() {
			return getRuleContext(ExpressioContext.class,0);
		}
		public TerminalNode TK_TVECTOR() { return getToken(mainParser.TK_TVECTOR, 0); }
		public AccesVectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_accesVector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mainListener ) ((mainListener)listener).enterAccesVector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mainListener ) ((mainListener)listener).exitAccesVector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mainVisitor ) return ((mainVisitor<? extends T>)visitor).visitAccesVector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AccesVectorContext accesVector() throws RecognitionException {
		AccesVectorContext _localctx = new AccesVectorContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_accesVector);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(310);
			match(TK_IDENT);
			setState(311);
			match(TK_OVECTOR);
			setState(312);
			expressio();
			setState(313);
			match(TK_TVECTOR);
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

	public static class CridaFuncioContext extends ParserRuleContext {
		public TerminalNode TK_IDENT() { return getToken(mainParser.TK_IDENT, 0); }
		public TerminalNode TK_LPAREN() { return getToken(mainParser.TK_LPAREN, 0); }
		public TerminalNode TK_RPAREN() { return getToken(mainParser.TK_RPAREN, 0); }
		public List<ExpressioContext> expressio() {
			return getRuleContexts(ExpressioContext.class);
		}
		public ExpressioContext expressio(int i) {
			return getRuleContext(ExpressioContext.class,i);
		}
		public List<TerminalNode> TK_COMA() { return getTokens(mainParser.TK_COMA); }
		public TerminalNode TK_COMA(int i) {
			return getToken(mainParser.TK_COMA, i);
		}
		public CridaFuncioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cridaFuncio; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mainListener ) ((mainListener)listener).enterCridaFuncio(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mainListener ) ((mainListener)listener).exitCridaFuncio(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mainVisitor ) return ((mainVisitor<? extends T>)visitor).visitCridaFuncio(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CridaFuncioContext cridaFuncio() throws RecognitionException {
		CridaFuncioContext _localctx = new CridaFuncioContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_cridaFuncio);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(315);
			match(TK_IDENT);
			setState(316);
			match(TK_LPAREN);
			setState(325);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TK_LPAREN) | (1L << TK_OP_MENYS_UNARI) | (1L << TK_NEGACIO))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (TK_BOOLEA - 69)) | (1L << (TK_DATA - 69)) | (1L << (TK_ZERO - 69)) | (1L << (TK_ENTER - 69)) | (1L << (TK_IDENT - 69)) | (1L << (TK_REAL - 69)) | (1L << (TK_CAR - 69)) | (1L << (TK_STRING - 69)))) != 0)) {
				{
				setState(317);
				expressio();
				setState(322);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TK_COMA) {
					{
					{
					setState(318);
					match(TK_COMA);
					setState(319);
					expressio();
					}
					}
					setState(324);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(327);
			match(TK_RPAREN);
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

	public static class SentenciaContext extends ParserRuleContext {
		public AsignacioContext asignacio() {
			return getRuleContext(AsignacioContext.class,0);
		}
		public CondicionalContext condicional() {
			return getRuleContext(CondicionalContext.class,0);
		}
		public PerContext per() {
			return getRuleContext(PerContext.class,0);
		}
		public MentreContext mentre() {
			return getRuleContext(MentreContext.class,0);
		}
		public CridaAccioContext cridaAccio() {
			return getRuleContext(CridaAccioContext.class,0);
		}
		public LlegirContext llegir() {
			return getRuleContext(LlegirContext.class,0);
		}
		public EscriureContext escriure() {
			return getRuleContext(EscriureContext.class,0);
		}
		public EscriurelnContext escriureln() {
			return getRuleContext(EscriurelnContext.class,0);
		}
		public SentenciaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentencia; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mainListener ) ((mainListener)listener).enterSentencia(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mainListener ) ((mainListener)listener).exitSentencia(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mainVisitor ) return ((mainVisitor<? extends T>)visitor).visitSentencia(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SentenciaContext sentencia() throws RecognitionException {
		SentenciaContext _localctx = new SentenciaContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_sentencia);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(337);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				{
				setState(329);
				asignacio();
				}
				break;
			case 2:
				{
				setState(330);
				condicional();
				}
				break;
			case 3:
				{
				setState(331);
				per();
				}
				break;
			case 4:
				{
				setState(332);
				mentre();
				}
				break;
			case 5:
				{
				setState(333);
				cridaAccio();
				}
				break;
			case 6:
				{
				setState(334);
				llegir();
				}
				break;
			case 7:
				{
				setState(335);
				escriure();
				}
				break;
			case 8:
				{
				setState(336);
				escriureln();
				}
				break;
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

	public static class AsignacioContext extends ParserRuleContext {
		public TerminalNode TK_ASSIGNACIO() { return getToken(mainParser.TK_ASSIGNACIO, 0); }
		public ExpressioContext expressio() {
			return getRuleContext(ExpressioContext.class,0);
		}
		public TerminalNode TK_SEMI() { return getToken(mainParser.TK_SEMI, 0); }
		public TerminalNode TK_IDENT() { return getToken(mainParser.TK_IDENT, 0); }
		public AccesTuplaContext accesTupla() {
			return getRuleContext(AccesTuplaContext.class,0);
		}
		public AccesVectorContext accesVector() {
			return getRuleContext(AccesVectorContext.class,0);
		}
		public AsignacioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignacio; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mainListener ) ((mainListener)listener).enterAsignacio(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mainListener ) ((mainListener)listener).exitAsignacio(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mainVisitor ) return ((mainVisitor<? extends T>)visitor).visitAsignacio(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AsignacioContext asignacio() throws RecognitionException {
		AsignacioContext _localctx = new AsignacioContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_asignacio);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(342);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				{
				setState(339);
				match(TK_IDENT);
				}
				break;
			case 2:
				{
				setState(340);
				accesTupla();
				}
				break;
			case 3:
				{
				setState(341);
				accesVector();
				}
				break;
			}
			setState(344);
			match(TK_ASSIGNACIO);
			setState(345);
			expressio();
			setState(346);
			match(TK_SEMI);
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

	public static class CondicionalContext extends ParserRuleContext {
		public TerminalNode TK_PC_SI() { return getToken(mainParser.TK_PC_SI, 0); }
		public ExpressioContext expressio() {
			return getRuleContext(ExpressioContext.class,0);
		}
		public TerminalNode TK_PC_LLAVORS() { return getToken(mainParser.TK_PC_LLAVORS, 0); }
		public TerminalNode TK_PC_FSI() { return getToken(mainParser.TK_PC_FSI, 0); }
		public List<SentenciaContext> sentencia() {
			return getRuleContexts(SentenciaContext.class);
		}
		public SentenciaContext sentencia(int i) {
			return getRuleContext(SentenciaContext.class,i);
		}
		public TerminalNode TK_PC_ALTRAMENT() { return getToken(mainParser.TK_PC_ALTRAMENT, 0); }
		public CondicionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mainListener ) ((mainListener)listener).enterCondicional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mainListener ) ((mainListener)listener).exitCondicional(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mainVisitor ) return ((mainVisitor<? extends T>)visitor).visitCondicional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondicionalContext condicional() throws RecognitionException {
		CondicionalContext _localctx = new CondicionalContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_condicional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(348);
			match(TK_PC_SI);
			setState(349);
			expressio();
			setState(350);
			match(TK_PC_LLAVORS);
			setState(354);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 22)) & ~0x3f) == 0 && ((1L << (_la - 22)) & ((1L << (TK_PC_PER - 22)) | (1L << (TK_PC_SI - 22)) | (1L << (TK_PC_MENTRE - 22)) | (1L << (TK_PC_LLEGIR - 22)) | (1L << (TK_PC_ESCRIURE - 22)) | (1L << (TK_PC_ESCRIURELN - 22)) | (1L << (TK_IDENT - 22)))) != 0)) {
				{
				{
				setState(351);
				sentencia();
				}
				}
				setState(356);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(364);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TK_PC_ALTRAMENT) {
				{
				setState(357);
				match(TK_PC_ALTRAMENT);
				setState(361);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 22)) & ~0x3f) == 0 && ((1L << (_la - 22)) & ((1L << (TK_PC_PER - 22)) | (1L << (TK_PC_SI - 22)) | (1L << (TK_PC_MENTRE - 22)) | (1L << (TK_PC_LLEGIR - 22)) | (1L << (TK_PC_ESCRIURE - 22)) | (1L << (TK_PC_ESCRIURELN - 22)) | (1L << (TK_IDENT - 22)))) != 0)) {
					{
					{
					setState(358);
					sentencia();
					}
					}
					setState(363);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(366);
			match(TK_PC_FSI);
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

	public static class PerContext extends ParserRuleContext {
		public TerminalNode TK_PC_PER() { return getToken(mainParser.TK_PC_PER, 0); }
		public TerminalNode TK_IDENT() { return getToken(mainParser.TK_IDENT, 0); }
		public TerminalNode TK_PC_DE() { return getToken(mainParser.TK_PC_DE, 0); }
		public List<ExpressioContext> expressio() {
			return getRuleContexts(ExpressioContext.class);
		}
		public ExpressioContext expressio(int i) {
			return getRuleContext(ExpressioContext.class,i);
		}
		public TerminalNode TK_PC_FINS() { return getToken(mainParser.TK_PC_FINS, 0); }
		public TerminalNode TK_PC_FER() { return getToken(mainParser.TK_PC_FER, 0); }
		public TerminalNode TK_PC_FPER() { return getToken(mainParser.TK_PC_FPER, 0); }
		public List<SentenciaContext> sentencia() {
			return getRuleContexts(SentenciaContext.class);
		}
		public SentenciaContext sentencia(int i) {
			return getRuleContext(SentenciaContext.class,i);
		}
		public PerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_per; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mainListener ) ((mainListener)listener).enterPer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mainListener ) ((mainListener)listener).exitPer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mainVisitor ) return ((mainVisitor<? extends T>)visitor).visitPer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PerContext per() throws RecognitionException {
		PerContext _localctx = new PerContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_per);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(368);
			match(TK_PC_PER);
			setState(369);
			match(TK_IDENT);
			setState(370);
			match(TK_PC_DE);
			setState(371);
			expressio();
			setState(372);
			match(TK_PC_FINS);
			setState(373);
			expressio();
			setState(374);
			match(TK_PC_FER);
			setState(378);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 22)) & ~0x3f) == 0 && ((1L << (_la - 22)) & ((1L << (TK_PC_PER - 22)) | (1L << (TK_PC_SI - 22)) | (1L << (TK_PC_MENTRE - 22)) | (1L << (TK_PC_LLEGIR - 22)) | (1L << (TK_PC_ESCRIURE - 22)) | (1L << (TK_PC_ESCRIURELN - 22)) | (1L << (TK_IDENT - 22)))) != 0)) {
				{
				{
				setState(375);
				sentencia();
				}
				}
				setState(380);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(381);
			match(TK_PC_FPER);
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

	public static class MentreContext extends ParserRuleContext {
		public TerminalNode TK_PC_MENTRE() { return getToken(mainParser.TK_PC_MENTRE, 0); }
		public ExpressioContext expressio() {
			return getRuleContext(ExpressioContext.class,0);
		}
		public TerminalNode TK_PC_FER() { return getToken(mainParser.TK_PC_FER, 0); }
		public TerminalNode TK_PC_FMENTRE() { return getToken(mainParser.TK_PC_FMENTRE, 0); }
		public List<SentenciaContext> sentencia() {
			return getRuleContexts(SentenciaContext.class);
		}
		public SentenciaContext sentencia(int i) {
			return getRuleContext(SentenciaContext.class,i);
		}
		public MentreContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mentre; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mainListener ) ((mainListener)listener).enterMentre(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mainListener ) ((mainListener)listener).exitMentre(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mainVisitor ) return ((mainVisitor<? extends T>)visitor).visitMentre(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MentreContext mentre() throws RecognitionException {
		MentreContext _localctx = new MentreContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_mentre);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(383);
			match(TK_PC_MENTRE);
			setState(384);
			expressio();
			setState(385);
			match(TK_PC_FER);
			setState(389);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 22)) & ~0x3f) == 0 && ((1L << (_la - 22)) & ((1L << (TK_PC_PER - 22)) | (1L << (TK_PC_SI - 22)) | (1L << (TK_PC_MENTRE - 22)) | (1L << (TK_PC_LLEGIR - 22)) | (1L << (TK_PC_ESCRIURE - 22)) | (1L << (TK_PC_ESCRIURELN - 22)) | (1L << (TK_IDENT - 22)))) != 0)) {
				{
				{
				setState(386);
				sentencia();
				}
				}
				setState(391);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(392);
			match(TK_PC_FMENTRE);
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

	public static class CridaAccioContext extends ParserRuleContext {
		public TerminalNode TK_IDENT() { return getToken(mainParser.TK_IDENT, 0); }
		public TerminalNode TK_LPAREN() { return getToken(mainParser.TK_LPAREN, 0); }
		public TerminalNode TK_RPAREN() { return getToken(mainParser.TK_RPAREN, 0); }
		public TerminalNode TK_SEMI() { return getToken(mainParser.TK_SEMI, 0); }
		public List<ExpressioContext> expressio() {
			return getRuleContexts(ExpressioContext.class);
		}
		public ExpressioContext expressio(int i) {
			return getRuleContext(ExpressioContext.class,i);
		}
		public List<TerminalNode> TK_COMA() { return getTokens(mainParser.TK_COMA); }
		public TerminalNode TK_COMA(int i) {
			return getToken(mainParser.TK_COMA, i);
		}
		public CridaAccioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cridaAccio; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mainListener ) ((mainListener)listener).enterCridaAccio(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mainListener ) ((mainListener)listener).exitCridaAccio(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mainVisitor ) return ((mainVisitor<? extends T>)visitor).visitCridaAccio(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CridaAccioContext cridaAccio() throws RecognitionException {
		CridaAccioContext _localctx = new CridaAccioContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_cridaAccio);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(394);
			match(TK_IDENT);
			setState(395);
			match(TK_LPAREN);
			setState(404);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TK_LPAREN) | (1L << TK_OP_MENYS_UNARI) | (1L << TK_NEGACIO))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (TK_BOOLEA - 69)) | (1L << (TK_DATA - 69)) | (1L << (TK_ZERO - 69)) | (1L << (TK_ENTER - 69)) | (1L << (TK_IDENT - 69)) | (1L << (TK_REAL - 69)) | (1L << (TK_CAR - 69)) | (1L << (TK_STRING - 69)))) != 0)) {
				{
				setState(396);
				expressio();
				setState(401);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TK_COMA) {
					{
					{
					setState(397);
					match(TK_COMA);
					setState(398);
					expressio();
					}
					}
					setState(403);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(406);
			match(TK_RPAREN);
			setState(407);
			match(TK_SEMI);
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

	public static class LlegirContext extends ParserRuleContext {
		public TerminalNode TK_PC_LLEGIR() { return getToken(mainParser.TK_PC_LLEGIR, 0); }
		public TerminalNode TK_LPAREN() { return getToken(mainParser.TK_LPAREN, 0); }
		public TerminalNode TK_IDENT() { return getToken(mainParser.TK_IDENT, 0); }
		public TerminalNode TK_RPAREN() { return getToken(mainParser.TK_RPAREN, 0); }
		public TerminalNode TK_SEMI() { return getToken(mainParser.TK_SEMI, 0); }
		public LlegirContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_llegir; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mainListener ) ((mainListener)listener).enterLlegir(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mainListener ) ((mainListener)listener).exitLlegir(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mainVisitor ) return ((mainVisitor<? extends T>)visitor).visitLlegir(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LlegirContext llegir() throws RecognitionException {
		LlegirContext _localctx = new LlegirContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_llegir);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(409);
			match(TK_PC_LLEGIR);
			setState(410);
			match(TK_LPAREN);
			setState(411);
			match(TK_IDENT);
			setState(412);
			match(TK_RPAREN);
			setState(413);
			match(TK_SEMI);
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

	public static class EscriureContext extends ParserRuleContext {
		public TerminalNode TK_PC_ESCRIURE() { return getToken(mainParser.TK_PC_ESCRIURE, 0); }
		public TerminalNode TK_LPAREN() { return getToken(mainParser.TK_LPAREN, 0); }
		public List<ExpressioContext> expressio() {
			return getRuleContexts(ExpressioContext.class);
		}
		public ExpressioContext expressio(int i) {
			return getRuleContext(ExpressioContext.class,i);
		}
		public TerminalNode TK_RPAREN() { return getToken(mainParser.TK_RPAREN, 0); }
		public TerminalNode TK_SEMI() { return getToken(mainParser.TK_SEMI, 0); }
		public List<TerminalNode> TK_COMA() { return getTokens(mainParser.TK_COMA); }
		public TerminalNode TK_COMA(int i) {
			return getToken(mainParser.TK_COMA, i);
		}
		public EscriureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_escriure; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mainListener ) ((mainListener)listener).enterEscriure(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mainListener ) ((mainListener)listener).exitEscriure(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mainVisitor ) return ((mainVisitor<? extends T>)visitor).visitEscriure(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EscriureContext escriure() throws RecognitionException {
		EscriureContext _localctx = new EscriureContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_escriure);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(415);
			match(TK_PC_ESCRIURE);
			setState(416);
			match(TK_LPAREN);
			setState(417);
			expressio();
			setState(422);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TK_COMA) {
				{
				{
				setState(418);
				match(TK_COMA);
				setState(419);
				expressio();
				}
				}
				setState(424);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(425);
			match(TK_RPAREN);
			setState(426);
			match(TK_SEMI);
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

	public static class EscriurelnContext extends ParserRuleContext {
		public TerminalNode TK_PC_ESCRIURELN() { return getToken(mainParser.TK_PC_ESCRIURELN, 0); }
		public TerminalNode TK_LPAREN() { return getToken(mainParser.TK_LPAREN, 0); }
		public TerminalNode TK_RPAREN() { return getToken(mainParser.TK_RPAREN, 0); }
		public TerminalNode TK_SEMI() { return getToken(mainParser.TK_SEMI, 0); }
		public List<ExpressioContext> expressio() {
			return getRuleContexts(ExpressioContext.class);
		}
		public ExpressioContext expressio(int i) {
			return getRuleContext(ExpressioContext.class,i);
		}
		public List<TerminalNode> TK_COMA() { return getTokens(mainParser.TK_COMA); }
		public TerminalNode TK_COMA(int i) {
			return getToken(mainParser.TK_COMA, i);
		}
		public EscriurelnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_escriureln; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mainListener ) ((mainListener)listener).enterEscriureln(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mainListener ) ((mainListener)listener).exitEscriureln(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mainVisitor ) return ((mainVisitor<? extends T>)visitor).visitEscriureln(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EscriurelnContext escriureln() throws RecognitionException {
		EscriurelnContext _localctx = new EscriurelnContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_escriureln);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(428);
			match(TK_PC_ESCRIURELN);
			setState(429);
			match(TK_LPAREN);
			setState(438);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TK_LPAREN) | (1L << TK_OP_MENYS_UNARI) | (1L << TK_NEGACIO))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (TK_BOOLEA - 69)) | (1L << (TK_DATA - 69)) | (1L << (TK_ZERO - 69)) | (1L << (TK_ENTER - 69)) | (1L << (TK_IDENT - 69)) | (1L << (TK_REAL - 69)) | (1L << (TK_CAR - 69)) | (1L << (TK_STRING - 69)))) != 0)) {
				{
				setState(430);
				expressio();
				setState(435);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TK_COMA) {
					{
					{
					setState(431);
					match(TK_COMA);
					setState(432);
					expressio();
					}
					}
					setState(437);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(440);
			match(TK_RPAREN);
			setState(441);
			match(TK_SEMI);
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

	public static class BlocImplementacioContext extends ParserRuleContext {
		public List<ImplementacioFuncioContext> implementacioFuncio() {
			return getRuleContexts(ImplementacioFuncioContext.class);
		}
		public ImplementacioFuncioContext implementacioFuncio(int i) {
			return getRuleContext(ImplementacioFuncioContext.class,i);
		}
		public List<ImplementacioAccioContext> implementacioAccio() {
			return getRuleContexts(ImplementacioAccioContext.class);
		}
		public ImplementacioAccioContext implementacioAccio(int i) {
			return getRuleContext(ImplementacioAccioContext.class,i);
		}
		public BlocImplementacioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blocImplementacio; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mainListener ) ((mainListener)listener).enterBlocImplementacio(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mainListener ) ((mainListener)listener).exitBlocImplementacio(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mainVisitor ) return ((mainVisitor<? extends T>)visitor).visitBlocImplementacio(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlocImplementacioContext blocImplementacio() throws RecognitionException {
		BlocImplementacioContext _localctx = new BlocImplementacioContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_blocImplementacio);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(447);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TK_PC_ACCIO || _la==TK_PC_FUNCIO) {
				{
				setState(445);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case TK_PC_FUNCIO:
					{
					setState(443);
					implementacioFuncio();
					}
					break;
				case TK_PC_ACCIO:
					{
					setState(444);
					implementacioAccio();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(449);
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

	public static class ImplementacioAccioContext extends ParserRuleContext {
		public TerminalNode TK_PC_ACCIO() { return getToken(mainParser.TK_PC_ACCIO, 0); }
		public TerminalNode TK_IDENT() { return getToken(mainParser.TK_IDENT, 0); }
		public TerminalNode TK_LPAREN() { return getToken(mainParser.TK_LPAREN, 0); }
		public TerminalNode TK_RPAREN() { return getToken(mainParser.TK_RPAREN, 0); }
		public TerminalNode TK_PC_FACCIO() { return getToken(mainParser.TK_PC_FACCIO, 0); }
		public ParametresContext parametres() {
			return getRuleContext(ParametresContext.class,0);
		}
		public BlocDeclaracioVariablesContext blocDeclaracioVariables() {
			return getRuleContext(BlocDeclaracioVariablesContext.class,0);
		}
		public List<SentenciaContext> sentencia() {
			return getRuleContexts(SentenciaContext.class);
		}
		public SentenciaContext sentencia(int i) {
			return getRuleContext(SentenciaContext.class,i);
		}
		public ImplementacioAccioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_implementacioAccio; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mainListener ) ((mainListener)listener).enterImplementacioAccio(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mainListener ) ((mainListener)listener).exitImplementacioAccio(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mainVisitor ) return ((mainVisitor<? extends T>)visitor).visitImplementacioAccio(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImplementacioAccioContext implementacioAccio() throws RecognitionException {
		ImplementacioAccioContext _localctx = new ImplementacioAccioContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_implementacioAccio);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(450);
			match(TK_PC_ACCIO);
			setState(451);
			match(TK_IDENT);
			setState(452);
			match(TK_LPAREN);
			setState(454);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 41)) & ~0x3f) == 0 && ((1L << (_la - 41)) & ((1L << (TK_PC_ENT - 41)) | (1L << (TK_PC_ENTSOR - 41)) | (1L << (TK_IDENT - 41)))) != 0)) {
				{
				setState(453);
				parametres();
				}
			}

			setState(456);
			match(TK_RPAREN);
			setState(458);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TK_PC_VARIABLES) {
				{
				setState(457);
				blocDeclaracioVariables();
				}
			}

			setState(463);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 22)) & ~0x3f) == 0 && ((1L << (_la - 22)) & ((1L << (TK_PC_PER - 22)) | (1L << (TK_PC_SI - 22)) | (1L << (TK_PC_MENTRE - 22)) | (1L << (TK_PC_LLEGIR - 22)) | (1L << (TK_PC_ESCRIURE - 22)) | (1L << (TK_PC_ESCRIURELN - 22)) | (1L << (TK_IDENT - 22)))) != 0)) {
				{
				{
				setState(460);
				sentencia();
				}
				}
				setState(465);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(466);
			match(TK_PC_FACCIO);
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

	public static class ImplementacioFuncioContext extends ParserRuleContext {
		public TerminalNode TK_PC_FUNCIO() { return getToken(mainParser.TK_PC_FUNCIO, 0); }
		public TerminalNode TK_IDENT() { return getToken(mainParser.TK_IDENT, 0); }
		public TerminalNode TK_LPAREN() { return getToken(mainParser.TK_LPAREN, 0); }
		public TerminalNode TK_RPAREN() { return getToken(mainParser.TK_RPAREN, 0); }
		public List<TerminalNode> TK_PC_RETORNA() { return getTokens(mainParser.TK_PC_RETORNA); }
		public TerminalNode TK_PC_RETORNA(int i) {
			return getToken(mainParser.TK_PC_RETORNA, i);
		}
		public TipusBasicContext tipusBasic() {
			return getRuleContext(TipusBasicContext.class,0);
		}
		public ExpressioContext expressio() {
			return getRuleContext(ExpressioContext.class,0);
		}
		public TerminalNode TK_SEMI() { return getToken(mainParser.TK_SEMI, 0); }
		public TerminalNode TK_PC_FFUNCIO() { return getToken(mainParser.TK_PC_FFUNCIO, 0); }
		public ParametresContext parametres() {
			return getRuleContext(ParametresContext.class,0);
		}
		public BlocDeclaracioVariablesContext blocDeclaracioVariables() {
			return getRuleContext(BlocDeclaracioVariablesContext.class,0);
		}
		public List<SentenciaContext> sentencia() {
			return getRuleContexts(SentenciaContext.class);
		}
		public SentenciaContext sentencia(int i) {
			return getRuleContext(SentenciaContext.class,i);
		}
		public ImplementacioFuncioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_implementacioFuncio; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mainListener ) ((mainListener)listener).enterImplementacioFuncio(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mainListener ) ((mainListener)listener).exitImplementacioFuncio(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mainVisitor ) return ((mainVisitor<? extends T>)visitor).visitImplementacioFuncio(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImplementacioFuncioContext implementacioFuncio() throws RecognitionException {
		ImplementacioFuncioContext _localctx = new ImplementacioFuncioContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_implementacioFuncio);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(468);
			match(TK_PC_FUNCIO);
			setState(469);
			match(TK_IDENT);
			setState(470);
			match(TK_LPAREN);
			setState(472);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 41)) & ~0x3f) == 0 && ((1L << (_la - 41)) & ((1L << (TK_PC_ENT - 41)) | (1L << (TK_PC_ENTSOR - 41)) | (1L << (TK_IDENT - 41)))) != 0)) {
				{
				setState(471);
				parametres();
				}
			}

			setState(474);
			match(TK_RPAREN);
			setState(475);
			match(TK_PC_RETORNA);
			setState(476);
			tipusBasic();
			setState(478);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TK_PC_VARIABLES) {
				{
				setState(477);
				blocDeclaracioVariables();
				}
			}

			setState(483);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 22)) & ~0x3f) == 0 && ((1L << (_la - 22)) & ((1L << (TK_PC_PER - 22)) | (1L << (TK_PC_SI - 22)) | (1L << (TK_PC_MENTRE - 22)) | (1L << (TK_PC_LLEGIR - 22)) | (1L << (TK_PC_ESCRIURE - 22)) | (1L << (TK_PC_ESCRIURELN - 22)) | (1L << (TK_IDENT - 22)))) != 0)) {
				{
				{
				setState(480);
				sentencia();
				}
				}
				setState(485);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(486);
			match(TK_PC_RETORNA);
			setState(487);
			expressio();
			setState(488);
			match(TK_SEMI);
			setState(489);
			match(TK_PC_FFUNCIO);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3N\u01ee\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\3\2\5\2Z\n\2\3\2\5\2]\n\2\3\2\5\2`\n\2\3\2\3\2\5\2d\n\2\3\3\3\3\7"+
		"\3h\n\3\f\3\16\3k\13\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6"+
		"\3\6\3\6\3\6\5\6|\n\6\3\7\3\7\3\b\3\b\7\b\u0082\n\b\f\b\16\b\u0085\13"+
		"\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\5\t\u008e\n\t\3\t\3\t\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\5\n\u0098\n\n\3\13\3\13\6\13\u009c\n\13\r\13\16\13\u009d\3\13\3"+
		"\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\7\r\u00a9\n\r\f\r\16\r\u00ac\13\r\3\16"+
		"\3\16\3\16\3\16\5\16\u00b2\n\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17"+
		"\7\17\u00bc\n\17\f\17\16\17\u00bf\13\17\3\20\5\20\u00c2\n\20\3\20\3\20"+
		"\3\20\3\20\5\20\u00c8\n\20\3\21\3\21\3\21\3\21\5\21\u00ce\n\21\3\21\3"+
		"\21\3\21\3\22\3\22\3\22\5\22\u00d6\n\22\3\22\7\22\u00d9\n\22\f\22\16\22"+
		"\u00dc\13\22\3\22\3\22\3\23\3\23\7\23\u00e2\n\23\f\23\16\23\u00e5\13\23"+
		"\3\23\3\23\3\24\3\24\3\24\7\24\u00ec\n\24\f\24\16\24\u00ef\13\24\3\24"+
		"\3\24\3\24\5\24\u00f4\n\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\26"+
		"\3\26\3\26\7\26\u0101\n\26\f\26\16\26\u0104\13\26\3\27\3\27\3\27\3\27"+
		"\7\27\u010a\n\27\f\27\16\27\u010d\13\27\3\30\3\30\3\31\3\31\3\31\7\31"+
		"\u0114\n\31\f\31\16\31\u0117\13\31\3\32\3\32\3\32\7\32\u011c\n\32\f\32"+
		"\16\32\u011f\13\32\3\33\5\33\u0122\n\33\3\33\3\33\3\34\3\34\3\34\3\34"+
		"\3\34\5\34\u012b\n\34\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u0133\n\35\3"+
		"\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \7 \u0143\n"+
		" \f \16 \u0146\13 \5 \u0148\n \3 \3 \3!\3!\3!\3!\3!\3!\3!\3!\5!\u0154"+
		"\n!\3\"\3\"\3\"\5\"\u0159\n\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\7#\u0163\n#"+
		"\f#\16#\u0166\13#\3#\3#\7#\u016a\n#\f#\16#\u016d\13#\5#\u016f\n#\3#\3"+
		"#\3$\3$\3$\3$\3$\3$\3$\3$\7$\u017b\n$\f$\16$\u017e\13$\3$\3$\3%\3%\3%"+
		"\3%\7%\u0186\n%\f%\16%\u0189\13%\3%\3%\3&\3&\3&\3&\3&\7&\u0192\n&\f&\16"+
		"&\u0195\13&\5&\u0197\n&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3"+
		"(\7(\u01a7\n(\f(\16(\u01aa\13(\3(\3(\3(\3)\3)\3)\3)\3)\7)\u01b4\n)\f)"+
		"\16)\u01b7\13)\5)\u01b9\n)\3)\3)\3)\3*\3*\7*\u01c0\n*\f*\16*\u01c3\13"+
		"*\3+\3+\3+\3+\5+\u01c9\n+\3+\3+\5+\u01cd\n+\3+\7+\u01d0\n+\f+\16+\u01d3"+
		"\13+\3+\3+\3,\3,\3,\3,\5,\u01db\n,\3,\3,\3,\3,\5,\u01e1\n,\3,\7,\u01e4"+
		"\n,\f,\16,\u01e7\13,\3,\3,\3,\3,\3,\3,\2\2-\2\4\6\b\n\f\16\20\22\24\26"+
		"\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTV\2\n\3\2AE\3\2IJ\3\2"+
		"+,\3\2=>\4\2\20\218;\3\2\n\13\4\2\t\t\f\16\4\2\17\17<<\2\u0204\2Y\3\2"+
		"\2\2\4e\3\2\2\2\6n\3\2\2\2\bt\3\2\2\2\n{\3\2\2\2\f}\3\2\2\2\16\177\3\2"+
		"\2\2\20\u0088\3\2\2\2\22\u0091\3\2\2\2\24\u0099\3\2\2\2\26\u00a1\3\2\2"+
		"\2\30\u00aa\3\2\2\2\32\u00ad\3\2\2\2\34\u00b8\3\2\2\2\36\u00c1\3\2\2\2"+
		" \u00c9\3\2\2\2\"\u00d2\3\2\2\2$\u00df\3\2\2\2&\u00e8\3\2\2\2(\u00f7\3"+
		"\2\2\2*\u00fd\3\2\2\2,\u0105\3\2\2\2.\u010e\3\2\2\2\60\u0110\3\2\2\2\62"+
		"\u0118\3\2\2\2\64\u0121\3\2\2\2\66\u012a\3\2\2\28\u0132\3\2\2\2:\u0134"+
		"\3\2\2\2<\u0138\3\2\2\2>\u013d\3\2\2\2@\u0153\3\2\2\2B\u0158\3\2\2\2D"+
		"\u015e\3\2\2\2F\u0172\3\2\2\2H\u0181\3\2\2\2J\u018c\3\2\2\2L\u019b\3\2"+
		"\2\2N\u01a1\3\2\2\2P\u01ae\3\2\2\2R\u01c1\3\2\2\2T\u01c4\3\2\2\2V\u01d6"+
		"\3\2\2\2XZ\5\4\3\2YX\3\2\2\2YZ\3\2\2\2Z\\\3\2\2\2[]\5\16\b\2\\[\3\2\2"+
		"\2\\]\3\2\2\2]_\3\2\2\2^`\5\30\r\2_^\3\2\2\2_`\3\2\2\2`a\3\2\2\2ac\5\""+
		"\22\2bd\5R*\2cb\3\2\2\2cd\3\2\2\2d\3\3\2\2\2ei\7-\2\2fh\5\6\4\2gf\3\2"+
		"\2\2hk\3\2\2\2ig\3\2\2\2ij\3\2\2\2jl\3\2\2\2ki\3\2\2\2lm\7.\2\2m\5\3\2"+
		"\2\2no\5\b\5\2op\7K\2\2pq\7F\2\2qr\5\n\6\2rs\7\22\2\2s\7\3\2\2\2tu\t\2"+
		"\2\2u\t\3\2\2\2v|\7G\2\2w|\7H\2\2x|\5\f\7\2y|\7L\2\2z|\7M\2\2{v\3\2\2"+
		"\2{w\3\2\2\2{x\3\2\2\2{y\3\2\2\2{z\3\2\2\2|\13\3\2\2\2}~\t\3\2\2~\r\3"+
		"\2\2\2\177\u0083\7/\2\2\u0080\u0082\5\20\t\2\u0081\u0080\3\2\2\2\u0082"+
		"\u0085\3\2\2\2\u0083\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0086\3\2"+
		"\2\2\u0085\u0083\3\2\2\2\u0086\u0087\7\60\2\2\u0087\17\3\2\2\2\u0088\u0089"+
		"\7K\2\2\u0089\u008d\7@\2\2\u008a\u008e\5\b\5\2\u008b\u008e\5\22\n\2\u008c"+
		"\u008e\5\24\13\2\u008d\u008a\3\2\2\2\u008d\u008b\3\2\2\2\u008d\u008c\3"+
		"\2\2\2\u008e\u008f\3\2\2\2\u008f\u0090\7\22\2\2\u0090\21\3\2\2\2\u0091"+
		"\u0092\7\61\2\2\u0092\u0093\5\b\5\2\u0093\u0094\7\62\2\2\u0094\u0097\5"+
		"\f\7\2\u0095\u0096\7\63\2\2\u0096\u0098\5\f\7\2\u0097\u0095\3\2\2\2\u0097"+
		"\u0098\3\2\2\2\u0098\23\3\2\2\2\u0099\u009b\7\64\2\2\u009a\u009c\5\26"+
		"\f\2\u009b\u009a\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u009b\3\2\2\2\u009d"+
		"\u009e\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u00a0\7\65\2\2\u00a0\25\3\2\2"+
		"\2\u00a1\u00a2\7K\2\2\u00a2\u00a3\7@\2\2\u00a3\u00a4\5\b\5\2\u00a4\u00a5"+
		"\7\22\2\2\u00a5\27\3\2\2\2\u00a6\u00a9\5\32\16\2\u00a7\u00a9\5 \21\2\u00a8"+
		"\u00a6\3\2\2\2\u00a8\u00a7\3\2\2\2\u00a9\u00ac\3\2\2\2\u00aa\u00a8\3\2"+
		"\2\2\u00aa\u00ab\3\2\2\2\u00ab\31\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ad\u00ae"+
		"\7(\2\2\u00ae\u00af\7K\2\2\u00af\u00b1\7\5\2\2\u00b0\u00b2\5\34\17\2\u00b1"+
		"\u00b0\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b4\7\6"+
		"\2\2\u00b4\u00b5\7*\2\2\u00b5\u00b6\5\b\5\2\u00b6\u00b7\7\22\2\2\u00b7"+
		"\33\3\2\2\2\u00b8\u00bd\5\36\20\2\u00b9\u00ba\7\23\2\2\u00ba\u00bc\5\36"+
		"\20\2\u00bb\u00b9\3\2\2\2\u00bc\u00bf\3\2\2\2\u00bd\u00bb\3\2\2\2\u00bd"+
		"\u00be\3\2\2\2\u00be\35\3\2\2\2\u00bf\u00bd\3\2\2\2\u00c0\u00c2\t\4\2"+
		"\2\u00c1\u00c0\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c4"+
		"\7K\2\2\u00c4\u00c7\7@\2\2\u00c5\u00c8\5\b\5\2\u00c6\u00c8\7K\2\2\u00c7"+
		"\u00c5\3\2\2\2\u00c7\u00c6\3\2\2\2\u00c8\37\3\2\2\2\u00c9\u00ca\7&\2\2"+
		"\u00ca\u00cb\7K\2\2\u00cb\u00cd\7\5\2\2\u00cc\u00ce\5\34\17\2\u00cd\u00cc"+
		"\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00d0\7\6\2\2\u00d0"+
		"\u00d1\7\22\2\2\u00d1!\3\2\2\2\u00d2\u00d3\7\25\2\2\u00d3\u00d5\7K\2\2"+
		"\u00d4\u00d6\5$\23\2\u00d5\u00d4\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00da"+
		"\3\2\2\2\u00d7\u00d9\5@!\2\u00d8\u00d7\3\2\2\2\u00d9\u00dc\3\2\2\2\u00da"+
		"\u00d8\3\2\2\2\u00da\u00db\3\2\2\2\u00db\u00dd\3\2\2\2\u00dc\u00da\3\2"+
		"\2\2\u00dd\u00de\7\26\2\2\u00de#\3\2\2\2\u00df\u00e3\7\66\2\2\u00e0\u00e2"+
		"\5&\24\2\u00e1\u00e0\3\2\2\2\u00e2\u00e5\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e3"+
		"\u00e4\3\2\2\2\u00e4\u00e6\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e6\u00e7\7\67"+
		"\2\2\u00e7%\3\2\2\2\u00e8\u00ed\7K\2\2\u00e9\u00ea\7\23\2\2\u00ea\u00ec"+
		"\7K\2\2\u00eb\u00e9\3\2\2\2\u00ec\u00ef\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ed"+
		"\u00ee\3\2\2\2\u00ee\u00f0\3\2\2\2\u00ef\u00ed\3\2\2\2\u00f0\u00f3\7@"+
		"\2\2\u00f1\u00f4\5\b\5\2\u00f2\u00f4\7K\2\2\u00f3\u00f1\3\2\2\2\u00f3"+
		"\u00f2\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5\u00f6\7\22\2\2\u00f6\'\3\2\2"+
		"\2\u00f7\u00f8\5*\26\2\u00f8\u00f9\7?\2\2\u00f9\u00fa\5*\26\2\u00fa\u00fb"+
		"\7@\2\2\u00fb\u00fc\5*\26\2\u00fc)\3\2\2\2\u00fd\u0102\5,\27\2\u00fe\u00ff"+
		"\t\5\2\2\u00ff\u0101\5,\27\2\u0100\u00fe\3\2\2\2\u0101\u0104\3\2\2\2\u0102"+
		"\u0100\3\2\2\2\u0102\u0103\3\2\2\2\u0103+\3\2\2\2\u0104\u0102\3\2\2\2"+
		"\u0105\u010b\5\60\31\2\u0106\u0107\5.\30\2\u0107\u0108\5\60\31\2\u0108"+
		"\u010a\3\2\2\2\u0109\u0106\3\2\2\2\u010a\u010d\3\2\2\2\u010b\u0109\3\2"+
		"\2\2\u010b\u010c\3\2\2\2\u010c-\3\2\2\2\u010d\u010b\3\2\2\2\u010e\u010f"+
		"\t\6\2\2\u010f/\3\2\2\2\u0110\u0115\5\62\32\2\u0111\u0112\t\7\2\2\u0112"+
		"\u0114\5\62\32\2\u0113\u0111\3\2\2\2\u0114\u0117\3\2\2\2\u0115\u0113\3"+
		"\2\2\2\u0115\u0116\3\2\2\2\u0116\61\3\2\2\2\u0117\u0115\3\2\2\2\u0118"+
		"\u011d\5\64\33\2\u0119\u011a\t\b\2\2\u011a\u011c\5\64\33\2\u011b\u0119"+
		"\3\2\2\2\u011c\u011f\3\2\2\2\u011d\u011b\3\2\2\2\u011d\u011e\3\2\2\2\u011e"+
		"\63\3\2\2\2\u011f\u011d\3\2\2\2\u0120\u0122\t\t\2\2\u0121\u0120\3\2\2"+
		"\2\u0121\u0122\3\2\2\2\u0122\u0123\3\2\2\2\u0123\u0124\5\66\34\2\u0124"+
		"\65\3\2\2\2\u0125\u012b\58\35\2\u0126\u0127\7\5\2\2\u0127\u0128\5*\26"+
		"\2\u0128\u0129\7\6\2\2\u0129\u012b\3\2\2\2\u012a\u0125\3\2\2\2\u012a\u0126"+
		"\3\2\2\2\u012b\67\3\2\2\2\u012c\u0133\5\n\6\2\u012d\u0133\7N\2\2\u012e"+
		"\u0133\7K\2\2\u012f\u0133\5:\36\2\u0130\u0133\5<\37\2\u0131\u0133\5> "+
		"\2\u0132\u012c\3\2\2\2\u0132\u012d\3\2\2\2\u0132\u012e\3\2\2\2\u0132\u012f"+
		"\3\2\2\2\u0132\u0130\3\2\2\2\u0132\u0131\3\2\2\2\u01339\3\2\2\2\u0134"+
		"\u0135\7K\2\2\u0135\u0136\7\24\2\2\u0136\u0137\7K\2\2\u0137;\3\2\2\2\u0138"+
		"\u0139\7K\2\2\u0139\u013a\7\7\2\2\u013a\u013b\5*\26\2\u013b\u013c\7\b"+
		"\2\2\u013c=\3\2\2\2\u013d\u013e\7K\2\2\u013e\u0147\7\5\2\2\u013f\u0144"+
		"\5*\26\2\u0140\u0141\7\23\2\2\u0141\u0143\5*\26\2\u0142\u0140\3\2\2\2"+
		"\u0143\u0146\3\2\2\2\u0144\u0142\3\2\2\2\u0144\u0145\3\2\2\2\u0145\u0148"+
		"\3\2\2\2\u0146\u0144\3\2\2\2\u0147\u013f\3\2\2\2\u0147\u0148\3\2\2\2\u0148"+
		"\u0149\3\2\2\2\u0149\u014a\7\6\2\2\u014a?\3\2\2\2\u014b\u0154\5B\"\2\u014c"+
		"\u0154\5D#\2\u014d\u0154\5F$\2\u014e\u0154\5H%\2\u014f\u0154\5J&\2\u0150"+
		"\u0154\5L\'\2\u0151\u0154\5N(\2\u0152\u0154\5P)\2\u0153\u014b\3\2\2\2"+
		"\u0153\u014c\3\2\2\2\u0153\u014d\3\2\2\2\u0153\u014e\3\2\2\2\u0153\u014f"+
		"\3\2\2\2\u0153\u0150\3\2\2\2\u0153\u0151\3\2\2\2\u0153\u0152\3\2\2\2\u0154"+
		"A\3\2\2\2\u0155\u0159\7K\2\2\u0156\u0159\5:\36\2\u0157\u0159\5<\37\2\u0158"+
		"\u0155\3\2\2\2\u0158\u0156\3\2\2\2\u0158\u0157\3\2\2\2\u0159\u015a\3\2"+
		"\2\2\u015a\u015b\7F\2\2\u015b\u015c\5*\26\2\u015c\u015d\7\22\2\2\u015d"+
		"C\3\2\2\2\u015e\u015f\7\35\2\2\u015f\u0160\5*\26\2\u0160\u0164\7\37\2"+
		"\2\u0161\u0163\5@!\2\u0162\u0161\3\2\2\2\u0163\u0166\3\2\2\2\u0164\u0162"+
		"\3\2\2\2\u0164\u0165\3\2\2\2\u0165\u016e\3\2\2\2\u0166\u0164\3\2\2\2\u0167"+
		"\u016b\7 \2\2\u0168\u016a\5@!\2\u0169\u0168\3\2\2\2\u016a\u016d\3\2\2"+
		"\2\u016b\u0169\3\2\2\2\u016b\u016c\3\2\2\2\u016c\u016f\3\2\2\2\u016d\u016b"+
		"\3\2\2\2\u016e\u0167\3\2\2\2\u016e\u016f\3\2\2\2\u016f\u0170\3\2\2\2\u0170"+
		"\u0171\7\36\2\2\u0171E\3\2\2\2\u0172\u0173\7\30\2\2\u0173\u0174\7K\2\2"+
		"\u0174\u0175\7\32\2\2\u0175\u0176\5*\26\2\u0176\u0177\7\33\2\2\u0177\u0178"+
		"\5*\26\2\u0178\u017c\7\34\2\2\u0179\u017b\5@!\2\u017a\u0179\3\2\2\2\u017b"+
		"\u017e\3\2\2\2\u017c\u017a\3\2\2\2\u017c\u017d\3\2\2\2\u017d\u017f\3\2"+
		"\2\2\u017e\u017c\3\2\2\2\u017f\u0180\7\31\2\2\u0180G\3\2\2\2\u0181\u0182"+
		"\7!\2\2\u0182\u0183\5*\26\2\u0183\u0187\7\34\2\2\u0184\u0186\5@!\2\u0185"+
		"\u0184\3\2\2\2\u0186\u0189\3\2\2\2\u0187\u0185\3\2\2\2\u0187\u0188\3\2"+
		"\2\2\u0188\u018a\3\2\2\2\u0189\u0187\3\2\2\2\u018a\u018b\7\"\2\2\u018b"+
		"I\3\2\2\2\u018c\u018d\7K\2\2\u018d\u0196\7\5\2\2\u018e\u0193\5*\26\2\u018f"+
		"\u0190\7\23\2\2\u0190\u0192\5*\26\2\u0191\u018f\3\2\2\2\u0192\u0195\3"+
		"\2\2\2\u0193\u0191\3\2\2\2\u0193\u0194\3\2\2\2\u0194\u0197\3\2\2\2\u0195"+
		"\u0193\3\2\2\2\u0196\u018e\3\2\2\2\u0196\u0197\3\2\2\2\u0197\u0198\3\2"+
		"\2\2\u0198\u0199\7\6\2\2\u0199\u019a\7\22\2\2\u019aK\3\2\2\2\u019b\u019c"+
		"\7#\2\2\u019c\u019d\7\5\2\2\u019d\u019e\7K\2\2\u019e\u019f\7\6\2\2\u019f"+
		"\u01a0\7\22\2\2\u01a0M\3\2\2\2\u01a1\u01a2\7$\2\2\u01a2\u01a3\7\5\2\2"+
		"\u01a3\u01a8\5*\26\2\u01a4\u01a5\7\23\2\2\u01a5\u01a7\5*\26\2\u01a6\u01a4"+
		"\3\2\2\2\u01a7\u01aa\3\2\2\2\u01a8\u01a6\3\2\2\2\u01a8\u01a9\3\2\2\2\u01a9"+
		"\u01ab\3\2\2\2\u01aa\u01a8\3\2\2\2\u01ab\u01ac\7\6\2\2\u01ac\u01ad\7\22"+
		"\2\2\u01adO\3\2\2\2\u01ae\u01af\7%\2\2\u01af\u01b8\7\5\2\2\u01b0\u01b5"+
		"\5*\26\2\u01b1\u01b2\7\23\2\2\u01b2\u01b4\5*\26\2\u01b3\u01b1\3\2\2\2"+
		"\u01b4\u01b7\3\2\2\2\u01b5\u01b3\3\2\2\2\u01b5\u01b6\3\2\2\2\u01b6\u01b9"+
		"\3\2\2\2\u01b7\u01b5\3\2\2\2\u01b8\u01b0\3\2\2\2\u01b8\u01b9\3\2\2\2\u01b9"+
		"\u01ba\3\2\2\2\u01ba\u01bb\7\6\2\2\u01bb\u01bc\7\22\2\2\u01bcQ\3\2\2\2"+
		"\u01bd\u01c0\5V,\2\u01be\u01c0\5T+\2\u01bf\u01bd\3\2\2\2\u01bf\u01be\3"+
		"\2\2\2\u01c0\u01c3\3\2\2\2\u01c1\u01bf\3\2\2\2\u01c1\u01c2\3\2\2\2\u01c2"+
		"S\3\2\2\2\u01c3\u01c1\3\2\2\2\u01c4\u01c5\7&\2\2\u01c5\u01c6\7K\2\2\u01c6"+
		"\u01c8\7\5\2\2\u01c7\u01c9\5\34\17\2\u01c8\u01c7\3\2\2\2\u01c8\u01c9\3"+
		"\2\2\2\u01c9\u01ca\3\2\2\2\u01ca\u01cc\7\6\2\2\u01cb\u01cd\5$\23\2\u01cc"+
		"\u01cb\3\2\2\2\u01cc\u01cd\3\2\2\2\u01cd\u01d1\3\2\2\2\u01ce\u01d0\5@"+
		"!\2\u01cf\u01ce\3\2\2\2\u01d0\u01d3\3\2\2\2\u01d1\u01cf\3\2\2\2\u01d1"+
		"\u01d2\3\2\2\2\u01d2\u01d4\3\2\2\2\u01d3\u01d1\3\2\2\2\u01d4\u01d5\7\'"+
		"\2\2\u01d5U\3\2\2\2\u01d6\u01d7\7(\2\2\u01d7\u01d8\7K\2\2\u01d8\u01da"+
		"\7\5\2\2\u01d9\u01db\5\34\17\2\u01da\u01d9\3\2\2\2\u01da\u01db\3\2\2\2"+
		"\u01db\u01dc\3\2\2\2\u01dc\u01dd\7\6\2\2\u01dd\u01de\7*\2\2\u01de\u01e0"+
		"\5\b\5\2\u01df\u01e1\5$\23\2\u01e0\u01df\3\2\2\2\u01e0\u01e1\3\2\2\2\u01e1"+
		"\u01e5\3\2\2\2\u01e2\u01e4\5@!\2\u01e3\u01e2\3\2\2\2\u01e4\u01e7\3\2\2"+
		"\2\u01e5\u01e3\3\2\2\2\u01e5\u01e6\3\2\2\2\u01e6\u01e8\3\2\2\2\u01e7\u01e5"+
		"\3\2\2\2\u01e8\u01e9\7*\2\2\u01e9\u01ea\5*\26\2\u01ea\u01eb\7\22\2\2\u01eb"+
		"\u01ec\7)\2\2\u01ecW\3\2\2\2\65Y\\_ci{\u0083\u008d\u0097\u009d\u00a8\u00aa"+
		"\u00b1\u00bd\u00c1\u00c7\u00cd\u00d5\u00da\u00e3\u00ed\u00f3\u0102\u010b"+
		"\u0115\u011d\u0121\u012a\u0132\u0144\u0147\u0153\u0158\u0164\u016b\u016e"+
		"\u017c\u0187\u0193\u0196\u01a8\u01b5\u01b8\u01bf\u01c1\u01c8\u01cc\u01d1"+
		"\u01da\u01e0\u01e5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}