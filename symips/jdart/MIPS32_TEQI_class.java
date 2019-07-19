package symips.jdart;
import symips.emulator.base.*;
import symips.emulator.semantics.Environment;
public class MIPS32_TEQI_class {
	public MIPS32_TEQI_class() {}
	public static String MIPS32_TEQI(char rs, int immediate) {
		Environment env = new Environment(true);
		String report = env.takeInstance() + " -> ";
		new MIPS32(env).TEQI( rs,  immediate);
		return report + env.takeInstance();
	}

	public static void main(String[] args) {
        MIPS32_TEQI('7', 482);
    }
}