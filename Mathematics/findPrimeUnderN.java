
import java.util.Arrays;

public class findPrimeUnderN {
    static void find(int n)
    {
        boolean isPrime[]=new boolean[n+1];
        Arrays.fill(isPrime,true);

        for(int i=2;i*i<=n;i++)
        {
            if(isPrime[i])
            {
                for(int j=2*i;j<=n;j+=i)
                {
                    isPrime[j]=false;
                }
            }
        }

        for(int i=2;i<=n;i++)
        {
            if(isPrime[i])
            {
                System.out.println(i+" ");
            }
        }
    }
    

    public static void main(String[] args) {
        find(50);
    }
}
