

public class MaxSumWindowK {

    static int windowCountSum(int arr[],int k){
        int sum=0;
        int res=Integer.MIN_VALUE;

        for(int i=0;i<k;i++){
            sum+=arr[i];
        }

        for(int i=k;i<arr.length;i++)
        {
            sum=(sum+arr[i])-arr[i-k];
            res=Math.max(sum,res);
        }


        return res;
    }

    public static void main(String[] args) {
        int arr[]={1, 4, 2, 10, 23, 3, 1, 0, 20};
        System.out.println(windowCountSum(arr,4));
    }
    
}
