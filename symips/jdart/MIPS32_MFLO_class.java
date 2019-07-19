package symips.jdart;
import symips.emulator.base.*;
import symips.emulator.semantics.Environment;
public class MIPS32_MFLO_class {
	public MIPS32_MFLO_class() {}
	public static String MIPS32_MFLO(char rd) {
		Environment env = new Environment(true);
		String report = env.takeInstance() + " -> ";
		new MIPS32(env).MFLO( rd);
		return report + env.takeInstance();
	}

	public static void main(String[] args) {
        MIPS32_MFLO('5');
    }
}