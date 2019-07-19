package symips.jdart;
import symips.emulator.base.*;
import symips.emulator.semantics.Environment;
public class MIPS32_TLTIU_class {
	public MIPS32_TLTIU_class() {}
	public static String MIPS32_TLTIU(char rs, int immediate) {
		Environment env = new Environment(true);
		String report = env.takeInstance() + " -> ";
		new MIPS32(env).TLTIU( rs,  immediate);
		return report + env.takeInstance();
	}

	public static void main(String[] args) {
        MIPS32_TLTIU('c', 553);
    }
}