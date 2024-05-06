public class MaxDiff {

    static int maxdiff(int arr[]){
        int res=0;
        int min=arr[0];

        for(int i=0;i<arr.length;i++)
        {
            res=Math.max(res,arr[i]-min);
            min=Math.min(min,arr[i]);

        }

        return res;
    }

    public static void main(String[] args) {
        int arr[]={2,3,10,6,4,8,1};
        System.out.println(maxdiff(arr));
    }
    
}
