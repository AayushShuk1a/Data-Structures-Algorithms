public class GCD {

    static int findGCD(int a,int b){

        if(b==0)
        return a;

        return findGCD(b, a%b);
    }

    public static void main(String[] args) {
        System.out.println(findGCD(45, 15));
    }

}
