public class MaxCircularSubarraySum {

    static int maxSubarraySum(int arr[]){
        int res=arr[0];
        int maxEnding=arr[0];


        for(int i=1;i<arr.length;i++){
            maxEnding=Math.max(maxEnding+arr[i],arr[i]);
            res=Math.max(res,maxEnding);
        }
        return res;
    }

    static int CircularSubarraySum(int arr[]){
        int maxNormal=maxSubarraySum(arr);

        if(maxNormal<0)
        return maxNormal;

        int arrSum=0;

        for(int i=0;i<arr.length;i++){
            arrSum+=arr[i];
            arr[i]=-arr[i];
        }

        int maxCircular=arrSum+maxSubarraySum(arr);

        return Math.max(maxCircular,maxNormal);        
    }


    public static void main(String[] args) {
        
        int arr[] = {8, -4, 3, -5, 4};

       System.out.println(CircularSubarraySum(arr));
    }
    
}
