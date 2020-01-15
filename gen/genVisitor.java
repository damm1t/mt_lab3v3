// Generated from /home/damm1t/IdeaProjects/mt_lab3/src/gen.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link genParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface genVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link genParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(genParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link genParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(genParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link genParser#returnValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnValue(genParser.ReturnValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link genParser#header}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHeader(genParser.HeaderContext ctx);
	/**
	 * Visit a parse tree produced by {@link genParser#variables}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariables(genParser.VariablesContext ctx);
	/**
	 * Visit a parse tree produced by {@link genParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(genParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link genParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(genParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link genParser#op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp(genParser.OpContext ctx);
	/**
	 * Visit a parse tree produced by {@link genParser#commands}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommands(genParser.CommandsContext ctx);
	/**
	 * Visit a parse tree produced by {@link genParser#command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommand(genParser.CommandContext ctx);
	/**
	 * Visit a parse tree produced by {@link genParser#arithmetic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmetic(genParser.ArithmeticContext ctx);
}