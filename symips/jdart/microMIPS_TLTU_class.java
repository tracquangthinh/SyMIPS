package symips.jdart;
import symips.emulator.base.*;
import symips.emulator.semantics.Environment;
public class microMIPS_TLTU_class {
	public microMIPS_TLTU_class() {}
	public static String microMIPS_TLTU(char rs, char rt) {
		Environment env = new Environment(true);
		String report = env.takeInstance() + " -> ";
		new microMIPS(env).TLTU( rs,  rt);
		return report + env.takeInstance();
	}

	public static void main(String[] args) {
        microMIPS_TLTU('e', 'd');
    }
}