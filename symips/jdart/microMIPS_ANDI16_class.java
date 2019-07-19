package symips.jdart;
import symips.emulator.base.*;
import symips.emulator.semantics.Environment;
public class microMIPS_ANDI16_class {
	public microMIPS_ANDI16_class() {}
	public static String microMIPS_ANDI16(char rd, char rs, int immediate) {
		Environment env = new Environment(true);
		String report = env.takeInstance() + " -> ";
		new microMIPS(env).ANDI16( rd,  rs,  immediate);
		return report + env.takeInstance();
	}

	public static void main(String[] args) {
        microMIPS_ANDI16('7', '1', 866);
    }
}