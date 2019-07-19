package symips.jdart;
import symips.emulator.base.*;
import symips.emulator.semantics.Environment;
public class microMIPS_SRAV_class {
	public microMIPS_SRAV_class() {}
	public static String microMIPS_SRAV(char rd, char rt, char rs) {
		Environment env = new Environment(true);
		String report = env.takeInstance() + " -> ";
		new microMIPS(env).SRAV( rd,  rt,  rs);
		return report + env.takeInstance();
	}

	public static void main(String[] args) {
        microMIPS_SRAV('3', '9', 'k');
    }
}