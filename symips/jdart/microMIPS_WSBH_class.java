package symips.jdart;
import symips.emulator.base.*;
import symips.emulator.semantics.Environment;
public class microMIPS_WSBH_class {
	public microMIPS_WSBH_class() {}
	public static String microMIPS_WSBH(char rt, char rs) {
		Environment env = new Environment(true);
		String report = env.takeInstance() + " -> ";
		new microMIPS(env).WSBH( rt,  rs);
		return report + env.takeInstance();
	}

	public static void main(String[] args) {
        microMIPS_WSBH('8', 'l');
    }
}