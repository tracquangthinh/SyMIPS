package symips.jdart;
import symips.emulator.base.*;
import symips.emulator.semantics.Environment;
public class microMIPS_DIVU_class {
	public microMIPS_DIVU_class() {}
	public static String microMIPS_DIVU(char rd, char rs, char rt) {
		Environment env = new Environment(true);
		String report = env.takeInstance() + " -> ";
		new microMIPS(env).DIVU( rd,  rs,  rt);
		return report + env.takeInstance();
	}

	public static void main(String[] args) {
        microMIPS_DIVU('9', 'o', 'h');
    }
}