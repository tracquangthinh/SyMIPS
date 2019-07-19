package symips.apps;

import javafx.util.Pair;
import symips.emulator.base.MIPS32;
import symips.emulator.semantics.Environment;
import symips.unit.AsmNode;
import symips.utils.Logs;
import symips.visualization.Graph;

import java.io.File;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;

public class SyMIPS {
    public static void main(String[] args){
        if(args.length == 0){
            Logs.infoLn("+ Missing arguments. Please try again!");
        } else {
            String input = args[0];
            File f = new File(input);
            String fileName = f.getName();
            String path = f.getParent();

            Environment env = new Environment();
            MIPS32 emulator = new MIPS32(env);
            int entryPoint = 0;
            int endPoint = -1;
            long initAddress = -1;
            ArrayList<AsmNode> nodes = null;
            boolean failed_format = false;
            try{
                nodes = BinParser.parse(input);
                endPoint = nodes.size();
            } catch (Throwable e){
                failed_format = true;
            }

            if(!failed_format) {
                initAddress = BinParser.getInitAddress(input);
                Executor executor = new Executor();
                executor.setAddress(initAddress, entryPoint, endPoint);

                String dsePath = null;

                try {
                    executor.exec(emulator, nodes, entryPoint, "", "");
                    dsePath = executor.donePath.get(0);
                } catch (Throwable e) {
                    dsePath = executor.lastPath;
                }
                Logs.infoLn("-> Generating .dot and .capstone file.");
                HashMap<String, Integer> trace = executor.getTrace();
                Graph g = new Graph(nodes);
                g.generateDotFile(trace, path + "/" + fileName + ".dot");
                g.generateASMFile(nodes, path + "/" + fileName + ".capstone");
            }

        }
    }
}
