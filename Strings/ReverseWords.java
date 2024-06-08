public class ReverseWords {

    static void reverse(char str[],int low,int high){
        while(low<=high){
            char temp=str[low];
            str[low]=str[high];
            str[high]=temp;

            low++;
            high--;
        }
    }


    static void reverseWords(char str[]){

        int start=0;

        for(int i=0;i<str.length;i++){
            if(str[i]==' '){
                reverse(str, start, i-1);
                start=i+1;
            }
        }

        reverse(str, start, str.length-1);
        reverse(str, 0, str.length-1);
    }

    public static void main(String[] args) {
        String str="Hello World";
        char[] ch=str.toCharArray();
        reverseWords(ch);
        System.out.println(ch);
    }
    
}
