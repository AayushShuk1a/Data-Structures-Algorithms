
import java.util.Arrays;

public class MinDiff {

    static int Calculate(int arr[]){
        Arrays.sort(arr);

        int res=Integer.MAX_VALUE;
        for(int i=0;i<arr.length-1;i++)
        {
            res=Math.min(res,arr[i+1]-arr[i]);
        }

        return res;
    }

    public static void main(String[] args) {
        int arr[]={8,45,16,222,28};
        System.out.println(Calculate(arr));
    }
    
}
