public class LomutoPartition {

    static void swap(int arr[],int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;

    
    }

    static void partition(int arr[],int pivot,int l,int h)
    {
        
        swap(arr, h, pivot);
        pivot=h;


        int i=l-1;
        for(int j=l;j<=h-1;j++)
        {
            if(arr[j]<arr[pivot])
            {
                i++;
                swap(arr, i, j);
            }
        }


        swap(arr,i+1,pivot);


    }

    public static void main(String[] args) {
        int arr[]={10,80,30,90,40,50,70,60};
        int pivot=3;
        partition(arr, pivot, 0, arr.length-1);

       for(int i=0;i<arr.length;i++)
       {
        System.out.print(arr[i]+" ");
       }
        
    }
    
}
