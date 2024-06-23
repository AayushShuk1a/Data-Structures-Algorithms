public class MinimumCoinChange {

    static int MinimumCoins(int arr[],int val){
        int[] dp=new int[val+1];
        dp[0]=0;

        for(int i=1;i<=val;i++){
            dp[i]=Integer.MAX_VALUE;
        }

        for(int i=1;i<=val;i++){
            for(int j=0;j<arr.length;j++){
                if(arr[j]<=i&&dp[i-arr[j]]!=Integer.MAX_VALUE){
                    dp[i]=Math.min(dp[i], 1+dp[i-arr[j]]);
                }
            }
        }

        return dp[val];
    }

    public static void main(String[] args) {
        int arr[] = {3, 4, 1}, val =5;

        System.out.println(MinimumCoins(arr, val));
    }
    
}
