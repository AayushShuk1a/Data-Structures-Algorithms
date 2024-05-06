import java.util.ArrayList;

public class leadersArray {
    static void leaders(int arr[]){

        ArrayList<Integer>res=new ArrayList<>();

        int n=arr.length;
        int max=arr[n-1];
        res.add(arr[n-1]);
        for(int i=arr.length-1;i>=0;i--)
        {
            if(arr[i]>max){
                max=arr[i];
                res.add(max);
            }
            
        }


        for (int i = res.size() - 1; i >= 0; i--) {
            System.out.print(res.get(i)+" ");
        }

    }

    public static void main(String[] args) {
        int arr[]={10,5,6,3,4,2,1};
        leaders(arr);
    }
    
}
