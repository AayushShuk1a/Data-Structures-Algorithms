
import java.util.PriorityQueue;

public class SortKsortedArray {

    static void sorting(int arr[],int k){
        PriorityQueue<Integer>pq=new PriorityQueue<>();
        for(int i=0;i<k+1;i++){
            pq.add(arr[i]);
        }

        int index=0;
        for(int i=k+1;i<arr.length;i++){
            arr[index++]=pq.poll();
            pq.add(arr[i]);
        }

        while(!pq.isEmpty())
        {
            arr[index++]=pq.poll();
        }
    }

    public static void main(String[] args) {
        int k = 3; 
        int arr[] = { 2, 6, 3, 12, 56, 8 }; 
        sorting(arr, k);

        for(int i:arr){
            System.out.print(i+" ");
        }
    }
    
}
