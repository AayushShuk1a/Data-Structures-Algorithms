public class Sort {

    static boolean sort(int arr[])
    {

        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i]>arr[i+1])
            {
                return false;
            }
        }


        return true;
    }

    public static void main(String[] args) {
        int arr[]={2,3,4,5,6,1};
        System.out.println(sort(arr));
    }
    
}
