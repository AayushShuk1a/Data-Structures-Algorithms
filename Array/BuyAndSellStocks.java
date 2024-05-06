public class BuyAndSellStocks {

    static int profit(int arr[])
    {
        int res=0;
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]>arr[i-1])
            {
                res+=(arr[i]-arr[i-1]);

            }
        }

        return res;
    }

    public static void main(String[] args) {
        int arr[]={1,5,3,8,12};
        System.out.println(profit(arr));
    }
    
}
