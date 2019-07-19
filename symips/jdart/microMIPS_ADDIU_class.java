package symips.jdart;
import symips.emulator.base.*;
import symips.emulator.semantics.Environment;
public class microMIPS_ADDIU_class {
	public microMIPS_ADDIU_class() {}
	public static String microMIPS_ADDIU(char rt, char rs, int immediate) {
		Environment env = new Environment(true);
		String report = env.takeInstance() + " -> ";
		new microMIPS(env).ADDIU( rt,  rs,  immediate);
		return report + env.takeInstance();
	}

	public static void main(String[] args) {
        microMIPS_ADDIU('v', 'l', 792);
    }
}