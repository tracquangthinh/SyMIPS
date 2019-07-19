package symips.jdart;
import symips.emulator.base.*;
import symips.emulator.semantics.Environment;
public class microMIPS_ALUIPC_class {
	public microMIPS_ALUIPC_class() {}
	public static String microMIPS_ALUIPC(char rt, int immediate) {
		Environment env = new Environment(true);
		String report = env.takeInstance() + " -> ";
		new microMIPS(env).ALUIPC( rt,  immediate);
		return report + env.takeInstance();
	}

	public static void main(String[] args) {
        microMIPS_ALUIPC('o', 348);
    }
}