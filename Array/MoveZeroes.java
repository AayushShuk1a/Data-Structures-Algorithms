public class MoveZeroes {

    static void Move(int arr[])
    {

        int pos=0;
        int temp;


        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=0)
            {
                temp=arr[i];
                arr[i]=arr[pos];
                arr[pos]=temp;
                pos++;
            }
        }
    }

    public static void main(String[] args) {
        int arr[]={2,0,0,3,4,5,0,6};
        Move(arr);

        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]);
        }
    }


    
    
}
