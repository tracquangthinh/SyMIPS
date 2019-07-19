package symips.jdart;
import symips.emulator.base.*;
import symips.emulator.semantics.Environment;
public class MIPS32_CLZ_class {
	public MIPS32_CLZ_class() {}
	public static String MIPS32_CLZ(char rd, char rs) {
		Environment env = new Environment(true);
		String report = env.takeInstance() + " -> ";
		new MIPS32(env).CLZ( rd,  rs);
		return report + env.takeInstance();
	}

	public static void main(String[] args) {
        MIPS32_CLZ('d', '8');
    }
}