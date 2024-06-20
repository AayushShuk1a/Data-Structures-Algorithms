
import java.util.ArrayList;

public class BellmanFordForShortestPath {

    static class Edge{
        
        int src,dest,weight;

        Edge(int src,int dest,int weight){
            this.src=src;
            this.dest=dest;
            this.weight=weight;
        }
    }

    static class Graph{
        int V;
        int E;
        ArrayList<ArrayList<Edge>>adj;
        Graph(int v,int e){
            this.V=v;
            this.E=e;
            adj=new ArrayList<>(V);
            for(int i=0;i<V;i++)
            {
                adj.add(new ArrayList<>());
            }
        }

        void addEdge(int u,int v,int w){
            Edge edge=new Edge(u, v, w);
            adj.get(u).add(edge);
            
        }

        void BellmanFord(int src){

            int dist[]=new int[V];
            for(int i=0;i<V;i++){
                dist[i]=Integer.MAX_VALUE;
            }

            dist[src]=0;

            for(int i=1;i<V;i++){
                for(int j=0;j<V;j++){
                    for(Edge edge:adj.get(j)){
                        int u=edge.src;
                        int v=edge.dest;
                        int w=edge.weight;
                        if(dist[u]!=Integer.MAX_VALUE&&dist[v]>dist[u]+w){
                            dist[v]=dist[u]+w;
                        }
                    }
                }


                for(int u=0;u<V;u++){
                    for(Edge edge:adj.get(u)){
                        int v=edge.dest;
                        int w=edge.weight;
                        if (dist[u] != Integer.MAX_VALUE && dist[u] + w < dist[v]) {
                            System.out.println("Graph contains negative weight cycle");
                            return;
                        }
                    }
                }

            }

            System.out.println("Vertex Distance from Source (" + src + "):");
            for (int i = 0; i < V; ++i) {
                System.out.println("Vertex " + i + ": " + dist[i]);
            }


        }
    }


    public static void main(String[] args) {
        int V = 5; // Number of vertices in graph
        int E = 8; // Number of edges in graph

        Graph graph = new Graph(V, E);

        // Adding edges to the graph
        graph.addEdge(0, 1, -1);
        graph.addEdge(0, 2, 4);
        graph.addEdge(1, 2, 3);
        graph.addEdge(1, 3, 2);
        graph.addEdge(1, 4, 2);
        graph.addEdge(3, 2, 5);
        graph.addEdge(3, 1, 1);
        graph.addEdge(4, 3, -3);

        int source = 0; // Source vertex
        graph.BellmanFord(source);
    }
    

  
    
}
