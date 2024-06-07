
import java.util.HashMap;

public class CountDIstinctWindow {

    static void Count(int arr[],int k){
        HashMap<Integer,Integer>hmpp=new HashMap<>();
        for(int i=0;i<k;i++){
            hmpp.put(arr[i],hmpp.getOrDefault(arr[i],0)+1);
        }

        System.out.print(hmpp.size()+" ");

        for(int i=k;i<arr.length;i++){
            hmpp.put(arr[i-k], hmpp.get(arr[i-k])-1);

            if(hmpp.get(arr[i-k])==0)
            hmpp.remove(arr[i-k]);

            hmpp.put(arr[i], hmpp.getOrDefault(arr[i], 0)+1);
            System.out.print(hmpp.size()+" ");
        }

    }

    public static void main(String[] args) {
        int arr[] = new int[]{10, 10, 5, 3, 20, 5};
        Count(arr, 4);
    }
}
