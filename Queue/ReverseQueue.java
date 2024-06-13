import java.util.ArrayDeque;

public class ReverseQueue {

    static void Reverse(ArrayDeque<Integer>q){
        if(q.isEmpty())
        return;

        int x=q.poll();
        Reverse(q);
        q.offer(x);
    }   
    
    static void Display(ArrayDeque<Integer>q){
        for(int i:q){
            System.out.print(i+" ");
        }
    }

    public static void main(String[] args) {
        ArrayDeque<Integer>q=new ArrayDeque<>();
        q.offer(23);
        q.offer(21);
        q.offer(19);
        Display(q);
        Reverse(q);
        System.out.println(" ");
        Display(q);

    }
    
}
