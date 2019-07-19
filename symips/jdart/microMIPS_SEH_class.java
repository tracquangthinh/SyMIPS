package symips.jdart;
import symips.emulator.base.*;
import symips.emulator.semantics.Environment;
public class microMIPS_SEH_class {
	public microMIPS_SEH_class() {}
	public static String microMIPS_SEH(char rt, char rs) {
		Environment env = new Environment(true);
		String report = env.takeInstance() + " -> ";
		new microMIPS(env).SEH( rt,  rs);
		return report + env.takeInstance();
	}

	public static void main(String[] args) {
        microMIPS_SEH('f', 'c');
    }
}