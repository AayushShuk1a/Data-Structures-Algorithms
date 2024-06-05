
import java.util.HashSet;

public class IntersectionUnsorted {

    static void findIntersection(int arr1[],int arr2[]){
        HashSet<Integer>s=new HashSet<>();

        for(int i:arr2){
            s.add(i);
        }

        for(int i:arr1){
            if(s.contains(i)){
                System.out.print(i+" ");
            }
        }
    }

    public static void main(String[] args) {
        int arr1[]={10,20,30,40};
        int arr2[]={20,30,50,60};
        findIntersection(arr1, arr2);
    }
    
}
