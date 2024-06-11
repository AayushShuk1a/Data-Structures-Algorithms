public class DetectLoop {

    static Node head;
    static boolean Detect(){
        Node fast=head;
        Node slow=head;

        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;

            if(slow==fast)
            return true;

        }

        return false;
    }

    public static void main(String args[]) 
    { 
        Node head1=new Node(15);
    	head1.next=new Node(10);
    	head1.next.next=new Node(12);
    	head1.next.next.next=new Node(20);
    	head1.next.next.next.next=head1.next;
        head=head1;
        System.out.println(Detect());

    }
    
}
