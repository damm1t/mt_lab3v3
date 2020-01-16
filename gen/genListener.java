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
	 * Enter a parse tree produced by {@link genParser#returnValue}.
	 * @param ctx the parse tree
	 */
	void enterReturnValue(genParser.ReturnValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link genParser#returnValue}.
	 * @param ctx the parse tree
	 */
	void exitReturnValue(genParser.ReturnValueContext ctx);
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
	 * Enter a parse tree produced by {@link genParser#curwa}.
	 * @param ctx the parse tree
	 */
	void enterCurwa(genParser.CurwaContext ctx);
	/**
	 * Exit a parse tree produced by {@link genParser#curwa}.
	 * @param ctx the parse tree
	 */
	void exitCurwa(genParser.CurwaContext ctx);
	/**
	 * Enter a parse tree produced by {@link genParser#els}.
	 * @param ctx the parse tree
	 */
	void enterEls(genParser.ElsContext ctx);
	/**
	 * Exit a parse tree produced by {@link genParser#els}.
	 * @param ctx the parse tree
	 */
	void exitEls(genParser.ElsContext ctx);
	/**
	 * Enter a parse tree produced by {@link genParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(genParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link genParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(genParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link genParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCond(genParser.CondContext ctx);
	/**
	 * Exit a parse tree produced by {@link genParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCond(genParser.CondContext ctx);
	/**
	 * Enter a parse tree produced by {@link genParser#part}.
	 * @param ctx the parse tree
	 */
	void enterPart(genParser.PartContext ctx);
	/**
	 * Exit a parse tree produced by {@link genParser#part}.
	 * @param ctx the parse tree
	 */
	void exitPart(genParser.PartContext ctx);
	/**
	 * Enter a parse tree produced by {@link genParser#boolOp}.
	 * @param ctx the parse tree
	 */
	void enterBoolOp(genParser.BoolOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link genParser#boolOp}.
	 * @param ctx the parse tree
	 */
	void exitBoolOp(genParser.BoolOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link genParser#condOp}.
	 * @param ctx the parse tree
	 */
	void enterCondOp(genParser.CondOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link genParser#condOp}.
	 * @param ctx the parse tree
	 */
	void exitCondOp(genParser.CondOpContext ctx);
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