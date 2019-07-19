package symips.jdart;
import symips.emulator.base.*;
import symips.emulator.semantics.Environment;
public class microMIPS_ORI_class {
	public microMIPS_ORI_class() {}
	public static String microMIPS_ORI(char rt, char rs, int immediate) {
		Environment env = new Environment(true);
		String report = env.takeInstance() + " -> ";
		new microMIPS(env).ORI( rt,  rs,  immediate);
		return report + env.takeInstance();
	}

	public static void main(String[] args) {
        microMIPS_ORI('p', 'd', 675);
    }
}