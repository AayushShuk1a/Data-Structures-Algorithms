public class EquilibriumPoint {

    static int checkEquilibrium(int arr[]){

        int rightSum=0;
        for(int i=0;i<arr.length;i++){
            rightSum+=arr[i];
        }

        int leftSum=0;

        for(int i=0;i<arr.length;i++)
        {
            rightSum-=arr[i];
            if(leftSum==rightSum)
            return i;

            leftSum+=arr[i];
        }

        return -1;
    }

    public static void main(String[] args) {
        
        int arr[] = { -7, 1, 5, 2, -4, 3, 0 };
        System.out.println(checkEquilibrium(arr));
    }
    
}
