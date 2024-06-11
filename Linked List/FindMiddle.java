public class FindMiddle {

    static Node head;

    static int Middle(){
        if(head==null){
            System.out.println("Empty List");
            return -1;
        }

        Node slow=head;
        Node fast=head;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }

        return slow.data;
    }

    static void insertArray(int arr[]){

        Node temp=new Node(arr[0]);
        head=temp;

        for(int i=0;i<arr.length;i++){
            Node newNode=new Node(arr[i]);
            temp.next=newNode;
            temp=newNode;
        }
    }
    

    public static void main(String[] args) {
        int arr[]={4,5};
        insertArray(arr);
        System.out.println(Middle());
        
    }
}
