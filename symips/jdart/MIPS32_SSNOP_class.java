package symips.jdart;
import symips.emulator.base.*;
import symips.emulator.semantics.Environment;
public class MIPS32_SSNOP_class {
	public MIPS32_SSNOP_class() {}
	public static String MIPS32_SSNOP() {
		Environment env = new Environment(true);
		String report = env.takeInstance() + " -> ";
		new MIPS32(env).SSNOP();
		return report + env.takeInstance();
	}

	public static void main(String[] args) {
        MIPS32_SSNOP();
    }
}