public class PrefixSum {

    static int[] sum(int arr[]){
        int []ans=new int[arr.length];

        ans[0]=arr[0];

        for(int i=1;i<arr.length;i++)
        {
            ans[i]=ans[i-1]+arr[i];
        }

        return ans;
    }

    public static void main(String[] args) {
        int arr[] = {10, 20, 10, 5, 15};

        int []sumPrefix=sum(arr);

        for(int i=0;i<sumPrefix.length;i++)
        {
            System.out.print(sumPrefix[i]+" ");
        }
    }
    
}
