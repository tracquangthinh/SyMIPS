package symips.jdart;
import symips.emulator.base.*;
import symips.emulator.semantics.Environment;
public class MIPS32_TGEIU_class {
	public MIPS32_TGEIU_class() {}
	public static String MIPS32_TGEIU(char rs, int immediate) {
		Environment env = new Environment(true);
		String report = env.takeInstance() + " -> ";
		new MIPS32(env).TGEIU( rs,  immediate);
		return report + env.takeInstance();
	}

	public static void main(String[] args) {
        MIPS32_TGEIU('a', 426);
    }
}