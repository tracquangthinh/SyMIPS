package symips.jdart;
import symips.emulator.base.*;
import symips.emulator.semantics.Environment;
public class microMIPS_LUI_class {
	public microMIPS_LUI_class() {}
	public static String microMIPS_LUI(char rt, int immediate) {
		Environment env = new Environment(true);
		String report = env.takeInstance() + " -> ";
		new microMIPS(env).LUI( rt,  immediate);
		return report + env.takeInstance();
	}

	public static void main(String[] args) {
        microMIPS_LUI('k', 388);
    }
}