package symips.jdart;
import symips.emulator.base.*;
import symips.emulator.semantics.Environment;
public class MIPS32_SRL_class {
	public MIPS32_SRL_class() {}
	public static String MIPS32_SRL(char rd, char rt, int sa) {
		Environment env = new Environment(true);
		String report = env.takeInstance() + " -> ";
		new MIPS32(env).SRL( rd,  rt,  sa);
		return report + env.takeInstance();
	}

	public static void main(String[] args) {
        MIPS32_SRL('o', '8', 99);
    }
}