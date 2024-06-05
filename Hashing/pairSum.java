
import java.util.HashSet;

public class pairSum {

    static boolean findPair(int arr[],int sum){
        HashSet<Integer>s=new HashSet<>();

        for(int i:arr){
            if(s.contains(sum-i)){
                return true;
            }
            else{
                s.add(i);
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9};
        System.out.println(findPair(arr, 25));
    }
    
}
