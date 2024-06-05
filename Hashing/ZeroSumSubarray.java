
import java.util.HashSet;

public class ZeroSumSubarray {

    static boolean calculate(int arr[]){
        HashSet<Integer>s=new HashSet<>();
        int prefixSum=0;

        for(int i:arr){
            prefixSum+=i;
            if(s.contains(prefixSum))
            return true;
           
            if(prefixSum==0)
            return true;

            s.add(prefixSum);
        }

        return false;
    }

    public static void main(String[] args) {
        int arr[] = new int[]{5, 3, 9, -4, -3, 7, -1};
        System.out.println(calculate(arr));
    }
    
}
