class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }

}


public class LinkedListBasic {

    static Node head;

    static void insertAtBegin(int data){
        Node temp=new Node(data);
        temp.next=head;
        head=temp;
    }

    static void insertAtBetween(int data,int pos){
        Node temp=new Node(data);

        if(pos==1||head==null){
            temp.next=head;
            head=temp;
            return;
        }

        Node curr=head;
        for(int i=1;i<pos-1;i++){

            if(curr==null){
                System.out.println("position out of range");
                return;
            }
            curr=curr.next;
        }

       

        temp.next=curr.next;
        curr.next=temp;
    }

    static void insertAtEnd(int data){

        Node temp=new Node(data);
        if(head==null){
            head=temp;
            return;
        }

        Node curr=head;
        
        while(curr.next!=null){
            curr=curr.next;
        }
        curr.next=temp;
    }

    static void print(){
        Node curr=head;
        while(curr!=null){
            System.out.print(curr.data+" ");
            curr=curr.next;
        }
    }

    public static void main(String[] args) {
    
        insertAtBegin(23);
        insertAtEnd(25);
        insertAtBegin(22);
        insertAtBetween(24, 3);
        print();
    }
    
}
