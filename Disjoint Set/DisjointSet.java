public class DisjointSet {

    int [] parent;
    int [] rank;

    DisjointSet(int n){
        parent=new int[n];
        rank=new int[n];
        for(int i=0;i<n;i++){
            parent[i]=i;
            rank[i]=0;
        }
    }

    int find(int x){
        if(x==parent[x]){
            return x;
        }

        parent[x]=find(parent[x]);
        return parent[x];
    }

    void union(int x,int y){
        int x_rep=find(x);
        int y_rep=find(y);

        if(rank[x_rep]>rank[y_rep]){
            parent[y_rep]=x_rep;
        }
        else if(rank[y_rep]>rank[x_rep]){
            parent[x_rep]=y_rep;
        }
        else if(rank[y_rep]==rank[x_rep]){
            parent[y_rep]=x_rep;
            rank[x_rep]++; 
        }
    }

    public static void main(String[] args) {
        int n=5;
        DisjointSet djs=new DisjointSet(n);
        djs.union(3, 4);
        djs.union(1, 3);
        djs.union(2,0);

        System.out.println(djs.find(4));
    }


    
}
