
import java.util.ArrayList;

public class ArticulationPoint {

    static class Graph {

        int V;
        ArrayList<ArrayList<Integer>> adj;

        int time = 0;
        static final int NIL = -1;

        Graph(int V) {
            this.V = V;
            adj = new ArrayList<>(V);
            for (int i = 0; i < V; i++) {
                adj.add(new ArrayList<>());
            }
        }

        void addEdge(int u, int v) {
            adj.get(u).add(v);
            adj.get(v).add(u);
        }

        void BridgeEdgeUtil(int u, boolean[] visited, int[] disc, int[] low, int[] parent) {
            visited[u] = true;
            disc[u] = low[u] = ++time;

            for (int v : adj.get(u)) {
                if (visited[v] == false) {
                    parent[v] = u;
                    BridgeEdgeUtil(v, visited, disc, low, parent);

                    low[u] = Math.min(low[u], low[v]);

                    if (low[v] > disc[u]) {
                        System.out.println(u + " " + v);
                    }
                }
                else if(v!=parent[u]){
                    low[u]=Math.min(low[u],disc[v]);    
                    
                }

            }
        }

        void BridgeEdge() {
            boolean[] visited = new boolean[V];
            int[] disc = new int[V];
            int[] low = new int[V];
            int[] parent = new int[V];

            for (int i = 0; i < V; i++) {
                parent[i] = NIL;
            }

            for (int i = 0; i < V; i++) {
                if (visited[i] == false) {
                    BridgeEdgeUtil(i, visited, disc, low, parent);
                   
                }
                
            }

        }

        void APutil(int u, boolean[] visited, int[] disc, int[] low, int[] parent, boolean[] ap) {
            visited[u] = true;
            disc[u] = low[u] = ++time;
            int children = 0;

            for (int v : adj.get(u)) {
                children++;
                if (visited[v] == false) {
                    parent[v] = u;
                    APutil(v, visited, disc, low, parent, ap);
                    low[u] = Math.min(low[u], low[v]);

                    if (parent[u] == NIL && children > 1) {
                        ap[u] = true;
                    }

                    if (parent[u] != NIL && disc[u] <= low[v]) {
                        ap[u] = true;
                    }
                } else if (u != parent[v]) {
                    low[u] = Math.min(low[u], disc[v]);
                }
            }

        }

        void AP() {
            boolean[] visited = new boolean[V];
            int[] disc = new int[V];
            int[] low = new int[V];
            int[] parent = new int[V];
            boolean[] ap = new boolean[V];

            for (int i = 0; i < V; i++) {
                parent[i] = NIL;
            }

            for (int i = 0; i < V; i++) {
                for (int u : adj.get(i)) {
                    if (visited[u] == false) {
                        APutil(u, visited, disc, low, parent, ap);
                    }
                }
            }

            for (int i = 0; i < V; i++) {
                if (ap[i] == true) {
                    System.out.print(i + " ");
                }
            }
        }
    }

    public static void main(String[] args) {
        // System.out.println("Articulation points in first graph ");
        // Graph g = new Graph(5);
        // g.addEdge(1, 0);
        // g.addEdge(0, 2);
        // g.addEdge(2, 1);
        // g.addEdge(0, 3);
        // g.addEdge(3, 4);
        // g.AP();
        // System.out.println();

        System.out.println("Bridges in first graph "); 
		Graph g = new Graph(5); 
		g.addEdge(1, 0); 
		g.addEdge(0, 2); 
		g.addEdge(2, 1); 
		g.addEdge(0, 3); 
		g.addEdge(3, 4); 
		g.BridgeEdge();
    }

}
