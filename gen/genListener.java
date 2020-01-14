// Generated from /home/damm1t/IdeaProjects/mt_lab3/src/gen.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link genParser}.
 */
public interface genListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link genParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(genParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link genParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(genParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link genParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(genParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link genParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(genParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link genParser#header}.
	 * @param ctx the parse tree
	 */
	void enterHeader(genParser.HeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link genParser#header}.
	 * @param ctx the parse tree
	 */
	void exitHeader(genParser.HeaderContext ctx);
	/**
	 * Enter a parse tree produced by {@link genParser#variables}.
	 * @param ctx the parse tree
	 */
	void enterVariables(genParser.VariablesContext ctx);
	/**
	 * Exit a parse tree produced by {@link genParser#variables}.
	 * @param ctx the parse tree
	 */
	void exitVariables(genParser.VariablesContext ctx);
	/**
	 * Enter a parse tree produced by {@link genParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(genParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link genParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(genParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link genParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(genParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link genParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(genParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link genParser#op}.
	 * @param ctx the parse tree
	 */
	void enterOp(genParser.OpContext ctx);
	/**
	 * Exit a parse tree produced by {@link genParser#op}.
	 * @param ctx the parse tree
	 */
	void exitOp(genParser.OpContext ctx);
	/**
	 * Enter a parse tree produced by {@link genParser#commands}.
	 * @param ctx the parse tree
	 */
	void enterCommands(genParser.CommandsContext ctx);
	/**
	 * Exit a parse tree produced by {@link genParser#commands}.
	 * @param ctx the parse tree
	 */
	void exitCommands(genParser.CommandsContext ctx);
	/**
	 * Enter a parse tree produced by {@link genParser#command}.
	 * @param ctx the parse tree
	 */
	void enterCommand(genParser.CommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link genParser#command}.
	 * @param ctx the parse tree
	 */
	void exitCommand(genParser.CommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link genParser#arithmetic}.
	 * @param ctx the parse tree
	 */
	void enterArithmetic(genParser.ArithmeticContext ctx);
	/**
	 * Exit a parse tree produced by {@link genParser#arithmetic}.
	 * @param ctx the parse tree
	 */
	void exitArithmetic(genParser.ArithmeticContext ctx);
}