
import java.util.HashMap;

public class LargeSubarrayWithGivenSum {

    static int Calculate(int arr[],int k){
        HashMap<Integer,Integer>hmpp=new HashMap<>();

        int prefixSum=0;
        int maxLen=0;

        for(int i=0;i<arr.length;i++){
            prefixSum+=arr[i];

            if(prefixSum==k){
                maxLen=i+1;
            }

            if(!hmpp.containsKey(prefixSum)){
                hmpp.put(prefixSum, i);
            }

            if(hmpp.containsKey(prefixSum-k)){
                if(maxLen<(i-hmpp.get(prefixSum-k))){
                    maxLen=i-(hmpp.get(prefixSum-k));
                }
            }
            
        }

        return maxLen;
    }

    public static void main(String[] args) {
        int arr[]={3,1,0,1,8,2,3,6};
        System.out.println(Calculate(arr, 5));
    }
    
}
