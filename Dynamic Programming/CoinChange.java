public class CoinChange {

    static int CountTotal(int []coins,int n,int amn){
        int dp[][]=new int[n+1][amn+1];

        for(int i=0;i<=n;i++){
            dp[i][0]=1;
        }

        for(int i=1;i<=n;i++){
            for(int j=1;j<=amn;j++){
                dp[i][j]=dp[i-1][j];
                if(coins[i-1]<=j){
                    dp[i][j]+=dp[i][j-coins[i-1]];
                }
            }
        }

        return dp[n][amn];
    }

    public static void main(String[] args) {
        int []coins={1,2,3};
        int n=coins.length;
        int amount=4;
        System.out.println(CountTotal(coins,n,amount));
    }
    
}
