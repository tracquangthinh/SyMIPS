package symips.jdart;
import symips.emulator.base.*;
import symips.emulator.semantics.Environment;
public class microMIPS_LSA_class {
	public microMIPS_LSA_class() {}
	public static String microMIPS_LSA(char rt, char rs, char rd, int sa) {
		Environment env = new Environment(true);
		String report = env.takeInstance() + " -> ";
		new microMIPS(env).LSA( rt,  rs,  rd,  sa);
		return report + env.takeInstance();
	}

	public static void main(String[] args) {
        microMIPS_LSA('4', 'r', 'n', 92);
    }
}