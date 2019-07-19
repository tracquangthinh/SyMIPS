package symips.jdart;
import symips.emulator.base.*;
import symips.emulator.semantics.Environment;
public class microMIPS_SELNEZ_class {
	public microMIPS_SELNEZ_class() {}
	public static String microMIPS_SELNEZ(char rd, char rs, char rt) {
		Environment env = new Environment(true);
		String report = env.takeInstance() + " -> ";
		new microMIPS(env).SELNEZ( rd,  rs,  rt);
		return report + env.takeInstance();
	}

	public static void main(String[] args) {
        microMIPS_SELNEZ('j', 'f', '2');
    }
}