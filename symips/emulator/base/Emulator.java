package symips.emulator.base;

import symips.apps.Configs;
import symips.emulator.semantics.Environment;
import symips.unit.BitVec;
import symips.utils.*;


import java.util.BitSet;

public class Emulator {
    protected Environment env;
    protected final int IntegerOverflow = 1;
    protected final int Trap = 2;
    protected final int Breakpoint = 3;

    protected final char HI;
    protected final char LO;
    protected final char PC;
    protected final char GPR_29;

    protected final int GPRLEN = Configs.architecture;

    protected Emulator(Environment env) {
        this.env = env;
        this.HI = Mapping.regStrToChar.get("$hi");
        this.LO = Mapping.regStrToChar.get("$lo");
        this.PC = Mapping.regStrToChar.get("$pc");
        this.GPR_29 = Mapping.regStrToChar.get("$sp");
    }

    public Environment getEnv() {
//        env.register.get()
        return env;
    }

    protected boolean NotWordValue(Character c) {
        return false;
    }

    protected BitVec UNPREDICTABLE() {
        Logs.info("     * Warning: UNPREDICTABLE!\n");
        return Arithmetic.longToBitVec(0, 32);
    }

    protected void NOP() {

    }

    protected void SignalException(int type) {
        Logs.infoLn("+ Exception call: Terminate.");
        System.exit(-1);
    }

    protected BitVec val(Character r) {
        return env.value(r);
    }

    protected void write(char r, BitVec value) {
        if (value.getSym().charAt(0) == '#') {
                value.setSym(Mapping.regCharToStr.get(r));
                value.setLength(Configs.architecture);
        }
        if(r != '0') {
            if(value.getLength() == Configs.architecture) {
                env.register.set(r, value);
            } else {
                env.register.set(r, sign_extend(value, Configs.architecture));
            }
        }
    }

    protected void write(char r, char p) {
        write(r, env.register.get(p));
    }

    protected void write(char r, long value) {
        write(r, Arithmetic.longToBitVec(value, Configs.architecture));
    }

    public void nextPC(){
        Character reg = Mapping.regStrToChar.get("$pc");
        long PC = Arithmetic.bitVecToLong(val(reg));
        PC += 4;
        write(reg, Arithmetic.longToBitVec(PC, Configs.architecture));
    }

    public void jumpPC(long offset){
        Character reg = Mapping.regStrToChar.get("$pc");
        long PC = Arithmetic.bitVecToLong(val(reg));
        PC += offset;
        write(reg, Arithmetic.longToBitVec(PC, Configs.architecture));
    }

    public void link(long pc){
        Character ra = Mapping.regStrToChar.get("$ra");
        write(ra, Arithmetic.longToBitVec(pc, Configs.architecture));
    }

    public void SB(Character r, Character p, int offset) {
        long destinationAddress = Arithmetic.bitVecToLong(env.value(p));
        destinationAddress += offset;
        env.memory.storeByte(destinationAddress, env.register.get(r));

    }

    public void SW(Character r, Character p, int offset) {
        long destinationAddress = Arithmetic.bitVecToLong(env.value(p));
        destinationAddress += offset;
        env.memory.storeWord(destinationAddress, env.register.get(r));
    }


    public void SH(Character r, Character p, int offset) {
        long destinationAddress = Arithmetic.bitVecToLong(env.value(p));
        destinationAddress += offset;
        env.memory.storeHalfWord(destinationAddress, env.register.get(r));
    }

    public void SWR(Character r, Character p, int offset) {
        long destinationAddress = Arithmetic.bitVecToLong(env.value(p));
        destinationAddress += offset;
        env.memory.storeWord(destinationAddress, env.register.get(r));
    }

    public void LB(Character r, Character p, int offset) {
        long sourceAddress = Arithmetic.bitVecToLong(env.value(p));
        sourceAddress += offset;
        write(r, env.memory.loadByte(sourceAddress));
    }

    public void LBU(Character r, Character p, int offset) {
        long sourceAddress = Arithmetic.bitVecToLong(env.value(p));
        sourceAddress += offset;
        BitVec loadByte = env.memory.loadByte(sourceAddress);
        if(loadByte.getSym().charAt(0) == '#'){
            long conSym = Arithmetic.bitVecToLong(loadByte);
            if(conSym < 0){
                conSym = -1*conSym;
            }
            loadByte = Arithmetic.longToBitVec(conSym, Configs.architecture);
        } else {
            loadByte.setSym("(bvabs " + loadByte.getSym() + ")");
        }
        write(r, loadByte);
    }

    public void LW(Character r, Character p, int offset) {
        long sourceAddress = Arithmetic.bitVecToLong(env.value(p));
        sourceAddress += offset;
        write(r, env.memory.loadWord(sourceAddress));
//        Logs.infoLn("gp = " + Arithmetic.bitVecToHex(val(Mapping.regStrToChar.get("$gp"))));
    }

    public void LL(Character r, Character p, int offset) {
        long sourceAddress = Arithmetic.bitVecToLong(env.value(p));
        sourceAddress += offset;
        write(r, env.memory.loadWord(sourceAddress));
    }

    public void SC(Character r, Character p, int offset) {
        long destinationAddress = Arithmetic.bitVecToLong(env.value(p));
        destinationAddress += offset;
        env.memory.storeWord(destinationAddress, env.register.get(r));
    }

    public void LH(Character r, Character p, int offset) {
        long sourceAddress = Arithmetic.bitVecToLong(env.value(p));
        sourceAddress += offset;
        write(r, env.memory.loadHalfWord(sourceAddress));
    }

    public void LHU(Character r, Character p, int offset) {
        long sourceAddress = Arithmetic.bitVecToLong(env.value(p));
        sourceAddress += offset;
        BitVec loadByte = env.memory.loadHalfWord(sourceAddress);
        if(loadByte.getSym().charAt(0) == '#'){
            long conSym = Arithmetic.bitVecToLong(loadByte);
            if(conSym < 0){
                conSym = -1*conSym;
            }
            loadByte = Arithmetic.longToBitVec(conSym, Configs.architecture);
        } else {
            loadByte.setSym("(bvabs " + loadByte.getSym() + ")");
        }
        write(r, loadByte);
    }

    protected boolean equal(BitVec a, BitVec b) {
        return a.getVal().equals(b.getVal());
    }

    protected boolean equal(BitVec a, long n) {
        long longA = Arithmetic.bitVecToLong(a);
        return (longA == n);
    }

    protected boolean notEqual(BitVec a, BitVec b) {
        return !a.getVal().equals(b.getVal());
    }

    protected boolean notEqual(BitVec a, long n) {
        long longA = Arithmetic.bitVecToLong(a);
        return !(longA == n);
    }

    protected boolean greaterOrEqual(BitVec a, BitVec b) {
        long longA = Arithmetic.bitVecToLong(a);
        long longB = Arithmetic.bitVecToLong(b);
        return (longA >= longB);
    }

    protected boolean less(BitVec a, BitVec b) {
        Long longA = Arithmetic.bitVecToLong(a);
        Long longB = Arithmetic.bitVecToLong(b);
        if (longA <= longB) {
            return true;
        }
        return false;
    }

    protected BitVec sign_extend(long n) {
        BitSet val = Arithmetic.longToBitSet(n);
        String sym = Arithmetic.intToHexSmt(n);
        BitVec bitVec = new BitVec(sym, val);
        bitVec.setLength(32);
        return bitVec;
    }

    protected BitVec sign_extend(BitVec b, int length) {
        int n = length - b.getLength();
        if (n < 0) {
            return null;
        } else if (n == 0) {
            return b;
        }
        StringBuilder s = new StringBuilder();
        for (int i = 0; i <= n; i++) {
            s.append(b.getVal().get(b.getLength() - 1) ? "1" : "0");
        }
        BitVec bitVec = Arithmetic.fromString(s.toString() + Arithmetic.bitVecToStr(b));
        bitVec.setLength(length);
        bitVec.setSym("((_ sign_extend " + String.valueOf(n) + ") " + b.getSym() + ")");
        return bitVec;
    }

    protected BitVec sign_extend(BitVec b) {
        return sign_extend(b, Configs.architecture);
    }

    protected BitVec zero_extend(int value) {
        return Arithmetic.longToBitVec(value, Configs.architecture);
    }

    protected BitVec or(BitVec a, BitVec b) {
        if (a == null || b == null) return null;
        int length = Math.max(a.getLength(), b.getLength());
        BitVec aExtend = sign_extend(a, length);
        BitVec bExtend = sign_extend(b, length);
        BitSet concreteValue = (BitSet) aExtend.getVal().clone();
        concreteValue.or(bExtend.getVal());
        String symbolicValue = "(bvor " + aExtend.getSym() + " " + bExtend.getSym() + ")";
        if (aExtend.getSym().charAt(0) == '#' && bExtend.getSym().charAt(0) == '#') {
            symbolicValue = Arithmetic.intToHexSmt(Arithmetic.bitSetToLong(concreteValue));
        }
        return new BitVec(symbolicValue, concreteValue);
    }

    protected boolean or(boolean a, boolean b) {
        return a || b;
    }

    protected BitVec nor(BitVec a, BitVec b) {
        if (a == null || b == null) return null;
        int length = Math.max(a.getLength(), b.getLength());
        BitVec aExtend = sign_extend(a, length);
        BitVec bExtend = sign_extend(b, length);
        String symbolicValue = "(bvnor " + aExtend.getSym() + " " + bExtend.getSym() + ")";
        BitSet concreteValue = (BitSet) aExtend.getVal().clone();
        concreteValue.or(bExtend.getVal());
        concreteValue.flip(0, concreteValue.size());
        if (aExtend.getSym().charAt(0) == '#' && bExtend.getSym().charAt(0) == '#') {
            symbolicValue = Arithmetic.intToHexSmt(Arithmetic.bitSetToLong(concreteValue));
        }
        return new BitVec(symbolicValue, concreteValue);
    }

    protected BitVec xor(BitVec a, BitVec b) {
        if (a == null || b == null) return null;
        int length = Math.max(a.getLength(), b.getLength());
        BitVec aExtend = sign_extend(a, length);
        BitVec bExtend = sign_extend(b, length);
        String symbolicValue = "(bvxnor " + aExtend.getSym() + " " + bExtend.getSym() + ")";
        BitSet concreteValue = (BitSet) aExtend.getVal().clone();
        concreteValue.xor(bExtend.getVal());
        if (aExtend.getSym().charAt(0) == '#' && bExtend.getSym().charAt(0) == '#') {
            symbolicValue = Arithmetic.intToHexSmt(Arithmetic.bitSetToLong(concreteValue));
        }
        return new BitVec(symbolicValue, concreteValue);
    }

    protected BitVec and(BitVec a, BitVec b) {
        if (a == null || b == null) return null;
        int length = Math.max(a.getLength(), b.getLength());
        BitVec aExtend = sign_extend(a, length);
        BitVec bExtend = sign_extend(b, length);
        String symbolicValue = String.format("(bvand %s %s)", aExtend.getSym(), bExtend.getSym());
        BitSet concreteValue = (BitSet) aExtend.getVal().clone();
        concreteValue.and(bExtend.getVal());
        if (aExtend.getSym().charAt(0) == '#' && bExtend.getSym().charAt(0) == '#') {
            symbolicValue = Arithmetic.intToHexSmt(Arithmetic.bitSetToLong(concreteValue));
        }
        return new BitVec(symbolicValue, concreteValue);
    }

    protected BitVec concat(BitVec a, BitVec b) {
        if(a == null || b == null){
            if(a == null) {
                return b;
            } else {
                return a;
            }
        }
        String strA = Arithmetic.bitVecToStr(a);
        String strB = Arithmetic.bitVecToStr(b);
        BitVec bitVec = Arithmetic.fromString(strA + strB);
        bitVec.setLength(a.getLength() + b.getLength());
        String sym = "(concat " + a.getSym() + " " + b.getSym() + ")";
        if (a.getSym().charAt(0) == '#' && b.getSym().charAt(0) == '#') {
            sym = Arithmetic.intToHexSmt(Arithmetic.bitSetToLong(bitVec.getVal()));
        }
        bitVec.setSym(sym);
        return bitVec;
    }

    protected BitVec concat(long a, BitVec b) {
        BitVec bitVecA = Arithmetic.longToBitVec(a, 16);
        return concat(bitVecA, b);
    }

    protected BitVec concat(BitVec a, long b) {
        BitVec bitVecB = Arithmetic.longToBitVec(b, 1);
        bitVecB.setSym("((_ extract 0 0) " + bitVecB.getSym() + ")");
        return concat(a, bitVecB);
    }

    protected BitVec add(BitVec a, BitVec b) {
        int length = Math.max(a.getLength(), b.getLength());
        BitVec aExtend = sign_extend(a, length);
        BitVec bExtend = sign_extend(b, length);
        long sum = Arithmetic.bitVecToLong(aExtend) + Arithmetic.bitVecToLong(bExtend);
        BitVec bitVec = Arithmetic.longToBitVec(sum, length);
        String symbolicValue = "(bvadd " + aExtend.getSym() + " " + bExtend.getSym() + ")";
        if (aExtend.getSym().charAt(0) == '#' && bExtend.getSym().charAt(0) == '#') {
            symbolicValue = Arithmetic.intToHexSmt(sum);
        }
        bitVec.setSym(symbolicValue);
        return bitVec;
    }

    protected int add(int a, int b){
        return a + b;
    }

    protected BitVec subtract(BitVec a, BitVec b) {
        int length = Math.max(a.getLength(), b.getLength());
//        BitVec aExtend = sign_extend(a, length);
//        BitVec bExtend = sign_extend(b, length);
        BitVec aExtend = a;
        BitVec bExtend = b;
        aExtend.setLength(Configs.architecture);
        bExtend.setLength(Configs.architecture);
        long sum = Arithmetic.bitVecToLong(aExtend) - Arithmetic.bitVecToLong(bExtend);
        BitVec bitVec = Arithmetic.longToBitVec(sum, length);
        String symbolicValue = "(bvsub " + aExtend.getSym() + " " + bExtend.getSym() + ")";
        if (aExtend.getSym().charAt(0) == '#' && bExtend.getSym().charAt(0) == '#') {
            symbolicValue = Arithmetic.intToHexSmt(sum);
        }
        bitVec.setSym(symbolicValue);
        return bitVec;
    }

    protected int subtract(int a, int b) {
        return a - b;
    }

    protected BitVec subtract(int a, BitVec b) {
        BitVec bitVecA = Arithmetic.longToBitVec(a, Configs.architecture);
        return subtract(bitVecA, b);
    }

    protected BitVec subtract(BitVec a, int b){
        BitVec bitVecB = Arithmetic.longToBitVec(b, Configs.architecture);
        return subtract(a, bitVecB);
    }

    protected BitVec multiply(BitVec a, BitVec b) {
        int length = Math.max(a.getLength(), b.getLength());
        BitVec aExtend = sign_extend(a, length);
        BitVec bExtend = sign_extend(b, length);
        long sum = Arithmetic.bitVecToLong(aExtend) * Arithmetic.bitVecToLong(bExtend);
        BitVec bitVec = Arithmetic.longToBitVec(sum, length);
        String symbolicValue = "(bvmul " + aExtend.getSym() + " " + bExtend.getSym() + ")";
        if (aExtend.getSym().charAt(0) == '#' && bExtend.getSym().charAt(0) == '#') {
            symbolicValue = Arithmetic.intToHexSmt(sum);
        }
        bitVec.setSym(symbolicValue);
        return bitVec;
    }

    protected int multiply(int a, int b){
        return a*b;
    }

    protected BitVec div(BitVec a, BitVec b) {
        if (a == null || b == null) return null;
        String symbolicValue = "(bvdiv " + a.getSym() + " " + b.getSym() + ")";
        BitVec bitVec = Arithmetic.longToBitVec(Arithmetic.bitVecToLong(a)
                / Arithmetic.bitVecToLong(b), Configs.architecture);
        bitVec.setSym(symbolicValue);
        return bitVec;
    }

    protected BitVec mod(BitVec a, BitVec b) {
        if (a == null || b == null) return null;
        String symbolicValue = "(bvmod " + a.getSym() + " " + b.getSym() + ")";
        BitVec bitVec = Arithmetic.longToBitVec(Arithmetic.bitVecToLong(a)
                % Arithmetic.bitVecToLong(b), Configs.architecture);
        bitVec.setSym(symbolicValue);
        return bitVec;
    }

    protected BitVec power(int value, int pow) {
        if (pow == 0) {
            return null;
        }
        String temp = "";
        for (int i = 0; i < pow; i++) {
            temp += String.valueOf(value);
        }
        BitVec bitVec = Arithmetic.fromString(temp);
        bitVec.setLength(pow);
        bitVec.setSym("((_ extract " + String.valueOf(pow - 1) + " 0) " + bitVec.getSym() + ")");
        return bitVec;
    }

    protected BitVec power(BitVec value, long pow) {
        if(pow == 0){
            return null;
        }
        String temp = Arithmetic.bitVecToStr(value);
        String result = "";
        for (int i = 0; i < pow; i++) {
            result += temp;
        }
        BitVec bitVec = Arithmetic.fromString(result);
        bitVec.setLength(temp.length() * (int) pow);
        return bitVec;
    }

    protected BitVec power(BitVec value, BitVec pow) {
        pow.setLength(Configs.architecture);
        long p = Arithmetic.bitVecToLong(pow);
        return power(value, p);
    }

    protected BitVec power(int value, BitVec pow) {
        pow.setLength(Configs.architecture);
        int powValue = (int) Arithmetic.bitVecToLong(pow);
        return power(value, powValue);
    }

    protected BitVec signed_word(Character r){
        return val(r);
    }

    protected BitVec unsigned_word(Character r){
        long concreteValue = Arithmetic.bitVecToLong(val(r));
        if(concreteValue < 0){
            BitVec unsignedBitVec = Arithmetic.longToBitVec(concreteValue*-1, Configs.architecture);
            unsignedBitVec.setSym("(bvmul " + val(r).getSym() + " #xFFFFFFFF)");
            return unsignedBitVec;
        }
        return val(r);
    }

    protected BitVec shiftLeft(BitVec value, int n){
        long shiftedValue = Arithmetic.bitVecToLong(value) << n;
        BitVec result = Arithmetic.longToBitVec(shiftedValue, Configs.architecture);
        result.setSym("(bvshl " + value.getSym() + " " + Arithmetic.intToHexSmt(n) + ")");
        return result;
    }

    protected BitVec shiftLeft(int value, int n){
        BitVec bitVec = Arithmetic.longToBitVec(value, Configs.architecture);
        return shiftLeft(bitVec, n);
    }

    protected BitVec shiftRight(BitVec value, int n){
        long shiftedValue = Arithmetic.bitVecToLong(value) >> n;
        BitVec result = Arithmetic.longToBitVec(shiftedValue, Configs.architecture);
        result.setSym("(bvshr " + value.getSym() + " " + Arithmetic.intToHexSmt(n) + ")");
        return result;
    }

    protected BitVec lo_word(BitVec value){
        return value.get(0, 31);
    }

    protected BitVec hi_word(BitVec value){
        return value.get(32, 63);
    }

}
