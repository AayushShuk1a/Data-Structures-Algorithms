class stringPallindrome {

    static boolean check(String str,int start,int end){
        if(start>=end)
        return true;

        if(str.charAt(start)!=str.charAt(end))
        return false;
        
        return check(str,start+1,end-1);
    }

    public static void main(String[] args) {
        System.out.println(check("trouble", 0, 4));
    }
    
}
