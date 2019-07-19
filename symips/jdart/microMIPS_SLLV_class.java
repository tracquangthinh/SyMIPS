package symips.jdart;
import symips.emulator.base.*;
import symips.emulator.semantics.Environment;
public class microMIPS_SLLV_class {
	public microMIPS_SLLV_class() {}
	public static String microMIPS_SLLV(char rd, char rt, char rs) {
		Environment env = new Environment(true);
		String report = env.takeInstance() + " -> ";
		new microMIPS(env).SLLV( rd,  rt,  rs);
		return report + env.takeInstance();
	}

	public static void main(String[] args) {
        microMIPS_SLLV('r', '3', '5');
    }
}