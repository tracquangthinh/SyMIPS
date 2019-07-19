package symips.jdart;
import symips.emulator.base.*;
import symips.emulator.semantics.Environment;
public class MIPS32_MSUBU_class {
	public MIPS32_MSUBU_class() {}
	public static String MIPS32_MSUBU(char rs, char rt) {
		Environment env = new Environment(true);
		String report = env.takeInstance() + " -> ";
		new MIPS32(env).MSUBU( rs,  rt);
		return report + env.takeInstance();
	}

	public static void main(String[] args) {
        MIPS32_MSUBU('7', '7');
    }
}