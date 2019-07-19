package symips.jdart;
import symips.emulator.base.*;
import symips.emulator.semantics.Environment;
public class microMIPS_TLT_class {
	public microMIPS_TLT_class() {}
	public static String microMIPS_TLT(char rs, char rt) {
		Environment env = new Environment(true);
		String report = env.takeInstance() + " -> ";
		new microMIPS(env).TLT( rs,  rt);
		return report + env.takeInstance();
	}

	public static void main(String[] args) {
        microMIPS_TLT('n', '1');
    }
}