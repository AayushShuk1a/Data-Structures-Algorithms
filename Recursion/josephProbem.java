public class josephProbem {

    static int jos(int n,int k){
        if(n==0)
        return 0;

        return ((jos(n-1,k))+k)%n;
    }

    static int myJos(int n,int k)
    {
        return jos(n, k)+1;
    }

    public static void main(String[] args) {
        System.out.println(myJos(5, 3));
    }

    
}
