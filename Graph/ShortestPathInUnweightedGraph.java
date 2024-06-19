
import java.util.ArrayDeque;
import java.util.ArrayList;

public class ShortestPathInUnweightedGraph {

    static void addEdge(ArrayList<ArrayList<Integer>>adj,int u,int v){
        adj.get(u).add(v);
        adj.get(v).add(u);
    }

    static void BFS(ArrayList<ArrayList<Integer>>adj,int V,int s,int dist[]){
        boolean[] visited=new boolean[V];
        ArrayDeque<Integer>q=new ArrayDeque<>();
        q.offer(s);
        visited[s]=true;
        while(!q.isEmpty()){
            int u=q.poll();
            for(int v:adj.get(u)){
                if(visited[v]==false){
                    dist[v]=dist[u]+1;
                    q.offer(v);
                    visited[v]=true;
                }  
            }
        }
    }

    public static void main(String[] args) {
        int v=4;
        ArrayList<ArrayList<Integer>>adj=new ArrayList<ArrayList<Integer>>(v);
        for(int i=0;i<v;i++){
            adj.add(new ArrayList<>());
        }

        addEdge(adj,0,1); 
    	addEdge(adj,1,2); 
    	addEdge(adj,2,3); 
    	addEdge(adj,0,2); 
    	addEdge(adj,1,3);

        int[] dist=new int[v];
        dist[0]=0;
        for(int i=1;i<v;i++){
            dist[i]=Integer.MAX_VALUE;
        }

        BFS(adj, v, 0, dist);

        for(int i=0;i<v;i++){
            System.out.print(dist[i]+" ");
        }

        
    }
    
}
