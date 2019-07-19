package symips.unit;

import symips.apps.Configs;
import symips.utils.Arithmetic;

import java.util.BitSet;

public class BitVec {
    private String sym;
    private BitSet val;
    private int length;

    public BitVec(String sym, int n) {
        this.sym = Arithmetic.intToHexSmt(n);
        this.val = Arithmetic.intToBitSet(n);
        this.length = Configs.architecture;
    }

    public BitVec(String sym, BitSet val) {
        this.sym = sym;
        this.val = val;
        this.length = Configs.architecture;
    }

    public BitVec(BitVec bv) {
        this.sym = bv.sym;
        this.val = bv.val;
        this.length = bv.length;
    }

    public BitVec(Integer n) {
        this.sym = Arithmetic.intToHexSmt(n);
        this.val = Arithmetic.intToBitSet(n);
        this.length = Configs.architecture;
    }

    public BitVec get(int from, int to){
        BitSet temp = new BitSet();
        for(int i = from ; i < to ; i++){
            if(this.val.get(i)) {
                temp.set(i-from);
            }
        }
        String symTemp = "((_ extract " + String.valueOf(to-1) + " " + String.valueOf(from) + ") " + this.sym + ")";
        BitVec bitVec = new BitVec(symTemp, temp);
        bitVec.length = to - from;
        return bitVec;
    }

    public BitVec get(BitVec from, int to){
        if(from.getLength() < Configs.architecture){
            from.setLength(Configs.architecture);
        }
        int fromValue = (int) Arithmetic.bitVecToLong(from);
        return get(fromValue, to);
    }

    public BitVec get(int from, BitVec to){
        int toValue = (int) Arithmetic.bitVecToLong(to);
        return get(from, toValue);
    }

    public BitVec get(int pos){
        BitSet temp = new BitSet();
        if(this.val.get(pos)){
            temp.set(0);
        }
        String symTemp = "((_ extract " + String.valueOf(pos) + " " + String.valueOf(pos) + ") " + this.sym + ")";
        BitVec bitVec = new BitVec(symTemp, temp);
        bitVec.length = 1;
        return bitVec;
    }

    public String getSym() {
        return sym;
    }

    public void setSym(String sym) {
        this.sym = sym;
    }

    public void setSym(){
        this.sym = Arithmetic.intToHexSmt(Arithmetic.bitVecToLong(this));
    }

    public BitSet getVal() {
        return val;
    }

    public void setVal(BitSet val) {
        this.val = val;
    }

    public int getLength(){ return length;}

    public void setLength(int length){ this.length = length;}

    @Override
    public String toString() {
        return "BitVec{" +
                "sym='" + sym + '\'' +
                ", val=" + val +
                '}';
    }

    public static BitVec concat(BitVec a, BitVec b){
        String strA = Arithmetic.bitVecToStr(a);
        String strB = Arithmetic.bitVecToStr(b);
        BitVec bitVec = Arithmetic.fromString(strA + strB);
        bitVec.setLength(a.getLength() + b.getLength());
        bitVec.setSym("(concat " + a.getSym() + " " + b.getSym() + ")");
        return bitVec;
    }

    public static BitVec sign_extend(long n){
        BitSet val = Arithmetic.longToBitSet(n);
        String sym = Arithmetic.intToHexSmt(n);
        BitVec bitVec = new BitVec(sym, val);
        bitVec.setLength(32);
        return bitVec;
    }

    public static BitVec sign_extend(BitVec b, int length){
        int n = length - b.getLength();
        if(n < 0){
            return null;
        }
        StringBuilder s = new StringBuilder();
        for(int i = 0 ; i <= n ; i++){
            s.append(b.getVal().get(b.getLength()-1)? "1": "0");
        }
        BitVec bitVec = Arithmetic.fromString(s.toString()+Arithmetic.bitVecToStr(b));
        bitVec.setLength(length);
        bitVec.setSym("((_ sign_extend " + String.valueOf(length) + ") " + b.getSym() + ")");
        return bitVec;
    }

    public static BitVec add(BitVec a, BitVec b){
        int length = Math.max(a.getLength(), b.getLength());
        BitVec aExtend = sign_extend(a, length);
        BitVec bExtend = sign_extend(b, length);
        long sum = Arithmetic.bitVecToLong(aExtend) + Arithmetic.bitVecToLong(bExtend);
        BitVec bitVec = Arithmetic.longToBitVec(sum, length);
        bitVec.setSym("(bvadd " + a.getSym() + " " + b.getSym() +")");
        return bitVec;
    }

    public static BitVec subtract(BitVec a, BitVec b){
        int length = Math.max(a.getLength(), b.getLength());
        BitVec aExtend = sign_extend(a, length);
        BitVec bExtend = sign_extend(b, length);
        long sum = Arithmetic.bitVecToLong(aExtend) - Arithmetic.bitVecToLong(bExtend);
        BitVec bitVec = Arithmetic.longToBitVec(sum, length);
        bitVec.setSym("(bvsub " + a.getSym() + " " + b.getSym() +")");
        return bitVec;
    }

    public static BitVec multiply(BitVec a, BitVec b){
        int length = Math.max(a.getLength(), b.getLength());
        BitVec aExtend = sign_extend(a, length);
        BitVec bExtend = sign_extend(b, length);
        long sum = Arithmetic.bitVecToLong(aExtend) * Arithmetic.bitVecToLong(bExtend);
        BitVec bitVec = Arithmetic.longToBitVec(sum, length);
        bitVec.setSym("(bvmul " + a.getSym() + " " + b.getSym() +")");
        return bitVec;
    }

    public static BitVec concat(BitVec a, long b){
        BitVec bitVecB = Arithmetic.longToBitVec(b, 1);
        return concat(a, bitVecB);
    }

    public static BitVec power(int value, int pow){
        String temp = "";
        for(int i = 0 ; i < pow ; i++){
            temp += String.valueOf(value);
        }
        BitVec bitVec = Arithmetic.fromString(temp);
        bitVec.setLength(pow);
        return bitVec;
    }

    public static BitVec power(BitVec value, int pow){
        String temp = Arithmetic.bitVecToStr(value);
        String result = "";
        for(int i = 0 ; i < pow ; i++){
            result += temp;
        }
        return Arithmetic.fromString(result);
    }

}
