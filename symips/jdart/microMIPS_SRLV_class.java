package symips.jdart;
import symips.emulator.base.*;
import symips.emulator.semantics.Environment;
public class microMIPS_SRLV_class {
	public microMIPS_SRLV_class() {}
	public static String microMIPS_SRLV(char rd, char rt, char rs) {
		Environment env = new Environment(true);
		String report = env.takeInstance() + " -> ";
		new microMIPS(env).SRLV( rd,  rt,  rs);
		return report + env.takeInstance();
	}

	public static void main(String[] args) {
        microMIPS_SRLV('8', '5', 'r');
    }
}