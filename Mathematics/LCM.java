public class LCM {

    static int gcd(int a,int b){
        if(b==0)
        return a;

        return gcd(b,a%b);
    }

    static int findLCM(int a,int b){
        return (a*b)/gcd(a, b);
    }

    public static void main(String[] args) {
        System.out.println(findLCM(15, 45));
        
    }
    
}
