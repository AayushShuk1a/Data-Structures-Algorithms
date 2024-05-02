public class powerSet {

    static void print(String str)
    {
        int n=str.length();
        int powerSize=(int) Math.pow(2,n);

        for(int i=0;i<powerSize;i++)
        {
            for(int j=0;j<n;j++)
            {
                if((i&(1<<j))!=0)
                {
                    System.out.print(str.charAt(j));
                }
            }

            System.out.println();
        }
    }


    public static void main(String[] args) {
        print("abc");
    }
    
}
