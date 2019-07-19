package symips.unit;

public class AsmNode {
    private String address;
    private String opcode;
    private String params;

    public AsmNode(String address, String opcode, String params) {
        this.address = address;
        this.opcode = opcode;
        this.params = params;
    }

    public AsmNode(AsmNode node) {
        this.address = node.address;
        this.opcode = node.opcode;
        this.params = node.params;
    }

    @Override
    public String toString() {
        return "AsmNode{" +
                "address='" + address + '\'' +
                ", opcode='" + opcode + '\'' +
                ", params='" + params + '\'' +
                '}';
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getOpcode() {
        return opcode;
    }

    public void setOpcode(String opcode) {
        this.opcode = opcode;
    }

    public String getParams() {
        return params;
    }

    public void setParams(String params) {
        this.params = params;
    }
}
