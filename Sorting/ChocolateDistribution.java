
import java.util.Arrays;

public class ChocolateDistribution {

    static int findMin(int arr[],int m){

        if(arr.length<m)
        return -1;

        Arrays.sort(arr);
        int res=arr[m-1]-arr[0];

        for(int i=0;(i+m-1)<arr.length;i++)
        {
            res=Math.min(res,arr[i+m-1]-arr[i]);
        }

        return res;
    }


    public static void main(String[] args) {
        int arr[]={8,4,7,9,3,10,5};
        System.out.println(findMin(arr, 3));
    }
    
}
