
import java.util.Arrays;

public class DijkstraAlgo {

    static int V=4;
    static int[] dijkstra(int graph[][],int src){
        int[]dist=new int[V];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[src]=0;
        boolean[] fin=new boolean[V];

        for(int count=0;count<V;count++){
            int u=-1;
            for(int i=0;i<V;i++){
                if(!fin[i]&&(u==-1||dist[i]<dist[u])){
                    u=i;
                }
            }

            fin[u]=true;

            for(int i=0;i<V;i++){
                if(!fin[i]&&graph[u][i]!=0){
                    dist[i]=Math.min(dist[i],dist[u]+graph[u][i]);
                }
            }
        }

        return dist;
    }

    public static void main(String[] args) {
        int graph[][] = new int[][] { { 0, 50, 100, 0}, 
            						{ 50, 0, 30, 200 }, 
            						{ 100, 30, 0, 20 }, 
            						{ 0, 200, 20, 0 },};  

        for(int x: dijkstra(graph,0)){
    	    System.out.print(x+" ");
    	}     
    }
    
}
