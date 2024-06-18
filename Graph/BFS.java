
import java.util.ArrayDeque;
import java.util.ArrayList;

public class BFS {

    static void addEdge(ArrayList<ArrayList<Integer>>adj,int u,int v){
        adj.get(u).add(v);
        adj.get(v).add(u);
    }

    static void BFS(ArrayList<ArrayList<Integer>>adj,int s,boolean visited[]){
        ArrayDeque<Integer>q=new ArrayDeque<>();
        q.offer(s);
        visited[s]=true;
        while(!q.isEmpty()){
            int u=q.poll();
            System.out.print(u+" ");
            for(int v:adj.get(u)){
                if(visited[v]==false){
                    q.offer(v);
                    visited[v]=true;
                } 
            }
        }

    }

    static int BFSdin(ArrayList<ArrayList<Integer>>adj,int V){
        boolean[] visited=new boolean[V]; 
        int count=0;
        for(int i=0;i<V;i++){
            if(visited[i]==false){
                BFS(adj,i,visited);
                count++;
            }
        }
        return count;

    }


    public static void main(String[] args) {
        int v=9;
        ArrayList<ArrayList<Integer>>adj=new ArrayList<ArrayList<Integer>>(v);
        
        for(int i=0;i<v;i++){
            adj.add(new ArrayList<>()); 
        }

        addEdge(adj,0,1); 
        addEdge(adj,0,2); 
        addEdge(adj,2,3); 
        addEdge(adj,1,3); 
        addEdge(adj,4,5);
        addEdge(adj,5,6);
        addEdge(adj,4,6);
        addEdge(adj,4,6);
        addEdge(adj, 7, 8);
        

        int totalIslands=BFSdin(adj, v);
        System.out.println(" ");
        System.out.println("Total Islands Are: "+totalIslands);
    }
    
}
