package symips.jdart;
import symips.emulator.base.*;
import symips.emulator.semantics.Environment;
public class MIPS32_SLTU_class {
	public MIPS32_SLTU_class() {}
	public static String MIPS32_SLTU(char rd, char rs, char rt) {
		Environment env = new Environment(true);
		String report = env.takeInstance() + " -> ";
		new MIPS32(env).SLTU( rd,  rs,  rt);
		return report + env.takeInstance();
	}

	public static void main(String[] args) {
        MIPS32_SLTU('g', '3', '7');
    }
}