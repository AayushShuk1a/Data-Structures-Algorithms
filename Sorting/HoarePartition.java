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

    public static void main(String[] args) {
        int arr[]={5,3,8,4,2,7,1,10};
        Partition(arr,0,arr.length-1);

        for(int i:arr)
        System.out.print(i+" ");
    }
}
