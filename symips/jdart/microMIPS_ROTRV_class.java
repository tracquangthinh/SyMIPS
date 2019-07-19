package symips.jdart;
import symips.emulator.base.*;
import symips.emulator.semantics.Environment;
public class microMIPS_ROTRV_class {
	public microMIPS_ROTRV_class() {}
	public static String microMIPS_ROTRV(char rd, char rt, char rs) {
		Environment env = new Environment(true);
		String report = env.takeInstance() + " -> ";
		new microMIPS(env).ROTRV( rd,  rt,  rs);
		return report + env.takeInstance();
	}

	public static void main(String[] args) {
        microMIPS_ROTRV('3', 'j', 'l');
    }
}