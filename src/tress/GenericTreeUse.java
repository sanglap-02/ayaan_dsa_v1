package tress;

public class GenericTreeUse {
    public static void main(String[] args) {
        GenericTreeNode root=new GenericTreeNode(10);

        root.children.add(new GenericTreeNode(2));
        root.children.add(new GenericTreeNode(3));
        root.children.add(new GenericTreeNode(4));

        for (int i=0;i<root.children.size();i++){
            GenericTreeNode curr=root.children.get(i);
            curr.children.add(new GenericTreeNode(curr.data+1));
            curr.children.add(new GenericTreeNode(curr.data+2));
        }

//        System.out.println(height(root));

        // 1-n

        int n=10;
//        print(n);
        print_recursive(n);

    }
    public static void print(int n){ //iterative
        // prints 1->10
        for (int i=0;i<n;i++) System.out.println(i+1);
    }
    public static void print_recursive(int n){ // recursive
        if(n==0) return ;
        print_recursive(n-1); // 10 9 8 7 6 5 4 3 2 1 0
        System.out.println(n);
    }

    public static int height(GenericTreeNode root){
        if(root==null) return -1;

        int maxHeight=-1;
        for(int i=0;i<root.children.size();i++){
            int curr_height=height(root.children.get(i));
            maxHeight=Math.max(maxHeight,curr_height);
        }
        return 1+maxHeight;
    }
}
