package symips.jdart;
import symips.emulator.base.*;
import symips.emulator.semantics.Environment;
public class MIPS32_SLL_class {
	public MIPS32_SLL_class() {}
	public static String MIPS32_SLL(char rd, char rt, int sa) {
		Environment env = new Environment(true);
		String report = env.takeInstance() + " -> ";
		new MIPS32(env).SLL( rd,  rt,  sa);
		return report + env.takeInstance();
	}

	public static void main(String[] args) {
        MIPS32_SLL('g', '2', 898);
    }
}