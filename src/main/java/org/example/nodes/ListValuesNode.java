package org.example.nodes;

import java.util.ArrayList;

public class ListValuesNode extends ASTNode {
    String id = "listValues";
    public ArrayList<ValueNode> values;
    public ListValuesNode(ArrayList<ValueNode> values, int line) {
        super();
        this.values = values;
        this.line = line;
    }
}
