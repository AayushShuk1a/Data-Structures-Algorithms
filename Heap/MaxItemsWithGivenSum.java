
import java.util.PriorityQueue;

public class MaxItemsWithGivenSum {

    static int MaxItems(int arr[],int sum){
        int res=0;
        PriorityQueue<Integer>pq=new PriorityQueue<>();
        for(int i:arr)
        pq.add(i);

        while(!pq.isEmpty()){
            if(pq.peek()<=sum){
                sum-=pq.poll();
                res++;
            }else{
                break;
            }
        }
        
        return res; 
    }
    
    public static void main(String[] args) {
        int cost[]=new int[]{1,12,5,111,200};
        int sum=10;
        System.out.println(MaxItems(cost, sum));
    }
    
}
