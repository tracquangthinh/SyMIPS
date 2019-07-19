package symips.jdart;
import symips.emulator.base.*;
import symips.emulator.semantics.Environment;
public class microMIPS_AND16_class {
	public microMIPS_AND16_class() {}
	public static String microMIPS_AND16(char rt, char rs) {
		Environment env = new Environment(true);
		String report = env.takeInstance() + " -> ";
		new microMIPS(env).AND16( rt,  rs);
		return report + env.takeInstance();
	}

	public static void main(String[] args) {
        microMIPS_AND16('l', '3');
    }
}