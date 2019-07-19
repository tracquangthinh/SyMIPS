package symips.apps;

import javafx.util.Pair;
import symips.unit.AsmNode;
import symips.utils.*;
import capstone.Capstone;
import symips.elfutils.*;

import java.io.File;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;

public class BinParser {

    public static ArrayList<AsmNode> parse(String inp) {
        Logs.infoLn(" + Analyzing " + inp + " ...");
        try {
            Elf e = new Elf(new File(inp));
            int mode = getMode(inp);
            SectionHeader[] sections = e.sectionHeaders;
            int beginCodeSection = -1;
            int endCodeSection = -1;
            for (int i = 0; i < sections.length; i++) {
                SectionHeader sh = sections[i];

                if (sh.getName().equals(".init")) beginCodeSection = i;
                if (sh.getName().equals(".fini")) endCodeSection = i;
            }
            byte[] totalByteArray = new byte[0];
            for (int i = beginCodeSection; i <= endCodeSection; i++) {
                SectionHeader sh = sections[i];
                ByteBuffer buff = e.getSection(sh);
                byte[] arr = new byte[buff.remaining()];
                buff.get(arr);
                totalByteArray = SysUtils.concatByteArray(totalByteArray, arr);
            }
            return parse(totalByteArray, mode);
        } catch (Exception ex) {
            Logs.infoLn("-> Cannot read header section. File might be corrupted.");
            return null;
        }
    }

//    public static Pair<ArrayList<AsmNode>, Pair<Integer, Integer>> parse(String inp) {
//        Logs.infoLn(" + Analyzing " + inp + " ...");
//        ArrayList<AsmNode> asmNodes = new ArrayList<>();
//
//        Pair<Long, Pair<Long, Long>> addrs = getEntryPoint(inp);
//        int entryPointAddr = addrs.getValue().getKey().intValue();
//        int endPointAddr = addrs.getValue().getValue().intValue() + entryPointAddr;
//
//        // position of entry and end point in AsmNode list
//        int entryPointPos = 0;
//        int endPointPos = 0;
//
//        byte[] bytes = FileUtils.readBytesFromFile(inp);
//        long label = 0;
//        int instrSize = 4;
//        for (int i = 0; (i + 3) < bytes.length; i += instrSize) {
//
//            if(i == entryPointAddr){
//                entryPointPos = (int) label/4;
//            }
//
//            if(i == endPointAddr){
//                endPointPos = (int) label/4 - 1;
//            }
//
//            byte[] bs = {bytes[i], bytes[i + 1], bytes[i + 2], bytes[i + 3]};
//
//            Capstone cs = new Capstone(Capstone.CS_ARCH_MIPS, Capstone.CS_MODE_MIPS32+Capstone.CS_MODE_BIG_ENDIAN);
//            Capstone.CsInsn[] allInsn = cs.disasm(bs, label);
//            for (Capstone.CsInsn csInsn : allInsn) {
//                String opcode = csInsn.mnemonic;
//
//                StringBuilder params = new StringBuilder();
//                String[] paramsArr = csInsn.opStr.split("\\,");
//                for (int p = 0; p < paramsArr.length; p++) {
//                    params.append(paramsArr[p].trim());
//                    if (p < paramsArr.length - 1) {
//                        params.append(",");
//                    }
//                }
//                AsmNode n = new AsmNode(String.valueOf(csInsn.address), opcode, params.toString());
//                asmNodes.add(n);
//                label += instrSize;
//            }
//        }
//
//        return new Pair<>(asmNodes, new Pair<>(entryPointPos, endPointPos));
//    }

    public static ArrayList<AsmNode> parse(byte[] bytes, int mode) {
        ArrayList<AsmNode> asmNodes = new ArrayList<>();
        int label = 0;
        int instrSize = 4;
        for (int i = 0; (i + 3) < bytes.length; i += instrSize) {
            byte[] bs = {bytes[i], bytes[i + 1], bytes[i + 2], bytes[i + 3]};
            Capstone cs = new Capstone(Capstone.CS_ARCH_MIPS, Capstone.CS_MODE_MIPS32 + mode);
            Capstone.CsInsn[] insn = cs.disasm(bs, label);
            for (Capstone.CsInsn csInsn : insn) {
                String opcode = csInsn.mnemonic;

                StringBuilder params = new StringBuilder();
                String[] paramsArr = csInsn.opStr.split("\\,");
                for (int p = 0; p < paramsArr.length; p++) {
                    params.append(paramsArr[p].trim());
                    if (p < paramsArr.length - 1) {
                        params.append(",");
                    }
                }
                AsmNode n = new AsmNode(String.valueOf(csInsn.address), opcode, params.toString());
                asmNodes.add(n);
                label += instrSize;
            }
        }
        return asmNodes;
    }

    public static int getMode(String path){
        String disassembleCmd = "readelf -h ";
        String execResult = SysUtils.execCmd(disassembleCmd + path);
        String[] lines = execResult.split("\n");
        for(int i = 0 ; i < lines.length ; i++){
            if(lines[i].contains("big endian")){
                return Capstone.CS_MODE_BIG_ENDIAN;
            }
        }
        return Capstone.CS_MODE_LITTLE_ENDIAN;
    }

    public static long getInitAddress(String path){
        long init = 0;

        String disassembleCmd = "readelf -S ";
        String execResult = SysUtils.execCmd(disassembleCmd + path);
        String[] lines = execResult.split("\n");
        for(int i = 0 ; i < lines.length ; i++){
            if(lines[i].contains(".init")){
                String[] objLines = lines[i].split(" ");
                ArrayList<String> info = new ArrayList<>();
                for(int j = 0 ; j < objLines.length ; j++){
                    if(objLines[j].length() > 0){
                        info.add(objLines[j]);
                    }
                }
                init = Arithmetic.hexToInt(info.get(4));
            }
        }

        return init;
    }

    public static int getEntryPoint(String path){

        long originalEntryPoint = -1;
        long init = 0;

        String disassembleCmd = "readelf -h ";
        String execResult = SysUtils.execCmd(disassembleCmd + path);
        String[] lines = execResult.split("\n");
        for(int i = 0 ; i < lines.length ; i++){
            if(lines[i].contains("Entry point address")){
                String[] temp = lines[i].split(" ");
                originalEntryPoint = Arithmetic.hexToInt(temp[temp.length-1]);
            }
        }

        disassembleCmd = "readelf -S ";
        execResult = SysUtils.execCmd(disassembleCmd + path);
        lines = execResult.split("\n");
        for(int i = 0 ; i < lines.length ; i++){
            if(lines[i].contains(".init")){
                String[] objLines = lines[i].split(" ");
                ArrayList<String> info = new ArrayList<>();
                for(int j = 0 ; j < objLines.length ; j++){
                    if(objLines[j].length() > 0){
                        info.add(objLines[j]);
                    }
                }
                init = Arithmetic.hexToInt(info.get(4));
            }
        }

        return (int)(originalEntryPoint - init)/4;
    }

}
