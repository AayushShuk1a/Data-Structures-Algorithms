public class Knapsack01 {

    static int Maxknapsack(int val[],int Wt[],int W){
        int dp[][]=new int[Wt.length+1][W+1];

        for(int i=1;i<=Wt.length;i++){
            for(int j=1;j<=W;j++){
                if(Wt[i-1]>j){
                    dp[i][j]=dp[i-1][j];
                }else{
                    dp[i][j]=Math.max(val[i-1]+dp[i-1][j-Wt[i-1]],dp[i-1][j]);
                }
            }
        }

        return dp[Wt.length][W];

    }

    public static void main(String[] args) {
        int val[] = { 10, 40, 30, 50 }; 
        int wt[] = { 5, 4, 6, 3 }; 
        int W = 10;

        System.out.println(Maxknapsack(val, wt, W));
    }
    
}
