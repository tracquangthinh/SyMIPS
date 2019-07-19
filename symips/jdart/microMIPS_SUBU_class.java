package symips.jdart;
import symips.emulator.base.*;
import symips.emulator.semantics.Environment;
public class microMIPS_SUBU_class {
	public microMIPS_SUBU_class() {}
	public static String microMIPS_SUBU(char rd, char rs, char rt) {
		Environment env = new Environment(true);
		String report = env.takeInstance() + " -> ";
		new microMIPS(env).SUBU( rd,  rs,  rt);
		return report + env.takeInstance();
	}

	public static void main(String[] args) {
        microMIPS_SUBU('8', '3', 'l');
    }
}