
import java.util.ArrayDeque;

public class MaximumElementInSubarrayK {

    static void MaximumElements(int arr[],int k){
      ArrayDeque<Integer>dq=new ArrayDeque<>();
      for(int i=0;i<k;i++){
        while(!dq.isEmpty()&&arr[i]>=arr[dq.peekLast()]){
            dq.pollLast();
        }
        dq.offerLast(i);
      }

      for(int i=k;i<arr.length;i++){
        System.out.print(arr[dq.peekFirst()]+" ");

        while(!dq.isEmpty()&&dq.peek()<=i-k)
        dq.pollFirst();


        while(!dq.isEmpty()&&arr[i]>=arr[dq.peekLast()]){
            dq.pollLast();
        }

        dq.offerLast(i);
      }

      System.out.print(arr[dq.peekFirst()]+" ");

    }

    public static void main(String[] args) {

        int[] arr={40,20,30,40,60,20,30,20};
        MaximumElements(arr, 3);
        
    }
    
}
