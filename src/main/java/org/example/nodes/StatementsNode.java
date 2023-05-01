package org.example.nodes;

import org.example.nodes.ASTNode;

import java.util.ArrayList;

public class StatementsNode extends ASTNode {
    String id = "statements";
    ArrayList<ASTNode> statements;
    public StatementsNode(ArrayList<ASTNode> statements, int line) {
        super();
        this.statements = statements;
        this.line = line;
    }
}
