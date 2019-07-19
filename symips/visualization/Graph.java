package symips.visualization;

import javafx.util.Pair;
import symips.apps.BinParser;
import symips.unit.AsmNode;
import symips.utils.Arithmetic;
import symips.utils.FileUtils;
import symips.utils.Logs;

import java.util.*;


public class Graph {
    ArrayList<AsmNode> nodes;
    ArrayList<BasicBlock> basicBlocks;
    HashMap<String, Integer> basicBlockStr;

    public Graph(ArrayList<AsmNode> nodes){
       this.nodes = nodes;
       this.basicBlocks=  new ArrayList<>();
       this.basicBlockStr = new HashMap<>();
    }

    private void generateGraph(String input){

        String[] paths = input.split("\\*");
        for(int i = 0 ; i < paths.length ; i++){
            if(!paths[i].equals("null")){
                if(paths[i].charAt(0) == '|'){
                    paths[i] = paths[i].substring(1);
                }
                if(paths[i].charAt(paths[i].length() - 1) == '|'){
                    paths[i] = paths[i].substring(0, paths[i].length() - 1);
                }

                ArrayList<String> blocks = new ArrayList<String>(Arrays.asList(paths[i].split("\\|")));

                if(blocks.size() % 2 == 1){
                    blocks.add("");
                }

                for(int j = 0 ; j < blocks.size() ; j = j + 2){
                    String blockStr = blocks.get(j) + blocks.get(j+1);
                    blockStr = blockStr.substring(1);
//                    Logs.infoLn(blockStr);
                    String[] nodeIds = blockStr.split("-");

                    BasicBlock lastBlock = null;
                    if(basicBlocks.size() > 0){
                        lastBlock = basicBlocks.get(basicBlocks.size() - 1);
                    }

                    Integer blockId = basicBlockStr.get(blockStr);
                    if(blockId != null){
                       if( lastBlock.getId() == blockId){
                            lastBlock.setLoop();
                       } else {
//                           Logs.infoLn(lastBlock.getId()+ " -> " + basicBlocks.get(blockId).getId());
                           if(!lastBlock.getNextBlock().contains(basicBlocks.get(blockId))) {
                               lastBlock.addNextBlock(basicBlocks.get(blockId));
                           }
                       }
                    } else {
                        BasicBlock b = new BasicBlock(basicBlocks.size());
                        for(int k = 0 ; k < nodeIds.length ; k++){
                            b.add(nodes.get(Integer.valueOf(nodeIds[k])));
                        }
                        if(lastBlock != null) {
                            lastBlock.addNextBlock(b);
                        }
                        basicBlocks.add(b);
                        basicBlockStr.put(blockStr, b.getId());
                    }
                }
                break;
            }
        }
    }

    public void generateDotFile(String input, String path){
        generateGraph(input);
        StringBuilder sb = new StringBuilder();
        sb.append("digraph G {\n");
        sb.append("mclimit=1.5;\n");
        sb.append("rankdir=TD; ordering=out;\n");
        sb.append("graph[fontsize=10 fontname=\"Verdana\"];\n");
        sb.append("color=\"#efefef\";\n");
        sb.append("node[shape=box style=filled fontsize=11 fontname=\"Verdana\" fillcolor=\"#efefef\"];\n");
        sb.append("edge[fontsize=8 fontname=\"Verdana\"];\n\n");
        for(int i = 0 ; i < basicBlocks.size(); i++){
            sb.append(basicBlocks.get(i)+"\n");
        }
        sb.append("\n");
        for(int i = 0 ; i < basicBlocks.size(); i++){
            String blockId = "block_" + basicBlocks.get(i).getId();
            ArrayList<BasicBlock> nextBlock = basicBlocks.get(i).getNextBlock();
            if(basicBlocks.get(i).isLoop()){
                sb.append(blockId + " -> " + blockId + " [dir=back]\n");
            }
            for(int j = 0 ; j < nextBlock.size() ; j++){
                sb.append(blockId + " -> block_" + nextBlock.get(j).getId() + "\n");
            }
        }
        sb.append("}");
        FileUtils.write(path, sb.toString());
    }

    public void generateDotFile(HashMap<String, Integer> trace, String path){
        StringBuilder sb = new StringBuilder();
        sb.append("digraph G {\n");
        Set<String> paths = trace.keySet();
        for (Iterator<String> it = paths.iterator(); it.hasNext(); ) {
            String temp = it.next();
            sb.append(temp + "\n");
        }
        sb.append("}");
        FileUtils.write(path, sb.toString());
    }

    public void generateASMFile(ArrayList<AsmNode> nodes, String path){
        StringBuilder result = new StringBuilder();
        for(int i = 0 ; i < nodes.size() ; i++){
            result.append(String.valueOf((i*4)) + ": " + nodes.get(i).getOpcode() + " " + nodes.get(i).getParams() + "\n");
        }
        FileUtils.write(path, result.toString());
    }

}
