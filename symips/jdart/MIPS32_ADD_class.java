package symips.jdart;
import symips.emulator.base.*;
import symips.emulator.semantics.Environment;
public class MIPS32_ADD_class {
	public MIPS32_ADD_class() {}
	public static String MIPS32_ADD(char rt, char rs, char rd) {
		Environment env = new Environment(true);
		String report = env.takeInstance() + " -> ";
		new MIPS32(env).ADD( rt,  rs,  rd);
		return report + env.takeInstance();
	}

	public static void main(String[] args) {
        MIPS32_ADD('j', 'b', '4');
    }
}