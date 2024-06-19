
import java.util.Arrays;

public class PrimsAlgo {

    static int V=5;
    static int PrimsMst(int graph[][]){
        int[] key=new int[V];
        boolean[] MST=new boolean[V];
        int res=0;
        Arrays.fill(key, Integer.MAX_VALUE);
        key[0]=0;
        for(int count=0;count<V;count++){
            int u=-1;
            for(int i=0;i<V;i++){
                if(!MST[i]&&(u==-1||key[i]<key[u])){
                    u=i;
                }
            }

            MST[u]=true;
            res+=key[u];

            for(int i=0;i<V;i++){
                if(!MST[i]&&graph[u][i]!=0){
                    key[i]=Math.min(key[i],graph[u][i]);
                }
            }
        }

        return res;
    }

    public static void main(String[] args) {
        int graph[][]=new int[][]{{0,2,1,0,0},
                                  {2,0,1,0,0},
                                  {1,1,0,2,2},
                                  {0,0,2,0,1},
                                  {0,0,2,1,0}};

        System.out.println(PrimsMst(graph));
    }
    
}
