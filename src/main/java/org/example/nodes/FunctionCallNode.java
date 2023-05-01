package org.example.nodes;

import java.util.ArrayList;

public class FunctionCallNode extends ASTNode {
    String id = "functionCall";

    String functionName;
    ArrayList<ValueNode> parameters;

    public FunctionCallNode(String functionName, ArrayList<ValueNode> parameters, int line) {
        this.functionName = functionName;
        this.parameters = parameters;
        this.line = line;
    }
}
