
import java.util.HashMap;

public class LongestSubarraysWithSameSum {

    static int Calculate(int arr[],int arr2[]){

        int[] temp=new int[arr.length];
        int prefixSum=0;
        int maxLen=0;

        HashMap<Integer,Integer>hmpp=new HashMap<>();
        
        for(int i=0;i<arr.length;i++){

            temp[i]=arr[i]-arr2[i];
        }

        for(int i=0;i<temp.length;i++){
            prefixSum+=temp[i];
            if(prefixSum==0){
                maxLen=i+1;
            }

            if(hmpp.containsKey(prefixSum)){
                maxLen=Math.max(maxLen,i-hmpp.get(prefixSum));
            }
            else
            {
                hmpp.put(prefixSum, i);
            }
        }

        return maxLen;
    }

    public static void main(String[] args) {
        int[] arr1 = {0, 1, 0, 1, 1, 1, 1}; 
        int[] arr2 = {1, 1, 1, 1, 1, 0, 1};

        System.out.println(Calculate(arr1, arr2));
    }
    
}
