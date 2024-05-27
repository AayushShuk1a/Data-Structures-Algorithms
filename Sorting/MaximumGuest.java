
import java.util.Arrays;

public class MaximumGuest {

    static int MaxGuest(int arr[],int dep[]){

        Arrays.sort(arr);
        Arrays.sort(dep);
        int res=1;
        int i=1,j=0,curr=1;

        

        while(i<arr.length&&j<dep.length){
            if(arr[i]<dep[j]){
                i++;
                curr++;
            }else
            {
                j++;
                curr--;
            }

            res=Math.max(res,curr);
        }

        return res;
    }

    public static void main(String[] args) {
        int arr[] = { 900, 600, 700};
        int dep[] = { 1000, 800, 730};

        System.out.println(MaxGuest(arr, dep));
    }
    
}
