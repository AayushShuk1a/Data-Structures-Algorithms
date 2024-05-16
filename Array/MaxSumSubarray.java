public class MaxSumSubarray {

    static int Sum(int arr[]){

        int res=arr[0];
        int maxSum=arr[0];

        for(int i=1;i<arr.length;i++){
            maxSum=Math.max(maxSum+arr[i], arr[i]);
            res=Math.max(res,maxSum);
        }


        return res;
    }


    public static void main(String[] args) {
        int arr[]={2,3,-8,7,-1,2,3};
        System.out.println(Sum(arr));
    }
    
}
