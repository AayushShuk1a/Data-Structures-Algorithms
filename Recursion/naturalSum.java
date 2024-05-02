class naturalSum {
    static int findSum(int n){
        if(n==1)
        return 1;
        
        return n+findSum(n-1);
    }

    public static void main(String[] args) {
        System.out.println(findSum(6));
    }
    
}
