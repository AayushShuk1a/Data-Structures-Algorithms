public class countDigit {

    static int []table=new int[256]; 
    static void initialize()
    {
        table[0]=0;

        for(int i=1;i<256;i++)
        {
            table[i]=table[(i&(i-1))]+1;    
        }

    }


    public static int count(int n)
    {
        int count=table[n&0xff]+table[(n>>8)&0xff]+table[(n>>16)&0xff]+table[n>>24];
        return count;
    }

    public static void main(String[] args) {
        initialize();
        
        System.out.println(count(7));
    }
}
