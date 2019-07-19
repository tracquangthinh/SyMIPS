package symips.jdart;
import symips.emulator.base.*;
import symips.emulator.semantics.Environment;
public class microMIPS_MOVEP_class {
	public microMIPS_MOVEP_class() {}
	public static String microMIPS_MOVEP(char rd, char re, char rs, char rt) {
		Environment env = new Environment(true);
		String report = env.takeInstance() + " -> ";
		new microMIPS(env).MOVEP( rd,  re,  rs,  rt);
		return report + env.takeInstance();
	}

	public static void main(String[] args) {
        microMIPS_MOVEP('p', '9', '3', 'c');
    }
}