package symips.jdart;
import symips.emulator.base.*;
import symips.emulator.semantics.Environment;
public class microMIPS_TGE_class {
	public microMIPS_TGE_class() {}
	public static String microMIPS_TGE(char rs, char rt) {
		Environment env = new Environment(true);
		String report = env.takeInstance() + " -> ";
		new microMIPS(env).TGE( rs,  rt);
		return report + env.takeInstance();
	}

	public static void main(String[] args) {
        microMIPS_TGE('5', 'o');
    }
}