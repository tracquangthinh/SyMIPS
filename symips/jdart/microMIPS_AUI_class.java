package symips.jdart;
import symips.emulator.base.*;
import symips.emulator.semantics.Environment;
public class microMIPS_AUI_class {
	public microMIPS_AUI_class() {}
	public static String microMIPS_AUI(char rt, char rs, int immediate) {
		Environment env = new Environment(true);
		String report = env.takeInstance() + " -> ";
		new microMIPS(env).AUI( rt,  rs,  immediate);
		return report + env.takeInstance();
	}

	public static void main(String[] args) {
        microMIPS_AUI('q', '1', 643);
    }
}