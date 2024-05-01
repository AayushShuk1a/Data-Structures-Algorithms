public class KthBit {

    public static void findKthBit(int n,int k){
        
        int x=(1<<(k-1));


        if((n&x)>0){
            System.out.println("Set Bit");
        }
        else{
            System.out.println("Not Set");
        }
    }

    public static void main(String[] args) {
        findKthBit(12,4);
    }
    
}
