package symips.jdart;
import symips.emulator.base.*;
import symips.emulator.semantics.Environment;
public class microMIPS_ROTR_class {
	public microMIPS_ROTR_class() {}
	public static String microMIPS_ROTR(char rt, char rs, int sa) {
		Environment env = new Environment(true);
		String report = env.takeInstance() + " -> ";
		new microMIPS(env).ROTR( rt,  rs,  sa);
		return report + env.takeInstance();
	}

	public static void main(String[] args) {
        microMIPS_ROTR('g', 'j', 583);
    }
}