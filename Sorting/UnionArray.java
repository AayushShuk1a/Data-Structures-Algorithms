public class UnionArray {

    static void Union(int arr[],int arr2[]){
        int i=0,j=0;

        while (i<arr.length&&j<arr2.length) {

            if(i>0&&arr[i]==arr[i-1]){
                i++;
                continue;
            }

            if(j>0&&arr[j]==arr[j-1]){
                j++;
                continue;
            }

            if(arr[i]<arr2[j]){
                System.out.print(arr[i]+" ");
                i++;
            }
            else if(arr[i]>arr2[j]){
                System.out.print(arr2[j]+" ");
                j++;
            }
            else
            {
                System.out.print(arr[i]+" ");
                i++;
                j++;
            }
            
        }


        while(i<arr.length)
        {
            if(i>0&&arr[i]==arr[i-1])
            {
                i++;
                continue;
            }

            System.out.print(arr[i]+" ");
            i++;
        }


        while(j<arr2.length)
        {
            if(j>0&&arr2[j]==arr2[j-1])
            {
                j++;
                continue;
            }

            System.out.print(arr[j]+" ");
            j++;
        }
    }


    public static void main(String[] args) {
        int arr[]={1,4,6,7,8,8,8,9};
        int arr2[]={2,3,4,5,6,7,8};
        Union(arr, arr2);
    }
    
}
