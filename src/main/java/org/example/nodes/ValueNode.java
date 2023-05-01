package org.example.nodes;

import org.example.nodes.ASTNode;

public class ValueNode extends ASTNode {
    String id = "value";
    public Object value;
    public ValueNode(Object value, String type, int line) {
        super();
        this.value = value;
        this.type = type;
        this.line = line;
    }

}

