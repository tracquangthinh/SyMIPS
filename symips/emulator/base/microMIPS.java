package symips.emulator.base;

import symips.emulator.semantics.Environment;
import symips.unit.BitVec;
import symips.utils.Arithmetic;
import symips.utils.Logs;

public class microMIPS extends Emulator {
    public microMIPS(Environment env) {
        super(env);
    }

    public void SLTI(Character rt, Character rs, int immediate) {
        if (less(val(rs), sign_extend(immediate))) {
            write(rt, concat(power(0, subtract(GPRLEN, 1)), 1));
        } else {
            write(rt, power(0, GPRLEN));
        }

    }

    public void NOR(Character rd, Character rs, Character rt) {
        write(rd, nor(val(rs), val(rt)));

    }

    public void ADD(Character rd, Character rs, Character rt) {
        BitVec temp = add(concat(val(rs).get(31), val(rs).get(0, 31)), concat(val(rt).get(31), val(rt).get(0, 31)));
        if (notEqual(temp.get(32), temp.get(31))) {
            SignalException(IntegerOverflow);
        } else {
            write(rd, temp);
        }

    }

    public void ADDIUS5(Character rd, int immediate) {
        BitVec temp = add(val(rd), sign_extend(immediate));
        write(rd, temp);

    }

    public void SLT(Character rd, Character rs, Character rt) {
        if (less(val(rs), val(rt))) {
            write(rd, concat(power(0, subtract(GPRLEN, 1)), 1));
        } else {
            write(rd, power(0, GPRLEN));
        }

    }

    public void AND16(Character rt, Character rs) {
        write(rt, and(val(rs), val(rt)));

    }

    public void SELEQZ(Character rd, Character rs, Character rt) {
        boolean cond = notEqual(val(rt), 0);
        if (cond) {
            Character tmp = rs;
            write(rd, tmp);
        } else {
            int tmp = 0;
            write(rd, tmp);
        }
    }

    public void XOR(Character rd, Character rs, Character rt) {
        write(rd, xor(val(rs), val(rt)));

    }

    public void ALIGN(Character rd, Character rs, Character rt, int bp) {
        BitVec tmp_rt_hi = shiftLeft(unsigned_word(rt), multiply(8, bp));
        BitVec tmp_rs_lo = shiftRight(unsigned_word(rs), multiply(8, subtract(4, bp)));
        BitVec tmp = or(tmp_rt_hi, tmp_rs_lo);
        write(rd, tmp);

    }

    public void AUI(Character rt, Character rs, int immediate) {
        write(rt, add(val(rs), sign_extend(shiftLeft(immediate, 16))));

    }

    public void ROTR(Character rt, Character rs, int sa) {
        int s = sa;
        BitVec temp = concat(val(rs).get(0, subtract(s, 1)), val(rs).get(s, 31));
        write(rt, temp);

    }

    public void MUHU(Character rd, Character rs, Character rt) {
        BitVec s1 = unsigned_word(rs);
        BitVec s2 = unsigned_word(rt);
        BitVec product = multiply(s1, s2);
        write(rd, hi_word(product));

    }

    public void MOD(Character rd, Character rs, Character rt) {
        BitVec s1 = signed_word(rs);
        BitVec s2 = signed_word(rt);
        BitVec remainder = mod(s1, s2);
        write(rd, remainder);

    }

    public void MULU(Character rd, Character rs, Character rt) {
        BitVec s1 = unsigned_word(rs);
        BitVec s2 = unsigned_word(rt);
        BitVec product = multiply(s1, s2);
        write(rd, lo_word(product));

    }

    public void ADDIUSP(int immediate) {
        BitVec temp = add(val(GPR_29), sign_extend(concat(immediate, power(0, 2))));
        write(GPR_29, temp);

    }

    public void ADDIUR2(Character rd, Character rs, int immediate) {
        BitVec temp = add(val(rs), sign_extend(immediate));
        write(rd, temp);

    }

    public void MUH(Character rd, Character rs, Character rt) {
        BitVec s1 = signed_word(rs);
        BitVec s2 = signed_word(rt);
        BitVec product = multiply(s1, s2);
        write(rd, hi_word(product));

    }

    public void DIVU(Character rd, Character rs, Character rt) {
        BitVec s1 = unsigned_word(rs);
        BitVec s2 = unsigned_word(rt);
        BitVec quotient = div(s1, s2);
        write(rd, quotient);

    }

    public void TGE(Character rs, Character rt) {
        if (greaterOrEqual(val(rs), val(rt))) {
            SignalException(Trap);
        }

    }

    public void TLTU(Character rs, Character rt) {
        if (less(concat(0, val(rs)), concat(0, val(rt)))) {
            SignalException(Trap);
        }

    }

    public void SEH(Character rt, Character rs) {
        write(rt, sign_extend(val(rs).get(0, 15)));

    }

    public void SUBU(Character rd, Character rs, Character rt) {
        BitVec temp = subtract(val(rs), val(rt));
        write(rd, temp);

    }

    public void CLO(Character rt, Character rs) {
        int temp = 32;
        for (int i = 0; i < 31; i++) {
            if (equal(val(rs).get(i), 0)) {
                temp = subtract(31, i);
                break;
            }

        }
        write(rt, temp);

    }

    public void MOVE16(Character rd, Character rs) {
        write(rd, rs);

    }

    public void MOVEP(Character rd, Character re, Character rs, Character rt) {
        write(rd, rs);
        write(re, rt);

    }

    public void CLZ(Character rt, Character rs) {
        int temp = 32;
        for (int i = 0; i < 31; i++) {
            if (equal(val(rs).get(i), 1)) {
                temp = subtract(31, i);
                break;
            }

        }
        write(rt, temp);

    }

    public void SRAV(Character rd, Character rt, Character rs) {
        BitVec s = val(rs).get(0, 4);
        BitVec temp = concat(power(val(rt).get(31), s), val(rt).get(s, 31));
        write(rd, temp);

    }

    public void ADDU(Character rd, Character rs, Character rt) {
        BitVec temp = add(val(rs), val(rt));
        write(rd, temp);

    }

    public void WSBH(Character rt, Character rs) {
        write(rt, concat(concat(concat(val(rs).get(16, 23), val(rs).get(24, 31)), val(rs).get(0, 7)), val(rs).get(8, 15)));

    }

    public void XOR16(Character rt, Character rs) {
        write(rt, xor(val(rs), val(rt)));

    }

    public void ADDU16(Character rd, Character rs, Character rt) {
        BitVec temp = add(val(rs), val(rt));
        write(rd, temp);

    }

    public void ANDI(Character rt, Character rs, int immediate) {
        write(rt, and(val(rs), zero_extend(immediate)));

    }

    public void ORI(Character rt, Character rs, int immediate) {
        write(rt, or(val(rs), zero_extend(immediate)));

    }

    public void SLLV(Character rd, Character rt, Character rs) {
        BitVec s = val(rs).get(0, 4);
        BitVec temp = concat(val(rt).get(0, subtract(31, s)), power(0, s));
        write(rd, temp);

    }

    public void ANDI16(Character rd, Character rs, int immediate) {
        write(rd, and(val(rs), zero_extend(immediate)));

    }

    public void SUB(Character rd, Character rs, Character rt) {
        BitVec temp = subtract(concat(val(rs).get(31), val(rs).get(0, 31)), concat(val(rt).get(31), val(rt).get(0, 31)));
        if (notEqual(temp.get(32), temp.get(31))) {
            SignalException(IntegerOverflow);
        } else {
            write(rd, temp.get(0, 31));
        }

    }

    public void TEQ(Character rs, Character rt) {
        if (equal(val(rs), val(rt))) {
            SignalException(Trap);
        }

    }

    public void LUI(Character rt, int immediate) {
        write(rt, concat(immediate, power(0, 16)));

    }

    public void TLT(Character rs, Character rt) {
        if (less(val(rs), val(rt))) {
            SignalException(Trap);
        }

    }

    public void ADDIU(Character rt, Character rs, int immediate) {
        BitVec temp = add(val(rs), sign_extend(immediate));
        write(rt, temp);

    }

    public void SRLV(Character rd, Character rt, Character rs) {
        BitVec s = val(rs).get(0, 4);
        BitVec temp = concat(power(0, s), val(rt).get(s, 31));
        write(rd, temp);

    }

    public void BREAK() {
        SignalException(Breakpoint);

    }

    public void DIV(Character rd, Character rs, Character rt) {
        BitVec s1 = signed_word(rs);
        BitVec s2 = signed_word(rt);
        BitVec quotient = div(s1, s2);
        write(rd, quotient);

    }

    public void SLL(Character rt, Character rs, int sa) {
        int s = sa;
        BitVec temp = concat(val(rs).get(0, subtract(31, s)), power(0, s));
        write(rt, temp);

    }

    public void SLTU(Character rd, Character rs, Character rt) {
        if (less(concat(0, val(rs)), concat(0, val(rt)))) {
            write(rd, concat(power(0, subtract(GPRLEN, 1)), 1));
        } else {
            write(rd, power(0, GPRLEN));
        }

    }

    public void BREAK16() {
        SignalException(Breakpoint);

    }

    public void OR(Character rd, Character rs, Character rt) {
        write(rd, or(val(rs), val(rt)));

    }

    public void AUIPC(Character rt, int immediate) {
        write(rt, add(val(PC), shiftLeft(immediate, 16)));

    }

    public void TNE(Character rs, Character rt) {
        if (notEqual(val(rs), val(rt))) {
            SignalException(Trap);
        }

    }

    public void SRL(Character rt, Character rs, int sa) {
        int s = sa;
        BitVec temp = concat(power(0, s), val(rs).get(s, 31));
        write(rt, temp);

    }

    public void LSA(Character rt, Character rs, Character rd, int sa) {
        write(rd, sign_extend(add(shiftLeft(val(rs), add(sa, 1)), val(rt))));

    }

    public void ROTRV(Character rd, Character rt, Character rs) {
        BitVec s = val(rs).get(0, 4);
        BitVec temp = concat(val(rt).get(0, subtract(s, 1)), val(rt).get(s, 31));
        write(rd, temp);

    }

    public void MODU(Character rd, Character rs, Character rt) {
        BitVec s1 = unsigned_word(rs);
        BitVec s2 = unsigned_word(rt);
        BitVec remainder = mod(s1, s2);
        write(rd, remainder);

    }

    public void MUL(Character rd, Character rs, Character rt) {
        BitVec s1 = signed_word(rs);
        BitVec s2 = signed_word(rt);
        BitVec product = multiply(s1, s2);
        write(rd, lo_word(product));

    }

    public void SLTIU(Character rt, Character rs, int immediate) {
        if (less(concat(0, val(rs)), concat(0, sign_extend(immediate)))) {
            write(rt, concat(power(0, subtract(GPRLEN, 1)), 1));
        } else {
            write(rt, power(0, GPRLEN));
        }

    }

    public void ALUIPC(Character rt, int immediate) {
        write(rt, and(Arithmetic.fromHexStr("0x0FFFF"), add(val(PC), sign_extend(shiftLeft(immediate, 16)))));

    }

    public void TGEU(Character rs, Character rt) {
        if (greaterOrEqual(concat(0, val(rs)), concat(0, val(rt)))) {
            SignalException(Trap);
        }

    }

    public void AND(Character rd, Character rs, Character rt) {
        write(rd, and(val(rs), val(rt)));

    }

    public void OR16(Character rt, Character rs) {
        write(rt, or(val(rs), val(rt)));

    }

    public void ADDIUPC(Character rt, int immediate) {
        write(rt, add(and(val(PC), Arithmetic.fromHexStr("0x3")), sign_extend(shiftLeft(immediate, 2))));

    }

    public void NOT16(Character rt, Character rs) {
        write(rt, xor(val(rs), Arithmetic.fromHexStr("0xffffffff")));


    }

    public void SELNEZ(Character rd, Character rs, Character rt) {
        boolean cond = equal(val(rt), 0);
        if (cond) {
            Character tmp = rs;
            write(rd, tmp);
        } else {
            int tmp = 0;
            write(rd, tmp);
        }
    }

    public void SUBU16(Character rd, Character rs, Character rt) {
        BitVec temp = subtract(val(rs), val(rt));
        write(rd, temp);

    }

}
