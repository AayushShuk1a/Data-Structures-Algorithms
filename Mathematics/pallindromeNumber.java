class pallindromeNumber{

    static boolean isValid(int n){
        int temp=n;
        int rev=0;
        int r;

        while(temp!=0)
        {
            r=temp%10;
            rev=(rev*10)+r;
            temp=temp/10;
        }

        return (rev==n);
    }


   public static void main(String[] args) {
    int n=777;
    System.out.println(isValid(n)); 
   } 

    



}