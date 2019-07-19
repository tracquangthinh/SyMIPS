package symips.jdart;
import symips.emulator.base.*;
import symips.emulator.semantics.Environment;
public class MIPS32_MULTU_class {
	public MIPS32_MULTU_class() {}
	public static String MIPS32_MULTU(char rs, char rt) {
		Environment env = new Environment(true);
		String report = env.takeInstance() + " -> ";
		new MIPS32(env).MULTU( rs,  rt);
		return report + env.takeInstance();
	}

	public static void main(String[] args) {
        MIPS32_MULTU('k', '5');
    }
}