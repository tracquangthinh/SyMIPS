package symips.jdart;
import symips.emulator.base.*;
import symips.emulator.semantics.Environment;
public class MIPS32_SUBU_class {
	public MIPS32_SUBU_class() {}
	public static String MIPS32_SUBU(char rd, char rs, char rt) {
		Environment env = new Environment(true);
		String report = env.takeInstance() + " -> ";
		new MIPS32(env).SUBU( rd,  rs,  rt);
		return report + env.takeInstance();
	}

	public static void main(String[] args) {
        MIPS32_SUBU('3', 'j', 'b');
    }
}