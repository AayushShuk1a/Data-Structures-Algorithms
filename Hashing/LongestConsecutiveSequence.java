
import java.util.HashSet;

public class LongestConsecutiveSequence {

    static int LongestSequence(int arr[]){
        HashSet<Integer>s=new HashSet<>();
        for(int i:arr){
            s.add(i);
        }
        int res=0;

        for(int i:s){
            if(!s.contains(i-1)){
                int curr=1;
                while(s.contains(i+1)){
                    curr++;
                    i++;
                }
                res=Math.max(res,curr);
            }
        }
        return res;
    }


    public static void main(String[] args) {
        int arr[]={1, 9, 3, 4, 2, 10, 13};

        System.out.println(LongestSequence(arr));
    }
    
}
