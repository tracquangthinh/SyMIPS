package symips.jdart;
import symips.emulator.base.*;
import symips.emulator.semantics.Environment;
public class microMIPS_AUIPC_class {
	public microMIPS_AUIPC_class() {}
	public static String microMIPS_AUIPC(char rt, int immediate) {
		Environment env = new Environment(true);
		String report = env.takeInstance() + " -> ";
		new microMIPS(env).AUIPC( rt,  immediate);
		return report + env.takeInstance();
	}

	public static void main(String[] args) {
        microMIPS_AUIPC('4', 275);
    }
}