package symips.jdart;
import symips.emulator.base.*;
import symips.emulator.semantics.Environment;
public class MIPS32_XOR_class {
	public MIPS32_XOR_class() {}
	public static String MIPS32_XOR(char rd, char rs, char rt) {
		Environment env = new Environment(true);
		String report = env.takeInstance() + " -> ";
		new MIPS32(env).XOR( rd,  rs,  rt);
		return report + env.takeInstance();
	}

	public static void main(String[] args) {
        MIPS32_XOR('3', 'e', 'f');
    }
}