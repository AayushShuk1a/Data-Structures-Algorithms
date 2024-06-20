
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;

public class TarjansAlgoForSCC {

    static class Graph{
        int V;
        ArrayList<ArrayList<Integer>>adj;
        static int time=0;
        Graph(int v){
            this.V=v;
            adj=new ArrayList<>(V);
            for(int i=0;i<V;i++){
                adj.add(new ArrayList<>());
            }
        }

        void addEdge(int u,int v){
            adj.get(u).add(v);
        }


        void SCCutil(int u,int[] disc,int[] low,boolean[] memberStack,ArrayDeque<Integer>stack){
            disc[u]=low[u]=++time;
            stack.push(u);
            memberStack[u]=true;

            for(int v:adj.get(u)){
                if(disc[v]==-1){
                    SCCutil(v, disc, low, memberStack, stack);

                    low[u]=Math.min(low[u],low[v]);
                }
                else if(memberStack[v]==true){
                    low[u]=Math.min(low[u],disc[v]);
                }
            }

            int w=-1;
            if(low[u]==disc[u]){

                while(w!=u){
                    w=stack.pop();
                    System.out.print(w+" ");
                    memberStack[w]=false;
                }
                System.out.println(" ");
            }
        }

        void SCC(){
            boolean[] memberStack=new boolean[V];
            int[] disc=new int[V];
            int[] low=new int[V];

            Arrays.fill(disc, -1);
            Arrays.fill(low, -1);

            ArrayDeque<Integer>stack=new ArrayDeque<>();

            for(int i=0;i<V;i++){
                if(disc[i]==-1){
                    SCCutil(i,disc,low,memberStack,stack);
                }
            }
        }
    }

    public static void main(String[] args) {
        Graph g = new Graph(5); 

        g.addEdge(1, 0); 
        g.addEdge(0, 2); 
        g.addEdge(2, 1); 
        g.addEdge(0, 3); 
        g.addEdge(3, 4); 
        System.out.println("SSC in the graph "); 
        g.SCC(); 
    }
    
}
