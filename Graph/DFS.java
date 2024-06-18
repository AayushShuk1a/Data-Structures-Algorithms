
import java.util.ArrayList;

public class DFS {
    static void addEdge(ArrayList<ArrayList<Integer>>adj,int u,int v){
        adj.get(u).add(v);
        adj.get(v).add(u);
    }


    static void DFSRec(ArrayList<ArrayList<Integer>>adj,int s,boolean[] visited){
        visited[s]=true;
        System.out.print(s+" ");
       

        for(int u:adj.get(s)){
            if(visited[u]==false){
                DFSRec(adj, u, visited);
            }
        }
    }

    static int DFS(ArrayList<ArrayList<Integer>>adj,int v){
        boolean[] visited=new boolean[v];
        int count=0;
        for(int i=0;i<v;i++){
            if(visited[i]==false){
                DFSRec(adj, i,visited);
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int v=5;
        ArrayList<ArrayList<Integer>>adj=new ArrayList<ArrayList<Integer>>(v);

        for(int i=0;i<v;i++){
            adj.add(new ArrayList<>());
        }

        addEdge(adj,0,1); 
        addEdge(adj,0,2); 
        addEdge(adj,1,2);
        addEdge(adj,3,4);
        int totalIslands=DFS(adj, v);
        System.out.println(" ");
        System.out.println("Total Number of islands are: "+totalIslands);
    }
}
