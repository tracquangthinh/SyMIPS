import os
import subprocess

def read_file(path):
    with open(path, 'r') as f:
        return f.read()

def convert_to_asm(registers_string):
    registers_string = registers_string.strip().rstrip("}").lstrip("{")
    regs = registers_string.split(",")
    asm_codes = []
    for reg in regs:
        reg = reg.replace("\"", "").split(":")
        if reg[0] not in ['s', 't', 'u', 'y', 'w', 'x']:
                asm_codes.append("ADDI $" + registers[reg[0]] + ", $zero, " + reg[1])
            # else:
            #     if reg[0] == 'w':
            #         asm_codes = ["ADDI $at, $zero, " + reg[1], "MTHI $at"] + asm_codes
            #     else:
            #         asm_codes = ["ADDI $at, $zero, " + reg[1], "MTLO $at"] + asm_codes

    return asm_codes

def mar_command(input):
    mar_path = project_path + "/lib/Mars4_5.jar"
    commands = ["java", "-jar",mar_path, "dec"] + registerNames+ [input]
    return commands

def execute_mar(path):
    commands = mar_command(path)
    out = subprocess.Popen(commands, stdout=subprocess.PIPE, stderr=subprocess.STDOUT)
    stdout, _ = out.communicate()
    lines = str(stdout).split("\\n")[3:-1]
    results = {}
    for line in lines:
        line = line.split("\\t")
        if len(line) < 2:
            return None
        results[line[0].replace("$", "")] = int(line[1])
    return results

def read_symips_output(registers_string):
    registers_string = registers_string.strip().rstrip("}").lstrip("{")
    regs = registers_string.split(",")
    results = {}
    for reg in regs:
        reg = reg.replace("\"", "").split(":")
        if reg[0] not in ['s', 't', 'u', 'y', 'w', 'x']:
            results[registers[reg[0]]] = int(reg[1])
    return results

def comprare(symips_result, mar_results):
    if mar_results is None:
        print("* Can not execute in Mar!")
        return False
    for reg_name in registerNames:
        if symips_result[reg_name] != mar_results[reg_name]:
            print("* Warning: The value of two " + reg_name + " is different!\n")
            print(symips_results, mar_results)
            return False
    return True

registerNames = ["zero", "at", "v0", "v1", "a0", "a1", "a2", "a3", "t0", "t1", "t2", "t3", "t4", "t5", "t6", "t7",
                          "s0", "s1", "s2", "s3", "s4", "s5", "s6", "s7", "t8", "t9", "k0", "k1", "ra"]
symbols = ['0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h',
                       'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 'v']

registers = {}
for i in range(len(registerNames)):
    registers[symbols[i]] = registerNames[i]

project_path = os.path.dirname(os.getcwd())
jdart_path = project_path + "/symips/jdart/"
files = os.listdir(jdart_path)

method_decleration = ""
main_exec = ""

for file in files:
    exception = False
    # for e in ['WSBH', 'SEH', 'TGEI', 'TLTIU', 'TGE', 'SRL', 'SEB', 'TLT', 'TNEI', 'SRA', 'TNE', 'MOVZZ']:
    #     if e in file:
    #         exception = True
    #         break
    if exception:
        continue
    if ".tests" in file and "MIPS32" in file:
        class_name = file.replace(".tests", "")
        method_name = class_name.rstrip("_class")
        print(method_name)
        with open(jdart_path+file, "r") as f:
            testcases = f.readlines()
            if(len(testcases) > 0):
                for i, testcase in enumerate(testcases):
                    params = testcase.strip("\n").rstrip(",").split(",")
                    param_dict = {}
                    param_list = []
                    for param in params:
                        param = param.strip(" ").split(" ")[1]
                        param_obj = param.split("=")
                        param_dict[param_obj[0]] = param_obj[1]

                    for sym in ['rd', 're', 'rs', 'rt']:
                        if sym in param_dict.keys():
                            param_list.append("$"+registers[param_dict[sym]])

                    for sym in ['immediate', 'bp', 'sa']:
                        if sym in param_dict.keys():
                            param_list.append(param_dict[sym])

                    param_str = " " + ", ".join(param_list)

                    method = method_name + param_str
                    method = method.replace("MIPS32_", "").replace("microMIPS_", "")
                    print(method)

                    before_registers = read_file(jdart_path+class_name+"/"+class_name+"_"+str(i)+".inp")
                    asm_codes = convert_to_asm(before_registers)
                    asm_codes.append(method)
                    asm_path = jdart_path+class_name+"/"+class_name+"_"+str(i)+".asm"
                    open(asm_path, "w").write("\n".join(asm_codes))
                    mar_results = execute_mar(asm_path)
                    after_registers= read_file(jdart_path+class_name+"/"+class_name+"_"+str(i)+".out")
                    symips_results = read_symips_output(after_registers)
                    if comprare(symips_results, mar_results):
                        print("+ Assert: Successful.\n")
                    else:
                        print("+ Assert: Failed.\n")

