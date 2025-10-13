package tress;

import java.util.LinkedList;
import java.util.Queue;

public class treeuse {

    public static void main(String[] args) {
        TreeNode root=new TreeNode(10);
        TreeNode r_left=new TreeNode(20);
        TreeNode r_right=new TreeNode(30);

        root.left=r_left;
        root.right=r_right;

        TreeNode newNode=new TreeNode(40);
        r_left.left=newNode;
        LevelOrderTraversal(root);
    }
    public static void LevelOrderTraversal(TreeNode root){

        Queue<TreeNode> qu=new LinkedList();
        qu.add(root);

        while(!qu.isEmpty()){
            int size=qu.size();
            for (int i=0;i<size;i++){
                //kam
                TreeNode temp=qu.poll();
                System.out.print(temp.data+" ");
                if(temp.left!=null) qu.add(temp.left);
                if(temp.right!=null) qu.add(temp.right);
            }
            System.out.println();
        }
    }
}
