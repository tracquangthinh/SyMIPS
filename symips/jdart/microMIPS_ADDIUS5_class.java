package symips.jdart;
import symips.emulator.base.*;
import symips.emulator.semantics.Environment;
public class microMIPS_ADDIUS5_class {
	public microMIPS_ADDIUS5_class() {}
	public static String microMIPS_ADDIUS5(char rd, int immediate) {
		Environment env = new Environment(true);
		String report = env.takeInstance() + " -> ";
		new microMIPS(env).ADDIUS5( rd,  immediate);
		return report + env.takeInstance();
	}

	public static void main(String[] args) {
        microMIPS_ADDIUS5('h', 964);
    }
}