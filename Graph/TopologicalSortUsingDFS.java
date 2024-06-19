
import java.util.ArrayDeque;
import java.util.ArrayList;

public class TopologicalSortUsingDFS {

    static void addEdge(ArrayList<ArrayList<Integer>>adj,int u,int v){
        adj.get(u).add(v);
    }

    static void DFS(ArrayList<ArrayList<Integer>>adj,int s,boolean [] visited,ArrayDeque<Integer>stk){
        visited[s]=true;
        for(int x:adj.get(s)){
            if(visited[x]==false){
                DFS(adj, x, visited, stk);
            }
        }
        stk.push(s);
    }


    static void TopologicalSort(ArrayList<ArrayList<Integer>>adj,int v){
        boolean[] visited=new boolean[v];

        ArrayDeque<Integer>stk=new ArrayDeque<>();

        for(int i=0;i<v;i++){
            if(visited[i]==false){
                DFS(adj,i,visited,stk);
            }
        }

        for(int x:stk){
            System.out.print(x+" ");
        }
    }

    public static void main(String[] args) {
        int V = 5; 
		ArrayList<ArrayList<Integer> > adj = new ArrayList<ArrayList<Integer>>(V); 
		
		for (int i = 0; i < V; i++) 
			adj.add(new ArrayList<Integer>()); 

			addEdge(adj,0, 1); 
            addEdge(adj,1, 3); 
            addEdge(adj,2, 3); 
            addEdge(adj,3, 4); 
            addEdge(adj,2, 4); 
		
		System.out.println("Following is a Topological Sort of"); 
        TopologicalSort(adj,V);
    }
    
}
