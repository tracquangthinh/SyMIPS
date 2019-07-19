package symips.jdart;
import symips.emulator.base.*;
import symips.emulator.semantics.Environment;
public class MIPS32_SRLV_class {
	public MIPS32_SRLV_class() {}
	public static String MIPS32_SRLV(char rd, char rt, char rs) {
		Environment env = new Environment(true);
		String report = env.takeInstance() + " -> ";
		new MIPS32(env).SRLV( rd,  rt,  rs);
		return report + env.takeInstance();
	}

	public static void main(String[] args) {
        MIPS32_SRLV('i', 'i', '4');
    }
}