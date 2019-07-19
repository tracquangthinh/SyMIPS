// Generated from MIPS.g4 by ANTLR 4.7.2
package symips.parse;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MIPSParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MIPSVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MIPSParser#code}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCode(MIPSParser.CodeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MIPSParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(MIPSParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MIPSParser#simpleStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleStatement(MIPSParser.SimpleStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MIPSParser#structuredStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructuredStatement(MIPSParser.StructuredStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MIPSParser#parameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterList(MIPSParser.ParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link MIPSParser#assignmentStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentStatement(MIPSParser.AssignmentStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MIPSParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(MIPSParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MIPSParser#indexing}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexing(MIPSParser.IndexingContext ctx);
	/**
	 * Visit a parse tree produced by {@link MIPSParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(MIPSParser.FactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link MIPSParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(MIPSParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link MIPSParser#funcCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncCall(MIPSParser.FuncCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link MIPSParser#unsignedConstant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnsignedConstant(MIPSParser.UnsignedConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link MIPSParser#conditionalStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalStatement(MIPSParser.ConditionalStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MIPSParser#forLoopStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForLoopStatement(MIPSParser.ForLoopStatementContext ctx);
}