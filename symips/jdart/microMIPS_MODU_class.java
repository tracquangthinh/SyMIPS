package symips.jdart;
import symips.emulator.base.*;
import symips.emulator.semantics.Environment;
public class microMIPS_MODU_class {
	public microMIPS_MODU_class() {}
	public static String microMIPS_MODU(char rd, char rs, char rt) {
		Environment env = new Environment(true);
		String report = env.takeInstance() + " -> ";
		new microMIPS(env).MODU( rd,  rs,  rt);
		return report + env.takeInstance();
	}

	public static void main(String[] args) {
        microMIPS_MODU('g', 'f', '8');
    }
}