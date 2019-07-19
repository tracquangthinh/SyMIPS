package symips.jdart;
import symips.emulator.base.*;
import symips.emulator.semantics.Environment;
public class microMIPS_SLL_class {
	public microMIPS_SLL_class() {}
	public static String microMIPS_SLL(char rt, char rs, int sa) {
		Environment env = new Environment(true);
		String report = env.takeInstance() + " -> ";
		new microMIPS(env).SLL( rt,  rs,  sa);
		return report + env.takeInstance();
	}

	public static void main(String[] args) {
        microMIPS_SLL('c', 'i', 678);
    }
}