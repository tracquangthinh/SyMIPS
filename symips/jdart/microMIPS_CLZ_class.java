package symips.jdart;
import symips.emulator.base.*;
import symips.emulator.semantics.Environment;
public class microMIPS_CLZ_class {
	public microMIPS_CLZ_class() {}
	public static String microMIPS_CLZ(char rt, char rs) {
		Environment env = new Environment(true);
		String report = env.takeInstance() + " -> ";
		new microMIPS(env).CLZ( rt,  rs);
		return report + env.takeInstance();
	}

	public static void main(String[] args) {
        microMIPS_CLZ('j', 'e');
    }
}