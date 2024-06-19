import java.util.ArrayDeque;
import java.util.ArrayList;

public class DetectCycleInDirectedGraph {

    static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v) 
	{ 
		adj.get(u).add(v); 
		adj.get(v).add(u); 
	} 


    static boolean DFSrec(ArrayList<ArrayList<Integer>>adj,int s,boolean[] visited,boolean[] recSt){
        visited[s]=true;
        recSt[s]=true;
        for(int u:adj.get(s)){
            if(visited[u]==false&&DFSrec(adj, u, visited, recSt)==true){
                return true;
            }
            else if(recSt[u]==true){
                return true;
            }
        }
        recSt[s]=false;
        return false;
    }

    static boolean DFS(ArrayList<ArrayList<Integer>>adj,int v){
        boolean[] visited=new boolean[v];
        boolean[] recSt=new boolean[v];

        for(int i=0;i<v;i++){
            if(visited[i]==false){
               if(DFSrec(adj,i,visited,recSt)==true){
                return true;
               }
            }
        }

        return false;
    }

    static boolean usingTopologicalSort(ArrayList<ArrayList<Integer>>adj,int v){
        int[] in_degree=new int[v];
        for(int i=0;i<v;i++){
            for(int x:adj.get(i)){
                in_degree[x]++;
            }
        }

        ArrayDeque<Integer>q=new ArrayDeque<>();
        for(int i=0;i<v;i++){
            if(in_degree[i]==0){
                q.offer(i);
            }
        }

        int count=0;
        while(!q.isEmpty()){
            int u=q.poll();
            for(int x:adj.get(u)){
                in_degree[x]--;
                if(in_degree[x]==0)
                q.offer(x);
            }
            count++;
        }
        return (count==v)?false:true;
    }



    public static void main(String[] args) {
        int V = 6; 
		ArrayList<ArrayList<Integer> > adj = new ArrayList<ArrayList<Integer>>(V); 
		
		for (int i = 0; i < V; i++) 
			adj.add(new ArrayList<Integer>()); 

			addEdge(adj,0,1); 
        	addEdge(adj,2,1); 
        	addEdge(adj,2,3); 
        	addEdge(adj,3,4); 
        	addEdge(adj,4,5);
        	addEdge(adj,5,3);
		
		if(DFS(adj,V)==true)
    	    System.out.println("Cycle found");
    	else
    	    System.out.println("No cycle found");

        if(usingTopologicalSort(adj,V)==true)
    	    System.out.println("Cycle found");
    	else
    	    System.out.println("No cycle found");
    }
    
}
