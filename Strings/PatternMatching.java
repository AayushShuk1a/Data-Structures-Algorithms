public class PatternMatching {

    static void fillLps(String str,int lps[]){

        int len=0;
        lps[0]=0;
        int i=1;
        while(i<str.length()){
            if(str.charAt(len)==str.charAt(i)){
                len++;
                lps[i]=len;
                i++;
            }
            else{
                if(len==0){
                    lps[i]=0;
                    i++;
                }
                else{
                    len=lps[len-1];
                }
            }
        }

    }

    static void KMP(String txt,String ptn){
        int[] lps=new int[ptn.length()];
        fillLps(ptn, lps);

        for(int i:lps){
            System.out.print(i+" ");
        }
        int i=0;
        int j=0;
        while(i<txt.length()){
            if(txt.charAt(i)==ptn.charAt(j)){
                i++;
                j++;
            }

            if(j==ptn.length()){
                System.out.println((i-j)+" ");
                j=lps[j-1]; 
            }
            else if(i<txt.length()&&txt.charAt(i)!=ptn.charAt(j)){
                if(j==0)
                i++;
                else
                j=lps[j-1];
            }
        }
    }

    public static void main(String[] args) {
        String txt = "ababcababaad",pat="ababa";
        KMP(pat,txt);
    }
    
}
