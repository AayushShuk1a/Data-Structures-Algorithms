
import java.util.HashMap;
import java.util.Map;

public class MoreThanNbyK {

    static void Calculate(int arr[],int k){
        int n=arr.length;
        HashMap<Integer,Integer>hmpp=new HashMap<>();
        for(int i:arr){
            hmpp.put(i, hmpp.getOrDefault(i, 0)+1);
        }

        for(Map.Entry<Integer,Integer>en:hmpp.entrySet()){
            
            if(en.getValue()>n/k){
                System.out.print(en.getKey()+" ");
            }
            
        }
    }

    public static void main(String[] args) {
        int arr[]={10,20,10,10,20,20,20,20,30,40,50,60,20,20,20,20};
        Calculate(arr, 2);
    }
    
}
