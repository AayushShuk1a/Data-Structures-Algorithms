
import java.util.Iterator;
import java.util.PriorityQueue;

public class KLargestElement {

    static void LargeElements(int arr[],int k){
        PriorityQueue<Integer>pq=new PriorityQueue<>();
        for(int i=0;i<k;i++){
            pq.add(arr[i]);
        }

        for(int i=k;i<arr.length;i++){
            if(arr[i]>pq.peek()){
                pq.poll();
                pq.add(arr[i]);
            }
        }

        Iterator iterator=pq.iterator();
        while(iterator.hasNext()){
            System.out.print(iterator.next()+" ");
        }

    }

    public static void main(String[] args) {
        int arr[] = { 11, 3, 2, 1, 15, 5, 4, 45, 88, 96, 50, 45 };

        LargeElements(arr, 3);
    }
    
}
