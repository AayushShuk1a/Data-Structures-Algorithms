public class PermutationOfString {


    static String swap(String str,int i,int j){
        char[] arr=str.toCharArray();
        char temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        return String.valueOf(arr);
    }

    static void permute(String str,int i){
        if(i==str.length()){
            System.out.println(str+" ");
            return;
        }

        for(int j=i;j<str.length();j++){
            str=swap(str,i,j);
            permute(str, i+1);
            str=swap(str,i,j);
        }
    }

    public static void main(String[] args) {
        permute("ABC", 0);
    }
    
    
}
