
import java.util.Arrays;

public class MinJumpToReachEnd {

    static int MinJump(int arr[]){
        int[] dp=new int[arr.length];
        Arrays.fill(dp,Integer.MAX_VALUE);
        dp[0]=0;

        for(int i=1;i<arr.length;i++){
            for(int j=0;j<i;j++){
                if(i<=j+arr[j]&&dp[j]!=Integer.MAX_VALUE){
                    dp[i]=Math.min(dp[i],dp[j]+1);
                    break;
                }
            }
        }

        return dp[arr.length-1];
        
    }


    public static void main(String[] args) {
        int arr[] = {3, 4, 2, 1, 2, 1};
	    
        
        System.out.println(MinJump(arr));
    }
    
}
