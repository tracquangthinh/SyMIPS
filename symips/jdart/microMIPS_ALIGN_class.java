package symips.jdart;
import symips.emulator.base.*;
import symips.emulator.semantics.Environment;
public class microMIPS_ALIGN_class {
	public microMIPS_ALIGN_class() {}
	public static String microMIPS_ALIGN(char rd, char rs, char rt, int bp) {
		Environment env = new Environment(true);
		String report = env.takeInstance() + " -> ";
		new microMIPS(env).ALIGN( rd,  rs,  rt,  bp);
		return report + env.takeInstance();
	}

	public static void main(String[] args) {
        microMIPS_ALIGN('d', 'h', '8', 597);
    }
}