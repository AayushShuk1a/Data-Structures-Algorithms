import java.util.ArrayDeque;
import java.util.ArrayList;

public class TopologicalSort {
    
    static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v) 
	{ 
		adj.get(u).add(v);  
	} 

    static void topologicalSort(ArrayList<ArrayList<Integer>>adj,int v){
        int[] in_degree=new int[v];
        for(int i=0;i<v;i++)
        {
            for(int u:adj.get(i)){
                in_degree[u]++;
            }
        }

        ArrayDeque<Integer>q=new ArrayDeque<>();
        for(int i=0;i<v;i++){
            if(in_degree[i]==0){
                q.offer(i);
            }
        }

        while(!q.isEmpty()){
            int u=q.poll();
            System.out.print(u+" ");
            for(int x:adj.get(u)){
                in_degree[x]--;
                if(in_degree[x]==0)
                q.offer(x);
            }
        }
    }

    public static void main(String[] args) {
        int V = 5; 
		ArrayList<ArrayList<Integer> > adj = new ArrayList<ArrayList<Integer>>(V); 
		
		for (int i = 0; i < V; i++) 
			adj.add(new ArrayList<Integer>()); 

			addEdge(adj,0, 2); 
            addEdge(adj,0, 3); 
            addEdge(adj,1, 3); 
            addEdge(adj,1, 4); 
            addEdge(adj,2, 3);
		
		System.out.println("Following is a Topological Sort of"); 
        topologicalSort(adj,V);
    }
}
