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
import java.util.HashMap;

public class BinParser {
    String path;
    int mode;
    SectionHeader[] sections;
    Elf elf;

    public BinParser(String path){
       this.path = path;
    }

    public void loadELF() throws Exception{
        Logs.infoLn(" + Analyzing " + this.path + " ...");
        try {
            this.elf = new Elf(new File(this.path));
            this.mode = getMode();
            this.sections = this.elf.sectionHeaders;
        } catch (Exception e){
            throw new Exception("-> Cannot read header section. File might be corrupted.");
        }
    }

    public ArrayList<AsmNode> parse() {
            int beginCodeSection = -1;
            int endCodeSection = -1;
            for (int i = 0; i < this.sections.length; i++) {
                SectionHeader sh = this.sections[i];

                if (sh.getName().equals(".init")) beginCodeSection = i;
                if (sh.getName().equals(".fini")) endCodeSection = i;
            }
            byte[] totalByteArray = new byte[0];
            try {
                for (int i = beginCodeSection; i <= endCodeSection; i++) {
                    SectionHeader sh = this.sections[i];
                    ByteBuffer buff = this.elf.getSection(sh);
                    byte[] arr = new byte[buff.remaining()];
                    buff.get(arr);
                    totalByteArray = SysUtils.concatByteArray(totalByteArray, arr);
                }
            } catch (Exception e){
                Logs.infoLn("-> Cannot read header section. File might be corrupted.");
                return null;
            }
            return parse(totalByteArray, this.mode);
    }


    private ArrayList<AsmNode> parse(byte[] bytes, int mode) {
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

    private int getMode(){
        String disassembleCmd = "readelf -h ";
        String execResult = SysUtils.execCmd(disassembleCmd + this.path);
        String[] lines = execResult.split("\n");
        for(int i = 0 ; i < lines.length ; i++){
            if(lines[i].contains("big endian")){
                return Capstone.CS_MODE_BIG_ENDIAN;
            }
        }
        return Capstone.CS_MODE_LITTLE_ENDIAN;
    }

    public long getSectionAddress(String sec){
        String init = null;

        String disassembleCmd = "readelf -S ";
        String execResult = SysUtils.execCmd(disassembleCmd + this.path);
        String[] lines = execResult.split("\n");
        for(int i = 0 ; i < lines.length ; i++){
            if(lines[i].contains(sec)){
                String line = lines[i];
                for(int j = 0 ; j < 10 ; j++){
                    line = line.replace("[ " + String.valueOf(j) + "]",
                            "[0" + String.valueOf(j) + "]");
                }
                String[] objLines = line.split(" ");
                ArrayList<String> info = new ArrayList<>();
                for(int j = 0 ; j < objLines.length ; j++){
                    if(objLines[j].length() > 0){
                        info.add(objLines[j]);
                    }
                }
                init = info.get(3);
            }
        }

        return Arithmetic.hexToInt(init);
    }

    public long getInitAddress(){
        return getSectionAddress(".init");
    }

    public int getEntryPoint(){

        long originalEntryPoint = -1;
        long init = 0;

        String disassembleCmd = "readelf -h ";
        String execResult = SysUtils.execCmd(disassembleCmd + this.path);
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

    public HashMap<Long, byte[]> getOtherSections(){
        HashMap<Long, byte[]> sections = new HashMap<>();

        int otherSection = -1;
        for (int i = 0; i < this.sections.length; i++) {
            SectionHeader sh = this.sections[i];
            if (sh.getName().equals(".fini")){
                otherSection = i;
                break;
            }
        }
        otherSection += 1;

        for(int i = otherSection ; i < this.sections.length ; i++) {
            try {
                SectionHeader sh = this.sections[i];
                ByteBuffer buff = this.elf.getSection(sh);
                byte[] arr = new byte[buff.remaining()];
                buff.get(arr);
                sections.put(getSectionAddress(sh.getName()), arr);
            } catch (Exception e) {
                Logs.infoLn("*Warning: Cannot read "+ this.sections[i].getName() + " section.");
//                return null;
                continue;
            }
        }
        return sections;

    }

}
