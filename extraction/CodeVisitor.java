package extraction;

import symips.parse.MIPSBaseVisitor;
import symips.parse.MIPSParser;

import java.util.ArrayList;
import java.util.Arrays;

public class CodeVisitor extends MIPSBaseVisitor<String> {
    final String[] REGISTER_CONSTANT = {"rd", "rs", "rt", "hi", "lo", "re"};
    @Override
    public String visitCode(MIPSParser.CodeContext ctx){
        String result = "";
        for(int i = 0; i < ctx.getChildCount(); i++){
            result += this.visit(ctx.getChild((i)));
        }
        return result.replace("null", "");
    }
    @Override
    public String visitStatement(MIPSParser.StatementContext ctx){
        return this.visit(ctx.getChild(0));
    }

    @Override
    public String visitConditionalStatement(MIPSParser.ConditionalStatementContext ctx){
        String result = "if(";
        result += this.visit(ctx.getChild(1)) + "){\n";
        result += "\t" + this.visit(ctx.getChild(3)).replace("BitVec ", "");
        switch (ctx.getChildCount()){
            case 5: result += "}\n"; break;
            case 7:
                result += "} else {\n";
                result += "\t" + this.visit(ctx.getChild(5)) + "}\n";
                break;
            default: result += "}\n"; break;
        }
        return result;
    }

    @Override
    public String visitForLoopStatement(MIPSParser.ForLoopStatementContext ctx){
        String variable = ctx.IDENT().getText();
        String result = "for(int " + variable + " = ";
        result += this.visit(ctx.getChild(6)) + "; " + variable + " < " + this.visit(ctx.getChild(4));
        result += "; " + variable + "++){\n";
        result += this.visit(ctx.getChild(8)) + "\n}";
        return result;
    }

    @Override
    public String visitSimpleStatement(MIPSParser.SimpleStatementContext ctx){
        return this.visit(ctx.getChild(0)) + ";\n";
    }

    @Override
    public String visitAssignmentStatement(MIPSParser.AssignmentStatementContext ctx){
        final String expr1 = this.visit(ctx.getChild((0)));
        String result;
        String rightExpr = this.visit(ctx.getChild(2));
        if(Arrays.asList(this.REGISTER_CONSTANT).contains(expr1.toLowerCase())){
           result = "write(" + expr1 + "," + rightExpr + ")";
        } else {
            String type = "BitVec";
            if(rightExpr.contains("sa") || rightExpr.matches("[-+]?\\d*\\.?\\d+")){
                type = "int";
            } else if(rightExpr.contains("cond")){
                type = "boolean";
            }
            result = type + " " + expr1 + " = " + rightExpr;
        }
//        System.out.println(result);
        return result;
    }
    @Override
    public String visitFuncCall(MIPSParser.FuncCallContext ctx){
//        System.out.println(ctx.parameterList().children.get(0).getText());
//        return "Hi" + this.visit(ctx.parameterList());
        String params = "";
        if(ctx.parameterList() != null) {
            params = this.visitParameterList(ctx.parameterList());
        }
//        System.out.println(ctx.IDENT().getText());
        String result = ctx.IDENT().getText() + "(" + params + ")";
//        System.out.println(result);
        return result;
    }

    @Override
    public String visitParameterList(MIPSParser.ParameterListContext ctx){
        ArrayList<String> params = new ArrayList<String>();
        for(int i = 0; i < ctx.getChildCount(); i++){
            String child = this.visit(ctx.getChild(i));
            if(child != null){
                    params.add(child);
            }
        }
        String result = String.join(", ", params);
//        System.out.println(result);
        return result;
    }

    @Override
    public String visitIndexing(MIPSParser.IndexingContext ctx){
        String ident = this.visit(ctx.identifier());
        String result = "";
        if(Arrays.asList(this.REGISTER_CONSTANT).contains(ident.toLowerCase())){
            result += "val(" + ident +")";
        } else {
            result += ident;
        }
        result += ".get(";
        if(ctx.getChildCount() == 6){
            String index1 = this.visit(ctx.getChild(2));
            String index2 = this.visit(ctx.getChild(4));
            result += index2 + ", " + index1 + ")";
        }else{
            String index = this.visit(ctx.getChild(2));
            result += index + ")";
        }
        return result;
    }

    @Override
    public String visitExpression(MIPSParser.ExpressionContext ctx){
        if(ctx.factor() != null){
//            System.out.println(ctx.factor().getText());
            return this.visit(ctx.factor());
        }else{
            String sign = ctx.getChild(1).getText();
            String leftSide = this.visit(ctx.getChild(0));
            String rightSide = this.visit(ctx.getChild(2));

            if(Arrays.asList(this.REGISTER_CONSTANT).contains(leftSide.toLowerCase())){
                leftSide = "val(" + leftSide + ")";
            }

            if(Arrays.asList(this.REGISTER_CONSTANT).contains(rightSide.toLowerCase())){
                rightSide= "val(" + rightSide + ")";
            }

            String params = leftSide + ", " + rightSide;
            String result = "";
            switch (sign){
                case "+": result += "add(" + params + ")"; break;
                case "-": result += "subtract(" + params + ")"; break;
                case "×": result += "multiply(" + params + ")"; break;
                case "*": result += "multiply(" + params + ")"; break;
                case "or": result += "or(" + params + ")";  break;
                case "and": result += "and(" + params + ")"; break;
                case "&": result += "and(" + params + ")"; break;
                case "nor": result += "nor(" + params + ")"; break;
                case "xor": result += "xor(" + params + ")"; break;
                case "div": result += "div(" + params + ")"; break;
                case "mod": result += "mod(" + params + ")"; break;
                case "||": result += "concat(" + params + ")"; break;
                case "=": result += "equal(" + params + ")"; break;
                case "≠": result += "notEqual(" + params + ")"; break;
                case "←":
                    result = "";
                    result = this.visit(ctx.getChild(0)) + " = " + this.visit(ctx.getChild(2)); break;
                case "^": result += "power(" + params + ")";break;
                case "<": result += "less(" + params +")"; break;
                case ">": result += "greater(" + params +")"; break;
                case "≤": result += "lessOrEqual(" + params +")"; break;
                case "≥": result += "greaterOrEqual(" + params +")"; break;
                case ">>": result += "shiftRight(" + params + ")"; break;
                case "<<": result += "shiftLeft(" + params + ")"; break;

            }
//            System.out.println(result);
            return result;
        }
    }

    @Override
    public String visitFactor(MIPSParser.FactorContext ctx){
        if(ctx.getChildCount() > 1){
            return this.visit(ctx.getChild(1));
        }else{
            return this.visit(ctx.getChild(0));
        }
    }

    @Override
    public  String visitIdentifier(MIPSParser.IdentifierContext ctx){
        return ctx.IDENT().getText();
    }

    @Override
    public String visitUnsignedConstant(MIPSParser.UnsignedConstantContext ctx){
        return ctx.NUMBER().getText();
    }
}
