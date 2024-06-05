
import java.util.HashSet;

public class UnionUnsorted {

    static int CountUnion(int arr[],int arr2[]){
        HashSet<Integer>s=new HashSet<>();

        for(int i:arr){
            s.add(i);
        }

        for(int i:arr2){
            s.add(i);
        }

        return s.size();
    }

    public static void main(String[] args) {
        int arr[]={10,20,30,40};
        int arr2[]={20,30,40,50,60};
        System.out.print(CountUnion(arr,arr2));
    }
    
}
