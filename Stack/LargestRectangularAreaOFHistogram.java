import java.util.ArrayDeque;

public class LargestRectangularAreaOFHistogram {

    static int CalculateLargestArea(int arr[]){
        ArrayDeque<Integer>st=new ArrayDeque<>();
        int res=0;
        int area;
        int top;
        for(int i=0;i<arr.length;i++){
            while(st.isEmpty()==false&&arr[i]<=arr[st.peek()]){
                top=st.pop();
                area=arr[top]*(st.isEmpty()?i:i-top-1);
                res=Math.max(res, area);
            }
            st.push(i);
        }

        while(st.isEmpty()==false){
            top=st.pop();
            area=arr[top]*(st.isEmpty()?arr.length:arr.length-st.peek()-1);
            res=Math.max(res, area);
        }

        return res;
    }

    public static void main(String[] args) {
        int[] arr=new int[]{6,2,5,4,6,7,3,5,4};
        System.out.println(CalculateLargestArea(arr));
    }
}
