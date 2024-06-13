
import java.util.ArrayDeque;

public class GenerateDigitsFromNumber {

    static void Generate(int n){
        ArrayDeque<String>q=new ArrayDeque<>();
        q.offer("5");
        q.offer("6");
        for(int i=0;i<n;i++){
            String curr=q.poll();
            System.out.print(curr+" ");
            q.offer(curr+"5");
            q.offer(curr+"6");
        }
    }

    public static void main(String[] args) {
        Generate(10);
    }
    
}
