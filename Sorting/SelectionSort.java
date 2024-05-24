public class SelectionSort {

    static void Sort(int arr[]){
        int min=0;
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=i+1;j<arr.length-1;j++)
            {
                if(arr[j]<arr[min])
                {
                    min=j;
                }
            }

            int temp=arr[min];
            arr[min]=arr[i];
            arr[i]=temp;
        }


    }

    public static void main(String[] args) {
        int arr[] = { 64, 34, 25, 12, 22, 11, 90 };
        Sort(arr);

        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    
}
