package symips.jdart;
import symips.emulator.base.*;
import symips.emulator.semantics.Environment;
public class MIPS32_SLTIU_class {
	public MIPS32_SLTIU_class() {}
	public static String MIPS32_SLTIU(char rt, char rs, int immediate) {
		Environment env = new Environment(true);
		String report = env.takeInstance() + " -> ";
		new MIPS32(env).SLTIU( rt,  rs,  immediate);
		return report + env.takeInstance();
	}

	public static void main(String[] args) {
        MIPS32_SLTIU('p', 'v', 513);
    }
}