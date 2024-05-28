

public class Traversals {

    static void printSnake(int arr[][]){

        for(int i=0;i<arr.length;i++)
        {
            if(i%2==0)
            {
                for(int j=0;j<arr[i].length;j++){
                    System.out.print(arr[i][j]+" ");
                }
            }
            else{
                for(int j=arr[i].length-1;j>=0;j--)
                {
                    System.out.print(arr[i][j]+" ");
                }
            }
        }

    }

    static void printBorder(int a[][]){

       int R=a.length;
       int C=a[0].length;
       
       if(R==1){
        for(int i=0;i<C;i++)
        {
            System.out.print(a[i][0]+" ");
        }
       }
       else if(C==1){
        for(int i=0;i<R;i++)
        {
            System.out.print(a[0][i]+" ");

        }
       }
       else{
        for(int i=0;i<C;i++){
            System.out.print(a[0][i]+" ");
        }
        for(int i=1;i<R;i++)
        {
            System.out.print(a[i][C-1]+" ");
        }
        for(int i=C-2;i>=0;i--)
        {
            System.out.print(a[R-1][i]+" ");
        }
        for(int i=R-2;i>=1;i--)
        {
            System.out.print(a[i][0]+" ");
        }
       }
    }


    static void Transpose(int arr[][]){
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr[0].length;j++)
            {
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
    }


    static void Rotate90(int arr[][]){
        Transpose(arr);

        for(int i=0;i<arr.length;i++){
            int low=0,high=arr[0].length-1;
            while(low<high)
            {
                int temp=arr[low][i];
                arr[low][i]=arr[high][i];
                arr[high][i]=temp; 

                low++;
                high--;
            }
        }
    }

    static void print(int arr[][]){
        for(int i = 0; i < arr.length; i++)
        {
            for(int j = 0; j < arr[0].length; j++)
            {
                System.out.print(arr[i][j]+" ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        int arr[][] = {{1, 2, 3, 4},
        {5, 6, 7, 8},
        {9, 10, 11, 12},
        {13, 14, 15, 16}
        };

        // printSnake(arr);
        // printBorder(arr);
        // Transpose(arr);
        Rotate90(arr);
        print(arr);
    }
    
}
