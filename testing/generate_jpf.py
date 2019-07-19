import os
from random import randint

regs = ['1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h',
        'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 'v']


def read_file(path):
    with open(path, 'r') as f:
        return f.read()

project_path = os.path.dirname(os.getcwd())
java_path = project_path + "/symips/emulator/base/"
jdart_path = project_path + "/symips/jdart/"
java_files = ["microMIPS", "MIPS32"]

represented_funcs_template = read_file('templates/jpf_represented_funcs.temp')
jdart_funcs_template = read_file('templates/jpf_jdart_funcs.temp')
jdart_template = read_file('templates/jpf.temp')

#for run all tests
sh_script = "cd /jdart-project/jdart;ant;\n"
symips_jdart_dir = '/jdart-project/jdart/src/examples/symips/jdart/'
sh_script_template = 'echo \'+ Generating tests for $methodName ...\'; /jdart-project/jpf-core/bin/jpf ' + symips_jdart_dir + \
                     '$methodName.jpf | tee ' + symips_jdart_dir + '$methodName.tests; python3 jpf_analyze_result.py ' + symips_jdart_dir + '$methodName.tests\n'

for file in java_files:
    with open(java_path + file + ".java") as java_file:
        for line in java_file:
            if "public void" in line:
                line = line.rstrip().replace("public void", "").replace(" {", "").replace("\t", "").lstrip()
                objlines = line.split("(")
                func_name = objlines[0].strip("\t")
                method_name = file + "_" + func_name
                paramsLists = objlines[1].replace(")", "").replace("{", "")
                print(paramsLists)
                full_params = paramsLists.replace("Character", "char")
                shortenParams = paramsLists.replace("Character", "").replace("int", "")
                represented_func = represented_funcs_template.replace("$methodName", method_name).replace("$fullParams", full_params).replace\
                    ("$variation", file).replace("$shortenParams", shortenParams).replace("$funcName", func_name)

                params = paramsLists.split(",")
                randParams = []
                jpf_params = []
                for param in params:
                    if "Character" in param:
                        randParams.append("\'" + str(regs[randint(0, len(regs)-1)]) + "\'")
                        jpf_params.append(param.replace("Character", "").strip(" ") + ":char")
                    elif "int" in param:
                        randParams.append(randint(0, 1000))
                        jpf_params.append(param.replace("int", "").strip(" ") + ":int")
                mainMethod = method_name+"(" + ", ".join(map(str, randParams)) + ");"
                jdart_func = jdart_funcs_template.replace("$class", method_name + "_class").replace\
                    ("$representedFuncs", represented_func).replace("$mainMethod", mainMethod)
                print(jdart_func)
                open(jdart_path+method_name+"_class.java", "w").write(jdart_func)

                jdart_jpf = jdart_template.replace("$class", method_name+"_class").replace("$methodName", method_name).replace\
                    ("$params", ", ".join(jpf_params))
                print(jdart_jpf)
                open(jdart_path+method_name+"_class.jpf", "w").write(jdart_jpf)

                sh_script += sh_script_template.replace("$methodName", method_name+"_class")

open("jpf_tests_gen.sh", "w").write(sh_script)

