package symips.emulator.semantics;

import symips.apps.Configs;
import symips.unit.BitVec;
import symips.utils.Arithmetic;
import symips.utils.Logs;
import symips.utils.MyStr;

import java.util.HashMap;
import java.util.Random;

public class Environment {
    public Register register;
    public Memory memory;
    public Random generator;

    public Environment(Register reg, Memory mem){
        register = reg;
        memory = mem;
    }

    public Environment() {
        register = new Register(Configs.architecture, Arithmetic.intToBitSet(0), Arithmetic.intToBitSet(0),
                Arithmetic.intToBitSet(0), Arithmetic.intToBitSet(0),
                Arithmetic.intToBitSet(0), Arithmetic.intToBitSet(0),
                Arithmetic.intToBitSet(0), Arithmetic.intToBitSet(0),
                Arithmetic.intToBitSet(0), Arithmetic.intToBitSet(0),
                Arithmetic.intToBitSet(0), Arithmetic.intToBitSet(0),
                Arithmetic.intToBitSet(0), Arithmetic.intToBitSet(0),
                Arithmetic.intToBitSet(0), Arithmetic.intToBitSet(0),
                Arithmetic.intToBitSet(0), Arithmetic.intToBitSet(0),
                Arithmetic.intToBitSet(0), Arithmetic.intToBitSet(0),
                Arithmetic.intToBitSet(0), Arithmetic.intToBitSet(0),
                Arithmetic.intToBitSet(0), Arithmetic.intToBitSet(0),
                Arithmetic.intToBitSet(0), Arithmetic.intToBitSet(0),
                Arithmetic.intToBitSet(0), Arithmetic.intToBitSet(0),
                Arithmetic.intToBitSet(Configs.MEMSIZE), Arithmetic.intToBitSet(0),
                Arithmetic.intToBitSet(0), Arithmetic.intToBitSet(0),
                Arithmetic.intToBitSet(0), Arithmetic.intToBitSet(0));
        memory = new Memory(Configs.architecture);
    }

    public Environment(boolean isRand){
        Configs.RANDOM_SEED += 1;
        generator = new Random(Configs.RANDOM_SEED);
        if(isRand){
            register = new Register(Configs.architecture, Arithmetic.intToBitSet(rand()), Arithmetic.intToBitSet(rand()),
                    Arithmetic.intToBitSet(rand()), Arithmetic.intToBitSet(rand()),
                    Arithmetic.intToBitSet(rand()), Arithmetic.intToBitSet(rand()),
                    Arithmetic.intToBitSet(rand()), Arithmetic.intToBitSet(rand()),
                    Arithmetic.intToBitSet(rand()), Arithmetic.intToBitSet(rand()),
                    Arithmetic.intToBitSet(rand()), Arithmetic.intToBitSet(rand()),
                    Arithmetic.intToBitSet(rand()), Arithmetic.intToBitSet(rand()),
                    Arithmetic.intToBitSet(rand()), Arithmetic.intToBitSet(rand()),
                    Arithmetic.intToBitSet(rand()), Arithmetic.intToBitSet(rand()),
                    Arithmetic.intToBitSet(rand()), Arithmetic.intToBitSet(rand()),
                    Arithmetic.intToBitSet(rand()), Arithmetic.intToBitSet(rand()),
                    Arithmetic.intToBitSet(rand()), Arithmetic.intToBitSet(rand()),
                    Arithmetic.intToBitSet(rand()), Arithmetic.intToBitSet(rand()),
                    Arithmetic.intToBitSet(rand()), Arithmetic.intToBitSet(rand()),
                    Arithmetic.intToBitSet(Configs.MEMSIZE), Arithmetic.intToBitSet(rand()),
                    Arithmetic.intToBitSet(rand()), Arithmetic.intToBitSet(rand()),
                    Arithmetic.intToBitSet(rand()), Arithmetic.intToBitSet(rand()));
            memory = new Memory(Configs.architecture);
        }
    }

    public void loadOtherSections(HashMap<Long, byte[]> sections){
        Long[] addrs = sections.keySet().toArray(new Long[sections.keySet().size()]);
        for(int i = 0 ; i < addrs.length ; i++) {
            Long addr = addrs[i];
            byte[] bytes = sections.get(addr);
            for(int j = 0 ; j < bytes.length ; j++){
                memory.storeByte(addr + j, Arithmetic.longToBitVec(bytes[j], Configs.architecture));
            }
        }
    }

    public String takeInstance(){
        MyStr myStr = new MyStr();
        myStr.append("{");
        myStr.append("\"", '0', "\":", Arithmetic.bitVecToLong(register.get('0')));
        for(char c = '1' ; c <= '9' ; c++){
            myStr.append(",\"", c, "\":", Arithmetic.bitVecToLong(register.get(c)));
        }
        for(char c = 'a' ; c <= 'y' ; c++){
            myStr.append(",\"", c, "\":", Arithmetic.bitVecToLong(register.get(c)));
        }
        myStr.append("}");
        return myStr.value();
    }

    public BitVec value(Character r) {
        return new BitVec(register.get(r));
    }

    @Override
    public String toString() {
        return new MyStr(register.toString(), memory.toString()).value();
    }

    public int rand() {
        return new Random().nextInt((int) Math.pow(2, Configs.architecture >> 2));
    }

    public Environment clone(){
        Register newReg = register.clone();
        Memory newMemory = memory.clone();
        return new Environment(newReg, newMemory);
    }
}
