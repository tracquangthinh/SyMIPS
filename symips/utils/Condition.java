package symips.utils;

import symips.emulator.base.Emulator;

public class Condition {
    public static String notEqualZero(String pathCondition, Emulator emulator, String r){
        Character reg = Mapping.regStrToChar.get(r);

        //depend on length of bitvec
        String zero = "#x";
        for(int i = 0 ; i < emulator.getEnv().value(reg).getLength()/4 ; i++){
            zero += "0";
        }

        String cond = "(not (= " + emulator.getEnv().value(reg).getSym() + " " + zero + "))";
        if(pathCondition != null && pathCondition.length() > 0){
            cond = "(and " + pathCondition + " " + cond + ")";
        }
        return cond;
    }

    public static String equalZero(String pathCondition, Emulator emulator, String r){
        Character reg = Mapping.regStrToChar.get(r);

        //depend on length of bitvec
        String zero = "#x";
        for(int i = 0 ; i < emulator.getEnv().value(reg).getLength()/4 ; i++){
            zero += "0";
        }

        String cond = "(= " + emulator.getEnv().value(reg).getSym() + " " + zero  + ")";
        if(pathCondition != null && pathCondition.length() > 0){
            cond = "(and " + pathCondition + " " + cond + ")";
        }
        return cond;
    }


    public static String lessThanZero(String pathCondition, Emulator emulator, String r){
        Character reg = Mapping.regStrToChar.get(r);

        //depend on length of bitvec
        String zero = "#x";
        for(int i = 0 ; i < emulator.getEnv().value(reg).getLength()/4 ; i++){
            zero += "0";
        }

        String cond = "(bvslt " + emulator.getEnv().value(reg).getSym() + " " + zero + ")";
        if(pathCondition != null && pathCondition.length() > 0){
            cond = "(and " + pathCondition + " " + cond + ")";
        }
        return cond;
    }

    public static String greaterOrEqualZero(String pathCondition, Emulator emulator, String r){
        Character reg = Mapping.regStrToChar.get(r);

        //depend on length of bitvec
        String zero = "#x";
        for(int i = 0 ; i < emulator.getEnv().value(reg).getLength()/4 ; i++){
            zero += "0";
        }

        String cond = "(bvsge " + emulator.getEnv().value(reg).getSym() + " " + zero + ")";
        if(pathCondition != null && pathCondition.length() > 0){
            cond = "(and " + pathCondition + " " + cond + ")";
        }
        return cond;
    }

    public static String greaterThanZero(String pathCondition, Emulator emulator, String r){
        Character reg = Mapping.regStrToChar.get(r);

        //depend on length of bitvec
        String zero = "#x";
        for(int i = 0 ; i < emulator.getEnv().value(reg).getLength()/4 ; i++){
            zero += "0";
        }

        String cond = "(bvsgt " + emulator.getEnv().value(reg).getSym() + " " + zero + ")";
        if(pathCondition != null && pathCondition.length() > 0){
            cond = "(and " + pathCondition + " " + cond + ")";
        }
        return cond;
    }

    public static String lessOrEqualZero(String pathCondition, Emulator emulator, String r){
        Character reg = Mapping.regStrToChar.get(r);

        //depend on length of bitvec
        String zero = "#x";
        for(int i = 0 ; i < emulator.getEnv().value(reg).getLength()/4 ; i++){
            zero += "0";
        }

        String cond = "(bvsle " + emulator.getEnv().value(reg).getSym() + " " + zero + ")";
        if(pathCondition != null && pathCondition.length() > 0){
            cond = "(and " + pathCondition + " " + cond + ")";
        }
        return cond;
    }

    public static String notEqual(String pathCondition, Emulator emulator, String r, String s){
        Character reg1 = Mapping.regStrToChar.get(r);
        Character reg2 = Mapping.regStrToChar.get(s);
        String cond = "(not (= " + emulator.getEnv().value(reg1).getSym() + " "
                + emulator.getEnv().value(reg2).getSym() + "))";
        if(pathCondition != null && pathCondition.length() > 0){
            cond = "(and " + pathCondition + " " + cond + ")";
        }
        return cond;
    }

    public static String equal(String pathCondition, Emulator emulator, String r, String s){
        Character reg1 = Mapping.regStrToChar.get(r);
        Character reg2 = Mapping.regStrToChar.get(s);
        String cond = "(= " + emulator.getEnv().value(reg1).getSym() + " "
                + emulator.getEnv().value(reg2).getSym() + ")";
        if(pathCondition != null && pathCondition.length() > 0){
            cond = "(and " + pathCondition + " " + cond + ")";
        }
        return cond;
    }

}
