import sys
import string

def remove_strange_symbols(my_str):
    return ''.join([str(char) for char in my_str if char in string.printable])

raw_result = sys.argv[1]
f = open(raw_result, 'r')
lines = f.readlines()
extracted_result = ''
for l in lines:
    if ('java.lang.Character' in l) or ('java.lang.Integer' in l):
        l = remove_strange_symbols(l)
        if('=?' not in l) and ('=,' not in l):
            extracted_result += l.replace('[INFO]','').replace('java.lang.','').replace(':',' ').strip() + '\n'
f.close()
open(raw_result, 'w').write(extracted_result)
print(extracted_result)
