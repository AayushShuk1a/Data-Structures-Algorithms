

public class LongestIncreasingSubsequence {

    static int ceilIndex(int []arr,int l,int h,int key){

        while(l<h){
            int m=l+(h-l)/2;
            if(arr[m]>key){
                h=m;
            }else{
                l=m+1;
            }
        }

        return h;
    }

    static int LISusingBinarySearch(int []arr){
        int[]LIS=new int[arr.length];

        LIS[0]=arr[0];
        int len=1;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>LIS[len-1]){
                LIS[len]=arr[i];
                len++;
            }
            else{
                int c=ceilIndex(arr,0,len-1,arr[i]);
                LIS[c]=arr[i];
            }
        }

        return len;
    }

    static int LISusingDP(int[]arr){
        

        int []LIS=new int[arr.length];

        LIS[0]=1;
        for(int i=1;i<arr.length;i++){
            LIS[i]=1;
            for(int j=0;j<i;j++){
                if(arr[i]>arr[j]){
                    LIS[i]=Math.max(LIS[i], 1+LIS[j]);
                }
            }
        }

        int res=LIS[0];

        for(int i=1;i<LIS.length;i++){
            res=Math.max(res, LIS[i]);
        }

        return res;
    }

    public static void main(String[] args) {
        int []arr={3,4,2,8,10,5,1};
        //System.out.println(LISusingDP(arr));
        System.out.println(LISusingBinarySearch(arr));
    }
    
}
