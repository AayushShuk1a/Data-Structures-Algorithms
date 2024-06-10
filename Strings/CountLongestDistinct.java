
import java.util.Arrays;

public class CountLongestDistinct {

    static int CountLongest(String str){
        int[] prev=new int[256];
        int res=0;
        Arrays.fill(prev, -1);

        int i=0,j=0;
        while(j<str.length()){
            if(prev[str.charAt(j)]>=i){
                i=prev[str.charAt(j)]+1;
            }

            res=Math.max(res,j-i+1);
            prev[str.charAt(j)]=j;
            j++;
        }

        return res;
    }

    public static void main(String[] args) {
        String str = "geeksforgeeks"; 
        System.out.println(CountLongest(str));
    }
    
}
