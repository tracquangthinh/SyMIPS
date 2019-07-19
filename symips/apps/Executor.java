package symips.apps;

import javafx.util.Pair;
import symips.emulator.base.MIPS32;
import symips.emulator.semantics.Environment;
import symips.emulator.semantics.Register;
import symips.unit.AsmNode;
import symips.utils.*;
import symips.visualization.Graph;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;
import java.util.concurrent.ExecutionException;

public class Executor{

    public static Stack<Environment> stack;

    public static String[] jumpsOpArray = {"b", "bal", "beq", "bgez", "bgezal", "bgtz", "blez",
                                            "bltz", "bltzal", "j", "jal", "jalr", "jr", "bne", "bnel",
                                            "bnez", "beqz", "beql"};
    public static ArrayList<String> jumpOpCodes = new ArrayList<String>(Arrays.asList(jumpsOpArray));

    public static String[] branchOpArray = {"beq", "bgez", "bgezal", "bgtz", "blez", "bltz",
            "bltzal", "bne", "bnel", "bnez", "beqz", "beql"};
    public static ArrayList<String> branchOpCodes = new ArrayList<String>(Arrays.asList(branchOpArray));

    public static final int LOOP_LIMITATION = 500;

    public HashMap<String, Integer> jumpCounter;

    public ArrayList<String> donePath;

    public String lastPath;

    private long initAddress;
    private long entryPointPos;
    private long endPointPos;
    private HashMap<String, Integer> trace;

    public Executor(){
        stack = new Stack<>();
        jumpCounter = new HashMap<>();
        donePath = new ArrayList<>();
        lastPath = null;
        trace = new HashMap<>();
    }

    public void setAddress(long init, long entry, long end){
        initAddress = init;
        entryPointPos = entry;
        endPointPos = end;
    }

    public HashMap<String, Integer> getTrace(){
        return trace;
    }

    private String generateJumpKey(int currentAddress, int nextAddress){
        return "\"" + String.valueOf(currentAddress) + "\" -> \"" + String.valueOf(nextAddress) + "\"";
    }

    private void increaseJumpCount(int currentAddress, int nextAddress){
        String jumpKey = generateJumpKey(currentAddress, nextAddress);
        if(jumpCounter.containsKey(jumpKey)){
            jumpCounter.replace(jumpKey, jumpCounter.get(jumpKey) + 1);
        } else {
            jumpCounter.put(jumpKey, 1);
        }
    }

    private void tracing(int start, int end){
        String trace_path = generateJumpKey(start*4, end*4);
        if(!trace.containsKey(trace_path)){
            trace.put(trace_path, 1);
        }
    }

    private boolean greaterThanLoopLimit(int currentAddress, int nextAddress){
        String jumpKey= generateJumpKey(currentAddress, nextAddress);
        if(jumpCounter.containsKey(jumpKey)){
           if(jumpCounter.get(jumpKey) > LOOP_LIMITATION){
               return true;
           } else {
               return false;
           }
        }
        return false;
    }


    public Pair<String, Integer> execBlock(MIPS32 emulator, ArrayList<AsmNode> nodes, int startAddress, String path) throws Exception {
        int startPos = startAddress;
        String newPath = new String(path) + "|";

        if(startPos >= endPointPos){
            return null;
        }

        int endPos = startPos;
        for(int i = startPos ; i < endPointPos ; i++){
            String opcode = nodes.get(i).getOpcode();
            Logs.infoLn("- Executing: " + nodes.get(i).getOpcode() + " " + nodes.get(i).getParams());

            Method method = null;
            if(!jumpOpCodes.contains(opcode)){
                tracing(i, i+1);
                newPath += "-" + String.valueOf(i);
                endPos = i;
                // if executing execution is load/store, the params are different than other.
                if(nodes.get(i).getParams().contains("(")){
                    String[] params = nodes.get(i).getParams().split(",");
                    Character desReg = Mapping.regStrToChar.get(params[0]);
                    String offsetString = params[1].split("\\(")[0];

                    int offset = offsetString.length() > 0 ? (int) Arithmetic.hexToInt(offsetString) : 0;
                    Character sourceReg = Mapping.regStrToChar.get(params[1].split("\\(")[1]
                            .replace(")", ""));

                    if(sourceReg != null && desReg != null){
                        try{
                            method = MIPS32.class.getMethod(opcode.toUpperCase(), Character.class, Character.class, int.class);
                            method.invoke(emulator, desReg, sourceReg, offset);
                        } catch (Exception e) {
                            throw new Exception("* Warning: Unknown instruction: " + opcode.toUpperCase());
                        }
                    } else {
                        throw new Exception("\"* Warning: Unknown registers in \"" + nodes.get(i).toString());
                    }

                } else {

                    String[] params = nodes.get(i).getParams().split(",");

                    for(int j = 0 ; j < params.length ; j++) {

                        if (!nodes.get(i).getParams().contains("(") &&
                                params[j].contains("$") && Mapping.regStrToChar.get(params[j]) == null) {
                            throw new Exception("* Warning: Unknown params: " + nodes.get(i).toString());
                        }
                    }

                    Long numberParam = null;
                    ArrayList<Character> characterParams = new ArrayList<Character>();
                    if (nodes.get(i).getParams().length() > 0) {
                        for (String param : params) {
                            if (Mapping.regStrToChar.get(param) != null) {
                                characterParams.add(Mapping.regStrToChar.get(param));
                            } else {
                                if (param.contains("0x")) {
                                    numberParam = new Long(Arithmetic.hexToInt(param));
                                } else {
                                    numberParam = Long.parseLong(param, 10);
                                }
                            }
                        }
                    }
                    try {
                        if (numberParam != null) {
                            if (characterParams.size() == 1) {
                                method = MIPS32.class.getMethod(opcode.toUpperCase(), Character.class, int.class);
                                method.invoke(emulator, characterParams.get(0), numberParam.intValue());
                            } else if (characterParams.size() == 2) {
                                method = MIPS32.class.getMethod(opcode.toUpperCase(), Character.class, Character.class, int.class);
                                method.invoke(emulator, characterParams.get(0), characterParams.get(1), numberParam.intValue());
                            }
                        } else {
                            switch (characterParams.size()) {
                                case 0:
                                    method = MIPS32.class.getMethod(opcode.toUpperCase(), null);
                                    method.invoke(emulator, null);
                                    break;
                                case 1:
                                    method = MIPS32.class.getMethod(opcode.toUpperCase(), Character.class);
                                    method.invoke(emulator, characterParams.get(0));
                                    break;
                                case 2:
                                    method = MIPS32.class.getMethod(opcode.toUpperCase(), Character.class, Character.class);
                                    method.invoke(emulator, characterParams.get(0), characterParams.get(1));
                                    break;
                                case 3:
                                    method = MIPS32.class.getMethod(opcode.toUpperCase(), Character.class, Character.class, Character.class);
                                    method.invoke(emulator, characterParams.get(0), characterParams.get(1), characterParams.get(2));
                                    break;
                            }
                        }
                    } catch (InvocationTargetException e) {
                        String cause = e.getCause().toString();
                        if(cause.contains("OutOf")){
                            throw new Exception(cause);
                        } else {
                            throw new Exception("* Warning: Unsupported instruction: " + opcode.toUpperCase());
                        }
                    }
                }

                emulator.nextPC();

            }else{
                break;
            }
        }
        newPath += "|";
        return new Pair<>(newPath, endPos + 1);
    }

    public Pair<String, Integer> execWithJump(MIPS32 emulator, ArrayList<AsmNode> nodes, int startAddress, String path) throws Exception {
        int currentAddress = startAddress;
        String newPath = new String(path);
        if(currentAddress >= endPointPos){
            return null;
        }

        String currentOpcode = nodes.get(currentAddress).getOpcode();
        while(!branchOpCodes.contains(currentOpcode)){
            if(currentOpcode.contains("j") || currentOpcode.equals("b") || currentOpcode.equals("bal") ||
                currentOpcode.equals("bl")){

                if(currentOpcode.charAt(currentOpcode.length()-1) == 'l'){
                    emulator.link(currentAddress+1);
                }

//
                String params = nodes.get(currentAddress).getParams();
                long offset = -1;
                if(params.contains("$")){
                    offset = Arithmetic.bitVecToLong(emulator.getEnv().value(Mapping.regStrToChar.get(params)));
                } else {
                    offset = Arithmetic.hexToInt(params);
                    if(offset > initAddress){
                        offset = offset - initAddress;
                    }

                }

                offset = offset / 4;
                offset += entryPointPos;

//                Logs.infoLn("- Jump: " + Arithmetic.intToHex(currentAddress) + " -> " + Arithmetic.intToHex(offset));

                newPath += "-" + String.valueOf(currentAddress);

                tracing(currentAddress, (int)offset);

                increaseJumpCount(currentAddress, (int) offset);
                if(!greaterThanLoopLimit(currentAddress, (int) offset)) {
                    if(offset <= endPointPos && offset >= 0){
                        currentAddress = (int) offset;
                    } else {
                        throw new Exception("* Warning: Jump to outside. Terminate.");
                    }
                } else {
                    return null;
                }


                emulator.jumpPC(currentAddress*4);

                currentOpcode = nodes.get(currentAddress).getOpcode();
            } else {
                Pair<String, Integer> result = null;
                try {
                    result = execBlock(emulator, nodes, currentAddress, newPath);
                } catch(Exception e){
                    throw new Exception(e.getMessage());
                }
                if(result == null){
                    return null;
                } else {
                    if(result.getValue().intValue() >= endPointPos){
                        return new Pair(result.getKey(), result.getValue());
                    } else {
                        currentAddress = result.getValue().intValue();
                        currentOpcode = nodes.get(currentAddress).getOpcode();
                        newPath = result.getKey();
                    }
                }
            }
        }
        return new Pair<>(newPath, currentAddress);
    }

    public Pair<String, Boolean> exec(MIPS32 emulator, ArrayList<AsmNode> nodes, int startAddress, String pathCondition,
                                      String path) throws StackOverflowError, Exception {
        Pair<String, Integer> result = null;
        try {
            result = execWithJump(emulator, nodes, startAddress, path);
        } catch(Exception e){
            throw new Exception(e.getMessage());
        }
         if(result == null){
            return new Pair<>(path, false);
        }
        String newPath = result.getKey();

        int currentAddress = result.getValue().intValue();


        if(currentAddress >= endPointPos){
            Logs.infoLn("- Reached the end point.");
            donePath.add(result.getKey());
            return new Pair<>(newPath, true);
        }
        newPath += "-" + String.valueOf(currentAddress);
        lastPath = newPath;

        String currentOpcode = nodes.get(currentAddress).getOpcode();
        String[] currentParams = nodes.get(currentAddress).getParams().split(",");
        boolean trueBranchFeasible = false;
        boolean falseBranchFeasible = false;
        String trueCond = null;
        String falseCond = null;
        int jumpAddress = 0;
        if(currentParams.length == 2){
            jumpAddress += (int) Arithmetic.hexToInt(currentParams[1])/4;
        } else {
            jumpAddress += (int) Arithmetic.hexToInt(currentParams[2])/4;
        }

        switch (currentOpcode){
            case "bnez":
                trueCond = Condition.notEqualZero(pathCondition, emulator, currentParams[0]);
                falseCond = Condition.equalZero(pathCondition, emulator, currentParams[0]);
                break;

            case "beqz":
                trueCond = Condition.equalZero(pathCondition, emulator, currentParams[0]);
                falseCond = Condition.notEqualZero(pathCondition, emulator, currentParams[0]);
                break;

            case "beq":
                trueCond = Condition.equal(pathCondition, emulator, currentParams[0], currentParams[1]);
                falseCond = Condition.notEqual(pathCondition, emulator, currentParams[0], currentParams[1]);
                break;

            case "bne":
                trueCond = Condition.notEqual(pathCondition, emulator, currentParams[0], currentParams[1]);
                falseCond = Condition.equal(pathCondition, emulator, currentParams[0], currentParams[1]);
                break;

            case "bnel":
                trueCond = Condition.notEqual(pathCondition, emulator, currentParams[0], currentParams[1]);
                falseCond = Condition.equal(pathCondition, emulator, currentParams[0], currentParams[1]);
                break;

            case "bltz":
                trueCond = Condition.lessThanZero(pathCondition, emulator, currentParams[0]);
                falseCond = Condition.greaterOrEqualZero(pathCondition, emulator, currentParams[0]);
                break;

            case "blez":
                trueCond = Condition.lessOrEqualZero(pathCondition, emulator, currentParams[0]);
                falseCond = Condition.greaterThanZero(pathCondition, emulator, currentParams[0]);
                break;

            case "bgtz":
                trueCond = Condition.greaterThanZero(pathCondition, emulator, currentParams[0]);
                falseCond = Condition.lessOrEqualZero(pathCondition, emulator, currentParams[0]);
                break;

        }


        String truePath = null;
        String falsePath = null;

//        if((Z3Solver.checkSAT(trueCond, null) == null)){
//            for(int k = 1 ; k < 3; k++) {
//                Logs.infoLn(nodes.get(currentAddress + k));
//            }
//            System.exit(-1);
//        }

        if((Z3Solver.checkSAT(trueCond, null) != null) && (jumpAddress >= 0)){
            tracing(currentAddress, jumpAddress);
            increaseJumpCount(currentAddress, jumpAddress);
            if(!greaterThanLoopLimit(currentAddress, jumpAddress)) {
                Logs.infoLn("- True branch is SAT. Go to " + Arithmetic.intToHex(jumpAddress));
                stack.push(emulator.getEnv().clone());
                Pair<String, Boolean> execResult = exec(emulator, nodes, jumpAddress, trueCond, newPath);
                emulator = new MIPS32(stack.pop());
                trueBranchFeasible = execResult.getValue();
                truePath = execResult.getKey();
            } else {
                trueBranchFeasible = false;
            }

        }

        if((Z3Solver.checkSAT(falseCond, null) != null)){
            Logs.infoLn("+ False branch is SAT. Go to" + String.valueOf(Arithmetic.intToHex((currentAddress+1)*4)));
            tracing(currentAddress, currentAddress+1);
            stack.push(emulator.getEnv().clone());
            Pair<String, Boolean> execResult = exec(emulator, nodes, currentAddress+1,
                    falseCond, newPath);
            stack.pop();
            falseBranchFeasible = execResult.getValue();
            falsePath =  execResult.getKey();
        }

        if(!trueBranchFeasible && !falseBranchFeasible){
            return new Pair<>(truePath + "*" + falsePath, false);
        }

        return new Pair<>(truePath + "*" + falsePath, true);
    }

}

