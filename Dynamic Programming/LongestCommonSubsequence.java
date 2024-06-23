import java.util.Arrays;

public class LongestCommonSubsequence {

    static int memo[][];
    static int LCS(String s1,String s2,int m,int n){
        
        if(memo[m][n]!=-1){
            return memo[m][n];
        }

        if(m==0||n==0){
            return 0;
        }
        else{
            if(s1.charAt(m-1)==s2.charAt(n-1)){
                memo[m][n]=1+LCS(s1, s2, m-1, n-1);
            }
            else{
                memo[m][n]=Math.max(LCS(s1, s2, m-1, n), LCS(s1, s2, m, n-1));
            }
        }

        return memo[m][n];
    }

    static int LCStabulation(String s1,String s2){
        int m=s1.length();
        int n=s2.length();
        int dp[][]=new int[m+1][n+1];

        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                if(s1.charAt(i-1)==s2.charAt(j-1)){
                    dp[i][j]=1+dp[i-1][j-1];
                }
                else{
                    dp[i][j]=Math.max(dp[i-1][j], dp[i][j-1]);
                }
            }
        }

        return dp[m][n];
    }

    public static void main(String[] args) {
        String s1="AXYZ",s2="BAZ";
        int m=s1.length();
        int n=s2.length();
        memo=new int[m+1][n+1];
        for(int[]i:memo){
            Arrays.fill(i, -1);
        }

        System.out.println(LCStabulation(s1, s2));
    }
    
}
