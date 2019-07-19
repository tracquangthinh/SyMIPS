package symips.utils;

import symips.apps.Configs;
import symips.unit.BitVec;

import java.math.BigInteger;
import java.util.BitSet;

public class Arithmetic {

    public static long hexToInt(String hex) {
        if (hex.contains("-0x")) return -Long.parseLong(hex.substring(3), 16);
        return Long.parseLong(hex.contains("0x") ? hex.substring(2) : hex, 16);
    }

    public static String floatToHexSmt(float l) {
        StringBuilder hex = new StringBuilder(Arithmetic.intToHex((int) l));
        int len = hex.length();
        if (len < Configs.architecture / 4) {
            for (int i = 0; i < Configs.architecture / 4 - len; i++) {
                hex.insert(0, "0");
            }
        }
        return "#x" + hex;
    }

    public static String intToHexSmt(long n) {
        StringBuilder hex = new StringBuilder(Arithmetic.intToHex(n));
        int len = hex.length();
        if (len < Configs.architecture / 4) {
            for (int i = 0; i < Configs.architecture / 4 - len; i++) {
                hex.insert(0, "0");
            }
        }
        String result = hex.toString();
        return "#x" + (result.contains("-") ? result.replace("-", "") : result);
    }

    public static String intToHex(long l) {
        String result = Long.toHexString(l);
        if(result.length() <= Configs.architecture/4){
            return result;
        }
        result = result.substring(result.length()-8, result.length());
        return result;
    }

    public static String decToBinary(String l) {
        return Long.toBinaryString(Long.parseLong(l.contains("#") ? l.replace("#", "") : l));
    }

    public static String hexToBinary(String hex) {
        return Long.toBinaryString(hexToInt(hex));
    }

    public static String bitsetToStr(BitSet b) {
        StringBuilder sb = new StringBuilder();
        if (b != null) {
            for (int i = Configs.architecture - 1; i >= 0; i--) {
                sb.append(b.get(i) ? 1 : 0);
            }
        }
        return sb.toString();
    }

    public static String bitVecToStr(BitVec b) {
        StringBuilder sb = new StringBuilder();
        if (b != null) {
            for (int i = b.getLength() - 1; i >= 0; i--) {
                sb.append(b.getVal().get(i) ? 1 : 0);
            }
        }
        return sb.toString();
    }

    public static String bitVecToHex(BitVec b){
        return intToHex(bitVecToLong(b));
    }

    public static BitVec fromString(final String s) {
        BitSet concreteValue = BitSet.valueOf(new long[]{Long.parseLong(s, 2)});
        String sym = intToHexSmt(bitSetToLong(concreteValue));
        return new BitVec(sym, concreteValue);
    }

    public static BitVec fromHexStr(final String s) {
        return fromString(hexToBinary(s));
    }

    public static BitSet floatToBitSet(float v) {
        return BitSet.valueOf(new long[]{Long.parseLong(Integer.toBinaryString(Float.floatToIntBits(v)), 2)});
    }

    public static float bitSetToFloat(BitSet b) {
        return Float.intBitsToFloat(Integer.parseInt(bitsetToStr(b), 2));
    }

    public static BitSet bic(BitSet bs, BitSet e) {
        bs.andNot(e);
        return bs;
    }

    public static int bitSetToInt(BitSet b) {
        int r = 0;
        for (int i = 0; i < 32; i++)
            if (b.get(i)) r |= (1 << i);
        return r;
    }

    public static long bitSetToLong(BitSet bits) {
        if (bits.length() == 0) return 0;
        StringBuilder s = new StringBuilder();
        for (int i = bits.length() - 1; i >= 0; i--) {
            s.append(bits.get(i) ? "1" : "0");
        }
        return (int) parseLong(s.toString());
    }

    public static BitSet bitSetToBitSet(BitSet bits) {
        if (bits.length() == 0) return BitSet.valueOf(new long[]{0});
        StringBuilder s = new StringBuilder();
        for (int i = bits.length() - 1; i >= 0; i--) {
            s.append(bits.get(i) ? "1" : "0");
        }



        BitSet concreteValue = BitSet.valueOf(new long[]{parseLong(s.toString())});
        return concreteValue;
    }

    public static long parseLong(String s){
        if(s.length() < 64){
            return Long.parseLong(s, 2);
        }
        return new BigInteger(s, 2).longValue();
    }

    public static long bitVecToLong(BitVec bits){
        if(bits.getLength() == 0) return 0;
        StringBuilder s = new StringBuilder();
        for (int i = bits.getLength() - 1; i >= 0; i--) {
            s.append(bits.getVal().get(i) ? "1" : "0");
        }
        long max = (long) Math.pow(2, bits.getLength());
        if(s.toString().length() == 64){
            return parseLong(s.toString());
        }
        if(bits.getVal().get(bits.getLength()-1)){
            return Long.parseLong(s.toString(), 2) - max;
        } else {
            return Long.parseLong(s.toString(), 2);
        }
    }

    public static BitVec longToBitVec(long value, int length){
        BitSet val =  longToBitSet(value);
        String sym = intToHexSmt(value);
        BitVec bitVec = new BitVec(sym, val);
        bitVec.setLength(length);
        return bitVec;
    }


    public static BitSet intToBitSet(int value) {
        BitSet bits = new BitSet();
        int index = 0;
        while (value != 0L) {
            if (value % 2L != 0) {
                bits.set(index);
            }
            ++index;
            value = value >>> 1;
        }
        return bits;
    }

    public static BitSet longToBitSet(long value) {
        return BitSet.valueOf(new long[]{value});
    }

    public static int saturate(int i, double lowerBound, double upperBound) {
        if (i > upperBound) return (int) upperBound;
        if (i < lowerBound) return (int) lowerBound;
        return i;
    }
}
