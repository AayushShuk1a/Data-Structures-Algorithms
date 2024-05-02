public class subset {

    static void getSubset(String str,String temp,int n){

        if(n==str.length())
        {
            System.out.print(temp);
            return;
        }

        getSubset(str, temp, n+1);
        getSubset(str, temp+str.charAt(n), n+1);

    }

    public static void main(String[] args) {
        getSubset("ABC", " ", 0);
    }
    
}
