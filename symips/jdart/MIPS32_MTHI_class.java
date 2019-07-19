package symips.jdart;
import symips.emulator.base.*;
import symips.emulator.semantics.Environment;
public class MIPS32_MTHI_class {
	public MIPS32_MTHI_class() {}
	public static String MIPS32_MTHI(char rs) {
		Environment env = new Environment(true);
		String report = env.takeInstance() + " -> ";
		new MIPS32(env).MTHI( rs);
		return report + env.takeInstance();
	}

	public static void main(String[] args) {
        MIPS32_MTHI('c');
    }
}