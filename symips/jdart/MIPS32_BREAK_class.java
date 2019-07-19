package symips.jdart;
import symips.emulator.base.*;
import symips.emulator.semantics.Environment;
public class MIPS32_BREAK_class {
	public MIPS32_BREAK_class() {}
	public static String MIPS32_BREAK() {
		Environment env = new Environment(true);
		String report = env.takeInstance() + " -> ";
		new MIPS32(env).BREAK();
		return report + env.takeInstance();
	}

	public static void main(String[] args) {
        MIPS32_BREAK();
    }
}