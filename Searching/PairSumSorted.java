public class PairSumSorted {

    static int[] getPair(int arr[],int n){

        int []ans=new int[2];

        int left=0,right=arr.length-1;

        while(left<right)
        {
            if(arr[left]+arr[right]==n)
            {
                ans[0]=arr[left];
                ans[1]=arr[right];
                break;
            }
            else if(arr[left]+arr[right]<n)
            {
                left++;
            }
            else
            {
                right--;
            }
        }

        return ans;
    }
    

    public static void main(String[] args) {
        int arr[]={1,2,3,4,11,11,22,23,44};
        int[] ansArr=getPair(arr, 3);
        System.out.println(ansArr[0]+" "+ansArr[1]);
    }
}
