

import java.util.HashMap;
import java.util.Map;

public class CountFrequency {

    static void Count(int arr[]){
        Map<Integer,Integer>hmpp=new HashMap<Integer,Integer>();

        for(int i:arr){
            hmpp.put(i, hmpp.getOrDefault(i, 0)+1);
        }

        for(Map.Entry<Integer,Integer>e:hmpp.entrySet()){
            System.out.println(e.getKey()+" " +e.getValue());
        }
    }

    public static void main(String[] args) {
        int arr[]={10,10,10,12,12,12,13,13,14,15};
        Count(arr);
    }
    
}
