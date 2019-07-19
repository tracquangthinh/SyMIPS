package symips.jdart;
import symips.emulator.base.*;
import symips.emulator.semantics.Environment;
public class MIPS32_CLO_class {
	public MIPS32_CLO_class() {}
	public static String MIPS32_CLO(char rd, char rs) {
		Environment env = new Environment(true);
		String report = env.takeInstance() + " -> ";
		new MIPS32(env).CLO( rd,  rs);
		return report + env.takeInstance();
	}

	public static void main(String[] args) {
        MIPS32_CLO('n', 'a');
    }
}