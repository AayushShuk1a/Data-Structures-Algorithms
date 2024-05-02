public class RopeCutting {

    static int ropes(int n,int a,int b,int c){
        if(n==0)
        return 0;

        if(n<0)
        return -1;

        int res = Math.max(ropes(n-a, a, b, c), 
		          Math.max(ropes(n-b, a, b, c), 
		          ropes(n-c, a, b, c)));

        if(res==-1)
        return -1;

        return res+1;
    }

    public static void main(String[] args) {
        System.out.println(ropes(5, 9, 3, 3));
    }
}
