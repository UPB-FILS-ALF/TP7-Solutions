package org.example.nodes;

import org.example.nodes.ASTNode;
import org.example.nodes.ExpressionNode;

public class ReturnNode extends ASTNode {
    String id = "return";
    public ASTNode statement;
    public ReturnNode(ASTNode statement, int line) {
        super();
        this.statement = statement;
        this.line = line;
    }

}

