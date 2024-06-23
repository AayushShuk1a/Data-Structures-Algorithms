public class MaxCutRope {

    static int MaxCut(int n,int a,int b,int c){
        int dp[]=new int[n+1];
        dp[0]=0;

        for(int i=1;i<=n;i++){
            dp[i]=-1;
            if(i-a>=0){
                dp[i]=Math.max(dp[i],dp[i-a]);
            }

            if(i-b>=0)
            dp[i]=Math.max(dp[i],dp[i-b]);

            if(i-c>=0){
                dp[i]=Math.max(dp[i],dp[i-c]);
            }

            if(dp[i]!=-1){
                dp[i]++;
            }   
        }

        return dp[n];
    }

    public static void main(String[] args) {
        int n=5;
        int a=2,b=3,c=5;
        System.out.println(MaxCut(n, a, b, c));
    }
    
}
