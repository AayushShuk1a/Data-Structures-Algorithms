public class MaxConsecutiveOnes {
    
    static int Count(int arr[]){
        int res=0;
        int c=0;
        for(int i=0;i<arr.length;i++)
        {
            c=1;
            while(i<arr.length-1&&arr[i]==arr[i+1])
            {
                c++;
                i++;
            }
            res=Math.max(res,c);
            
        }

        return res;
    }

    public static void main(String[] args) {
        int arr[]={1,0,0,1,1,1,1,1,0,1,1,1,0,0};
        System.out.println(Count(arr));
    }
}
