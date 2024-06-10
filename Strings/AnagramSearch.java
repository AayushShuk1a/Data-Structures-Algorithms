public class AnagramSearch {

    static boolean areSame(int CT[],int CP[]){
        for(int i=0;i<256;i++){
            if(CT[i]!=CP[i])
            return false;
        }

        return true;
    }


    static boolean isPresent(String txt,String ptn){
        int[] CT=new int[256];
        int[] CP=new int[256];

        for(int i=0;i<ptn.length();i++){
            CT[txt.charAt(i)]++;
            CP[ptn.charAt(i)]++;
        }

        for(int i=ptn.length();i<txt.length();i++){
            if(areSame(CT, CP))return true;

            CT[txt.charAt(i)]++;
            CT[txt.charAt(i-ptn.length())]--;
        }

        return false;
    } 

    public static void main(String[] args) {
        String txt = "geeksforgeeks"; 
        String pat = "frog"; 
        System.out.println(isPresent(txt, pat)); 
        
    }
    
}
