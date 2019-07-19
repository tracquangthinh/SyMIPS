package symips.jdart;
import symips.emulator.base.*;
import symips.emulator.semantics.Environment;
public class microMIPS_BREAK16_class {
	public microMIPS_BREAK16_class() {}
	public static String microMIPS_BREAK16() {
		Environment env = new Environment(true);
		String report = env.takeInstance() + " -> ";
		new microMIPS(env).BREAK16();
		return report + env.takeInstance();
	}

	public static void main(String[] args) {
        microMIPS_BREAK16();
    }
}