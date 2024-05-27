public class SortTwoTypes {

    static void sort(int arr[],int l,int h){
        int i=l-1;
        int j=h+1;
        
        while (true) { 
            do { 
                i++;
            } while (arr[i]<0);

            do { 
                j--;
            } while (arr[j]>0);

            if(i>=j)
            return;

            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
    }

    public static void main(String[] args) {
        int arr[]={-20,-18,23,22,-12,-11,25,-10};
        sort(arr,0,arr.length-1);

        for(int i:arr)
        {
            System.out.print(i+" ");
        }
    }
    
}
