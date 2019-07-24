# SyMIPS

**SyMIPS** is a Dynamic Symbolic Execution(DSE) tool for MIPS. It is based on [Corana](https://github.com/anhvvcs/corana) as a DSE tool for ARM. 
Until now, it supports running DSE on MIPS32 instruction set under the presence of indirect jump. Because it is a preliminary version and are improving, it still has potential bugs.

## Installation

**Note:** Currently, this version is for Linux only.
### Java Runtime Environment
First, you need to install Java 1.8 or later since **SyMIPS** has been written in Java.

### Capstone

Capstone is a well-known disassembler framework that support various platforms. **SyMIPS** uses it to disassemble a single-step instruction.
* Cloning Capstone: [https://github.com/aquynh/capstone](https://github.com/aquynh/capstone)
* Building: `cd capstone; ./make.sh; sudo ./make.sh install`
    
### Z3

Z3 is a theorem solver developed by Microsoft Research. **SyMIPS** uses Z3 as a SMT solver for checking the satisfiability of path constraints.
* Installing by command line: `sudo apt-get update -y; sudo apt-get install -y z3`
* From source code:  Go to [https://github.com/Z3Prover/z3](https://github.com/Z3Prover/z3) and follows its instructions.

### readelf

readelf is a linux package for reading the format of binary files.
* Installing by command line: `sudo apt-get update -y; sudo apt-get install readelf`

### Building SyMIPS 

You can use a jar file **SyMIPS** or rebuild it from source code.

## Running SyMIPS

```
java -Xss512m -Xmx3048m -jar SyMIPS.jar /full_path/to/input/file
```

## License
This project is licensed under the [MIT License](http://www.opensource.org/licenses/mit-license.php).

## Acknowledgments

I want to thank Mr. Vu Viet Anh for his support. SyMIPS also uses [Java Parsing Library](https://github.com/jawi/java-binutils) to read binary format.
