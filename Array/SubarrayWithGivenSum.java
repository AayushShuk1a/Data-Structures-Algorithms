public class SubarrayWithGivenSum {

    static boolean check(int arr[],int sum){

        int left=0;
        int tempSum=0;

        for(int right=0;right<arr.length;right++)
        {
            tempSum+=arr[right];
           

            while(tempSum>sum)
            {
                tempSum-=arr[left];
                left++;
            }

            if(tempSum==sum)
            {
                return true;
            }

        }


        return false;
    }

    public static void main(String[] args) {
        int arr[] = {1, 4, 20, 3, 10, 5};
        System.out.println(check(arr, 39));
    }
    
}
