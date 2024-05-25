public class IntersectionArrays {

    static void Intersect(int arr[],int arr2[])
    {
        int i=0,j=0;

        while(i<arr.length&&j<arr2.length){
            if(i>0&&arr[i]==arr[i-1])
            {
                i++;
                continue;
            }
            
            if(arr[i]>arr2[j])
            j++;
            else if(arr[i]<arr2[j])
            i++;
            else{
                System.out.print(arr[i]+" ");
                i++;
                j++;
            }
        }
    }

    public static void main(String[] args) {
        int arr[]={1,1,2,4,5,5,6,7};
        int arr2[]={1,3,4,5,5,6,6,7,8,9};
        Intersect(arr, arr2);
    }
    
}
