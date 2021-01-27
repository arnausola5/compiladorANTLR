// Generated from C:/Users/arnau/OneDrive/UdG/Quart/Compiladors/Pràctiques/Tokens\main.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link mainParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface mainVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link mainParser#inici}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInici(mainParser.IniciContext ctx);
	/**
	 * Visit a parse tree produced by {@link mainParser#blocDeclaracioConstants}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlocDeclaracioConstants(mainParser.BlocDeclaracioConstantsContext ctx);
	/**
	 * Visit a parse tree produced by {@link mainParser#variableConstants}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableConstants(mainParser.VariableConstantsContext ctx);
	/**
	 * Visit a parse tree produced by {@link mainParser#tipusBasic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipusBasic(mainParser.TipusBasicContext ctx);
	/**
	 * Visit a parse tree produced by {@link mainParser#valorTipusBasic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValorTipusBasic(mainParser.ValorTipusBasicContext ctx);
	/**
	 * Visit a parse tree produced by {@link mainParser#valorEnter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValorEnter(mainParser.ValorEnterContext ctx);
	/**
	 * Visit a parse tree produced by {@link mainParser#blocDeclaracioTipus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlocDeclaracioTipus(mainParser.BlocDeclaracioTipusContext ctx);
	/**
	 * Visit a parse tree produced by {@link mainParser#tipus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipus(mainParser.TipusContext ctx);
	/**
	 * Visit a parse tree produced by {@link mainParser#tipusBasicVector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipusBasicVector(mainParser.TipusBasicVectorContext ctx);
	/**
	 * Visit a parse tree produced by {@link mainParser#tipusBasicTupla}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipusBasicTupla(mainParser.TipusBasicTuplaContext ctx);
	/**
	 * Visit a parse tree produced by {@link mainParser#campTupla}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCampTupla(mainParser.CampTuplaContext ctx);
	/**
	 * Visit a parse tree produced by {@link mainParser#blocAccionsFuncions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlocAccionsFuncions(mainParser.BlocAccionsFuncionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link mainParser#declaracioFuncio}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracioFuncio(mainParser.DeclaracioFuncioContext ctx);
	/**
	 * Visit a parse tree produced by {@link mainParser#parametres}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametres(mainParser.ParametresContext ctx);
	/**
	 * Visit a parse tree produced by {@link mainParser#parametre}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametre(mainParser.ParametreContext ctx);
	/**
	 * Visit a parse tree produced by {@link mainParser#declaracioAccio}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracioAccio(mainParser.DeclaracioAccioContext ctx);
	/**
	 * Visit a parse tree produced by {@link mainParser#programa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrograma(mainParser.ProgramaContext ctx);
	/**
	 * Visit a parse tree produced by {@link mainParser#blocDeclaracioVariables}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlocDeclaracioVariables(mainParser.BlocDeclaracioVariablesContext ctx);
	/**
	 * Visit a parse tree produced by {@link mainParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(mainParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link mainParser#ifThenElse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfThenElse(mainParser.IfThenElseContext ctx);
	/**
	 * Visit a parse tree produced by {@link mainParser#expressio}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressio(mainParser.ExpressioContext ctx);
	/**
	 * Visit a parse tree produced by {@link mainParser#expressio2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressio2(mainParser.Expressio2Context ctx);
	/**
	 * Visit a parse tree produced by {@link mainParser#operadorsBooleans}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperadorsBooleans(mainParser.OperadorsBooleansContext ctx);
	/**
	 * Visit a parse tree produced by {@link mainParser#expressio3}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressio3(mainParser.Expressio3Context ctx);
	/**
	 * Visit a parse tree produced by {@link mainParser#expressio4}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressio4(mainParser.Expressio4Context ctx);
	/**
	 * Visit a parse tree produced by {@link mainParser#expressio5}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressio5(mainParser.Expressio5Context ctx);
	/**
	 * Visit a parse tree produced by {@link mainParser#expressio6}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressio6(mainParser.Expressio6Context ctx);
	/**
	 * Visit a parse tree produced by {@link mainParser#valor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValor(mainParser.ValorContext ctx);
	/**
	 * Visit a parse tree produced by {@link mainParser#accesTupla}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccesTupla(mainParser.AccesTuplaContext ctx);
	/**
	 * Visit a parse tree produced by {@link mainParser#accesVector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccesVector(mainParser.AccesVectorContext ctx);
	/**
	 * Visit a parse tree produced by {@link mainParser#cridaFuncio}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCridaFuncio(mainParser.CridaFuncioContext ctx);
	/**
	 * Visit a parse tree produced by {@link mainParser#sentencia}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentencia(mainParser.SentenciaContext ctx);
	/**
	 * Visit a parse tree produced by {@link mainParser#asignacio}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsignacio(mainParser.AsignacioContext ctx);
	/**
	 * Visit a parse tree produced by {@link mainParser#condicional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondicional(mainParser.CondicionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link mainParser#per}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPer(mainParser.PerContext ctx);
	/**
	 * Visit a parse tree produced by {@link mainParser#mentre}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMentre(mainParser.MentreContext ctx);
	/**
	 * Visit a parse tree produced by {@link mainParser#cridaAccio}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCridaAccio(mainParser.CridaAccioContext ctx);
	/**
	 * Visit a parse tree produced by {@link mainParser#llegir}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLlegir(mainParser.LlegirContext ctx);
	/**
	 * Visit a parse tree produced by {@link mainParser#escriure}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEscriure(mainParser.EscriureContext ctx);
	/**
	 * Visit a parse tree produced by {@link mainParser#escriureln}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEscriureln(mainParser.EscriurelnContext ctx);
	/**
	 * Visit a parse tree produced by {@link mainParser#blocImplementacio}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlocImplementacio(mainParser.BlocImplementacioContext ctx);
	/**
	 * Visit a parse tree produced by {@link mainParser#implementacioAccio}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImplementacioAccio(mainParser.ImplementacioAccioContext ctx);
	/**
	 * Visit a parse tree produced by {@link mainParser#implementacioFuncio}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImplementacioFuncio(mainParser.ImplementacioFuncioContext ctx);
}