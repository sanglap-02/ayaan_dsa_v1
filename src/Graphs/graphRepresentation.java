package Graphs;

import java.util.ArrayList;
import java.util.Scanner;

public class graphRepresentation {

    public static ArrayList<Integer> dfs(int n,int m, ArrayList<ArrayList<Integer>> adj,int[] vis,int curr,ArrayList<Integer> df){
        vis[curr] =1;
        df.add(curr);
        for(int i=0;i<adj.get(curr).size();i++){
            int nab= adj.get(curr).get(i);
            if(vis[nab]==0){
                dfs(n,m,adj,vis,nab,df);
            }
        }
        return df;

    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();

        // adjecency matrix
//        int[][] adj =new int[n+1][n+1];

        // for no directed graph
//        for (int i=0;i<m;i++){
//            int u=sc.nextInt();
//            int v=sc.nextInt();
//
//            adj[u][v]=1;
//            adj[v][u]=1;
//        }
        // directed
//        for (int i=0;i<m;i++){
//            int u=sc.nextInt();
//            int v=sc.nextInt();
//
//            adj[u][v]=1;
//        }

        //        for (int i=0;i<n+1;i++){
//            for (int j=0;j<n+1;j++){
//                System.out.print(adj[i][j]);
//            }
//            System.out.println();
//        }

        //adjcency list
        ArrayList<ArrayList<Integer>> adj=new ArrayList<ArrayList<Integer>>();

        for(int i=0;i<n+1;i++){
            adj.add(new ArrayList<Integer>());
        }
        for (int i=0;i<m;i++){
            int u=sc.nextInt();
            int v=sc.nextInt();

            adj.get(u).add(v);
            adj.get(v).add(u); // remove this in case of a directed graph
        }

        int[] vis=new int[n+1];
//        ArrayList<Integer> df=dfs(n,m,adj,vis,1,new ArrayList<>());

        int provences =0;
        for(int i=1;i<vis.length;i++){

            if(vis[i]==0){
                ArrayList<Integer> df=dfs(n,m,adj,vis,i,new ArrayList<>());
                for (int j=0;j<df.size();j++){
                    System.out.print(df.get(j)+" ");
                }
                provences++;
            }

        }
        System.out.println("no of provences is "+provences);



    }
}
