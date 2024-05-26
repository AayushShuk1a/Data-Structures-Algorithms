public class HoarePartition {

    static int Partition(int arr[],int l,int h)
    {
        int i=l-1;
        int j=h+1;

        int pivot=arr[l];

        while (true) { 

            do { 
                i++;
            } while (arr[i]<pivot);
            

            do {
                j--;
            } while (arr[j]>pivot);

            if(i>=j)return j;

            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;

        }
    }

    static void qSort(int arr[],int l,int h){
        if(l<h)
        {
            int p=Partition(arr, l, h);
            qSort(arr, l, p);
            qSort(arr,p+1, h);
        }
    }

    public static void main(String[] args) {
        int arr[]={8,4,7,9,3,10,5};
        qSort(arr,0,arr.length-1);

        for(int i:arr)
        System.out.print(i+" ");
    }
}
