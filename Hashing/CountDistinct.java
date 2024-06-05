
import java.util.HashSet;

public class CountDistinct {

    static int Count(int arr[]){
    HashSet<Integer>s=new HashSet<>();
    for(int i:arr){
        s.add(i);
    }

    return s.size();
    }

    public static void main(String[] args) {
        int arr[]={12,13,14,12,13,14};
        System.out.println(Count(arr));
    }
    
}
