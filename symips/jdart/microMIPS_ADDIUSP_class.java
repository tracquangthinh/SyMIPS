package symips.jdart;
import symips.emulator.base.*;
import symips.emulator.semantics.Environment;
public class microMIPS_ADDIUSP_class {
	public microMIPS_ADDIUSP_class() {}
	public static String microMIPS_ADDIUSP(int immediate) {
		Environment env = new Environment(true);
		String report = env.takeInstance() + " -> ";
		new microMIPS(env).ADDIUSP( immediate);
		return report + env.takeInstance();
	}

	public static void main(String[] args) {
        microMIPS_ADDIUSP(349);
    }
}