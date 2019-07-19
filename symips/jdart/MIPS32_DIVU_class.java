package symips.jdart;
import symips.emulator.base.*;
import symips.emulator.semantics.Environment;
public class MIPS32_DIVU_class {
	public MIPS32_DIVU_class() {}
	public static String MIPS32_DIVU(char rs, char rt) {
		Environment env = new Environment(true);
		String report = env.takeInstance() + " -> ";
		new MIPS32(env).DIVU( rs,  rt);
		return report + env.takeInstance();
	}

	public static void main(String[] args) {
        MIPS32_DIVU('h', 'o');
    }
}