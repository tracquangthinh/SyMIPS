package symips.jdart;
import symips.emulator.base.*;
import symips.emulator.semantics.Environment;
public class MIPS32_MADDU_class {
	public MIPS32_MADDU_class() {}
	public static String MIPS32_MADDU(char rs, char rt) {
		Environment env = new Environment(true);
		String report = env.takeInstance() + " -> ";
		new MIPS32(env).MADDU( rs,  rt);
		return report + env.takeInstance();
	}

	public static void main(String[] args) {
        MIPS32_MADDU('p', 'f');
    }
}