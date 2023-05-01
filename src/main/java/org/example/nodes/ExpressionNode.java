package org.example.nodes;

public class ExpressionNode extends ASTNode{
    String id = "expression";
    ASTNode left;
    ASTNode right;
    String op;

    public ExpressionNode(ASTNode left, ASTNode right, String op, String type, int line) {
        super();
        this.left = left;
        this.right = right;
        this.op = op;
        this.line = line;
        this.type = type;
    }
    public ExpressionNode(ASTNode right, String op, int line) {
        super();
        this.right = right;
        this.op = op;
        this.line = line;
    }
}
