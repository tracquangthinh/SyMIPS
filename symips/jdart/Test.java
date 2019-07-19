package symips.jdart;

import symips.emulator.base.MIPS32;
import symips.emulator.semantics.Environment;
import symips.unit.BitVec;
import symips.utils.Arithmetic;

import java.util.BitSet;

public class Test {
//    public static BitVec sign_extend(BitVec b, int n) {
//        if (b == null) return null;
//        String symbolicValue = String.format("((_ sign_extend %s) %s)", n, b.getSym());
//        int shift = n - b.getLength();
//        BitSet concreteValue = Arithmetic.intToBitSet(Arithmetic.bitSetToInt(b.getVal()) << shift >> shift);
//        return new BitVec(symbolicValue, concreteValue);
//    }
    protected static BitVec sign_extend(BitVec b, int length) {
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

    public static BitVec add(byte x, byte y) {
        BitVec a =  sign_extend(Arithmetic.longToBitVec(x, 18), 32);
        BitVec b = sign_extend(Arithmetic.longToBitVec(y, 18), 32);
        int sum = Arithmetic.bitSetToInt(a.getVal()) + Arithmetic.bitSetToInt(b.getVal());
        BitSet bitSet = Arithmetic.intToBitSet(sum);
        String symbolicValue = "(bvadd " + a.getSym() + " " + b.getSym() + ")";
        if (a.getSym().charAt(0) == '#' && b.getSym().charAt(0) == '#') {
            symbolicValue = Arithmetic.intToHexSmt(sum);
        }
        return new BitVec(symbolicValue, bitSet);
    }

    public static void foo(char a, char b, char c){
        Environment env = new Environment(true);
        new MIPS32(env).ADD(a, b, c);
    }

    public static int bar(char a, char b){
        return a + b;
    }

    public static void main(String[] args){
        BitVec c = add((byte) 10, (byte) 20);
        System.out.println(c);
        foo('1', '2', '3');
        System.out.println(bar('2', '3'));
    }

}
