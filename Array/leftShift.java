

public class leftShift {
    static void shiftByOne(int arr[])
    {
        int temp=arr[arr.length-1];
        
        for(int i=arr.length-1;i>=1;i--)
        {
            arr[i]=arr[i-1];
        }

        arr[0]=temp;
    }



    static void shiftByKplaces(int arr[],int k)
    {
        int n=arr.length-1;
        System.out.println(n-k);
        reverse(arr,0,n-k);
        reverse(arr,(n-k)+1,n);
        reverse(arr, 0, n);
    }




    static void reverse(int arr[], int low, int high)
    {
    	while(low < high)
    	{
    		int temp = arr[low];
    		arr[low] = arr[high];
    		arr[high] = temp;

    		low++;
    		high--;
    	}
    }


    public static void main(String[] args) {
        
        int arr[]={5,6,7,8,9};
        //shiftByOne(arr);

        shiftByKplaces(arr, 2);


        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }

    }
    
}
