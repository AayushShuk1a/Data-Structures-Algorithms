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



    //INSERTION

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


    //DELETION
    static void deleteAtBegin(){
        head=head.next;
    }


    static void deleteAtPosition(int pos){

        if(head==null){
            System.out.println("No value present");
            return;

        }

        if (pos <= 0) {
            System.out.println("Invalid position");
            return;
        }

        if(pos==1){
            head=head.next;
            return;
        }

        Node curr=head;
        for(int i=1;i<pos-1;i++){
            curr=curr.next;
            if(curr==null||curr.next==null){
                System.out.println("Position Invalid");
                return;
            }
        }

        curr.next=curr.next.next;
    }

    static void deleteAtEnd(){
        if(head==null){
            System.out.println("No Value Present");
            return;
        }

        if(head.next==null){
            head=null;
            return;
        }

        Node curr=head;

        while(curr.next.next!=null){
            curr=curr.next;
        }
        curr.next=null;
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
        insertAtBegin(22);
        insertAtBegin(21);
        insertAtBegin(20);
        insertAtEnd(25);
        
        insertAtBetween(24, 5);
        deleteAtBegin();
        deleteAtEnd();
        deleteAtPosition(3);
        print();
    }
    
}
