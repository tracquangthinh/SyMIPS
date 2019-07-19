package symips.jdart;
import symips.emulator.base.*;
import symips.emulator.semantics.Environment;
public class microMIPS_MUL_class {
	public microMIPS_MUL_class() {}
	public static String microMIPS_MUL(char rd, char rs, char rt) {
		Environment env = new Environment(true);
		String report = env.takeInstance() + " -> ";
		new microMIPS(env).MUL( rd,  rs,  rt);
		return report + env.takeInstance();
	}

	public static void main(String[] args) {
        microMIPS_MUL('i', 'g', 'r');
    }
}