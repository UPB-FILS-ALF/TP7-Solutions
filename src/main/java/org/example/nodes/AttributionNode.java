package org.example.nodes;

public class AttributionNode extends ASTNode{
    String id = "attribution";
    String variable;
    ASTNode value;
    public AttributionNode(String variable, ASTNode value, int line) {
        super();
        this.variable = variable;
        this.value = value;
        this.line = line;
    }
}
