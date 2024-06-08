
import java.util.Arrays;

public class LeftmostNonRepeating {

    static int find(String str){

        int[] tempArr=new int[256];
        Arrays.fill(tempArr,-1);
        int res=Integer.MAX_VALUE;
        for(int i=0;i<str.length();i++){
            if(tempArr[str.charAt(i)]==-1){
                tempArr[str.charAt(i)]=i;
            }else{
                tempArr[str.charAt(i)]=-2;
            }
        }

        for(int i=0;i<256;i++){
            if(tempArr[i]>=0){
                res=Math.min(res,tempArr[i]);
            }
        }

        return (res==Integer.MAX_VALUE)?-1:res;
        
    }

    public static void main(String[] args) {
        String str="aayush";
        System.out.println(find(str));
    }
    
}
