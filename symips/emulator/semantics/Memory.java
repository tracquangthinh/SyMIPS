package symips.emulator.semantics;

import symips.apps.Configs;
import symips.unit.BitVec;
import symips.utils.Arithmetic;
import symips.utils.Logs;
import symips.utils.MyStr;

import java.util.HashMap;

public class Memory {
    public static final long STARTADDRESS = Math.abs((int) Arithmetic.hexToInt("0x10000000"));
    public HashMap<String, Byte> memory;
    public HashMap<String, String> wordSymbolicMemory;
    public HashMap<String, String> halfWordSymbolicMemory;
    public HashMap<String, String> byteSymbolicMemory;
    private int length;


    public Memory(int length) {
        memory = new HashMap<>();
        wordSymbolicMemory = new HashMap<>();
        byteSymbolicMemory = new HashMap<>();
        halfWordSymbolicMemory = new HashMap<>();
        this.length = length;
    }

    public Memory(HashMap memoryValue, HashMap wordSym, HashMap byteSym, HashMap halfWordSym){
        this.memory = memoryValue;
        this.wordSymbolicMemory = wordSym;
        this.byteSymbolicMemory = byteSym;
        this.halfWordSymbolicMemory = halfWordSym;
        this.length = Configs.architecture;
    }

    public BitVec loadByte(long address){
        String key = Arithmetic.intToHex(address);
        byte concreteValue = memory.containsKey(key) ? memory.get(key).byteValue() : 0;
        String symbolicValue = byteSymbolicMemory.containsKey(key)? byteSymbolicMemory
                .get(key) : Arithmetic.intToHexSmt(concreteValue);
        BitVec bitVec = Arithmetic.longToBitVec(concreteValue, 8);
        bitVec.setSym(symbolicValue);
        return bitVec;
    }

    public BitVec loadWord(long address){
//        long v0 = (Arithmetic.bitVecToLong(loadByte(address+3)) & 0xff) << 24;
//        long v1 = (Arithmetic.bitVecToLong(loadByte(address+2)) & 0xff) << 16;
//        long v2 = (Arithmetic.bitVecToLong(loadByte(address+1)) & 0xff) << 8;
//        long v3 = (Arithmetic.bitVecToLong(loadByte(address)) & 0xff);
//        long v  = v0+v1+v2+v3;
        long v = 0;
        for (int i = 0; i < 4; i++)
        {
            v = (v << 8) + (Arithmetic.bitVecToLong(loadByte(address+i)) & 0xff);
        }
        BitVec bitVec = Arithmetic.longToBitVec(v, Configs.architecture);
        String symbolicValue = wordSymbolicMemory.get(Arithmetic.intToHex(address));
        if(symbolicValue != null){
            bitVec.setSym(symbolicValue);
        }
        return bitVec;
    }


    public BitVec loadHalfWord(long address){
        long v0 = (Arithmetic.bitVecToLong(loadByte(address+1)) & 0xff) << 8;
        long v1 = (Arithmetic.bitVecToLong(loadByte(address)) & 0xff);
        long v  = v0+v1;
        BitVec bitVec = Arithmetic.longToBitVec(v, Configs.architecture);
        String symbolicValue = halfWordSymbolicMemory.get(Arithmetic.intToHex(address));
        if(symbolicValue != null){
            bitVec.setSym(symbolicValue);
        }
        return bitVec;
    }

    public void storeByte(long address, BitVec value){
//        if(address < STARTADDRESS){
//            Logs.infoLn("Error: writeByte - Invalid address");
//            return ;
//        }
        byte source = (byte) (Arithmetic.bitVecToLong(value.get(0, 8)));
        memory.put(Arithmetic.intToHex(address), new Byte(source));
        byteSymbolicMemory.put(Arithmetic.intToHex(address), value.get(0,8).getSym());
    }

    private void storeByte(long address, byte value){
//        if(address < STARTADDRESS){
//            Logs.info("Error: writeByte - Invalid address");
//            return ;
//        }
        memory.put(Arithmetic.intToHex(address), new Byte(value));
    }

    public void storeWord(long address , BitVec b){
        int value = (int) Arithmetic.bitVecToLong(b);
        wordSymbolicMemory.put(Arithmetic.intToHex(address), b.getSym());
        storeByte(address  , (byte)(value>>24));
        storeByte(address+1, (byte)(value >>> 16 ));
        storeByte(address+2, (byte)(value >>> 8));
        storeByte(address+3, (byte)(value));
    }


    public void storeHalfWord(long address, BitVec b){
        int value = (int) Arithmetic.bitVecToLong(b);
        halfWordSymbolicMemory.put(Arithmetic.intToHex(address), b.getSym());
        storeByte(address  , (byte)(value));
        storeByte(address+1, (byte)(value >>> 8 ));
    }

    public long wordOfByte(long address){
        long pos = (address - STARTADDRESS)%4;
        return Arithmetic.bitVecToLong(loadWord(address-pos));
    }

    @Override
    public String toString() {
        MyStr result = new MyStr("+ Memory:\n");
//        Logs.infoLn(memory.size());
        for (String k : memory.keySet()) {
            result.append("\t- ", k.toString(), " : ", memory.get(k).toString(), "|", wordOfByte(Arithmetic.hexToInt(k)), "\n");
        }
        return result.value();
    }

    public Memory clone(){
        HashMap<String, Byte> newMemory = new HashMap<>();
        for(String key: memory.keySet()){
            newMemory.put(new String(key), new Byte(memory.get(key).byteValue()));
        }
        HashMap<String, String> newWordSymbolicMemory = new HashMap<>();
        for(String key: wordSymbolicMemory.keySet()){
            newWordSymbolicMemory.put(new String(key), new String(wordSymbolicMemory.get(key)));
        }

        HashMap<String, String> newByteSymbolicMemory = new HashMap<>();
        for(String key: byteSymbolicMemory.keySet()){
            newByteSymbolicMemory.put(new String(key), new String(byteSymbolicMemory.get(key)));
        }

        HashMap<String, String> newHalfWordSymbolicMemory = new HashMap<>();
        for(String key: halfWordSymbolicMemory.keySet()){
            newHalfWordSymbolicMemory.put(new String(key), new String(halfWordSymbolicMemory.get(key)));
        }

        Memory clone = new Memory(newMemory, newWordSymbolicMemory, newByteSymbolicMemory, newHalfWordSymbolicMemory);
        return clone;
    }
}

