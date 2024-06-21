
import java.util.ArrayList;
import java.util.Collections;

public class KruskalAlgoForMST {

   static class Graph{

        class Edge implements Comparable<Edge>{
            int src,dest,weight;
    
            Edge(int src,int dest,int weight){
                this.src=src;
                this.dest=dest;
                this.weight=weight;
            }
    
            public int compareTo(Edge comparEdge){
                return this.weight-comparEdge.weight;
            }
        };
    
        class subset{
            int parent,rank;
        };
    
        int V;
        int E;
        ArrayList<ArrayList<Edge>>edgeList;
    
        public Graph(int V) {
            this.V=V;
            edgeList=new ArrayList<>(V);
            for(int i=0;i<V;i++){
                edgeList.add(new ArrayList<>());
            }
        }
    
        void addEdge(int src,int dest,int weight){
            Edge edge=new Edge(src, dest, weight);
            edgeList.get(src).add(edge);
        }
    
        int find(subset subsets[],int i){
            if(subsets[i].parent==i){
                return i;
            }
    
            subsets[i].parent=find(subsets, subsets[i].parent);
    
            return subsets[i].parent;
        }
    
        void union(subset subsets[],int x,int y){
            int x_rep=find(subsets, x);
            int y_rep=find(subsets,y);
    
            if(subsets[x_rep].rank>subsets[y_rep].rank){
                subsets[y_rep].parent=x_rep;
            }
            else if(subsets[y_rep].rank>subsets[x_rep].rank){
                subsets[x_rep].parent=y_rep;
            }
            else{
                subsets[y_rep].parent=x_rep;
                subsets[x_rep].rank++;
            }
        }
    
        void KruskalMST(){
            ArrayList<Edge>result=new ArrayList<>();
            ArrayList<Edge>edges=new ArrayList<>();
    
            for(ArrayList<Edge>list:edgeList){
                edges.addAll(list);
            }
    
            Collections.sort(edges);
            subset[] subsets=new subset[V];
    
            for(int i=0;i<V;i++){
                subsets[i]=new subset();
            }
    
            for(int i=0;i<V;i++){
                subsets[i].parent=i;
                subsets[i].rank=0;
            }
    
            int e=0;
            int i=0;
            int res=0;
            while(e<V-1){
                Edge nextEdge=edges.get(i++);
                int x=find(subsets, nextEdge.src);
                int y=find(subsets, nextEdge.dest);
    
                if(x!=y){
                    result.add(nextEdge);
                    res+=nextEdge.weight;
                    union(subsets, x, y);
                    e++;
                }
            }
    
            System.out.println("Minimum Spanning Tress result is: "+res);
    
            for(Edge edge:result){
                System.out.println(edge.src+"->"+edge.dest);
            }
        }

    }

    

    public static void main(String[] args) {
        int V = 5; // Number of vertices in graph 
        Graph graph = new Graph(V); 

        // Add edges to the graph
        graph.addEdge(0, 1, 10);
        graph.addEdge(0, 2, 8);
        graph.addEdge(1, 2, 5);
        graph.addEdge(1, 3, 3);
        graph.addEdge(2, 3, 4);
        graph.addEdge(2, 4, 12);
        graph.addEdge(3, 4, 15);

        graph.KruskalMST(); 
    }
    
    
}
