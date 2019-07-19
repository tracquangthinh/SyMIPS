package symips.utils;

import symips.apps.Configs;

import java.io.File;
import java.util.ArrayList;

public class Z3Solver {

    private static String readDefinedFunc(String func){
        File currentDir = new File(".");
        String parentPath = currentDir.getAbsolutePath();
        parentPath = parentPath.substring(0, parentPath.length() -1);
        String path = parentPath + "symips/smt/bv" + func + ".smt";
        return FileUtils.readFile(path);
    }

    private static String declareEvalAndVars(String eval, ArrayList<String> bvVars) {
        MyStr str = new MyStr();
        for (String v : bvVars) {
            str.append("(declare-const " + v + " (_ BitVec 32))\n");
        }
//        str.append(readDefinedFunc("abs") + "\n");
        str.append("(define-fun bvabs ((x (_ BitVec 8))) (_ BitVec 8)\n");
        str.append("    (if (bvsge x #x00) x (bvsub #x00 x)))\n");
        str.append("(assert (= $zero #x00000000))\n");
        str.append("$mainAssert\n", "(check-sat)\n");
        str.append("(get-model)\n");
        if (eval != null) {
            str.append("(eval " + eval + ")", "\n");
        }
        return str.value();
    }

    public static String checkSAT(String pathConstraint, String eval) {
//        Logs.info("\t-> Checking path constrains by Z3", Logs.shorten(pathConstraint), "... ");
        ArrayList<String> bvVars = new ArrayList<>(Mapping.regStrToChar.keySet());
        String declaration = declareEvalAndVars(eval, bvVars);
        String finalConstraint = pathConstraint.equals("") ? "" : "(assert " + pathConstraint + ")";
        String z3Clause = declaration.replace("$mainAssert", finalConstraint);
//        System.out.println(z3Clause);
        FileUtils.write(Configs.tempZ3Script, z3Clause);
        String result = SysUtils.execCmd("z3 -smt2 " + Configs.tempZ3Script);
        FileUtils.delete(Configs.tempZ3Script);
        if (result != null) {
            if (result.split("\n")[0].equalsIgnoreCase("sat")) {
                return result;
            }
        }
        return null;
    }
}
