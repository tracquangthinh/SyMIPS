package symips.jdart;
import symips.emulator.base.*;
import symips.emulator.semantics.Environment;
public class MIPS32_SRA_class {
	public MIPS32_SRA_class() {}
	public static String MIPS32_SRA(char rd, char rt, int sa) {
		Environment env = new Environment(true);
		String report = env.takeInstance() + " -> ";
		new MIPS32(env).SRA( rd,  rt,  sa);
		return report + env.takeInstance();
	}

	public static void main(String[] args) {
        MIPS32_SRA('v', 'g', 250);
    }
}