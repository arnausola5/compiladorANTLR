// Generated from C:/Users/arnau/OneDrive/UdG/Quart/Compiladors/Pr�ctiques/Tokens\main.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class mainLexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"TK_WS", "TK_COMENTARI", "TK_LPAREN", "TK_RPAREN", "TK_OVECTOR", "TK_TVECTOR", 
			"TK_STAR", "TK_OP_PLUS", "TK_OP_MENYS", "TK_OP_DIVISIO_REAL", "TK_OP_DIVISIO_ENTERA", 
			"TK_OP_MODUL", "TK_OP_MENYS_UNARI", "TK_OP_IGUALTAT", "TK_OP_DESIGUALTAT", 
			"TK_SEMI", "TK_COMA", "TK_PUNT", "TK_PC_PROGRAMA", "TK_PC_FPROGRAMA", 
			"TK_PC_PERIODE", "TK_PC_PER", "TK_PC_FPER", "TK_PC_DE", "TK_PC_FINS", 
			"TK_PC_FER", "TK_PC_SI", "TK_PC_FSI", "TK_PC_LLAVORS", "TK_PC_ALTRAMENT", 
			"TK_PC_MENTRE", "TK_PC_FMENTRE", "TK_PC_LLEGIR", "TK_PC_ESCRIURE", "TK_PC_ESCRIURELN", 
			"TK_PC_ACCIO", "TK_PC_FACCIO", "TK_PC_FUNCIO", "TK_PC_FFUNCIO", "TK_PC_RETORNA", 
			"TK_PC_ENT", "TK_PC_ENTSOR", "TK_PC_CONSTANTS", "TK_PC_FCONSTANTS", "TK_PC_TIPUS", 
			"TK_PC_FTIPUS", "TK_PC_VECTOR", "TK_PC_MIDA", "TK_PC_INICI", "TK_PC_TUPLA", 
			"TK_PC_FTUPLA", "TK_PC_VARIABLES", "TK_PC_FVARIABLES", "TK_MESGRAN", 
			"TK_MESPETIT", "TK_MESPETIT_IGUAL", "TK_MESGRAN_IGUAL", "TK_NEGACIO", 
			"TK_AND", "TK_OR", "TK_INTERROGANT", "TK_DOSPUNTS", "TK_TB_ENTER", "TK_TB_REAL", 
			"TK_TB_CAR", "TK_TB_BOOLEA", "TK_TB_DATA", "TK_ASSIGNACIO", "DIGIT", 
			"LLETRA", "CARACTERS_ASCII", "TK_BOOLEA", "TK_DATA", "TK_ZERO", "TK_ENTER", 
			"TK_IDENT", "TK_REAL", "TK_CAR", "TK_STRING"
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


	public mainLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "main.g4"; }

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

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 18:
			TK_PC_PROGRAMA_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void TK_PC_PROGRAMA_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			 System.out.println("He reconegut el programa") 
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2N\u0277\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\3\2\3\2\3\2\3\2\3\3\3\3"+
		"\3\3\3\3\3\3\7\3\u00ab\n\3\f\3\16\3\u00ae\13\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\7\3\u00b6\n\3\f\3\16\3\u00b9\13\3\3\3\3\3\5\3\u00bd\n\3\3\3\3\3\3\4\3"+
		"\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3"+
		"\r\3\r\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\22\3\22\3\23"+
		"\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31"+
		"\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\35\3\35"+
		"\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!"+
		"\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3#\3#\3$\3$\3"+
		"$\3$\3$\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3&\3\'\3"+
		"\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3)\3)\3"+
		")\3*\3*\3*\3*\3+\3+\3+\3+\3+\3+\3+\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3-\3"+
		"-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3.\3.\3.\3.\3.\3.\3/\3/\3/\3/\3/\3/\3/\3"+
		"\60\3\60\3\60\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3\62\3\62\3"+
		"\62\3\62\3\62\3\62\3\63\3\63\3\63\3\63\3\63\3\63\3\64\3\64\3\64\3\64\3"+
		"\64\3\64\3\64\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\66\3"+
		"\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\67\3\67\38\38\39\3"+
		"9\39\3:\3:\3:\3;\3;\3;\3<\3<\3=\3=\3>\3>\3?\3?\3@\3@\3@\3@\3@\3@\3A\3"+
		"A\3A\3A\3A\3B\3B\3B\3B\3C\3C\3C\3C\3C\3C\3C\3D\3D\3D\3D\3D\3E\3E\3E\3"+
		"F\3F\3G\3G\3H\3H\3I\3I\3I\3I\3I\3I\3I\3I\3I\5I\u021f\nI\3J\3J\5J\u0223"+
		"\nJ\3J\3J\3J\3J\5J\u0229\nJ\3J\3J\3J\3J\5J\u022f\nJ\3J\3J\5J\u0233\nJ"+
		"\3J\3J\5J\u0237\nJ\3J\3J\5J\u023b\nJ\3K\3K\3L\3L\3L\7L\u0242\nL\fL\16"+
		"L\u0245\13L\3M\3M\3M\3M\7M\u024b\nM\fM\16M\u024e\13M\3N\3N\7N\u0252\n"+
		"N\fN\16N\u0255\13N\3N\3N\3N\7N\u025a\nN\fN\16N\u025d\13N\3N\3N\3N\5N\u0262"+
		"\nN\3N\5N\u0265\nN\3O\3O\3O\5O\u026a\nO\3O\3O\3P\3P\3P\7P\u0271\nP\fP"+
		"\16P\u0274\13P\3P\3P\2\2Q\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25"+
		"\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32"+
		"\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a"+
		"\62c\63e\64g\65i\66k\67m8o9q:s;u<w=y>{?}@\177A\u0081B\u0083C\u0085D\u0087"+
		"E\u0089F\u008b\2\u008d\2\u008f\2\u0091G\u0093H\u0095I\u0097J\u0099K\u009b"+
		"L\u009dM\u009fN\3\2\7\5\2\13\f\17\17\"\"\4\2\13\13\"\"\4\2\f\f\17\17\4"+
		"\2C\\c|\4\2\62\62aa\2\u028d\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3"+
		"\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2"+
		"\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37"+
		"\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3"+
		"\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2"+
		"\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C"+
		"\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2"+
		"\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2"+
		"\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i"+
		"\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2"+
		"\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081"+
		"\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2"+
		"\2\2\u0091\3\2\2\2\2\u0093\3\2\2\2\2\u0095\3\2\2\2\2\u0097\3\2\2\2\2\u0099"+
		"\3\2\2\2\2\u009b\3\2\2\2\2\u009d\3\2\2\2\2\u009f\3\2\2\2\3\u00a1\3\2\2"+
		"\2\5\u00bc\3\2\2\2\7\u00c0\3\2\2\2\t\u00c2\3\2\2\2\13\u00c4\3\2\2\2\r"+
		"\u00c6\3\2\2\2\17\u00c8\3\2\2\2\21\u00ca\3\2\2\2\23\u00cc\3\2\2\2\25\u00ce"+
		"\3\2\2\2\27\u00d0\3\2\2\2\31\u00d2\3\2\2\2\33\u00d4\3\2\2\2\35\u00d6\3"+
		"\2\2\2\37\u00d9\3\2\2\2!\u00dc\3\2\2\2#\u00de\3\2\2\2%\u00e0\3\2\2\2\'"+
		"\u00e2\3\2\2\2)\u00ed\3\2\2\2+\u00f7\3\2\2\2-\u00ff\3\2\2\2/\u0103\3\2"+
		"\2\2\61\u0108\3\2\2\2\63\u010b\3\2\2\2\65\u0110\3\2\2\2\67\u0114\3\2\2"+
		"\29\u0117\3\2\2\2;\u011b\3\2\2\2=\u0123\3\2\2\2?\u012d\3\2\2\2A\u0134"+
		"\3\2\2\2C\u013c\3\2\2\2E\u0143\3\2\2\2G\u014c\3\2\2\2I\u0157\3\2\2\2K"+
		"\u015d\3\2\2\2M\u0164\3\2\2\2O\u016b\3\2\2\2Q\u0173\3\2\2\2S\u017b\3\2"+
		"\2\2U\u017f\3\2\2\2W\u0186\3\2\2\2Y\u0190\3\2\2\2[\u019b\3\2\2\2]\u01a1"+
		"\3\2\2\2_\u01a8\3\2\2\2a\u01af\3\2\2\2c\u01b4\3\2\2\2e\u01ba\3\2\2\2g"+
		"\u01c0\3\2\2\2i\u01c7\3\2\2\2k\u01d1\3\2\2\2m\u01dc\3\2\2\2o\u01de\3\2"+
		"\2\2q\u01e0\3\2\2\2s\u01e3\3\2\2\2u\u01e6\3\2\2\2w\u01e9\3\2\2\2y\u01eb"+
		"\3\2\2\2{\u01ed\3\2\2\2}\u01ef\3\2\2\2\177\u01f1\3\2\2\2\u0081\u01f7\3"+
		"\2\2\2\u0083\u01fc\3\2\2\2\u0085\u0200\3\2\2\2\u0087\u0207\3\2\2\2\u0089"+
		"\u020c\3\2\2\2\u008b\u020f\3\2\2\2\u008d\u0211\3\2\2\2\u008f\u0213\3\2"+
		"\2\2\u0091\u021e\3\2\2\2\u0093\u0222\3\2\2\2\u0095\u023c\3\2\2\2\u0097"+
		"\u023e\3\2\2\2\u0099\u0246\3\2\2\2\u009b\u0253\3\2\2\2\u009d\u0266\3\2"+
		"\2\2\u009f\u026d\3\2\2\2\u00a1\u00a2\t\2\2\2\u00a2\u00a3\3\2\2\2\u00a3"+
		"\u00a4\b\2\2\2\u00a4\4\3\2\2\2\u00a5\u00a6\7\61\2\2\u00a6\u00a7\7\61\2"+
		"\2\u00a7\u00ac\3\2\2\2\u00a8\u00ab\5\u008fH\2\u00a9\u00ab\t\3\2\2\u00aa"+
		"\u00a8\3\2\2\2\u00aa\u00a9\3\2\2\2\u00ab\u00ae\3\2\2\2\u00ac\u00aa\3\2"+
		"\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00af\3\2\2\2\u00ae\u00ac\3\2\2\2\u00af"+
		"\u00bd\t\4\2\2\u00b0\u00b1\7\61\2\2\u00b1\u00b2\7,\2\2\u00b2\u00b7\3\2"+
		"\2\2\u00b3\u00b6\5\u008fH\2\u00b4\u00b6\5\3\2\2\u00b5\u00b3\3\2\2\2\u00b5"+
		"\u00b4\3\2\2\2\u00b6\u00b9\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b7\u00b8\3\2"+
		"\2\2\u00b8\u00ba\3\2\2\2\u00b9\u00b7\3\2\2\2\u00ba\u00bb\7,\2\2\u00bb"+
		"\u00bd\7\61\2\2\u00bc\u00a5\3\2\2\2\u00bc\u00b0\3\2\2\2\u00bd\u00be\3"+
		"\2\2\2\u00be\u00bf\b\3\2\2\u00bf\6\3\2\2\2\u00c0\u00c1\7*\2\2\u00c1\b"+
		"\3\2\2\2\u00c2\u00c3\7+\2\2\u00c3\n\3\2\2\2\u00c4\u00c5\7]\2\2\u00c5\f"+
		"\3\2\2\2\u00c6\u00c7\7_\2\2\u00c7\16\3\2\2\2\u00c8\u00c9\7,\2\2\u00c9"+
		"\20\3\2\2\2\u00ca\u00cb\7-\2\2\u00cb\22\3\2\2\2\u00cc\u00cd\7/\2\2\u00cd"+
		"\24\3\2\2\2\u00ce\u00cf\7\61\2\2\u00cf\26\3\2\2\2\u00d0\u00d1\7^\2\2\u00d1"+
		"\30\3\2\2\2\u00d2\u00d3\7\'\2\2\u00d3\32\3\2\2\2\u00d4\u00d5\7\u0080\2"+
		"\2\u00d5\34\3\2\2\2\u00d6\u00d7\7?\2\2\u00d7\u00d8\7?\2\2\u00d8\36\3\2"+
		"\2\2\u00d9\u00da\7#\2\2\u00da\u00db\7?\2\2\u00db \3\2\2\2\u00dc\u00dd"+
		"\7=\2\2\u00dd\"\3\2\2\2\u00de\u00df\7.\2\2\u00df$\3\2\2\2\u00e0\u00e1"+
		"\7\60\2\2\u00e1&\3\2\2\2\u00e2\u00e3\7r\2\2\u00e3\u00e4\7t\2\2\u00e4\u00e5"+
		"\7q\2\2\u00e5\u00e6\7i\2\2\u00e6\u00e7\7t\2\2\u00e7\u00e8\7c\2\2\u00e8"+
		"\u00e9\7o\2\2\u00e9\u00ea\7c\2\2\u00ea\u00eb\3\2\2\2\u00eb\u00ec\b\24"+
		"\3\2\u00ec(\3\2\2\2\u00ed\u00ee\7h\2\2\u00ee\u00ef\7r\2\2\u00ef\u00f0"+
		"\7t\2\2\u00f0\u00f1\7q\2\2\u00f1\u00f2\7i\2\2\u00f2\u00f3\7t\2\2\u00f3"+
		"\u00f4\7c\2\2\u00f4\u00f5\7o\2\2\u00f5\u00f6\7c\2\2\u00f6*\3\2\2\2\u00f7"+
		"\u00f8\7r\2\2\u00f8\u00f9\7g\2\2\u00f9\u00fa\7t\2\2\u00fa\u00fb\7k\2\2"+
		"\u00fb\u00fc\7q\2\2\u00fc\u00fd\7f\2\2\u00fd\u00fe\7g\2\2\u00fe,\3\2\2"+
		"\2\u00ff\u0100\7r\2\2\u0100\u0101\7g\2\2\u0101\u0102\7t\2\2\u0102.\3\2"+
		"\2\2\u0103\u0104\7h\2\2\u0104\u0105\7r\2\2\u0105\u0106\7g\2\2\u0106\u0107"+
		"\7t\2\2\u0107\60\3\2\2\2\u0108\u0109\7f\2\2\u0109\u010a\7g\2\2\u010a\62"+
		"\3\2\2\2\u010b\u010c\7h\2\2\u010c\u010d\7k\2\2\u010d\u010e\7p\2\2\u010e"+
		"\u010f\7u\2\2\u010f\64\3\2\2\2\u0110\u0111\7h\2\2\u0111\u0112\7g\2\2\u0112"+
		"\u0113\7t\2\2\u0113\66\3\2\2\2\u0114\u0115\7u\2\2\u0115\u0116\7k\2\2\u0116"+
		"8\3\2\2\2\u0117\u0118\7h\2\2\u0118\u0119\7u\2\2\u0119\u011a\7k\2\2\u011a"+
		":\3\2\2\2\u011b\u011c\7n\2\2\u011c\u011d\7n\2\2\u011d\u011e\7c\2\2\u011e"+
		"\u011f\7x\2\2\u011f\u0120\7q\2\2\u0120\u0121\7t\2\2\u0121\u0122\7u\2\2"+
		"\u0122<\3\2\2\2\u0123\u0124\7c\2\2\u0124\u0125\7n\2\2\u0125\u0126\7v\2"+
		"\2\u0126\u0127\7t\2\2\u0127\u0128\7c\2\2\u0128\u0129\7o\2\2\u0129\u012a"+
		"\7g\2\2\u012a\u012b\7p\2\2\u012b\u012c\7v\2\2\u012c>\3\2\2\2\u012d\u012e"+
		"\7o\2\2\u012e\u012f\7g\2\2\u012f\u0130\7p\2\2\u0130\u0131\7v\2\2\u0131"+
		"\u0132\7t\2\2\u0132\u0133\7g\2\2\u0133@\3\2\2\2\u0134\u0135\7h\2\2\u0135"+
		"\u0136\7o\2\2\u0136\u0137\7g\2\2\u0137\u0138\7p\2\2\u0138\u0139\7v\2\2"+
		"\u0139\u013a\7t\2\2\u013a\u013b\7g\2\2\u013bB\3\2\2\2\u013c\u013d\7n\2"+
		"\2\u013d\u013e\7n\2\2\u013e\u013f\7g\2\2\u013f\u0140\7i\2\2\u0140\u0141"+
		"\7k\2\2\u0141\u0142\7t\2\2\u0142D\3\2\2\2\u0143\u0144\7g\2\2\u0144\u0145"+
		"\7u\2\2\u0145\u0146\7e\2\2\u0146\u0147\7t\2\2\u0147\u0148\7k\2\2\u0148"+
		"\u0149\7w\2\2\u0149\u014a\7t\2\2\u014a\u014b\7g\2\2\u014bF\3\2\2\2\u014c"+
		"\u014d\7g\2\2\u014d\u014e\7u\2\2\u014e\u014f\7e\2\2\u014f\u0150\7t\2\2"+
		"\u0150\u0151\7k\2\2\u0151\u0152\7w\2\2\u0152\u0153\7t\2\2\u0153\u0154"+
		"\7g\2\2\u0154\u0155\7n\2\2\u0155\u0156\7p\2\2\u0156H\3\2\2\2\u0157\u0158"+
		"\7c\2\2\u0158\u0159\7e\2\2\u0159\u015a\7e\2\2\u015a\u015b\7k\2\2\u015b"+
		"\u015c\7q\2\2\u015cJ\3\2\2\2\u015d\u015e\7h\2\2\u015e\u015f\7c\2\2\u015f"+
		"\u0160\7e\2\2\u0160\u0161\7e\2\2\u0161\u0162\7k\2\2\u0162\u0163\7q\2\2"+
		"\u0163L\3\2\2\2\u0164\u0165\7h\2\2\u0165\u0166\7w\2\2\u0166\u0167\7p\2"+
		"\2\u0167\u0168\7e\2\2\u0168\u0169\7k\2\2\u0169\u016a\7q\2\2\u016aN\3\2"+
		"\2\2\u016b\u016c\7h\2\2\u016c\u016d\7h\2\2\u016d\u016e\7w\2\2\u016e\u016f"+
		"\7p\2\2\u016f\u0170\7e\2\2\u0170\u0171\7k\2\2\u0171\u0172\7q\2\2\u0172"+
		"P\3\2\2\2\u0173\u0174\7t\2\2\u0174\u0175\7g\2\2\u0175\u0176\7v\2\2\u0176"+
		"\u0177\7q\2\2\u0177\u0178\7t\2\2\u0178\u0179\7p\2\2\u0179\u017a\7c\2\2"+
		"\u017aR\3\2\2\2\u017b\u017c\7g\2\2\u017c\u017d\7p\2\2\u017d\u017e\7v\2"+
		"\2\u017eT\3\2\2\2\u017f\u0180\7g\2\2\u0180\u0181\7p\2\2\u0181\u0182\7"+
		"v\2\2\u0182\u0183\7u\2\2\u0183\u0184\7q\2\2\u0184\u0185\7t\2\2\u0185V"+
		"\3\2\2\2\u0186\u0187\7e\2\2\u0187\u0188\7q\2\2\u0188\u0189\7p\2\2\u0189"+
		"\u018a\7u\2\2\u018a\u018b\7v\2\2\u018b\u018c\7c\2\2\u018c\u018d\7p\2\2"+
		"\u018d\u018e\7v\2\2\u018e\u018f\7u\2\2\u018fX\3\2\2\2\u0190\u0191\7h\2"+
		"\2\u0191\u0192\7e\2\2\u0192\u0193\7q\2\2\u0193\u0194\7p\2\2\u0194\u0195"+
		"\7u\2\2\u0195\u0196\7v\2\2\u0196\u0197\7c\2\2\u0197\u0198\7p\2\2\u0198"+
		"\u0199\7v\2\2\u0199\u019a\7u\2\2\u019aZ\3\2\2\2\u019b\u019c\7v\2\2\u019c"+
		"\u019d\7k\2\2\u019d\u019e\7r\2\2\u019e\u019f\7w\2\2\u019f\u01a0\7u\2\2"+
		"\u01a0\\\3\2\2\2\u01a1\u01a2\7h\2\2\u01a2\u01a3\7v\2\2\u01a3\u01a4\7k"+
		"\2\2\u01a4\u01a5\7r\2\2\u01a5\u01a6\7w\2\2\u01a6\u01a7\7u\2\2\u01a7^\3"+
		"\2\2\2\u01a8\u01a9\7x\2\2\u01a9\u01aa\7g\2\2\u01aa\u01ab\7e\2\2\u01ab"+
		"\u01ac\7v\2\2\u01ac\u01ad\7q\2\2\u01ad\u01ae\7t\2\2\u01ae`\3\2\2\2\u01af"+
		"\u01b0\7o\2\2\u01b0\u01b1\7k\2\2\u01b1\u01b2\7f\2\2\u01b2\u01b3\7c\2\2"+
		"\u01b3b\3\2\2\2\u01b4\u01b5\7k\2\2\u01b5\u01b6\7p\2\2\u01b6\u01b7\7k\2"+
		"\2\u01b7\u01b8\7e\2\2\u01b8\u01b9\7k\2\2\u01b9d\3\2\2\2\u01ba\u01bb\7"+
		"v\2\2\u01bb\u01bc\7w\2\2\u01bc\u01bd\7r\2\2\u01bd\u01be\7n\2\2\u01be\u01bf"+
		"\7c\2\2\u01bff\3\2\2\2\u01c0\u01c1\7h\2\2\u01c1\u01c2\7v\2\2\u01c2\u01c3"+
		"\7w\2\2\u01c3\u01c4\7r\2\2\u01c4\u01c5\7n\2\2\u01c5\u01c6\7c\2\2\u01c6"+
		"h\3\2\2\2\u01c7\u01c8\7x\2\2\u01c8\u01c9\7c\2\2\u01c9\u01ca\7t\2\2\u01ca"+
		"\u01cb\7k\2\2\u01cb\u01cc\7c\2\2\u01cc\u01cd\7d\2\2\u01cd\u01ce\7n\2\2"+
		"\u01ce\u01cf\7g\2\2\u01cf\u01d0\7u\2\2\u01d0j\3\2\2\2\u01d1\u01d2\7h\2"+
		"\2\u01d2\u01d3\7x\2\2\u01d3\u01d4\7c\2\2\u01d4\u01d5\7t\2\2\u01d5\u01d6"+
		"\7k\2\2\u01d6\u01d7\7c\2\2\u01d7\u01d8\7d\2\2\u01d8\u01d9\7n\2\2\u01d9"+
		"\u01da\7g\2\2\u01da\u01db\7u\2\2\u01dbl\3\2\2\2\u01dc\u01dd\7@\2\2\u01dd"+
		"n\3\2\2\2\u01de\u01df\7>\2\2\u01dfp\3\2\2\2\u01e0\u01e1\7>\2\2\u01e1\u01e2"+
		"\7?\2\2\u01e2r\3\2\2\2\u01e3\u01e4\7@\2\2\u01e4\u01e5\7?\2\2\u01e5t\3"+
		"\2\2\2\u01e6\u01e7\7p\2\2\u01e7\u01e8\7q\2\2\u01e8v\3\2\2\2\u01e9\u01ea"+
		"\7(\2\2\u01eax\3\2\2\2\u01eb\u01ec\7~\2\2\u01ecz\3\2\2\2\u01ed\u01ee\7"+
		"A\2\2\u01ee|\3\2\2\2\u01ef\u01f0\7<\2\2\u01f0~\3\2\2\2\u01f1\u01f2\7g"+
		"\2\2\u01f2\u01f3\7p\2\2\u01f3\u01f4\7v\2\2\u01f4\u01f5\7g\2\2\u01f5\u01f6"+
		"\7t\2\2\u01f6\u0080\3\2\2\2\u01f7\u01f8\7t\2\2\u01f8\u01f9\7g\2\2\u01f9"+
		"\u01fa\7c\2\2\u01fa\u01fb\7n\2\2\u01fb\u0082\3\2\2\2\u01fc\u01fd\7e\2"+
		"\2\u01fd\u01fe\7c\2\2\u01fe\u01ff\7t\2\2\u01ff\u0084\3\2\2\2\u0200\u0201"+
		"\7d\2\2\u0201\u0202\7q\2\2\u0202\u0203\7q\2\2\u0203\u0204\7n\2\2\u0204"+
		"\u0205\7g\2\2\u0205\u0206\7c\2\2\u0206\u0086\3\2\2\2\u0207\u0208\7f\2"+
		"\2\u0208\u0209\7c\2\2\u0209\u020a\7v\2\2\u020a\u020b\7c\2\2\u020b\u0088"+
		"\3\2\2\2\u020c\u020d\7<\2\2\u020d\u020e\7?\2\2\u020e\u008a\3\2\2\2\u020f"+
		"\u0210\4\63;\2\u0210\u008c\3\2\2\2\u0211\u0212\t\5\2\2\u0212\u008e\3\2"+
		"\2\2\u0213\u0214\4#\u0080\2\u0214\u0090\3\2\2\2\u0215\u0216\7e\2\2\u0216"+
		"\u0217\7g\2\2\u0217\u0218\7t\2\2\u0218\u021f\7v\2\2\u0219\u021a\7h\2\2"+
		"\u021a\u021b\7c\2\2\u021b\u021c\7n\2\2\u021c\u021d\7u\2\2\u021d\u021f"+
		"\7g\2\2\u021e\u0215\3\2\2\2\u021e\u0219\3\2\2\2\u021f\u0092\3\2\2\2\u0220"+
		"\u0223\5\u008bF\2\u0221\u0223\7\62\2\2\u0222\u0220\3\2\2\2\u0222\u0221"+
		"\3\2\2\2\u0223\u0224\3\2\2\2\u0224\u0225\5\u008bF\2\u0225\u0228\7\61\2"+
		"\2\u0226\u0229\5\u008bF\2\u0227\u0229\7\62\2\2\u0228\u0226\3\2\2\2\u0228"+
		"\u0227\3\2\2\2\u0229\u022a\3\2\2\2\u022a\u022b\5\u008bF\2\u022b\u022e"+
		"\7\61\2\2\u022c\u022f\5\u008bF\2\u022d\u022f\7\62\2\2\u022e\u022c\3\2"+
		"\2\2\u022e\u022d\3\2\2\2\u022f\u0232\3\2\2\2\u0230\u0233\5\u008bF\2\u0231"+
		"\u0233\7\62\2\2\u0232\u0230\3\2\2\2\u0232\u0231\3\2\2\2\u0233\u0236\3"+
		"\2\2\2\u0234\u0237\5\u008bF\2\u0235\u0237\7\62\2\2\u0236\u0234\3\2\2\2"+
		"\u0236\u0235\3\2\2\2\u0237\u023a\3\2\2\2\u0238\u023b\5\u008bF\2\u0239"+
		"\u023b\7\62\2\2\u023a\u0238\3\2\2\2\u023a\u0239\3\2\2\2\u023b\u0094\3"+
		"\2\2\2\u023c\u023d\7\62\2\2\u023d\u0096\3\2\2\2\u023e\u0243\5\u008bF\2"+
		"\u023f\u0242\5\u008bF\2\u0240\u0242\7\62\2\2\u0241\u023f\3\2\2\2\u0241"+
		"\u0240\3\2\2\2\u0242\u0245\3\2\2\2\u0243\u0241\3\2\2\2\u0243\u0244\3\2"+
		"\2\2\u0244\u0098\3\2\2\2\u0245\u0243\3\2\2\2\u0246\u024c\5\u008dG\2\u0247"+
		"\u024b\5\u008dG\2\u0248\u024b\5\u008bF\2\u0249\u024b\t\6\2\2\u024a\u0247"+
		"\3\2\2\2\u024a\u0248\3\2\2\2\u024a\u0249\3\2\2\2\u024b\u024e\3\2\2\2\u024c"+
		"\u024a\3\2\2\2\u024c\u024d\3\2\2\2\u024d\u009a\3\2\2\2\u024e\u024c\3\2"+
		"\2\2\u024f\u0252\5\u008bF\2\u0250\u0252\7\62\2\2\u0251\u024f\3\2\2\2\u0251"+
		"\u0250\3\2\2\2\u0252\u0255\3\2\2\2\u0253\u0251\3\2\2\2\u0253\u0254\3\2"+
		"\2\2\u0254\u0256\3\2\2\2\u0255\u0253\3\2\2\2\u0256\u025b\7\60\2\2\u0257"+
		"\u025a\5\u008bF\2\u0258\u025a\7\62\2\2\u0259\u0257\3\2\2\2\u0259\u0258"+
		"\3\2\2\2\u025a\u025d\3\2\2\2\u025b\u0259\3\2\2\2\u025b\u025c\3\2\2\2\u025c"+
		"\u0264\3\2\2\2\u025d\u025b\3\2\2\2\u025e\u0262\7G\2\2\u025f\u0260\7G\2"+
		"\2\u0260\u0262\7/\2\2\u0261\u025e\3\2\2\2\u0261\u025f\3\2\2\2\u0262\u0263"+
		"\3\2\2\2\u0263\u0265\5\u0097L\2\u0264\u0261\3\2\2\2\u0264\u0265\3\2\2"+
		"\2\u0265\u009c\3\2\2\2\u0266\u0269\7)\2\2\u0267\u026a\5\u008fH\2\u0268"+
		"\u026a\7\"\2\2\u0269\u0267\3\2\2\2\u0269\u0268\3\2\2\2\u026a\u026b\3\2"+
		"\2\2\u026b\u026c\7)\2\2\u026c\u009e\3\2\2\2\u026d\u0272\7$\2\2\u026e\u0271"+
		"\5\u008fH\2\u026f\u0271\7\"\2\2\u0270\u026e\3\2\2\2\u0270\u026f\3\2\2"+
		"\2\u0271\u0274\3\2\2\2\u0272\u0270\3\2\2\2\u0272\u0273\3\2\2\2\u0273\u0275"+
		"\3\2\2\2\u0274\u0272\3\2\2\2\u0275\u0276\7$\2\2\u0276\u00a0\3\2\2\2\34"+
		"\2\u00aa\u00ac\u00b5\u00b7\u00bc\u021e\u0222\u0228\u022e\u0232\u0236\u023a"+
		"\u0241\u0243\u024a\u024c\u0251\u0253\u0259\u025b\u0261\u0264\u0269\u0270"+
		"\u0272\4\b\2\2\3\24\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}