public class FirstLeftmostDuplicate {

    static int find(String str){

        boolean[] visited=new boolean[256];
        int res=-1;
        for(int i=str.length()-1;i>=0;i--){
            if(visited[str.charAt(i)]==true){
                res=i;
            }
            else
            {
                visited[str.charAt(i)]=true;
            }
        }

        return res;
    }


    public static void main(String[] args) {
        String str="geeksforgeeks";
        System.out.println(find(str));
    }
    
}
