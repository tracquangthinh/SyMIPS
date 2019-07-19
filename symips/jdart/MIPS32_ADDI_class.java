package symips.jdart;
import symips.emulator.base.*;
import symips.emulator.semantics.Environment;
public class MIPS32_ADDI_class {
	public MIPS32_ADDI_class() {}
	public static String MIPS32_ADDI(char rt, char rs, int immediate) {
		Environment env = new Environment(true);
		String report = env.takeInstance() + " -> ";
		new MIPS32(env).ADDI( rt,  rs,  immediate);
		return report + env.takeInstance();
	}

	public static void main(String[] args) {
        MIPS32_ADDI('7', 'h', 703);
    }
}