public class SearchInMatrix {

    static void Search(int arr[][],int x){
        int low=0;
        int high=arr[0].length-1;

        while(low<arr.length&&high>=0){
            if(arr[low][high]==x)
            {
                System.out.println("Found at (" + low + ", " + high+ ")");
				return;
            }
            else if(arr[low][high]>x)
            {
                high--;
            }
            else
            {
                low++;
            }
        }

        System.out.println("Not Found");
    }

    public static void main(String[] args) {
        int arr[][] = {{10, 20, 30, 40},
    				   {15, 25, 35, 45},
    				   {27, 29, 35, 45},
    				   {32, 33, 39, 50}};
    	int x = 29;	  
        
        Search(arr, x);


    }
    
}
