public class subsetSum {

    static int sum(int arr[],int sum,int i)
    {
        if(i==arr.length){
            return (sum==0)?1:0;
        }

        return sum(arr,sum,i+1)+sum(arr,sum-arr[i],i+1);

    }

    public static void main(String[] args) {
        int i = 0, arr[]= {10, 20, 15,5,5}, sum = 25;

		System.out.println(sum(arr, sum, i));
    }
    
}
