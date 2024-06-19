
import java.util.ArrayDeque;
import java.util.ArrayList;

public class ShortestPathInDAGusingTopologicalSort {

    static class AdjListNode{
        int v;
        int weight;
        AdjListNode(int v,int weight){
            this.v=v;
            this.weight=weight;
        }
    }

    static int V;
    static ArrayList<ArrayList<AdjListNode>>adj;

    ShortestPathInDAGusingTopologicalSort(int v){
        this.V=v;
        adj=new ArrayList<ArrayList<AdjListNode>>(V);
        for(int i=0;i<V;i++){
            adj.add(new ArrayList<>());
        }
    }

    static void addEdge(int u,int v,int weight){
        AdjListNode node=new AdjListNode(v, weight);
        adj.get(u).add(node);
    }


    static void TopologicalSortUtil(int s,boolean[] visited,ArrayDeque<Integer>stack){
        visited[s]=true;

        for(AdjListNode Node:adj.get(s)){
            if(visited[Node.v]==false){
                TopologicalSortUtil(Node.v, visited, stack);
            }
        }

        stack.push(s);
    }

    static void ShortestPath(int s){
        boolean[] visited=new boolean[V];
        ArrayDeque<Integer>stack=new ArrayDeque<>();

        for(int i=0;i<V;i++){
            if(visited[i]==false){
                TopologicalSortUtil(i,visited,stack);
            }
        }

        int dist[]=new int[V];
        for(int i=0;i<V;i++){
            dist[i]=Integer.MAX_VALUE;
        }
        dist[s]=0;

        while(!stack.isEmpty()){
            int u=stack.pop();

            if(dist[u]!=Integer.MAX_VALUE){
                for(AdjListNode node:adj.get(u)){
                    if(dist[node.v]>dist[u]+node.weight){
                        dist[node.v]=dist[u]+node.weight;
                    }
                }
            }
        }

        for (int i = 0; i < V; i++)
        {
            if (dist[i] == Integer.MAX_VALUE)
                System.out.print( "INF ");
            else
                System.out.print( dist[i] + " ");
        }

    }

    public static void main(String[] args) {
        ShortestPathInDAGusingTopologicalSort g=new ShortestPathInDAGusingTopologicalSort(6);
        g.addEdge(0, 1, 2);
        g.addEdge(0, 4, 1);
        g.addEdge(1, 2, 3);
        g.addEdge(4, 2, 2);
        g.addEdge(4, 5, 4);
        g.addEdge(2, 3, 6);
        g.addEdge(5, 3, 1);

        int s=0;
        System.out.println("Following are shortest distances "+
                "from source " + s );
        g.ShortestPath(s);


    }
    
}
