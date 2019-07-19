package symips.jdart;
import symips.emulator.base.*;
import symips.emulator.semantics.Environment;
public class microMIPS_SRL_class {
	public microMIPS_SRL_class() {}
	public static String microMIPS_SRL(char rt, char rs, int sa) {
		Environment env = new Environment(true);
		String report = env.takeInstance() + " -> ";
		new microMIPS(env).SRL( rt,  rs,  sa);
		return report + env.takeInstance();
	}

	public static void main(String[] args) {
        microMIPS_SRL('b', 'i', 640);
    }
}