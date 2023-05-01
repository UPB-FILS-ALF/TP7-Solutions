package org.example.nodes;

import org.example.nodes.ASTNode;

public class VariableNode extends ASTNode {
    String id = "variable";
    String variableName;
    VariableNode(String variableName, int line) {
        super();
        this.variableName = variableName;
        this.line = line;
    }
}
