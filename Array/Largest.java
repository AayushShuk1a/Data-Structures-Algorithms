public class Largest {

    static int getLargest(int arr[]){

        int res=-1;

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>res)
            {
                res=arr[i];
            }
        }
        return res;
    }

    static int getSecondLargest(int arr[])
    {
        int res=-1;
        int largest=-1;

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>largest)
            {
                res=largest;
                largest=arr[i];
            }
        }

        return res;
    }



    public static void main(String[] args) {

        int arr[]={12,12,12,12};

        System.out.println(getSecondLargest(arr));
    }
    
}
