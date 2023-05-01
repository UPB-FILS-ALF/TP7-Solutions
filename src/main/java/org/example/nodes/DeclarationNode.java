package org.example.nodes;

public class DeclarationNode extends ASTNode{
    String id = "declaration";
    public String variableType;
    public String variable;
    public ASTNode value;
    public DeclarationNode(String variableType, String variable, ASTNode value, int line) {
        super();
        this.variableType = variableType;
        this.variable = variable;
        this.value = value;
        this.line = line;
    }
}
