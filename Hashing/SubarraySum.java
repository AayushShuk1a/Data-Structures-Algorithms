
import java.util.HashSet;

public class SubarraySum {

    static boolean calculate(int arr[],int sum){

        HashSet<Integer>s=new HashSet<>();
        int prefixSum=0;

        for(int i:arr){
            prefixSum+=i;
            if(prefixSum==sum)
            return true;

            if(s.contains(prefixSum-sum))
            return true;

            s.add(prefixSum);
        }

        return false;

    }

    public static void main(String[] args) {
        int arr[] = new int[]{5, 8, 6, 13, 3, -1};
        int sum=22;
        System.out.print(calculate(arr,sum));
    }
    
}
