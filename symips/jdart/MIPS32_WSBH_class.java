package symips.jdart;
import symips.emulator.base.*;
import symips.emulator.semantics.Environment;
public class MIPS32_WSBH_class {
	public MIPS32_WSBH_class() {}
	public static String MIPS32_WSBH(char rd, char rt) {
		Environment env = new Environment(true);
		String report = env.takeInstance() + " -> ";
		new MIPS32(env).WSBH( rd,  rt);
		return report + env.takeInstance();
	}

	public static void main(String[] args) {
        MIPS32_WSBH('5', '6');
    }
}