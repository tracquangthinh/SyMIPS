import os

def read_file(path):
    with open(path, 'r') as f:
        return f.read()

test_element_template = read_file("templates/test_element.temp")
test_case_template = read_file("templates/test_cases_gen.temp")

project_path = os.path.dirname(os.getcwd())
jdart_path = project_path + "/symips/jdart/"
files = os.listdir(jdart_path)

method_decleration = ""
main_exec = ""

for file in files:
    if ".tests" in file:
        class_name = file.replace(".tests", "")
        print(class_name)
        method_name = class_name.rstrip("_class")
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
                    print(param_dict)

                    for sym in ['rd', 're', 'rs', 'rt']:
                        if sym in param_dict.keys():
                            param_list.append("'" + param_dict[sym] + "'")

                    for sym in ['immediate', 'bp', 'sa']:
                        if sym in param_dict.keys():
                            param_list.append(param_dict[sym])

                    param_str = "(" + ", ".join(param_list) + ")"

                    method = method_name + param_str

                    generated_func = test_element_template.replace("$methodName", class_name).replace("$mainMethod", method).replace\
                        ("$testNumber", str(i))
                    print(generated_func)

                    method_decleration += generated_func
                    main_exec += class_name + "_" + str(i) + "();\n"

generated_test_cases = test_case_template.replace("$methodDeclarations", method_decleration).replace("$mainExec", main_exec)
open(jdart_path+"TestCasesGen.java", "w").write(generated_test_cases)
