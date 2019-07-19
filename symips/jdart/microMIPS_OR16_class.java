package symips.jdart;
import symips.emulator.base.*;
import symips.emulator.semantics.Environment;
public class microMIPS_OR16_class {
	public microMIPS_OR16_class() {}
	public static String microMIPS_OR16(char rt, char rs) {
		Environment env = new Environment(true);
		String report = env.takeInstance() + " -> ";
		new microMIPS(env).OR16( rt,  rs);
		return report + env.takeInstance();
	}

	public static void main(String[] args) {
        microMIPS_OR16('4', 'i');
    }
}