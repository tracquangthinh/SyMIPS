package symips.jdart;
import symips.emulator.base.*;
import symips.emulator.semantics.Environment;
public class microMIPS_ADDIUPC_class {
	public microMIPS_ADDIUPC_class() {}
	public static String microMIPS_ADDIUPC(char rt, int immediate) {
		Environment env = new Environment(true);
		String report = env.takeInstance() + " -> ";
		new microMIPS(env).ADDIUPC( rt,  immediate);
		return report + env.takeInstance();
	}

	public static void main(String[] args) {
        microMIPS_ADDIUPC('q', 731);
    }
}