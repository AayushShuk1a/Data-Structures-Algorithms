public class duplicatesSorted {

    static int removeDuplicates(int arr[]){

        int res=0;

        for(int i=1;i<arr.length;i++)
        {
            if(arr[res]!=arr[i])
            {
                res++;
                
                arr[res]=arr[i];
            }
           
        }
        return res;
    }

    public static void main(String[] args) {
        int arr[]={1,2,2,3,3,4,4,4,4};
        int res=removeDuplicates(arr);

        for (int i = 0; i <= res; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    
}
