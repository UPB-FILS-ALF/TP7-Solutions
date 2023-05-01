package org.example.nodes;

import java.util.ArrayList;

public class FunctionNode extends ASTNode{
    String id = "function";
    String functionName;
    ArrayList<ParameterNode> parameters;
    StatementsNode instructions;
    ReturnNode returnNode;

    public FunctionNode(String functionName, ArrayList<ParameterNode> parameters, StatementsNode instructions, ReturnNode returnNode, int line) {
        this.id = id;
        this.line = line;
        this.functionName = functionName;
        this.parameters = parameters;
        this.instructions = instructions;
        this.returnNode = returnNode;
    }
}
