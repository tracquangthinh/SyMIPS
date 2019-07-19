package symips.jdart;
import symips.emulator.base.*;
import symips.emulator.semantics.Environment;
public class microMIPS_TEQ_class {
	public microMIPS_TEQ_class() {}
	public static String microMIPS_TEQ(char rs, char rt) {
		Environment env = new Environment(true);
		String report = env.takeInstance() + " -> ";
		new microMIPS(env).TEQ( rs,  rt);
		return report + env.takeInstance();
	}

	public static void main(String[] args) {
        microMIPS_TEQ('d', 'c');
    }
}