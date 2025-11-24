package Graphs;

import java.util.ArrayList;
import java.util.Scanner;

public class GraphUse {

    public static void main(String[] args) {

        Scanner sc  =new Scanner(System.in);
//        int n=6; // here n is the number of nodes / vertices
//        int m=4; // m= no of edges

        System.out.println("Enter the number of nodes/ vertices");
        int n = sc.nextInt();
        System.out.println("Enter the number of edges");
        int m=sc.nextInt();
//        int[][] adj=new int[n+1][n+1];

        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        for (int i=0;i<n+1;i++){
            adj.add(new ArrayList<>());
        }
        for (int i=0;i<m;i++){
            System.out.println("enter the pair");
            int node1=sc.nextInt();
            int node2=sc.nextInt();
            // no directed graph
//            adj[node1][node2] =1;
//            adj[node2][node1] =1;

            // non directed
//            adj.get(node1).add(node2);
//            adj.get(node2).add(node1);

            // directed graph
//            adj[node1][node2]=1;

            // directed
            adj.get(node1).add(node2);
        }
        for (int i=0;i<n+1;i++){
            System.out.print(i+ "-->");
            for (int j=0;j<adj.get(i).size();j++){
                System.out.print(adj.get(i).get(j));
            }
            System.out.println();
        }





    }
}
