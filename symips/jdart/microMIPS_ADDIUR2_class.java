package symips.jdart;
import symips.emulator.base.*;
import symips.emulator.semantics.Environment;
public class microMIPS_ADDIUR2_class {
	public microMIPS_ADDIUR2_class() {}
	public static String microMIPS_ADDIUR2(char rd, char rs, int immediate) {
		Environment env = new Environment(true);
		String report = env.takeInstance() + " -> ";
		new microMIPS(env).ADDIUR2( rd,  rs,  immediate);
		return report + env.takeInstance();
	}

	public static void main(String[] args) {
        microMIPS_ADDIUR2('6', 'a', 51);
    }
}