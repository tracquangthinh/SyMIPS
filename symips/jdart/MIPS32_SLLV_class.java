package symips.jdart;
import symips.emulator.base.*;
import symips.emulator.semantics.Environment;
public class MIPS32_SLLV_class {
	public MIPS32_SLLV_class() {}
	public static String MIPS32_SLLV(char rd, char rt, char rs) {
		Environment env = new Environment(true);
		String report = env.takeInstance() + " -> ";
		new MIPS32(env).SLLV( rd,  rt,  rs);
		return report + env.takeInstance();
	}

	public static void main(String[] args) {
        MIPS32_SLLV('f', 'v', 'b');
    }
}