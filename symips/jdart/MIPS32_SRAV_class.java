package symips.jdart;
import symips.emulator.base.*;
import symips.emulator.semantics.Environment;
public class MIPS32_SRAV_class {
	public MIPS32_SRAV_class() {}
	public static String MIPS32_SRAV(char rd, char rt, char rs) {
		Environment env = new Environment(true);
		String report = env.takeInstance() + " -> ";
		new MIPS32(env).SRAV( rd,  rt,  rs);
		return report + env.takeInstance();
	}

	public static void main(String[] args) {
        MIPS32_SRAV('2', 'n', '7');
    }
}