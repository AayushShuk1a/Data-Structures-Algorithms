public class EditDistance {

    static int TotalDistance(String s1,String s2){
        int m=s1.length();
        int n=s2.length();
        int dp[][]=new int[m+1][n+1];

        for(int i=0;i<=m;i++){
            dp[i][0]=i;
        }

        for(int i=0;i<=n;i++){
            dp[0][i]=i;
        }

        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                if(s1.charAt(i-1)==s2.charAt(j-1)){
                    dp[i][j]=dp[i-1][j-1];
                }
                else{
                    dp[i][j]=1+Math.min(dp[i-1][j-1], Math.min(dp[i][j-1], dp[i-1][j]));
                }
            }
        }

        return dp[m][n];
    }

    public static void main(String[] args) {
        String s1="CAAT",s2="CUT";
        System.out.println(TotalDistance(s1, s2));
    }
    
}
