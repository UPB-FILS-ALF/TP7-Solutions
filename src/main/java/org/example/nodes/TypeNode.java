package org.example.nodes;

import org.example.nodes.ASTNode;

public class TypeNode extends ASTNode {
    String id = "type";
    public String typeName;
    public TypeNode(String typeName, int line) {
        super();
        this.typeName = typeName;
        this.line = line;
    }
}
