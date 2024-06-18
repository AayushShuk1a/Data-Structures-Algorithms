
import java.util.Comparator;
import java.util.PriorityQueue;

public class KCLosestElement {

    static class pair{
        int diff;
        int index;
        pair(int diff,int index){
            this.diff=diff;
            this.index=index;
        }
    }

    static void printKclosest(int arr[],int k,int x){
        PriorityQueue<pair>pq=new PriorityQueue<>(
            new Comparator<pair>() {
                public int compare(pair p1,pair p2){
                    return Integer.compare(p2.diff, p1.diff);
                } 
            }
        );


        for(int i=0;i<k;i++){
            pq.add(new pair(Math.abs(arr[i]-x), arr[i]));
        }

        for(int i=k;i<arr.length;i++){
            int diff=Math.abs(x-arr[i]);
            if(pq.peek().diff>diff){
                pq.poll();
                pq.add(new pair(diff, arr[i]));
            }
        }

        while(!pq.isEmpty()){
            System.out.print(pq.poll().index+" ");
        }

    }

    public static void main(String[] args) {
        int arr[] = { 10,30,5,40,38,80,70 };
        printKclosest(arr, 3, 35);
    }
    
}
