package symips.jdart;
import symips.emulator.base.*;
import symips.emulator.semantics.Environment;
public class MIPS32_LUI_class {
	public MIPS32_LUI_class() {}
	public static String MIPS32_LUI(char rt, int immediate) {
		Environment env = new Environment(true);
		String report = env.takeInstance() + " -> ";
		new MIPS32(env).LUI( rt,  immediate);
		return report + env.takeInstance();
	}

	public static void main(String[] args) {
        MIPS32_LUI('7', 503);
    }
}