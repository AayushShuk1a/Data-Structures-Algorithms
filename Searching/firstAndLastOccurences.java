public class firstAndLastOccurences {

    static int firstOccurence(int arr[],int x)
    {
        int low=0,high=arr.length-1;
        int mid;

        while(low<high)
        {
            mid=(low+high)/2;
            if(arr[mid]<x)
            {
                low=mid+1;
            }
            else if(arr[mid]>x)
            {
                high=mid-1;
            }
            else
            {
                if(mid==0||arr[mid-1]!=arr[mid])
                return mid;
                else
                high=mid-1;
            }
        }

        return -1;
    }


    static int lastOccurence(int arr[],int x)
    {

        int low=0,high=arr.length-1,mid;

        while(low<high)
        {
            mid=(low+high)/2;
            if(arr[mid]<x)
            {
                low=mid+1;
            }
            else if(arr[mid]>x)
            {
                high=mid-1;
            }
            else
            {
                if(mid==arr.length-1||arr[mid+1]!=arr[mid])
                {
                    return mid;
                }
                else
                {
                    low=mid+1;
                }
            }


        }

        return -1;
    }

    static void getOcurrence(int arr[],int x)
    {
        System.out.println("First Occurence : "+firstOccurence(arr, x));
        System.out.println("Last Occurence : "+lastOccurence(arr, x));
    }


    public static void main(String[] args) {
        int arr[] = { 1, 2, 2, 2, 2, 3, 4, 7, 8, 8 };
        getOcurrence(arr, 2);
    }
    
}
