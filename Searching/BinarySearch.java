public class BinarySearch {

    static int iterativeBinarySearch(int arr[],int x)
    {
        int low=0,high=arr.length-1;
        int mid;

        while(low<high)
        {
            mid=(low+high)/2;
            if(arr[mid]==x)
            {
                return mid;
            }
            else if(arr[mid]<x)
            {
                low=mid+1;
            }
            else
            {
                high=mid-1;
            }
            
        }

        return -1;
    }

    static int recursiveBinarySearch(int arr[],int low,int high,int x){
        if(low>high)
        return -1;

        int mid=(low+high)/2;
        if(arr[mid]==x)
        return mid;
        else if(arr[mid]<x)
        return recursiveBinarySearch(arr, mid+1, high, x);
        else
        return recursiveBinarySearch(arr, low, mid-1, x);

    }

    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 50, 60, 70};

		int x = 20;

        System.out.println(recursiveBinarySearch(arr, 0, arr.length-1, x));
        System.out.println(iterativeBinarySearch(arr, x));
    }
    
}
