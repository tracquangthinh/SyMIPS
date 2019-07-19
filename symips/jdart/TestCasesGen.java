package symips.jdart;
import symips.jdart.*;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class TestCasesGen {

	public TestCasesGen() {}

	public static void write(String path, String message) {
		try (BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(path), StandardCharsets.UTF_8))) {
			bw.write(message);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void MIPS32_MTLO_class_0() {
		System.out.println("   + Executing MIPS32_MTLO_class_tests_0 ...");
		String[] result = MIPS32_MTLO_class.MIPS32_MTLO('p').split("->");
		String dir = "symips/jdart/MIPS32_MTLO_class/";
		String testName = "MIPS32_MTLO_class_0";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_OR_class_0() {
		System.out.println("   + Executing MIPS32_OR_class_tests_0 ...");
		String[] result = MIPS32_OR_class.MIPS32_OR('0', '7', 'j').split("->");
		String dir = "symips/jdart/MIPS32_OR_class/";
		String testName = "MIPS32_OR_class_0";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_OR_class_1() {
		System.out.println("   + Executing MIPS32_OR_class_tests_1 ...");
		String[] result = MIPS32_OR_class.MIPS32_OR('v', '7', 'j').split("->");
		String dir = "symips/jdart/MIPS32_OR_class/";
		String testName = "MIPS32_OR_class_1";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_SRAV_class_0() {
		System.out.println("   + Executing MIPS32_SRAV_class_tests_0 ...");
		String[] result = MIPS32_SRAV_class.MIPS32_SRAV('2', '7', 'n').split("->");
		String dir = "symips/jdart/MIPS32_SRAV_class/";
		String testName = "MIPS32_SRAV_class_0";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_MFHI_class_0() {
		System.out.println("   + Executing MIPS32_MFHI_class_tests_0 ...");
		String[] result = MIPS32_MFHI_class.MIPS32_MFHI('g').split("->");
		String dir = "symips/jdart/MIPS32_MFHI_class/";
		String testName = "MIPS32_MFHI_class_0";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_MUL_class_0() {
		System.out.println("   + Executing MIPS32_MUL_class_tests_0 ...");
		String[] result = MIPS32_MUL_class.MIPS32_MUL('5', 'o', '9').split("->");
		String dir = "symips/jdart/MIPS32_MUL_class/";
		String testName = "MIPS32_MUL_class_0";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_SLT_class_0() {
		System.out.println("   + Executing MIPS32_SLT_class_tests_0 ...");
		String[] result = MIPS32_SLT_class.MIPS32_SLT('j', 'a', 'b').split("->");
		String dir = "symips/jdart/MIPS32_SLT_class/";
		String testName = "MIPS32_SLT_class_0";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_WSBH_class_0() {
		System.out.println("   + Executing microMIPS_WSBH_class_tests_0 ...");
		String[] result = microMIPS_WSBH_class.microMIPS_WSBH('l', '8').split("->");
		String dir = "symips/jdart/microMIPS_WSBH_class/";
		String testName = "microMIPS_WSBH_class_0";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_TEQ_class_0() {
		System.out.println("   + Executing microMIPS_TEQ_class_tests_0 ...");
		String[] result = microMIPS_TEQ_class.microMIPS_TEQ('d', 'c').split("->");
		String dir = "symips/jdart/microMIPS_TEQ_class/";
		String testName = "microMIPS_TEQ_class_0";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_TLTU_class_0() {
		System.out.println("   + Executing microMIPS_TLTU_class_tests_0 ...");
		String[] result = microMIPS_TLTU_class.microMIPS_TLTU('e', 'd').split("->");
		String dir = "symips/jdart/microMIPS_TLTU_class/";
		String testName = "microMIPS_TLTU_class_0";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_LSA_class_0() {
		System.out.println("   + Executing microMIPS_LSA_class_tests_0 ...");
		String[] result = microMIPS_LSA_class.microMIPS_LSA('n', 'r', '4', 92).split("->");
		String dir = "symips/jdart/microMIPS_LSA_class/";
		String testName = "microMIPS_LSA_class_0";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_WSBH_class_0() {
		System.out.println("   + Executing MIPS32_WSBH_class_tests_0 ...");
		String[] result = MIPS32_WSBH_class.MIPS32_WSBH('5', '6').split("->");
		String dir = "symips/jdart/MIPS32_WSBH_class/";
		String testName = "MIPS32_WSBH_class_0";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ORI_class_0() {
		System.out.println("   + Executing microMIPS_ORI_class_tests_0 ...");
		String[] result = microMIPS_ORI_class.microMIPS_ORI('d', '0', -16777217).split("->");
		String dir = "symips/jdart/microMIPS_ORI_class/";
		String testName = "microMIPS_ORI_class_0";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ORI_class_1() {
		System.out.println("   + Executing microMIPS_ORI_class_tests_1 ...");
		String[] result = microMIPS_ORI_class.microMIPS_ORI('d', 'p', 675).split("->");
		String dir = "symips/jdart/microMIPS_ORI_class/";
		String testName = "microMIPS_ORI_class_1";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ORI_class_2() {
		System.out.println("   + Executing microMIPS_ORI_class_tests_2 ...");
		String[] result = microMIPS_ORI_class.microMIPS_ORI('d', 'p', 268435456).split("->");
		String dir = "symips/jdart/microMIPS_ORI_class/";
		String testName = "microMIPS_ORI_class_2";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ORI_class_3() {
		System.out.println("   + Executing microMIPS_ORI_class_tests_3 ...");
		String[] result = microMIPS_ORI_class.microMIPS_ORI('d', 'p', 536870912).split("->");
		String dir = "symips/jdart/microMIPS_ORI_class/";
		String testName = "microMIPS_ORI_class_3";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ORI_class_4() {
		System.out.println("   + Executing microMIPS_ORI_class_tests_4 ...");
		String[] result = microMIPS_ORI_class.microMIPS_ORI('d', 'p', 805306368).split("->");
		String dir = "symips/jdart/microMIPS_ORI_class/";
		String testName = "microMIPS_ORI_class_4";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ORI_class_5() {
		System.out.println("   + Executing microMIPS_ORI_class_tests_5 ...");
		String[] result = microMIPS_ORI_class.microMIPS_ORI('d', 'p', 1073741824).split("->");
		String dir = "symips/jdart/microMIPS_ORI_class/";
		String testName = "microMIPS_ORI_class_5";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ORI_class_6() {
		System.out.println("   + Executing microMIPS_ORI_class_tests_6 ...");
		String[] result = microMIPS_ORI_class.microMIPS_ORI('d', 'p', 1342177280).split("->");
		String dir = "symips/jdart/microMIPS_ORI_class/";
		String testName = "microMIPS_ORI_class_6";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ORI_class_7() {
		System.out.println("   + Executing microMIPS_ORI_class_tests_7 ...");
		String[] result = microMIPS_ORI_class.microMIPS_ORI('d', 'p', 1610612736).split("->");
		String dir = "symips/jdart/microMIPS_ORI_class/";
		String testName = "microMIPS_ORI_class_7";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ORI_class_8() {
		System.out.println("   + Executing microMIPS_ORI_class_tests_8 ...");
		String[] result = microMIPS_ORI_class.microMIPS_ORI('d', 'p', 1879048192).split("->");
		String dir = "symips/jdart/microMIPS_ORI_class/";
		String testName = "microMIPS_ORI_class_8";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ORI_class_9() {
		System.out.println("   + Executing microMIPS_ORI_class_tests_9 ...");
		String[] result = microMIPS_ORI_class.microMIPS_ORI('d', 'p', -2147483648).split("->");
		String dir = "symips/jdart/microMIPS_ORI_class/";
		String testName = "microMIPS_ORI_class_9";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ORI_class_10() {
		System.out.println("   + Executing microMIPS_ORI_class_tests_10 ...");
		String[] result = microMIPS_ORI_class.microMIPS_ORI('d', 'p', -1879048192).split("->");
		String dir = "symips/jdart/microMIPS_ORI_class/";
		String testName = "microMIPS_ORI_class_10";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ORI_class_11() {
		System.out.println("   + Executing microMIPS_ORI_class_tests_11 ...");
		String[] result = microMIPS_ORI_class.microMIPS_ORI('d', 'p', -1610612736).split("->");
		String dir = "symips/jdart/microMIPS_ORI_class/";
		String testName = "microMIPS_ORI_class_11";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ORI_class_12() {
		System.out.println("   + Executing microMIPS_ORI_class_tests_12 ...");
		String[] result = microMIPS_ORI_class.microMIPS_ORI('d', 'p', -1342177280).split("->");
		String dir = "symips/jdart/microMIPS_ORI_class/";
		String testName = "microMIPS_ORI_class_12";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ORI_class_13() {
		System.out.println("   + Executing microMIPS_ORI_class_tests_13 ...");
		String[] result = microMIPS_ORI_class.microMIPS_ORI('d', 'p', -1073741824).split("->");
		String dir = "symips/jdart/microMIPS_ORI_class/";
		String testName = "microMIPS_ORI_class_13";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ORI_class_14() {
		System.out.println("   + Executing microMIPS_ORI_class_tests_14 ...");
		String[] result = microMIPS_ORI_class.microMIPS_ORI('d', 'p', -805306368).split("->");
		String dir = "symips/jdart/microMIPS_ORI_class/";
		String testName = "microMIPS_ORI_class_14";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ORI_class_15() {
		System.out.println("   + Executing microMIPS_ORI_class_tests_15 ...");
		String[] result = microMIPS_ORI_class.microMIPS_ORI('d', 'p', -536870912).split("->");
		String dir = "symips/jdart/microMIPS_ORI_class/";
		String testName = "microMIPS_ORI_class_15";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ORI_class_16() {
		System.out.println("   + Executing microMIPS_ORI_class_tests_16 ...");
		String[] result = microMIPS_ORI_class.microMIPS_ORI('d', 'p', -268435456).split("->");
		String dir = "symips/jdart/microMIPS_ORI_class/";
		String testName = "microMIPS_ORI_class_16";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ORI_class_17() {
		System.out.println("   + Executing microMIPS_ORI_class_tests_17 ...");
		String[] result = microMIPS_ORI_class.microMIPS_ORI('d', '0', 0).split("->");
		String dir = "symips/jdart/microMIPS_ORI_class/";
		String testName = "microMIPS_ORI_class_17";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUS5_class_0() {
		System.out.println("   + Executing microMIPS_ADDIUS5_class_tests_0 ...");
		String[] result = microMIPS_ADDIUS5_class.microMIPS_ADDIUS5('h', 964).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUS5_class/";
		String testName = "microMIPS_ADDIUS5_class_0";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUS5_class_1() {
		System.out.println("   + Executing microMIPS_ADDIUS5_class_tests_1 ...");
		String[] result = microMIPS_ADDIUS5_class.microMIPS_ADDIUS5('h', 33554432).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUS5_class/";
		String testName = "microMIPS_ADDIUS5_class_1";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUS5_class_2() {
		System.out.println("   + Executing microMIPS_ADDIUS5_class_tests_2 ...");
		String[] result = microMIPS_ADDIUS5_class.microMIPS_ADDIUS5('h', 67108864).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUS5_class/";
		String testName = "microMIPS_ADDIUS5_class_2";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUS5_class_3() {
		System.out.println("   + Executing microMIPS_ADDIUS5_class_tests_3 ...");
		String[] result = microMIPS_ADDIUS5_class.microMIPS_ADDIUS5('h', 100663296).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUS5_class/";
		String testName = "microMIPS_ADDIUS5_class_3";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUS5_class_4() {
		System.out.println("   + Executing microMIPS_ADDIUS5_class_tests_4 ...");
		String[] result = microMIPS_ADDIUS5_class.microMIPS_ADDIUS5('h', 134217728).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUS5_class/";
		String testName = "microMIPS_ADDIUS5_class_4";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUS5_class_5() {
		System.out.println("   + Executing microMIPS_ADDIUS5_class_tests_5 ...");
		String[] result = microMIPS_ADDIUS5_class.microMIPS_ADDIUS5('h', 167772160).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUS5_class/";
		String testName = "microMIPS_ADDIUS5_class_5";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUS5_class_6() {
		System.out.println("   + Executing microMIPS_ADDIUS5_class_tests_6 ...");
		String[] result = microMIPS_ADDIUS5_class.microMIPS_ADDIUS5('h', 201326592).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUS5_class/";
		String testName = "microMIPS_ADDIUS5_class_6";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUS5_class_7() {
		System.out.println("   + Executing microMIPS_ADDIUS5_class_tests_7 ...");
		String[] result = microMIPS_ADDIUS5_class.microMIPS_ADDIUS5('h', 234881024).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUS5_class/";
		String testName = "microMIPS_ADDIUS5_class_7";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUS5_class_8() {
		System.out.println("   + Executing microMIPS_ADDIUS5_class_tests_8 ...");
		String[] result = microMIPS_ADDIUS5_class.microMIPS_ADDIUS5('h', 301727743).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUS5_class/";
		String testName = "microMIPS_ADDIUS5_class_8";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUS5_class_9() {
		System.out.println("   + Executing microMIPS_ADDIUS5_class_tests_9 ...");
		String[] result = microMIPS_ADDIUS5_class.microMIPS_ADDIUS5('h', 301989888).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUS5_class/";
		String testName = "microMIPS_ADDIUS5_class_9";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUS5_class_10() {
		System.out.println("   + Executing microMIPS_ADDIUS5_class_tests_10 ...");
		String[] result = microMIPS_ADDIUS5_class.microMIPS_ADDIUS5('h', 335544320).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUS5_class/";
		String testName = "microMIPS_ADDIUS5_class_10";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUS5_class_11() {
		System.out.println("   + Executing microMIPS_ADDIUS5_class_tests_11 ...");
		String[] result = microMIPS_ADDIUS5_class.microMIPS_ADDIUS5('h', 369098752).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUS5_class/";
		String testName = "microMIPS_ADDIUS5_class_11";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUS5_class_12() {
		System.out.println("   + Executing microMIPS_ADDIUS5_class_tests_12 ...");
		String[] result = microMIPS_ADDIUS5_class.microMIPS_ADDIUS5('h', 402653184).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUS5_class/";
		String testName = "microMIPS_ADDIUS5_class_12";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUS5_class_13() {
		System.out.println("   + Executing microMIPS_ADDIUS5_class_tests_13 ...");
		String[] result = microMIPS_ADDIUS5_class.microMIPS_ADDIUS5('h', 436207616).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUS5_class/";
		String testName = "microMIPS_ADDIUS5_class_13";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUS5_class_14() {
		System.out.println("   + Executing microMIPS_ADDIUS5_class_tests_14 ...");
		String[] result = microMIPS_ADDIUS5_class.microMIPS_ADDIUS5('h', 469762048).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUS5_class/";
		String testName = "microMIPS_ADDIUS5_class_14";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUS5_class_15() {
		System.out.println("   + Executing microMIPS_ADDIUS5_class_tests_15 ...");
		String[] result = microMIPS_ADDIUS5_class.microMIPS_ADDIUS5('h', 503316480).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUS5_class/";
		String testName = "microMIPS_ADDIUS5_class_15";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUS5_class_16() {
		System.out.println("   + Executing microMIPS_ADDIUS5_class_tests_16 ...");
		String[] result = microMIPS_ADDIUS5_class.microMIPS_ADDIUS5('h', 570163199).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUS5_class/";
		String testName = "microMIPS_ADDIUS5_class_16";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUS5_class_17() {
		System.out.println("   + Executing microMIPS_ADDIUS5_class_tests_17 ...");
		String[] result = microMIPS_ADDIUS5_class.microMIPS_ADDIUS5('h', 603455487).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUS5_class/";
		String testName = "microMIPS_ADDIUS5_class_17";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUS5_class_18() {
		System.out.println("   + Executing microMIPS_ADDIUS5_class_tests_18 ...");
		String[] result = microMIPS_ADDIUS5_class.microMIPS_ADDIUS5('h', 637009919).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUS5_class/";
		String testName = "microMIPS_ADDIUS5_class_18";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUS5_class_19() {
		System.out.println("   + Executing microMIPS_ADDIUS5_class_tests_19 ...");
		String[] result = microMIPS_ADDIUS5_class.microMIPS_ADDIUS5('h', 670040063).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUS5_class/";
		String testName = "microMIPS_ADDIUS5_class_19";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUS5_class_20() {
		System.out.println("   + Executing microMIPS_ADDIUS5_class_tests_20 ...");
		String[] result = microMIPS_ADDIUS5_class.microMIPS_ADDIUS5('h', 704118783).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUS5_class/";
		String testName = "microMIPS_ADDIUS5_class_20";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUS5_class_21() {
		System.out.println("   + Executing microMIPS_ADDIUS5_class_tests_21 ...");
		String[] result = microMIPS_ADDIUS5_class.microMIPS_ADDIUS5('h', 737148927).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUS5_class/";
		String testName = "microMIPS_ADDIUS5_class_21";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUS5_class_22() {
		System.out.println("   + Executing microMIPS_ADDIUS5_class_tests_22 ...");
		String[] result = microMIPS_ADDIUS5_class.microMIPS_ADDIUS5('h', 770703359).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUS5_class/";
		String testName = "microMIPS_ADDIUS5_class_22";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUS5_class_23() {
		System.out.println("   + Executing microMIPS_ADDIUS5_class_tests_23 ...");
		String[] result = microMIPS_ADDIUS5_class.microMIPS_ADDIUS5('h', 803209215).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUS5_class/";
		String testName = "microMIPS_ADDIUS5_class_23";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUS5_class_24() {
		System.out.println("   + Executing microMIPS_ADDIUS5_class_tests_24 ...");
		String[] result = microMIPS_ADDIUS5_class.microMIPS_ADDIUS5('h', 838336511).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUS5_class/";
		String testName = "microMIPS_ADDIUS5_class_24";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUS5_class_25() {
		System.out.println("   + Executing microMIPS_ADDIUS5_class_tests_25 ...");
		String[] result = microMIPS_ADDIUS5_class.microMIPS_ADDIUS5('h', 871366655).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUS5_class/";
		String testName = "microMIPS_ADDIUS5_class_25";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUS5_class_26() {
		System.out.println("   + Executing microMIPS_ADDIUS5_class_tests_26 ...");
		String[] result = microMIPS_ADDIUS5_class.microMIPS_ADDIUS5('h', 904921087).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUS5_class/";
		String testName = "microMIPS_ADDIUS5_class_26";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUS5_class_27() {
		System.out.println("   + Executing microMIPS_ADDIUS5_class_tests_27 ...");
		String[] result = microMIPS_ADDIUS5_class.microMIPS_ADDIUS5('h', 937426943).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUS5_class/";
		String testName = "microMIPS_ADDIUS5_class_27";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUS5_class_28() {
		System.out.println("   + Executing microMIPS_ADDIUS5_class_tests_28 ...");
		String[] result = microMIPS_ADDIUS5_class.microMIPS_ADDIUS5('h', 972029951).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUS5_class/";
		String testName = "microMIPS_ADDIUS5_class_28";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUS5_class_29() {
		System.out.println("   + Executing microMIPS_ADDIUS5_class_tests_29 ...");
		String[] result = microMIPS_ADDIUS5_class.microMIPS_ADDIUS5('h', 1004535807).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUS5_class/";
		String testName = "microMIPS_ADDIUS5_class_29";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUS5_class_30() {
		System.out.println("   + Executing microMIPS_ADDIUS5_class_tests_30 ...");
		String[] result = microMIPS_ADDIUS5_class.microMIPS_ADDIUS5('h', 1038090239).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUS5_class/";
		String testName = "microMIPS_ADDIUS5_class_30";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUS5_class_31() {
		System.out.println("   + Executing microMIPS_ADDIUS5_class_tests_31 ...");
		String[] result = microMIPS_ADDIUS5_class.microMIPS_ADDIUS5('h', 1069547519).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUS5_class/";
		String testName = "microMIPS_ADDIUS5_class_31";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUS5_class_32() {
		System.out.println("   + Executing microMIPS_ADDIUS5_class_tests_32 ...");
		String[] result = microMIPS_ADDIUS5_class.microMIPS_ADDIUS5('h', 1107034111).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUS5_class/";
		String testName = "microMIPS_ADDIUS5_class_32";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUS5_class_33() {
		System.out.println("   + Executing microMIPS_ADDIUS5_class_tests_33 ...");
		String[] result = microMIPS_ADDIUS5_class.microMIPS_ADDIUS5('h', 1140326399).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUS5_class/";
		String testName = "microMIPS_ADDIUS5_class_33";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUS5_class_34() {
		System.out.println("   + Executing microMIPS_ADDIUS5_class_tests_34 ...");
		String[] result = microMIPS_ADDIUS5_class.microMIPS_ADDIUS5('h', 1173880831).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUS5_class/";
		String testName = "microMIPS_ADDIUS5_class_34";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUS5_class_35() {
		System.out.println("   + Executing microMIPS_ADDIUS5_class_tests_35 ...");
		String[] result = microMIPS_ADDIUS5_class.microMIPS_ADDIUS5('h', 1206910975).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUS5_class/";
		String testName = "microMIPS_ADDIUS5_class_35";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUS5_class_36() {
		System.out.println("   + Executing microMIPS_ADDIUS5_class_tests_36 ...");
		String[] result = microMIPS_ADDIUS5_class.microMIPS_ADDIUS5('h', 1240989695).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUS5_class/";
		String testName = "microMIPS_ADDIUS5_class_36";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUS5_class_37() {
		System.out.println("   + Executing microMIPS_ADDIUS5_class_tests_37 ...");
		String[] result = microMIPS_ADDIUS5_class.microMIPS_ADDIUS5('h', 1274019839).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUS5_class/";
		String testName = "microMIPS_ADDIUS5_class_37";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUS5_class_38() {
		System.out.println("   + Executing microMIPS_ADDIUS5_class_tests_38 ...");
		String[] result = microMIPS_ADDIUS5_class.microMIPS_ADDIUS5('h', 1307574271).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUS5_class/";
		String testName = "microMIPS_ADDIUS5_class_38";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUS5_class_39() {
		System.out.println("   + Executing microMIPS_ADDIUS5_class_tests_39 ...");
		String[] result = microMIPS_ADDIUS5_class.microMIPS_ADDIUS5('h', 1340080127).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUS5_class/";
		String testName = "microMIPS_ADDIUS5_class_39";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUS5_class_40() {
		System.out.println("   + Executing microMIPS_ADDIUS5_class_tests_40 ...");
		String[] result = microMIPS_ADDIUS5_class.microMIPS_ADDIUS5('h', 1375207423).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUS5_class/";
		String testName = "microMIPS_ADDIUS5_class_40";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUS5_class_41() {
		System.out.println("   + Executing microMIPS_ADDIUS5_class_tests_41 ...");
		String[] result = microMIPS_ADDIUS5_class.microMIPS_ADDIUS5('h', 1408237567).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUS5_class/";
		String testName = "microMIPS_ADDIUS5_class_41";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUS5_class_42() {
		System.out.println("   + Executing microMIPS_ADDIUS5_class_tests_42 ...");
		String[] result = microMIPS_ADDIUS5_class.microMIPS_ADDIUS5('h', 1441791999).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUS5_class/";
		String testName = "microMIPS_ADDIUS5_class_42";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUS5_class_43() {
		System.out.println("   + Executing microMIPS_ADDIUS5_class_tests_43 ...");
		String[] result = microMIPS_ADDIUS5_class.microMIPS_ADDIUS5('h', 1474297855).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUS5_class/";
		String testName = "microMIPS_ADDIUS5_class_43";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUS5_class_44() {
		System.out.println("   + Executing microMIPS_ADDIUS5_class_tests_44 ...");
		String[] result = microMIPS_ADDIUS5_class.microMIPS_ADDIUS5('h', 1508900863).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUS5_class/";
		String testName = "microMIPS_ADDIUS5_class_44";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUS5_class_45() {
		System.out.println("   + Executing microMIPS_ADDIUS5_class_tests_45 ...");
		String[] result = microMIPS_ADDIUS5_class.microMIPS_ADDIUS5('h', 1541406719).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUS5_class/";
		String testName = "microMIPS_ADDIUS5_class_45";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUS5_class_46() {
		System.out.println("   + Executing microMIPS_ADDIUS5_class_tests_46 ...");
		String[] result = microMIPS_ADDIUS5_class.microMIPS_ADDIUS5('h', 1574961151).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUS5_class/";
		String testName = "microMIPS_ADDIUS5_class_46";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUS5_class_47() {
		System.out.println("   + Executing microMIPS_ADDIUS5_class_tests_47 ...");
		String[] result = microMIPS_ADDIUS5_class.microMIPS_ADDIUS5('h', 1606418431).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUS5_class/";
		String testName = "microMIPS_ADDIUS5_class_47";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUS5_class_48() {
		System.out.println("   + Executing microMIPS_ADDIUS5_class_tests_48 ...");
		String[] result = microMIPS_ADDIUS5_class.microMIPS_ADDIUS5('h', 1643642879).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUS5_class/";
		String testName = "microMIPS_ADDIUS5_class_48";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUS5_class_49() {
		System.out.println("   + Executing microMIPS_ADDIUS5_class_tests_49 ...");
		String[] result = microMIPS_ADDIUS5_class.microMIPS_ADDIUS5('h', 1676673023).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUS5_class/";
		String testName = "microMIPS_ADDIUS5_class_49";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUS5_class_50() {
		System.out.println("   + Executing microMIPS_ADDIUS5_class_tests_50 ...");
		String[] result = microMIPS_ADDIUS5_class.microMIPS_ADDIUS5('h', 1710227455).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUS5_class/";
		String testName = "microMIPS_ADDIUS5_class_50";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUS5_class_51() {
		System.out.println("   + Executing microMIPS_ADDIUS5_class_tests_51 ...");
		String[] result = microMIPS_ADDIUS5_class.microMIPS_ADDIUS5('h', 1742733311).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUS5_class/";
		String testName = "microMIPS_ADDIUS5_class_51";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUS5_class_52() {
		System.out.println("   + Executing microMIPS_ADDIUS5_class_tests_52 ...");
		String[] result = microMIPS_ADDIUS5_class.microMIPS_ADDIUS5('h', 1777336319).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUS5_class/";
		String testName = "microMIPS_ADDIUS5_class_52";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUS5_class_53() {
		System.out.println("   + Executing microMIPS_ADDIUS5_class_tests_53 ...");
		String[] result = microMIPS_ADDIUS5_class.microMIPS_ADDIUS5('h', 1809842175).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUS5_class/";
		String testName = "microMIPS_ADDIUS5_class_53";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUS5_class_54() {
		System.out.println("   + Executing microMIPS_ADDIUS5_class_tests_54 ...");
		String[] result = microMIPS_ADDIUS5_class.microMIPS_ADDIUS5('h', 1843396607).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUS5_class/";
		String testName = "microMIPS_ADDIUS5_class_54";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUS5_class_55() {
		System.out.println("   + Executing microMIPS_ADDIUS5_class_tests_55 ...");
		String[] result = microMIPS_ADDIUS5_class.microMIPS_ADDIUS5('h', 1874853887).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUS5_class/";
		String testName = "microMIPS_ADDIUS5_class_55";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUS5_class_56() {
		System.out.println("   + Executing microMIPS_ADDIUS5_class_tests_56 ...");
		String[] result = microMIPS_ADDIUS5_class.microMIPS_ADDIUS5('h', 1911554047).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUS5_class/";
		String testName = "microMIPS_ADDIUS5_class_56";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUS5_class_57() {
		System.out.println("   + Executing microMIPS_ADDIUS5_class_tests_57 ...");
		String[] result = microMIPS_ADDIUS5_class.microMIPS_ADDIUS5('h', 1944059903).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUS5_class/";
		String testName = "microMIPS_ADDIUS5_class_57";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUS5_class_58() {
		System.out.println("   + Executing microMIPS_ADDIUS5_class_tests_58 ...");
		String[] result = microMIPS_ADDIUS5_class.microMIPS_ADDIUS5('h', 1977614335).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUS5_class/";
		String testName = "microMIPS_ADDIUS5_class_58";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUS5_class_59() {
		System.out.println("   + Executing microMIPS_ADDIUS5_class_tests_59 ...");
		String[] result = microMIPS_ADDIUS5_class.microMIPS_ADDIUS5('h', 2009071615).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUS5_class/";
		String testName = "microMIPS_ADDIUS5_class_59";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUS5_class_60() {
		System.out.println("   + Executing microMIPS_ADDIUS5_class_tests_60 ...");
		String[] result = microMIPS_ADDIUS5_class.microMIPS_ADDIUS5('h', 2044723199).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUS5_class/";
		String testName = "microMIPS_ADDIUS5_class_60";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUS5_class_61() {
		System.out.println("   + Executing microMIPS_ADDIUS5_class_tests_61 ...");
		String[] result = microMIPS_ADDIUS5_class.microMIPS_ADDIUS5('h', 2076180479).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUS5_class/";
		String testName = "microMIPS_ADDIUS5_class_61";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUS5_class_62() {
		System.out.println("   + Executing microMIPS_ADDIUS5_class_tests_62 ...");
		String[] result = microMIPS_ADDIUS5_class.microMIPS_ADDIUS5('h', 2109734911).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUS5_class/";
		String testName = "microMIPS_ADDIUS5_class_62";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUS5_class_63() {
		System.out.println("   + Executing microMIPS_ADDIUS5_class_tests_63 ...");
		String[] result = microMIPS_ADDIUS5_class.microMIPS_ADDIUS5('h', 2139095039).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUS5_class/";
		String testName = "microMIPS_ADDIUS5_class_63";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUS5_class_64() {
		System.out.println("   + Executing microMIPS_ADDIUS5_class_tests_64 ...");
		String[] result = microMIPS_ADDIUS5_class.microMIPS_ADDIUS5('h', -2147483648).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUS5_class/";
		String testName = "microMIPS_ADDIUS5_class_64";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUS5_class_65() {
		System.out.println("   + Executing microMIPS_ADDIUS5_class_tests_65 ...");
		String[] result = microMIPS_ADDIUS5_class.microMIPS_ADDIUS5('h', -2113929216).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUS5_class/";
		String testName = "microMIPS_ADDIUS5_class_65";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUS5_class_66() {
		System.out.println("   + Executing microMIPS_ADDIUS5_class_tests_66 ...");
		String[] result = microMIPS_ADDIUS5_class.microMIPS_ADDIUS5('h', -2080374784).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUS5_class/";
		String testName = "microMIPS_ADDIUS5_class_66";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUS5_class_67() {
		System.out.println("   + Executing microMIPS_ADDIUS5_class_tests_67 ...");
		String[] result = microMIPS_ADDIUS5_class.microMIPS_ADDIUS5('h', -2046820352).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUS5_class/";
		String testName = "microMIPS_ADDIUS5_class_67";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUS5_class_68() {
		System.out.println("   + Executing microMIPS_ADDIUS5_class_tests_68 ...");
		String[] result = microMIPS_ADDIUS5_class.microMIPS_ADDIUS5('h', -2013265920).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUS5_class/";
		String testName = "microMIPS_ADDIUS5_class_68";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUS5_class_69() {
		System.out.println("   + Executing microMIPS_ADDIUS5_class_tests_69 ...");
		String[] result = microMIPS_ADDIUS5_class.microMIPS_ADDIUS5('h', -1979711488).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUS5_class/";
		String testName = "microMIPS_ADDIUS5_class_69";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUS5_class_70() {
		System.out.println("   + Executing microMIPS_ADDIUS5_class_tests_70 ...");
		String[] result = microMIPS_ADDIUS5_class.microMIPS_ADDIUS5('h', -1946157056).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUS5_class/";
		String testName = "microMIPS_ADDIUS5_class_70";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUS5_class_71() {
		System.out.println("   + Executing microMIPS_ADDIUS5_class_tests_71 ...");
		String[] result = microMIPS_ADDIUS5_class.microMIPS_ADDIUS5('h', -1912602624).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUS5_class/";
		String testName = "microMIPS_ADDIUS5_class_71";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUS5_class_72() {
		System.out.println("   + Executing microMIPS_ADDIUS5_class_tests_72 ...");
		String[] result = microMIPS_ADDIUS5_class.microMIPS_ADDIUS5('h', -1879048192).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUS5_class/";
		String testName = "microMIPS_ADDIUS5_class_72";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUS5_class_73() {
		System.out.println("   + Executing microMIPS_ADDIUS5_class_tests_73 ...");
		String[] result = microMIPS_ADDIUS5_class.microMIPS_ADDIUS5('h', -1845493760).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUS5_class/";
		String testName = "microMIPS_ADDIUS5_class_73";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUS5_class_74() {
		System.out.println("   + Executing microMIPS_ADDIUS5_class_tests_74 ...");
		String[] result = microMIPS_ADDIUS5_class.microMIPS_ADDIUS5('h', -1811939328).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUS5_class/";
		String testName = "microMIPS_ADDIUS5_class_74";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUS5_class_75() {
		System.out.println("   + Executing microMIPS_ADDIUS5_class_tests_75 ...");
		String[] result = microMIPS_ADDIUS5_class.microMIPS_ADDIUS5('h', -1778384896).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUS5_class/";
		String testName = "microMIPS_ADDIUS5_class_75";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUS5_class_76() {
		System.out.println("   + Executing microMIPS_ADDIUS5_class_tests_76 ...");
		String[] result = microMIPS_ADDIUS5_class.microMIPS_ADDIUS5('h', -1744830464).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUS5_class/";
		String testName = "microMIPS_ADDIUS5_class_76";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUS5_class_77() {
		System.out.println("   + Executing microMIPS_ADDIUS5_class_tests_77 ...");
		String[] result = microMIPS_ADDIUS5_class.microMIPS_ADDIUS5('h', -1711276032).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUS5_class/";
		String testName = "microMIPS_ADDIUS5_class_77";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUS5_class_78() {
		System.out.println("   + Executing microMIPS_ADDIUS5_class_tests_78 ...");
		String[] result = microMIPS_ADDIUS5_class.microMIPS_ADDIUS5('h', -1677721600).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUS5_class/";
		String testName = "microMIPS_ADDIUS5_class_78";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUS5_class_79() {
		System.out.println("   + Executing microMIPS_ADDIUS5_class_tests_79 ...");
		String[] result = microMIPS_ADDIUS5_class.microMIPS_ADDIUS5('h', -1644167168).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUS5_class/";
		String testName = "microMIPS_ADDIUS5_class_79";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUS5_class_80() {
		System.out.println("   + Executing microMIPS_ADDIUS5_class_tests_80 ...");
		String[] result = microMIPS_ADDIUS5_class.microMIPS_ADDIUS5('h', -1610612736).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUS5_class/";
		String testName = "microMIPS_ADDIUS5_class_80";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUS5_class_81() {
		System.out.println("   + Executing microMIPS_ADDIUS5_class_tests_81 ...");
		String[] result = microMIPS_ADDIUS5_class.microMIPS_ADDIUS5('h', -1577058304).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUS5_class/";
		String testName = "microMIPS_ADDIUS5_class_81";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUS5_class_82() {
		System.out.println("   + Executing microMIPS_ADDIUS5_class_tests_82 ...");
		String[] result = microMIPS_ADDIUS5_class.microMIPS_ADDIUS5('h', -1543503872).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUS5_class/";
		String testName = "microMIPS_ADDIUS5_class_82";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUS5_class_83() {
		System.out.println("   + Executing microMIPS_ADDIUS5_class_tests_83 ...");
		String[] result = microMIPS_ADDIUS5_class.microMIPS_ADDIUS5('h', -1509949440).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUS5_class/";
		String testName = "microMIPS_ADDIUS5_class_83";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUS5_class_84() {
		System.out.println("   + Executing microMIPS_ADDIUS5_class_tests_84 ...");
		String[] result = microMIPS_ADDIUS5_class.microMIPS_ADDIUS5('h', -1476395008).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUS5_class/";
		String testName = "microMIPS_ADDIUS5_class_84";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUS5_class_85() {
		System.out.println("   + Executing microMIPS_ADDIUS5_class_tests_85 ...");
		String[] result = microMIPS_ADDIUS5_class.microMIPS_ADDIUS5('h', -1442840576).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUS5_class/";
		String testName = "microMIPS_ADDIUS5_class_85";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUS5_class_86() {
		System.out.println("   + Executing microMIPS_ADDIUS5_class_tests_86 ...");
		String[] result = microMIPS_ADDIUS5_class.microMIPS_ADDIUS5('h', -1409286144).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUS5_class/";
		String testName = "microMIPS_ADDIUS5_class_86";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUS5_class_87() {
		System.out.println("   + Executing microMIPS_ADDIUS5_class_tests_87 ...");
		String[] result = microMIPS_ADDIUS5_class.microMIPS_ADDIUS5('h', -1375731712).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUS5_class/";
		String testName = "microMIPS_ADDIUS5_class_87";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUS5_class_88() {
		System.out.println("   + Executing microMIPS_ADDIUS5_class_tests_88 ...");
		String[] result = microMIPS_ADDIUS5_class.microMIPS_ADDIUS5('h', -1342177280).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUS5_class/";
		String testName = "microMIPS_ADDIUS5_class_88";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUS5_class_89() {
		System.out.println("   + Executing microMIPS_ADDIUS5_class_tests_89 ...");
		String[] result = microMIPS_ADDIUS5_class.microMIPS_ADDIUS5('h', -1308622848).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUS5_class/";
		String testName = "microMIPS_ADDIUS5_class_89";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUS5_class_90() {
		System.out.println("   + Executing microMIPS_ADDIUS5_class_tests_90 ...");
		String[] result = microMIPS_ADDIUS5_class.microMIPS_ADDIUS5('h', -1275068416).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUS5_class/";
		String testName = "microMIPS_ADDIUS5_class_90";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUS5_class_91() {
		System.out.println("   + Executing microMIPS_ADDIUS5_class_tests_91 ...");
		String[] result = microMIPS_ADDIUS5_class.microMIPS_ADDIUS5('h', -1241513984).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUS5_class/";
		String testName = "microMIPS_ADDIUS5_class_91";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUS5_class_92() {
		System.out.println("   + Executing microMIPS_ADDIUS5_class_tests_92 ...");
		String[] result = microMIPS_ADDIUS5_class.microMIPS_ADDIUS5('h', -1207959552).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUS5_class/";
		String testName = "microMIPS_ADDIUS5_class_92";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUS5_class_93() {
		System.out.println("   + Executing microMIPS_ADDIUS5_class_tests_93 ...");
		String[] result = microMIPS_ADDIUS5_class.microMIPS_ADDIUS5('h', -1174405120).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUS5_class/";
		String testName = "microMIPS_ADDIUS5_class_93";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUS5_class_94() {
		System.out.println("   + Executing microMIPS_ADDIUS5_class_tests_94 ...");
		String[] result = microMIPS_ADDIUS5_class.microMIPS_ADDIUS5('h', -1140850688).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUS5_class/";
		String testName = "microMIPS_ADDIUS5_class_94";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUS5_class_95() {
		System.out.println("   + Executing microMIPS_ADDIUS5_class_tests_95 ...");
		String[] result = microMIPS_ADDIUS5_class.microMIPS_ADDIUS5('h', -1107296256).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUS5_class/";
		String testName = "microMIPS_ADDIUS5_class_95";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUS5_class_96() {
		System.out.println("   + Executing microMIPS_ADDIUS5_class_tests_96 ...");
		String[] result = microMIPS_ADDIUS5_class.microMIPS_ADDIUS5('h', -1073741824).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUS5_class/";
		String testName = "microMIPS_ADDIUS5_class_96";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUS5_class_97() {
		System.out.println("   + Executing microMIPS_ADDIUS5_class_tests_97 ...");
		String[] result = microMIPS_ADDIUS5_class.microMIPS_ADDIUS5('h', -1040187392).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUS5_class/";
		String testName = "microMIPS_ADDIUS5_class_97";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUS5_class_98() {
		System.out.println("   + Executing microMIPS_ADDIUS5_class_tests_98 ...");
		String[] result = microMIPS_ADDIUS5_class.microMIPS_ADDIUS5('h', -1006632960).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUS5_class/";
		String testName = "microMIPS_ADDIUS5_class_98";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUS5_class_99() {
		System.out.println("   + Executing microMIPS_ADDIUS5_class_tests_99 ...");
		String[] result = microMIPS_ADDIUS5_class.microMIPS_ADDIUS5('h', -973078528).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUS5_class/";
		String testName = "microMIPS_ADDIUS5_class_99";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUS5_class_100() {
		System.out.println("   + Executing microMIPS_ADDIUS5_class_tests_100 ...");
		String[] result = microMIPS_ADDIUS5_class.microMIPS_ADDIUS5('h', -939524096).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUS5_class/";
		String testName = "microMIPS_ADDIUS5_class_100";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUS5_class_101() {
		System.out.println("   + Executing microMIPS_ADDIUS5_class_tests_101 ...");
		String[] result = microMIPS_ADDIUS5_class.microMIPS_ADDIUS5('h', -905969664).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUS5_class/";
		String testName = "microMIPS_ADDIUS5_class_101";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUS5_class_102() {
		System.out.println("   + Executing microMIPS_ADDIUS5_class_tests_102 ...");
		String[] result = microMIPS_ADDIUS5_class.microMIPS_ADDIUS5('h', -872415232).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUS5_class/";
		String testName = "microMIPS_ADDIUS5_class_102";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUS5_class_103() {
		System.out.println("   + Executing microMIPS_ADDIUS5_class_tests_103 ...");
		String[] result = microMIPS_ADDIUS5_class.microMIPS_ADDIUS5('h', -838860800).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUS5_class/";
		String testName = "microMIPS_ADDIUS5_class_103";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUS5_class_104() {
		System.out.println("   + Executing microMIPS_ADDIUS5_class_tests_104 ...");
		String[] result = microMIPS_ADDIUS5_class.microMIPS_ADDIUS5('h', -805306368).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUS5_class/";
		String testName = "microMIPS_ADDIUS5_class_104";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUS5_class_105() {
		System.out.println("   + Executing microMIPS_ADDIUS5_class_tests_105 ...");
		String[] result = microMIPS_ADDIUS5_class.microMIPS_ADDIUS5('h', -771751936).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUS5_class/";
		String testName = "microMIPS_ADDIUS5_class_105";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUS5_class_106() {
		System.out.println("   + Executing microMIPS_ADDIUS5_class_tests_106 ...");
		String[] result = microMIPS_ADDIUS5_class.microMIPS_ADDIUS5('h', -738197504).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUS5_class/";
		String testName = "microMIPS_ADDIUS5_class_106";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUS5_class_107() {
		System.out.println("   + Executing microMIPS_ADDIUS5_class_tests_107 ...");
		String[] result = microMIPS_ADDIUS5_class.microMIPS_ADDIUS5('h', -704643072).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUS5_class/";
		String testName = "microMIPS_ADDIUS5_class_107";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUS5_class_108() {
		System.out.println("   + Executing microMIPS_ADDIUS5_class_tests_108 ...");
		String[] result = microMIPS_ADDIUS5_class.microMIPS_ADDIUS5('h', -671088640).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUS5_class/";
		String testName = "microMIPS_ADDIUS5_class_108";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUS5_class_109() {
		System.out.println("   + Executing microMIPS_ADDIUS5_class_tests_109 ...");
		String[] result = microMIPS_ADDIUS5_class.microMIPS_ADDIUS5('h', -637534208).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUS5_class/";
		String testName = "microMIPS_ADDIUS5_class_109";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUS5_class_110() {
		System.out.println("   + Executing microMIPS_ADDIUS5_class_tests_110 ...");
		String[] result = microMIPS_ADDIUS5_class.microMIPS_ADDIUS5('h', -603979776).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUS5_class/";
		String testName = "microMIPS_ADDIUS5_class_110";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUS5_class_111() {
		System.out.println("   + Executing microMIPS_ADDIUS5_class_tests_111 ...");
		String[] result = microMIPS_ADDIUS5_class.microMIPS_ADDIUS5('h', -570425344).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUS5_class/";
		String testName = "microMIPS_ADDIUS5_class_111";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUS5_class_112() {
		System.out.println("   + Executing microMIPS_ADDIUS5_class_tests_112 ...");
		String[] result = microMIPS_ADDIUS5_class.microMIPS_ADDIUS5('h', -536870912).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUS5_class/";
		String testName = "microMIPS_ADDIUS5_class_112";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUS5_class_113() {
		System.out.println("   + Executing microMIPS_ADDIUS5_class_tests_113 ...");
		String[] result = microMIPS_ADDIUS5_class.microMIPS_ADDIUS5('h', -503316480).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUS5_class/";
		String testName = "microMIPS_ADDIUS5_class_113";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUS5_class_114() {
		System.out.println("   + Executing microMIPS_ADDIUS5_class_tests_114 ...");
		String[] result = microMIPS_ADDIUS5_class.microMIPS_ADDIUS5('h', -469762048).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUS5_class/";
		String testName = "microMIPS_ADDIUS5_class_114";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUS5_class_115() {
		System.out.println("   + Executing microMIPS_ADDIUS5_class_tests_115 ...");
		String[] result = microMIPS_ADDIUS5_class.microMIPS_ADDIUS5('h', -436207616).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUS5_class/";
		String testName = "microMIPS_ADDIUS5_class_115";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUS5_class_116() {
		System.out.println("   + Executing microMIPS_ADDIUS5_class_tests_116 ...");
		String[] result = microMIPS_ADDIUS5_class.microMIPS_ADDIUS5('h', -402653184).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUS5_class/";
		String testName = "microMIPS_ADDIUS5_class_116";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUS5_class_117() {
		System.out.println("   + Executing microMIPS_ADDIUS5_class_tests_117 ...");
		String[] result = microMIPS_ADDIUS5_class.microMIPS_ADDIUS5('h', -369098752).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUS5_class/";
		String testName = "microMIPS_ADDIUS5_class_117";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUS5_class_118() {
		System.out.println("   + Executing microMIPS_ADDIUS5_class_tests_118 ...");
		String[] result = microMIPS_ADDIUS5_class.microMIPS_ADDIUS5('h', -335544320).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUS5_class/";
		String testName = "microMIPS_ADDIUS5_class_118";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUS5_class_119() {
		System.out.println("   + Executing microMIPS_ADDIUS5_class_tests_119 ...");
		String[] result = microMIPS_ADDIUS5_class.microMIPS_ADDIUS5('h', -301989888).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUS5_class/";
		String testName = "microMIPS_ADDIUS5_class_119";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUS5_class_120() {
		System.out.println("   + Executing microMIPS_ADDIUS5_class_tests_120 ...");
		String[] result = microMIPS_ADDIUS5_class.microMIPS_ADDIUS5('h', -268435456).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUS5_class/";
		String testName = "microMIPS_ADDIUS5_class_120";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUS5_class_121() {
		System.out.println("   + Executing microMIPS_ADDIUS5_class_tests_121 ...");
		String[] result = microMIPS_ADDIUS5_class.microMIPS_ADDIUS5('h', -234881024).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUS5_class/";
		String testName = "microMIPS_ADDIUS5_class_121";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUS5_class_122() {
		System.out.println("   + Executing microMIPS_ADDIUS5_class_tests_122 ...");
		String[] result = microMIPS_ADDIUS5_class.microMIPS_ADDIUS5('h', -201326592).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUS5_class/";
		String testName = "microMIPS_ADDIUS5_class_122";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUS5_class_123() {
		System.out.println("   + Executing microMIPS_ADDIUS5_class_tests_123 ...");
		String[] result = microMIPS_ADDIUS5_class.microMIPS_ADDIUS5('h', -167772160).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUS5_class/";
		String testName = "microMIPS_ADDIUS5_class_123";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUS5_class_124() {
		System.out.println("   + Executing microMIPS_ADDIUS5_class_tests_124 ...");
		String[] result = microMIPS_ADDIUS5_class.microMIPS_ADDIUS5('h', -134217728).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUS5_class/";
		String testName = "microMIPS_ADDIUS5_class_124";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUS5_class_125() {
		System.out.println("   + Executing microMIPS_ADDIUS5_class_tests_125 ...");
		String[] result = microMIPS_ADDIUS5_class.microMIPS_ADDIUS5('h', -100663296).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUS5_class/";
		String testName = "microMIPS_ADDIUS5_class_125";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUS5_class_126() {
		System.out.println("   + Executing microMIPS_ADDIUS5_class_tests_126 ...");
		String[] result = microMIPS_ADDIUS5_class.microMIPS_ADDIUS5('h', -67108864).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUS5_class/";
		String testName = "microMIPS_ADDIUS5_class_126";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUS5_class_127() {
		System.out.println("   + Executing microMIPS_ADDIUS5_class_tests_127 ...");
		String[] result = microMIPS_ADDIUS5_class.microMIPS_ADDIUS5('h', -33554432).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUS5_class/";
		String testName = "microMIPS_ADDIUS5_class_127";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUS5_class_128() {
		System.out.println("   + Executing microMIPS_ADDIUS5_class_tests_128 ...");
		String[] result = microMIPS_ADDIUS5_class.microMIPS_ADDIUS5('h', 0).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUS5_class/";
		String testName = "microMIPS_ADDIUS5_class_128";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_XOR16_class_0() {
		System.out.println("   + Executing microMIPS_XOR16_class_tests_0 ...");
		String[] result = microMIPS_XOR16_class.microMIPS_XOR16('k', 'i').split("->");
		String dir = "symips/jdart/microMIPS_XOR16_class/";
		String testName = "microMIPS_XOR16_class_0";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_MULT_class_0() {
		System.out.println("   + Executing MIPS32_MULT_class_tests_0 ...");
		String[] result = MIPS32_MULT_class.MIPS32_MULT('1', 'a').split("->");
		String dir = "symips/jdart/MIPS32_MULT_class/";
		String testName = "MIPS32_MULT_class_0";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_MOVN_class_0() {
		System.out.println("   + Executing MIPS32_MOVN_class_tests_0 ...");
		String[] result = MIPS32_MOVN_class.MIPS32_MOVN('e', 'g', 'v').split("->");
		String dir = "symips/jdart/MIPS32_MOVN_class/";
		String testName = "MIPS32_MOVN_class_0";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_MUL_class_0() {
		System.out.println("   + Executing microMIPS_MUL_class_tests_0 ...");
		String[] result = microMIPS_MUL_class.microMIPS_MUL('i', 'g', 'r').split("->");
		String dir = "symips/jdart/microMIPS_MUL_class/";
		String testName = "microMIPS_MUL_class_0";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_MUL_class_1() {
		System.out.println("   + Executing microMIPS_MUL_class_tests_1 ...");
		String[] result = microMIPS_MUL_class.microMIPS_MUL('0', 'g', '2').split("->");
		String dir = "symips/jdart/microMIPS_MUL_class/";
		String testName = "microMIPS_MUL_class_1";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_NOT16_class_0() {
		System.out.println("   + Executing microMIPS_NOT16_class_tests_0 ...");
		String[] result = microMIPS_NOT16_class.microMIPS_NOT16('e', 'm').split("->");
		String dir = "symips/jdart/microMIPS_NOT16_class/";
		String testName = "microMIPS_NOT16_class_0";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_DIV_class_0() {
		System.out.println("   + Executing microMIPS_DIV_class_tests_0 ...");
		String[] result = microMIPS_DIV_class.microMIPS_DIV('i', '5', 'v').split("->");
		String dir = "symips/jdart/microMIPS_DIV_class/";
		String testName = "microMIPS_DIV_class_0";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_DIV_class_1() {
		System.out.println("   + Executing microMIPS_DIV_class_tests_1 ...");
		String[] result = microMIPS_DIV_class.microMIPS_DIV('0', '5', '6').split("->");
		String dir = "symips/jdart/microMIPS_DIV_class/";
		String testName = "microMIPS_DIV_class_1";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_SEH_class_0() {
		System.out.println("   + Executing MIPS32_SEH_class_tests_0 ...");
		String[] result = MIPS32_SEH_class.MIPS32_SEH('g', 'b').split("->");
		String dir = "symips/jdart/MIPS32_SEH_class/";
		String testName = "MIPS32_SEH_class_0";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ALIGN_class_0() {
		System.out.println("   + Executing microMIPS_ALIGN_class_tests_0 ...");
		String[] result = microMIPS_ALIGN_class.microMIPS_ALIGN('d', 'h', '8', 597).split("->");
		String dir = "symips/jdart/microMIPS_ALIGN_class/";
		String testName = "microMIPS_ALIGN_class_0";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_SLT_class_0() {
		System.out.println("   + Executing microMIPS_SLT_class_tests_0 ...");
		String[] result = microMIPS_SLT_class.microMIPS_SLT('f', 'm', 'q').split("->");
		String dir = "symips/jdart/microMIPS_SLT_class/";
		String testName = "microMIPS_SLT_class_0";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_SLT_class_1() {
		System.out.println("   + Executing microMIPS_SLT_class_tests_1 ...");
		String[] result = microMIPS_SLT_class.microMIPS_SLT('0', 'm', '1').split("->");
		String dir = "symips/jdart/microMIPS_SLT_class/";
		String testName = "microMIPS_SLT_class_1";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TGEI_class_0() {
		System.out.println("   + Executing MIPS32_TGEI_class_tests_0 ...");
		String[] result = MIPS32_TGEI_class.MIPS32_TGEI('d', 655).split("->");
		String dir = "symips/jdart/MIPS32_TGEI_class/";
		String testName = "MIPS32_TGEI_class_0";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TGEI_class_1() {
		System.out.println("   + Executing MIPS32_TGEI_class_tests_1 ...");
		String[] result = MIPS32_TGEI_class.MIPS32_TGEI('d', 33554432).split("->");
		String dir = "symips/jdart/MIPS32_TGEI_class/";
		String testName = "MIPS32_TGEI_class_1";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TGEI_class_2() {
		System.out.println("   + Executing MIPS32_TGEI_class_tests_2 ...");
		String[] result = MIPS32_TGEI_class.MIPS32_TGEI('d', 67108864).split("->");
		String dir = "symips/jdart/MIPS32_TGEI_class/";
		String testName = "MIPS32_TGEI_class_2";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TGEI_class_3() {
		System.out.println("   + Executing MIPS32_TGEI_class_tests_3 ...");
		String[] result = MIPS32_TGEI_class.MIPS32_TGEI('d', 100663296).split("->");
		String dir = "symips/jdart/MIPS32_TGEI_class/";
		String testName = "MIPS32_TGEI_class_3";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TGEI_class_4() {
		System.out.println("   + Executing MIPS32_TGEI_class_tests_4 ...");
		String[] result = MIPS32_TGEI_class.MIPS32_TGEI('d', 134217728).split("->");
		String dir = "symips/jdart/MIPS32_TGEI_class/";
		String testName = "MIPS32_TGEI_class_4";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TGEI_class_5() {
		System.out.println("   + Executing MIPS32_TGEI_class_tests_5 ...");
		String[] result = MIPS32_TGEI_class.MIPS32_TGEI('d', 167772160).split("->");
		String dir = "symips/jdart/MIPS32_TGEI_class/";
		String testName = "MIPS32_TGEI_class_5";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TGEI_class_6() {
		System.out.println("   + Executing MIPS32_TGEI_class_tests_6 ...");
		String[] result = MIPS32_TGEI_class.MIPS32_TGEI('d', 201326592).split("->");
		String dir = "symips/jdart/MIPS32_TGEI_class/";
		String testName = "MIPS32_TGEI_class_6";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TGEI_class_7() {
		System.out.println("   + Executing MIPS32_TGEI_class_tests_7 ...");
		String[] result = MIPS32_TGEI_class.MIPS32_TGEI('d', 234881024).split("->");
		String dir = "symips/jdart/MIPS32_TGEI_class/";
		String testName = "MIPS32_TGEI_class_7";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TGEI_class_8() {
		System.out.println("   + Executing MIPS32_TGEI_class_tests_8 ...");
		String[] result = MIPS32_TGEI_class.MIPS32_TGEI('d', 268435456).split("->");
		String dir = "symips/jdart/MIPS32_TGEI_class/";
		String testName = "MIPS32_TGEI_class_8";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TGEI_class_9() {
		System.out.println("   + Executing MIPS32_TGEI_class_tests_9 ...");
		String[] result = MIPS32_TGEI_class.MIPS32_TGEI('d', 301989888).split("->");
		String dir = "symips/jdart/MIPS32_TGEI_class/";
		String testName = "MIPS32_TGEI_class_9";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TGEI_class_10() {
		System.out.println("   + Executing MIPS32_TGEI_class_tests_10 ...");
		String[] result = MIPS32_TGEI_class.MIPS32_TGEI('d', 335544320).split("->");
		String dir = "symips/jdart/MIPS32_TGEI_class/";
		String testName = "MIPS32_TGEI_class_10";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TGEI_class_11() {
		System.out.println("   + Executing MIPS32_TGEI_class_tests_11 ...");
		String[] result = MIPS32_TGEI_class.MIPS32_TGEI('d', 369098752).split("->");
		String dir = "symips/jdart/MIPS32_TGEI_class/";
		String testName = "MIPS32_TGEI_class_11";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TGEI_class_12() {
		System.out.println("   + Executing MIPS32_TGEI_class_tests_12 ...");
		String[] result = MIPS32_TGEI_class.MIPS32_TGEI('d', 402653184).split("->");
		String dir = "symips/jdart/MIPS32_TGEI_class/";
		String testName = "MIPS32_TGEI_class_12";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TGEI_class_13() {
		System.out.println("   + Executing MIPS32_TGEI_class_tests_13 ...");
		String[] result = MIPS32_TGEI_class.MIPS32_TGEI('d', 436207616).split("->");
		String dir = "symips/jdart/MIPS32_TGEI_class/";
		String testName = "MIPS32_TGEI_class_13";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TGEI_class_14() {
		System.out.println("   + Executing MIPS32_TGEI_class_tests_14 ...");
		String[] result = MIPS32_TGEI_class.MIPS32_TGEI('d', 469762048).split("->");
		String dir = "symips/jdart/MIPS32_TGEI_class/";
		String testName = "MIPS32_TGEI_class_14";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TGEI_class_15() {
		System.out.println("   + Executing MIPS32_TGEI_class_tests_15 ...");
		String[] result = MIPS32_TGEI_class.MIPS32_TGEI('d', 503316480).split("->");
		String dir = "symips/jdart/MIPS32_TGEI_class/";
		String testName = "MIPS32_TGEI_class_15";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TGEI_class_16() {
		System.out.println("   + Executing MIPS32_TGEI_class_tests_16 ...");
		String[] result = MIPS32_TGEI_class.MIPS32_TGEI('d', 570163199).split("->");
		String dir = "symips/jdart/MIPS32_TGEI_class/";
		String testName = "MIPS32_TGEI_class_16";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TGEI_class_17() {
		System.out.println("   + Executing MIPS32_TGEI_class_tests_17 ...");
		String[] result = MIPS32_TGEI_class.MIPS32_TGEI('d', 603455487).split("->");
		String dir = "symips/jdart/MIPS32_TGEI_class/";
		String testName = "MIPS32_TGEI_class_17";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TGEI_class_18() {
		System.out.println("   + Executing MIPS32_TGEI_class_tests_18 ...");
		String[] result = MIPS32_TGEI_class.MIPS32_TGEI('d', 637009919).split("->");
		String dir = "symips/jdart/MIPS32_TGEI_class/";
		String testName = "MIPS32_TGEI_class_18";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TGEI_class_19() {
		System.out.println("   + Executing MIPS32_TGEI_class_tests_19 ...");
		String[] result = MIPS32_TGEI_class.MIPS32_TGEI('d', 670040063).split("->");
		String dir = "symips/jdart/MIPS32_TGEI_class/";
		String testName = "MIPS32_TGEI_class_19";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TGEI_class_20() {
		System.out.println("   + Executing MIPS32_TGEI_class_tests_20 ...");
		String[] result = MIPS32_TGEI_class.MIPS32_TGEI('d', 704118783).split("->");
		String dir = "symips/jdart/MIPS32_TGEI_class/";
		String testName = "MIPS32_TGEI_class_20";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TGEI_class_21() {
		System.out.println("   + Executing MIPS32_TGEI_class_tests_21 ...");
		String[] result = MIPS32_TGEI_class.MIPS32_TGEI('d', 737148927).split("->");
		String dir = "symips/jdart/MIPS32_TGEI_class/";
		String testName = "MIPS32_TGEI_class_21";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TGEI_class_22() {
		System.out.println("   + Executing MIPS32_TGEI_class_tests_22 ...");
		String[] result = MIPS32_TGEI_class.MIPS32_TGEI('d', 770703359).split("->");
		String dir = "symips/jdart/MIPS32_TGEI_class/";
		String testName = "MIPS32_TGEI_class_22";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TGEI_class_23() {
		System.out.println("   + Executing MIPS32_TGEI_class_tests_23 ...");
		String[] result = MIPS32_TGEI_class.MIPS32_TGEI('d', 803209215).split("->");
		String dir = "symips/jdart/MIPS32_TGEI_class/";
		String testName = "MIPS32_TGEI_class_23";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TGEI_class_24() {
		System.out.println("   + Executing MIPS32_TGEI_class_tests_24 ...");
		String[] result = MIPS32_TGEI_class.MIPS32_TGEI('d', 838336511).split("->");
		String dir = "symips/jdart/MIPS32_TGEI_class/";
		String testName = "MIPS32_TGEI_class_24";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TGEI_class_25() {
		System.out.println("   + Executing MIPS32_TGEI_class_tests_25 ...");
		String[] result = MIPS32_TGEI_class.MIPS32_TGEI('d', 871366655).split("->");
		String dir = "symips/jdart/MIPS32_TGEI_class/";
		String testName = "MIPS32_TGEI_class_25";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TGEI_class_26() {
		System.out.println("   + Executing MIPS32_TGEI_class_tests_26 ...");
		String[] result = MIPS32_TGEI_class.MIPS32_TGEI('d', 904921087).split("->");
		String dir = "symips/jdart/MIPS32_TGEI_class/";
		String testName = "MIPS32_TGEI_class_26";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TGEI_class_27() {
		System.out.println("   + Executing MIPS32_TGEI_class_tests_27 ...");
		String[] result = MIPS32_TGEI_class.MIPS32_TGEI('d', 937426943).split("->");
		String dir = "symips/jdart/MIPS32_TGEI_class/";
		String testName = "MIPS32_TGEI_class_27";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TGEI_class_28() {
		System.out.println("   + Executing MIPS32_TGEI_class_tests_28 ...");
		String[] result = MIPS32_TGEI_class.MIPS32_TGEI('d', 972029951).split("->");
		String dir = "symips/jdart/MIPS32_TGEI_class/";
		String testName = "MIPS32_TGEI_class_28";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TGEI_class_29() {
		System.out.println("   + Executing MIPS32_TGEI_class_tests_29 ...");
		String[] result = MIPS32_TGEI_class.MIPS32_TGEI('d', 1004535807).split("->");
		String dir = "symips/jdart/MIPS32_TGEI_class/";
		String testName = "MIPS32_TGEI_class_29";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TGEI_class_30() {
		System.out.println("   + Executing MIPS32_TGEI_class_tests_30 ...");
		String[] result = MIPS32_TGEI_class.MIPS32_TGEI('d', 1038090239).split("->");
		String dir = "symips/jdart/MIPS32_TGEI_class/";
		String testName = "MIPS32_TGEI_class_30";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TGEI_class_31() {
		System.out.println("   + Executing MIPS32_TGEI_class_tests_31 ...");
		String[] result = MIPS32_TGEI_class.MIPS32_TGEI('d', 1069547519).split("->");
		String dir = "symips/jdart/MIPS32_TGEI_class/";
		String testName = "MIPS32_TGEI_class_31";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TGEI_class_32() {
		System.out.println("   + Executing MIPS32_TGEI_class_tests_32 ...");
		String[] result = MIPS32_TGEI_class.MIPS32_TGEI('d', 1107034111).split("->");
		String dir = "symips/jdart/MIPS32_TGEI_class/";
		String testName = "MIPS32_TGEI_class_32";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TGEI_class_33() {
		System.out.println("   + Executing MIPS32_TGEI_class_tests_33 ...");
		String[] result = MIPS32_TGEI_class.MIPS32_TGEI('d', 1140326399).split("->");
		String dir = "symips/jdart/MIPS32_TGEI_class/";
		String testName = "MIPS32_TGEI_class_33";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TGEI_class_34() {
		System.out.println("   + Executing MIPS32_TGEI_class_tests_34 ...");
		String[] result = MIPS32_TGEI_class.MIPS32_TGEI('d', 1173880831).split("->");
		String dir = "symips/jdart/MIPS32_TGEI_class/";
		String testName = "MIPS32_TGEI_class_34";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TGEI_class_35() {
		System.out.println("   + Executing MIPS32_TGEI_class_tests_35 ...");
		String[] result = MIPS32_TGEI_class.MIPS32_TGEI('d', 1206910975).split("->");
		String dir = "symips/jdart/MIPS32_TGEI_class/";
		String testName = "MIPS32_TGEI_class_35";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TGEI_class_36() {
		System.out.println("   + Executing MIPS32_TGEI_class_tests_36 ...");
		String[] result = MIPS32_TGEI_class.MIPS32_TGEI('d', 1240989695).split("->");
		String dir = "symips/jdart/MIPS32_TGEI_class/";
		String testName = "MIPS32_TGEI_class_36";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TGEI_class_37() {
		System.out.println("   + Executing MIPS32_TGEI_class_tests_37 ...");
		String[] result = MIPS32_TGEI_class.MIPS32_TGEI('d', 1274019839).split("->");
		String dir = "symips/jdart/MIPS32_TGEI_class/";
		String testName = "MIPS32_TGEI_class_37";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TGEI_class_38() {
		System.out.println("   + Executing MIPS32_TGEI_class_tests_38 ...");
		String[] result = MIPS32_TGEI_class.MIPS32_TGEI('d', 1307574271).split("->");
		String dir = "symips/jdart/MIPS32_TGEI_class/";
		String testName = "MIPS32_TGEI_class_38";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TGEI_class_39() {
		System.out.println("   + Executing MIPS32_TGEI_class_tests_39 ...");
		String[] result = MIPS32_TGEI_class.MIPS32_TGEI('d', 1340080127).split("->");
		String dir = "symips/jdart/MIPS32_TGEI_class/";
		String testName = "MIPS32_TGEI_class_39";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TGEI_class_40() {
		System.out.println("   + Executing MIPS32_TGEI_class_tests_40 ...");
		String[] result = MIPS32_TGEI_class.MIPS32_TGEI('d', 1375207423).split("->");
		String dir = "symips/jdart/MIPS32_TGEI_class/";
		String testName = "MIPS32_TGEI_class_40";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TGEI_class_41() {
		System.out.println("   + Executing MIPS32_TGEI_class_tests_41 ...");
		String[] result = MIPS32_TGEI_class.MIPS32_TGEI('d', 1408237567).split("->");
		String dir = "symips/jdart/MIPS32_TGEI_class/";
		String testName = "MIPS32_TGEI_class_41";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TGEI_class_42() {
		System.out.println("   + Executing MIPS32_TGEI_class_tests_42 ...");
		String[] result = MIPS32_TGEI_class.MIPS32_TGEI('d', 1441791999).split("->");
		String dir = "symips/jdart/MIPS32_TGEI_class/";
		String testName = "MIPS32_TGEI_class_42";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TGEI_class_43() {
		System.out.println("   + Executing MIPS32_TGEI_class_tests_43 ...");
		String[] result = MIPS32_TGEI_class.MIPS32_TGEI('d', 1474297855).split("->");
		String dir = "symips/jdart/MIPS32_TGEI_class/";
		String testName = "MIPS32_TGEI_class_43";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TGEI_class_44() {
		System.out.println("   + Executing MIPS32_TGEI_class_tests_44 ...");
		String[] result = MIPS32_TGEI_class.MIPS32_TGEI('d', 1508900863).split("->");
		String dir = "symips/jdart/MIPS32_TGEI_class/";
		String testName = "MIPS32_TGEI_class_44";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TGEI_class_45() {
		System.out.println("   + Executing MIPS32_TGEI_class_tests_45 ...");
		String[] result = MIPS32_TGEI_class.MIPS32_TGEI('d', 1541406719).split("->");
		String dir = "symips/jdart/MIPS32_TGEI_class/";
		String testName = "MIPS32_TGEI_class_45";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TGEI_class_46() {
		System.out.println("   + Executing MIPS32_TGEI_class_tests_46 ...");
		String[] result = MIPS32_TGEI_class.MIPS32_TGEI('d', 1574961151).split("->");
		String dir = "symips/jdart/MIPS32_TGEI_class/";
		String testName = "MIPS32_TGEI_class_46";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TGEI_class_47() {
		System.out.println("   + Executing MIPS32_TGEI_class_tests_47 ...");
		String[] result = MIPS32_TGEI_class.MIPS32_TGEI('d', 1606418431).split("->");
		String dir = "symips/jdart/MIPS32_TGEI_class/";
		String testName = "MIPS32_TGEI_class_47";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TGEI_class_48() {
		System.out.println("   + Executing MIPS32_TGEI_class_tests_48 ...");
		String[] result = MIPS32_TGEI_class.MIPS32_TGEI('d', 1643642879).split("->");
		String dir = "symips/jdart/MIPS32_TGEI_class/";
		String testName = "MIPS32_TGEI_class_48";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TGEI_class_49() {
		System.out.println("   + Executing MIPS32_TGEI_class_tests_49 ...");
		String[] result = MIPS32_TGEI_class.MIPS32_TGEI('d', 1676673023).split("->");
		String dir = "symips/jdart/MIPS32_TGEI_class/";
		String testName = "MIPS32_TGEI_class_49";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TGEI_class_50() {
		System.out.println("   + Executing MIPS32_TGEI_class_tests_50 ...");
		String[] result = MIPS32_TGEI_class.MIPS32_TGEI('d', 1710227455).split("->");
		String dir = "symips/jdart/MIPS32_TGEI_class/";
		String testName = "MIPS32_TGEI_class_50";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TGEI_class_51() {
		System.out.println("   + Executing MIPS32_TGEI_class_tests_51 ...");
		String[] result = MIPS32_TGEI_class.MIPS32_TGEI('d', 1742733311).split("->");
		String dir = "symips/jdart/MIPS32_TGEI_class/";
		String testName = "MIPS32_TGEI_class_51";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TGEI_class_52() {
		System.out.println("   + Executing MIPS32_TGEI_class_tests_52 ...");
		String[] result = MIPS32_TGEI_class.MIPS32_TGEI('d', 1777336319).split("->");
		String dir = "symips/jdart/MIPS32_TGEI_class/";
		String testName = "MIPS32_TGEI_class_52";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TGEI_class_53() {
		System.out.println("   + Executing MIPS32_TGEI_class_tests_53 ...");
		String[] result = MIPS32_TGEI_class.MIPS32_TGEI('d', 1809842175).split("->");
		String dir = "symips/jdart/MIPS32_TGEI_class/";
		String testName = "MIPS32_TGEI_class_53";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TGEI_class_54() {
		System.out.println("   + Executing MIPS32_TGEI_class_tests_54 ...");
		String[] result = MIPS32_TGEI_class.MIPS32_TGEI('d', 1843396607).split("->");
		String dir = "symips/jdart/MIPS32_TGEI_class/";
		String testName = "MIPS32_TGEI_class_54";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TGEI_class_55() {
		System.out.println("   + Executing MIPS32_TGEI_class_tests_55 ...");
		String[] result = MIPS32_TGEI_class.MIPS32_TGEI('d', 1874853887).split("->");
		String dir = "symips/jdart/MIPS32_TGEI_class/";
		String testName = "MIPS32_TGEI_class_55";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TGEI_class_56() {
		System.out.println("   + Executing MIPS32_TGEI_class_tests_56 ...");
		String[] result = MIPS32_TGEI_class.MIPS32_TGEI('d', 1911554047).split("->");
		String dir = "symips/jdart/MIPS32_TGEI_class/";
		String testName = "MIPS32_TGEI_class_56";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TGEI_class_57() {
		System.out.println("   + Executing MIPS32_TGEI_class_tests_57 ...");
		String[] result = MIPS32_TGEI_class.MIPS32_TGEI('d', 1944059903).split("->");
		String dir = "symips/jdart/MIPS32_TGEI_class/";
		String testName = "MIPS32_TGEI_class_57";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TGEI_class_58() {
		System.out.println("   + Executing MIPS32_TGEI_class_tests_58 ...");
		String[] result = MIPS32_TGEI_class.MIPS32_TGEI('d', 1977614335).split("->");
		String dir = "symips/jdart/MIPS32_TGEI_class/";
		String testName = "MIPS32_TGEI_class_58";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TGEI_class_59() {
		System.out.println("   + Executing MIPS32_TGEI_class_tests_59 ...");
		String[] result = MIPS32_TGEI_class.MIPS32_TGEI('d', 2009071615).split("->");
		String dir = "symips/jdart/MIPS32_TGEI_class/";
		String testName = "MIPS32_TGEI_class_59";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TGEI_class_60() {
		System.out.println("   + Executing MIPS32_TGEI_class_tests_60 ...");
		String[] result = MIPS32_TGEI_class.MIPS32_TGEI('d', 2044723199).split("->");
		String dir = "symips/jdart/MIPS32_TGEI_class/";
		String testName = "MIPS32_TGEI_class_60";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TGEI_class_61() {
		System.out.println("   + Executing MIPS32_TGEI_class_tests_61 ...");
		String[] result = MIPS32_TGEI_class.MIPS32_TGEI('d', 2076180479).split("->");
		String dir = "symips/jdart/MIPS32_TGEI_class/";
		String testName = "MIPS32_TGEI_class_61";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TGEI_class_62() {
		System.out.println("   + Executing MIPS32_TGEI_class_tests_62 ...");
		String[] result = MIPS32_TGEI_class.MIPS32_TGEI('d', 2109734911).split("->");
		String dir = "symips/jdart/MIPS32_TGEI_class/";
		String testName = "MIPS32_TGEI_class_62";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TGEI_class_63() {
		System.out.println("   + Executing MIPS32_TGEI_class_tests_63 ...");
		String[] result = MIPS32_TGEI_class.MIPS32_TGEI('d', 2139095039).split("->");
		String dir = "symips/jdart/MIPS32_TGEI_class/";
		String testName = "MIPS32_TGEI_class_63";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TGEI_class_64() {
		System.out.println("   + Executing MIPS32_TGEI_class_tests_64 ...");
		String[] result = MIPS32_TGEI_class.MIPS32_TGEI('d', -2147483648).split("->");
		String dir = "symips/jdart/MIPS32_TGEI_class/";
		String testName = "MIPS32_TGEI_class_64";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TGEI_class_65() {
		System.out.println("   + Executing MIPS32_TGEI_class_tests_65 ...");
		String[] result = MIPS32_TGEI_class.MIPS32_TGEI('d', -2113929216).split("->");
		String dir = "symips/jdart/MIPS32_TGEI_class/";
		String testName = "MIPS32_TGEI_class_65";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TGEI_class_66() {
		System.out.println("   + Executing MIPS32_TGEI_class_tests_66 ...");
		String[] result = MIPS32_TGEI_class.MIPS32_TGEI('d', -2080374784).split("->");
		String dir = "symips/jdart/MIPS32_TGEI_class/";
		String testName = "MIPS32_TGEI_class_66";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TGEI_class_67() {
		System.out.println("   + Executing MIPS32_TGEI_class_tests_67 ...");
		String[] result = MIPS32_TGEI_class.MIPS32_TGEI('d', -2046820352).split("->");
		String dir = "symips/jdart/MIPS32_TGEI_class/";
		String testName = "MIPS32_TGEI_class_67";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TGEI_class_68() {
		System.out.println("   + Executing MIPS32_TGEI_class_tests_68 ...");
		String[] result = MIPS32_TGEI_class.MIPS32_TGEI('d', -2013265920).split("->");
		String dir = "symips/jdart/MIPS32_TGEI_class/";
		String testName = "MIPS32_TGEI_class_68";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TGEI_class_69() {
		System.out.println("   + Executing MIPS32_TGEI_class_tests_69 ...");
		String[] result = MIPS32_TGEI_class.MIPS32_TGEI('d', -1979711488).split("->");
		String dir = "symips/jdart/MIPS32_TGEI_class/";
		String testName = "MIPS32_TGEI_class_69";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TGEI_class_70() {
		System.out.println("   + Executing MIPS32_TGEI_class_tests_70 ...");
		String[] result = MIPS32_TGEI_class.MIPS32_TGEI('d', -1946157056).split("->");
		String dir = "symips/jdart/MIPS32_TGEI_class/";
		String testName = "MIPS32_TGEI_class_70";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TGEI_class_71() {
		System.out.println("   + Executing MIPS32_TGEI_class_tests_71 ...");
		String[] result = MIPS32_TGEI_class.MIPS32_TGEI('d', -1912602624).split("->");
		String dir = "symips/jdart/MIPS32_TGEI_class/";
		String testName = "MIPS32_TGEI_class_71";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TGEI_class_72() {
		System.out.println("   + Executing MIPS32_TGEI_class_tests_72 ...");
		String[] result = MIPS32_TGEI_class.MIPS32_TGEI('d', -1879048192).split("->");
		String dir = "symips/jdart/MIPS32_TGEI_class/";
		String testName = "MIPS32_TGEI_class_72";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TGEI_class_73() {
		System.out.println("   + Executing MIPS32_TGEI_class_tests_73 ...");
		String[] result = MIPS32_TGEI_class.MIPS32_TGEI('d', -1845493760).split("->");
		String dir = "symips/jdart/MIPS32_TGEI_class/";
		String testName = "MIPS32_TGEI_class_73";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TGEI_class_74() {
		System.out.println("   + Executing MIPS32_TGEI_class_tests_74 ...");
		String[] result = MIPS32_TGEI_class.MIPS32_TGEI('d', -1811939328).split("->");
		String dir = "symips/jdart/MIPS32_TGEI_class/";
		String testName = "MIPS32_TGEI_class_74";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TGEI_class_75() {
		System.out.println("   + Executing MIPS32_TGEI_class_tests_75 ...");
		String[] result = MIPS32_TGEI_class.MIPS32_TGEI('d', -1778384896).split("->");
		String dir = "symips/jdart/MIPS32_TGEI_class/";
		String testName = "MIPS32_TGEI_class_75";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TGEI_class_76() {
		System.out.println("   + Executing MIPS32_TGEI_class_tests_76 ...");
		String[] result = MIPS32_TGEI_class.MIPS32_TGEI('d', -1744830464).split("->");
		String dir = "symips/jdart/MIPS32_TGEI_class/";
		String testName = "MIPS32_TGEI_class_76";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TGEI_class_77() {
		System.out.println("   + Executing MIPS32_TGEI_class_tests_77 ...");
		String[] result = MIPS32_TGEI_class.MIPS32_TGEI('d', -1711276032).split("->");
		String dir = "symips/jdart/MIPS32_TGEI_class/";
		String testName = "MIPS32_TGEI_class_77";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TGEI_class_78() {
		System.out.println("   + Executing MIPS32_TGEI_class_tests_78 ...");
		String[] result = MIPS32_TGEI_class.MIPS32_TGEI('d', -1677721600).split("->");
		String dir = "symips/jdart/MIPS32_TGEI_class/";
		String testName = "MIPS32_TGEI_class_78";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TGEI_class_79() {
		System.out.println("   + Executing MIPS32_TGEI_class_tests_79 ...");
		String[] result = MIPS32_TGEI_class.MIPS32_TGEI('d', -1644167168).split("->");
		String dir = "symips/jdart/MIPS32_TGEI_class/";
		String testName = "MIPS32_TGEI_class_79";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TGEI_class_80() {
		System.out.println("   + Executing MIPS32_TGEI_class_tests_80 ...");
		String[] result = MIPS32_TGEI_class.MIPS32_TGEI('d', -1610612736).split("->");
		String dir = "symips/jdart/MIPS32_TGEI_class/";
		String testName = "MIPS32_TGEI_class_80";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TGEI_class_81() {
		System.out.println("   + Executing MIPS32_TGEI_class_tests_81 ...");
		String[] result = MIPS32_TGEI_class.MIPS32_TGEI('d', -1577058304).split("->");
		String dir = "symips/jdart/MIPS32_TGEI_class/";
		String testName = "MIPS32_TGEI_class_81";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TGEI_class_82() {
		System.out.println("   + Executing MIPS32_TGEI_class_tests_82 ...");
		String[] result = MIPS32_TGEI_class.MIPS32_TGEI('d', -1543503872).split("->");
		String dir = "symips/jdart/MIPS32_TGEI_class/";
		String testName = "MIPS32_TGEI_class_82";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TGEI_class_83() {
		System.out.println("   + Executing MIPS32_TGEI_class_tests_83 ...");
		String[] result = MIPS32_TGEI_class.MIPS32_TGEI('d', -1509949440).split("->");
		String dir = "symips/jdart/MIPS32_TGEI_class/";
		String testName = "MIPS32_TGEI_class_83";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TGEI_class_84() {
		System.out.println("   + Executing MIPS32_TGEI_class_tests_84 ...");
		String[] result = MIPS32_TGEI_class.MIPS32_TGEI('d', -1476395008).split("->");
		String dir = "symips/jdart/MIPS32_TGEI_class/";
		String testName = "MIPS32_TGEI_class_84";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TGEI_class_85() {
		System.out.println("   + Executing MIPS32_TGEI_class_tests_85 ...");
		String[] result = MIPS32_TGEI_class.MIPS32_TGEI('d', -1442840576).split("->");
		String dir = "symips/jdart/MIPS32_TGEI_class/";
		String testName = "MIPS32_TGEI_class_85";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TGEI_class_86() {
		System.out.println("   + Executing MIPS32_TGEI_class_tests_86 ...");
		String[] result = MIPS32_TGEI_class.MIPS32_TGEI('d', -1409286144).split("->");
		String dir = "symips/jdart/MIPS32_TGEI_class/";
		String testName = "MIPS32_TGEI_class_86";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TGEI_class_87() {
		System.out.println("   + Executing MIPS32_TGEI_class_tests_87 ...");
		String[] result = MIPS32_TGEI_class.MIPS32_TGEI('d', -1375731712).split("->");
		String dir = "symips/jdart/MIPS32_TGEI_class/";
		String testName = "MIPS32_TGEI_class_87";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TGEI_class_88() {
		System.out.println("   + Executing MIPS32_TGEI_class_tests_88 ...");
		String[] result = MIPS32_TGEI_class.MIPS32_TGEI('d', -1342177280).split("->");
		String dir = "symips/jdart/MIPS32_TGEI_class/";
		String testName = "MIPS32_TGEI_class_88";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TGEI_class_89() {
		System.out.println("   + Executing MIPS32_TGEI_class_tests_89 ...");
		String[] result = MIPS32_TGEI_class.MIPS32_TGEI('d', -1308622848).split("->");
		String dir = "symips/jdart/MIPS32_TGEI_class/";
		String testName = "MIPS32_TGEI_class_89";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TGEI_class_90() {
		System.out.println("   + Executing MIPS32_TGEI_class_tests_90 ...");
		String[] result = MIPS32_TGEI_class.MIPS32_TGEI('d', -1275068416).split("->");
		String dir = "symips/jdart/MIPS32_TGEI_class/";
		String testName = "MIPS32_TGEI_class_90";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TGEI_class_91() {
		System.out.println("   + Executing MIPS32_TGEI_class_tests_91 ...");
		String[] result = MIPS32_TGEI_class.MIPS32_TGEI('d', -1241513984).split("->");
		String dir = "symips/jdart/MIPS32_TGEI_class/";
		String testName = "MIPS32_TGEI_class_91";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TGEI_class_92() {
		System.out.println("   + Executing MIPS32_TGEI_class_tests_92 ...");
		String[] result = MIPS32_TGEI_class.MIPS32_TGEI('d', -1207959552).split("->");
		String dir = "symips/jdart/MIPS32_TGEI_class/";
		String testName = "MIPS32_TGEI_class_92";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TGEI_class_93() {
		System.out.println("   + Executing MIPS32_TGEI_class_tests_93 ...");
		String[] result = MIPS32_TGEI_class.MIPS32_TGEI('d', -1174405120).split("->");
		String dir = "symips/jdart/MIPS32_TGEI_class/";
		String testName = "MIPS32_TGEI_class_93";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TGEI_class_94() {
		System.out.println("   + Executing MIPS32_TGEI_class_tests_94 ...");
		String[] result = MIPS32_TGEI_class.MIPS32_TGEI('d', -1140850688).split("->");
		String dir = "symips/jdart/MIPS32_TGEI_class/";
		String testName = "MIPS32_TGEI_class_94";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TGEI_class_95() {
		System.out.println("   + Executing MIPS32_TGEI_class_tests_95 ...");
		String[] result = MIPS32_TGEI_class.MIPS32_TGEI('d', -1107296256).split("->");
		String dir = "symips/jdart/MIPS32_TGEI_class/";
		String testName = "MIPS32_TGEI_class_95";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TGEI_class_96() {
		System.out.println("   + Executing MIPS32_TGEI_class_tests_96 ...");
		String[] result = MIPS32_TGEI_class.MIPS32_TGEI('d', -1073741824).split("->");
		String dir = "symips/jdart/MIPS32_TGEI_class/";
		String testName = "MIPS32_TGEI_class_96";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TGEI_class_97() {
		System.out.println("   + Executing MIPS32_TGEI_class_tests_97 ...");
		String[] result = MIPS32_TGEI_class.MIPS32_TGEI('d', -1040187392).split("->");
		String dir = "symips/jdart/MIPS32_TGEI_class/";
		String testName = "MIPS32_TGEI_class_97";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TGEI_class_98() {
		System.out.println("   + Executing MIPS32_TGEI_class_tests_98 ...");
		String[] result = MIPS32_TGEI_class.MIPS32_TGEI('d', -1006632960).split("->");
		String dir = "symips/jdart/MIPS32_TGEI_class/";
		String testName = "MIPS32_TGEI_class_98";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TGEI_class_99() {
		System.out.println("   + Executing MIPS32_TGEI_class_tests_99 ...");
		String[] result = MIPS32_TGEI_class.MIPS32_TGEI('d', -973078528).split("->");
		String dir = "symips/jdart/MIPS32_TGEI_class/";
		String testName = "MIPS32_TGEI_class_99";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TGEI_class_100() {
		System.out.println("   + Executing MIPS32_TGEI_class_tests_100 ...");
		String[] result = MIPS32_TGEI_class.MIPS32_TGEI('d', -939524096).split("->");
		String dir = "symips/jdart/MIPS32_TGEI_class/";
		String testName = "MIPS32_TGEI_class_100";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TGEI_class_101() {
		System.out.println("   + Executing MIPS32_TGEI_class_tests_101 ...");
		String[] result = MIPS32_TGEI_class.MIPS32_TGEI('d', -905969664).split("->");
		String dir = "symips/jdart/MIPS32_TGEI_class/";
		String testName = "MIPS32_TGEI_class_101";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TGEI_class_102() {
		System.out.println("   + Executing MIPS32_TGEI_class_tests_102 ...");
		String[] result = MIPS32_TGEI_class.MIPS32_TGEI('d', -872415232).split("->");
		String dir = "symips/jdart/MIPS32_TGEI_class/";
		String testName = "MIPS32_TGEI_class_102";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TGEI_class_103() {
		System.out.println("   + Executing MIPS32_TGEI_class_tests_103 ...");
		String[] result = MIPS32_TGEI_class.MIPS32_TGEI('d', -838860800).split("->");
		String dir = "symips/jdart/MIPS32_TGEI_class/";
		String testName = "MIPS32_TGEI_class_103";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TGEI_class_104() {
		System.out.println("   + Executing MIPS32_TGEI_class_tests_104 ...");
		String[] result = MIPS32_TGEI_class.MIPS32_TGEI('d', -805306368).split("->");
		String dir = "symips/jdart/MIPS32_TGEI_class/";
		String testName = "MIPS32_TGEI_class_104";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TGEI_class_105() {
		System.out.println("   + Executing MIPS32_TGEI_class_tests_105 ...");
		String[] result = MIPS32_TGEI_class.MIPS32_TGEI('d', -771751936).split("->");
		String dir = "symips/jdart/MIPS32_TGEI_class/";
		String testName = "MIPS32_TGEI_class_105";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TGEI_class_106() {
		System.out.println("   + Executing MIPS32_TGEI_class_tests_106 ...");
		String[] result = MIPS32_TGEI_class.MIPS32_TGEI('d', -738197504).split("->");
		String dir = "symips/jdart/MIPS32_TGEI_class/";
		String testName = "MIPS32_TGEI_class_106";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TGEI_class_107() {
		System.out.println("   + Executing MIPS32_TGEI_class_tests_107 ...");
		String[] result = MIPS32_TGEI_class.MIPS32_TGEI('d', -704643072).split("->");
		String dir = "symips/jdart/MIPS32_TGEI_class/";
		String testName = "MIPS32_TGEI_class_107";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TGEI_class_108() {
		System.out.println("   + Executing MIPS32_TGEI_class_tests_108 ...");
		String[] result = MIPS32_TGEI_class.MIPS32_TGEI('d', -671088640).split("->");
		String dir = "symips/jdart/MIPS32_TGEI_class/";
		String testName = "MIPS32_TGEI_class_108";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TGEI_class_109() {
		System.out.println("   + Executing MIPS32_TGEI_class_tests_109 ...");
		String[] result = MIPS32_TGEI_class.MIPS32_TGEI('d', -637534208).split("->");
		String dir = "symips/jdart/MIPS32_TGEI_class/";
		String testName = "MIPS32_TGEI_class_109";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TGEI_class_110() {
		System.out.println("   + Executing MIPS32_TGEI_class_tests_110 ...");
		String[] result = MIPS32_TGEI_class.MIPS32_TGEI('d', -603979776).split("->");
		String dir = "symips/jdart/MIPS32_TGEI_class/";
		String testName = "MIPS32_TGEI_class_110";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TGEI_class_111() {
		System.out.println("   + Executing MIPS32_TGEI_class_tests_111 ...");
		String[] result = MIPS32_TGEI_class.MIPS32_TGEI('d', -570425344).split("->");
		String dir = "symips/jdart/MIPS32_TGEI_class/";
		String testName = "MIPS32_TGEI_class_111";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TGEI_class_112() {
		System.out.println("   + Executing MIPS32_TGEI_class_tests_112 ...");
		String[] result = MIPS32_TGEI_class.MIPS32_TGEI('d', -536870912).split("->");
		String dir = "symips/jdart/MIPS32_TGEI_class/";
		String testName = "MIPS32_TGEI_class_112";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TGEI_class_113() {
		System.out.println("   + Executing MIPS32_TGEI_class_tests_113 ...");
		String[] result = MIPS32_TGEI_class.MIPS32_TGEI('d', -503316480).split("->");
		String dir = "symips/jdart/MIPS32_TGEI_class/";
		String testName = "MIPS32_TGEI_class_113";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TGEI_class_114() {
		System.out.println("   + Executing MIPS32_TGEI_class_tests_114 ...");
		String[] result = MIPS32_TGEI_class.MIPS32_TGEI('d', -469762048).split("->");
		String dir = "symips/jdart/MIPS32_TGEI_class/";
		String testName = "MIPS32_TGEI_class_114";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TGEI_class_115() {
		System.out.println("   + Executing MIPS32_TGEI_class_tests_115 ...");
		String[] result = MIPS32_TGEI_class.MIPS32_TGEI('d', -436207616).split("->");
		String dir = "symips/jdart/MIPS32_TGEI_class/";
		String testName = "MIPS32_TGEI_class_115";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TGEI_class_116() {
		System.out.println("   + Executing MIPS32_TGEI_class_tests_116 ...");
		String[] result = MIPS32_TGEI_class.MIPS32_TGEI('d', -402653184).split("->");
		String dir = "symips/jdart/MIPS32_TGEI_class/";
		String testName = "MIPS32_TGEI_class_116";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TGEI_class_117() {
		System.out.println("   + Executing MIPS32_TGEI_class_tests_117 ...");
		String[] result = MIPS32_TGEI_class.MIPS32_TGEI('d', -369098752).split("->");
		String dir = "symips/jdart/MIPS32_TGEI_class/";
		String testName = "MIPS32_TGEI_class_117";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TGEI_class_118() {
		System.out.println("   + Executing MIPS32_TGEI_class_tests_118 ...");
		String[] result = MIPS32_TGEI_class.MIPS32_TGEI('d', -335544320).split("->");
		String dir = "symips/jdart/MIPS32_TGEI_class/";
		String testName = "MIPS32_TGEI_class_118";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TGEI_class_119() {
		System.out.println("   + Executing MIPS32_TGEI_class_tests_119 ...");
		String[] result = MIPS32_TGEI_class.MIPS32_TGEI('d', -301989888).split("->");
		String dir = "symips/jdart/MIPS32_TGEI_class/";
		String testName = "MIPS32_TGEI_class_119";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TGEI_class_120() {
		System.out.println("   + Executing MIPS32_TGEI_class_tests_120 ...");
		String[] result = MIPS32_TGEI_class.MIPS32_TGEI('d', -268435456).split("->");
		String dir = "symips/jdart/MIPS32_TGEI_class/";
		String testName = "MIPS32_TGEI_class_120";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TGEI_class_121() {
		System.out.println("   + Executing MIPS32_TGEI_class_tests_121 ...");
		String[] result = MIPS32_TGEI_class.MIPS32_TGEI('d', -234881024).split("->");
		String dir = "symips/jdart/MIPS32_TGEI_class/";
		String testName = "MIPS32_TGEI_class_121";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TGEI_class_122() {
		System.out.println("   + Executing MIPS32_TGEI_class_tests_122 ...");
		String[] result = MIPS32_TGEI_class.MIPS32_TGEI('d', -201326592).split("->");
		String dir = "symips/jdart/MIPS32_TGEI_class/";
		String testName = "MIPS32_TGEI_class_122";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TGEI_class_123() {
		System.out.println("   + Executing MIPS32_TGEI_class_tests_123 ...");
		String[] result = MIPS32_TGEI_class.MIPS32_TGEI('d', -167772160).split("->");
		String dir = "symips/jdart/MIPS32_TGEI_class/";
		String testName = "MIPS32_TGEI_class_123";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TGEI_class_124() {
		System.out.println("   + Executing MIPS32_TGEI_class_tests_124 ...");
		String[] result = MIPS32_TGEI_class.MIPS32_TGEI('d', -134217728).split("->");
		String dir = "symips/jdart/MIPS32_TGEI_class/";
		String testName = "MIPS32_TGEI_class_124";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TGEI_class_125() {
		System.out.println("   + Executing MIPS32_TGEI_class_tests_125 ...");
		String[] result = MIPS32_TGEI_class.MIPS32_TGEI('d', -100663296).split("->");
		String dir = "symips/jdart/MIPS32_TGEI_class/";
		String testName = "MIPS32_TGEI_class_125";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TGEI_class_126() {
		System.out.println("   + Executing MIPS32_TGEI_class_tests_126 ...");
		String[] result = MIPS32_TGEI_class.MIPS32_TGEI('d', -67108864).split("->");
		String dir = "symips/jdart/MIPS32_TGEI_class/";
		String testName = "MIPS32_TGEI_class_126";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TGEI_class_127() {
		System.out.println("   + Executing MIPS32_TGEI_class_tests_127 ...");
		String[] result = MIPS32_TGEI_class.MIPS32_TGEI('d', -33554432).split("->");
		String dir = "symips/jdart/MIPS32_TGEI_class/";
		String testName = "MIPS32_TGEI_class_127";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TGEI_class_128() {
		System.out.println("   + Executing MIPS32_TGEI_class_tests_128 ...");
		String[] result = MIPS32_TGEI_class.MIPS32_TGEI('d', 0).split("->");
		String dir = "symips/jdart/MIPS32_TGEI_class/";
		String testName = "MIPS32_TGEI_class_128";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_OR16_class_0() {
		System.out.println("   + Executing microMIPS_OR16_class_tests_0 ...");
		String[] result = microMIPS_OR16_class.microMIPS_OR16('i', '4').split("->");
		String dir = "symips/jdart/microMIPS_OR16_class/";
		String testName = "microMIPS_OR16_class_0";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_ADDI_class_0() {
		System.out.println("   + Executing MIPS32_ADDI_class_tests_0 ...");
		String[] result = MIPS32_ADDI_class.MIPS32_ADDI('h', '7', 703).split("->");
		String dir = "symips/jdart/MIPS32_ADDI_class/";
		String testName = "MIPS32_ADDI_class_0";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_ADDI_class_1() {
		System.out.println("   + Executing MIPS32_ADDI_class_tests_1 ...");
		String[] result = MIPS32_ADDI_class.MIPS32_ADDI('h', '0', 0).split("->");
		String dir = "symips/jdart/MIPS32_ADDI_class/";
		String testName = "MIPS32_ADDI_class_1";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_SLLV_class_0() {
		System.out.println("   + Executing MIPS32_SLLV_class_tests_0 ...");
		String[] result = MIPS32_SLLV_class.MIPS32_SLLV('f', 'b', 'v').split("->");
		String dir = "symips/jdart/MIPS32_SLLV_class/";
		String testName = "MIPS32_SLLV_class_0";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_AND_class_0() {
		System.out.println("   + Executing MIPS32_AND_class_tests_0 ...");
		String[] result = MIPS32_AND_class.MIPS32_AND('0', '1', 'b').split("->");
		String dir = "symips/jdart/MIPS32_AND_class/";
		String testName = "MIPS32_AND_class_0";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_AND_class_1() {
		System.out.println("   + Executing MIPS32_AND_class_tests_1 ...");
		String[] result = MIPS32_AND_class.MIPS32_AND('r', '1', 'b').split("->");
		String dir = "symips/jdart/MIPS32_AND_class/";
		String testName = "MIPS32_AND_class_1";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_SLTI_class_0() {
		System.out.println("   + Executing microMIPS_SLTI_class_tests_0 ...");
		String[] result = microMIPS_SLTI_class.microMIPS_SLTI('j', '6', 794).split("->");
		String dir = "symips/jdart/microMIPS_SLTI_class/";
		String testName = "microMIPS_SLTI_class_0";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_SLTI_class_1() {
		System.out.println("   + Executing microMIPS_SLTI_class_tests_1 ...");
		String[] result = microMIPS_SLTI_class.microMIPS_SLTI('j', '0', 0).split("->");
		String dir = "symips/jdart/microMIPS_SLTI_class/";
		String testName = "microMIPS_SLTI_class_1";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_SLTU_class_0() {
		System.out.println("   + Executing microMIPS_SLTU_class_tests_0 ...");
		String[] result = microMIPS_SLTU_class.microMIPS_SLTU('1', 'q', 'm').split("->");
		String dir = "symips/jdart/microMIPS_SLTU_class/";
		String testName = "microMIPS_SLTU_class_0";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_LUI_class_0() {
		System.out.println("   + Executing microMIPS_LUI_class_tests_0 ...");
		String[] result = microMIPS_LUI_class.microMIPS_LUI('k', 388).split("->");
		String dir = "symips/jdart/microMIPS_LUI_class/";
		String testName = "microMIPS_LUI_class_0";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_LUI_class_1() {
		System.out.println("   + Executing microMIPS_LUI_class_tests_1 ...");
		String[] result = microMIPS_LUI_class.microMIPS_LUI('0', 0).split("->");
		String dir = "symips/jdart/microMIPS_LUI_class/";
		String testName = "microMIPS_LUI_class_1";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TLTIU_class_0() {
		System.out.println("   + Executing MIPS32_TLTIU_class_tests_0 ...");
		String[] result = MIPS32_TLTIU_class.MIPS32_TLTIU('c', 553).split("->");
		String dir = "symips/jdart/MIPS32_TLTIU_class/";
		String testName = "MIPS32_TLTIU_class_0";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TLTIU_class_1() {
		System.out.println("   + Executing MIPS32_TLTIU_class_tests_1 ...");
		String[] result = MIPS32_TLTIU_class.MIPS32_TLTIU('c', 33554432).split("->");
		String dir = "symips/jdart/MIPS32_TLTIU_class/";
		String testName = "MIPS32_TLTIU_class_1";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TLTIU_class_2() {
		System.out.println("   + Executing MIPS32_TLTIU_class_tests_2 ...");
		String[] result = MIPS32_TLTIU_class.MIPS32_TLTIU('c', 67108864).split("->");
		String dir = "symips/jdart/MIPS32_TLTIU_class/";
		String testName = "MIPS32_TLTIU_class_2";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TLTIU_class_3() {
		System.out.println("   + Executing MIPS32_TLTIU_class_tests_3 ...");
		String[] result = MIPS32_TLTIU_class.MIPS32_TLTIU('c', 100663296).split("->");
		String dir = "symips/jdart/MIPS32_TLTIU_class/";
		String testName = "MIPS32_TLTIU_class_3";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TLTIU_class_4() {
		System.out.println("   + Executing MIPS32_TLTIU_class_tests_4 ...");
		String[] result = MIPS32_TLTIU_class.MIPS32_TLTIU('c', 134217728).split("->");
		String dir = "symips/jdart/MIPS32_TLTIU_class/";
		String testName = "MIPS32_TLTIU_class_4";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TLTIU_class_5() {
		System.out.println("   + Executing MIPS32_TLTIU_class_tests_5 ...");
		String[] result = MIPS32_TLTIU_class.MIPS32_TLTIU('c', 167772160).split("->");
		String dir = "symips/jdart/MIPS32_TLTIU_class/";
		String testName = "MIPS32_TLTIU_class_5";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TLTIU_class_6() {
		System.out.println("   + Executing MIPS32_TLTIU_class_tests_6 ...");
		String[] result = MIPS32_TLTIU_class.MIPS32_TLTIU('c', 201326592).split("->");
		String dir = "symips/jdart/MIPS32_TLTIU_class/";
		String testName = "MIPS32_TLTIU_class_6";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TLTIU_class_7() {
		System.out.println("   + Executing MIPS32_TLTIU_class_tests_7 ...");
		String[] result = MIPS32_TLTIU_class.MIPS32_TLTIU('c', 234881024).split("->");
		String dir = "symips/jdart/MIPS32_TLTIU_class/";
		String testName = "MIPS32_TLTIU_class_7";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TLTIU_class_8() {
		System.out.println("   + Executing MIPS32_TLTIU_class_tests_8 ...");
		String[] result = MIPS32_TLTIU_class.MIPS32_TLTIU('c', 301727743).split("->");
		String dir = "symips/jdart/MIPS32_TLTIU_class/";
		String testName = "MIPS32_TLTIU_class_8";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TLTIU_class_9() {
		System.out.println("   + Executing MIPS32_TLTIU_class_tests_9 ...");
		String[] result = MIPS32_TLTIU_class.MIPS32_TLTIU('c', 335020031).split("->");
		String dir = "symips/jdart/MIPS32_TLTIU_class/";
		String testName = "MIPS32_TLTIU_class_9";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TLTIU_class_10() {
		System.out.println("   + Executing MIPS32_TLTIU_class_tests_10 ...");
		String[] result = MIPS32_TLTIU_class.MIPS32_TLTIU('c', 335544320).split("->");
		String dir = "symips/jdart/MIPS32_TLTIU_class/";
		String testName = "MIPS32_TLTIU_class_10";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TLTIU_class_11() {
		System.out.println("   + Executing MIPS32_TLTIU_class_tests_11 ...");
		String[] result = MIPS32_TLTIU_class.MIPS32_TLTIU('c', 369098752).split("->");
		String dir = "symips/jdart/MIPS32_TLTIU_class/";
		String testName = "MIPS32_TLTIU_class_11";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TLTIU_class_12() {
		System.out.println("   + Executing MIPS32_TLTIU_class_tests_12 ...");
		String[] result = MIPS32_TLTIU_class.MIPS32_TLTIU('c', 402653184).split("->");
		String dir = "symips/jdart/MIPS32_TLTIU_class/";
		String testName = "MIPS32_TLTIU_class_12";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TLTIU_class_13() {
		System.out.println("   + Executing MIPS32_TLTIU_class_tests_13 ...");
		String[] result = MIPS32_TLTIU_class.MIPS32_TLTIU('c', 436207616).split("->");
		String dir = "symips/jdart/MIPS32_TLTIU_class/";
		String testName = "MIPS32_TLTIU_class_13";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TLTIU_class_14() {
		System.out.println("   + Executing MIPS32_TLTIU_class_tests_14 ...");
		String[] result = MIPS32_TLTIU_class.MIPS32_TLTIU('c', 469762048).split("->");
		String dir = "symips/jdart/MIPS32_TLTIU_class/";
		String testName = "MIPS32_TLTIU_class_14";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TLTIU_class_15() {
		System.out.println("   + Executing MIPS32_TLTIU_class_tests_15 ...");
		String[] result = MIPS32_TLTIU_class.MIPS32_TLTIU('c', 503316480).split("->");
		String dir = "symips/jdart/MIPS32_TLTIU_class/";
		String testName = "MIPS32_TLTIU_class_15";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TLTIU_class_16() {
		System.out.println("   + Executing MIPS32_TLTIU_class_tests_16 ...");
		String[] result = MIPS32_TLTIU_class.MIPS32_TLTIU('c', 570163199).split("->");
		String dir = "symips/jdart/MIPS32_TLTIU_class/";
		String testName = "MIPS32_TLTIU_class_16";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TLTIU_class_17() {
		System.out.println("   + Executing MIPS32_TLTIU_class_tests_17 ...");
		String[] result = MIPS32_TLTIU_class.MIPS32_TLTIU('c', 603455487).split("->");
		String dir = "symips/jdart/MIPS32_TLTIU_class/";
		String testName = "MIPS32_TLTIU_class_17";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TLTIU_class_18() {
		System.out.println("   + Executing MIPS32_TLTIU_class_tests_18 ...");
		String[] result = MIPS32_TLTIU_class.MIPS32_TLTIU('c', 637009919).split("->");
		String dir = "symips/jdart/MIPS32_TLTIU_class/";
		String testName = "MIPS32_TLTIU_class_18";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TLTIU_class_19() {
		System.out.println("   + Executing MIPS32_TLTIU_class_tests_19 ...");
		String[] result = MIPS32_TLTIU_class.MIPS32_TLTIU('c', 670040063).split("->");
		String dir = "symips/jdart/MIPS32_TLTIU_class/";
		String testName = "MIPS32_TLTIU_class_19";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TLTIU_class_20() {
		System.out.println("   + Executing MIPS32_TLTIU_class_tests_20 ...");
		String[] result = MIPS32_TLTIU_class.MIPS32_TLTIU('c', 704118783).split("->");
		String dir = "symips/jdart/MIPS32_TLTIU_class/";
		String testName = "MIPS32_TLTIU_class_20";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TLTIU_class_21() {
		System.out.println("   + Executing MIPS32_TLTIU_class_tests_21 ...");
		String[] result = MIPS32_TLTIU_class.MIPS32_TLTIU('c', 737148927).split("->");
		String dir = "symips/jdart/MIPS32_TLTIU_class/";
		String testName = "MIPS32_TLTIU_class_21";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TLTIU_class_22() {
		System.out.println("   + Executing MIPS32_TLTIU_class_tests_22 ...");
		String[] result = MIPS32_TLTIU_class.MIPS32_TLTIU('c', 770703359).split("->");
		String dir = "symips/jdart/MIPS32_TLTIU_class/";
		String testName = "MIPS32_TLTIU_class_22";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TLTIU_class_23() {
		System.out.println("   + Executing MIPS32_TLTIU_class_tests_23 ...");
		String[] result = MIPS32_TLTIU_class.MIPS32_TLTIU('c', 803209215).split("->");
		String dir = "symips/jdart/MIPS32_TLTIU_class/";
		String testName = "MIPS32_TLTIU_class_23";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TLTIU_class_24() {
		System.out.println("   + Executing MIPS32_TLTIU_class_tests_24 ...");
		String[] result = MIPS32_TLTIU_class.MIPS32_TLTIU('c', 838336511).split("->");
		String dir = "symips/jdart/MIPS32_TLTIU_class/";
		String testName = "MIPS32_TLTIU_class_24";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TLTIU_class_25() {
		System.out.println("   + Executing MIPS32_TLTIU_class_tests_25 ...");
		String[] result = MIPS32_TLTIU_class.MIPS32_TLTIU('c', 871366655).split("->");
		String dir = "symips/jdart/MIPS32_TLTIU_class/";
		String testName = "MIPS32_TLTIU_class_25";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TLTIU_class_26() {
		System.out.println("   + Executing MIPS32_TLTIU_class_tests_26 ...");
		String[] result = MIPS32_TLTIU_class.MIPS32_TLTIU('c', 904921087).split("->");
		String dir = "symips/jdart/MIPS32_TLTIU_class/";
		String testName = "MIPS32_TLTIU_class_26";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TLTIU_class_27() {
		System.out.println("   + Executing MIPS32_TLTIU_class_tests_27 ...");
		String[] result = MIPS32_TLTIU_class.MIPS32_TLTIU('c', 937426943).split("->");
		String dir = "symips/jdart/MIPS32_TLTIU_class/";
		String testName = "MIPS32_TLTIU_class_27";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TLTIU_class_28() {
		System.out.println("   + Executing MIPS32_TLTIU_class_tests_28 ...");
		String[] result = MIPS32_TLTIU_class.MIPS32_TLTIU('c', 972029951).split("->");
		String dir = "symips/jdart/MIPS32_TLTIU_class/";
		String testName = "MIPS32_TLTIU_class_28";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TLTIU_class_29() {
		System.out.println("   + Executing MIPS32_TLTIU_class_tests_29 ...");
		String[] result = MIPS32_TLTIU_class.MIPS32_TLTIU('c', 1004535807).split("->");
		String dir = "symips/jdart/MIPS32_TLTIU_class/";
		String testName = "MIPS32_TLTIU_class_29";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TLTIU_class_30() {
		System.out.println("   + Executing MIPS32_TLTIU_class_tests_30 ...");
		String[] result = MIPS32_TLTIU_class.MIPS32_TLTIU('c', 1038090239).split("->");
		String dir = "symips/jdart/MIPS32_TLTIU_class/";
		String testName = "MIPS32_TLTIU_class_30";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TLTIU_class_31() {
		System.out.println("   + Executing MIPS32_TLTIU_class_tests_31 ...");
		String[] result = MIPS32_TLTIU_class.MIPS32_TLTIU('c', 1069547519).split("->");
		String dir = "symips/jdart/MIPS32_TLTIU_class/";
		String testName = "MIPS32_TLTIU_class_31";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TLTIU_class_32() {
		System.out.println("   + Executing MIPS32_TLTIU_class_tests_32 ...");
		String[] result = MIPS32_TLTIU_class.MIPS32_TLTIU('c', 1107034111).split("->");
		String dir = "symips/jdart/MIPS32_TLTIU_class/";
		String testName = "MIPS32_TLTIU_class_32";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TLTIU_class_33() {
		System.out.println("   + Executing MIPS32_TLTIU_class_tests_33 ...");
		String[] result = MIPS32_TLTIU_class.MIPS32_TLTIU('c', 1140326399).split("->");
		String dir = "symips/jdart/MIPS32_TLTIU_class/";
		String testName = "MIPS32_TLTIU_class_33";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TLTIU_class_34() {
		System.out.println("   + Executing MIPS32_TLTIU_class_tests_34 ...");
		String[] result = MIPS32_TLTIU_class.MIPS32_TLTIU('c', 1173880831).split("->");
		String dir = "symips/jdart/MIPS32_TLTIU_class/";
		String testName = "MIPS32_TLTIU_class_34";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TLTIU_class_35() {
		System.out.println("   + Executing MIPS32_TLTIU_class_tests_35 ...");
		String[] result = MIPS32_TLTIU_class.MIPS32_TLTIU('c', 1206910975).split("->");
		String dir = "symips/jdart/MIPS32_TLTIU_class/";
		String testName = "MIPS32_TLTIU_class_35";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TLTIU_class_36() {
		System.out.println("   + Executing MIPS32_TLTIU_class_tests_36 ...");
		String[] result = MIPS32_TLTIU_class.MIPS32_TLTIU('c', 1240989695).split("->");
		String dir = "symips/jdart/MIPS32_TLTIU_class/";
		String testName = "MIPS32_TLTIU_class_36";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TLTIU_class_37() {
		System.out.println("   + Executing MIPS32_TLTIU_class_tests_37 ...");
		String[] result = MIPS32_TLTIU_class.MIPS32_TLTIU('c', 1274019839).split("->");
		String dir = "symips/jdart/MIPS32_TLTIU_class/";
		String testName = "MIPS32_TLTIU_class_37";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TLTIU_class_38() {
		System.out.println("   + Executing MIPS32_TLTIU_class_tests_38 ...");
		String[] result = MIPS32_TLTIU_class.MIPS32_TLTIU('c', 1307574271).split("->");
		String dir = "symips/jdart/MIPS32_TLTIU_class/";
		String testName = "MIPS32_TLTIU_class_38";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TLTIU_class_39() {
		System.out.println("   + Executing MIPS32_TLTIU_class_tests_39 ...");
		String[] result = MIPS32_TLTIU_class.MIPS32_TLTIU('c', 1340080127).split("->");
		String dir = "symips/jdart/MIPS32_TLTIU_class/";
		String testName = "MIPS32_TLTIU_class_39";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TLTIU_class_40() {
		System.out.println("   + Executing MIPS32_TLTIU_class_tests_40 ...");
		String[] result = MIPS32_TLTIU_class.MIPS32_TLTIU('c', 1375207423).split("->");
		String dir = "symips/jdart/MIPS32_TLTIU_class/";
		String testName = "MIPS32_TLTIU_class_40";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TLTIU_class_41() {
		System.out.println("   + Executing MIPS32_TLTIU_class_tests_41 ...");
		String[] result = MIPS32_TLTIU_class.MIPS32_TLTIU('c', 1408237567).split("->");
		String dir = "symips/jdart/MIPS32_TLTIU_class/";
		String testName = "MIPS32_TLTIU_class_41";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TLTIU_class_42() {
		System.out.println("   + Executing MIPS32_TLTIU_class_tests_42 ...");
		String[] result = MIPS32_TLTIU_class.MIPS32_TLTIU('c', 1441791999).split("->");
		String dir = "symips/jdart/MIPS32_TLTIU_class/";
		String testName = "MIPS32_TLTIU_class_42";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TLTIU_class_43() {
		System.out.println("   + Executing MIPS32_TLTIU_class_tests_43 ...");
		String[] result = MIPS32_TLTIU_class.MIPS32_TLTIU('c', 1474297855).split("->");
		String dir = "symips/jdart/MIPS32_TLTIU_class/";
		String testName = "MIPS32_TLTIU_class_43";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TLTIU_class_44() {
		System.out.println("   + Executing MIPS32_TLTIU_class_tests_44 ...");
		String[] result = MIPS32_TLTIU_class.MIPS32_TLTIU('c', 1508900863).split("->");
		String dir = "symips/jdart/MIPS32_TLTIU_class/";
		String testName = "MIPS32_TLTIU_class_44";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TLTIU_class_45() {
		System.out.println("   + Executing MIPS32_TLTIU_class_tests_45 ...");
		String[] result = MIPS32_TLTIU_class.MIPS32_TLTIU('c', 1541406719).split("->");
		String dir = "symips/jdart/MIPS32_TLTIU_class/";
		String testName = "MIPS32_TLTIU_class_45";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TLTIU_class_46() {
		System.out.println("   + Executing MIPS32_TLTIU_class_tests_46 ...");
		String[] result = MIPS32_TLTIU_class.MIPS32_TLTIU('c', 1574961151).split("->");
		String dir = "symips/jdart/MIPS32_TLTIU_class/";
		String testName = "MIPS32_TLTIU_class_46";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TLTIU_class_47() {
		System.out.println("   + Executing MIPS32_TLTIU_class_tests_47 ...");
		String[] result = MIPS32_TLTIU_class.MIPS32_TLTIU('c', 1606418431).split("->");
		String dir = "symips/jdart/MIPS32_TLTIU_class/";
		String testName = "MIPS32_TLTIU_class_47";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TLTIU_class_48() {
		System.out.println("   + Executing MIPS32_TLTIU_class_tests_48 ...");
		String[] result = MIPS32_TLTIU_class.MIPS32_TLTIU('c', 1643642879).split("->");
		String dir = "symips/jdart/MIPS32_TLTIU_class/";
		String testName = "MIPS32_TLTIU_class_48";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TLTIU_class_49() {
		System.out.println("   + Executing MIPS32_TLTIU_class_tests_49 ...");
		String[] result = MIPS32_TLTIU_class.MIPS32_TLTIU('c', 1676673023).split("->");
		String dir = "symips/jdart/MIPS32_TLTIU_class/";
		String testName = "MIPS32_TLTIU_class_49";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TLTIU_class_50() {
		System.out.println("   + Executing MIPS32_TLTIU_class_tests_50 ...");
		String[] result = MIPS32_TLTIU_class.MIPS32_TLTIU('c', 1710227455).split("->");
		String dir = "symips/jdart/MIPS32_TLTIU_class/";
		String testName = "MIPS32_TLTIU_class_50";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TLTIU_class_51() {
		System.out.println("   + Executing MIPS32_TLTIU_class_tests_51 ...");
		String[] result = MIPS32_TLTIU_class.MIPS32_TLTIU('c', 1742733311).split("->");
		String dir = "symips/jdart/MIPS32_TLTIU_class/";
		String testName = "MIPS32_TLTIU_class_51";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TLTIU_class_52() {
		System.out.println("   + Executing MIPS32_TLTIU_class_tests_52 ...");
		String[] result = MIPS32_TLTIU_class.MIPS32_TLTIU('c', 1777336319).split("->");
		String dir = "symips/jdart/MIPS32_TLTIU_class/";
		String testName = "MIPS32_TLTIU_class_52";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TLTIU_class_53() {
		System.out.println("   + Executing MIPS32_TLTIU_class_tests_53 ...");
		String[] result = MIPS32_TLTIU_class.MIPS32_TLTIU('c', 1809842175).split("->");
		String dir = "symips/jdart/MIPS32_TLTIU_class/";
		String testName = "MIPS32_TLTIU_class_53";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TLTIU_class_54() {
		System.out.println("   + Executing MIPS32_TLTIU_class_tests_54 ...");
		String[] result = MIPS32_TLTIU_class.MIPS32_TLTIU('c', 1843396607).split("->");
		String dir = "symips/jdart/MIPS32_TLTIU_class/";
		String testName = "MIPS32_TLTIU_class_54";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TLTIU_class_55() {
		System.out.println("   + Executing MIPS32_TLTIU_class_tests_55 ...");
		String[] result = MIPS32_TLTIU_class.MIPS32_TLTIU('c', 1874853887).split("->");
		String dir = "symips/jdart/MIPS32_TLTIU_class/";
		String testName = "MIPS32_TLTIU_class_55";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TLTIU_class_56() {
		System.out.println("   + Executing MIPS32_TLTIU_class_tests_56 ...");
		String[] result = MIPS32_TLTIU_class.MIPS32_TLTIU('c', 1911554047).split("->");
		String dir = "symips/jdart/MIPS32_TLTIU_class/";
		String testName = "MIPS32_TLTIU_class_56";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TLTIU_class_57() {
		System.out.println("   + Executing MIPS32_TLTIU_class_tests_57 ...");
		String[] result = MIPS32_TLTIU_class.MIPS32_TLTIU('c', 1944059903).split("->");
		String dir = "symips/jdart/MIPS32_TLTIU_class/";
		String testName = "MIPS32_TLTIU_class_57";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TLTIU_class_58() {
		System.out.println("   + Executing MIPS32_TLTIU_class_tests_58 ...");
		String[] result = MIPS32_TLTIU_class.MIPS32_TLTIU('c', 1977614335).split("->");
		String dir = "symips/jdart/MIPS32_TLTIU_class/";
		String testName = "MIPS32_TLTIU_class_58";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TLTIU_class_59() {
		System.out.println("   + Executing MIPS32_TLTIU_class_tests_59 ...");
		String[] result = MIPS32_TLTIU_class.MIPS32_TLTIU('c', 2009071615).split("->");
		String dir = "symips/jdart/MIPS32_TLTIU_class/";
		String testName = "MIPS32_TLTIU_class_59";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TLTIU_class_60() {
		System.out.println("   + Executing MIPS32_TLTIU_class_tests_60 ...");
		String[] result = MIPS32_TLTIU_class.MIPS32_TLTIU('c', 2044723199).split("->");
		String dir = "symips/jdart/MIPS32_TLTIU_class/";
		String testName = "MIPS32_TLTIU_class_60";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TLTIU_class_61() {
		System.out.println("   + Executing MIPS32_TLTIU_class_tests_61 ...");
		String[] result = MIPS32_TLTIU_class.MIPS32_TLTIU('c', 2076180479).split("->");
		String dir = "symips/jdart/MIPS32_TLTIU_class/";
		String testName = "MIPS32_TLTIU_class_61";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TLTIU_class_62() {
		System.out.println("   + Executing MIPS32_TLTIU_class_tests_62 ...");
		String[] result = MIPS32_TLTIU_class.MIPS32_TLTIU('c', 2109734911).split("->");
		String dir = "symips/jdart/MIPS32_TLTIU_class/";
		String testName = "MIPS32_TLTIU_class_62";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TLTIU_class_63() {
		System.out.println("   + Executing MIPS32_TLTIU_class_tests_63 ...");
		String[] result = MIPS32_TLTIU_class.MIPS32_TLTIU('c', 2139095039).split("->");
		String dir = "symips/jdart/MIPS32_TLTIU_class/";
		String testName = "MIPS32_TLTIU_class_63";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TLTIU_class_64() {
		System.out.println("   + Executing MIPS32_TLTIU_class_tests_64 ...");
		String[] result = MIPS32_TLTIU_class.MIPS32_TLTIU('c', -2147483648).split("->");
		String dir = "symips/jdart/MIPS32_TLTIU_class/";
		String testName = "MIPS32_TLTIU_class_64";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TLTIU_class_65() {
		System.out.println("   + Executing MIPS32_TLTIU_class_tests_65 ...");
		String[] result = MIPS32_TLTIU_class.MIPS32_TLTIU('c', -2113929216).split("->");
		String dir = "symips/jdart/MIPS32_TLTIU_class/";
		String testName = "MIPS32_TLTIU_class_65";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TLTIU_class_66() {
		System.out.println("   + Executing MIPS32_TLTIU_class_tests_66 ...");
		String[] result = MIPS32_TLTIU_class.MIPS32_TLTIU('c', -2080374784).split("->");
		String dir = "symips/jdart/MIPS32_TLTIU_class/";
		String testName = "MIPS32_TLTIU_class_66";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TLTIU_class_67() {
		System.out.println("   + Executing MIPS32_TLTIU_class_tests_67 ...");
		String[] result = MIPS32_TLTIU_class.MIPS32_TLTIU('c', -2046820352).split("->");
		String dir = "symips/jdart/MIPS32_TLTIU_class/";
		String testName = "MIPS32_TLTIU_class_67";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TLTIU_class_68() {
		System.out.println("   + Executing MIPS32_TLTIU_class_tests_68 ...");
		String[] result = MIPS32_TLTIU_class.MIPS32_TLTIU('c', -2013265920).split("->");
		String dir = "symips/jdart/MIPS32_TLTIU_class/";
		String testName = "MIPS32_TLTIU_class_68";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TLTIU_class_69() {
		System.out.println("   + Executing MIPS32_TLTIU_class_tests_69 ...");
		String[] result = MIPS32_TLTIU_class.MIPS32_TLTIU('c', -1979711488).split("->");
		String dir = "symips/jdart/MIPS32_TLTIU_class/";
		String testName = "MIPS32_TLTIU_class_69";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TLTIU_class_70() {
		System.out.println("   + Executing MIPS32_TLTIU_class_tests_70 ...");
		String[] result = MIPS32_TLTIU_class.MIPS32_TLTIU('c', -1946157056).split("->");
		String dir = "symips/jdart/MIPS32_TLTIU_class/";
		String testName = "MIPS32_TLTIU_class_70";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TLTIU_class_71() {
		System.out.println("   + Executing MIPS32_TLTIU_class_tests_71 ...");
		String[] result = MIPS32_TLTIU_class.MIPS32_TLTIU('c', -1912602624).split("->");
		String dir = "symips/jdart/MIPS32_TLTIU_class/";
		String testName = "MIPS32_TLTIU_class_71";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TLTIU_class_72() {
		System.out.println("   + Executing MIPS32_TLTIU_class_tests_72 ...");
		String[] result = MIPS32_TLTIU_class.MIPS32_TLTIU('c', -1879048192).split("->");
		String dir = "symips/jdart/MIPS32_TLTIU_class/";
		String testName = "MIPS32_TLTIU_class_72";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TLTIU_class_73() {
		System.out.println("   + Executing MIPS32_TLTIU_class_tests_73 ...");
		String[] result = MIPS32_TLTIU_class.MIPS32_TLTIU('c', -1845493760).split("->");
		String dir = "symips/jdart/MIPS32_TLTIU_class/";
		String testName = "MIPS32_TLTIU_class_73";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TLTIU_class_74() {
		System.out.println("   + Executing MIPS32_TLTIU_class_tests_74 ...");
		String[] result = MIPS32_TLTIU_class.MIPS32_TLTIU('c', -1811939328).split("->");
		String dir = "symips/jdart/MIPS32_TLTIU_class/";
		String testName = "MIPS32_TLTIU_class_74";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TLTIU_class_75() {
		System.out.println("   + Executing MIPS32_TLTIU_class_tests_75 ...");
		String[] result = MIPS32_TLTIU_class.MIPS32_TLTIU('c', -1778384896).split("->");
		String dir = "symips/jdart/MIPS32_TLTIU_class/";
		String testName = "MIPS32_TLTIU_class_75";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TLTIU_class_76() {
		System.out.println("   + Executing MIPS32_TLTIU_class_tests_76 ...");
		String[] result = MIPS32_TLTIU_class.MIPS32_TLTIU('c', -1744830464).split("->");
		String dir = "symips/jdart/MIPS32_TLTIU_class/";
		String testName = "MIPS32_TLTIU_class_76";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TLTIU_class_77() {
		System.out.println("   + Executing MIPS32_TLTIU_class_tests_77 ...");
		String[] result = MIPS32_TLTIU_class.MIPS32_TLTIU('c', -1711276032).split("->");
		String dir = "symips/jdart/MIPS32_TLTIU_class/";
		String testName = "MIPS32_TLTIU_class_77";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TLTIU_class_78() {
		System.out.println("   + Executing MIPS32_TLTIU_class_tests_78 ...");
		String[] result = MIPS32_TLTIU_class.MIPS32_TLTIU('c', -1677721600).split("->");
		String dir = "symips/jdart/MIPS32_TLTIU_class/";
		String testName = "MIPS32_TLTIU_class_78";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TLTIU_class_79() {
		System.out.println("   + Executing MIPS32_TLTIU_class_tests_79 ...");
		String[] result = MIPS32_TLTIU_class.MIPS32_TLTIU('c', -1644167168).split("->");
		String dir = "symips/jdart/MIPS32_TLTIU_class/";
		String testName = "MIPS32_TLTIU_class_79";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TLTIU_class_80() {
		System.out.println("   + Executing MIPS32_TLTIU_class_tests_80 ...");
		String[] result = MIPS32_TLTIU_class.MIPS32_TLTIU('c', -1610612736).split("->");
		String dir = "symips/jdart/MIPS32_TLTIU_class/";
		String testName = "MIPS32_TLTIU_class_80";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TLTIU_class_81() {
		System.out.println("   + Executing MIPS32_TLTIU_class_tests_81 ...");
		String[] result = MIPS32_TLTIU_class.MIPS32_TLTIU('c', -1577058304).split("->");
		String dir = "symips/jdart/MIPS32_TLTIU_class/";
		String testName = "MIPS32_TLTIU_class_81";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TLTIU_class_82() {
		System.out.println("   + Executing MIPS32_TLTIU_class_tests_82 ...");
		String[] result = MIPS32_TLTIU_class.MIPS32_TLTIU('c', -1543503872).split("->");
		String dir = "symips/jdart/MIPS32_TLTIU_class/";
		String testName = "MIPS32_TLTIU_class_82";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TLTIU_class_83() {
		System.out.println("   + Executing MIPS32_TLTIU_class_tests_83 ...");
		String[] result = MIPS32_TLTIU_class.MIPS32_TLTIU('c', -1509949440).split("->");
		String dir = "symips/jdart/MIPS32_TLTIU_class/";
		String testName = "MIPS32_TLTIU_class_83";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TLTIU_class_84() {
		System.out.println("   + Executing MIPS32_TLTIU_class_tests_84 ...");
		String[] result = MIPS32_TLTIU_class.MIPS32_TLTIU('c', -1476395008).split("->");
		String dir = "symips/jdart/MIPS32_TLTIU_class/";
		String testName = "MIPS32_TLTIU_class_84";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TLTIU_class_85() {
		System.out.println("   + Executing MIPS32_TLTIU_class_tests_85 ...");
		String[] result = MIPS32_TLTIU_class.MIPS32_TLTIU('c', -1442840576).split("->");
		String dir = "symips/jdart/MIPS32_TLTIU_class/";
		String testName = "MIPS32_TLTIU_class_85";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TLTIU_class_86() {
		System.out.println("   + Executing MIPS32_TLTIU_class_tests_86 ...");
		String[] result = MIPS32_TLTIU_class.MIPS32_TLTIU('c', -1409286144).split("->");
		String dir = "symips/jdart/MIPS32_TLTIU_class/";
		String testName = "MIPS32_TLTIU_class_86";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TLTIU_class_87() {
		System.out.println("   + Executing MIPS32_TLTIU_class_tests_87 ...");
		String[] result = MIPS32_TLTIU_class.MIPS32_TLTIU('c', -1375731712).split("->");
		String dir = "symips/jdart/MIPS32_TLTIU_class/";
		String testName = "MIPS32_TLTIU_class_87";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TLTIU_class_88() {
		System.out.println("   + Executing MIPS32_TLTIU_class_tests_88 ...");
		String[] result = MIPS32_TLTIU_class.MIPS32_TLTIU('c', -1342177280).split("->");
		String dir = "symips/jdart/MIPS32_TLTIU_class/";
		String testName = "MIPS32_TLTIU_class_88";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TLTIU_class_89() {
		System.out.println("   + Executing MIPS32_TLTIU_class_tests_89 ...");
		String[] result = MIPS32_TLTIU_class.MIPS32_TLTIU('c', -1308622848).split("->");
		String dir = "symips/jdart/MIPS32_TLTIU_class/";
		String testName = "MIPS32_TLTIU_class_89";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TLTIU_class_90() {
		System.out.println("   + Executing MIPS32_TLTIU_class_tests_90 ...");
		String[] result = MIPS32_TLTIU_class.MIPS32_TLTIU('c', -1275068416).split("->");
		String dir = "symips/jdart/MIPS32_TLTIU_class/";
		String testName = "MIPS32_TLTIU_class_90";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TLTIU_class_91() {
		System.out.println("   + Executing MIPS32_TLTIU_class_tests_91 ...");
		String[] result = MIPS32_TLTIU_class.MIPS32_TLTIU('c', -1241513984).split("->");
		String dir = "symips/jdart/MIPS32_TLTIU_class/";
		String testName = "MIPS32_TLTIU_class_91";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TLTIU_class_92() {
		System.out.println("   + Executing MIPS32_TLTIU_class_tests_92 ...");
		String[] result = MIPS32_TLTIU_class.MIPS32_TLTIU('c', -1207959552).split("->");
		String dir = "symips/jdart/MIPS32_TLTIU_class/";
		String testName = "MIPS32_TLTIU_class_92";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TLTIU_class_93() {
		System.out.println("   + Executing MIPS32_TLTIU_class_tests_93 ...");
		String[] result = MIPS32_TLTIU_class.MIPS32_TLTIU('c', -1174405120).split("->");
		String dir = "symips/jdart/MIPS32_TLTIU_class/";
		String testName = "MIPS32_TLTIU_class_93";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TLTIU_class_94() {
		System.out.println("   + Executing MIPS32_TLTIU_class_tests_94 ...");
		String[] result = MIPS32_TLTIU_class.MIPS32_TLTIU('c', -1140850688).split("->");
		String dir = "symips/jdart/MIPS32_TLTIU_class/";
		String testName = "MIPS32_TLTIU_class_94";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TLTIU_class_95() {
		System.out.println("   + Executing MIPS32_TLTIU_class_tests_95 ...");
		String[] result = MIPS32_TLTIU_class.MIPS32_TLTIU('c', -1107296256).split("->");
		String dir = "symips/jdart/MIPS32_TLTIU_class/";
		String testName = "MIPS32_TLTIU_class_95";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TLTIU_class_96() {
		System.out.println("   + Executing MIPS32_TLTIU_class_tests_96 ...");
		String[] result = MIPS32_TLTIU_class.MIPS32_TLTIU('c', -1073741824).split("->");
		String dir = "symips/jdart/MIPS32_TLTIU_class/";
		String testName = "MIPS32_TLTIU_class_96";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TLTIU_class_97() {
		System.out.println("   + Executing MIPS32_TLTIU_class_tests_97 ...");
		String[] result = MIPS32_TLTIU_class.MIPS32_TLTIU('c', -1040187392).split("->");
		String dir = "symips/jdart/MIPS32_TLTIU_class/";
		String testName = "MIPS32_TLTIU_class_97";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TLTIU_class_98() {
		System.out.println("   + Executing MIPS32_TLTIU_class_tests_98 ...");
		String[] result = MIPS32_TLTIU_class.MIPS32_TLTIU('c', -1006632960).split("->");
		String dir = "symips/jdart/MIPS32_TLTIU_class/";
		String testName = "MIPS32_TLTIU_class_98";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TLTIU_class_99() {
		System.out.println("   + Executing MIPS32_TLTIU_class_tests_99 ...");
		String[] result = MIPS32_TLTIU_class.MIPS32_TLTIU('c', -973078528).split("->");
		String dir = "symips/jdart/MIPS32_TLTIU_class/";
		String testName = "MIPS32_TLTIU_class_99";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TLTIU_class_100() {
		System.out.println("   + Executing MIPS32_TLTIU_class_tests_100 ...");
		String[] result = MIPS32_TLTIU_class.MIPS32_TLTIU('c', -939524096).split("->");
		String dir = "symips/jdart/MIPS32_TLTIU_class/";
		String testName = "MIPS32_TLTIU_class_100";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TLTIU_class_101() {
		System.out.println("   + Executing MIPS32_TLTIU_class_tests_101 ...");
		String[] result = MIPS32_TLTIU_class.MIPS32_TLTIU('c', -905969664).split("->");
		String dir = "symips/jdart/MIPS32_TLTIU_class/";
		String testName = "MIPS32_TLTIU_class_101";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TLTIU_class_102() {
		System.out.println("   + Executing MIPS32_TLTIU_class_tests_102 ...");
		String[] result = MIPS32_TLTIU_class.MIPS32_TLTIU('c', -872415232).split("->");
		String dir = "symips/jdart/MIPS32_TLTIU_class/";
		String testName = "MIPS32_TLTIU_class_102";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TLTIU_class_103() {
		System.out.println("   + Executing MIPS32_TLTIU_class_tests_103 ...");
		String[] result = MIPS32_TLTIU_class.MIPS32_TLTIU('c', -838860800).split("->");
		String dir = "symips/jdart/MIPS32_TLTIU_class/";
		String testName = "MIPS32_TLTIU_class_103";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TLTIU_class_104() {
		System.out.println("   + Executing MIPS32_TLTIU_class_tests_104 ...");
		String[] result = MIPS32_TLTIU_class.MIPS32_TLTIU('c', -805306368).split("->");
		String dir = "symips/jdart/MIPS32_TLTIU_class/";
		String testName = "MIPS32_TLTIU_class_104";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TLTIU_class_105() {
		System.out.println("   + Executing MIPS32_TLTIU_class_tests_105 ...");
		String[] result = MIPS32_TLTIU_class.MIPS32_TLTIU('c', -771751936).split("->");
		String dir = "symips/jdart/MIPS32_TLTIU_class/";
		String testName = "MIPS32_TLTIU_class_105";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TLTIU_class_106() {
		System.out.println("   + Executing MIPS32_TLTIU_class_tests_106 ...");
		String[] result = MIPS32_TLTIU_class.MIPS32_TLTIU('c', -738197504).split("->");
		String dir = "symips/jdart/MIPS32_TLTIU_class/";
		String testName = "MIPS32_TLTIU_class_106";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TLTIU_class_107() {
		System.out.println("   + Executing MIPS32_TLTIU_class_tests_107 ...");
		String[] result = MIPS32_TLTIU_class.MIPS32_TLTIU('c', -704643072).split("->");
		String dir = "symips/jdart/MIPS32_TLTIU_class/";
		String testName = "MIPS32_TLTIU_class_107";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TLTIU_class_108() {
		System.out.println("   + Executing MIPS32_TLTIU_class_tests_108 ...");
		String[] result = MIPS32_TLTIU_class.MIPS32_TLTIU('c', -671088640).split("->");
		String dir = "symips/jdart/MIPS32_TLTIU_class/";
		String testName = "MIPS32_TLTIU_class_108";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TLTIU_class_109() {
		System.out.println("   + Executing MIPS32_TLTIU_class_tests_109 ...");
		String[] result = MIPS32_TLTIU_class.MIPS32_TLTIU('c', -637534208).split("->");
		String dir = "symips/jdart/MIPS32_TLTIU_class/";
		String testName = "MIPS32_TLTIU_class_109";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TLTIU_class_110() {
		System.out.println("   + Executing MIPS32_TLTIU_class_tests_110 ...");
		String[] result = MIPS32_TLTIU_class.MIPS32_TLTIU('c', -603979776).split("->");
		String dir = "symips/jdart/MIPS32_TLTIU_class/";
		String testName = "MIPS32_TLTIU_class_110";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TLTIU_class_111() {
		System.out.println("   + Executing MIPS32_TLTIU_class_tests_111 ...");
		String[] result = MIPS32_TLTIU_class.MIPS32_TLTIU('c', -570425344).split("->");
		String dir = "symips/jdart/MIPS32_TLTIU_class/";
		String testName = "MIPS32_TLTIU_class_111";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TLTIU_class_112() {
		System.out.println("   + Executing MIPS32_TLTIU_class_tests_112 ...");
		String[] result = MIPS32_TLTIU_class.MIPS32_TLTIU('c', -536870912).split("->");
		String dir = "symips/jdart/MIPS32_TLTIU_class/";
		String testName = "MIPS32_TLTIU_class_112";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TLTIU_class_113() {
		System.out.println("   + Executing MIPS32_TLTIU_class_tests_113 ...");
		String[] result = MIPS32_TLTIU_class.MIPS32_TLTIU('c', -503316480).split("->");
		String dir = "symips/jdart/MIPS32_TLTIU_class/";
		String testName = "MIPS32_TLTIU_class_113";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TLTIU_class_114() {
		System.out.println("   + Executing MIPS32_TLTIU_class_tests_114 ...");
		String[] result = MIPS32_TLTIU_class.MIPS32_TLTIU('c', -469762048).split("->");
		String dir = "symips/jdart/MIPS32_TLTIU_class/";
		String testName = "MIPS32_TLTIU_class_114";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TLTIU_class_115() {
		System.out.println("   + Executing MIPS32_TLTIU_class_tests_115 ...");
		String[] result = MIPS32_TLTIU_class.MIPS32_TLTIU('c', -436207616).split("->");
		String dir = "symips/jdart/MIPS32_TLTIU_class/";
		String testName = "MIPS32_TLTIU_class_115";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TLTIU_class_116() {
		System.out.println("   + Executing MIPS32_TLTIU_class_tests_116 ...");
		String[] result = MIPS32_TLTIU_class.MIPS32_TLTIU('c', -402653184).split("->");
		String dir = "symips/jdart/MIPS32_TLTIU_class/";
		String testName = "MIPS32_TLTIU_class_116";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TLTIU_class_117() {
		System.out.println("   + Executing MIPS32_TLTIU_class_tests_117 ...");
		String[] result = MIPS32_TLTIU_class.MIPS32_TLTIU('c', -369098752).split("->");
		String dir = "symips/jdart/MIPS32_TLTIU_class/";
		String testName = "MIPS32_TLTIU_class_117";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TLTIU_class_118() {
		System.out.println("   + Executing MIPS32_TLTIU_class_tests_118 ...");
		String[] result = MIPS32_TLTIU_class.MIPS32_TLTIU('c', -335544320).split("->");
		String dir = "symips/jdart/MIPS32_TLTIU_class/";
		String testName = "MIPS32_TLTIU_class_118";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TLTIU_class_119() {
		System.out.println("   + Executing MIPS32_TLTIU_class_tests_119 ...");
		String[] result = MIPS32_TLTIU_class.MIPS32_TLTIU('c', -301989888).split("->");
		String dir = "symips/jdart/MIPS32_TLTIU_class/";
		String testName = "MIPS32_TLTIU_class_119";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TLTIU_class_120() {
		System.out.println("   + Executing MIPS32_TLTIU_class_tests_120 ...");
		String[] result = MIPS32_TLTIU_class.MIPS32_TLTIU('c', -268435456).split("->");
		String dir = "symips/jdart/MIPS32_TLTIU_class/";
		String testName = "MIPS32_TLTIU_class_120";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TLTIU_class_121() {
		System.out.println("   + Executing MIPS32_TLTIU_class_tests_121 ...");
		String[] result = MIPS32_TLTIU_class.MIPS32_TLTIU('c', -234881024).split("->");
		String dir = "symips/jdart/MIPS32_TLTIU_class/";
		String testName = "MIPS32_TLTIU_class_121";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TLTIU_class_122() {
		System.out.println("   + Executing MIPS32_TLTIU_class_tests_122 ...");
		String[] result = MIPS32_TLTIU_class.MIPS32_TLTIU('c', -201326592).split("->");
		String dir = "symips/jdart/MIPS32_TLTIU_class/";
		String testName = "MIPS32_TLTIU_class_122";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TLTIU_class_123() {
		System.out.println("   + Executing MIPS32_TLTIU_class_tests_123 ...");
		String[] result = MIPS32_TLTIU_class.MIPS32_TLTIU('c', -167772160).split("->");
		String dir = "symips/jdart/MIPS32_TLTIU_class/";
		String testName = "MIPS32_TLTIU_class_123";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TLTIU_class_124() {
		System.out.println("   + Executing MIPS32_TLTIU_class_tests_124 ...");
		String[] result = MIPS32_TLTIU_class.MIPS32_TLTIU('c', -134217728).split("->");
		String dir = "symips/jdart/MIPS32_TLTIU_class/";
		String testName = "MIPS32_TLTIU_class_124";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TLTIU_class_125() {
		System.out.println("   + Executing MIPS32_TLTIU_class_tests_125 ...");
		String[] result = MIPS32_TLTIU_class.MIPS32_TLTIU('c', -100663296).split("->");
		String dir = "symips/jdart/MIPS32_TLTIU_class/";
		String testName = "MIPS32_TLTIU_class_125";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TLTIU_class_126() {
		System.out.println("   + Executing MIPS32_TLTIU_class_tests_126 ...");
		String[] result = MIPS32_TLTIU_class.MIPS32_TLTIU('c', -67108864).split("->");
		String dir = "symips/jdart/MIPS32_TLTIU_class/";
		String testName = "MIPS32_TLTIU_class_126";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TLTIU_class_127() {
		System.out.println("   + Executing MIPS32_TLTIU_class_tests_127 ...");
		String[] result = MIPS32_TLTIU_class.MIPS32_TLTIU('c', -33554432).split("->");
		String dir = "symips/jdart/MIPS32_TLTIU_class/";
		String testName = "MIPS32_TLTIU_class_127";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TLTIU_class_128() {
		System.out.println("   + Executing MIPS32_TLTIU_class_tests_128 ...");
		String[] result = MIPS32_TLTIU_class.MIPS32_TLTIU('c', 0).split("->");
		String dir = "symips/jdart/MIPS32_TLTIU_class/";
		String testName = "MIPS32_TLTIU_class_128";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ANDI_class_0() {
		System.out.println("   + Executing microMIPS_ANDI_class_tests_0 ...");
		String[] result = microMIPS_ANDI_class.microMIPS_ANDI('n', '0', 4).split("->");
		String dir = "symips/jdart/microMIPS_ANDI_class/";
		String testName = "microMIPS_ANDI_class_0";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ANDI_class_1() {
		System.out.println("   + Executing microMIPS_ANDI_class_tests_1 ...");
		String[] result = microMIPS_ANDI_class.microMIPS_ANDI('n', 'i', 368).split("->");
		String dir = "symips/jdart/microMIPS_ANDI_class/";
		String testName = "microMIPS_ANDI_class_1";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ANDI_class_2() {
		System.out.println("   + Executing microMIPS_ANDI_class_tests_2 ...");
		String[] result = microMIPS_ANDI_class.microMIPS_ANDI('n', '0', 0).split("->");
		String dir = "symips/jdart/microMIPS_ANDI_class/";
		String testName = "microMIPS_ANDI_class_2";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TGE_class_0() {
		System.out.println("   + Executing MIPS32_TGE_class_tests_0 ...");
		String[] result = MIPS32_TGE_class.MIPS32_TGE('4', 'b').split("->");
		String dir = "symips/jdart/MIPS32_TGE_class/";
		String testName = "MIPS32_TGE_class_0";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_NOR_class_0() {
		System.out.println("   + Executing MIPS32_NOR_class_tests_0 ...");
		String[] result = MIPS32_NOR_class.MIPS32_NOR('g', 'k', 'e').split("->");
		String dir = "symips/jdart/MIPS32_NOR_class/";
		String testName = "MIPS32_NOR_class_0";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TEQI_class_0() {
		System.out.println("   + Executing MIPS32_TEQI_class_tests_0 ...");
		String[] result = MIPS32_TEQI_class.MIPS32_TEQI('7', 186).split("->");
		String dir = "symips/jdart/MIPS32_TEQI_class/";
		String testName = "MIPS32_TEQI_class_0";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TEQI_class_1() {
		System.out.println("   + Executing MIPS32_TEQI_class_tests_1 ...");
		String[] result = MIPS32_TEQI_class.MIPS32_TEQI('7', 482).split("->");
		String dir = "symips/jdart/MIPS32_TEQI_class/";
		String testName = "MIPS32_TEQI_class_1";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TEQI_class_2() {
		System.out.println("   + Executing MIPS32_TEQI_class_tests_2 ...");
		String[] result = MIPS32_TEQI_class.MIPS32_TEQI('7', 0).split("->");
		String dir = "symips/jdart/MIPS32_TEQI_class/";
		String testName = "MIPS32_TEQI_class_2";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_SUB_class_0() {
		System.out.println("   + Executing MIPS32_SUB_class_tests_0 ...");
		String[] result = MIPS32_SUB_class.MIPS32_SUB('5', '1', 'p').split("->");
		String dir = "symips/jdart/MIPS32_SUB_class/";
		String testName = "MIPS32_SUB_class_0";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_CLZ_class_0() {
		System.out.println("   + Executing microMIPS_CLZ_class_tests_0 ...");
		String[] result = microMIPS_CLZ_class.microMIPS_CLZ('e', 'j').split("->");
		String dir = "symips/jdart/microMIPS_CLZ_class/";
		String testName = "microMIPS_CLZ_class_0";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_CLZ_class_0() {
		System.out.println("   + Executing MIPS32_CLZ_class_tests_0 ...");
		String[] result = MIPS32_CLZ_class.MIPS32_CLZ('d', '8').split("->");
		String dir = "symips/jdart/MIPS32_CLZ_class/";
		String testName = "MIPS32_CLZ_class_0";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_SUB_class_0() {
		System.out.println("   + Executing microMIPS_SUB_class_tests_0 ...");
		String[] result = microMIPS_SUB_class.microMIPS_SUB('i', 'k', '7').split("->");
		String dir = "symips/jdart/microMIPS_SUB_class/";
		String testName = "microMIPS_SUB_class_0";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_SRL_class_0() {
		System.out.println("   + Executing MIPS32_SRL_class_tests_0 ...");
		String[] result = MIPS32_SRL_class.MIPS32_SRL('o', '8', 99).split("->");
		String dir = "symips/jdart/MIPS32_SRL_class/";
		String testName = "MIPS32_SRL_class_0";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_SEB_class_0() {
		System.out.println("   + Executing MIPS32_SEB_class_tests_0 ...");
		String[] result = MIPS32_SEB_class.MIPS32_SEB('o', 'j').split("->");
		String dir = "symips/jdart/MIPS32_SEB_class/";
		String testName = "MIPS32_SEB_class_0";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_AUIPC_class_0() {
		System.out.println("   + Executing microMIPS_AUIPC_class_tests_0 ...");
		String[] result = microMIPS_AUIPC_class.microMIPS_AUIPC('4', 275).split("->");
		String dir = "symips/jdart/microMIPS_AUIPC_class/";
		String testName = "microMIPS_AUIPC_class_0";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_AUIPC_class_1() {
		System.out.println("   + Executing microMIPS_AUIPC_class_tests_1 ...");
		String[] result = microMIPS_AUIPC_class.microMIPS_AUIPC('0', 0).split("->");
		String dir = "symips/jdart/microMIPS_AUIPC_class/";
		String testName = "microMIPS_AUIPC_class_1";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_MADD_class_0() {
		System.out.println("   + Executing MIPS32_MADD_class_tests_0 ...");
		String[] result = MIPS32_MADD_class.MIPS32_MADD('k', 'f').split("->");
		String dir = "symips/jdart/MIPS32_MADD_class/";
		String testName = "MIPS32_MADD_class_0";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TEQ_class_0() {
		System.out.println("   + Executing MIPS32_TEQ_class_tests_0 ...");
		String[] result = MIPS32_TEQ_class.MIPS32_TEQ('r', '3').split("->");
		String dir = "symips/jdart/MIPS32_TEQ_class/";
		String testName = "MIPS32_TEQ_class_0";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_CLO_class_0() {
		System.out.println("   + Executing MIPS32_CLO_class_tests_0 ...");
		String[] result = MIPS32_CLO_class.MIPS32_CLO('n', 'a').split("->");
		String dir = "symips/jdart/MIPS32_CLO_class/";
		String testName = "MIPS32_CLO_class_0";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_SLTI_class_0() {
		System.out.println("   + Executing MIPS32_SLTI_class_tests_0 ...");
		String[] result = MIPS32_SLTI_class.MIPS32_SLTI('a', 'h', 875).split("->");
		String dir = "symips/jdart/MIPS32_SLTI_class/";
		String testName = "MIPS32_SLTI_class_0";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_SLTI_class_1() {
		System.out.println("   + Executing MIPS32_SLTI_class_tests_1 ...");
		String[] result = MIPS32_SLTI_class.MIPS32_SLTI('a', '0', 0).split("->");
		String dir = "symips/jdart/MIPS32_SLTI_class/";
		String testName = "MIPS32_SLTI_class_1";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_ANDI_class_0() {
		System.out.println("   + Executing MIPS32_ANDI_class_tests_0 ...");
		String[] result = MIPS32_ANDI_class.MIPS32_ANDI('j', '0', 64).split("->");
		String dir = "symips/jdart/MIPS32_ANDI_class/";
		String testName = "MIPS32_ANDI_class_0";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_ANDI_class_1() {
		System.out.println("   + Executing MIPS32_ANDI_class_tests_1 ...");
		String[] result = MIPS32_ANDI_class.MIPS32_ANDI('j', '0', 2).split("->");
		String dir = "symips/jdart/MIPS32_ANDI_class/";
		String testName = "MIPS32_ANDI_class_1";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_ANDI_class_2() {
		System.out.println("   + Executing MIPS32_ANDI_class_tests_2 ...");
		String[] result = MIPS32_ANDI_class.MIPS32_ANDI('j', 'p', 661).split("->");
		String dir = "symips/jdart/MIPS32_ANDI_class/";
		String testName = "MIPS32_ANDI_class_2";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_ANDI_class_3() {
		System.out.println("   + Executing MIPS32_ANDI_class_tests_3 ...");
		String[] result = MIPS32_ANDI_class.MIPS32_ANDI('j', '0', 0).split("->");
		String dir = "symips/jdart/MIPS32_ANDI_class/";
		String testName = "MIPS32_ANDI_class_3";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_TLT_class_0() {
		System.out.println("   + Executing microMIPS_TLT_class_tests_0 ...");
		String[] result = microMIPS_TLT_class.microMIPS_TLT('n', '1').split("->");
		String dir = "symips/jdart/microMIPS_TLT_class/";
		String testName = "microMIPS_TLT_class_0";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUR2_class_0() {
		System.out.println("   + Executing microMIPS_ADDIUR2_class_tests_0 ...");
		String[] result = microMIPS_ADDIUR2_class.microMIPS_ADDIUR2('6', 'a', 51).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUR2_class/";
		String testName = "microMIPS_ADDIUR2_class_0";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUR2_class_1() {
		System.out.println("   + Executing microMIPS_ADDIUR2_class_tests_1 ...");
		String[] result = microMIPS_ADDIUR2_class.microMIPS_ADDIUR2('0', 'a', 0).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUR2_class/";
		String testName = "microMIPS_ADDIUR2_class_1";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_SUBU_class_0() {
		System.out.println("   + Executing microMIPS_SUBU_class_tests_0 ...");
		String[] result = microMIPS_SUBU_class.microMIPS_SUBU('8', '3', 'l').split("->");
		String dir = "symips/jdart/microMIPS_SUBU_class/";
		String testName = "microMIPS_SUBU_class_0";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ROTR_class_0() {
		System.out.println("   + Executing microMIPS_ROTR_class_tests_0 ...");
		String[] result = microMIPS_ROTR_class.microMIPS_ROTR('j', 'g', 583).split("->");
		String dir = "symips/jdart/microMIPS_ROTR_class/";
		String testName = "microMIPS_ROTR_class_0";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_AND16_class_0() {
		System.out.println("   + Executing microMIPS_AND16_class_tests_0 ...");
		String[] result = microMIPS_AND16_class.microMIPS_AND16('3', 'l').split("->");
		String dir = "symips/jdart/microMIPS_AND16_class/";
		String testName = "microMIPS_AND16_class_0";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TLT_class_0() {
		System.out.println("   + Executing MIPS32_TLT_class_tests_0 ...");
		String[] result = MIPS32_TLT_class.MIPS32_TLT('6', 'k').split("->");
		String dir = "symips/jdart/MIPS32_TLT_class/";
		String testName = "MIPS32_TLT_class_0";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_SEH_class_0() {
		System.out.println("   + Executing microMIPS_SEH_class_tests_0 ...");
		String[] result = microMIPS_SEH_class.microMIPS_SEH('c', 'f').split("->");
		String dir = "symips/jdart/microMIPS_SEH_class/";
		String testName = "microMIPS_SEH_class_0";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_SRLV_class_0() {
		System.out.println("   + Executing MIPS32_SRLV_class_tests_0 ...");
		String[] result = MIPS32_SRLV_class.MIPS32_SRLV('i', '4', 'i').split("->");
		String dir = "symips/jdart/MIPS32_SRLV_class/";
		String testName = "MIPS32_SRLV_class_0";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDU_class_0() {
		System.out.println("   + Executing microMIPS_ADDU_class_tests_0 ...");
		String[] result = microMIPS_ADDU_class.microMIPS_ADDU('h', 'r', 'd').split("->");
		String dir = "symips/jdart/microMIPS_ADDU_class/";
		String testName = "microMIPS_ADDU_class_0";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_MSUBU_class_0() {
		System.out.println("   + Executing MIPS32_MSUBU_class_tests_0 ...");
		String[] result = MIPS32_MSUBU_class.MIPS32_MSUBU('7', '7').split("->");
		String dir = "symips/jdart/MIPS32_MSUBU_class/";
		String testName = "MIPS32_MSUBU_class_0";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_CLO_class_0() {
		System.out.println("   + Executing microMIPS_CLO_class_tests_0 ...");
		String[] result = microMIPS_CLO_class.microMIPS_CLO('3', 'p').split("->");
		String dir = "symips/jdart/microMIPS_CLO_class/";
		String testName = "microMIPS_CLO_class_0";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_MFLO_class_0() {
		System.out.println("   + Executing MIPS32_MFLO_class_tests_0 ...");
		String[] result = MIPS32_MFLO_class.MIPS32_MFLO('5').split("->");
		String dir = "symips/jdart/MIPS32_MFLO_class/";
		String testName = "MIPS32_MFLO_class_0";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_MOVEP_class_0() {
		System.out.println("   + Executing microMIPS_MOVEP_class_tests_0 ...");
		String[] result = microMIPS_MOVEP_class.microMIPS_MOVEP('p', '9', '3', 'c').split("->");
		String dir = "symips/jdart/microMIPS_MOVEP_class/";
		String testName = "microMIPS_MOVEP_class_0";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_MULU_class_0() {
		System.out.println("   + Executing microMIPS_MULU_class_tests_0 ...");
		String[] result = microMIPS_MULU_class.microMIPS_MULU('0', '9', 'c').split("->");
		String dir = "symips/jdart/microMIPS_MULU_class/";
		String testName = "microMIPS_MULU_class_0";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_MULU_class_1() {
		System.out.println("   + Executing microMIPS_MULU_class_tests_1 ...");
		String[] result = microMIPS_MULU_class.microMIPS_MULU('r', '9', 'c').split("->");
		String dir = "symips/jdart/microMIPS_MULU_class/";
		String testName = "microMIPS_MULU_class_1";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_MTHI_class_0() {
		System.out.println("   + Executing MIPS32_MTHI_class_tests_0 ...");
		String[] result = MIPS32_MTHI_class.MIPS32_MTHI('c').split("->");
		String dir = "symips/jdart/MIPS32_MTHI_class/";
		String testName = "MIPS32_MTHI_class_0";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_SUBU_class_0() {
		System.out.println("   + Executing MIPS32_SUBU_class_tests_0 ...");
		String[] result = MIPS32_SUBU_class.MIPS32_SUBU('3', 'j', 'b').split("->");
		String dir = "symips/jdart/MIPS32_SUBU_class/";
		String testName = "MIPS32_SUBU_class_0";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_MOD_class_0() {
		System.out.println("   + Executing microMIPS_MOD_class_tests_0 ...");
		String[] result = microMIPS_MOD_class.microMIPS_MOD('o', 'k', 'd').split("->");
		String dir = "symips/jdart/microMIPS_MOD_class/";
		String testName = "microMIPS_MOD_class_0";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_SLTIU_class_0() {
		System.out.println("   + Executing microMIPS_SLTIU_class_tests_0 ...");
		String[] result = microMIPS_SLTIU_class.microMIPS_SLTIU('g', '8', 871).split("->");
		String dir = "symips/jdart/microMIPS_SLTIU_class/";
		String testName = "microMIPS_SLTIU_class_0";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_SLTIU_class_1() {
		System.out.println("   + Executing microMIPS_SLTIU_class_tests_1 ...");
		String[] result = microMIPS_SLTIU_class.microMIPS_SLTIU('g', '0', 0).split("->");
		String dir = "symips/jdart/microMIPS_SLTIU_class/";
		String testName = "microMIPS_SLTIU_class_1";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_TGEU_class_0() {
		System.out.println("   + Executing microMIPS_TGEU_class_tests_0 ...");
		String[] result = microMIPS_TGEU_class.microMIPS_TGEU('9', 'r').split("->");
		String dir = "symips/jdart/microMIPS_TGEU_class/";
		String testName = "microMIPS_TGEU_class_0";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_MSUB_class_0() {
		System.out.println("   + Executing MIPS32_MSUB_class_tests_0 ...");
		String[] result = MIPS32_MSUB_class.MIPS32_MSUB('e', 'k').split("->");
		String dir = "symips/jdart/MIPS32_MSUB_class/";
		String testName = "MIPS32_MSUB_class_0";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_0() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_0 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(4).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_0";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_1() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_1 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(128).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_1";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_2() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_2 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(349).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_2";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_3() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_3 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(384).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_3";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_4() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_4 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(516).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_4";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_5() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_5 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(644).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_5";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_6() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_6 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(772).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_6";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_7() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_7 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(900).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_7";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_8() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_8 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16841601).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_8";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_9() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_9 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16841473).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_9";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_10() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_10 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16841345).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_10";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_11() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_11 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16841217).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_11";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_12() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_12 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(1540).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_12";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_13() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_13 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(1668).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_13";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_14() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_14 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(1796).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_14";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_15() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_15 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(1924).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_15";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_16() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_16 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16840577).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_16";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_17() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_17 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16840449).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_17";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_18() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_18 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16840321).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_18";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_19() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_19 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16840193).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_19";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_20() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_20 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16840065).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_20";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_21() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_21 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16839937).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_21";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_22() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_22 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16839809).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_22";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_23() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_23 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16839681).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_23";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_24() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_24 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16839553).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_24";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_25() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_25 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16839425).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_25";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_26() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_26 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16839297).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_26";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_27() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_27 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16839169).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_27";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_28() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_28 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16839041).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_28";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_29() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_29 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16838913).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_29";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_30() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_30 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16838785).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_30";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_31() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_31 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16838657).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_31";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_32() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_32 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16838529).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_32";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_33() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_33 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16838401).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_33";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_34() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_34 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16838273).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_34";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_35() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_35 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16838145).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_35";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_36() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_36 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16838017).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_36";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_37() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_37 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16837889).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_37";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_38() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_38 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16837761).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_38";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_39() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_39 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16837633).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_39";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_40() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_40 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16837505).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_40";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_41() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_41 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16837377).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_41";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_42() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_42 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16837249).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_42";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_43() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_43 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16837121).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_43";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_44() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_44 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16836993).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_44";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_45() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_45 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16836865).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_45";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_46() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_46 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16836737).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_46";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_47() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_47 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16836609).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_47";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_48() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_48 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16836481).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_48";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_49() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_49 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16836353).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_49";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_50() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_50 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16836225).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_50";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_51() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_51 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16836097).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_51";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_52() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_52 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16835969).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_52";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_53() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_53 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16835841).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_53";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_54() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_54 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16835713).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_54";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_55() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_55 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16835585).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_55";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_56() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_56 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16835457).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_56";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_57() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_57 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16835329).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_57";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_58() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_58 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16835201).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_58";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_59() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_59 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16835073).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_59";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_60() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_60 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16834945).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_60";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_61() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_61 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16834817).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_61";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_62() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_62 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16834689).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_62";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_63() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_63 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16834561).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_63";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_64() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_64 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16834433).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_64";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_65() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_65 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16834305).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_65";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_66() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_66 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16834177).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_66";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_67() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_67 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16834049).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_67";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_68() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_68 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16833921).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_68";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_69() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_69 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16833793).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_69";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_70() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_70 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16833665).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_70";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_71() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_71 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16833537).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_71";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_72() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_72 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16833409).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_72";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_73() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_73 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16833281).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_73";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_74() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_74 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16833153).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_74";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_75() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_75 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16833025).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_75";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_76() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_76 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16832897).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_76";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_77() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_77 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16832769).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_77";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_78() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_78 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16832641).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_78";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_79() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_79 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16832513).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_79";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_80() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_80 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16832385).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_80";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_81() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_81 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16832257).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_81";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_82() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_82 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16832129).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_82";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_83() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_83 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16832001).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_83";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_84() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_84 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16831873).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_84";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_85() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_85 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16831745).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_85";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_86() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_86 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16831617).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_86";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_87() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_87 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16831489).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_87";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_88() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_88 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16831361).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_88";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_89() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_89 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16831233).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_89";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_90() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_90 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16831105).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_90";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_91() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_91 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16830977).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_91";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_92() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_92 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16830849).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_92";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_93() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_93 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16830721).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_93";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_94() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_94 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16830593).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_94";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_95() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_95 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16830465).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_95";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_96() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_96 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16830337).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_96";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_97() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_97 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16830209).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_97";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_98() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_98 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16830081).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_98";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_99() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_99 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16829953).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_99";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_100() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_100 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16829825).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_100";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_101() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_101 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16829697).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_101";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_102() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_102 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16829569).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_102";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_103() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_103 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16829441).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_103";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_104() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_104 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16829313).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_104";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_105() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_105 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16829185).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_105";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_106() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_106 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16829057).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_106";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_107() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_107 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16828929).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_107";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_108() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_108 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16828801).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_108";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_109() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_109 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16828673).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_109";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_110() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_110 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16828545).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_110";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_111() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_111 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16828417).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_111";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_112() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_112 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16828289).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_112";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_113() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_113 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16828161).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_113";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_114() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_114 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16828033).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_114";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_115() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_115 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16827905).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_115";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_116() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_116 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16827777).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_116";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_117() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_117 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16827649).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_117";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_118() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_118 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16827521).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_118";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_119() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_119 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16827393).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_119";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_120() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_120 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16827265).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_120";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_121() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_121 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16827137).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_121";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_122() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_122 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16827009).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_122";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_123() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_123 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16826881).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_123";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_124() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_124 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16826753).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_124";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_125() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_125 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16826625).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_125";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_126() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_126 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16826497).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_126";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_127() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_127 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16826369).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_127";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_128() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_128 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16826241).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_128";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_129() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_129 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16826113).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_129";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_130() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_130 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16825985).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_130";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_131() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_131 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16825857).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_131";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_132() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_132 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16825729).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_132";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_133() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_133 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16825601).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_133";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_134() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_134 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16825473).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_134";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_135() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_135 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16825345).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_135";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_136() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_136 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16825217).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_136";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_137() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_137 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16825089).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_137";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_138() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_138 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16824961).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_138";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_139() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_139 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16824833).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_139";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_140() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_140 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16824705).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_140";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_141() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_141 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16824577).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_141";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_142() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_142 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16824449).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_142";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_143() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_143 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16824321).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_143";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_144() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_144 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16824193).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_144";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_145() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_145 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16824065).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_145";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_146() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_146 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16823937).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_146";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_147() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_147 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16823809).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_147";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_148() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_148 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16823681).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_148";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_149() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_149 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16823553).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_149";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_150() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_150 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16823425).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_150";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_151() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_151 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16823297).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_151";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_152() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_152 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16823169).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_152";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_153() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_153 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16823041).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_153";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_154() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_154 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16822913).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_154";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_155() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_155 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16822785).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_155";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_156() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_156 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16822657).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_156";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_157() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_157 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16822529).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_157";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_158() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_158 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16822401).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_158";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_159() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_159 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16822273).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_159";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_160() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_160 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16822145).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_160";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_161() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_161 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16822017).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_161";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_162() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_162 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16821889).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_162";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_163() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_163 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16821761).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_163";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_164() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_164 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16821633).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_164";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_165() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_165 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16821505).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_165";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_166() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_166 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16821377).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_166";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_167() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_167 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16821249).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_167";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_168() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_168 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16821121).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_168";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_169() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_169 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16820993).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_169";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_170() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_170 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16820865).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_170";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_171() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_171 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16820737).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_171";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_172() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_172 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16820609).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_172";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_173() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_173 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16820481).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_173";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_174() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_174 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16820353).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_174";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_175() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_175 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16820225).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_175";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_176() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_176 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16820097).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_176";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_177() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_177 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16819969).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_177";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_178() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_178 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16819841).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_178";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_179() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_179 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16819713).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_179";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_180() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_180 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16819585).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_180";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_181() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_181 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16819457).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_181";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_182() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_182 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16819329).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_182";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_183() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_183 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16819201).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_183";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_184() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_184 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16819073).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_184";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_185() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_185 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16818945).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_185";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_186() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_186 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16818817).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_186";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_187() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_187 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16818689).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_187";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_188() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_188 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16818561).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_188";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_189() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_189 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16818433).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_189";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_190() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_190 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16818305).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_190";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_191() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_191 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16818177).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_191";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_192() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_192 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16818049).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_192";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_193() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_193 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16817921).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_193";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_194() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_194 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16817793).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_194";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_195() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_195 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16817665).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_195";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_196() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_196 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16817537).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_196";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_197() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_197 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16817409).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_197";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_198() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_198 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16817281).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_198";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_199() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_199 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16817153).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_199";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_200() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_200 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16817025).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_200";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_201() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_201 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16816897).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_201";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_202() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_202 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16816769).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_202";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_203() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_203 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16816641).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_203";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_204() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_204 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16816513).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_204";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_205() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_205 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16816385).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_205";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_206() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_206 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16816257).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_206";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_207() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_207 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16816129).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_207";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_208() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_208 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16816001).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_208";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_209() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_209 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16815873).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_209";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_210() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_210 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16815745).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_210";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_211() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_211 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16815617).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_211";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_212() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_212 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16815489).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_212";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_213() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_213 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16815361).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_213";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_214() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_214 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16815233).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_214";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_215() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_215 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16815105).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_215";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_216() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_216 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16814977).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_216";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_217() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_217 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16814849).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_217";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_218() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_218 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16814721).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_218";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_219() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_219 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16814593).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_219";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_220() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_220 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16814465).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_220";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_221() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_221 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16814337).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_221";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_222() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_222 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16814209).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_222";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_223() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_223 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16814081).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_223";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_224() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_224 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16813953).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_224";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_225() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_225 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16813825).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_225";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_226() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_226 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16813697).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_226";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_227() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_227 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16813569).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_227";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_228() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_228 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16813441).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_228";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_229() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_229 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16813313).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_229";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_230() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_230 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16813185).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_230";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_231() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_231 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16813057).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_231";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_232() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_232 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16812929).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_232";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_233() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_233 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16812801).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_233";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_234() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_234 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16812673).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_234";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_235() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_235 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16812545).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_235";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_236() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_236 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16812417).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_236";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_237() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_237 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16812289).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_237";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_238() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_238 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16812161).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_238";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_239() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_239 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16812033).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_239";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_240() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_240 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16811905).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_240";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_241() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_241 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16811777).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_241";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_242() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_242 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16811649).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_242";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_243() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_243 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16811521).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_243";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_244() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_244 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16811393).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_244";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_245() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_245 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16811265).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_245";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_246() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_246 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16811137).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_246";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_247() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_247 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16811009).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_247";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_248() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_248 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16810881).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_248";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_249() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_249 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16810753).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_249";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_250() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_250 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16810625).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_250";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_251() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_251 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16810497).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_251";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_252() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_252 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16810369).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_252";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_253() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_253 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16810241).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_253";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_254() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_254 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16810113).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_254";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_255() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_255 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16809985).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_255";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_256() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_256 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16809857).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_256";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_257() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_257 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16809729).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_257";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_258() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_258 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16809601).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_258";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_259() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_259 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16809473).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_259";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_260() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_260 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16809345).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_260";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_261() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_261 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16809217).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_261";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_262() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_262 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16809089).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_262";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_263() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_263 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16808961).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_263";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_264() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_264 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16808833).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_264";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_265() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_265 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16808705).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_265";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_266() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_266 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16808577).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_266";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_267() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_267 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16808449).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_267";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_268() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_268 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16808321).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_268";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_269() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_269 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16808193).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_269";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_270() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_270 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16808065).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_270";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_271() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_271 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16807937).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_271";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_272() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_272 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16807809).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_272";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_273() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_273 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16807681).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_273";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_274() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_274 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16807553).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_274";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_275() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_275 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16807425).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_275";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_276() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_276 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16807297).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_276";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_277() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_277 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16807169).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_277";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_278() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_278 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16807041).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_278";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_279() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_279 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16806913).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_279";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_280() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_280 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16806785).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_280";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_281() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_281 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16806657).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_281";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_282() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_282 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16806529).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_282";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_283() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_283 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16806401).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_283";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_284() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_284 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16806273).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_284";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_285() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_285 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16806145).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_285";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_286() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_286 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16806017).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_286";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_287() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_287 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16805889).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_287";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_288() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_288 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16805761).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_288";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_289() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_289 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16805633).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_289";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_290() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_290 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16805505).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_290";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_291() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_291 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16805377).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_291";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_292() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_292 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16805249).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_292";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_293() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_293 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16805121).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_293";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_294() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_294 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16804993).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_294";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_295() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_295 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16804865).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_295";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_296() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_296 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16804737).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_296";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_297() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_297 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16804609).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_297";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_298() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_298 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16804481).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_298";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_299() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_299 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16804353).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_299";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_300() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_300 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16804225).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_300";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_301() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_301 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16804097).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_301";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_302() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_302 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16803969).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_302";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_303() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_303 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16803841).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_303";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_304() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_304 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16803713).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_304";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_305() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_305 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16803585).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_305";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_306() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_306 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16803457).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_306";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_307() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_307 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16803329).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_307";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_308() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_308 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16803201).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_308";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_309() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_309 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16803073).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_309";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_310() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_310 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16802945).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_310";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_311() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_311 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16802817).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_311";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_312() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_312 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16802689).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_312";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_313() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_313 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16802561).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_313";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_314() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_314 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16802433).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_314";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_315() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_315 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16802305).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_315";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_316() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_316 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16802177).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_316";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_317() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_317 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16802049).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_317";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_318() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_318 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16801921).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_318";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_319() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_319 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16801793).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_319";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_320() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_320 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16801665).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_320";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_321() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_321 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16801537).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_321";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_322() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_322 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16801409).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_322";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_323() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_323 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16801281).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_323";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_324() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_324 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16801153).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_324";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_325() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_325 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16801025).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_325";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_326() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_326 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16800897).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_326";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_327() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_327 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16800769).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_327";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_328() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_328 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16800641).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_328";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_329() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_329 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16800513).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_329";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_330() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_330 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16800385).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_330";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_331() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_331 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16800257).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_331";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_332() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_332 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16800129).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_332";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_333() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_333 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16800001).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_333";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_334() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_334 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16799873).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_334";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_335() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_335 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16799745).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_335";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_336() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_336 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16799617).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_336";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_337() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_337 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16799489).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_337";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_338() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_338 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16799361).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_338";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_339() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_339 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16799233).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_339";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_340() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_340 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16799105).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_340";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_341() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_341 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16798977).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_341";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_342() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_342 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16798849).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_342";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_343() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_343 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16798721).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_343";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_344() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_344 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16798593).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_344";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_345() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_345 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16798465).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_345";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_346() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_346 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16798337).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_346";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_347() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_347 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16798209).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_347";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_348() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_348 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16798081).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_348";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_349() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_349 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16797953).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_349";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_350() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_350 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16797825).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_350";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_351() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_351 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16797697).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_351";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_352() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_352 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16797569).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_352";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_353() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_353 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16797441).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_353";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_354() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_354 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16797313).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_354";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_355() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_355 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16797185).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_355";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_356() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_356 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16797057).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_356";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_357() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_357 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16796929).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_357";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_358() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_358 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16796801).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_358";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_359() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_359 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16796673).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_359";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_360() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_360 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16796545).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_360";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_361() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_361 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16796417).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_361";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_362() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_362 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16796289).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_362";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_363() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_363 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16796161).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_363";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_364() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_364 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16796033).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_364";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_365() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_365 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16795905).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_365";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_366() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_366 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16795777).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_366";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_367() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_367 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16795649).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_367";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_368() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_368 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16795521).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_368";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_369() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_369 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16795393).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_369";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_370() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_370 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16795265).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_370";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_371() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_371 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16795137).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_371";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_372() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_372 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16795009).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_372";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_373() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_373 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16794881).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_373";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_374() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_374 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16794753).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_374";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_375() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_375 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16794625).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_375";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_376() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_376 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16794497).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_376";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_377() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_377 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16794369).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_377";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_378() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_378 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16794241).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_378";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_379() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_379 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16794113).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_379";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_380() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_380 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16793985).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_380";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_381() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_381 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16793857).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_381";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_382() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_382 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16793729).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_382";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_383() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_383 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16793601).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_383";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_384() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_384 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16793473).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_384";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_385() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_385 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16793345).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_385";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_386() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_386 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16793217).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_386";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_387() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_387 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16793089).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_387";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_388() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_388 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16792961).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_388";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_389() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_389 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16792833).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_389";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_390() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_390 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16792705).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_390";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_391() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_391 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16792577).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_391";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_392() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_392 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16792449).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_392";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_393() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_393 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16792321).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_393";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_394() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_394 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16792193).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_394";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_395() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_395 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16792065).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_395";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_396() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_396 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16791937).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_396";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_397() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_397 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16791809).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_397";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_398() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_398 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16791681).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_398";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_399() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_399 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16791553).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_399";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_400() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_400 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16791425).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_400";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_401() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_401 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16791297).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_401";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_402() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_402 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16791169).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_402";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_403() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_403 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16791041).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_403";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_404() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_404 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16790913).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_404";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_405() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_405 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16790785).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_405";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_406() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_406 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16790657).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_406";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_407() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_407 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16790529).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_407";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_408() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_408 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16790401).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_408";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_409() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_409 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16790273).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_409";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_410() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_410 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16790145).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_410";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_411() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_411 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16790017).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_411";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_412() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_412 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16789889).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_412";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_413() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_413 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16789761).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_413";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_414() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_414 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16789633).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_414";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_415() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_415 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16789505).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_415";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_416() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_416 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16789377).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_416";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_417() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_417 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16789249).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_417";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_418() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_418 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16789121).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_418";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_419() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_419 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16788993).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_419";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_420() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_420 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16788865).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_420";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_421() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_421 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16788737).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_421";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_422() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_422 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16788609).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_422";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_423() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_423 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16788481).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_423";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_424() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_424 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16788353).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_424";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_425() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_425 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16788225).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_425";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_426() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_426 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16788097).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_426";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_427() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_427 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16787969).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_427";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_428() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_428 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16787841).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_428";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_429() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_429 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16787713).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_429";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_430() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_430 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16787585).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_430";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_431() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_431 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16787457).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_431";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_432() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_432 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16787329).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_432";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_433() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_433 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16787201).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_433";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_434() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_434 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16787073).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_434";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_435() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_435 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16786945).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_435";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_436() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_436 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16786817).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_436";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_437() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_437 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16786689).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_437";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_438() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_438 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16786561).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_438";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_439() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_439 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16786433).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_439";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_440() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_440 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16786305).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_440";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_441() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_441 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16786177).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_441";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_442() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_442 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16786049).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_442";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_443() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_443 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16785921).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_443";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_444() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_444 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16785793).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_444";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_445() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_445 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16785665).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_445";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_446() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_446 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16785537).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_446";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_447() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_447 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16785409).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_447";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_448() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_448 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16785281).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_448";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_449() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_449 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16785153).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_449";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_450() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_450 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16785025).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_450";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_451() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_451 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16784897).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_451";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_452() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_452 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16784769).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_452";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_453() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_453 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16784641).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_453";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_454() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_454 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16784513).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_454";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_455() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_455 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16784385).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_455";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_456() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_456 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16784257).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_456";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_457() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_457 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16784129).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_457";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_458() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_458 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16784001).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_458";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_459() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_459 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16783873).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_459";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_460() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_460 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16783745).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_460";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_461() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_461 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16783617).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_461";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_462() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_462 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16783489).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_462";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_463() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_463 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16783361).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_463";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_464() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_464 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16783233).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_464";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_465() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_465 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16783105).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_465";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_466() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_466 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16782977).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_466";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_467() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_467 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16782849).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_467";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_468() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_468 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16782721).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_468";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_469() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_469 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16782593).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_469";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_470() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_470 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16782465).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_470";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_471() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_471 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16782337).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_471";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_472() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_472 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16782209).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_472";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_473() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_473 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16782081).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_473";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_474() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_474 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16781953).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_474";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_475() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_475 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16781825).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_475";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_476() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_476 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16781697).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_476";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_477() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_477 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16781569).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_477";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_478() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_478 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16781441).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_478";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_479() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_479 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16781313).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_479";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_480() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_480 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16781185).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_480";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_481() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_481 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16781057).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_481";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_482() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_482 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16780929).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_482";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_483() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_483 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16780801).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_483";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_484() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_484 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16780673).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_484";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_485() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_485 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16780545).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_485";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_486() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_486 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16780417).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_486";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_487() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_487 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16780289).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_487";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_488() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_488 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16780161).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_488";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_489() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_489 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16780033).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_489";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_490() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_490 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16779905).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_490";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_491() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_491 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16779777).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_491";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_492() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_492 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16779649).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_492";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_493() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_493 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16779521).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_493";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_494() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_494 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16779393).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_494";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_495() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_495 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16779265).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_495";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_496() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_496 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16779137).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_496";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_497() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_497 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16779009).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_497";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_498() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_498 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16778881).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_498";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_499() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_499 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16778753).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_499";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_500() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_500 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16778625).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_500";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_501() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_501 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16778497).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_501";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_502() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_502 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16778369).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_502";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_503() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_503 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16778241).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_503";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_504() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_504 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16778113).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_504";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_505() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_505 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16777985).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_505";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_506() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_506 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16777857).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_506";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_507() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_507 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16777729).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_507";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_508() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_508 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16777601).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_508";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_509() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_509 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16777473).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_509";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_510() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_510 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16777345).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_510";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_511() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_511 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(-16777217).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_511";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUSP_class_512() {
		System.out.println("   + Executing microMIPS_ADDIUSP_class_tests_512 ...");
		String[] result = microMIPS_ADDIUSP_class.microMIPS_ADDIUSP(0).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUSP_class/";
		String testName = "microMIPS_ADDIUSP_class_512";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TNEI_class_0() {
		System.out.println("   + Executing MIPS32_TNEI_class_tests_0 ...");
		String[] result = MIPS32_TNEI_class.MIPS32_TNEI('5', 186).split("->");
		String dir = "symips/jdart/MIPS32_TNEI_class/";
		String testName = "MIPS32_TNEI_class_0";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TNEI_class_1() {
		System.out.println("   + Executing MIPS32_TNEI_class_tests_1 ...");
		String[] result = MIPS32_TNEI_class.MIPS32_TNEI('5', 123).split("->");
		String dir = "symips/jdart/MIPS32_TNEI_class/";
		String testName = "MIPS32_TNEI_class_1";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TNEI_class_2() {
		System.out.println("   + Executing MIPS32_TNEI_class_tests_2 ...");
		String[] result = MIPS32_TNEI_class.MIPS32_TNEI('5', 0).split("->");
		String dir = "symips/jdart/MIPS32_TNEI_class/";
		String testName = "MIPS32_TNEI_class_2";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_XOR_class_0() {
		System.out.println("   + Executing microMIPS_XOR_class_tests_0 ...");
		String[] result = microMIPS_XOR_class.microMIPS_XOR('g', 'j', 'r').split("->");
		String dir = "symips/jdart/microMIPS_XOR_class/";
		String testName = "microMIPS_XOR_class_0";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_XOR_class_1() {
		System.out.println("   + Executing microMIPS_XOR_class_tests_1 ...");
		String[] result = microMIPS_XOR_class.microMIPS_XOR('0', 'j', '2').split("->");
		String dir = "symips/jdart/microMIPS_XOR_class/";
		String testName = "microMIPS_XOR_class_1";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_SRL_class_0() {
		System.out.println("   + Executing microMIPS_SRL_class_tests_0 ...");
		String[] result = microMIPS_SRL_class.microMIPS_SRL('i', 'b', 640).split("->");
		String dir = "symips/jdart/microMIPS_SRL_class/";
		String testName = "microMIPS_SRL_class_0";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_DIVU_class_0() {
		System.out.println("   + Executing MIPS32_DIVU_class_tests_0 ...");
		String[] result = MIPS32_DIVU_class.MIPS32_DIVU('h', 'o').split("->");
		String dir = "symips/jdart/MIPS32_DIVU_class/";
		String testName = "MIPS32_DIVU_class_0";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_LUI_class_0() {
		System.out.println("   + Executing MIPS32_LUI_class_tests_0 ...");
		String[] result = MIPS32_LUI_class.MIPS32_LUI('7', 503).split("->");
		String dir = "symips/jdart/MIPS32_LUI_class/";
		String testName = "MIPS32_LUI_class_0";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_LUI_class_1() {
		System.out.println("   + Executing MIPS32_LUI_class_tests_1 ...");
		String[] result = MIPS32_LUI_class.MIPS32_LUI('0', 0).split("->");
		String dir = "symips/jdart/MIPS32_LUI_class/";
		String testName = "MIPS32_LUI_class_1";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_MADDU_class_0() {
		System.out.println("   + Executing MIPS32_MADDU_class_tests_0 ...");
		String[] result = MIPS32_MADDU_class.MIPS32_MADDU('p', 'f').split("->");
		String dir = "symips/jdart/MIPS32_MADDU_class/";
		String testName = "MIPS32_MADDU_class_0";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADD_class_0() {
		System.out.println("   + Executing microMIPS_ADD_class_tests_0 ...");
		String[] result = microMIPS_ADD_class.microMIPS_ADD('q', 'l', 'q').split("->");
		String dir = "symips/jdart/microMIPS_ADD_class/";
		String testName = "microMIPS_ADD_class_0";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDU16_class_0() {
		System.out.println("   + Executing microMIPS_ADDU16_class_tests_0 ...");
		String[] result = microMIPS_ADDU16_class.microMIPS_ADDU16('i', 'o', 'p').split("->");
		String dir = "symips/jdart/microMIPS_ADDU16_class/";
		String testName = "microMIPS_ADDU16_class_0";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDU16_class_1() {
		System.out.println("   + Executing microMIPS_ADDU16_class_tests_1 ...");
		String[] result = microMIPS_ADDU16_class.microMIPS_ADDU16('0', 'o', '0').split("->");
		String dir = "symips/jdart/microMIPS_ADDU16_class/";
		String testName = "microMIPS_ADDU16_class_1";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_SLLV_class_0() {
		System.out.println("   + Executing microMIPS_SLLV_class_tests_0 ...");
		String[] result = microMIPS_SLLV_class.microMIPS_SLLV('r', '5', '3').split("->");
		String dir = "symips/jdart/microMIPS_SLLV_class/";
		String testName = "microMIPS_SLLV_class_0";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_SUBU16_class_0() {
		System.out.println("   + Executing microMIPS_SUBU16_class_tests_0 ...");
		String[] result = microMIPS_SUBU16_class.microMIPS_SUBU16('4', 'h', 'b').split("->");
		String dir = "symips/jdart/microMIPS_SUBU16_class/";
		String testName = "microMIPS_SUBU16_class_0";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_MUH_class_0() {
		System.out.println("   + Executing microMIPS_MUH_class_tests_0 ...");
		String[] result = microMIPS_MUH_class.microMIPS_MUH('0', 'b', 'p').split("->");
		String dir = "symips/jdart/microMIPS_MUH_class/";
		String testName = "microMIPS_MUH_class_0";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_MUH_class_1() {
		System.out.println("   + Executing microMIPS_MUH_class_tests_1 ...");
		String[] result = microMIPS_MUH_class.microMIPS_MUH('p', 'b', 'p').split("->");
		String dir = "symips/jdart/microMIPS_MUH_class/";
		String testName = "microMIPS_MUH_class_1";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_MUH_class_2() {
		System.out.println("   + Executing microMIPS_MUH_class_tests_2 ...");
		String[] result = microMIPS_MUH_class.microMIPS_MUH('0', 'b', '0').split("->");
		String dir = "symips/jdart/microMIPS_MUH_class/";
		String testName = "microMIPS_MUH_class_2";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_SELEQZ_class_0() {
		System.out.println("   + Executing microMIPS_SELEQZ_class_tests_0 ...");
		String[] result = microMIPS_SELEQZ_class.microMIPS_SELEQZ('5', '2', '5').split("->");
		String dir = "symips/jdart/microMIPS_SELEQZ_class/";
		String testName = "microMIPS_SELEQZ_class_0";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_OR_class_0() {
		System.out.println("   + Executing microMIPS_OR_class_tests_0 ...");
		String[] result = microMIPS_OR_class.microMIPS_OR('l', 'i', 'o').split("->");
		String dir = "symips/jdart/microMIPS_OR_class/";
		String testName = "microMIPS_OR_class_0";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ALUIPC_class_0() {
		System.out.println("   + Executing microMIPS_ALUIPC_class_tests_0 ...");
		String[] result = microMIPS_ALUIPC_class.microMIPS_ALUIPC('o', 348).split("->");
		String dir = "symips/jdart/microMIPS_ALUIPC_class/";
		String testName = "microMIPS_ALUIPC_class_0";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ALUIPC_class_1() {
		System.out.println("   + Executing microMIPS_ALUIPC_class_tests_1 ...");
		String[] result = microMIPS_ALUIPC_class.microMIPS_ALUIPC('0', 0).split("->");
		String dir = "symips/jdart/microMIPS_ALUIPC_class/";
		String testName = "microMIPS_ALUIPC_class_1";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_ADD_class_0() {
		System.out.println("   + Executing MIPS32_ADD_class_tests_0 ...");
		String[] result = MIPS32_ADD_class.MIPS32_ADD('4', 'b', 'j').split("->");
		String dir = "symips/jdart/MIPS32_ADD_class/";
		String testName = "MIPS32_ADD_class_0";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_MUHU_class_0() {
		System.out.println("   + Executing microMIPS_MUHU_class_tests_0 ...");
		String[] result = microMIPS_MUHU_class.microMIPS_MUHU('0', '6', 'c').split("->");
		String dir = "symips/jdart/microMIPS_MUHU_class/";
		String testName = "microMIPS_MUHU_class_0";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_MUHU_class_1() {
		System.out.println("   + Executing microMIPS_MUHU_class_tests_1 ...");
		String[] result = microMIPS_MUHU_class.microMIPS_MUHU('g', '6', 'c').split("->");
		String dir = "symips/jdart/microMIPS_MUHU_class/";
		String testName = "microMIPS_MUHU_class_1";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_AUI_class_0() {
		System.out.println("   + Executing microMIPS_AUI_class_tests_0 ...");
		String[] result = microMIPS_AUI_class.microMIPS_AUI('1', 'q', 643).split("->");
		String dir = "symips/jdart/microMIPS_AUI_class/";
		String testName = "microMIPS_AUI_class_0";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_AUI_class_1() {
		System.out.println("   + Executing microMIPS_AUI_class_tests_1 ...");
		String[] result = microMIPS_AUI_class.microMIPS_AUI('1', '0', 0).split("->");
		String dir = "symips/jdart/microMIPS_AUI_class/";
		String testName = "microMIPS_AUI_class_1";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_ADDIU_class_0() {
		System.out.println("   + Executing MIPS32_ADDIU_class_tests_0 ...");
		String[] result = MIPS32_ADDIU_class.MIPS32_ADDIU('h', 'n', 285).split("->");
		String dir = "symips/jdart/MIPS32_ADDIU_class/";
		String testName = "MIPS32_ADDIU_class_0";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_ADDIU_class_1() {
		System.out.println("   + Executing MIPS32_ADDIU_class_tests_1 ...");
		String[] result = MIPS32_ADDIU_class.MIPS32_ADDIU('h', '0', 0).split("->");
		String dir = "symips/jdart/MIPS32_ADDIU_class/";
		String testName = "MIPS32_ADDIU_class_1";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_DIVU_class_0() {
		System.out.println("   + Executing microMIPS_DIVU_class_tests_0 ...");
		String[] result = microMIPS_DIVU_class.microMIPS_DIVU('9', 'o', 'h').split("->");
		String dir = "symips/jdart/microMIPS_DIVU_class/";
		String testName = "microMIPS_DIVU_class_0";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_ORI_class_0() {
		System.out.println("   + Executing MIPS32_ORI_class_tests_0 ...");
		String[] result = MIPS32_ORI_class.MIPS32_ORI('d', '0', -16777217).split("->");
		String dir = "symips/jdart/MIPS32_ORI_class/";
		String testName = "MIPS32_ORI_class_0";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_ORI_class_1() {
		System.out.println("   + Executing MIPS32_ORI_class_tests_1 ...");
		String[] result = MIPS32_ORI_class.MIPS32_ORI('d', '4', 911).split("->");
		String dir = "symips/jdart/MIPS32_ORI_class/";
		String testName = "MIPS32_ORI_class_1";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_ORI_class_2() {
		System.out.println("   + Executing MIPS32_ORI_class_tests_2 ...");
		String[] result = MIPS32_ORI_class.MIPS32_ORI('d', '4', 134217728).split("->");
		String dir = "symips/jdart/MIPS32_ORI_class/";
		String testName = "MIPS32_ORI_class_2";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_ORI_class_3() {
		System.out.println("   + Executing MIPS32_ORI_class_tests_3 ...");
		String[] result = MIPS32_ORI_class.MIPS32_ORI('d', '4', 268435456).split("->");
		String dir = "symips/jdart/MIPS32_ORI_class/";
		String testName = "MIPS32_ORI_class_3";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_ORI_class_4() {
		System.out.println("   + Executing MIPS32_ORI_class_tests_4 ...");
		String[] result = MIPS32_ORI_class.MIPS32_ORI('d', '4', 402653184).split("->");
		String dir = "symips/jdart/MIPS32_ORI_class/";
		String testName = "MIPS32_ORI_class_4";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_ORI_class_5() {
		System.out.println("   + Executing MIPS32_ORI_class_tests_5 ...");
		String[] result = MIPS32_ORI_class.MIPS32_ORI('d', '4', 536870912).split("->");
		String dir = "symips/jdart/MIPS32_ORI_class/";
		String testName = "MIPS32_ORI_class_5";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_ORI_class_6() {
		System.out.println("   + Executing MIPS32_ORI_class_tests_6 ...");
		String[] result = MIPS32_ORI_class.MIPS32_ORI('d', '4', 671088640).split("->");
		String dir = "symips/jdart/MIPS32_ORI_class/";
		String testName = "MIPS32_ORI_class_6";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_ORI_class_7() {
		System.out.println("   + Executing MIPS32_ORI_class_tests_7 ...");
		String[] result = MIPS32_ORI_class.MIPS32_ORI('d', '4', 805306368).split("->");
		String dir = "symips/jdart/MIPS32_ORI_class/";
		String testName = "MIPS32_ORI_class_7";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_ORI_class_8() {
		System.out.println("   + Executing MIPS32_ORI_class_tests_8 ...");
		String[] result = MIPS32_ORI_class.MIPS32_ORI('d', '4', 939524096).split("->");
		String dir = "symips/jdart/MIPS32_ORI_class/";
		String testName = "MIPS32_ORI_class_8";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_ORI_class_9() {
		System.out.println("   + Executing MIPS32_ORI_class_tests_9 ...");
		String[] result = MIPS32_ORI_class.MIPS32_ORI('d', '4', 1073741824).split("->");
		String dir = "symips/jdart/MIPS32_ORI_class/";
		String testName = "MIPS32_ORI_class_9";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_ORI_class_10() {
		System.out.println("   + Executing MIPS32_ORI_class_tests_10 ...");
		String[] result = MIPS32_ORI_class.MIPS32_ORI('d', '4', 1207959552).split("->");
		String dir = "symips/jdart/MIPS32_ORI_class/";
		String testName = "MIPS32_ORI_class_10";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_ORI_class_11() {
		System.out.println("   + Executing MIPS32_ORI_class_tests_11 ...");
		String[] result = MIPS32_ORI_class.MIPS32_ORI('d', '4', 1342177280).split("->");
		String dir = "symips/jdart/MIPS32_ORI_class/";
		String testName = "MIPS32_ORI_class_11";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_ORI_class_12() {
		System.out.println("   + Executing MIPS32_ORI_class_tests_12 ...");
		String[] result = MIPS32_ORI_class.MIPS32_ORI('d', '4', 1476395008).split("->");
		String dir = "symips/jdart/MIPS32_ORI_class/";
		String testName = "MIPS32_ORI_class_12";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_ORI_class_13() {
		System.out.println("   + Executing MIPS32_ORI_class_tests_13 ...");
		String[] result = MIPS32_ORI_class.MIPS32_ORI('d', '4', 1610612736).split("->");
		String dir = "symips/jdart/MIPS32_ORI_class/";
		String testName = "MIPS32_ORI_class_13";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_ORI_class_14() {
		System.out.println("   + Executing MIPS32_ORI_class_tests_14 ...");
		String[] result = MIPS32_ORI_class.MIPS32_ORI('d', '4', 1744830464).split("->");
		String dir = "symips/jdart/MIPS32_ORI_class/";
		String testName = "MIPS32_ORI_class_14";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_ORI_class_15() {
		System.out.println("   + Executing MIPS32_ORI_class_tests_15 ...");
		String[] result = MIPS32_ORI_class.MIPS32_ORI('d', '4', 1879048192).split("->");
		String dir = "symips/jdart/MIPS32_ORI_class/";
		String testName = "MIPS32_ORI_class_15";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_ORI_class_16() {
		System.out.println("   + Executing MIPS32_ORI_class_tests_16 ...");
		String[] result = MIPS32_ORI_class.MIPS32_ORI('d', '4', 2013265920).split("->");
		String dir = "symips/jdart/MIPS32_ORI_class/";
		String testName = "MIPS32_ORI_class_16";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_ORI_class_17() {
		System.out.println("   + Executing MIPS32_ORI_class_tests_17 ...");
		String[] result = MIPS32_ORI_class.MIPS32_ORI('d', '4', -2147483648).split("->");
		String dir = "symips/jdart/MIPS32_ORI_class/";
		String testName = "MIPS32_ORI_class_17";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_ORI_class_18() {
		System.out.println("   + Executing MIPS32_ORI_class_tests_18 ...");
		String[] result = MIPS32_ORI_class.MIPS32_ORI('d', '4', -2013265920).split("->");
		String dir = "symips/jdart/MIPS32_ORI_class/";
		String testName = "MIPS32_ORI_class_18";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_ORI_class_19() {
		System.out.println("   + Executing MIPS32_ORI_class_tests_19 ...");
		String[] result = MIPS32_ORI_class.MIPS32_ORI('d', '4', -1879048192).split("->");
		String dir = "symips/jdart/MIPS32_ORI_class/";
		String testName = "MIPS32_ORI_class_19";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_ORI_class_20() {
		System.out.println("   + Executing MIPS32_ORI_class_tests_20 ...");
		String[] result = MIPS32_ORI_class.MIPS32_ORI('d', '4', -1744830464).split("->");
		String dir = "symips/jdart/MIPS32_ORI_class/";
		String testName = "MIPS32_ORI_class_20";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_ORI_class_21() {
		System.out.println("   + Executing MIPS32_ORI_class_tests_21 ...");
		String[] result = MIPS32_ORI_class.MIPS32_ORI('d', '4', -1610612736).split("->");
		String dir = "symips/jdart/MIPS32_ORI_class/";
		String testName = "MIPS32_ORI_class_21";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_ORI_class_22() {
		System.out.println("   + Executing MIPS32_ORI_class_tests_22 ...");
		String[] result = MIPS32_ORI_class.MIPS32_ORI('d', '4', -1476395008).split("->");
		String dir = "symips/jdart/MIPS32_ORI_class/";
		String testName = "MIPS32_ORI_class_22";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_ORI_class_23() {
		System.out.println("   + Executing MIPS32_ORI_class_tests_23 ...");
		String[] result = MIPS32_ORI_class.MIPS32_ORI('d', '4', -1342177280).split("->");
		String dir = "symips/jdart/MIPS32_ORI_class/";
		String testName = "MIPS32_ORI_class_23";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_ORI_class_24() {
		System.out.println("   + Executing MIPS32_ORI_class_tests_24 ...");
		String[] result = MIPS32_ORI_class.MIPS32_ORI('d', '4', -1207959552).split("->");
		String dir = "symips/jdart/MIPS32_ORI_class/";
		String testName = "MIPS32_ORI_class_24";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_ORI_class_25() {
		System.out.println("   + Executing MIPS32_ORI_class_tests_25 ...");
		String[] result = MIPS32_ORI_class.MIPS32_ORI('d', '4', -1073741824).split("->");
		String dir = "symips/jdart/MIPS32_ORI_class/";
		String testName = "MIPS32_ORI_class_25";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_ORI_class_26() {
		System.out.println("   + Executing MIPS32_ORI_class_tests_26 ...");
		String[] result = MIPS32_ORI_class.MIPS32_ORI('d', '4', -939524096).split("->");
		String dir = "symips/jdart/MIPS32_ORI_class/";
		String testName = "MIPS32_ORI_class_26";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_ORI_class_27() {
		System.out.println("   + Executing MIPS32_ORI_class_tests_27 ...");
		String[] result = MIPS32_ORI_class.MIPS32_ORI('d', '4', -805306368).split("->");
		String dir = "symips/jdart/MIPS32_ORI_class/";
		String testName = "MIPS32_ORI_class_27";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_ORI_class_28() {
		System.out.println("   + Executing MIPS32_ORI_class_tests_28 ...");
		String[] result = MIPS32_ORI_class.MIPS32_ORI('d', '4', -671088640).split("->");
		String dir = "symips/jdart/MIPS32_ORI_class/";
		String testName = "MIPS32_ORI_class_28";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_ORI_class_29() {
		System.out.println("   + Executing MIPS32_ORI_class_tests_29 ...");
		String[] result = MIPS32_ORI_class.MIPS32_ORI('d', '4', -536870912).split("->");
		String dir = "symips/jdart/MIPS32_ORI_class/";
		String testName = "MIPS32_ORI_class_29";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_ORI_class_30() {
		System.out.println("   + Executing MIPS32_ORI_class_tests_30 ...");
		String[] result = MIPS32_ORI_class.MIPS32_ORI('d', '4', -402653184).split("->");
		String dir = "symips/jdart/MIPS32_ORI_class/";
		String testName = "MIPS32_ORI_class_30";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_ORI_class_31() {
		System.out.println("   + Executing MIPS32_ORI_class_tests_31 ...");
		String[] result = MIPS32_ORI_class.MIPS32_ORI('d', '4', -268435456).split("->");
		String dir = "symips/jdart/MIPS32_ORI_class/";
		String testName = "MIPS32_ORI_class_31";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_ORI_class_32() {
		System.out.println("   + Executing MIPS32_ORI_class_tests_32 ...");
		String[] result = MIPS32_ORI_class.MIPS32_ORI('d', '4', -134217728).split("->");
		String dir = "symips/jdart/MIPS32_ORI_class/";
		String testName = "MIPS32_ORI_class_32";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_ORI_class_33() {
		System.out.println("   + Executing MIPS32_ORI_class_tests_33 ...");
		String[] result = MIPS32_ORI_class.MIPS32_ORI('d', '0', 0).split("->");
		String dir = "symips/jdart/MIPS32_ORI_class/";
		String testName = "MIPS32_ORI_class_33";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_TGE_class_0() {
		System.out.println("   + Executing microMIPS_TGE_class_tests_0 ...");
		String[] result = microMIPS_TGE_class.microMIPS_TGE('5', 'o').split("->");
		String dir = "symips/jdart/microMIPS_TGE_class/";
		String testName = "microMIPS_TGE_class_0";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_SLTU_class_0() {
		System.out.println("   + Executing MIPS32_SLTU_class_tests_0 ...");
		String[] result = MIPS32_SLTU_class.MIPS32_SLTU('g', '3', '7').split("->");
		String dir = "symips/jdart/MIPS32_SLTU_class/";
		String testName = "MIPS32_SLTU_class_0";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ANDI16_class_0() {
		System.out.println("   + Executing microMIPS_ANDI16_class_tests_0 ...");
		String[] result = microMIPS_ANDI16_class.microMIPS_ANDI16('0', '1', 4).split("->");
		String dir = "symips/jdart/microMIPS_ANDI16_class/";
		String testName = "microMIPS_ANDI16_class_0";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ANDI16_class_1() {
		System.out.println("   + Executing microMIPS_ANDI16_class_tests_1 ...");
		String[] result = microMIPS_ANDI16_class.microMIPS_ANDI16('7', '1', 866).split("->");
		String dir = "symips/jdart/microMIPS_ANDI16_class/";
		String testName = "microMIPS_ANDI16_class_1";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ANDI16_class_2() {
		System.out.println("   + Executing microMIPS_ANDI16_class_tests_2 ...");
		String[] result = microMIPS_ANDI16_class.microMIPS_ANDI16('0', '1', 0).split("->");
		String dir = "symips/jdart/microMIPS_ANDI16_class/";
		String testName = "microMIPS_ANDI16_class_2";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_NOR_class_0() {
		System.out.println("   + Executing microMIPS_NOR_class_tests_0 ...");
		String[] result = microMIPS_NOR_class.microMIPS_NOR('7', 'g', 'f').split("->");
		String dir = "symips/jdart/microMIPS_NOR_class/";
		String testName = "microMIPS_NOR_class_0";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_TNE_class_0() {
		System.out.println("   + Executing microMIPS_TNE_class_tests_0 ...");
		String[] result = microMIPS_TNE_class.microMIPS_TNE('3', '1').split("->");
		String dir = "symips/jdart/microMIPS_TNE_class/";
		String testName = "microMIPS_TNE_class_0";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_SRAV_class_0() {
		System.out.println("   + Executing microMIPS_SRAV_class_tests_0 ...");
		String[] result = microMIPS_SRAV_class.microMIPS_SRAV('3', 'k', '9').split("->");
		String dir = "symips/jdart/microMIPS_SRAV_class/";
		String testName = "microMIPS_SRAV_class_0";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_SRA_class_0() {
		System.out.println("   + Executing MIPS32_SRA_class_tests_0 ...");
		String[] result = MIPS32_SRA_class.MIPS32_SRA('v', 'g', 250).split("->");
		String dir = "symips/jdart/MIPS32_SRA_class/";
		String testName = "MIPS32_SRA_class_0";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TNE_class_0() {
		System.out.println("   + Executing MIPS32_TNE_class_tests_0 ...");
		String[] result = MIPS32_TNE_class.MIPS32_TNE('5', 'j').split("->");
		String dir = "symips/jdart/MIPS32_TNE_class/";
		String testName = "MIPS32_TNE_class_0";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIU_class_0() {
		System.out.println("   + Executing microMIPS_ADDIU_class_tests_0 ...");
		String[] result = microMIPS_ADDIU_class.microMIPS_ADDIU('l', 'v', 792).split("->");
		String dir = "symips/jdart/microMIPS_ADDIU_class/";
		String testName = "microMIPS_ADDIU_class_0";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIU_class_1() {
		System.out.println("   + Executing microMIPS_ADDIU_class_tests_1 ...");
		String[] result = microMIPS_ADDIU_class.microMIPS_ADDIU('l', '0', 0).split("->");
		String dir = "symips/jdart/microMIPS_ADDIU_class/";
		String testName = "microMIPS_ADDIU_class_1";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TGEU_class_0() {
		System.out.println("   + Executing MIPS32_TGEU_class_tests_0 ...");
		String[] result = MIPS32_TGEU_class.MIPS32_TGEU('d', '1').split("->");
		String dir = "symips/jdart/MIPS32_TGEU_class/";
		String testName = "MIPS32_TGEU_class_0";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_MULTU_class_0() {
		System.out.println("   + Executing MIPS32_MULTU_class_tests_0 ...");
		String[] result = MIPS32_MULTU_class.MIPS32_MULTU('k', '5').split("->");
		String dir = "symips/jdart/MIPS32_MULTU_class/";
		String testName = "MIPS32_MULTU_class_0";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_DIV_class_0() {
		System.out.println("   + Executing MIPS32_DIV_class_tests_0 ...");
		String[] result = MIPS32_DIV_class.MIPS32_DIV('i', 'r').split("->");
		String dir = "symips/jdart/MIPS32_DIV_class/";
		String testName = "MIPS32_DIV_class_0";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUPC_class_0() {
		System.out.println("   + Executing microMIPS_ADDIUPC_class_tests_0 ...");
		String[] result = microMIPS_ADDIUPC_class.microMIPS_ADDIUPC('q', 731).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUPC_class/";
		String testName = "microMIPS_ADDIUPC_class_0";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ADDIUPC_class_1() {
		System.out.println("   + Executing microMIPS_ADDIUPC_class_tests_1 ...");
		String[] result = microMIPS_ADDIUPC_class.microMIPS_ADDIUPC('0', 0).split("->");
		String dir = "symips/jdart/microMIPS_ADDIUPC_class/";
		String testName = "microMIPS_ADDIUPC_class_1";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TLTU_class_0() {
		System.out.println("   + Executing MIPS32_TLTU_class_tests_0 ...");
		String[] result = MIPS32_TLTU_class.MIPS32_TLTU('k', '5').split("->");
		String dir = "symips/jdart/MIPS32_TLTU_class/";
		String testName = "MIPS32_TLTU_class_0";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_MOVZZ_class_0() {
		System.out.println("   + Executing MIPS32_MOVZZ_class_tests_0 ...");
		String[] result = MIPS32_MOVZZ_class.MIPS32_MOVZZ('3', 'j', 'l').split("->");
		String dir = "symips/jdart/MIPS32_MOVZZ_class/";
		String testName = "MIPS32_MOVZZ_class_0";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_MOVE16_class_0() {
		System.out.println("   + Executing microMIPS_MOVE16_class_tests_0 ...");
		String[] result = microMIPS_MOVE16_class.microMIPS_MOVE16('0', '4').split("->");
		String dir = "symips/jdart/microMIPS_MOVE16_class/";
		String testName = "microMIPS_MOVE16_class_0";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_MOVE16_class_1() {
		System.out.println("   + Executing microMIPS_MOVE16_class_tests_1 ...");
		String[] result = microMIPS_MOVE16_class.microMIPS_MOVE16('q', '4').split("->");
		String dir = "symips/jdart/microMIPS_MOVE16_class/";
		String testName = "microMIPS_MOVE16_class_1";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TLTI_class_0() {
		System.out.println("   + Executing MIPS32_TLTI_class_tests_0 ...");
		String[] result = MIPS32_TLTI_class.MIPS32_TLTI('8', 58).split("->");
		String dir = "symips/jdart/MIPS32_TLTI_class/";
		String testName = "MIPS32_TLTI_class_0";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TLTI_class_1() {
		System.out.println("   + Executing MIPS32_TLTI_class_tests_1 ...");
		String[] result = MIPS32_TLTI_class.MIPS32_TLTI('8', 33554432).split("->");
		String dir = "symips/jdart/MIPS32_TLTI_class/";
		String testName = "MIPS32_TLTI_class_1";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TLTI_class_2() {
		System.out.println("   + Executing MIPS32_TLTI_class_tests_2 ...");
		String[] result = MIPS32_TLTI_class.MIPS32_TLTI('8', 67108864).split("->");
		String dir = "symips/jdart/MIPS32_TLTI_class/";
		String testName = "MIPS32_TLTI_class_2";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TLTI_class_3() {
		System.out.println("   + Executing MIPS32_TLTI_class_tests_3 ...");
		String[] result = MIPS32_TLTI_class.MIPS32_TLTI('8', 100663296).split("->");
		String dir = "symips/jdart/MIPS32_TLTI_class/";
		String testName = "MIPS32_TLTI_class_3";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TLTI_class_4() {
		System.out.println("   + Executing MIPS32_TLTI_class_tests_4 ...");
		String[] result = MIPS32_TLTI_class.MIPS32_TLTI('8', 134217728).split("->");
		String dir = "symips/jdart/MIPS32_TLTI_class/";
		String testName = "MIPS32_TLTI_class_4";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TLTI_class_5() {
		System.out.println("   + Executing MIPS32_TLTI_class_tests_5 ...");
		String[] result = MIPS32_TLTI_class.MIPS32_TLTI('8', 167772160).split("->");
		String dir = "symips/jdart/MIPS32_TLTI_class/";
		String testName = "MIPS32_TLTI_class_5";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TLTI_class_6() {
		System.out.println("   + Executing MIPS32_TLTI_class_tests_6 ...");
		String[] result = MIPS32_TLTI_class.MIPS32_TLTI('8', 201326592).split("->");
		String dir = "symips/jdart/MIPS32_TLTI_class/";
		String testName = "MIPS32_TLTI_class_6";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TLTI_class_7() {
		System.out.println("   + Executing MIPS32_TLTI_class_tests_7 ...");
		String[] result = MIPS32_TLTI_class.MIPS32_TLTI('8', 234881024).split("->");
		String dir = "symips/jdart/MIPS32_TLTI_class/";
		String testName = "MIPS32_TLTI_class_7";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TLTI_class_8() {
		System.out.println("   + Executing MIPS32_TLTI_class_tests_8 ...");
		String[] result = MIPS32_TLTI_class.MIPS32_TLTI('8', 268435456).split("->");
		String dir = "symips/jdart/MIPS32_TLTI_class/";
		String testName = "MIPS32_TLTI_class_8";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TLTI_class_9() {
		System.out.println("   + Executing MIPS32_TLTI_class_tests_9 ...");
		String[] result = MIPS32_TLTI_class.MIPS32_TLTI('8', 301989888).split("->");
		String dir = "symips/jdart/MIPS32_TLTI_class/";
		String testName = "MIPS32_TLTI_class_9";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TLTI_class_10() {
		System.out.println("   + Executing MIPS32_TLTI_class_tests_10 ...");
		String[] result = MIPS32_TLTI_class.MIPS32_TLTI('8', 335544320).split("->");
		String dir = "symips/jdart/MIPS32_TLTI_class/";
		String testName = "MIPS32_TLTI_class_10";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TLTI_class_11() {
		System.out.println("   + Executing MIPS32_TLTI_class_tests_11 ...");
		String[] result = MIPS32_TLTI_class.MIPS32_TLTI('8', 369098752).split("->");
		String dir = "symips/jdart/MIPS32_TLTI_class/";
		String testName = "MIPS32_TLTI_class_11";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TLTI_class_12() {
		System.out.println("   + Executing MIPS32_TLTI_class_tests_12 ...");
		String[] result = MIPS32_TLTI_class.MIPS32_TLTI('8', 402653184).split("->");
		String dir = "symips/jdart/MIPS32_TLTI_class/";
		String testName = "MIPS32_TLTI_class_12";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TLTI_class_13() {
		System.out.println("   + Executing MIPS32_TLTI_class_tests_13 ...");
		String[] result = MIPS32_TLTI_class.MIPS32_TLTI('8', 436207616).split("->");
		String dir = "symips/jdart/MIPS32_TLTI_class/";
		String testName = "MIPS32_TLTI_class_13";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TLTI_class_14() {
		System.out.println("   + Executing MIPS32_TLTI_class_tests_14 ...");
		String[] result = MIPS32_TLTI_class.MIPS32_TLTI('8', 469762048).split("->");
		String dir = "symips/jdart/MIPS32_TLTI_class/";
		String testName = "MIPS32_TLTI_class_14";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TLTI_class_15() {
		System.out.println("   + Executing MIPS32_TLTI_class_tests_15 ...");
		String[] result = MIPS32_TLTI_class.MIPS32_TLTI('8', 503316480).split("->");
		String dir = "symips/jdart/MIPS32_TLTI_class/";
		String testName = "MIPS32_TLTI_class_15";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TLTI_class_16() {
		System.out.println("   + Executing MIPS32_TLTI_class_tests_16 ...");
		String[] result = MIPS32_TLTI_class.MIPS32_TLTI('8', 570163199).split("->");
		String dir = "symips/jdart/MIPS32_TLTI_class/";
		String testName = "MIPS32_TLTI_class_16";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TLTI_class_17() {
		System.out.println("   + Executing MIPS32_TLTI_class_tests_17 ...");
		String[] result = MIPS32_TLTI_class.MIPS32_TLTI('8', 603455487).split("->");
		String dir = "symips/jdart/MIPS32_TLTI_class/";
		String testName = "MIPS32_TLTI_class_17";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TLTI_class_18() {
		System.out.println("   + Executing MIPS32_TLTI_class_tests_18 ...");
		String[] result = MIPS32_TLTI_class.MIPS32_TLTI('8', 637009919).split("->");
		String dir = "symips/jdart/MIPS32_TLTI_class/";
		String testName = "MIPS32_TLTI_class_18";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TLTI_class_19() {
		System.out.println("   + Executing MIPS32_TLTI_class_tests_19 ...");
		String[] result = MIPS32_TLTI_class.MIPS32_TLTI('8', 670040063).split("->");
		String dir = "symips/jdart/MIPS32_TLTI_class/";
		String testName = "MIPS32_TLTI_class_19";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TLTI_class_20() {
		System.out.println("   + Executing MIPS32_TLTI_class_tests_20 ...");
		String[] result = MIPS32_TLTI_class.MIPS32_TLTI('8', 704118783).split("->");
		String dir = "symips/jdart/MIPS32_TLTI_class/";
		String testName = "MIPS32_TLTI_class_20";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TLTI_class_21() {
		System.out.println("   + Executing MIPS32_TLTI_class_tests_21 ...");
		String[] result = MIPS32_TLTI_class.MIPS32_TLTI('8', 737148927).split("->");
		String dir = "symips/jdart/MIPS32_TLTI_class/";
		String testName = "MIPS32_TLTI_class_21";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TLTI_class_22() {
		System.out.println("   + Executing MIPS32_TLTI_class_tests_22 ...");
		String[] result = MIPS32_TLTI_class.MIPS32_TLTI('8', 770703359).split("->");
		String dir = "symips/jdart/MIPS32_TLTI_class/";
		String testName = "MIPS32_TLTI_class_22";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TLTI_class_23() {
		System.out.println("   + Executing MIPS32_TLTI_class_tests_23 ...");
		String[] result = MIPS32_TLTI_class.MIPS32_TLTI('8', 803209215).split("->");
		String dir = "symips/jdart/MIPS32_TLTI_class/";
		String testName = "MIPS32_TLTI_class_23";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TLTI_class_24() {
		System.out.println("   + Executing MIPS32_TLTI_class_tests_24 ...");
		String[] result = MIPS32_TLTI_class.MIPS32_TLTI('8', 805306368).split("->");
		String dir = "symips/jdart/MIPS32_TLTI_class/";
		String testName = "MIPS32_TLTI_class_24";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TLTI_class_25() {
		System.out.println("   + Executing MIPS32_TLTI_class_tests_25 ...");
		String[] result = MIPS32_TLTI_class.MIPS32_TLTI('8', 838860800).split("->");
		String dir = "symips/jdart/MIPS32_TLTI_class/";
		String testName = "MIPS32_TLTI_class_25";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TLTI_class_26() {
		System.out.println("   + Executing MIPS32_TLTI_class_tests_26 ...");
		String[] result = MIPS32_TLTI_class.MIPS32_TLTI('8', 904921087).split("->");
		String dir = "symips/jdart/MIPS32_TLTI_class/";
		String testName = "MIPS32_TLTI_class_26";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TLTI_class_27() {
		System.out.println("   + Executing MIPS32_TLTI_class_tests_27 ...");
		String[] result = MIPS32_TLTI_class.MIPS32_TLTI('8', 905969664).split("->");
		String dir = "symips/jdart/MIPS32_TLTI_class/";
		String testName = "MIPS32_TLTI_class_27";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TLTI_class_28() {
		System.out.println("   + Executing MIPS32_TLTI_class_tests_28 ...");
		String[] result = MIPS32_TLTI_class.MIPS32_TLTI('8', 972029951).split("->");
		String dir = "symips/jdart/MIPS32_TLTI_class/";
		String testName = "MIPS32_TLTI_class_28";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TLTI_class_29() {
		System.out.println("   + Executing MIPS32_TLTI_class_tests_29 ...");
		String[] result = MIPS32_TLTI_class.MIPS32_TLTI('8', 1004535807).split("->");
		String dir = "symips/jdart/MIPS32_TLTI_class/";
		String testName = "MIPS32_TLTI_class_29";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TLTI_class_30() {
		System.out.println("   + Executing MIPS32_TLTI_class_tests_30 ...");
		String[] result = MIPS32_TLTI_class.MIPS32_TLTI('8', 1038090239).split("->");
		String dir = "symips/jdart/MIPS32_TLTI_class/";
		String testName = "MIPS32_TLTI_class_30";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TLTI_class_31() {
		System.out.println("   + Executing MIPS32_TLTI_class_tests_31 ...");
		String[] result = MIPS32_TLTI_class.MIPS32_TLTI('8', 1069547519).split("->");
		String dir = "symips/jdart/MIPS32_TLTI_class/";
		String testName = "MIPS32_TLTI_class_31";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TLTI_class_32() {
		System.out.println("   + Executing MIPS32_TLTI_class_tests_32 ...");
		String[] result = MIPS32_TLTI_class.MIPS32_TLTI('8', 1107034111).split("->");
		String dir = "symips/jdart/MIPS32_TLTI_class/";
		String testName = "MIPS32_TLTI_class_32";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TLTI_class_33() {
		System.out.println("   + Executing MIPS32_TLTI_class_tests_33 ...");
		String[] result = MIPS32_TLTI_class.MIPS32_TLTI('8', 1140326399).split("->");
		String dir = "symips/jdart/MIPS32_TLTI_class/";
		String testName = "MIPS32_TLTI_class_33";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TLTI_class_34() {
		System.out.println("   + Executing MIPS32_TLTI_class_tests_34 ...");
		String[] result = MIPS32_TLTI_class.MIPS32_TLTI('8', 1173880831).split("->");
		String dir = "symips/jdart/MIPS32_TLTI_class/";
		String testName = "MIPS32_TLTI_class_34";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TLTI_class_35() {
		System.out.println("   + Executing MIPS32_TLTI_class_tests_35 ...");
		String[] result = MIPS32_TLTI_class.MIPS32_TLTI('8', 1206910975).split("->");
		String dir = "symips/jdart/MIPS32_TLTI_class/";
		String testName = "MIPS32_TLTI_class_35";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TLTI_class_36() {
		System.out.println("   + Executing MIPS32_TLTI_class_tests_36 ...");
		String[] result = MIPS32_TLTI_class.MIPS32_TLTI('8', 1240989695).split("->");
		String dir = "symips/jdart/MIPS32_TLTI_class/";
		String testName = "MIPS32_TLTI_class_36";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TLTI_class_37() {
		System.out.println("   + Executing MIPS32_TLTI_class_tests_37 ...");
		String[] result = MIPS32_TLTI_class.MIPS32_TLTI('8', 1274019839).split("->");
		String dir = "symips/jdart/MIPS32_TLTI_class/";
		String testName = "MIPS32_TLTI_class_37";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TLTI_class_38() {
		System.out.println("   + Executing MIPS32_TLTI_class_tests_38 ...");
		String[] result = MIPS32_TLTI_class.MIPS32_TLTI('8', 1307574271).split("->");
		String dir = "symips/jdart/MIPS32_TLTI_class/";
		String testName = "MIPS32_TLTI_class_38";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TLTI_class_39() {
		System.out.println("   + Executing MIPS32_TLTI_class_tests_39 ...");
		String[] result = MIPS32_TLTI_class.MIPS32_TLTI('8', 1340080127).split("->");
		String dir = "symips/jdart/MIPS32_TLTI_class/";
		String testName = "MIPS32_TLTI_class_39";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TLTI_class_40() {
		System.out.println("   + Executing MIPS32_TLTI_class_tests_40 ...");
		String[] result = MIPS32_TLTI_class.MIPS32_TLTI('8', 1375207423).split("->");
		String dir = "symips/jdart/MIPS32_TLTI_class/";
		String testName = "MIPS32_TLTI_class_40";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TLTI_class_41() {
		System.out.println("   + Executing MIPS32_TLTI_class_tests_41 ...");
		String[] result = MIPS32_TLTI_class.MIPS32_TLTI('8', 1408237567).split("->");
		String dir = "symips/jdart/MIPS32_TLTI_class/";
		String testName = "MIPS32_TLTI_class_41";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TLTI_class_42() {
		System.out.println("   + Executing MIPS32_TLTI_class_tests_42 ...");
		String[] result = MIPS32_TLTI_class.MIPS32_TLTI('8', 1441791999).split("->");
		String dir = "symips/jdart/MIPS32_TLTI_class/";
		String testName = "MIPS32_TLTI_class_42";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TLTI_class_43() {
		System.out.println("   + Executing MIPS32_TLTI_class_tests_43 ...");
		String[] result = MIPS32_TLTI_class.MIPS32_TLTI('8', 1474297855).split("->");
		String dir = "symips/jdart/MIPS32_TLTI_class/";
		String testName = "MIPS32_TLTI_class_43";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TLTI_class_44() {
		System.out.println("   + Executing MIPS32_TLTI_class_tests_44 ...");
		String[] result = MIPS32_TLTI_class.MIPS32_TLTI('8', 1508900863).split("->");
		String dir = "symips/jdart/MIPS32_TLTI_class/";
		String testName = "MIPS32_TLTI_class_44";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TLTI_class_45() {
		System.out.println("   + Executing MIPS32_TLTI_class_tests_45 ...");
		String[] result = MIPS32_TLTI_class.MIPS32_TLTI('8', 1541406719).split("->");
		String dir = "symips/jdart/MIPS32_TLTI_class/";
		String testName = "MIPS32_TLTI_class_45";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TLTI_class_46() {
		System.out.println("   + Executing MIPS32_TLTI_class_tests_46 ...");
		String[] result = MIPS32_TLTI_class.MIPS32_TLTI('8', 1574961151).split("->");
		String dir = "symips/jdart/MIPS32_TLTI_class/";
		String testName = "MIPS32_TLTI_class_46";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TLTI_class_47() {
		System.out.println("   + Executing MIPS32_TLTI_class_tests_47 ...");
		String[] result = MIPS32_TLTI_class.MIPS32_TLTI('8', 1606418431).split("->");
		String dir = "symips/jdart/MIPS32_TLTI_class/";
		String testName = "MIPS32_TLTI_class_47";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TLTI_class_48() {
		System.out.println("   + Executing MIPS32_TLTI_class_tests_48 ...");
		String[] result = MIPS32_TLTI_class.MIPS32_TLTI('8', 1643642879).split("->");
		String dir = "symips/jdart/MIPS32_TLTI_class/";
		String testName = "MIPS32_TLTI_class_48";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TLTI_class_49() {
		System.out.println("   + Executing MIPS32_TLTI_class_tests_49 ...");
		String[] result = MIPS32_TLTI_class.MIPS32_TLTI('8', 1676673023).split("->");
		String dir = "symips/jdart/MIPS32_TLTI_class/";
		String testName = "MIPS32_TLTI_class_49";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TLTI_class_50() {
		System.out.println("   + Executing MIPS32_TLTI_class_tests_50 ...");
		String[] result = MIPS32_TLTI_class.MIPS32_TLTI('8', 1710227455).split("->");
		String dir = "symips/jdart/MIPS32_TLTI_class/";
		String testName = "MIPS32_TLTI_class_50";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TLTI_class_51() {
		System.out.println("   + Executing MIPS32_TLTI_class_tests_51 ...");
		String[] result = MIPS32_TLTI_class.MIPS32_TLTI('8', 1742733311).split("->");
		String dir = "symips/jdart/MIPS32_TLTI_class/";
		String testName = "MIPS32_TLTI_class_51";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TLTI_class_52() {
		System.out.println("   + Executing MIPS32_TLTI_class_tests_52 ...");
		String[] result = MIPS32_TLTI_class.MIPS32_TLTI('8', 1777336319).split("->");
		String dir = "symips/jdart/MIPS32_TLTI_class/";
		String testName = "MIPS32_TLTI_class_52";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TLTI_class_53() {
		System.out.println("   + Executing MIPS32_TLTI_class_tests_53 ...");
		String[] result = MIPS32_TLTI_class.MIPS32_TLTI('8', 1809842175).split("->");
		String dir = "symips/jdart/MIPS32_TLTI_class/";
		String testName = "MIPS32_TLTI_class_53";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TLTI_class_54() {
		System.out.println("   + Executing MIPS32_TLTI_class_tests_54 ...");
		String[] result = MIPS32_TLTI_class.MIPS32_TLTI('8', 1843396607).split("->");
		String dir = "symips/jdart/MIPS32_TLTI_class/";
		String testName = "MIPS32_TLTI_class_54";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TLTI_class_55() {
		System.out.println("   + Executing MIPS32_TLTI_class_tests_55 ...");
		String[] result = MIPS32_TLTI_class.MIPS32_TLTI('8', 1874853887).split("->");
		String dir = "symips/jdart/MIPS32_TLTI_class/";
		String testName = "MIPS32_TLTI_class_55";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TLTI_class_56() {
		System.out.println("   + Executing MIPS32_TLTI_class_tests_56 ...");
		String[] result = MIPS32_TLTI_class.MIPS32_TLTI('8', 1911554047).split("->");
		String dir = "symips/jdart/MIPS32_TLTI_class/";
		String testName = "MIPS32_TLTI_class_56";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TLTI_class_57() {
		System.out.println("   + Executing MIPS32_TLTI_class_tests_57 ...");
		String[] result = MIPS32_TLTI_class.MIPS32_TLTI('8', 1944059903).split("->");
		String dir = "symips/jdart/MIPS32_TLTI_class/";
		String testName = "MIPS32_TLTI_class_57";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TLTI_class_58() {
		System.out.println("   + Executing MIPS32_TLTI_class_tests_58 ...");
		String[] result = MIPS32_TLTI_class.MIPS32_TLTI('8', 1977614335).split("->");
		String dir = "symips/jdart/MIPS32_TLTI_class/";
		String testName = "MIPS32_TLTI_class_58";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TLTI_class_59() {
		System.out.println("   + Executing MIPS32_TLTI_class_tests_59 ...");
		String[] result = MIPS32_TLTI_class.MIPS32_TLTI('8', 2009071615).split("->");
		String dir = "symips/jdart/MIPS32_TLTI_class/";
		String testName = "MIPS32_TLTI_class_59";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TLTI_class_60() {
		System.out.println("   + Executing MIPS32_TLTI_class_tests_60 ...");
		String[] result = MIPS32_TLTI_class.MIPS32_TLTI('8', 2044723199).split("->");
		String dir = "symips/jdart/MIPS32_TLTI_class/";
		String testName = "MIPS32_TLTI_class_60";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TLTI_class_61() {
		System.out.println("   + Executing MIPS32_TLTI_class_tests_61 ...");
		String[] result = MIPS32_TLTI_class.MIPS32_TLTI('8', 2076180479).split("->");
		String dir = "symips/jdart/MIPS32_TLTI_class/";
		String testName = "MIPS32_TLTI_class_61";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TLTI_class_62() {
		System.out.println("   + Executing MIPS32_TLTI_class_tests_62 ...");
		String[] result = MIPS32_TLTI_class.MIPS32_TLTI('8', 2109734911).split("->");
		String dir = "symips/jdart/MIPS32_TLTI_class/";
		String testName = "MIPS32_TLTI_class_62";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TLTI_class_63() {
		System.out.println("   + Executing MIPS32_TLTI_class_tests_63 ...");
		String[] result = MIPS32_TLTI_class.MIPS32_TLTI('8', 2139095039).split("->");
		String dir = "symips/jdart/MIPS32_TLTI_class/";
		String testName = "MIPS32_TLTI_class_63";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TLTI_class_64() {
		System.out.println("   + Executing MIPS32_TLTI_class_tests_64 ...");
		String[] result = MIPS32_TLTI_class.MIPS32_TLTI('8', -2147483648).split("->");
		String dir = "symips/jdart/MIPS32_TLTI_class/";
		String testName = "MIPS32_TLTI_class_64";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TLTI_class_65() {
		System.out.println("   + Executing MIPS32_TLTI_class_tests_65 ...");
		String[] result = MIPS32_TLTI_class.MIPS32_TLTI('8', -2113929216).split("->");
		String dir = "symips/jdart/MIPS32_TLTI_class/";
		String testName = "MIPS32_TLTI_class_65";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TLTI_class_66() {
		System.out.println("   + Executing MIPS32_TLTI_class_tests_66 ...");
		String[] result = MIPS32_TLTI_class.MIPS32_TLTI('8', -2080374784).split("->");
		String dir = "symips/jdart/MIPS32_TLTI_class/";
		String testName = "MIPS32_TLTI_class_66";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TLTI_class_67() {
		System.out.println("   + Executing MIPS32_TLTI_class_tests_67 ...");
		String[] result = MIPS32_TLTI_class.MIPS32_TLTI('8', -2046820352).split("->");
		String dir = "symips/jdart/MIPS32_TLTI_class/";
		String testName = "MIPS32_TLTI_class_67";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TLTI_class_68() {
		System.out.println("   + Executing MIPS32_TLTI_class_tests_68 ...");
		String[] result = MIPS32_TLTI_class.MIPS32_TLTI('8', -2013265920).split("->");
		String dir = "symips/jdart/MIPS32_TLTI_class/";
		String testName = "MIPS32_TLTI_class_68";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TLTI_class_69() {
		System.out.println("   + Executing MIPS32_TLTI_class_tests_69 ...");
		String[] result = MIPS32_TLTI_class.MIPS32_TLTI('8', -1979711488).split("->");
		String dir = "symips/jdart/MIPS32_TLTI_class/";
		String testName = "MIPS32_TLTI_class_69";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TLTI_class_70() {
		System.out.println("   + Executing MIPS32_TLTI_class_tests_70 ...");
		String[] result = MIPS32_TLTI_class.MIPS32_TLTI('8', -1946157056).split("->");
		String dir = "symips/jdart/MIPS32_TLTI_class/";
		String testName = "MIPS32_TLTI_class_70";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TLTI_class_71() {
		System.out.println("   + Executing MIPS32_TLTI_class_tests_71 ...");
		String[] result = MIPS32_TLTI_class.MIPS32_TLTI('8', -1912602624).split("->");
		String dir = "symips/jdart/MIPS32_TLTI_class/";
		String testName = "MIPS32_TLTI_class_71";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TLTI_class_72() {
		System.out.println("   + Executing MIPS32_TLTI_class_tests_72 ...");
		String[] result = MIPS32_TLTI_class.MIPS32_TLTI('8', -1879048192).split("->");
		String dir = "symips/jdart/MIPS32_TLTI_class/";
		String testName = "MIPS32_TLTI_class_72";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TLTI_class_73() {
		System.out.println("   + Executing MIPS32_TLTI_class_tests_73 ...");
		String[] result = MIPS32_TLTI_class.MIPS32_TLTI('8', -1845493760).split("->");
		String dir = "symips/jdart/MIPS32_TLTI_class/";
		String testName = "MIPS32_TLTI_class_73";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TLTI_class_74() {
		System.out.println("   + Executing MIPS32_TLTI_class_tests_74 ...");
		String[] result = MIPS32_TLTI_class.MIPS32_TLTI('8', -1811939328).split("->");
		String dir = "symips/jdart/MIPS32_TLTI_class/";
		String testName = "MIPS32_TLTI_class_74";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TLTI_class_75() {
		System.out.println("   + Executing MIPS32_TLTI_class_tests_75 ...");
		String[] result = MIPS32_TLTI_class.MIPS32_TLTI('8', -1778384896).split("->");
		String dir = "symips/jdart/MIPS32_TLTI_class/";
		String testName = "MIPS32_TLTI_class_75";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TLTI_class_76() {
		System.out.println("   + Executing MIPS32_TLTI_class_tests_76 ...");
		String[] result = MIPS32_TLTI_class.MIPS32_TLTI('8', -1744830464).split("->");
		String dir = "symips/jdart/MIPS32_TLTI_class/";
		String testName = "MIPS32_TLTI_class_76";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TLTI_class_77() {
		System.out.println("   + Executing MIPS32_TLTI_class_tests_77 ...");
		String[] result = MIPS32_TLTI_class.MIPS32_TLTI('8', -1711276032).split("->");
		String dir = "symips/jdart/MIPS32_TLTI_class/";
		String testName = "MIPS32_TLTI_class_77";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TLTI_class_78() {
		System.out.println("   + Executing MIPS32_TLTI_class_tests_78 ...");
		String[] result = MIPS32_TLTI_class.MIPS32_TLTI('8', -1677721600).split("->");
		String dir = "symips/jdart/MIPS32_TLTI_class/";
		String testName = "MIPS32_TLTI_class_78";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TLTI_class_79() {
		System.out.println("   + Executing MIPS32_TLTI_class_tests_79 ...");
		String[] result = MIPS32_TLTI_class.MIPS32_TLTI('8', -1644167168).split("->");
		String dir = "symips/jdart/MIPS32_TLTI_class/";
		String testName = "MIPS32_TLTI_class_79";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TLTI_class_80() {
		System.out.println("   + Executing MIPS32_TLTI_class_tests_80 ...");
		String[] result = MIPS32_TLTI_class.MIPS32_TLTI('8', -1610612736).split("->");
		String dir = "symips/jdart/MIPS32_TLTI_class/";
		String testName = "MIPS32_TLTI_class_80";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TLTI_class_81() {
		System.out.println("   + Executing MIPS32_TLTI_class_tests_81 ...");
		String[] result = MIPS32_TLTI_class.MIPS32_TLTI('8', -1577058304).split("->");
		String dir = "symips/jdart/MIPS32_TLTI_class/";
		String testName = "MIPS32_TLTI_class_81";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TLTI_class_82() {
		System.out.println("   + Executing MIPS32_TLTI_class_tests_82 ...");
		String[] result = MIPS32_TLTI_class.MIPS32_TLTI('8', -1543503872).split("->");
		String dir = "symips/jdart/MIPS32_TLTI_class/";
		String testName = "MIPS32_TLTI_class_82";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TLTI_class_83() {
		System.out.println("   + Executing MIPS32_TLTI_class_tests_83 ...");
		String[] result = MIPS32_TLTI_class.MIPS32_TLTI('8', -1509949440).split("->");
		String dir = "symips/jdart/MIPS32_TLTI_class/";
		String testName = "MIPS32_TLTI_class_83";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TLTI_class_84() {
		System.out.println("   + Executing MIPS32_TLTI_class_tests_84 ...");
		String[] result = MIPS32_TLTI_class.MIPS32_TLTI('8', -1476395008).split("->");
		String dir = "symips/jdart/MIPS32_TLTI_class/";
		String testName = "MIPS32_TLTI_class_84";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TLTI_class_85() {
		System.out.println("   + Executing MIPS32_TLTI_class_tests_85 ...");
		String[] result = MIPS32_TLTI_class.MIPS32_TLTI('8', -1442840576).split("->");
		String dir = "symips/jdart/MIPS32_TLTI_class/";
		String testName = "MIPS32_TLTI_class_85";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TLTI_class_86() {
		System.out.println("   + Executing MIPS32_TLTI_class_tests_86 ...");
		String[] result = MIPS32_TLTI_class.MIPS32_TLTI('8', -1409286144).split("->");
		String dir = "symips/jdart/MIPS32_TLTI_class/";
		String testName = "MIPS32_TLTI_class_86";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TLTI_class_87() {
		System.out.println("   + Executing MIPS32_TLTI_class_tests_87 ...");
		String[] result = MIPS32_TLTI_class.MIPS32_TLTI('8', -1375731712).split("->");
		String dir = "symips/jdart/MIPS32_TLTI_class/";
		String testName = "MIPS32_TLTI_class_87";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TLTI_class_88() {
		System.out.println("   + Executing MIPS32_TLTI_class_tests_88 ...");
		String[] result = MIPS32_TLTI_class.MIPS32_TLTI('8', -1342177280).split("->");
		String dir = "symips/jdart/MIPS32_TLTI_class/";
		String testName = "MIPS32_TLTI_class_88";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TLTI_class_89() {
		System.out.println("   + Executing MIPS32_TLTI_class_tests_89 ...");
		String[] result = MIPS32_TLTI_class.MIPS32_TLTI('8', -1308622848).split("->");
		String dir = "symips/jdart/MIPS32_TLTI_class/";
		String testName = "MIPS32_TLTI_class_89";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TLTI_class_90() {
		System.out.println("   + Executing MIPS32_TLTI_class_tests_90 ...");
		String[] result = MIPS32_TLTI_class.MIPS32_TLTI('8', -1275068416).split("->");
		String dir = "symips/jdart/MIPS32_TLTI_class/";
		String testName = "MIPS32_TLTI_class_90";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TLTI_class_91() {
		System.out.println("   + Executing MIPS32_TLTI_class_tests_91 ...");
		String[] result = MIPS32_TLTI_class.MIPS32_TLTI('8', -1241513984).split("->");
		String dir = "symips/jdart/MIPS32_TLTI_class/";
		String testName = "MIPS32_TLTI_class_91";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TLTI_class_92() {
		System.out.println("   + Executing MIPS32_TLTI_class_tests_92 ...");
		String[] result = MIPS32_TLTI_class.MIPS32_TLTI('8', -1207959552).split("->");
		String dir = "symips/jdart/MIPS32_TLTI_class/";
		String testName = "MIPS32_TLTI_class_92";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TLTI_class_93() {
		System.out.println("   + Executing MIPS32_TLTI_class_tests_93 ...");
		String[] result = MIPS32_TLTI_class.MIPS32_TLTI('8', -1174405120).split("->");
		String dir = "symips/jdart/MIPS32_TLTI_class/";
		String testName = "MIPS32_TLTI_class_93";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TLTI_class_94() {
		System.out.println("   + Executing MIPS32_TLTI_class_tests_94 ...");
		String[] result = MIPS32_TLTI_class.MIPS32_TLTI('8', -1140850688).split("->");
		String dir = "symips/jdart/MIPS32_TLTI_class/";
		String testName = "MIPS32_TLTI_class_94";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TLTI_class_95() {
		System.out.println("   + Executing MIPS32_TLTI_class_tests_95 ...");
		String[] result = MIPS32_TLTI_class.MIPS32_TLTI('8', -1107296256).split("->");
		String dir = "symips/jdart/MIPS32_TLTI_class/";
		String testName = "MIPS32_TLTI_class_95";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TLTI_class_96() {
		System.out.println("   + Executing MIPS32_TLTI_class_tests_96 ...");
		String[] result = MIPS32_TLTI_class.MIPS32_TLTI('8', -1073741824).split("->");
		String dir = "symips/jdart/MIPS32_TLTI_class/";
		String testName = "MIPS32_TLTI_class_96";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TLTI_class_97() {
		System.out.println("   + Executing MIPS32_TLTI_class_tests_97 ...");
		String[] result = MIPS32_TLTI_class.MIPS32_TLTI('8', -1040187392).split("->");
		String dir = "symips/jdart/MIPS32_TLTI_class/";
		String testName = "MIPS32_TLTI_class_97";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TLTI_class_98() {
		System.out.println("   + Executing MIPS32_TLTI_class_tests_98 ...");
		String[] result = MIPS32_TLTI_class.MIPS32_TLTI('8', -1006632960).split("->");
		String dir = "symips/jdart/MIPS32_TLTI_class/";
		String testName = "MIPS32_TLTI_class_98";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TLTI_class_99() {
		System.out.println("   + Executing MIPS32_TLTI_class_tests_99 ...");
		String[] result = MIPS32_TLTI_class.MIPS32_TLTI('8', -973078528).split("->");
		String dir = "symips/jdart/MIPS32_TLTI_class/";
		String testName = "MIPS32_TLTI_class_99";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TLTI_class_100() {
		System.out.println("   + Executing MIPS32_TLTI_class_tests_100 ...");
		String[] result = MIPS32_TLTI_class.MIPS32_TLTI('8', -939524096).split("->");
		String dir = "symips/jdart/MIPS32_TLTI_class/";
		String testName = "MIPS32_TLTI_class_100";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TLTI_class_101() {
		System.out.println("   + Executing MIPS32_TLTI_class_tests_101 ...");
		String[] result = MIPS32_TLTI_class.MIPS32_TLTI('8', -905969664).split("->");
		String dir = "symips/jdart/MIPS32_TLTI_class/";
		String testName = "MIPS32_TLTI_class_101";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TLTI_class_102() {
		System.out.println("   + Executing MIPS32_TLTI_class_tests_102 ...");
		String[] result = MIPS32_TLTI_class.MIPS32_TLTI('8', -872415232).split("->");
		String dir = "symips/jdart/MIPS32_TLTI_class/";
		String testName = "MIPS32_TLTI_class_102";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TLTI_class_103() {
		System.out.println("   + Executing MIPS32_TLTI_class_tests_103 ...");
		String[] result = MIPS32_TLTI_class.MIPS32_TLTI('8', -838860800).split("->");
		String dir = "symips/jdart/MIPS32_TLTI_class/";
		String testName = "MIPS32_TLTI_class_103";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TLTI_class_104() {
		System.out.println("   + Executing MIPS32_TLTI_class_tests_104 ...");
		String[] result = MIPS32_TLTI_class.MIPS32_TLTI('8', -805306368).split("->");
		String dir = "symips/jdart/MIPS32_TLTI_class/";
		String testName = "MIPS32_TLTI_class_104";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TLTI_class_105() {
		System.out.println("   + Executing MIPS32_TLTI_class_tests_105 ...");
		String[] result = MIPS32_TLTI_class.MIPS32_TLTI('8', -771751936).split("->");
		String dir = "symips/jdart/MIPS32_TLTI_class/";
		String testName = "MIPS32_TLTI_class_105";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TLTI_class_106() {
		System.out.println("   + Executing MIPS32_TLTI_class_tests_106 ...");
		String[] result = MIPS32_TLTI_class.MIPS32_TLTI('8', -738197504).split("->");
		String dir = "symips/jdart/MIPS32_TLTI_class/";
		String testName = "MIPS32_TLTI_class_106";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TLTI_class_107() {
		System.out.println("   + Executing MIPS32_TLTI_class_tests_107 ...");
		String[] result = MIPS32_TLTI_class.MIPS32_TLTI('8', -704643072).split("->");
		String dir = "symips/jdart/MIPS32_TLTI_class/";
		String testName = "MIPS32_TLTI_class_107";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TLTI_class_108() {
		System.out.println("   + Executing MIPS32_TLTI_class_tests_108 ...");
		String[] result = MIPS32_TLTI_class.MIPS32_TLTI('8', -671088640).split("->");
		String dir = "symips/jdart/MIPS32_TLTI_class/";
		String testName = "MIPS32_TLTI_class_108";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TLTI_class_109() {
		System.out.println("   + Executing MIPS32_TLTI_class_tests_109 ...");
		String[] result = MIPS32_TLTI_class.MIPS32_TLTI('8', -637534208).split("->");
		String dir = "symips/jdart/MIPS32_TLTI_class/";
		String testName = "MIPS32_TLTI_class_109";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TLTI_class_110() {
		System.out.println("   + Executing MIPS32_TLTI_class_tests_110 ...");
		String[] result = MIPS32_TLTI_class.MIPS32_TLTI('8', -603979776).split("->");
		String dir = "symips/jdart/MIPS32_TLTI_class/";
		String testName = "MIPS32_TLTI_class_110";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TLTI_class_111() {
		System.out.println("   + Executing MIPS32_TLTI_class_tests_111 ...");
		String[] result = MIPS32_TLTI_class.MIPS32_TLTI('8', -570425344).split("->");
		String dir = "symips/jdart/MIPS32_TLTI_class/";
		String testName = "MIPS32_TLTI_class_111";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TLTI_class_112() {
		System.out.println("   + Executing MIPS32_TLTI_class_tests_112 ...");
		String[] result = MIPS32_TLTI_class.MIPS32_TLTI('8', -536870912).split("->");
		String dir = "symips/jdart/MIPS32_TLTI_class/";
		String testName = "MIPS32_TLTI_class_112";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TLTI_class_113() {
		System.out.println("   + Executing MIPS32_TLTI_class_tests_113 ...");
		String[] result = MIPS32_TLTI_class.MIPS32_TLTI('8', -503316480).split("->");
		String dir = "symips/jdart/MIPS32_TLTI_class/";
		String testName = "MIPS32_TLTI_class_113";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TLTI_class_114() {
		System.out.println("   + Executing MIPS32_TLTI_class_tests_114 ...");
		String[] result = MIPS32_TLTI_class.MIPS32_TLTI('8', -469762048).split("->");
		String dir = "symips/jdart/MIPS32_TLTI_class/";
		String testName = "MIPS32_TLTI_class_114";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TLTI_class_115() {
		System.out.println("   + Executing MIPS32_TLTI_class_tests_115 ...");
		String[] result = MIPS32_TLTI_class.MIPS32_TLTI('8', -436207616).split("->");
		String dir = "symips/jdart/MIPS32_TLTI_class/";
		String testName = "MIPS32_TLTI_class_115";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TLTI_class_116() {
		System.out.println("   + Executing MIPS32_TLTI_class_tests_116 ...");
		String[] result = MIPS32_TLTI_class.MIPS32_TLTI('8', -402653184).split("->");
		String dir = "symips/jdart/MIPS32_TLTI_class/";
		String testName = "MIPS32_TLTI_class_116";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TLTI_class_117() {
		System.out.println("   + Executing MIPS32_TLTI_class_tests_117 ...");
		String[] result = MIPS32_TLTI_class.MIPS32_TLTI('8', -369098752).split("->");
		String dir = "symips/jdart/MIPS32_TLTI_class/";
		String testName = "MIPS32_TLTI_class_117";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TLTI_class_118() {
		System.out.println("   + Executing MIPS32_TLTI_class_tests_118 ...");
		String[] result = MIPS32_TLTI_class.MIPS32_TLTI('8', -335544320).split("->");
		String dir = "symips/jdart/MIPS32_TLTI_class/";
		String testName = "MIPS32_TLTI_class_118";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TLTI_class_119() {
		System.out.println("   + Executing MIPS32_TLTI_class_tests_119 ...");
		String[] result = MIPS32_TLTI_class.MIPS32_TLTI('8', -301989888).split("->");
		String dir = "symips/jdart/MIPS32_TLTI_class/";
		String testName = "MIPS32_TLTI_class_119";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TLTI_class_120() {
		System.out.println("   + Executing MIPS32_TLTI_class_tests_120 ...");
		String[] result = MIPS32_TLTI_class.MIPS32_TLTI('8', -268435456).split("->");
		String dir = "symips/jdart/MIPS32_TLTI_class/";
		String testName = "MIPS32_TLTI_class_120";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TLTI_class_121() {
		System.out.println("   + Executing MIPS32_TLTI_class_tests_121 ...");
		String[] result = MIPS32_TLTI_class.MIPS32_TLTI('8', -234881024).split("->");
		String dir = "symips/jdart/MIPS32_TLTI_class/";
		String testName = "MIPS32_TLTI_class_121";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TLTI_class_122() {
		System.out.println("   + Executing MIPS32_TLTI_class_tests_122 ...");
		String[] result = MIPS32_TLTI_class.MIPS32_TLTI('8', -201326592).split("->");
		String dir = "symips/jdart/MIPS32_TLTI_class/";
		String testName = "MIPS32_TLTI_class_122";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TLTI_class_123() {
		System.out.println("   + Executing MIPS32_TLTI_class_tests_123 ...");
		String[] result = MIPS32_TLTI_class.MIPS32_TLTI('8', -167772160).split("->");
		String dir = "symips/jdart/MIPS32_TLTI_class/";
		String testName = "MIPS32_TLTI_class_123";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TLTI_class_124() {
		System.out.println("   + Executing MIPS32_TLTI_class_tests_124 ...");
		String[] result = MIPS32_TLTI_class.MIPS32_TLTI('8', -134217728).split("->");
		String dir = "symips/jdart/MIPS32_TLTI_class/";
		String testName = "MIPS32_TLTI_class_124";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TLTI_class_125() {
		System.out.println("   + Executing MIPS32_TLTI_class_tests_125 ...");
		String[] result = MIPS32_TLTI_class.MIPS32_TLTI('8', -100663296).split("->");
		String dir = "symips/jdart/MIPS32_TLTI_class/";
		String testName = "MIPS32_TLTI_class_125";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TLTI_class_126() {
		System.out.println("   + Executing MIPS32_TLTI_class_tests_126 ...");
		String[] result = MIPS32_TLTI_class.MIPS32_TLTI('8', -67108864).split("->");
		String dir = "symips/jdart/MIPS32_TLTI_class/";
		String testName = "MIPS32_TLTI_class_126";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TLTI_class_127() {
		System.out.println("   + Executing MIPS32_TLTI_class_tests_127 ...");
		String[] result = MIPS32_TLTI_class.MIPS32_TLTI('8', -33554432).split("->");
		String dir = "symips/jdart/MIPS32_TLTI_class/";
		String testName = "MIPS32_TLTI_class_127";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TLTI_class_128() {
		System.out.println("   + Executing MIPS32_TLTI_class_tests_128 ...");
		String[] result = MIPS32_TLTI_class.MIPS32_TLTI('8', 0).split("->");
		String dir = "symips/jdart/MIPS32_TLTI_class/";
		String testName = "MIPS32_TLTI_class_128";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_SELNEZ_class_0() {
		System.out.println("   + Executing microMIPS_SELNEZ_class_tests_0 ...");
		String[] result = microMIPS_SELNEZ_class.microMIPS_SELNEZ('j', 'f', '2').split("->");
		String dir = "symips/jdart/microMIPS_SELNEZ_class/";
		String testName = "microMIPS_SELNEZ_class_0";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_AND_class_0() {
		System.out.println("   + Executing microMIPS_AND_class_tests_0 ...");
		String[] result = microMIPS_AND_class.microMIPS_AND('2', 'g', 'o').split("->");
		String dir = "symips/jdart/microMIPS_AND_class/";
		String testName = "microMIPS_AND_class_0";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TGEIU_class_0() {
		System.out.println("   + Executing MIPS32_TGEIU_class_tests_0 ...");
		String[] result = MIPS32_TGEIU_class.MIPS32_TGEIU('a', 426).split("->");
		String dir = "symips/jdart/MIPS32_TGEIU_class/";
		String testName = "MIPS32_TGEIU_class_0";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TGEIU_class_1() {
		System.out.println("   + Executing MIPS32_TGEIU_class_tests_1 ...");
		String[] result = MIPS32_TGEIU_class.MIPS32_TGEIU('a', 33554432).split("->");
		String dir = "symips/jdart/MIPS32_TGEIU_class/";
		String testName = "MIPS32_TGEIU_class_1";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TGEIU_class_2() {
		System.out.println("   + Executing MIPS32_TGEIU_class_tests_2 ...");
		String[] result = MIPS32_TGEIU_class.MIPS32_TGEIU('a', 67108864).split("->");
		String dir = "symips/jdart/MIPS32_TGEIU_class/";
		String testName = "MIPS32_TGEIU_class_2";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TGEIU_class_3() {
		System.out.println("   + Executing MIPS32_TGEIU_class_tests_3 ...");
		String[] result = MIPS32_TGEIU_class.MIPS32_TGEIU('a', 100663296).split("->");
		String dir = "symips/jdart/MIPS32_TGEIU_class/";
		String testName = "MIPS32_TGEIU_class_3";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TGEIU_class_4() {
		System.out.println("   + Executing MIPS32_TGEIU_class_tests_4 ...");
		String[] result = MIPS32_TGEIU_class.MIPS32_TGEIU('a', 134217728).split("->");
		String dir = "symips/jdart/MIPS32_TGEIU_class/";
		String testName = "MIPS32_TGEIU_class_4";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TGEIU_class_5() {
		System.out.println("   + Executing MIPS32_TGEIU_class_tests_5 ...");
		String[] result = MIPS32_TGEIU_class.MIPS32_TGEIU('a', 167772160).split("->");
		String dir = "symips/jdart/MIPS32_TGEIU_class/";
		String testName = "MIPS32_TGEIU_class_5";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TGEIU_class_6() {
		System.out.println("   + Executing MIPS32_TGEIU_class_tests_6 ...");
		String[] result = MIPS32_TGEIU_class.MIPS32_TGEIU('a', 201326592).split("->");
		String dir = "symips/jdart/MIPS32_TGEIU_class/";
		String testName = "MIPS32_TGEIU_class_6";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TGEIU_class_7() {
		System.out.println("   + Executing MIPS32_TGEIU_class_tests_7 ...");
		String[] result = MIPS32_TGEIU_class.MIPS32_TGEIU('a', 234881024).split("->");
		String dir = "symips/jdart/MIPS32_TGEIU_class/";
		String testName = "MIPS32_TGEIU_class_7";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TGEIU_class_8() {
		System.out.println("   + Executing MIPS32_TGEIU_class_tests_8 ...");
		String[] result = MIPS32_TGEIU_class.MIPS32_TGEIU('a', 268435456).split("->");
		String dir = "symips/jdart/MIPS32_TGEIU_class/";
		String testName = "MIPS32_TGEIU_class_8";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TGEIU_class_9() {
		System.out.println("   + Executing MIPS32_TGEIU_class_tests_9 ...");
		String[] result = MIPS32_TGEIU_class.MIPS32_TGEIU('a', 301989888).split("->");
		String dir = "symips/jdart/MIPS32_TGEIU_class/";
		String testName = "MIPS32_TGEIU_class_9";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TGEIU_class_10() {
		System.out.println("   + Executing MIPS32_TGEIU_class_tests_10 ...");
		String[] result = MIPS32_TGEIU_class.MIPS32_TGEIU('a', 335544320).split("->");
		String dir = "symips/jdart/MIPS32_TGEIU_class/";
		String testName = "MIPS32_TGEIU_class_10";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TGEIU_class_11() {
		System.out.println("   + Executing MIPS32_TGEIU_class_tests_11 ...");
		String[] result = MIPS32_TGEIU_class.MIPS32_TGEIU('a', 369098752).split("->");
		String dir = "symips/jdart/MIPS32_TGEIU_class/";
		String testName = "MIPS32_TGEIU_class_11";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TGEIU_class_12() {
		System.out.println("   + Executing MIPS32_TGEIU_class_tests_12 ...");
		String[] result = MIPS32_TGEIU_class.MIPS32_TGEIU('a', 402653184).split("->");
		String dir = "symips/jdart/MIPS32_TGEIU_class/";
		String testName = "MIPS32_TGEIU_class_12";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TGEIU_class_13() {
		System.out.println("   + Executing MIPS32_TGEIU_class_tests_13 ...");
		String[] result = MIPS32_TGEIU_class.MIPS32_TGEIU('a', 436207616).split("->");
		String dir = "symips/jdart/MIPS32_TGEIU_class/";
		String testName = "MIPS32_TGEIU_class_13";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TGEIU_class_14() {
		System.out.println("   + Executing MIPS32_TGEIU_class_tests_14 ...");
		String[] result = MIPS32_TGEIU_class.MIPS32_TGEIU('a', 469762048).split("->");
		String dir = "symips/jdart/MIPS32_TGEIU_class/";
		String testName = "MIPS32_TGEIU_class_14";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TGEIU_class_15() {
		System.out.println("   + Executing MIPS32_TGEIU_class_tests_15 ...");
		String[] result = MIPS32_TGEIU_class.MIPS32_TGEIU('a', 503316480).split("->");
		String dir = "symips/jdart/MIPS32_TGEIU_class/";
		String testName = "MIPS32_TGEIU_class_15";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TGEIU_class_16() {
		System.out.println("   + Executing MIPS32_TGEIU_class_tests_16 ...");
		String[] result = MIPS32_TGEIU_class.MIPS32_TGEIU('a', 570163199).split("->");
		String dir = "symips/jdart/MIPS32_TGEIU_class/";
		String testName = "MIPS32_TGEIU_class_16";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TGEIU_class_17() {
		System.out.println("   + Executing MIPS32_TGEIU_class_tests_17 ...");
		String[] result = MIPS32_TGEIU_class.MIPS32_TGEIU('a', 603455487).split("->");
		String dir = "symips/jdart/MIPS32_TGEIU_class/";
		String testName = "MIPS32_TGEIU_class_17";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TGEIU_class_18() {
		System.out.println("   + Executing MIPS32_TGEIU_class_tests_18 ...");
		String[] result = MIPS32_TGEIU_class.MIPS32_TGEIU('a', 637009919).split("->");
		String dir = "symips/jdart/MIPS32_TGEIU_class/";
		String testName = "MIPS32_TGEIU_class_18";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TGEIU_class_19() {
		System.out.println("   + Executing MIPS32_TGEIU_class_tests_19 ...");
		String[] result = MIPS32_TGEIU_class.MIPS32_TGEIU('a', 670040063).split("->");
		String dir = "symips/jdart/MIPS32_TGEIU_class/";
		String testName = "MIPS32_TGEIU_class_19";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TGEIU_class_20() {
		System.out.println("   + Executing MIPS32_TGEIU_class_tests_20 ...");
		String[] result = MIPS32_TGEIU_class.MIPS32_TGEIU('a', 704118783).split("->");
		String dir = "symips/jdart/MIPS32_TGEIU_class/";
		String testName = "MIPS32_TGEIU_class_20";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TGEIU_class_21() {
		System.out.println("   + Executing MIPS32_TGEIU_class_tests_21 ...");
		String[] result = MIPS32_TGEIU_class.MIPS32_TGEIU('a', 737148927).split("->");
		String dir = "symips/jdart/MIPS32_TGEIU_class/";
		String testName = "MIPS32_TGEIU_class_21";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TGEIU_class_22() {
		System.out.println("   + Executing MIPS32_TGEIU_class_tests_22 ...");
		String[] result = MIPS32_TGEIU_class.MIPS32_TGEIU('a', 770703359).split("->");
		String dir = "symips/jdart/MIPS32_TGEIU_class/";
		String testName = "MIPS32_TGEIU_class_22";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TGEIU_class_23() {
		System.out.println("   + Executing MIPS32_TGEIU_class_tests_23 ...");
		String[] result = MIPS32_TGEIU_class.MIPS32_TGEIU('a', 803209215).split("->");
		String dir = "symips/jdart/MIPS32_TGEIU_class/";
		String testName = "MIPS32_TGEIU_class_23";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TGEIU_class_24() {
		System.out.println("   + Executing MIPS32_TGEIU_class_tests_24 ...");
		String[] result = MIPS32_TGEIU_class.MIPS32_TGEIU('a', 838336511).split("->");
		String dir = "symips/jdart/MIPS32_TGEIU_class/";
		String testName = "MIPS32_TGEIU_class_24";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TGEIU_class_25() {
		System.out.println("   + Executing MIPS32_TGEIU_class_tests_25 ...");
		String[] result = MIPS32_TGEIU_class.MIPS32_TGEIU('a', 871366655).split("->");
		String dir = "symips/jdart/MIPS32_TGEIU_class/";
		String testName = "MIPS32_TGEIU_class_25";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TGEIU_class_26() {
		System.out.println("   + Executing MIPS32_TGEIU_class_tests_26 ...");
		String[] result = MIPS32_TGEIU_class.MIPS32_TGEIU('a', 904921087).split("->");
		String dir = "symips/jdart/MIPS32_TGEIU_class/";
		String testName = "MIPS32_TGEIU_class_26";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TGEIU_class_27() {
		System.out.println("   + Executing MIPS32_TGEIU_class_tests_27 ...");
		String[] result = MIPS32_TGEIU_class.MIPS32_TGEIU('a', 937426943).split("->");
		String dir = "symips/jdart/MIPS32_TGEIU_class/";
		String testName = "MIPS32_TGEIU_class_27";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TGEIU_class_28() {
		System.out.println("   + Executing MIPS32_TGEIU_class_tests_28 ...");
		String[] result = MIPS32_TGEIU_class.MIPS32_TGEIU('a', 972029951).split("->");
		String dir = "symips/jdart/MIPS32_TGEIU_class/";
		String testName = "MIPS32_TGEIU_class_28";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TGEIU_class_29() {
		System.out.println("   + Executing MIPS32_TGEIU_class_tests_29 ...");
		String[] result = MIPS32_TGEIU_class.MIPS32_TGEIU('a', 1004535807).split("->");
		String dir = "symips/jdart/MIPS32_TGEIU_class/";
		String testName = "MIPS32_TGEIU_class_29";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TGEIU_class_30() {
		System.out.println("   + Executing MIPS32_TGEIU_class_tests_30 ...");
		String[] result = MIPS32_TGEIU_class.MIPS32_TGEIU('a', 1038090239).split("->");
		String dir = "symips/jdart/MIPS32_TGEIU_class/";
		String testName = "MIPS32_TGEIU_class_30";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TGEIU_class_31() {
		System.out.println("   + Executing MIPS32_TGEIU_class_tests_31 ...");
		String[] result = MIPS32_TGEIU_class.MIPS32_TGEIU('a', 1069547519).split("->");
		String dir = "symips/jdart/MIPS32_TGEIU_class/";
		String testName = "MIPS32_TGEIU_class_31";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TGEIU_class_32() {
		System.out.println("   + Executing MIPS32_TGEIU_class_tests_32 ...");
		String[] result = MIPS32_TGEIU_class.MIPS32_TGEIU('a', 1107034111).split("->");
		String dir = "symips/jdart/MIPS32_TGEIU_class/";
		String testName = "MIPS32_TGEIU_class_32";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TGEIU_class_33() {
		System.out.println("   + Executing MIPS32_TGEIU_class_tests_33 ...");
		String[] result = MIPS32_TGEIU_class.MIPS32_TGEIU('a', 1140326399).split("->");
		String dir = "symips/jdart/MIPS32_TGEIU_class/";
		String testName = "MIPS32_TGEIU_class_33";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TGEIU_class_34() {
		System.out.println("   + Executing MIPS32_TGEIU_class_tests_34 ...");
		String[] result = MIPS32_TGEIU_class.MIPS32_TGEIU('a', 1173880831).split("->");
		String dir = "symips/jdart/MIPS32_TGEIU_class/";
		String testName = "MIPS32_TGEIU_class_34";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TGEIU_class_35() {
		System.out.println("   + Executing MIPS32_TGEIU_class_tests_35 ...");
		String[] result = MIPS32_TGEIU_class.MIPS32_TGEIU('a', 1206910975).split("->");
		String dir = "symips/jdart/MIPS32_TGEIU_class/";
		String testName = "MIPS32_TGEIU_class_35";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TGEIU_class_36() {
		System.out.println("   + Executing MIPS32_TGEIU_class_tests_36 ...");
		String[] result = MIPS32_TGEIU_class.MIPS32_TGEIU('a', 1240989695).split("->");
		String dir = "symips/jdart/MIPS32_TGEIU_class/";
		String testName = "MIPS32_TGEIU_class_36";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TGEIU_class_37() {
		System.out.println("   + Executing MIPS32_TGEIU_class_tests_37 ...");
		String[] result = MIPS32_TGEIU_class.MIPS32_TGEIU('a', 1274019839).split("->");
		String dir = "symips/jdart/MIPS32_TGEIU_class/";
		String testName = "MIPS32_TGEIU_class_37";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TGEIU_class_38() {
		System.out.println("   + Executing MIPS32_TGEIU_class_tests_38 ...");
		String[] result = MIPS32_TGEIU_class.MIPS32_TGEIU('a', 1307574271).split("->");
		String dir = "symips/jdart/MIPS32_TGEIU_class/";
		String testName = "MIPS32_TGEIU_class_38";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TGEIU_class_39() {
		System.out.println("   + Executing MIPS32_TGEIU_class_tests_39 ...");
		String[] result = MIPS32_TGEIU_class.MIPS32_TGEIU('a', 1340080127).split("->");
		String dir = "symips/jdart/MIPS32_TGEIU_class/";
		String testName = "MIPS32_TGEIU_class_39";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TGEIU_class_40() {
		System.out.println("   + Executing MIPS32_TGEIU_class_tests_40 ...");
		String[] result = MIPS32_TGEIU_class.MIPS32_TGEIU('a', 1375207423).split("->");
		String dir = "symips/jdart/MIPS32_TGEIU_class/";
		String testName = "MIPS32_TGEIU_class_40";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TGEIU_class_41() {
		System.out.println("   + Executing MIPS32_TGEIU_class_tests_41 ...");
		String[] result = MIPS32_TGEIU_class.MIPS32_TGEIU('a', 1408237567).split("->");
		String dir = "symips/jdart/MIPS32_TGEIU_class/";
		String testName = "MIPS32_TGEIU_class_41";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TGEIU_class_42() {
		System.out.println("   + Executing MIPS32_TGEIU_class_tests_42 ...");
		String[] result = MIPS32_TGEIU_class.MIPS32_TGEIU('a', 1441791999).split("->");
		String dir = "symips/jdart/MIPS32_TGEIU_class/";
		String testName = "MIPS32_TGEIU_class_42";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TGEIU_class_43() {
		System.out.println("   + Executing MIPS32_TGEIU_class_tests_43 ...");
		String[] result = MIPS32_TGEIU_class.MIPS32_TGEIU('a', 1474297855).split("->");
		String dir = "symips/jdart/MIPS32_TGEIU_class/";
		String testName = "MIPS32_TGEIU_class_43";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TGEIU_class_44() {
		System.out.println("   + Executing MIPS32_TGEIU_class_tests_44 ...");
		String[] result = MIPS32_TGEIU_class.MIPS32_TGEIU('a', 1508900863).split("->");
		String dir = "symips/jdart/MIPS32_TGEIU_class/";
		String testName = "MIPS32_TGEIU_class_44";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TGEIU_class_45() {
		System.out.println("   + Executing MIPS32_TGEIU_class_tests_45 ...");
		String[] result = MIPS32_TGEIU_class.MIPS32_TGEIU('a', 1541406719).split("->");
		String dir = "symips/jdart/MIPS32_TGEIU_class/";
		String testName = "MIPS32_TGEIU_class_45";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TGEIU_class_46() {
		System.out.println("   + Executing MIPS32_TGEIU_class_tests_46 ...");
		String[] result = MIPS32_TGEIU_class.MIPS32_TGEIU('a', 1574961151).split("->");
		String dir = "symips/jdart/MIPS32_TGEIU_class/";
		String testName = "MIPS32_TGEIU_class_46";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TGEIU_class_47() {
		System.out.println("   + Executing MIPS32_TGEIU_class_tests_47 ...");
		String[] result = MIPS32_TGEIU_class.MIPS32_TGEIU('a', 1606418431).split("->");
		String dir = "symips/jdart/MIPS32_TGEIU_class/";
		String testName = "MIPS32_TGEIU_class_47";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TGEIU_class_48() {
		System.out.println("   + Executing MIPS32_TGEIU_class_tests_48 ...");
		String[] result = MIPS32_TGEIU_class.MIPS32_TGEIU('a', 1643642879).split("->");
		String dir = "symips/jdart/MIPS32_TGEIU_class/";
		String testName = "MIPS32_TGEIU_class_48";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TGEIU_class_49() {
		System.out.println("   + Executing MIPS32_TGEIU_class_tests_49 ...");
		String[] result = MIPS32_TGEIU_class.MIPS32_TGEIU('a', 1676673023).split("->");
		String dir = "symips/jdart/MIPS32_TGEIU_class/";
		String testName = "MIPS32_TGEIU_class_49";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TGEIU_class_50() {
		System.out.println("   + Executing MIPS32_TGEIU_class_tests_50 ...");
		String[] result = MIPS32_TGEIU_class.MIPS32_TGEIU('a', 1710227455).split("->");
		String dir = "symips/jdart/MIPS32_TGEIU_class/";
		String testName = "MIPS32_TGEIU_class_50";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TGEIU_class_51() {
		System.out.println("   + Executing MIPS32_TGEIU_class_tests_51 ...");
		String[] result = MIPS32_TGEIU_class.MIPS32_TGEIU('a', 1742733311).split("->");
		String dir = "symips/jdart/MIPS32_TGEIU_class/";
		String testName = "MIPS32_TGEIU_class_51";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TGEIU_class_52() {
		System.out.println("   + Executing MIPS32_TGEIU_class_tests_52 ...");
		String[] result = MIPS32_TGEIU_class.MIPS32_TGEIU('a', 1777336319).split("->");
		String dir = "symips/jdart/MIPS32_TGEIU_class/";
		String testName = "MIPS32_TGEIU_class_52";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TGEIU_class_53() {
		System.out.println("   + Executing MIPS32_TGEIU_class_tests_53 ...");
		String[] result = MIPS32_TGEIU_class.MIPS32_TGEIU('a', 1809842175).split("->");
		String dir = "symips/jdart/MIPS32_TGEIU_class/";
		String testName = "MIPS32_TGEIU_class_53";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TGEIU_class_54() {
		System.out.println("   + Executing MIPS32_TGEIU_class_tests_54 ...");
		String[] result = MIPS32_TGEIU_class.MIPS32_TGEIU('a', 1843396607).split("->");
		String dir = "symips/jdart/MIPS32_TGEIU_class/";
		String testName = "MIPS32_TGEIU_class_54";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TGEIU_class_55() {
		System.out.println("   + Executing MIPS32_TGEIU_class_tests_55 ...");
		String[] result = MIPS32_TGEIU_class.MIPS32_TGEIU('a', 1874853887).split("->");
		String dir = "symips/jdart/MIPS32_TGEIU_class/";
		String testName = "MIPS32_TGEIU_class_55";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TGEIU_class_56() {
		System.out.println("   + Executing MIPS32_TGEIU_class_tests_56 ...");
		String[] result = MIPS32_TGEIU_class.MIPS32_TGEIU('a', 1911554047).split("->");
		String dir = "symips/jdart/MIPS32_TGEIU_class/";
		String testName = "MIPS32_TGEIU_class_56";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TGEIU_class_57() {
		System.out.println("   + Executing MIPS32_TGEIU_class_tests_57 ...");
		String[] result = MIPS32_TGEIU_class.MIPS32_TGEIU('a', 1944059903).split("->");
		String dir = "symips/jdart/MIPS32_TGEIU_class/";
		String testName = "MIPS32_TGEIU_class_57";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TGEIU_class_58() {
		System.out.println("   + Executing MIPS32_TGEIU_class_tests_58 ...");
		String[] result = MIPS32_TGEIU_class.MIPS32_TGEIU('a', 1977614335).split("->");
		String dir = "symips/jdart/MIPS32_TGEIU_class/";
		String testName = "MIPS32_TGEIU_class_58";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TGEIU_class_59() {
		System.out.println("   + Executing MIPS32_TGEIU_class_tests_59 ...");
		String[] result = MIPS32_TGEIU_class.MIPS32_TGEIU('a', 2009071615).split("->");
		String dir = "symips/jdart/MIPS32_TGEIU_class/";
		String testName = "MIPS32_TGEIU_class_59";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TGEIU_class_60() {
		System.out.println("   + Executing MIPS32_TGEIU_class_tests_60 ...");
		String[] result = MIPS32_TGEIU_class.MIPS32_TGEIU('a', 2044723199).split("->");
		String dir = "symips/jdart/MIPS32_TGEIU_class/";
		String testName = "MIPS32_TGEIU_class_60";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TGEIU_class_61() {
		System.out.println("   + Executing MIPS32_TGEIU_class_tests_61 ...");
		String[] result = MIPS32_TGEIU_class.MIPS32_TGEIU('a', 2076180479).split("->");
		String dir = "symips/jdart/MIPS32_TGEIU_class/";
		String testName = "MIPS32_TGEIU_class_61";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TGEIU_class_62() {
		System.out.println("   + Executing MIPS32_TGEIU_class_tests_62 ...");
		String[] result = MIPS32_TGEIU_class.MIPS32_TGEIU('a', 2109734911).split("->");
		String dir = "symips/jdart/MIPS32_TGEIU_class/";
		String testName = "MIPS32_TGEIU_class_62";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TGEIU_class_63() {
		System.out.println("   + Executing MIPS32_TGEIU_class_tests_63 ...");
		String[] result = MIPS32_TGEIU_class.MIPS32_TGEIU('a', 2139095039).split("->");
		String dir = "symips/jdart/MIPS32_TGEIU_class/";
		String testName = "MIPS32_TGEIU_class_63";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TGEIU_class_64() {
		System.out.println("   + Executing MIPS32_TGEIU_class_tests_64 ...");
		String[] result = MIPS32_TGEIU_class.MIPS32_TGEIU('a', -2147483648).split("->");
		String dir = "symips/jdart/MIPS32_TGEIU_class/";
		String testName = "MIPS32_TGEIU_class_64";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TGEIU_class_65() {
		System.out.println("   + Executing MIPS32_TGEIU_class_tests_65 ...");
		String[] result = MIPS32_TGEIU_class.MIPS32_TGEIU('a', -2113929216).split("->");
		String dir = "symips/jdart/MIPS32_TGEIU_class/";
		String testName = "MIPS32_TGEIU_class_65";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TGEIU_class_66() {
		System.out.println("   + Executing MIPS32_TGEIU_class_tests_66 ...");
		String[] result = MIPS32_TGEIU_class.MIPS32_TGEIU('a', -2080374784).split("->");
		String dir = "symips/jdart/MIPS32_TGEIU_class/";
		String testName = "MIPS32_TGEIU_class_66";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TGEIU_class_67() {
		System.out.println("   + Executing MIPS32_TGEIU_class_tests_67 ...");
		String[] result = MIPS32_TGEIU_class.MIPS32_TGEIU('a', -2046820352).split("->");
		String dir = "symips/jdart/MIPS32_TGEIU_class/";
		String testName = "MIPS32_TGEIU_class_67";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TGEIU_class_68() {
		System.out.println("   + Executing MIPS32_TGEIU_class_tests_68 ...");
		String[] result = MIPS32_TGEIU_class.MIPS32_TGEIU('a', -2013265920).split("->");
		String dir = "symips/jdart/MIPS32_TGEIU_class/";
		String testName = "MIPS32_TGEIU_class_68";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TGEIU_class_69() {
		System.out.println("   + Executing MIPS32_TGEIU_class_tests_69 ...");
		String[] result = MIPS32_TGEIU_class.MIPS32_TGEIU('a', -1979711488).split("->");
		String dir = "symips/jdart/MIPS32_TGEIU_class/";
		String testName = "MIPS32_TGEIU_class_69";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TGEIU_class_70() {
		System.out.println("   + Executing MIPS32_TGEIU_class_tests_70 ...");
		String[] result = MIPS32_TGEIU_class.MIPS32_TGEIU('a', -1946157056).split("->");
		String dir = "symips/jdart/MIPS32_TGEIU_class/";
		String testName = "MIPS32_TGEIU_class_70";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TGEIU_class_71() {
		System.out.println("   + Executing MIPS32_TGEIU_class_tests_71 ...");
		String[] result = MIPS32_TGEIU_class.MIPS32_TGEIU('a', -1912602624).split("->");
		String dir = "symips/jdart/MIPS32_TGEIU_class/";
		String testName = "MIPS32_TGEIU_class_71";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TGEIU_class_72() {
		System.out.println("   + Executing MIPS32_TGEIU_class_tests_72 ...");
		String[] result = MIPS32_TGEIU_class.MIPS32_TGEIU('a', -1879048192).split("->");
		String dir = "symips/jdart/MIPS32_TGEIU_class/";
		String testName = "MIPS32_TGEIU_class_72";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TGEIU_class_73() {
		System.out.println("   + Executing MIPS32_TGEIU_class_tests_73 ...");
		String[] result = MIPS32_TGEIU_class.MIPS32_TGEIU('a', -1845493760).split("->");
		String dir = "symips/jdart/MIPS32_TGEIU_class/";
		String testName = "MIPS32_TGEIU_class_73";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TGEIU_class_74() {
		System.out.println("   + Executing MIPS32_TGEIU_class_tests_74 ...");
		String[] result = MIPS32_TGEIU_class.MIPS32_TGEIU('a', -1811939328).split("->");
		String dir = "symips/jdart/MIPS32_TGEIU_class/";
		String testName = "MIPS32_TGEIU_class_74";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TGEIU_class_75() {
		System.out.println("   + Executing MIPS32_TGEIU_class_tests_75 ...");
		String[] result = MIPS32_TGEIU_class.MIPS32_TGEIU('a', -1778384896).split("->");
		String dir = "symips/jdart/MIPS32_TGEIU_class/";
		String testName = "MIPS32_TGEIU_class_75";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TGEIU_class_76() {
		System.out.println("   + Executing MIPS32_TGEIU_class_tests_76 ...");
		String[] result = MIPS32_TGEIU_class.MIPS32_TGEIU('a', -1744830464).split("->");
		String dir = "symips/jdart/MIPS32_TGEIU_class/";
		String testName = "MIPS32_TGEIU_class_76";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TGEIU_class_77() {
		System.out.println("   + Executing MIPS32_TGEIU_class_tests_77 ...");
		String[] result = MIPS32_TGEIU_class.MIPS32_TGEIU('a', -1711276032).split("->");
		String dir = "symips/jdart/MIPS32_TGEIU_class/";
		String testName = "MIPS32_TGEIU_class_77";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TGEIU_class_78() {
		System.out.println("   + Executing MIPS32_TGEIU_class_tests_78 ...");
		String[] result = MIPS32_TGEIU_class.MIPS32_TGEIU('a', -1677721600).split("->");
		String dir = "symips/jdart/MIPS32_TGEIU_class/";
		String testName = "MIPS32_TGEIU_class_78";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TGEIU_class_79() {
		System.out.println("   + Executing MIPS32_TGEIU_class_tests_79 ...");
		String[] result = MIPS32_TGEIU_class.MIPS32_TGEIU('a', -1644167168).split("->");
		String dir = "symips/jdart/MIPS32_TGEIU_class/";
		String testName = "MIPS32_TGEIU_class_79";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TGEIU_class_80() {
		System.out.println("   + Executing MIPS32_TGEIU_class_tests_80 ...");
		String[] result = MIPS32_TGEIU_class.MIPS32_TGEIU('a', -1610612736).split("->");
		String dir = "symips/jdart/MIPS32_TGEIU_class/";
		String testName = "MIPS32_TGEIU_class_80";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TGEIU_class_81() {
		System.out.println("   + Executing MIPS32_TGEIU_class_tests_81 ...");
		String[] result = MIPS32_TGEIU_class.MIPS32_TGEIU('a', -1577058304).split("->");
		String dir = "symips/jdart/MIPS32_TGEIU_class/";
		String testName = "MIPS32_TGEIU_class_81";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TGEIU_class_82() {
		System.out.println("   + Executing MIPS32_TGEIU_class_tests_82 ...");
		String[] result = MIPS32_TGEIU_class.MIPS32_TGEIU('a', -1543503872).split("->");
		String dir = "symips/jdart/MIPS32_TGEIU_class/";
		String testName = "MIPS32_TGEIU_class_82";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TGEIU_class_83() {
		System.out.println("   + Executing MIPS32_TGEIU_class_tests_83 ...");
		String[] result = MIPS32_TGEIU_class.MIPS32_TGEIU('a', -1509949440).split("->");
		String dir = "symips/jdart/MIPS32_TGEIU_class/";
		String testName = "MIPS32_TGEIU_class_83";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TGEIU_class_84() {
		System.out.println("   + Executing MIPS32_TGEIU_class_tests_84 ...");
		String[] result = MIPS32_TGEIU_class.MIPS32_TGEIU('a', -1476395008).split("->");
		String dir = "symips/jdart/MIPS32_TGEIU_class/";
		String testName = "MIPS32_TGEIU_class_84";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TGEIU_class_85() {
		System.out.println("   + Executing MIPS32_TGEIU_class_tests_85 ...");
		String[] result = MIPS32_TGEIU_class.MIPS32_TGEIU('a', -1442840576).split("->");
		String dir = "symips/jdart/MIPS32_TGEIU_class/";
		String testName = "MIPS32_TGEIU_class_85";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TGEIU_class_86() {
		System.out.println("   + Executing MIPS32_TGEIU_class_tests_86 ...");
		String[] result = MIPS32_TGEIU_class.MIPS32_TGEIU('a', -1409286144).split("->");
		String dir = "symips/jdart/MIPS32_TGEIU_class/";
		String testName = "MIPS32_TGEIU_class_86";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TGEIU_class_87() {
		System.out.println("   + Executing MIPS32_TGEIU_class_tests_87 ...");
		String[] result = MIPS32_TGEIU_class.MIPS32_TGEIU('a', -1375731712).split("->");
		String dir = "symips/jdart/MIPS32_TGEIU_class/";
		String testName = "MIPS32_TGEIU_class_87";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TGEIU_class_88() {
		System.out.println("   + Executing MIPS32_TGEIU_class_tests_88 ...");
		String[] result = MIPS32_TGEIU_class.MIPS32_TGEIU('a', -1342177280).split("->");
		String dir = "symips/jdart/MIPS32_TGEIU_class/";
		String testName = "MIPS32_TGEIU_class_88";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TGEIU_class_89() {
		System.out.println("   + Executing MIPS32_TGEIU_class_tests_89 ...");
		String[] result = MIPS32_TGEIU_class.MIPS32_TGEIU('a', -1308622848).split("->");
		String dir = "symips/jdart/MIPS32_TGEIU_class/";
		String testName = "MIPS32_TGEIU_class_89";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TGEIU_class_90() {
		System.out.println("   + Executing MIPS32_TGEIU_class_tests_90 ...");
		String[] result = MIPS32_TGEIU_class.MIPS32_TGEIU('a', -1275068416).split("->");
		String dir = "symips/jdart/MIPS32_TGEIU_class/";
		String testName = "MIPS32_TGEIU_class_90";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TGEIU_class_91() {
		System.out.println("   + Executing MIPS32_TGEIU_class_tests_91 ...");
		String[] result = MIPS32_TGEIU_class.MIPS32_TGEIU('a', -1241513984).split("->");
		String dir = "symips/jdart/MIPS32_TGEIU_class/";
		String testName = "MIPS32_TGEIU_class_91";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TGEIU_class_92() {
		System.out.println("   + Executing MIPS32_TGEIU_class_tests_92 ...");
		String[] result = MIPS32_TGEIU_class.MIPS32_TGEIU('a', -1207959552).split("->");
		String dir = "symips/jdart/MIPS32_TGEIU_class/";
		String testName = "MIPS32_TGEIU_class_92";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TGEIU_class_93() {
		System.out.println("   + Executing MIPS32_TGEIU_class_tests_93 ...");
		String[] result = MIPS32_TGEIU_class.MIPS32_TGEIU('a', -1174405120).split("->");
		String dir = "symips/jdart/MIPS32_TGEIU_class/";
		String testName = "MIPS32_TGEIU_class_93";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TGEIU_class_94() {
		System.out.println("   + Executing MIPS32_TGEIU_class_tests_94 ...");
		String[] result = MIPS32_TGEIU_class.MIPS32_TGEIU('a', -1140850688).split("->");
		String dir = "symips/jdart/MIPS32_TGEIU_class/";
		String testName = "MIPS32_TGEIU_class_94";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TGEIU_class_95() {
		System.out.println("   + Executing MIPS32_TGEIU_class_tests_95 ...");
		String[] result = MIPS32_TGEIU_class.MIPS32_TGEIU('a', -1107296256).split("->");
		String dir = "symips/jdart/MIPS32_TGEIU_class/";
		String testName = "MIPS32_TGEIU_class_95";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TGEIU_class_96() {
		System.out.println("   + Executing MIPS32_TGEIU_class_tests_96 ...");
		String[] result = MIPS32_TGEIU_class.MIPS32_TGEIU('a', -1073741824).split("->");
		String dir = "symips/jdart/MIPS32_TGEIU_class/";
		String testName = "MIPS32_TGEIU_class_96";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TGEIU_class_97() {
		System.out.println("   + Executing MIPS32_TGEIU_class_tests_97 ...");
		String[] result = MIPS32_TGEIU_class.MIPS32_TGEIU('a', -1040187392).split("->");
		String dir = "symips/jdart/MIPS32_TGEIU_class/";
		String testName = "MIPS32_TGEIU_class_97";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TGEIU_class_98() {
		System.out.println("   + Executing MIPS32_TGEIU_class_tests_98 ...");
		String[] result = MIPS32_TGEIU_class.MIPS32_TGEIU('a', -1006632960).split("->");
		String dir = "symips/jdart/MIPS32_TGEIU_class/";
		String testName = "MIPS32_TGEIU_class_98";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TGEIU_class_99() {
		System.out.println("   + Executing MIPS32_TGEIU_class_tests_99 ...");
		String[] result = MIPS32_TGEIU_class.MIPS32_TGEIU('a', -973078528).split("->");
		String dir = "symips/jdart/MIPS32_TGEIU_class/";
		String testName = "MIPS32_TGEIU_class_99";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TGEIU_class_100() {
		System.out.println("   + Executing MIPS32_TGEIU_class_tests_100 ...");
		String[] result = MIPS32_TGEIU_class.MIPS32_TGEIU('a', -939524096).split("->");
		String dir = "symips/jdart/MIPS32_TGEIU_class/";
		String testName = "MIPS32_TGEIU_class_100";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TGEIU_class_101() {
		System.out.println("   + Executing MIPS32_TGEIU_class_tests_101 ...");
		String[] result = MIPS32_TGEIU_class.MIPS32_TGEIU('a', -905969664).split("->");
		String dir = "symips/jdart/MIPS32_TGEIU_class/";
		String testName = "MIPS32_TGEIU_class_101";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TGEIU_class_102() {
		System.out.println("   + Executing MIPS32_TGEIU_class_tests_102 ...");
		String[] result = MIPS32_TGEIU_class.MIPS32_TGEIU('a', -872415232).split("->");
		String dir = "symips/jdart/MIPS32_TGEIU_class/";
		String testName = "MIPS32_TGEIU_class_102";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TGEIU_class_103() {
		System.out.println("   + Executing MIPS32_TGEIU_class_tests_103 ...");
		String[] result = MIPS32_TGEIU_class.MIPS32_TGEIU('a', -838860800).split("->");
		String dir = "symips/jdart/MIPS32_TGEIU_class/";
		String testName = "MIPS32_TGEIU_class_103";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TGEIU_class_104() {
		System.out.println("   + Executing MIPS32_TGEIU_class_tests_104 ...");
		String[] result = MIPS32_TGEIU_class.MIPS32_TGEIU('a', -805306368).split("->");
		String dir = "symips/jdart/MIPS32_TGEIU_class/";
		String testName = "MIPS32_TGEIU_class_104";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TGEIU_class_105() {
		System.out.println("   + Executing MIPS32_TGEIU_class_tests_105 ...");
		String[] result = MIPS32_TGEIU_class.MIPS32_TGEIU('a', -771751936).split("->");
		String dir = "symips/jdart/MIPS32_TGEIU_class/";
		String testName = "MIPS32_TGEIU_class_105";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TGEIU_class_106() {
		System.out.println("   + Executing MIPS32_TGEIU_class_tests_106 ...");
		String[] result = MIPS32_TGEIU_class.MIPS32_TGEIU('a', -738197504).split("->");
		String dir = "symips/jdart/MIPS32_TGEIU_class/";
		String testName = "MIPS32_TGEIU_class_106";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TGEIU_class_107() {
		System.out.println("   + Executing MIPS32_TGEIU_class_tests_107 ...");
		String[] result = MIPS32_TGEIU_class.MIPS32_TGEIU('a', -704643072).split("->");
		String dir = "symips/jdart/MIPS32_TGEIU_class/";
		String testName = "MIPS32_TGEIU_class_107";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TGEIU_class_108() {
		System.out.println("   + Executing MIPS32_TGEIU_class_tests_108 ...");
		String[] result = MIPS32_TGEIU_class.MIPS32_TGEIU('a', -671088640).split("->");
		String dir = "symips/jdart/MIPS32_TGEIU_class/";
		String testName = "MIPS32_TGEIU_class_108";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TGEIU_class_109() {
		System.out.println("   + Executing MIPS32_TGEIU_class_tests_109 ...");
		String[] result = MIPS32_TGEIU_class.MIPS32_TGEIU('a', -637534208).split("->");
		String dir = "symips/jdart/MIPS32_TGEIU_class/";
		String testName = "MIPS32_TGEIU_class_109";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TGEIU_class_110() {
		System.out.println("   + Executing MIPS32_TGEIU_class_tests_110 ...");
		String[] result = MIPS32_TGEIU_class.MIPS32_TGEIU('a', -603979776).split("->");
		String dir = "symips/jdart/MIPS32_TGEIU_class/";
		String testName = "MIPS32_TGEIU_class_110";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TGEIU_class_111() {
		System.out.println("   + Executing MIPS32_TGEIU_class_tests_111 ...");
		String[] result = MIPS32_TGEIU_class.MIPS32_TGEIU('a', -570425344).split("->");
		String dir = "symips/jdart/MIPS32_TGEIU_class/";
		String testName = "MIPS32_TGEIU_class_111";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TGEIU_class_112() {
		System.out.println("   + Executing MIPS32_TGEIU_class_tests_112 ...");
		String[] result = MIPS32_TGEIU_class.MIPS32_TGEIU('a', -536870912).split("->");
		String dir = "symips/jdart/MIPS32_TGEIU_class/";
		String testName = "MIPS32_TGEIU_class_112";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TGEIU_class_113() {
		System.out.println("   + Executing MIPS32_TGEIU_class_tests_113 ...");
		String[] result = MIPS32_TGEIU_class.MIPS32_TGEIU('a', -503316480).split("->");
		String dir = "symips/jdart/MIPS32_TGEIU_class/";
		String testName = "MIPS32_TGEIU_class_113";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TGEIU_class_114() {
		System.out.println("   + Executing MIPS32_TGEIU_class_tests_114 ...");
		String[] result = MIPS32_TGEIU_class.MIPS32_TGEIU('a', -469762048).split("->");
		String dir = "symips/jdart/MIPS32_TGEIU_class/";
		String testName = "MIPS32_TGEIU_class_114";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TGEIU_class_115() {
		System.out.println("   + Executing MIPS32_TGEIU_class_tests_115 ...");
		String[] result = MIPS32_TGEIU_class.MIPS32_TGEIU('a', -436207616).split("->");
		String dir = "symips/jdart/MIPS32_TGEIU_class/";
		String testName = "MIPS32_TGEIU_class_115";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TGEIU_class_116() {
		System.out.println("   + Executing MIPS32_TGEIU_class_tests_116 ...");
		String[] result = MIPS32_TGEIU_class.MIPS32_TGEIU('a', -402653184).split("->");
		String dir = "symips/jdart/MIPS32_TGEIU_class/";
		String testName = "MIPS32_TGEIU_class_116";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TGEIU_class_117() {
		System.out.println("   + Executing MIPS32_TGEIU_class_tests_117 ...");
		String[] result = MIPS32_TGEIU_class.MIPS32_TGEIU('a', -369098752).split("->");
		String dir = "symips/jdart/MIPS32_TGEIU_class/";
		String testName = "MIPS32_TGEIU_class_117";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TGEIU_class_118() {
		System.out.println("   + Executing MIPS32_TGEIU_class_tests_118 ...");
		String[] result = MIPS32_TGEIU_class.MIPS32_TGEIU('a', -335544320).split("->");
		String dir = "symips/jdart/MIPS32_TGEIU_class/";
		String testName = "MIPS32_TGEIU_class_118";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TGEIU_class_119() {
		System.out.println("   + Executing MIPS32_TGEIU_class_tests_119 ...");
		String[] result = MIPS32_TGEIU_class.MIPS32_TGEIU('a', -301989888).split("->");
		String dir = "symips/jdart/MIPS32_TGEIU_class/";
		String testName = "MIPS32_TGEIU_class_119";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TGEIU_class_120() {
		System.out.println("   + Executing MIPS32_TGEIU_class_tests_120 ...");
		String[] result = MIPS32_TGEIU_class.MIPS32_TGEIU('a', -268435456).split("->");
		String dir = "symips/jdart/MIPS32_TGEIU_class/";
		String testName = "MIPS32_TGEIU_class_120";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TGEIU_class_121() {
		System.out.println("   + Executing MIPS32_TGEIU_class_tests_121 ...");
		String[] result = MIPS32_TGEIU_class.MIPS32_TGEIU('a', -234881024).split("->");
		String dir = "symips/jdart/MIPS32_TGEIU_class/";
		String testName = "MIPS32_TGEIU_class_121";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TGEIU_class_122() {
		System.out.println("   + Executing MIPS32_TGEIU_class_tests_122 ...");
		String[] result = MIPS32_TGEIU_class.MIPS32_TGEIU('a', -201326592).split("->");
		String dir = "symips/jdart/MIPS32_TGEIU_class/";
		String testName = "MIPS32_TGEIU_class_122";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TGEIU_class_123() {
		System.out.println("   + Executing MIPS32_TGEIU_class_tests_123 ...");
		String[] result = MIPS32_TGEIU_class.MIPS32_TGEIU('a', -167772160).split("->");
		String dir = "symips/jdart/MIPS32_TGEIU_class/";
		String testName = "MIPS32_TGEIU_class_123";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TGEIU_class_124() {
		System.out.println("   + Executing MIPS32_TGEIU_class_tests_124 ...");
		String[] result = MIPS32_TGEIU_class.MIPS32_TGEIU('a', -134217728).split("->");
		String dir = "symips/jdart/MIPS32_TGEIU_class/";
		String testName = "MIPS32_TGEIU_class_124";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TGEIU_class_125() {
		System.out.println("   + Executing MIPS32_TGEIU_class_tests_125 ...");
		String[] result = MIPS32_TGEIU_class.MIPS32_TGEIU('a', -100663296).split("->");
		String dir = "symips/jdart/MIPS32_TGEIU_class/";
		String testName = "MIPS32_TGEIU_class_125";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TGEIU_class_126() {
		System.out.println("   + Executing MIPS32_TGEIU_class_tests_126 ...");
		String[] result = MIPS32_TGEIU_class.MIPS32_TGEIU('a', -67108864).split("->");
		String dir = "symips/jdart/MIPS32_TGEIU_class/";
		String testName = "MIPS32_TGEIU_class_126";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TGEIU_class_127() {
		System.out.println("   + Executing MIPS32_TGEIU_class_tests_127 ...");
		String[] result = MIPS32_TGEIU_class.MIPS32_TGEIU('a', -33554432).split("->");
		String dir = "symips/jdart/MIPS32_TGEIU_class/";
		String testName = "MIPS32_TGEIU_class_127";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_TGEIU_class_128() {
		System.out.println("   + Executing MIPS32_TGEIU_class_tests_128 ...");
		String[] result = MIPS32_TGEIU_class.MIPS32_TGEIU('a', 0).split("->");
		String dir = "symips/jdart/MIPS32_TGEIU_class/";
		String testName = "MIPS32_TGEIU_class_128";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_SRLV_class_0() {
		System.out.println("   + Executing microMIPS_SRLV_class_tests_0 ...");
		String[] result = microMIPS_SRLV_class.microMIPS_SRLV('8', 'r', '5').split("->");
		String dir = "symips/jdart/microMIPS_SRLV_class/";
		String testName = "microMIPS_SRLV_class_0";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_XOR_class_0() {
		System.out.println("   + Executing MIPS32_XOR_class_tests_0 ...");
		String[] result = MIPS32_XOR_class.MIPS32_XOR('3', 'e', 'f').split("->");
		String dir = "symips/jdart/MIPS32_XOR_class/";
		String testName = "MIPS32_XOR_class_0";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_MODU_class_0() {
		System.out.println("   + Executing microMIPS_MODU_class_tests_0 ...");
		String[] result = microMIPS_MODU_class.microMIPS_MODU('g', 'f', '8').split("->");
		String dir = "symips/jdart/microMIPS_MODU_class/";
		String testName = "microMIPS_MODU_class_0";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void microMIPS_ROTRV_class_0() {
		System.out.println("   + Executing microMIPS_ROTRV_class_tests_0 ...");
		String[] result = microMIPS_ROTRV_class.microMIPS_ROTRV('3', 'l', 'j').split("->");
		String dir = "symips/jdart/microMIPS_ROTRV_class/";
		String testName = "microMIPS_ROTRV_class_0";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_SLTIU_class_0() {
		System.out.println("   + Executing MIPS32_SLTIU_class_tests_0 ...");
		String[] result = MIPS32_SLTIU_class.MIPS32_SLTIU('v', 'p', 513).split("->");
		String dir = "symips/jdart/MIPS32_SLTIU_class/";
		String testName = "MIPS32_SLTIU_class_0";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_SLTIU_class_1() {
		System.out.println("   + Executing MIPS32_SLTIU_class_tests_1 ...");
		String[] result = MIPS32_SLTIU_class.MIPS32_SLTIU('v', '0', 0).split("->");
		String dir = "symips/jdart/MIPS32_SLTIU_class/";
		String testName = "MIPS32_SLTIU_class_1";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}

	public static void MIPS32_SLTIU_class_2() {
		System.out.println("   + Executing MIPS32_SLTIU_class_tests_2 ...");
		String[] result = MIPS32_SLTIU_class.MIPS32_SLTIU('6', '0', 0).split("->");
		String dir = "symips/jdart/MIPS32_SLTIU_class/";
		String testName = "MIPS32_SLTIU_class_2";
		new File(dir).mkdirs();
		write(dir + testName + ".inp", result[0].trim());
		write(dir + testName + ".out", result[1].trim());
	}



	public static void main(String[] args) {
MIPS32_MTLO_class_0();
MIPS32_OR_class_0();
MIPS32_OR_class_1();
MIPS32_SRAV_class_0();
MIPS32_MFHI_class_0();
MIPS32_MUL_class_0();
MIPS32_SLT_class_0();
microMIPS_WSBH_class_0();
microMIPS_TEQ_class_0();
microMIPS_TLTU_class_0();
microMIPS_LSA_class_0();
MIPS32_WSBH_class_0();
microMIPS_ORI_class_0();
microMIPS_ORI_class_1();
microMIPS_ORI_class_2();
microMIPS_ORI_class_3();
microMIPS_ORI_class_4();
microMIPS_ORI_class_5();
microMIPS_ORI_class_6();
microMIPS_ORI_class_7();
microMIPS_ORI_class_8();
microMIPS_ORI_class_9();
microMIPS_ORI_class_10();
microMIPS_ORI_class_11();
microMIPS_ORI_class_12();
microMIPS_ORI_class_13();
microMIPS_ORI_class_14();
microMIPS_ORI_class_15();
microMIPS_ORI_class_16();
microMIPS_ORI_class_17();
microMIPS_ADDIUS5_class_0();
microMIPS_ADDIUS5_class_1();
microMIPS_ADDIUS5_class_2();
microMIPS_ADDIUS5_class_3();
microMIPS_ADDIUS5_class_4();
microMIPS_ADDIUS5_class_5();
microMIPS_ADDIUS5_class_6();
microMIPS_ADDIUS5_class_7();
microMIPS_ADDIUS5_class_8();
microMIPS_ADDIUS5_class_9();
microMIPS_ADDIUS5_class_10();
microMIPS_ADDIUS5_class_11();
microMIPS_ADDIUS5_class_12();
microMIPS_ADDIUS5_class_13();
microMIPS_ADDIUS5_class_14();
microMIPS_ADDIUS5_class_15();
microMIPS_ADDIUS5_class_16();
microMIPS_ADDIUS5_class_17();
microMIPS_ADDIUS5_class_18();
microMIPS_ADDIUS5_class_19();
microMIPS_ADDIUS5_class_20();
microMIPS_ADDIUS5_class_21();
microMIPS_ADDIUS5_class_22();
microMIPS_ADDIUS5_class_23();
microMIPS_ADDIUS5_class_24();
microMIPS_ADDIUS5_class_25();
microMIPS_ADDIUS5_class_26();
microMIPS_ADDIUS5_class_27();
microMIPS_ADDIUS5_class_28();
microMIPS_ADDIUS5_class_29();
microMIPS_ADDIUS5_class_30();
microMIPS_ADDIUS5_class_31();
microMIPS_ADDIUS5_class_32();
microMIPS_ADDIUS5_class_33();
microMIPS_ADDIUS5_class_34();
microMIPS_ADDIUS5_class_35();
microMIPS_ADDIUS5_class_36();
microMIPS_ADDIUS5_class_37();
microMIPS_ADDIUS5_class_38();
microMIPS_ADDIUS5_class_39();
microMIPS_ADDIUS5_class_40();
microMIPS_ADDIUS5_class_41();
microMIPS_ADDIUS5_class_42();
microMIPS_ADDIUS5_class_43();
microMIPS_ADDIUS5_class_44();
microMIPS_ADDIUS5_class_45();
microMIPS_ADDIUS5_class_46();
microMIPS_ADDIUS5_class_47();
microMIPS_ADDIUS5_class_48();
microMIPS_ADDIUS5_class_49();
microMIPS_ADDIUS5_class_50();
microMIPS_ADDIUS5_class_51();
microMIPS_ADDIUS5_class_52();
microMIPS_ADDIUS5_class_53();
microMIPS_ADDIUS5_class_54();
microMIPS_ADDIUS5_class_55();
microMIPS_ADDIUS5_class_56();
microMIPS_ADDIUS5_class_57();
microMIPS_ADDIUS5_class_58();
microMIPS_ADDIUS5_class_59();
microMIPS_ADDIUS5_class_60();
microMIPS_ADDIUS5_class_61();
microMIPS_ADDIUS5_class_62();
microMIPS_ADDIUS5_class_63();
microMIPS_ADDIUS5_class_64();
microMIPS_ADDIUS5_class_65();
microMIPS_ADDIUS5_class_66();
microMIPS_ADDIUS5_class_67();
microMIPS_ADDIUS5_class_68();
microMIPS_ADDIUS5_class_69();
microMIPS_ADDIUS5_class_70();
microMIPS_ADDIUS5_class_71();
microMIPS_ADDIUS5_class_72();
microMIPS_ADDIUS5_class_73();
microMIPS_ADDIUS5_class_74();
microMIPS_ADDIUS5_class_75();
microMIPS_ADDIUS5_class_76();
microMIPS_ADDIUS5_class_77();
microMIPS_ADDIUS5_class_78();
microMIPS_ADDIUS5_class_79();
microMIPS_ADDIUS5_class_80();
microMIPS_ADDIUS5_class_81();
microMIPS_ADDIUS5_class_82();
microMIPS_ADDIUS5_class_83();
microMIPS_ADDIUS5_class_84();
microMIPS_ADDIUS5_class_85();
microMIPS_ADDIUS5_class_86();
microMIPS_ADDIUS5_class_87();
microMIPS_ADDIUS5_class_88();
microMIPS_ADDIUS5_class_89();
microMIPS_ADDIUS5_class_90();
microMIPS_ADDIUS5_class_91();
microMIPS_ADDIUS5_class_92();
microMIPS_ADDIUS5_class_93();
microMIPS_ADDIUS5_class_94();
microMIPS_ADDIUS5_class_95();
microMIPS_ADDIUS5_class_96();
microMIPS_ADDIUS5_class_97();
microMIPS_ADDIUS5_class_98();
microMIPS_ADDIUS5_class_99();
microMIPS_ADDIUS5_class_100();
microMIPS_ADDIUS5_class_101();
microMIPS_ADDIUS5_class_102();
microMIPS_ADDIUS5_class_103();
microMIPS_ADDIUS5_class_104();
microMIPS_ADDIUS5_class_105();
microMIPS_ADDIUS5_class_106();
microMIPS_ADDIUS5_class_107();
microMIPS_ADDIUS5_class_108();
microMIPS_ADDIUS5_class_109();
microMIPS_ADDIUS5_class_110();
microMIPS_ADDIUS5_class_111();
microMIPS_ADDIUS5_class_112();
microMIPS_ADDIUS5_class_113();
microMIPS_ADDIUS5_class_114();
microMIPS_ADDIUS5_class_115();
microMIPS_ADDIUS5_class_116();
microMIPS_ADDIUS5_class_117();
microMIPS_ADDIUS5_class_118();
microMIPS_ADDIUS5_class_119();
microMIPS_ADDIUS5_class_120();
microMIPS_ADDIUS5_class_121();
microMIPS_ADDIUS5_class_122();
microMIPS_ADDIUS5_class_123();
microMIPS_ADDIUS5_class_124();
microMIPS_ADDIUS5_class_125();
microMIPS_ADDIUS5_class_126();
microMIPS_ADDIUS5_class_127();
microMIPS_ADDIUS5_class_128();
microMIPS_XOR16_class_0();
MIPS32_MULT_class_0();
MIPS32_MOVN_class_0();
microMIPS_MUL_class_0();
microMIPS_MUL_class_1();
microMIPS_NOT16_class_0();
microMIPS_DIV_class_0();
microMIPS_DIV_class_1();
MIPS32_SEH_class_0();
microMIPS_ALIGN_class_0();
microMIPS_SLT_class_0();
microMIPS_SLT_class_1();
MIPS32_TGEI_class_0();
MIPS32_TGEI_class_1();
MIPS32_TGEI_class_2();
MIPS32_TGEI_class_3();
MIPS32_TGEI_class_4();
MIPS32_TGEI_class_5();
MIPS32_TGEI_class_6();
MIPS32_TGEI_class_7();
MIPS32_TGEI_class_8();
MIPS32_TGEI_class_9();
MIPS32_TGEI_class_10();
MIPS32_TGEI_class_11();
MIPS32_TGEI_class_12();
MIPS32_TGEI_class_13();
MIPS32_TGEI_class_14();
MIPS32_TGEI_class_15();
MIPS32_TGEI_class_16();
MIPS32_TGEI_class_17();
MIPS32_TGEI_class_18();
MIPS32_TGEI_class_19();
MIPS32_TGEI_class_20();
MIPS32_TGEI_class_21();
MIPS32_TGEI_class_22();
MIPS32_TGEI_class_23();
MIPS32_TGEI_class_24();
MIPS32_TGEI_class_25();
MIPS32_TGEI_class_26();
MIPS32_TGEI_class_27();
MIPS32_TGEI_class_28();
MIPS32_TGEI_class_29();
MIPS32_TGEI_class_30();
MIPS32_TGEI_class_31();
MIPS32_TGEI_class_32();
MIPS32_TGEI_class_33();
MIPS32_TGEI_class_34();
MIPS32_TGEI_class_35();
MIPS32_TGEI_class_36();
MIPS32_TGEI_class_37();
MIPS32_TGEI_class_38();
MIPS32_TGEI_class_39();
MIPS32_TGEI_class_40();
MIPS32_TGEI_class_41();
MIPS32_TGEI_class_42();
MIPS32_TGEI_class_43();
MIPS32_TGEI_class_44();
MIPS32_TGEI_class_45();
MIPS32_TGEI_class_46();
MIPS32_TGEI_class_47();
MIPS32_TGEI_class_48();
MIPS32_TGEI_class_49();
MIPS32_TGEI_class_50();
MIPS32_TGEI_class_51();
MIPS32_TGEI_class_52();
MIPS32_TGEI_class_53();
MIPS32_TGEI_class_54();
MIPS32_TGEI_class_55();
MIPS32_TGEI_class_56();
MIPS32_TGEI_class_57();
MIPS32_TGEI_class_58();
MIPS32_TGEI_class_59();
MIPS32_TGEI_class_60();
MIPS32_TGEI_class_61();
MIPS32_TGEI_class_62();
MIPS32_TGEI_class_63();
MIPS32_TGEI_class_64();
MIPS32_TGEI_class_65();
MIPS32_TGEI_class_66();
MIPS32_TGEI_class_67();
MIPS32_TGEI_class_68();
MIPS32_TGEI_class_69();
MIPS32_TGEI_class_70();
MIPS32_TGEI_class_71();
MIPS32_TGEI_class_72();
MIPS32_TGEI_class_73();
MIPS32_TGEI_class_74();
MIPS32_TGEI_class_75();
MIPS32_TGEI_class_76();
MIPS32_TGEI_class_77();
MIPS32_TGEI_class_78();
MIPS32_TGEI_class_79();
MIPS32_TGEI_class_80();
MIPS32_TGEI_class_81();
MIPS32_TGEI_class_82();
MIPS32_TGEI_class_83();
MIPS32_TGEI_class_84();
MIPS32_TGEI_class_85();
MIPS32_TGEI_class_86();
MIPS32_TGEI_class_87();
MIPS32_TGEI_class_88();
MIPS32_TGEI_class_89();
MIPS32_TGEI_class_90();
MIPS32_TGEI_class_91();
MIPS32_TGEI_class_92();
MIPS32_TGEI_class_93();
MIPS32_TGEI_class_94();
MIPS32_TGEI_class_95();
MIPS32_TGEI_class_96();
MIPS32_TGEI_class_97();
MIPS32_TGEI_class_98();
MIPS32_TGEI_class_99();
MIPS32_TGEI_class_100();
MIPS32_TGEI_class_101();
MIPS32_TGEI_class_102();
MIPS32_TGEI_class_103();
MIPS32_TGEI_class_104();
MIPS32_TGEI_class_105();
MIPS32_TGEI_class_106();
MIPS32_TGEI_class_107();
MIPS32_TGEI_class_108();
MIPS32_TGEI_class_109();
MIPS32_TGEI_class_110();
MIPS32_TGEI_class_111();
MIPS32_TGEI_class_112();
MIPS32_TGEI_class_113();
MIPS32_TGEI_class_114();
MIPS32_TGEI_class_115();
MIPS32_TGEI_class_116();
MIPS32_TGEI_class_117();
MIPS32_TGEI_class_118();
MIPS32_TGEI_class_119();
MIPS32_TGEI_class_120();
MIPS32_TGEI_class_121();
MIPS32_TGEI_class_122();
MIPS32_TGEI_class_123();
MIPS32_TGEI_class_124();
MIPS32_TGEI_class_125();
MIPS32_TGEI_class_126();
MIPS32_TGEI_class_127();
MIPS32_TGEI_class_128();
microMIPS_OR16_class_0();
MIPS32_ADDI_class_0();
MIPS32_ADDI_class_1();
MIPS32_SLLV_class_0();
MIPS32_AND_class_0();
MIPS32_AND_class_1();
microMIPS_SLTI_class_0();
microMIPS_SLTI_class_1();
microMIPS_SLTU_class_0();
microMIPS_LUI_class_0();
microMIPS_LUI_class_1();
MIPS32_TLTIU_class_0();
MIPS32_TLTIU_class_1();
MIPS32_TLTIU_class_2();
MIPS32_TLTIU_class_3();
MIPS32_TLTIU_class_4();
MIPS32_TLTIU_class_5();
MIPS32_TLTIU_class_6();
MIPS32_TLTIU_class_7();
MIPS32_TLTIU_class_8();
MIPS32_TLTIU_class_9();
MIPS32_TLTIU_class_10();
MIPS32_TLTIU_class_11();
MIPS32_TLTIU_class_12();
MIPS32_TLTIU_class_13();
MIPS32_TLTIU_class_14();
MIPS32_TLTIU_class_15();
MIPS32_TLTIU_class_16();
MIPS32_TLTIU_class_17();
MIPS32_TLTIU_class_18();
MIPS32_TLTIU_class_19();
MIPS32_TLTIU_class_20();
MIPS32_TLTIU_class_21();
MIPS32_TLTIU_class_22();
MIPS32_TLTIU_class_23();
MIPS32_TLTIU_class_24();
MIPS32_TLTIU_class_25();
MIPS32_TLTIU_class_26();
MIPS32_TLTIU_class_27();
MIPS32_TLTIU_class_28();
MIPS32_TLTIU_class_29();
MIPS32_TLTIU_class_30();
MIPS32_TLTIU_class_31();
MIPS32_TLTIU_class_32();
MIPS32_TLTIU_class_33();
MIPS32_TLTIU_class_34();
MIPS32_TLTIU_class_35();
MIPS32_TLTIU_class_36();
MIPS32_TLTIU_class_37();
MIPS32_TLTIU_class_38();
MIPS32_TLTIU_class_39();
MIPS32_TLTIU_class_40();
MIPS32_TLTIU_class_41();
MIPS32_TLTIU_class_42();
MIPS32_TLTIU_class_43();
MIPS32_TLTIU_class_44();
MIPS32_TLTIU_class_45();
MIPS32_TLTIU_class_46();
MIPS32_TLTIU_class_47();
MIPS32_TLTIU_class_48();
MIPS32_TLTIU_class_49();
MIPS32_TLTIU_class_50();
MIPS32_TLTIU_class_51();
MIPS32_TLTIU_class_52();
MIPS32_TLTIU_class_53();
MIPS32_TLTIU_class_54();
MIPS32_TLTIU_class_55();
MIPS32_TLTIU_class_56();
MIPS32_TLTIU_class_57();
MIPS32_TLTIU_class_58();
MIPS32_TLTIU_class_59();
MIPS32_TLTIU_class_60();
MIPS32_TLTIU_class_61();
MIPS32_TLTIU_class_62();
MIPS32_TLTIU_class_63();
MIPS32_TLTIU_class_64();
MIPS32_TLTIU_class_65();
MIPS32_TLTIU_class_66();
MIPS32_TLTIU_class_67();
MIPS32_TLTIU_class_68();
MIPS32_TLTIU_class_69();
MIPS32_TLTIU_class_70();
MIPS32_TLTIU_class_71();
MIPS32_TLTIU_class_72();
MIPS32_TLTIU_class_73();
MIPS32_TLTIU_class_74();
MIPS32_TLTIU_class_75();
MIPS32_TLTIU_class_76();
MIPS32_TLTIU_class_77();
MIPS32_TLTIU_class_78();
MIPS32_TLTIU_class_79();
MIPS32_TLTIU_class_80();
MIPS32_TLTIU_class_81();
MIPS32_TLTIU_class_82();
MIPS32_TLTIU_class_83();
MIPS32_TLTIU_class_84();
MIPS32_TLTIU_class_85();
MIPS32_TLTIU_class_86();
MIPS32_TLTIU_class_87();
MIPS32_TLTIU_class_88();
MIPS32_TLTIU_class_89();
MIPS32_TLTIU_class_90();
MIPS32_TLTIU_class_91();
MIPS32_TLTIU_class_92();
MIPS32_TLTIU_class_93();
MIPS32_TLTIU_class_94();
MIPS32_TLTIU_class_95();
MIPS32_TLTIU_class_96();
MIPS32_TLTIU_class_97();
MIPS32_TLTIU_class_98();
MIPS32_TLTIU_class_99();
MIPS32_TLTIU_class_100();
MIPS32_TLTIU_class_101();
MIPS32_TLTIU_class_102();
MIPS32_TLTIU_class_103();
MIPS32_TLTIU_class_104();
MIPS32_TLTIU_class_105();
MIPS32_TLTIU_class_106();
MIPS32_TLTIU_class_107();
MIPS32_TLTIU_class_108();
MIPS32_TLTIU_class_109();
MIPS32_TLTIU_class_110();
MIPS32_TLTIU_class_111();
MIPS32_TLTIU_class_112();
MIPS32_TLTIU_class_113();
MIPS32_TLTIU_class_114();
MIPS32_TLTIU_class_115();
MIPS32_TLTIU_class_116();
MIPS32_TLTIU_class_117();
MIPS32_TLTIU_class_118();
MIPS32_TLTIU_class_119();
MIPS32_TLTIU_class_120();
MIPS32_TLTIU_class_121();
MIPS32_TLTIU_class_122();
MIPS32_TLTIU_class_123();
MIPS32_TLTIU_class_124();
MIPS32_TLTIU_class_125();
MIPS32_TLTIU_class_126();
MIPS32_TLTIU_class_127();
MIPS32_TLTIU_class_128();
microMIPS_ANDI_class_0();
microMIPS_ANDI_class_1();
microMIPS_ANDI_class_2();
MIPS32_TGE_class_0();
MIPS32_NOR_class_0();
MIPS32_TEQI_class_0();
MIPS32_TEQI_class_1();
MIPS32_TEQI_class_2();
MIPS32_SUB_class_0();
microMIPS_CLZ_class_0();
MIPS32_CLZ_class_0();
microMIPS_SUB_class_0();
MIPS32_SRL_class_0();
MIPS32_SEB_class_0();
microMIPS_AUIPC_class_0();
microMIPS_AUIPC_class_1();
MIPS32_MADD_class_0();
MIPS32_TEQ_class_0();
MIPS32_CLO_class_0();
MIPS32_SLTI_class_0();
MIPS32_SLTI_class_1();
MIPS32_ANDI_class_0();
MIPS32_ANDI_class_1();
MIPS32_ANDI_class_2();
MIPS32_ANDI_class_3();
microMIPS_TLT_class_0();
microMIPS_ADDIUR2_class_0();
microMIPS_ADDIUR2_class_1();
microMIPS_SUBU_class_0();
microMIPS_ROTR_class_0();
microMIPS_AND16_class_0();
MIPS32_TLT_class_0();
microMIPS_SEH_class_0();
MIPS32_SRLV_class_0();
microMIPS_ADDU_class_0();
MIPS32_MSUBU_class_0();
microMIPS_CLO_class_0();
MIPS32_MFLO_class_0();
microMIPS_MOVEP_class_0();
microMIPS_MULU_class_0();
microMIPS_MULU_class_1();
MIPS32_MTHI_class_0();
MIPS32_SUBU_class_0();
microMIPS_MOD_class_0();
microMIPS_SLTIU_class_0();
microMIPS_SLTIU_class_1();
microMIPS_TGEU_class_0();
MIPS32_MSUB_class_0();
microMIPS_ADDIUSP_class_0();
microMIPS_ADDIUSP_class_1();
microMIPS_ADDIUSP_class_2();
microMIPS_ADDIUSP_class_3();
microMIPS_ADDIUSP_class_4();
microMIPS_ADDIUSP_class_5();
microMIPS_ADDIUSP_class_6();
microMIPS_ADDIUSP_class_7();
microMIPS_ADDIUSP_class_8();
microMIPS_ADDIUSP_class_9();
microMIPS_ADDIUSP_class_10();
microMIPS_ADDIUSP_class_11();
microMIPS_ADDIUSP_class_12();
microMIPS_ADDIUSP_class_13();
microMIPS_ADDIUSP_class_14();
microMIPS_ADDIUSP_class_15();
microMIPS_ADDIUSP_class_16();
microMIPS_ADDIUSP_class_17();
microMIPS_ADDIUSP_class_18();
microMIPS_ADDIUSP_class_19();
microMIPS_ADDIUSP_class_20();
microMIPS_ADDIUSP_class_21();
microMIPS_ADDIUSP_class_22();
microMIPS_ADDIUSP_class_23();
microMIPS_ADDIUSP_class_24();
microMIPS_ADDIUSP_class_25();
microMIPS_ADDIUSP_class_26();
microMIPS_ADDIUSP_class_27();
microMIPS_ADDIUSP_class_28();
microMIPS_ADDIUSP_class_29();
microMIPS_ADDIUSP_class_30();
microMIPS_ADDIUSP_class_31();
microMIPS_ADDIUSP_class_32();
microMIPS_ADDIUSP_class_33();
microMIPS_ADDIUSP_class_34();
microMIPS_ADDIUSP_class_35();
microMIPS_ADDIUSP_class_36();
microMIPS_ADDIUSP_class_37();
microMIPS_ADDIUSP_class_38();
microMIPS_ADDIUSP_class_39();
microMIPS_ADDIUSP_class_40();
microMIPS_ADDIUSP_class_41();
microMIPS_ADDIUSP_class_42();
microMIPS_ADDIUSP_class_43();
microMIPS_ADDIUSP_class_44();
microMIPS_ADDIUSP_class_45();
microMIPS_ADDIUSP_class_46();
microMIPS_ADDIUSP_class_47();
microMIPS_ADDIUSP_class_48();
microMIPS_ADDIUSP_class_49();
microMIPS_ADDIUSP_class_50();
microMIPS_ADDIUSP_class_51();
microMIPS_ADDIUSP_class_52();
microMIPS_ADDIUSP_class_53();
microMIPS_ADDIUSP_class_54();
microMIPS_ADDIUSP_class_55();
microMIPS_ADDIUSP_class_56();
microMIPS_ADDIUSP_class_57();
microMIPS_ADDIUSP_class_58();
microMIPS_ADDIUSP_class_59();
microMIPS_ADDIUSP_class_60();
microMIPS_ADDIUSP_class_61();
microMIPS_ADDIUSP_class_62();
microMIPS_ADDIUSP_class_63();
microMIPS_ADDIUSP_class_64();
microMIPS_ADDIUSP_class_65();
microMIPS_ADDIUSP_class_66();
microMIPS_ADDIUSP_class_67();
microMIPS_ADDIUSP_class_68();
microMIPS_ADDIUSP_class_69();
microMIPS_ADDIUSP_class_70();
microMIPS_ADDIUSP_class_71();
microMIPS_ADDIUSP_class_72();
microMIPS_ADDIUSP_class_73();
microMIPS_ADDIUSP_class_74();
microMIPS_ADDIUSP_class_75();
microMIPS_ADDIUSP_class_76();
microMIPS_ADDIUSP_class_77();
microMIPS_ADDIUSP_class_78();
microMIPS_ADDIUSP_class_79();
microMIPS_ADDIUSP_class_80();
microMIPS_ADDIUSP_class_81();
microMIPS_ADDIUSP_class_82();
microMIPS_ADDIUSP_class_83();
microMIPS_ADDIUSP_class_84();
microMIPS_ADDIUSP_class_85();
microMIPS_ADDIUSP_class_86();
microMIPS_ADDIUSP_class_87();
microMIPS_ADDIUSP_class_88();
microMIPS_ADDIUSP_class_89();
microMIPS_ADDIUSP_class_90();
microMIPS_ADDIUSP_class_91();
microMIPS_ADDIUSP_class_92();
microMIPS_ADDIUSP_class_93();
microMIPS_ADDIUSP_class_94();
microMIPS_ADDIUSP_class_95();
microMIPS_ADDIUSP_class_96();
microMIPS_ADDIUSP_class_97();
microMIPS_ADDIUSP_class_98();
microMIPS_ADDIUSP_class_99();
microMIPS_ADDIUSP_class_100();
microMIPS_ADDIUSP_class_101();
microMIPS_ADDIUSP_class_102();
microMIPS_ADDIUSP_class_103();
microMIPS_ADDIUSP_class_104();
microMIPS_ADDIUSP_class_105();
microMIPS_ADDIUSP_class_106();
microMIPS_ADDIUSP_class_107();
microMIPS_ADDIUSP_class_108();
microMIPS_ADDIUSP_class_109();
microMIPS_ADDIUSP_class_110();
microMIPS_ADDIUSP_class_111();
microMIPS_ADDIUSP_class_112();
microMIPS_ADDIUSP_class_113();
microMIPS_ADDIUSP_class_114();
microMIPS_ADDIUSP_class_115();
microMIPS_ADDIUSP_class_116();
microMIPS_ADDIUSP_class_117();
microMIPS_ADDIUSP_class_118();
microMIPS_ADDIUSP_class_119();
microMIPS_ADDIUSP_class_120();
microMIPS_ADDIUSP_class_121();
microMIPS_ADDIUSP_class_122();
microMIPS_ADDIUSP_class_123();
microMIPS_ADDIUSP_class_124();
microMIPS_ADDIUSP_class_125();
microMIPS_ADDIUSP_class_126();
microMIPS_ADDIUSP_class_127();
microMIPS_ADDIUSP_class_128();
microMIPS_ADDIUSP_class_129();
microMIPS_ADDIUSP_class_130();
microMIPS_ADDIUSP_class_131();
microMIPS_ADDIUSP_class_132();
microMIPS_ADDIUSP_class_133();
microMIPS_ADDIUSP_class_134();
microMIPS_ADDIUSP_class_135();
microMIPS_ADDIUSP_class_136();
microMIPS_ADDIUSP_class_137();
microMIPS_ADDIUSP_class_138();
microMIPS_ADDIUSP_class_139();
microMIPS_ADDIUSP_class_140();
microMIPS_ADDIUSP_class_141();
microMIPS_ADDIUSP_class_142();
microMIPS_ADDIUSP_class_143();
microMIPS_ADDIUSP_class_144();
microMIPS_ADDIUSP_class_145();
microMIPS_ADDIUSP_class_146();
microMIPS_ADDIUSP_class_147();
microMIPS_ADDIUSP_class_148();
microMIPS_ADDIUSP_class_149();
microMIPS_ADDIUSP_class_150();
microMIPS_ADDIUSP_class_151();
microMIPS_ADDIUSP_class_152();
microMIPS_ADDIUSP_class_153();
microMIPS_ADDIUSP_class_154();
microMIPS_ADDIUSP_class_155();
microMIPS_ADDIUSP_class_156();
microMIPS_ADDIUSP_class_157();
microMIPS_ADDIUSP_class_158();
microMIPS_ADDIUSP_class_159();
microMIPS_ADDIUSP_class_160();
microMIPS_ADDIUSP_class_161();
microMIPS_ADDIUSP_class_162();
microMIPS_ADDIUSP_class_163();
microMIPS_ADDIUSP_class_164();
microMIPS_ADDIUSP_class_165();
microMIPS_ADDIUSP_class_166();
microMIPS_ADDIUSP_class_167();
microMIPS_ADDIUSP_class_168();
microMIPS_ADDIUSP_class_169();
microMIPS_ADDIUSP_class_170();
microMIPS_ADDIUSP_class_171();
microMIPS_ADDIUSP_class_172();
microMIPS_ADDIUSP_class_173();
microMIPS_ADDIUSP_class_174();
microMIPS_ADDIUSP_class_175();
microMIPS_ADDIUSP_class_176();
microMIPS_ADDIUSP_class_177();
microMIPS_ADDIUSP_class_178();
microMIPS_ADDIUSP_class_179();
microMIPS_ADDIUSP_class_180();
microMIPS_ADDIUSP_class_181();
microMIPS_ADDIUSP_class_182();
microMIPS_ADDIUSP_class_183();
microMIPS_ADDIUSP_class_184();
microMIPS_ADDIUSP_class_185();
microMIPS_ADDIUSP_class_186();
microMIPS_ADDIUSP_class_187();
microMIPS_ADDIUSP_class_188();
microMIPS_ADDIUSP_class_189();
microMIPS_ADDIUSP_class_190();
microMIPS_ADDIUSP_class_191();
microMIPS_ADDIUSP_class_192();
microMIPS_ADDIUSP_class_193();
microMIPS_ADDIUSP_class_194();
microMIPS_ADDIUSP_class_195();
microMIPS_ADDIUSP_class_196();
microMIPS_ADDIUSP_class_197();
microMIPS_ADDIUSP_class_198();
microMIPS_ADDIUSP_class_199();
microMIPS_ADDIUSP_class_200();
microMIPS_ADDIUSP_class_201();
microMIPS_ADDIUSP_class_202();
microMIPS_ADDIUSP_class_203();
microMIPS_ADDIUSP_class_204();
microMIPS_ADDIUSP_class_205();
microMIPS_ADDIUSP_class_206();
microMIPS_ADDIUSP_class_207();
microMIPS_ADDIUSP_class_208();
microMIPS_ADDIUSP_class_209();
microMIPS_ADDIUSP_class_210();
microMIPS_ADDIUSP_class_211();
microMIPS_ADDIUSP_class_212();
microMIPS_ADDIUSP_class_213();
microMIPS_ADDIUSP_class_214();
microMIPS_ADDIUSP_class_215();
microMIPS_ADDIUSP_class_216();
microMIPS_ADDIUSP_class_217();
microMIPS_ADDIUSP_class_218();
microMIPS_ADDIUSP_class_219();
microMIPS_ADDIUSP_class_220();
microMIPS_ADDIUSP_class_221();
microMIPS_ADDIUSP_class_222();
microMIPS_ADDIUSP_class_223();
microMIPS_ADDIUSP_class_224();
microMIPS_ADDIUSP_class_225();
microMIPS_ADDIUSP_class_226();
microMIPS_ADDIUSP_class_227();
microMIPS_ADDIUSP_class_228();
microMIPS_ADDIUSP_class_229();
microMIPS_ADDIUSP_class_230();
microMIPS_ADDIUSP_class_231();
microMIPS_ADDIUSP_class_232();
microMIPS_ADDIUSP_class_233();
microMIPS_ADDIUSP_class_234();
microMIPS_ADDIUSP_class_235();
microMIPS_ADDIUSP_class_236();
microMIPS_ADDIUSP_class_237();
microMIPS_ADDIUSP_class_238();
microMIPS_ADDIUSP_class_239();
microMIPS_ADDIUSP_class_240();
microMIPS_ADDIUSP_class_241();
microMIPS_ADDIUSP_class_242();
microMIPS_ADDIUSP_class_243();
microMIPS_ADDIUSP_class_244();
microMIPS_ADDIUSP_class_245();
microMIPS_ADDIUSP_class_246();
microMIPS_ADDIUSP_class_247();
microMIPS_ADDIUSP_class_248();
microMIPS_ADDIUSP_class_249();
microMIPS_ADDIUSP_class_250();
microMIPS_ADDIUSP_class_251();
microMIPS_ADDIUSP_class_252();
microMIPS_ADDIUSP_class_253();
microMIPS_ADDIUSP_class_254();
microMIPS_ADDIUSP_class_255();
microMIPS_ADDIUSP_class_256();
microMIPS_ADDIUSP_class_257();
microMIPS_ADDIUSP_class_258();
microMIPS_ADDIUSP_class_259();
microMIPS_ADDIUSP_class_260();
microMIPS_ADDIUSP_class_261();
microMIPS_ADDIUSP_class_262();
microMIPS_ADDIUSP_class_263();
microMIPS_ADDIUSP_class_264();
microMIPS_ADDIUSP_class_265();
microMIPS_ADDIUSP_class_266();
microMIPS_ADDIUSP_class_267();
microMIPS_ADDIUSP_class_268();
microMIPS_ADDIUSP_class_269();
microMIPS_ADDIUSP_class_270();
microMIPS_ADDIUSP_class_271();
microMIPS_ADDIUSP_class_272();
microMIPS_ADDIUSP_class_273();
microMIPS_ADDIUSP_class_274();
microMIPS_ADDIUSP_class_275();
microMIPS_ADDIUSP_class_276();
microMIPS_ADDIUSP_class_277();
microMIPS_ADDIUSP_class_278();
microMIPS_ADDIUSP_class_279();
microMIPS_ADDIUSP_class_280();
microMIPS_ADDIUSP_class_281();
microMIPS_ADDIUSP_class_282();
microMIPS_ADDIUSP_class_283();
microMIPS_ADDIUSP_class_284();
microMIPS_ADDIUSP_class_285();
microMIPS_ADDIUSP_class_286();
microMIPS_ADDIUSP_class_287();
microMIPS_ADDIUSP_class_288();
microMIPS_ADDIUSP_class_289();
microMIPS_ADDIUSP_class_290();
microMIPS_ADDIUSP_class_291();
microMIPS_ADDIUSP_class_292();
microMIPS_ADDIUSP_class_293();
microMIPS_ADDIUSP_class_294();
microMIPS_ADDIUSP_class_295();
microMIPS_ADDIUSP_class_296();
microMIPS_ADDIUSP_class_297();
microMIPS_ADDIUSP_class_298();
microMIPS_ADDIUSP_class_299();
microMIPS_ADDIUSP_class_300();
microMIPS_ADDIUSP_class_301();
microMIPS_ADDIUSP_class_302();
microMIPS_ADDIUSP_class_303();
microMIPS_ADDIUSP_class_304();
microMIPS_ADDIUSP_class_305();
microMIPS_ADDIUSP_class_306();
microMIPS_ADDIUSP_class_307();
microMIPS_ADDIUSP_class_308();
microMIPS_ADDIUSP_class_309();
microMIPS_ADDIUSP_class_310();
microMIPS_ADDIUSP_class_311();
microMIPS_ADDIUSP_class_312();
microMIPS_ADDIUSP_class_313();
microMIPS_ADDIUSP_class_314();
microMIPS_ADDIUSP_class_315();
microMIPS_ADDIUSP_class_316();
microMIPS_ADDIUSP_class_317();
microMIPS_ADDIUSP_class_318();
microMIPS_ADDIUSP_class_319();
microMIPS_ADDIUSP_class_320();
microMIPS_ADDIUSP_class_321();
microMIPS_ADDIUSP_class_322();
microMIPS_ADDIUSP_class_323();
microMIPS_ADDIUSP_class_324();
microMIPS_ADDIUSP_class_325();
microMIPS_ADDIUSP_class_326();
microMIPS_ADDIUSP_class_327();
microMIPS_ADDIUSP_class_328();
microMIPS_ADDIUSP_class_329();
microMIPS_ADDIUSP_class_330();
microMIPS_ADDIUSP_class_331();
microMIPS_ADDIUSP_class_332();
microMIPS_ADDIUSP_class_333();
microMIPS_ADDIUSP_class_334();
microMIPS_ADDIUSP_class_335();
microMIPS_ADDIUSP_class_336();
microMIPS_ADDIUSP_class_337();
microMIPS_ADDIUSP_class_338();
microMIPS_ADDIUSP_class_339();
microMIPS_ADDIUSP_class_340();
microMIPS_ADDIUSP_class_341();
microMIPS_ADDIUSP_class_342();
microMIPS_ADDIUSP_class_343();
microMIPS_ADDIUSP_class_344();
microMIPS_ADDIUSP_class_345();
microMIPS_ADDIUSP_class_346();
microMIPS_ADDIUSP_class_347();
microMIPS_ADDIUSP_class_348();
microMIPS_ADDIUSP_class_349();
microMIPS_ADDIUSP_class_350();
microMIPS_ADDIUSP_class_351();
microMIPS_ADDIUSP_class_352();
microMIPS_ADDIUSP_class_353();
microMIPS_ADDIUSP_class_354();
microMIPS_ADDIUSP_class_355();
microMIPS_ADDIUSP_class_356();
microMIPS_ADDIUSP_class_357();
microMIPS_ADDIUSP_class_358();
microMIPS_ADDIUSP_class_359();
microMIPS_ADDIUSP_class_360();
microMIPS_ADDIUSP_class_361();
microMIPS_ADDIUSP_class_362();
microMIPS_ADDIUSP_class_363();
microMIPS_ADDIUSP_class_364();
microMIPS_ADDIUSP_class_365();
microMIPS_ADDIUSP_class_366();
microMIPS_ADDIUSP_class_367();
microMIPS_ADDIUSP_class_368();
microMIPS_ADDIUSP_class_369();
microMIPS_ADDIUSP_class_370();
microMIPS_ADDIUSP_class_371();
microMIPS_ADDIUSP_class_372();
microMIPS_ADDIUSP_class_373();
microMIPS_ADDIUSP_class_374();
microMIPS_ADDIUSP_class_375();
microMIPS_ADDIUSP_class_376();
microMIPS_ADDIUSP_class_377();
microMIPS_ADDIUSP_class_378();
microMIPS_ADDIUSP_class_379();
microMIPS_ADDIUSP_class_380();
microMIPS_ADDIUSP_class_381();
microMIPS_ADDIUSP_class_382();
microMIPS_ADDIUSP_class_383();
microMIPS_ADDIUSP_class_384();
microMIPS_ADDIUSP_class_385();
microMIPS_ADDIUSP_class_386();
microMIPS_ADDIUSP_class_387();
microMIPS_ADDIUSP_class_388();
microMIPS_ADDIUSP_class_389();
microMIPS_ADDIUSP_class_390();
microMIPS_ADDIUSP_class_391();
microMIPS_ADDIUSP_class_392();
microMIPS_ADDIUSP_class_393();
microMIPS_ADDIUSP_class_394();
microMIPS_ADDIUSP_class_395();
microMIPS_ADDIUSP_class_396();
microMIPS_ADDIUSP_class_397();
microMIPS_ADDIUSP_class_398();
microMIPS_ADDIUSP_class_399();
microMIPS_ADDIUSP_class_400();
microMIPS_ADDIUSP_class_401();
microMIPS_ADDIUSP_class_402();
microMIPS_ADDIUSP_class_403();
microMIPS_ADDIUSP_class_404();
microMIPS_ADDIUSP_class_405();
microMIPS_ADDIUSP_class_406();
microMIPS_ADDIUSP_class_407();
microMIPS_ADDIUSP_class_408();
microMIPS_ADDIUSP_class_409();
microMIPS_ADDIUSP_class_410();
microMIPS_ADDIUSP_class_411();
microMIPS_ADDIUSP_class_412();
microMIPS_ADDIUSP_class_413();
microMIPS_ADDIUSP_class_414();
microMIPS_ADDIUSP_class_415();
microMIPS_ADDIUSP_class_416();
microMIPS_ADDIUSP_class_417();
microMIPS_ADDIUSP_class_418();
microMIPS_ADDIUSP_class_419();
microMIPS_ADDIUSP_class_420();
microMIPS_ADDIUSP_class_421();
microMIPS_ADDIUSP_class_422();
microMIPS_ADDIUSP_class_423();
microMIPS_ADDIUSP_class_424();
microMIPS_ADDIUSP_class_425();
microMIPS_ADDIUSP_class_426();
microMIPS_ADDIUSP_class_427();
microMIPS_ADDIUSP_class_428();
microMIPS_ADDIUSP_class_429();
microMIPS_ADDIUSP_class_430();
microMIPS_ADDIUSP_class_431();
microMIPS_ADDIUSP_class_432();
microMIPS_ADDIUSP_class_433();
microMIPS_ADDIUSP_class_434();
microMIPS_ADDIUSP_class_435();
microMIPS_ADDIUSP_class_436();
microMIPS_ADDIUSP_class_437();
microMIPS_ADDIUSP_class_438();
microMIPS_ADDIUSP_class_439();
microMIPS_ADDIUSP_class_440();
microMIPS_ADDIUSP_class_441();
microMIPS_ADDIUSP_class_442();
microMIPS_ADDIUSP_class_443();
microMIPS_ADDIUSP_class_444();
microMIPS_ADDIUSP_class_445();
microMIPS_ADDIUSP_class_446();
microMIPS_ADDIUSP_class_447();
microMIPS_ADDIUSP_class_448();
microMIPS_ADDIUSP_class_449();
microMIPS_ADDIUSP_class_450();
microMIPS_ADDIUSP_class_451();
microMIPS_ADDIUSP_class_452();
microMIPS_ADDIUSP_class_453();
microMIPS_ADDIUSP_class_454();
microMIPS_ADDIUSP_class_455();
microMIPS_ADDIUSP_class_456();
microMIPS_ADDIUSP_class_457();
microMIPS_ADDIUSP_class_458();
microMIPS_ADDIUSP_class_459();
microMIPS_ADDIUSP_class_460();
microMIPS_ADDIUSP_class_461();
microMIPS_ADDIUSP_class_462();
microMIPS_ADDIUSP_class_463();
microMIPS_ADDIUSP_class_464();
microMIPS_ADDIUSP_class_465();
microMIPS_ADDIUSP_class_466();
microMIPS_ADDIUSP_class_467();
microMIPS_ADDIUSP_class_468();
microMIPS_ADDIUSP_class_469();
microMIPS_ADDIUSP_class_470();
microMIPS_ADDIUSP_class_471();
microMIPS_ADDIUSP_class_472();
microMIPS_ADDIUSP_class_473();
microMIPS_ADDIUSP_class_474();
microMIPS_ADDIUSP_class_475();
microMIPS_ADDIUSP_class_476();
microMIPS_ADDIUSP_class_477();
microMIPS_ADDIUSP_class_478();
microMIPS_ADDIUSP_class_479();
microMIPS_ADDIUSP_class_480();
microMIPS_ADDIUSP_class_481();
microMIPS_ADDIUSP_class_482();
microMIPS_ADDIUSP_class_483();
microMIPS_ADDIUSP_class_484();
microMIPS_ADDIUSP_class_485();
microMIPS_ADDIUSP_class_486();
microMIPS_ADDIUSP_class_487();
microMIPS_ADDIUSP_class_488();
microMIPS_ADDIUSP_class_489();
microMIPS_ADDIUSP_class_490();
microMIPS_ADDIUSP_class_491();
microMIPS_ADDIUSP_class_492();
microMIPS_ADDIUSP_class_493();
microMIPS_ADDIUSP_class_494();
microMIPS_ADDIUSP_class_495();
microMIPS_ADDIUSP_class_496();
microMIPS_ADDIUSP_class_497();
microMIPS_ADDIUSP_class_498();
microMIPS_ADDIUSP_class_499();
microMIPS_ADDIUSP_class_500();
microMIPS_ADDIUSP_class_501();
microMIPS_ADDIUSP_class_502();
microMIPS_ADDIUSP_class_503();
microMIPS_ADDIUSP_class_504();
microMIPS_ADDIUSP_class_505();
microMIPS_ADDIUSP_class_506();
microMIPS_ADDIUSP_class_507();
microMIPS_ADDIUSP_class_508();
microMIPS_ADDIUSP_class_509();
microMIPS_ADDIUSP_class_510();
microMIPS_ADDIUSP_class_511();
microMIPS_ADDIUSP_class_512();
MIPS32_TNEI_class_0();
MIPS32_TNEI_class_1();
MIPS32_TNEI_class_2();
microMIPS_XOR_class_0();
microMIPS_XOR_class_1();
microMIPS_SRL_class_0();
MIPS32_DIVU_class_0();
MIPS32_LUI_class_0();
MIPS32_LUI_class_1();
MIPS32_MADDU_class_0();
microMIPS_ADD_class_0();
microMIPS_ADDU16_class_0();
microMIPS_ADDU16_class_1();
microMIPS_SLLV_class_0();
microMIPS_SUBU16_class_0();
microMIPS_MUH_class_0();
microMIPS_MUH_class_1();
microMIPS_MUH_class_2();
microMIPS_SELEQZ_class_0();
microMIPS_OR_class_0();
microMIPS_ALUIPC_class_0();
microMIPS_ALUIPC_class_1();
MIPS32_ADD_class_0();
microMIPS_MUHU_class_0();
microMIPS_MUHU_class_1();
microMIPS_AUI_class_0();
microMIPS_AUI_class_1();
MIPS32_ADDIU_class_0();
MIPS32_ADDIU_class_1();
microMIPS_DIVU_class_0();
MIPS32_ORI_class_0();
MIPS32_ORI_class_1();
MIPS32_ORI_class_2();
MIPS32_ORI_class_3();
MIPS32_ORI_class_4();
MIPS32_ORI_class_5();
MIPS32_ORI_class_6();
MIPS32_ORI_class_7();
MIPS32_ORI_class_8();
MIPS32_ORI_class_9();
MIPS32_ORI_class_10();
MIPS32_ORI_class_11();
MIPS32_ORI_class_12();
MIPS32_ORI_class_13();
MIPS32_ORI_class_14();
MIPS32_ORI_class_15();
MIPS32_ORI_class_16();
MIPS32_ORI_class_17();
MIPS32_ORI_class_18();
MIPS32_ORI_class_19();
MIPS32_ORI_class_20();
MIPS32_ORI_class_21();
MIPS32_ORI_class_22();
MIPS32_ORI_class_23();
MIPS32_ORI_class_24();
MIPS32_ORI_class_25();
MIPS32_ORI_class_26();
MIPS32_ORI_class_27();
MIPS32_ORI_class_28();
MIPS32_ORI_class_29();
MIPS32_ORI_class_30();
MIPS32_ORI_class_31();
MIPS32_ORI_class_32();
MIPS32_ORI_class_33();
microMIPS_TGE_class_0();
MIPS32_SLTU_class_0();
microMIPS_ANDI16_class_0();
microMIPS_ANDI16_class_1();
microMIPS_ANDI16_class_2();
microMIPS_NOR_class_0();
microMIPS_TNE_class_0();
microMIPS_SRAV_class_0();
MIPS32_SRA_class_0();
MIPS32_TNE_class_0();
microMIPS_ADDIU_class_0();
microMIPS_ADDIU_class_1();
MIPS32_TGEU_class_0();
MIPS32_MULTU_class_0();
MIPS32_DIV_class_0();
microMIPS_ADDIUPC_class_0();
microMIPS_ADDIUPC_class_1();
MIPS32_TLTU_class_0();
MIPS32_MOVZZ_class_0();
microMIPS_MOVE16_class_0();
microMIPS_MOVE16_class_1();
MIPS32_TLTI_class_0();
MIPS32_TLTI_class_1();
MIPS32_TLTI_class_2();
MIPS32_TLTI_class_3();
MIPS32_TLTI_class_4();
MIPS32_TLTI_class_5();
MIPS32_TLTI_class_6();
MIPS32_TLTI_class_7();
MIPS32_TLTI_class_8();
MIPS32_TLTI_class_9();
MIPS32_TLTI_class_10();
MIPS32_TLTI_class_11();
MIPS32_TLTI_class_12();
MIPS32_TLTI_class_13();
MIPS32_TLTI_class_14();
MIPS32_TLTI_class_15();
MIPS32_TLTI_class_16();
MIPS32_TLTI_class_17();
MIPS32_TLTI_class_18();
MIPS32_TLTI_class_19();
MIPS32_TLTI_class_20();
MIPS32_TLTI_class_21();
MIPS32_TLTI_class_22();
MIPS32_TLTI_class_23();
MIPS32_TLTI_class_24();
MIPS32_TLTI_class_25();
MIPS32_TLTI_class_26();
MIPS32_TLTI_class_27();
MIPS32_TLTI_class_28();
MIPS32_TLTI_class_29();
MIPS32_TLTI_class_30();
MIPS32_TLTI_class_31();
MIPS32_TLTI_class_32();
MIPS32_TLTI_class_33();
MIPS32_TLTI_class_34();
MIPS32_TLTI_class_35();
MIPS32_TLTI_class_36();
MIPS32_TLTI_class_37();
MIPS32_TLTI_class_38();
MIPS32_TLTI_class_39();
MIPS32_TLTI_class_40();
MIPS32_TLTI_class_41();
MIPS32_TLTI_class_42();
MIPS32_TLTI_class_43();
MIPS32_TLTI_class_44();
MIPS32_TLTI_class_45();
MIPS32_TLTI_class_46();
MIPS32_TLTI_class_47();
MIPS32_TLTI_class_48();
MIPS32_TLTI_class_49();
MIPS32_TLTI_class_50();
MIPS32_TLTI_class_51();
MIPS32_TLTI_class_52();
MIPS32_TLTI_class_53();
MIPS32_TLTI_class_54();
MIPS32_TLTI_class_55();
MIPS32_TLTI_class_56();
MIPS32_TLTI_class_57();
MIPS32_TLTI_class_58();
MIPS32_TLTI_class_59();
MIPS32_TLTI_class_60();
MIPS32_TLTI_class_61();
MIPS32_TLTI_class_62();
MIPS32_TLTI_class_63();
MIPS32_TLTI_class_64();
MIPS32_TLTI_class_65();
MIPS32_TLTI_class_66();
MIPS32_TLTI_class_67();
MIPS32_TLTI_class_68();
MIPS32_TLTI_class_69();
MIPS32_TLTI_class_70();
MIPS32_TLTI_class_71();
MIPS32_TLTI_class_72();
MIPS32_TLTI_class_73();
MIPS32_TLTI_class_74();
MIPS32_TLTI_class_75();
MIPS32_TLTI_class_76();
MIPS32_TLTI_class_77();
MIPS32_TLTI_class_78();
MIPS32_TLTI_class_79();
MIPS32_TLTI_class_80();
MIPS32_TLTI_class_81();
MIPS32_TLTI_class_82();
MIPS32_TLTI_class_83();
MIPS32_TLTI_class_84();
MIPS32_TLTI_class_85();
MIPS32_TLTI_class_86();
MIPS32_TLTI_class_87();
MIPS32_TLTI_class_88();
MIPS32_TLTI_class_89();
MIPS32_TLTI_class_90();
MIPS32_TLTI_class_91();
MIPS32_TLTI_class_92();
MIPS32_TLTI_class_93();
MIPS32_TLTI_class_94();
MIPS32_TLTI_class_95();
MIPS32_TLTI_class_96();
MIPS32_TLTI_class_97();
MIPS32_TLTI_class_98();
MIPS32_TLTI_class_99();
MIPS32_TLTI_class_100();
MIPS32_TLTI_class_101();
MIPS32_TLTI_class_102();
MIPS32_TLTI_class_103();
MIPS32_TLTI_class_104();
MIPS32_TLTI_class_105();
MIPS32_TLTI_class_106();
MIPS32_TLTI_class_107();
MIPS32_TLTI_class_108();
MIPS32_TLTI_class_109();
MIPS32_TLTI_class_110();
MIPS32_TLTI_class_111();
MIPS32_TLTI_class_112();
MIPS32_TLTI_class_113();
MIPS32_TLTI_class_114();
MIPS32_TLTI_class_115();
MIPS32_TLTI_class_116();
MIPS32_TLTI_class_117();
MIPS32_TLTI_class_118();
MIPS32_TLTI_class_119();
MIPS32_TLTI_class_120();
MIPS32_TLTI_class_121();
MIPS32_TLTI_class_122();
MIPS32_TLTI_class_123();
MIPS32_TLTI_class_124();
MIPS32_TLTI_class_125();
MIPS32_TLTI_class_126();
MIPS32_TLTI_class_127();
MIPS32_TLTI_class_128();
microMIPS_SELNEZ_class_0();
microMIPS_AND_class_0();
MIPS32_TGEIU_class_0();
MIPS32_TGEIU_class_1();
MIPS32_TGEIU_class_2();
MIPS32_TGEIU_class_3();
MIPS32_TGEIU_class_4();
MIPS32_TGEIU_class_5();
MIPS32_TGEIU_class_6();
MIPS32_TGEIU_class_7();
MIPS32_TGEIU_class_8();
MIPS32_TGEIU_class_9();
MIPS32_TGEIU_class_10();
MIPS32_TGEIU_class_11();
MIPS32_TGEIU_class_12();
MIPS32_TGEIU_class_13();
MIPS32_TGEIU_class_14();
MIPS32_TGEIU_class_15();
MIPS32_TGEIU_class_16();
MIPS32_TGEIU_class_17();
MIPS32_TGEIU_class_18();
MIPS32_TGEIU_class_19();
MIPS32_TGEIU_class_20();
MIPS32_TGEIU_class_21();
MIPS32_TGEIU_class_22();
MIPS32_TGEIU_class_23();
MIPS32_TGEIU_class_24();
MIPS32_TGEIU_class_25();
MIPS32_TGEIU_class_26();
MIPS32_TGEIU_class_27();
MIPS32_TGEIU_class_28();
MIPS32_TGEIU_class_29();
MIPS32_TGEIU_class_30();
MIPS32_TGEIU_class_31();
MIPS32_TGEIU_class_32();
MIPS32_TGEIU_class_33();
MIPS32_TGEIU_class_34();
MIPS32_TGEIU_class_35();
MIPS32_TGEIU_class_36();
MIPS32_TGEIU_class_37();
MIPS32_TGEIU_class_38();
MIPS32_TGEIU_class_39();
MIPS32_TGEIU_class_40();
MIPS32_TGEIU_class_41();
MIPS32_TGEIU_class_42();
MIPS32_TGEIU_class_43();
MIPS32_TGEIU_class_44();
MIPS32_TGEIU_class_45();
MIPS32_TGEIU_class_46();
MIPS32_TGEIU_class_47();
MIPS32_TGEIU_class_48();
MIPS32_TGEIU_class_49();
MIPS32_TGEIU_class_50();
MIPS32_TGEIU_class_51();
MIPS32_TGEIU_class_52();
MIPS32_TGEIU_class_53();
MIPS32_TGEIU_class_54();
MIPS32_TGEIU_class_55();
MIPS32_TGEIU_class_56();
MIPS32_TGEIU_class_57();
MIPS32_TGEIU_class_58();
MIPS32_TGEIU_class_59();
MIPS32_TGEIU_class_60();
MIPS32_TGEIU_class_61();
MIPS32_TGEIU_class_62();
MIPS32_TGEIU_class_63();
MIPS32_TGEIU_class_64();
MIPS32_TGEIU_class_65();
MIPS32_TGEIU_class_66();
MIPS32_TGEIU_class_67();
MIPS32_TGEIU_class_68();
MIPS32_TGEIU_class_69();
MIPS32_TGEIU_class_70();
MIPS32_TGEIU_class_71();
MIPS32_TGEIU_class_72();
MIPS32_TGEIU_class_73();
MIPS32_TGEIU_class_74();
MIPS32_TGEIU_class_75();
MIPS32_TGEIU_class_76();
MIPS32_TGEIU_class_77();
MIPS32_TGEIU_class_78();
MIPS32_TGEIU_class_79();
MIPS32_TGEIU_class_80();
MIPS32_TGEIU_class_81();
MIPS32_TGEIU_class_82();
MIPS32_TGEIU_class_83();
MIPS32_TGEIU_class_84();
MIPS32_TGEIU_class_85();
MIPS32_TGEIU_class_86();
MIPS32_TGEIU_class_87();
MIPS32_TGEIU_class_88();
MIPS32_TGEIU_class_89();
MIPS32_TGEIU_class_90();
MIPS32_TGEIU_class_91();
MIPS32_TGEIU_class_92();
MIPS32_TGEIU_class_93();
MIPS32_TGEIU_class_94();
MIPS32_TGEIU_class_95();
MIPS32_TGEIU_class_96();
MIPS32_TGEIU_class_97();
MIPS32_TGEIU_class_98();
MIPS32_TGEIU_class_99();
MIPS32_TGEIU_class_100();
MIPS32_TGEIU_class_101();
MIPS32_TGEIU_class_102();
MIPS32_TGEIU_class_103();
MIPS32_TGEIU_class_104();
MIPS32_TGEIU_class_105();
MIPS32_TGEIU_class_106();
MIPS32_TGEIU_class_107();
MIPS32_TGEIU_class_108();
MIPS32_TGEIU_class_109();
MIPS32_TGEIU_class_110();
MIPS32_TGEIU_class_111();
MIPS32_TGEIU_class_112();
MIPS32_TGEIU_class_113();
MIPS32_TGEIU_class_114();
MIPS32_TGEIU_class_115();
MIPS32_TGEIU_class_116();
MIPS32_TGEIU_class_117();
MIPS32_TGEIU_class_118();
MIPS32_TGEIU_class_119();
MIPS32_TGEIU_class_120();
MIPS32_TGEIU_class_121();
MIPS32_TGEIU_class_122();
MIPS32_TGEIU_class_123();
MIPS32_TGEIU_class_124();
MIPS32_TGEIU_class_125();
MIPS32_TGEIU_class_126();
MIPS32_TGEIU_class_127();
MIPS32_TGEIU_class_128();
microMIPS_SRLV_class_0();
MIPS32_XOR_class_0();
microMIPS_MODU_class_0();
microMIPS_ROTRV_class_0();
MIPS32_SLTIU_class_0();
MIPS32_SLTIU_class_1();
MIPS32_SLTIU_class_2();

	}
}