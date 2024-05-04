public class Revese {

    static void reverse(int arr[]){

        int low=0;
        int high=arr.length-1;
        int temp;

        while(low<high)
        {
            temp=arr[low];
            arr[low]=arr[high];
            arr[high]=temp;
            low++;
            high--;
        }
    }


    public static void main(String[] args) {
        int arr[]={22,34,53,21};

        reverse(arr);

        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    
}
