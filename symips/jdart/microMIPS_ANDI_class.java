package symips.jdart;
import symips.emulator.base.*;
import symips.emulator.semantics.Environment;
public class microMIPS_ANDI_class {
	public microMIPS_ANDI_class() {}
	public static String microMIPS_ANDI(char rt, char rs, int immediate) {
		Environment env = new Environment(true);
		String report = env.takeInstance() + " -> ";
		new microMIPS(env).ANDI( rt,  rs,  immediate);
		return report + env.takeInstance();
	}

	public static void main(String[] args) {
        microMIPS_ANDI('i', 'n', 368);
    }
}