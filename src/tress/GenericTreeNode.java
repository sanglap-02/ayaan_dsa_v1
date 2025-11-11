package tress;

import java.util.ArrayList;

public class GenericTreeNode {
    int data;
    ArrayList<GenericTreeNode> children;

    public GenericTreeNode (int data){
        this.data=data;
        children=new ArrayList<>();
    }
}
