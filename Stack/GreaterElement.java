
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;

public class GreaterElement {

    static void PrevGreater(int arr[]){
        ArrayDeque<Integer>st=new ArrayDeque<>();

        st.push(arr[0]);
        System.out.print("-1"+" ");
        for(int i=1;i<arr.length;i++){
            while(st.isEmpty()==false&&arr[i]>st.peek()){
                st.pop();
            }

            int prevGreat=st.isEmpty()?-1:st.peek();
            System.out.print(prevGreat+" ");
            st.push(arr[i]);
        }
        
    }


    static void NextGreater(int arr[]){
        ArrayDeque<Integer>st=new ArrayDeque<>();
        ArrayList<Integer>v=new ArrayList<>();
        int n=arr.length;
        st.push(arr[n-1]);
        v.add(-1);
        for(int i=n-2;i>=0;i--){
            while(st.isEmpty()==false&&arr[i]>st.peek()){
                st.pop();
            }

            int nextGreat=st.isEmpty()?-1:st.peek();
            v.add(nextGreat);
            st.push(arr[i]);
        }

        Collections.reverse(v);

        for(int i:v)
        System.out.print(i+" ");


    }

    public static void main(String[] args) {
        int[] arr=new int[]{5,15,10,8,6,12,9,18};
        PrevGreater(arr);
        System.out.println(" ");
        System.out.println("Next Greater");
        NextGreater(arr);
    }
    
}
