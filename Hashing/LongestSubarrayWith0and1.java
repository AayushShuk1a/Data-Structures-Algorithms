
import java.util.HashMap;

public class LongestSubarrayWith0and1 {

    static int calculate(int arr[]){
        HashMap<Integer,Integer>hmpp=new HashMap<>();
        int prefixSum=0,maxLen=0;


        for(int i=0;i<arr.length;i++){
            if(arr[i]==0)
            arr[i]=-1;
        }

        for(int i=0;i<arr.length;i++){
           prefixSum+=arr[i];
           if(prefixSum==0)
           maxLen=i+1;

           if(!hmpp.containsKey(prefixSum))
           hmpp.put(prefixSum, i);

           if(hmpp.containsKey(prefixSum)){
            if(maxLen<(i-hmpp.get(prefixSum))){
                maxLen=i-hmpp.get(prefixSum);
            }
           }

        }

        return maxLen;
    }

    public static void main(String[] args) {
        int arr[] = new int[]{1, 0, 1, 1, 1, 1, 1, 0, 1};
        System.out.println(calculate(arr));
    }
    
}
