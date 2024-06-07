public class CheckSubsequence {

    static boolean Check(String str1,String str2){
        int i=0;
        int j=0;

        while(i<str1.length()&&j<str2.length()){
            if(str1.charAt(i)==str2.charAt(j)){
                j++;
            }

            i++;
        }

        return (j==str2.length());
    }

    public static void main(String[] args) {
        String str1="Computer";
        String str2="Comp";
        System.out.println(Check(str1,str2));
    }
}
