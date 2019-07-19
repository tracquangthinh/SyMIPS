package symips.jdart;
import symips.emulator.base.*;
import symips.emulator.semantics.Environment;
public class MIPS32_ADDIU_class {
	public MIPS32_ADDIU_class() {}
	public static String MIPS32_ADDIU(char rt, char rs, int immediate) {
		Environment env = new Environment(true);
		String report = env.takeInstance() + " -> ";
		new MIPS32(env).ADDIU( rt,  rs,  immediate);
		return report + env.takeInstance();
	}

	public static void main(String[] args) {
        MIPS32_ADDIU('n', 'h', 285);
    }
}