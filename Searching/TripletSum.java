public class TripletSum {

    static boolean isPair(int arr[],int n,int si){

        int left=si,right=arr.length-1;

        while(left<right)
        {
            if(arr[left]+arr[right]==n){
            System.out.print(arr[left]+" "+arr[right]);
            return true;}
            else if(arr[left]+arr[right]>0)
            left++;
            else
            right--;
        }



        return false;
    }

    static void getTriplet(int arr[],int x){

        for(int i=0;i<arr.length-1;i++)
        {
            if(isPair(arr, x-arr[i], i+1))
            {
                System.out.println(" "+arr[i]);
                return;
            }
        }

        System.out.println("Not Found");

    }

    public static void main(String[] args) {
        int A[] = { 1, 4, 45, 6, 10, 8 };
        getTriplet(A, 24);
    }
    
}
