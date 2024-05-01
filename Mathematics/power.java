public class power {
    static int calculate(int x,int n){
        int res=1;

        while(n>0)
        {
            if((n&1)==1)
            {
                res=res*x;
            }
            n=n>>1;
            x*=x;

        }

        return res;
    }

    public static void main(String[] args) {
        System.out.println(calculate(3, 3));
    }
    
}
