package extraction;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import symips.parse.MIPSLexer;
import symips.parse.MIPSParser;
import symips.utils.Logs;

public class Main {
    public static String pseudoFuncToJava(String pseudocode){
        pseudocode = pseudocode.replace("MIPS32 Release 5", "").replace("MIPS32", "");
        String inst = pseudocode.split(" ")[0];
        String params = pseudocode.replace(inst+" ", "");
        String[] paramsList = params.split(",");
//        System.out.println(String.join(", ", paramsList));
        for(int i = 0 ; i < paramsList.length ; i++){
            String type = "";
            if(paramsList[i].contains("immediate")){
                type = "int ";
            } else if(paramsList[i].contains("r")){
                type = "Character ";
            } else if(paramsList[i].contains("sa")){
                type = "int ";
            } else if(paramsList[i].contains("cc")){
                type = "int ";
            }
            paramsList[i] = type + paramsList[i].replace(" ", "");
        }
        params = String.join(", ", paramsList);
        return "public void " + inst.toUpperCase() + "(" + params + "){";
    }

    public static void saveJavaInstruction(ArrayList<String> funcs, ArrayList<String> sources) throws FileNotFoundException {
        try(PrintWriter out = new PrintWriter("symips/emulator/base/MIPS32.java")){
            out.println("package symips.emulator.base;\n");
            out.println("import symips.emulator.semantics.Environment;");
            out.println("import symips.unit.BitVec;");
            out.println("public class MIPS32 extends Emulator{");
            out.println("   public MIPS32(Environment env){ super(env); }\n");

            for(int i = 0 ; i < funcs.size() ; i++){
                out.println(funcs.get(i));
                out.println(sources.get(i));
                out.println("}\n");
            }

            out.println("}");
        }
    }
    public static void main(String[] args) {
        File folder = new File("extraction/pseudoInstructions");
        File[] listOfFiles = folder.listFiles();
        ArrayList<String> instructionFileNames = new ArrayList<>();
        for(int i = 0; i < listOfFiles.length; i++){
//            Logs.infoLn(listOfFiles[i].getName());
            if(listOfFiles[i].getName().indexOf("MIPS32") >= 0){
                instructionFileNames.add(listOfFiles[i].getName());
            }
        }
        System.out.println(instructionFileNames.size());

        ArrayList<String> funcs = new ArrayList<>();
        ArrayList<String> codes = new ArrayList<>();
        try {
            for(int i = 0; i < instructionFileNames.size() ; i++) {
                String instruction = instructionFileNames.get(i);
                System.out.println(instruction);
                MIPSLexer lexer = new MIPSLexer(CharStreams.fromFileName("extraction/pseudoInstructions/" + instruction));
                MIPSParser parser = new MIPSParser(new CommonTokenStream(lexer));
                parser.setBuildParseTree(true);
                ParseTree tree = parser.code();


                CodeVisitor codeVisitor = new CodeVisitor();
                String source = codeVisitor.visit(tree);
                funcs.add(pseudoFuncToJava(instruction));
                codes.add(source);
            }
            saveJavaInstruction(funcs, codes);
        } catch (Exception e) {
            if (e.getMessage() != null) {
                System.err.println(e.getMessage());
            } else {
                e.printStackTrace();
            }
        }
    }

}
