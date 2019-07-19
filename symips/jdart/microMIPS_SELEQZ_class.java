package symips.jdart;
import symips.emulator.base.*;
import symips.emulator.semantics.Environment;
public class microMIPS_SELEQZ_class {
	public microMIPS_SELEQZ_class() {}
	public static String microMIPS_SELEQZ(char rd, char rs, char rt) {
		Environment env = new Environment(true);
		String report = env.takeInstance() + " -> ";
		new microMIPS(env).SELEQZ( rd,  rs,  rt);
		return report + env.takeInstance();
	}

	public static void main(String[] args) {
        microMIPS_SELEQZ('5', '2', '5');
    }
}