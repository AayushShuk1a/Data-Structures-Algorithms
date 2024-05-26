public class LomutoPartition {

    static void swap(int arr[],int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;

    
    }

    static int partition(int arr[],int l,int h)
    {
        
       int pivot=arr[h];


        int i=l-1;
        for(int j=l;j<=h-1;j++)
        {
            if(arr[j]<pivot)
            {
                i++;
                swap(arr, i, j);
            }
        }


        swap(arr,i+1,h);
        return i+1;


    }

    static void qSort(int arr[],int l,int h)
    {
        if(l<h)
        {
            int p=partition(arr, l, h);
            qSort(arr, l, p-1);
            qSort(arr, p+1, h);
        }
    }

    public static void main(String[] args) {
        int arr[]={10,80,30,90,40,50,70,60,22};
        
        qSort(arr,  0, arr.length-1);

       for(int i=0;i<arr.length;i++)
       {
        System.out.print(arr[i]+" ");
       }
        
    }
    
}
