//Count the number of trail zero in factorial
//Refer leetcode 172


public class trailZeroFactorial {

    static int Count(int n)
    {
        int res=0;

        for(int i=5;i<=n;i*=5)
        {
            res+=(n/i);
        }


        return res;
    }

    public static void main(String[] args) {
        System.out.println(Count(350));
    }
    
}

