package symips.emulator.semantics;

import symips.apps.Configs;
import symips.unit.BitVec;
import symips.utils.Arithmetic;
import symips.utils.Mapping;
import symips.utils.MyStr;

import java.util.*;

public class Register {
    public HashMap<Character, BitVec> regs;
    public int length;

    String[] registerNames = {"zero", "at", "v0", "v1", "a0", "a1", "a2", "a3", "t0", "t1", "t2", "t3", "t4", "t5", "t6", "t7",
            "s0", "s1", "s2", "s3", "s4", "s5", "s6", "s7", "t8", "t9", "k0", "k1", "gp", "sp", "fp", "ra",
            "hi", "lo", "pc"};
    Character[] symbols = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h',
            'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y'};

    public Register(int length, BitSet at, BitSet v0, BitSet v1, BitSet a0, BitSet a1, BitSet a2, BitSet a3,
                    BitSet t0, BitSet t1, BitSet t2, BitSet t3, BitSet t4, BitSet t5, BitSet t6, BitSet t7,
                    BitSet s0, BitSet s1, BitSet s2, BitSet s3, BitSet s4, BitSet s5, BitSet s6, BitSet s7,
                    BitSet t8, BitSet t9, BitSet k0, BitSet k1, BitSet gp, BitSet sp, BitSet fp, BitSet ra,
                    BitSet hi, BitSet lo, BitSet pc) {
        this.length = length;
        regs = new HashMap<>();
        regs.put('0', new BitVec("$zero", Arithmetic.intToBitSet(0)));
        regs.put('1', new BitVec("$at", at));
        regs.put('2', new BitVec("$v0", v0));
        regs.put('3', new BitVec("$v1", v1));
        regs.put('4', new BitVec("$a0", a0));
        regs.put('5', new BitVec("$a1", a1));
        regs.put('6', new BitVec("$a2", a2));
        regs.put('7', new BitVec("$a3", a3));
        regs.put('8', new BitVec("$t0", t0));
        regs.put('9', new BitVec("$t1", t1));
        regs.put('a', new BitVec("$t2", t2));
        regs.put('b', new BitVec("$t3", t3));
        regs.put('c', new BitVec("$t4", t4));
        regs.put('d', new BitVec("$t5", t5));
        regs.put('e', new BitVec("$t6", t6));
        regs.put('f', new BitVec("$t7", t7));
        regs.put('g', new BitVec("$s0", s0));
        regs.put('h', new BitVec("$s1", s1));
        regs.put('i', new BitVec("$s2", s2));
        regs.put('j', new BitVec("$s3", s3));
        regs.put('k', new BitVec("$s4", s4));
        regs.put('l', new BitVec("$s5", s5));
        regs.put('m', new BitVec("$s6", s6));
        regs.put('n', new BitVec("$s7", s7));
        regs.put('o', new BitVec("$t8", t8));
        regs.put('p', new BitVec("$t9", t9));
        regs.put('q', new BitVec("$k0", k0));
        regs.put('r', new BitVec("$k1", k1));
        regs.put('s', new BitVec("$gp", gp));
        regs.put('t', new BitVec("$sp", sp));
        regs.put('u', new BitVec("$fp", fp));
        regs.put('v', new BitVec("$ra", ra));
        regs.put('w', new BitVec("$hi", hi));
        regs.put('x', new BitVec("$lo", lo));
        regs.put('y', new BitVec("$pc", pc));

        for(int i = 0 ; i < registerNames.length ; i++){
            Mapping.regStrToChar.put("$"+registerNames[i], symbols[i]);
        }

        for (String key : Mapping.regStrToChar.keySet()) {
            Mapping.regCharToStr.put(Mapping.regStrToChar.get(key), key);
        }
    }

    public String getValue(char r) {
        if (!regs.containsKey(r)) return null;
        StringBuilder sb = new StringBuilder();
        String result = Arithmetic.bitsetToStr(regs.get(r).getVal());
        for (int i = 0; i < length - result.length(); i++)
            sb.append("0");
        sb.append(result);
        return sb.toString();
    }

    public String getFormula(char r) {
        return regs.get(r).getSym();
    }

    public String toString() {
        MyStr s = new MyStr("+ Register (" + length + "-bit):\n");
        SortedSet<Character> keys = new TreeSet<>(regs.keySet());
        for (Character key : keys) {
            String val = getValue(key);
            long intValue = Arithmetic.bitSetToLong(Objects.requireNonNull(regs.get(key).getVal()));

            StringBuilder intStr = new StringBuilder(String.valueOf(intValue));
            int remainingLen = (int) Math.round(Math.log10(Math.pow(2, Configs.architecture))) - intStr.length();
            for (int i = 0; i < remainingLen; i++) intStr.insert(0, "0");

            StringBuilder hexStr = new StringBuilder(Arithmetic.intToHex(intValue));
            remainingLen = Configs.architecture / 4 - hexStr.length();
            for (int i = 0; i < remainingLen; i++) hexStr.insert(0, "0");

            String symbolicValue = regs.get(key).getSym();
            s.append("\t- ", Mapping.regCharToStr.get(key), "\t: ", val, " ",
                    "0x" + hexStr.toString().toUpperCase(), " (", intValue, ") | " + symbolicValue + "\n");
        }
        return s.value();
    }

    public BitVec get(char r) {
        if (!regs.containsKey(r)) return null;
        return regs.get(r);
    }

    public void set(char r, BitVec bitSet) {
        regs.put(r, bitSet);
    }

    public Register clone(){
        ArrayList<BitSet> regValue = new ArrayList<>();
        ArrayList<String> regSymbol = new ArrayList<>();
        for(int i = 0 ; i < symbols.length ; i++){
            Character r = symbols[i];
            regValue.add(Arithmetic.bitSetToBitSet(get(r).getVal()));
            regSymbol.add(new String(get(r).getSym()));
        }
        Register cloning = new Register(Configs.architecture,
                regValue.get(1), regValue.get(2), regValue.get(3), regValue.get(4),
                regValue.get(5), regValue.get(6), regValue.get(7), regValue.get(8),
                regValue.get(9), regValue.get(10), regValue.get(11), regValue.get(12),
                regValue.get(13), regValue.get(14), regValue.get(15), regValue.get(16),
                regValue.get(17), regValue.get(18), regValue.get(19), regValue.get(20),
                regValue.get(21), regValue.get(22), regValue.get(23), regValue.get(24),
                regValue.get(25), regValue.get(26), regValue.get(27), regValue.get(28),
                regValue.get(29), regValue.get(30), regValue.get(31), regValue.get(32),
                regValue.get(33), regValue.get(34));

        for(int i = 0 ; i < symbols.length ; i++){
            cloning.get(symbols[i]).setSym(regSymbol.get(i));
        }
        return cloning;
    }
}
