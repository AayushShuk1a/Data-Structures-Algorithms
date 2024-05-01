public class powerOfTwo {

    static boolean check(int n){
        if(n==0)
        return false;


       if((n&(n-1))!=0)
        return false;
       

        return true;
    }

    public static void main(String[] args) {
    
        System.out.println(check(32));
    }

    
}
