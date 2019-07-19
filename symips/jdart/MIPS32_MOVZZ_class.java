package symips.jdart;
import symips.emulator.base.*;
import symips.emulator.semantics.Environment;
public class MIPS32_MOVZZ_class {
	public MIPS32_MOVZZ_class() {}
	public static String MIPS32_MOVZZ(char rd, char rs, char rt) {
		Environment env = new Environment(true);
		String report = env.takeInstance() + " -> ";
		new MIPS32(env).MOVZZ( rd,  rs,  rt);
		return report + env.takeInstance();
	}

	public static void main(String[] args) {
        MIPS32_MOVZZ('3', 'j', 'l');
    }
}