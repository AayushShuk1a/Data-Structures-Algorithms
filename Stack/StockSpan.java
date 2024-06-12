
import java.util.ArrayDeque;

public class StockSpan {


    static void findSpan(int []arr){
        ArrayDeque<Integer>st=new ArrayDeque<>();
        st.push(0);
        System.out.print(1+" ");

        for(int i=1;i<arr.length;i++){
            while(st.isEmpty()==false&&arr[st.peek()]<=arr[i]){
                st.pop();
            }

            int span=st.isEmpty()?i+1:i-st.peek();
            System.out.print(span+" ");
            st.push(i);
        }
    }

    public static void main(String[] args) {
        int[] arr=new int[]{18,12,13,14,11,16};
        findSpan(arr);
    }
    
}
