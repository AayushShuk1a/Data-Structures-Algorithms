
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;

public class KosarajuAlgoForSCC {

     static class Graph{
        int V;
        ArrayList<ArrayList<Integer>>adj;
        Graph(int v){
            V=v;
            adj=new ArrayList<ArrayList<Integer>>(V);
            for(int i=0;i<V;i++){
                adj.add(new ArrayList<>());
            }
        }


        void AddEdge(int u,int v){
            adj.get(u).add(v);
        }
    
        void fillOrder(int s,boolean []visited,ArrayDeque<Integer>stack){
            visited[s]=true;
    
            Iterator<Integer>it=adj.get(s).iterator();
            while(it.hasNext()){
                int n=it.next();
                if(visited[n]==false){
                    fillOrder(n, visited, stack);
                }
            }
    
            stack.push(s);
        }
    
        Graph getTranspose(){
            Graph g=new Graph(V);
            for(int v=0;v<V;v++){
                Iterator<Integer>it=adj.get(v).listIterator();
                while(it.hasNext()){
                    int n=it.next();
                    g.adj.get(n).add(v);
                }
    
            }
    
            return g;
        }

        void DFSutil(int s,boolean [] visited){
            visited[s]=true;
            System.out.print(s+" ");
            for(int u:adj.get(s)){
                if(visited[u]==false){
                    DFSutil(u, visited);
                }
            }
        }
    
    
        void printSCC(){
            ArrayDeque<Integer>stack=new ArrayDeque<>();
            boolean[] visited=new boolean[V];
    
            for(int i=0;i<V;i++){
                if(visited[i]==false)
                fillOrder(i,visited,stack);
            }


            Graph gr=getTranspose();
            for(int i=0;i<V;i++){
                visited[i]=false;
            }

            while(!stack.isEmpty()){
                int u=stack.pop();
                if(visited[u]==false){
                    gr.DFSutil(u,visited); 
                    System.out.println(" ");  
                }
                
            }
        }
    }

    public static void main(String[] args) {
        Graph g=new Graph(5);
        g.AddEdge(1, 0); 
		g.AddEdge(0, 2); 
		g.AddEdge(2, 1); 
		g.AddEdge(0, 3); 
		g.AddEdge(3, 4); 

		System.out.println("Following are strongly connected components "+ 
						"in given graph "); 
		g.printSCC();
    }

     
    
}

