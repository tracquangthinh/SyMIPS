package symips.jdart;
import symips.emulator.base.*;
import symips.emulator.semantics.Environment;
public class MIPS32_SUB_class {
	public MIPS32_SUB_class() {}
	public static String MIPS32_SUB(char rd, char rs, char rt) {
		Environment env = new Environment(true);
		String report = env.takeInstance() + " -> ";
		new MIPS32(env).SUB( rd,  rs,  rt);
		return report + env.takeInstance();
	}

	public static void main(String[] args) {
        MIPS32_SUB('5', '1', 'p');
    }
}