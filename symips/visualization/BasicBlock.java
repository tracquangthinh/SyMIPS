package symips.visualization;

import symips.unit.AsmNode;

import java.util.ArrayList;

public class BasicBlock {
    private ArrayList<AsmNode> block;
    private int id;
    private ArrayList<BasicBlock> next;
    private boolean isLoop;

    public BasicBlock(int id){
        this.block = new ArrayList<>();
        this.next = new ArrayList<>();
        this.id = id;
        this.isLoop = false;
    }

    public void add(AsmNode node){
        block.add(node);
    }

    public void setID(int id){
        this.id = id;
    }

    public int getId(){
        return this.id;
    }

    public void setLoop(){
        this.isLoop = true;
    }

    public boolean isLoop(){
        return this.isLoop;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("block_");
        sb.append(this.id);
        sb.append(" [label=\"");
        for(int i = 0 ; i < block.size() ; i++) {
            sb.append(block.get(i).getOpcode() + " " + block.get(i).getParams() + "\\l");
        }
        sb.append("\"];");
        return sb.toString();
    }

    public void addNextBlock(BasicBlock b){
        this.next.add(b);
    }

    public ArrayList<BasicBlock> getNextBlock(){
        return this.next;
    }
}
