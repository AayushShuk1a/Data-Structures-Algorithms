public class twoOddOccuring {

    static int find(int A[],int n){

        int temp=0;
        for(int i=0;i<n;i++){
            temp^=A[i];
        
        }

        int pos=0;
        int tempXOR=temp;
        while((tempXOR&1)==0)
        {
            pos++;
            tempXOR=tempXOR>>1;
            
        }

        int setA=0;
        int setB=0;
        int mask=1<<pos;

        for(int i=0;i<n;i++)
        {
            if((A[i]&mask)==0)
            {
                setA^=A[i];
            }
            else
            {
                setB^=A[i];
            }
        }


        System.out.println(setA+" "+setB);

        

        return -1;
    }

    public static void main(String[] args) {
        int a[]=new int[]{2,3,4,2,4,3,5,8};
        int n=a.length;
        find(a, n);
    }
    
}
