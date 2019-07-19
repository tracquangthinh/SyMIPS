// Generated from MIPS.g4 by ANTLR 4.7.2
package symips.parse;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MIPSParser}.
 */
public interface MIPSListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MIPSParser#code}.
	 * @param ctx the parse tree
	 */
	void enterCode(MIPSParser.CodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MIPSParser#code}.
	 * @param ctx the parse tree
	 */
	void exitCode(MIPSParser.CodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MIPSParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(MIPSParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MIPSParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(MIPSParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MIPSParser#simpleStatement}.
	 * @param ctx the parse tree
	 */
	void enterSimpleStatement(MIPSParser.SimpleStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MIPSParser#simpleStatement}.
	 * @param ctx the parse tree
	 */
	void exitSimpleStatement(MIPSParser.SimpleStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MIPSParser#structuredStatement}.
	 * @param ctx the parse tree
	 */
	void enterStructuredStatement(MIPSParser.StructuredStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MIPSParser#structuredStatement}.
	 * @param ctx the parse tree
	 */
	void exitStructuredStatement(MIPSParser.StructuredStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MIPSParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void enterParameterList(MIPSParser.ParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link MIPSParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void exitParameterList(MIPSParser.ParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link MIPSParser#assignmentStatement}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentStatement(MIPSParser.AssignmentStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MIPSParser#assignmentStatement}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentStatement(MIPSParser.AssignmentStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MIPSParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(MIPSParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MIPSParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(MIPSParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MIPSParser#indexing}.
	 * @param ctx the parse tree
	 */
	void enterIndexing(MIPSParser.IndexingContext ctx);
	/**
	 * Exit a parse tree produced by {@link MIPSParser#indexing}.
	 * @param ctx the parse tree
	 */
	void exitIndexing(MIPSParser.IndexingContext ctx);
	/**
	 * Enter a parse tree produced by {@link MIPSParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(MIPSParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MIPSParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(MIPSParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MIPSParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(MIPSParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link MIPSParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(MIPSParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link MIPSParser#funcCall}.
	 * @param ctx the parse tree
	 */
	void enterFuncCall(MIPSParser.FuncCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link MIPSParser#funcCall}.
	 * @param ctx the parse tree
	 */
	void exitFuncCall(MIPSParser.FuncCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link MIPSParser#unsignedConstant}.
	 * @param ctx the parse tree
	 */
	void enterUnsignedConstant(MIPSParser.UnsignedConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link MIPSParser#unsignedConstant}.
	 * @param ctx the parse tree
	 */
	void exitUnsignedConstant(MIPSParser.UnsignedConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link MIPSParser#conditionalStatement}.
	 * @param ctx the parse tree
	 */
	void enterConditionalStatement(MIPSParser.ConditionalStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MIPSParser#conditionalStatement}.
	 * @param ctx the parse tree
	 */
	void exitConditionalStatement(MIPSParser.ConditionalStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MIPSParser#forLoopStatement}.
	 * @param ctx the parse tree
	 */
	void enterForLoopStatement(MIPSParser.ForLoopStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MIPSParser#forLoopStatement}.
	 * @param ctx the parse tree
	 */
	void exitForLoopStatement(MIPSParser.ForLoopStatementContext ctx);
}