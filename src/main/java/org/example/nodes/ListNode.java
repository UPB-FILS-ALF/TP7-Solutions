package org.example.nodes;

import java.util.ArrayList;

public class ListNode extends ASTNode{
    String id = "list";
    public String name;
    public ListValuesNode values;
    public ListNode(String type, String name, ListValuesNode values, int line) {
        super();
        this.values = values;
        this.name = name;
        this.type = type;
        this.line = line;
    }

}

