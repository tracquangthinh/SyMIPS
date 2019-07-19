package symips.jdart;
import symips.emulator.base.*;
import symips.emulator.semantics.Environment;
public class microMIPS_TNE_class {
	public microMIPS_TNE_class() {}
	public static String microMIPS_TNE(char rs, char rt) {
		Environment env = new Environment(true);
		String report = env.takeInstance() + " -> ";
		new microMIPS(env).TNE( rs,  rt);
		return report + env.takeInstance();
	}

	public static void main(String[] args) {
        microMIPS_TNE('3', '1');
    }
}