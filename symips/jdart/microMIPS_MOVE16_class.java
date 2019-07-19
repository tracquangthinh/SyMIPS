package symips.jdart;
import symips.emulator.base.*;
import symips.emulator.semantics.Environment;
public class microMIPS_MOVE16_class {
	public microMIPS_MOVE16_class() {}
	public static String microMIPS_MOVE16(char rd, char rs) {
		Environment env = new Environment(true);
		String report = env.takeInstance() + " -> ";
		new microMIPS(env).MOVE16( rd,  rs);
		return report + env.takeInstance();
	}

	public static void main(String[] args) {
        microMIPS_MOVE16('q', '4');
    }
}