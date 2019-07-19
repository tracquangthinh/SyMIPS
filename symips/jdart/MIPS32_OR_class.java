package symips.jdart;
import symips.emulator.base.*;
import symips.emulator.semantics.Environment;
public class MIPS32_OR_class {
	public MIPS32_OR_class() {}
	public static String MIPS32_OR(char rd, char rs, char rt) {
		Environment env = new Environment(true);
		String report = env.takeInstance() + " -> ";
		new MIPS32(env).OR( rd,  rs,  rt);
		return report + env.takeInstance();
	}

	public static void main(String[] args) {
        MIPS32_OR('v', '7', 'j');
    }
}