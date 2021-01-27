// Generated from C:/Users/arnau/OneDrive/UdG/Quart/Compiladors/Pràctiques/Tokens\main.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link mainParser}.
 */
public interface mainListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link mainParser#inici}.
	 * @param ctx the parse tree
	 */
	void enterInici(mainParser.IniciContext ctx);
	/**
	 * Exit a parse tree produced by {@link mainParser#inici}.
	 * @param ctx the parse tree
	 */
	void exitInici(mainParser.IniciContext ctx);
	/**
	 * Enter a parse tree produced by {@link mainParser#blocDeclaracioConstants}.
	 * @param ctx the parse tree
	 */
	void enterBlocDeclaracioConstants(mainParser.BlocDeclaracioConstantsContext ctx);
	/**
	 * Exit a parse tree produced by {@link mainParser#blocDeclaracioConstants}.
	 * @param ctx the parse tree
	 */
	void exitBlocDeclaracioConstants(mainParser.BlocDeclaracioConstantsContext ctx);
	/**
	 * Enter a parse tree produced by {@link mainParser#variableConstants}.
	 * @param ctx the parse tree
	 */
	void enterVariableConstants(mainParser.VariableConstantsContext ctx);
	/**
	 * Exit a parse tree produced by {@link mainParser#variableConstants}.
	 * @param ctx the parse tree
	 */
	void exitVariableConstants(mainParser.VariableConstantsContext ctx);
	/**
	 * Enter a parse tree produced by {@link mainParser#tipusBasic}.
	 * @param ctx the parse tree
	 */
	void enterTipusBasic(mainParser.TipusBasicContext ctx);
	/**
	 * Exit a parse tree produced by {@link mainParser#tipusBasic}.
	 * @param ctx the parse tree
	 */
	void exitTipusBasic(mainParser.TipusBasicContext ctx);
	/**
	 * Enter a parse tree produced by {@link mainParser#valorTipusBasic}.
	 * @param ctx the parse tree
	 */
	void enterValorTipusBasic(mainParser.ValorTipusBasicContext ctx);
	/**
	 * Exit a parse tree produced by {@link mainParser#valorTipusBasic}.
	 * @param ctx the parse tree
	 */
	void exitValorTipusBasic(mainParser.ValorTipusBasicContext ctx);
	/**
	 * Enter a parse tree produced by {@link mainParser#valorEnter}.
	 * @param ctx the parse tree
	 */
	void enterValorEnter(mainParser.ValorEnterContext ctx);
	/**
	 * Exit a parse tree produced by {@link mainParser#valorEnter}.
	 * @param ctx the parse tree
	 */
	void exitValorEnter(mainParser.ValorEnterContext ctx);
	/**
	 * Enter a parse tree produced by {@link mainParser#blocDeclaracioTipus}.
	 * @param ctx the parse tree
	 */
	void enterBlocDeclaracioTipus(mainParser.BlocDeclaracioTipusContext ctx);
	/**
	 * Exit a parse tree produced by {@link mainParser#blocDeclaracioTipus}.
	 * @param ctx the parse tree
	 */
	void exitBlocDeclaracioTipus(mainParser.BlocDeclaracioTipusContext ctx);
	/**
	 * Enter a parse tree produced by {@link mainParser#tipus}.
	 * @param ctx the parse tree
	 */
	void enterTipus(mainParser.TipusContext ctx);
	/**
	 * Exit a parse tree produced by {@link mainParser#tipus}.
	 * @param ctx the parse tree
	 */
	void exitTipus(mainParser.TipusContext ctx);
	/**
	 * Enter a parse tree produced by {@link mainParser#tipusBasicVector}.
	 * @param ctx the parse tree
	 */
	void enterTipusBasicVector(mainParser.TipusBasicVectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link mainParser#tipusBasicVector}.
	 * @param ctx the parse tree
	 */
	void exitTipusBasicVector(mainParser.TipusBasicVectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link mainParser#tipusBasicTupla}.
	 * @param ctx the parse tree
	 */
	void enterTipusBasicTupla(mainParser.TipusBasicTuplaContext ctx);
	/**
	 * Exit a parse tree produced by {@link mainParser#tipusBasicTupla}.
	 * @param ctx the parse tree
	 */
	void exitTipusBasicTupla(mainParser.TipusBasicTuplaContext ctx);
	/**
	 * Enter a parse tree produced by {@link mainParser#campTupla}.
	 * @param ctx the parse tree
	 */
	void enterCampTupla(mainParser.CampTuplaContext ctx);
	/**
	 * Exit a parse tree produced by {@link mainParser#campTupla}.
	 * @param ctx the parse tree
	 */
	void exitCampTupla(mainParser.CampTuplaContext ctx);
	/**
	 * Enter a parse tree produced by {@link mainParser#blocAccionsFuncions}.
	 * @param ctx the parse tree
	 */
	void enterBlocAccionsFuncions(mainParser.BlocAccionsFuncionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link mainParser#blocAccionsFuncions}.
	 * @param ctx the parse tree
	 */
	void exitBlocAccionsFuncions(mainParser.BlocAccionsFuncionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link mainParser#declaracioFuncio}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracioFuncio(mainParser.DeclaracioFuncioContext ctx);
	/**
	 * Exit a parse tree produced by {@link mainParser#declaracioFuncio}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracioFuncio(mainParser.DeclaracioFuncioContext ctx);
	/**
	 * Enter a parse tree produced by {@link mainParser#parametres}.
	 * @param ctx the parse tree
	 */
	void enterParametres(mainParser.ParametresContext ctx);
	/**
	 * Exit a parse tree produced by {@link mainParser#parametres}.
	 * @param ctx the parse tree
	 */
	void exitParametres(mainParser.ParametresContext ctx);
	/**
	 * Enter a parse tree produced by {@link mainParser#parametre}.
	 * @param ctx the parse tree
	 */
	void enterParametre(mainParser.ParametreContext ctx);
	/**
	 * Exit a parse tree produced by {@link mainParser#parametre}.
	 * @param ctx the parse tree
	 */
	void exitParametre(mainParser.ParametreContext ctx);
	/**
	 * Enter a parse tree produced by {@link mainParser#declaracioAccio}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracioAccio(mainParser.DeclaracioAccioContext ctx);
	/**
	 * Exit a parse tree produced by {@link mainParser#declaracioAccio}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracioAccio(mainParser.DeclaracioAccioContext ctx);
	/**
	 * Enter a parse tree produced by {@link mainParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(mainParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link mainParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(mainParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link mainParser#blocDeclaracioVariables}.
	 * @param ctx the parse tree
	 */
	void enterBlocDeclaracioVariables(mainParser.BlocDeclaracioVariablesContext ctx);
	/**
	 * Exit a parse tree produced by {@link mainParser#blocDeclaracioVariables}.
	 * @param ctx the parse tree
	 */
	void exitBlocDeclaracioVariables(mainParser.BlocDeclaracioVariablesContext ctx);
	/**
	 * Enter a parse tree produced by {@link mainParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(mainParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link mainParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(mainParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link mainParser#ifThenElse}.
	 * @param ctx the parse tree
	 */
	void enterIfThenElse(mainParser.IfThenElseContext ctx);
	/**
	 * Exit a parse tree produced by {@link mainParser#ifThenElse}.
	 * @param ctx the parse tree
	 */
	void exitIfThenElse(mainParser.IfThenElseContext ctx);
	/**
	 * Enter a parse tree produced by {@link mainParser#expressio}.
	 * @param ctx the parse tree
	 */
	void enterExpressio(mainParser.ExpressioContext ctx);
	/**
	 * Exit a parse tree produced by {@link mainParser#expressio}.
	 * @param ctx the parse tree
	 */
	void exitExpressio(mainParser.ExpressioContext ctx);
	/**
	 * Enter a parse tree produced by {@link mainParser#expressio2}.
	 * @param ctx the parse tree
	 */
	void enterExpressio2(mainParser.Expressio2Context ctx);
	/**
	 * Exit a parse tree produced by {@link mainParser#expressio2}.
	 * @param ctx the parse tree
	 */
	void exitExpressio2(mainParser.Expressio2Context ctx);
	/**
	 * Enter a parse tree produced by {@link mainParser#operadorsBooleans}.
	 * @param ctx the parse tree
	 */
	void enterOperadorsBooleans(mainParser.OperadorsBooleansContext ctx);
	/**
	 * Exit a parse tree produced by {@link mainParser#operadorsBooleans}.
	 * @param ctx the parse tree
	 */
	void exitOperadorsBooleans(mainParser.OperadorsBooleansContext ctx);
	/**
	 * Enter a parse tree produced by {@link mainParser#expressio3}.
	 * @param ctx the parse tree
	 */
	void enterExpressio3(mainParser.Expressio3Context ctx);
	/**
	 * Exit a parse tree produced by {@link mainParser#expressio3}.
	 * @param ctx the parse tree
	 */
	void exitExpressio3(mainParser.Expressio3Context ctx);
	/**
	 * Enter a parse tree produced by {@link mainParser#expressio4}.
	 * @param ctx the parse tree
	 */
	void enterExpressio4(mainParser.Expressio4Context ctx);
	/**
	 * Exit a parse tree produced by {@link mainParser#expressio4}.
	 * @param ctx the parse tree
	 */
	void exitExpressio4(mainParser.Expressio4Context ctx);
	/**
	 * Enter a parse tree produced by {@link mainParser#expressio5}.
	 * @param ctx the parse tree
	 */
	void enterExpressio5(mainParser.Expressio5Context ctx);
	/**
	 * Exit a parse tree produced by {@link mainParser#expressio5}.
	 * @param ctx the parse tree
	 */
	void exitExpressio5(mainParser.Expressio5Context ctx);
	/**
	 * Enter a parse tree produced by {@link mainParser#expressio6}.
	 * @param ctx the parse tree
	 */
	void enterExpressio6(mainParser.Expressio6Context ctx);
	/**
	 * Exit a parse tree produced by {@link mainParser#expressio6}.
	 * @param ctx the parse tree
	 */
	void exitExpressio6(mainParser.Expressio6Context ctx);
	/**
	 * Enter a parse tree produced by {@link mainParser#valor}.
	 * @param ctx the parse tree
	 */
	void enterValor(mainParser.ValorContext ctx);
	/**
	 * Exit a parse tree produced by {@link mainParser#valor}.
	 * @param ctx the parse tree
	 */
	void exitValor(mainParser.ValorContext ctx);
	/**
	 * Enter a parse tree produced by {@link mainParser#accesTupla}.
	 * @param ctx the parse tree
	 */
	void enterAccesTupla(mainParser.AccesTuplaContext ctx);
	/**
	 * Exit a parse tree produced by {@link mainParser#accesTupla}.
	 * @param ctx the parse tree
	 */
	void exitAccesTupla(mainParser.AccesTuplaContext ctx);
	/**
	 * Enter a parse tree produced by {@link mainParser#accesVector}.
	 * @param ctx the parse tree
	 */
	void enterAccesVector(mainParser.AccesVectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link mainParser#accesVector}.
	 * @param ctx the parse tree
	 */
	void exitAccesVector(mainParser.AccesVectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link mainParser#cridaFuncio}.
	 * @param ctx the parse tree
	 */
	void enterCridaFuncio(mainParser.CridaFuncioContext ctx);
	/**
	 * Exit a parse tree produced by {@link mainParser#cridaFuncio}.
	 * @param ctx the parse tree
	 */
	void exitCridaFuncio(mainParser.CridaFuncioContext ctx);
	/**
	 * Enter a parse tree produced by {@link mainParser#sentencia}.
	 * @param ctx the parse tree
	 */
	void enterSentencia(mainParser.SentenciaContext ctx);
	/**
	 * Exit a parse tree produced by {@link mainParser#sentencia}.
	 * @param ctx the parse tree
	 */
	void exitSentencia(mainParser.SentenciaContext ctx);
	/**
	 * Enter a parse tree produced by {@link mainParser#asignacio}.
	 * @param ctx the parse tree
	 */
	void enterAsignacio(mainParser.AsignacioContext ctx);
	/**
	 * Exit a parse tree produced by {@link mainParser#asignacio}.
	 * @param ctx the parse tree
	 */
	void exitAsignacio(mainParser.AsignacioContext ctx);
	/**
	 * Enter a parse tree produced by {@link mainParser#condicional}.
	 * @param ctx the parse tree
	 */
	void enterCondicional(mainParser.CondicionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link mainParser#condicional}.
	 * @param ctx the parse tree
	 */
	void exitCondicional(mainParser.CondicionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link mainParser#per}.
	 * @param ctx the parse tree
	 */
	void enterPer(mainParser.PerContext ctx);
	/**
	 * Exit a parse tree produced by {@link mainParser#per}.
	 * @param ctx the parse tree
	 */
	void exitPer(mainParser.PerContext ctx);
	/**
	 * Enter a parse tree produced by {@link mainParser#mentre}.
	 * @param ctx the parse tree
	 */
	void enterMentre(mainParser.MentreContext ctx);
	/**
	 * Exit a parse tree produced by {@link mainParser#mentre}.
	 * @param ctx the parse tree
	 */
	void exitMentre(mainParser.MentreContext ctx);
	/**
	 * Enter a parse tree produced by {@link mainParser#cridaAccio}.
	 * @param ctx the parse tree
	 */
	void enterCridaAccio(mainParser.CridaAccioContext ctx);
	/**
	 * Exit a parse tree produced by {@link mainParser#cridaAccio}.
	 * @param ctx the parse tree
	 */
	void exitCridaAccio(mainParser.CridaAccioContext ctx);
	/**
	 * Enter a parse tree produced by {@link mainParser#llegir}.
	 * @param ctx the parse tree
	 */
	void enterLlegir(mainParser.LlegirContext ctx);
	/**
	 * Exit a parse tree produced by {@link mainParser#llegir}.
	 * @param ctx the parse tree
	 */
	void exitLlegir(mainParser.LlegirContext ctx);
	/**
	 * Enter a parse tree produced by {@link mainParser#escriure}.
	 * @param ctx the parse tree
	 */
	void enterEscriure(mainParser.EscriureContext ctx);
	/**
	 * Exit a parse tree produced by {@link mainParser#escriure}.
	 * @param ctx the parse tree
	 */
	void exitEscriure(mainParser.EscriureContext ctx);
	/**
	 * Enter a parse tree produced by {@link mainParser#escriureln}.
	 * @param ctx the parse tree
	 */
	void enterEscriureln(mainParser.EscriurelnContext ctx);
	/**
	 * Exit a parse tree produced by {@link mainParser#escriureln}.
	 * @param ctx the parse tree
	 */
	void exitEscriureln(mainParser.EscriurelnContext ctx);
	/**
	 * Enter a parse tree produced by {@link mainParser#blocImplementacio}.
	 * @param ctx the parse tree
	 */
	void enterBlocImplementacio(mainParser.BlocImplementacioContext ctx);
	/**
	 * Exit a parse tree produced by {@link mainParser#blocImplementacio}.
	 * @param ctx the parse tree
	 */
	void exitBlocImplementacio(mainParser.BlocImplementacioContext ctx);
	/**
	 * Enter a parse tree produced by {@link mainParser#implementacioAccio}.
	 * @param ctx the parse tree
	 */
	void enterImplementacioAccio(mainParser.ImplementacioAccioContext ctx);
	/**
	 * Exit a parse tree produced by {@link mainParser#implementacioAccio}.
	 * @param ctx the parse tree
	 */
	void exitImplementacioAccio(mainParser.ImplementacioAccioContext ctx);
	/**
	 * Enter a parse tree produced by {@link mainParser#implementacioFuncio}.
	 * @param ctx the parse tree
	 */
	void enterImplementacioFuncio(mainParser.ImplementacioFuncioContext ctx);
	/**
	 * Exit a parse tree produced by {@link mainParser#implementacioFuncio}.
	 * @param ctx the parse tree
	 */
	void exitImplementacioFuncio(mainParser.ImplementacioFuncioContext ctx);
}