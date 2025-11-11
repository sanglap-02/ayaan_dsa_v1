package tress;

import com.sun.source.tree.Tree;

import java.util.LinkedList;
import java.util.Queue;

public class treeuse {

    public static void main(String[] args) {
        TreeNode root=new TreeNode(10);
        TreeNode r_left=new TreeNode(20);
        TreeNode r_right=new TreeNode(30);

        TreeNode node_1=new TreeNode(0);

        root.left=r_left;
        root.right=r_right;

        TreeNode newNode=new TreeNode(40);
        r_left.left=newNode;
//        LevelOrderTraversal(root);

        int height=height(node_1);
        System.out.println("the height of the tree is "+height);
    }

    public static int height(TreeNode root){
        if(root==null) return -1;
        int left_height=height(root.left);
        int right_height=height(root.right);

        return 1+ Math.max(left_height,right_height);
    }
    public static void LevelOrderTraversal(TreeNode root){

        Queue<TreeNode> qu=new LinkedList(); // increase the space complexity
        qu.add(root);
        int height=0;

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
            height++;
        }

        System.out.println(height);
    }
    public static TreeNode deleteBST(TreeNode root, int target){
        if(root==null) return root;

        if(target < root.data){
            root.left=deleteBST(root.left,target);
        }
        else if(target > root.data){
            root.right= deleteBST(root.right,target);
        }
        else{
            if(root.left==null){
                return root.right;
            }
            else if(root.right==null){
                return root.left;
            }
            root.data=minValue(root.right);
            root.right=deleteBST(root.right,root.data);

        }
        return root;
    }
    public static int minValue(TreeNode root){
        if(root==null) return -1;
        if(root.left==null) return root.data;
        return minValue(root.left);
    }
}
