package symips.jdart;
import symips.emulator.base.*;
import symips.emulator.semantics.Environment;
public class MIPS32_TNE_class {
	public MIPS32_TNE_class() {}
	public static String MIPS32_TNE(char rs, char rt) {
		Environment env = new Environment(true);
		String report = env.takeInstance() + " -> ";
		new MIPS32(env).TNE( rs,  rt);
		return report + env.takeInstance();
	}

	public static void main(String[] args) {
        MIPS32_TNE('5', 'j');
    }
}