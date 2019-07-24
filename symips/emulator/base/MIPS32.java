package symips.emulator.base;

import symips.emulator.semantics.Environment;
import symips.unit.BitVec;
import symips.utils.Arithmetic;
import symips.utils.Logs;

public class MIPS32 extends Emulator{
	public MIPS32(Environment env){ super(env); }

	public void ADD(Character rd, Character rs, Character rt){
		write(rd, add(val(rs), val(rt)));
	}

	public  void ADDU(Character rd, Character rs, Character rt){
		BitVec temp = add(val(rs), val(rt));
		write(rd, temp);
	}
	public void ADDIU(Character rt, Character rs, int immediate){
		if(Math.abs(immediate) <= Math.pow(2, 16)) {
			BitVec temp = add(val(rs), sign_extend(immediate));
			write(rt, temp);
		}

	}

	public void LUI(Character rt, int immediate){
		if(Math.abs(immediate) <= Math.pow(2, 16)) {
			write(rt, sign_extend(concat(immediate, power(0, 16))));
		}

	}

	public void TLTU(Character rs, Character rt){
		if(less(concat(0, val(rs)), concat(0, val(rt)))){
			SignalException(Trap);
		}

	}

	public void OR(Character rd, Character rs, Character rt){
		write(rd,or(val(rs), val(rt)));

	}

	public void MSUBU(Character rs, Character rt){
		BitVec temp = subtract(concat(val(HI).get(0, 31), val(LO).get(0, 31)), multiply(concat(power(0, 32), val(rs).get(0, 31)), concat(power(0, 32), val(rt).get(0, 31))));
		write(HI,sign_extend(temp.get(32, 63)));
		write(LO,sign_extend(temp.get(0, 31)));

	}

	public void TEQI(Character rs, int immediate){
		if(Math.abs(immediate) <= Math.pow(2, 16)) {
			if (equal(val(rs), sign_extend(immediate))) {
				SignalException(Trap);
			}
		}

	}

	public void SLL(Character rd, Character rt, int sa){
		int s = sa;
		BitVec temp = concat(val(rt).get(0, subtract(31, s)), power(0, s));
		write(rd,sign_extend(temp));

	}

	public void SLTI(Character rt, Character rs, int immediate){
		if(Math.abs(immediate) <= Math.pow(2, 16)) {
			if (less(val(rs), sign_extend(immediate))) {
				write(rt, concat(power(0, subtract(GPRLEN, 1)), 1));
			} else {
				write(rt, power(0, GPRLEN));
			}
		}

	}

	public void MOVN(Character rd, Character rs, Character rt){
		if(notEqual(val(rt), 0)){
			write(rd,rs);
		}

	}

	public void SSNOP(){
		NOP();
	}

	public void NOP(){

	}

	public void SEH(Character rd, Character rt){
		write(rd,sign_extend(val(rt).get(0, 15)));

	}

	public void SUB(Character rd, Character rs, Character rt){
		BitVec temp = subtract(concat(val(rs).get(31), val(rs).get(0, 31)), concat(val(rt).get(31), val(rt).get(0, 31)));
		if(notEqual(temp.get(32), temp.get(31))){
			SignalException(IntegerOverflow);
		} else {
			write(rd,sign_extend(temp.get(0, 31)));
		}

	}

	public void TLTIU(Character rs, int immediate){

		if(Math.abs(immediate) <= Math.pow(2, 16)) {
			if (less(concat(0, val(rs)), concat(0, sign_extend(immediate)))) {
				SignalException(Trap);
			}
		}

	}

	public void TLT(Character rs, Character rt){
		if(less(val(rs), val(rt))){
			SignalException(Trap);
		}

	}

	public void AND(Character rd, Character rs, Character rt){
		write(rd,and(val(rs), val(rt)));

	}

	public void DIVU(Character rs, Character rt){
		BitVec q = div(concat(0, val(rs).get(0, 31)), concat(0, val(rt).get(0, 31)));
		BitVec r = mod(concat(0, val(rs).get(0, 31)), concat(0, val(rt).get(0, 31)));
		write(LO,sign_extend(q.get(0, 31)));
		write(HI,sign_extend(r.get(0, 31)));

	}

	public void MUL(Character rd, Character rs, Character rt){
		BitVec temp = multiply(val(rs), val(rt));
		write(rd,sign_extend(temp.get(0, 31)));
		write(HI,UNPREDICTABLE());
		write(LO,UNPREDICTABLE());

	}

	public void SRA(Character rd, Character rt, int sa){
		int s = sa;
		BitVec temp = concat(power(val(rt).get(31), s), val(rt).get(s, 31));
		write(rd,sign_extend(temp));

	}

	public void TNE(Character rs, Character rt){
		if(notEqual(val(rs), val(rt))){
			SignalException(Trap);
		}

	}

	public void DIV(Character rs, Character rt){
		BitVec q = div(val(rs).get(0, 31), val(rt).get(0, 31));
		write(LO,sign_extend(q.get(0, 31)));
		BitVec r = mod(val(rs).get(0, 31), val(rt).get(0, 31));
		write(HI,sign_extend(r.get(0, 31)));

	}

	public void TGEIU(Character rs, int immediate){
		if(Math.abs(immediate) <= Math.pow(2, 16)) {
			if (greaterOrEqual(concat(0, val(rs)), concat(0, sign_extend(immediate)))) {
				SignalException(Trap);
			}
		}

	}

	public void CLZ(Character rd, Character rs){
		int temp = 32;
		for(int i = 0; i < 31; i++){
			if(equal(val(rs).get(i), 1)){
				temp = subtract(31, i);
			}

		}
		write(rd,temp);

	}

	public void MTLO(Character rs){
		write(LO,rs);

	}

	public void MULT(Character rs, Character rt){
		BitVec prod = multiply(val(rs).get(0, 31), val(rt).get(0, 31));
		write(LO,sign_extend(prod.get(0, 31)));
		write(HI,sign_extend(prod.get(32, 63)));

	}

	public void SRAV(Character rd, Character rt, Character rs){
		BitVec s = val(rs).get(0, 4);
		BitVec temp = concat(power(val(rt).get(31), s), val(rt).get(s, 31));
		write(rd,sign_extend(temp));

	}

	public void SRL(Character rd, Character rt, int sa){
		int s = sa;
		BitVec temp = concat(power(0, s), val(rt).get(s, 31));
		write(rd,sign_extend(temp));

	}

	public void NOR(Character rd, Character rs, Character rt){
		write(rd,nor(val(rs), val(rt)));

	}

	public void CLO(Character rd, Character rs){
		int temp = 32;
		for(int i = 0; i < 31; i++){
			if(equal(val(rs).get(i), 0)){
				temp = subtract(31, i);
			}

		}write(rd,temp);

	}

	public void MSUB(Character rs, Character rt){
		BitVec temp = subtract(concat(val(HI).get(0, 31), val(LO).get(0, 31)), multiply(val(rs).get(0, 31), val(rt).get(0, 31)));
		write(HI,sign_extend(temp.get(32, 63)));
		write(LO,sign_extend(temp.get(0, 31)));

	}

	public void MFLO(Character rd){
		write(rd,LO);

	}

	public void ANDI(Character rt, Character rs, int immediate){
		if(Math.abs(immediate) <= Math.pow(2, 16)) {
			write(rt, and(val(rs), zero_extend(immediate)));
		}

	}

	public void SUBU(Character rd, Character rs, Character rt){
		BitVec temp = subtract(val(rs), val(rt));
		write(rd,sign_extend(temp));

	}

	public void MTHI(Character rs){
		write(HI,rs);

	}

	public void TGEI(Character rs, int immediate){
		if(Math.abs(immediate) <= Math.pow(2, 16)) {
			if (greaterOrEqual(val(rs), sign_extend(immediate))) {
				SignalException(Trap);
			}
		}

	}

	public void SLTIU(Character rt, Character rs, int immediate){
		if(Math.abs(immediate) <= Math.pow(2, 16)) {
			if (less(concat(0, val(rs)), concat(0, sign_extend(immediate)))) {
				write(rt, concat(power(0, subtract(GPRLEN, 1)), 1));
			} else {
				write(rt, power(0, GPRLEN));
			}
		}

	}

	public void TGEU(Character rs, Character rt){
		if(greaterOrEqual(concat(0, val(rs)), concat(0, val(rt)))){
			SignalException(Trap);
		}

	}

	public void MFHI(Character rd){
		write(rd,HI);

	}

	public void SLTU(Character rd, Character rs, Character rt){
		if(less(concat(0, val(rs)), concat(0, val(rt)))){
			write(rd,concat(power(0, subtract(GPRLEN, 1)), 1));
		} else {
			write(rd,power(0, GPRLEN));
		}

	}

	public void TEQ(Character rs, Character rt, int Trap){
		if(equal(val(rs), val(rt))){
			SignalException(Trap);
		}

	}


	public void TEQ(Character rs, Character rt){
		if(equal(val(rs), val(rt))){
			SignalException(Trap);
		}

	}


	public void SRLV(Character rd, Character rt, Character rs){
		BitVec s = val(rs).get(0, 4);
		BitVec temp = concat(power(0, s), val(rt).get(s, 31));
		write(rd,sign_extend(temp));

	}

	public void MOVZZ(Character rd, Character rs, Character rt){
		if(equal(val(rt), 0)){
			write(rd,rs);
		}

	}

	public void ROTR(Character rd, Character rt, int sa){
		int s = sa;
		BitVec temp = concat(val(rt).get(0, s-1), val(rt).get(s, 31));
		write(rd, temp);

	}

	public void ROTRV(Character rd, Character rt, Character rs){
		int s = (int) Arithmetic.bitVecToLong(val(rs).get(0, 4));
		BitVec temp = concat(val(rt).get(0, s-1), val(rt).get(s, 31));
		write(rd, temp);

	}

	public void MADD(Character rs, Character rt){
		BitVec temp = add(concat(val(HI).get(0, 31), val(LO).get(0, 31)), multiply(val(rs).get(0, 31), val(rt).get(0, 31)));
		write(HI,sign_extend(temp.get(32, 63)));
		write(LO,sign_extend(temp.get(0, 31)));

	}

	public void TGE(Character rs, Character rt){
		if(greaterOrEqual(val(rs), val(rt))){
			SignalException(Trap);
		}

	}

    public void SEB(Character rd, Character rt){
        write(rd,sign_extend(val(rt).get(0, 7)));

    }

    public void WSBH(Character rd, Character rt){
        write(rd,sign_extend(concat(concat(concat(val(rt).get(16, 23), val(rt).get(24, 31)), val(rt).get(0, 7)), val(rt).get(8, 15))));

    }

    public void EXT(Character rt, Character rs, int pos, int size){
		int msbd = size-1;
		int lsb = pos;
		BitVec temp = concat(power(0, 32-(msbd+1)), val(rs).get(lsb, msbd+lsb));
		write(rt, temp);

	}

	public void INS(Character rt, Character rs, int pos, int size){
		int msb = pos+size-1;
		int lsb = pos;
		write(rt, concat(val(rt).get(msb+1, 31),  concat(val(rs).get(0, msb-lsb), val(rt).get(0, lsb-1))));

	}

    public void TLTI(Character rs, int immediate){
		if(Math.abs(immediate) <= Math.pow(2, 16)) {
			if (less(val(rs), sign_extend(immediate))) {
				SignalException(Trap);
			}
		}

    }

    public void ADDI(Character rt, Character rs, int immediate){
	    if(Math.abs(immediate) <= Math.pow(2, 16)) {
			BitVec temp = add(concat(val(rs).get(31), val(rs).get(0, 31)), sign_extend(immediate));
			if (notEqual(temp.get(32), temp.get(31))) {
				SignalException(IntegerOverflow);
			} else {
				write(rt, sign_extend(temp.get(0, 31)));
			}
		}

    }

    public void BREAK(){
        SignalException(Breakpoint);

    }

    public void SLT(Character rd, Character rs, Character rt){
        if(less(val(rs), val(rt))){
            write(rd,concat(power(0, subtract(GPRLEN, 1)), 1));
        } else {
            write(rd,power(0, GPRLEN));
        }

    }

    public void XOR(Character rd, Character rs, Character rt){
        write(rd,xor(val(rs), val(rt)));

    }

	public void XORI(Character rt, Character rs, int immediate){
		if(Math.abs(immediate) <= Math.pow(2, 16)) {
			BitVec temp = xor(val(rs), zero_extend(immediate));
			write(rt, temp);
		}
	}

    public void MULTU(Character rs, Character rt){
        BitVec prod = multiply(concat(0, val(rs).get(0, 31)), concat(0, val(rt).get(0, 31)));
        write(LO,sign_extend(prod.get(0, 31)));
        write(HI,sign_extend(prod.get(32, 63)));

    }

    public void MADDU(Character rs, Character rt){
        BitVec temp = add(concat(val(HI).get(0, 31), val(LO).get(0, 31)), multiply(concat(power(0, 32), val(rs).get(0, 31)), concat(power(0, 32), val(rt).get(0, 31))));
        write(HI,sign_extend(temp.get(32, 63)));
        write(LO,sign_extend(temp.get(0, 31)));

    }

    public void MOVE(Character rs, Character rt){
		write(rs, val(rt));
	}

    public void SLLV(Character rd, Character rt, Character rs){
        BitVec s = val(rs).get(0, 4);
        BitVec temp = concat(val(rt).get(0, subtract(31, s)), power(0, s));
        write(rd,sign_extend(temp));

    }

    public void TNEI(Character rs, int immediate){
		if(Math.abs(immediate) <= Math.pow(2, 16)) {
			if (notEqual(val(rs), sign_extend(immediate))) {
				SignalException(Trap);
			}
		}

    }

    public void ORI(Character rt, Character rs, int immediate){
		if(Math.abs(immediate) <= Math.pow(2, 16)) {
			write(rt, or(val(rs), zero_extend(immediate)));
		}

    }

	public static void main(String[] args){
		Environment env = new Environment();
		MIPS32 emu = new MIPS32(env);
		emu.ADDIU('1', '0', (int)Arithmetic.hexToInt("-0x970"));
		Logs.infoLn(emu.getEnv());
	}
}
