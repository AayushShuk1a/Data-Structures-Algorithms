public class OneOddOccuring {

    static int find(int arr[],int n){

        int res=arr[0];
        for(int i=1;i<n;i++)
        {
            res^=arr[i];
        }
        return res;
    }

    public static void main(String[] args) {
        int a[]=new int[]{2,3,4,2,4,3,5};
        int n=a.length;
        System.out.println(find(a, n));
    }
    
}
