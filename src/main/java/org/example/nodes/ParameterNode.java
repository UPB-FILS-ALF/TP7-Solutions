package org.example.nodes;

import java.util.ArrayList;

public class ParameterNode extends ASTNode {
    String id = "functionParameter";
    public Object value;
    public String name;

    public ParameterNode(String name, String type, Object value, int line) {
        this.name = name;
        this.type = type;
        this.value = value;
        this.line = line;
    }
}
