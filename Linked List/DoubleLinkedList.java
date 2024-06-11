public class DoubleLinkedList {

    static class Node{
        int data;
        Node prev;
        Node next;
    
        Node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }

    static Node head;
    static void insertAtBegin(int data){
        Node temp=new Node(data);
        temp.next=head;
        if(head!=null)
        head.prev=temp;
        head=temp;
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
        temp.prev=curr;
    }

    static void reverse(){
        Node temp=null;
        Node curr=head;
        while(curr!=null){
            temp=curr.prev;
            curr.prev=curr.next;
            curr.next=temp;
            curr=curr.prev;
        }
        if(temp!=null)head=temp.prev;
        
    }

    static void deleteAtBegin(){
        if(head==null||head.next==null){
            head=null;
            return;
        }


        head=head.next;
        head.prev=null;
        
    }


    static void deleteAtEnd(){
        if(head==null){
            return;
        }
        if(head.next==null){
            head=null;
            return;
        }    
        Node curr=head;
        while(curr.next!=null)
            curr=curr.next;
        curr.prev.next=null;
    }

    static void display(){
        Node curr=head;
        while(curr!=null){
            System.out.print(curr.data+" ");
            curr=curr.next;
        }
    }


    public static void main(String[] args) {
        insertAtBegin(10);
        insertAtEnd(20);
        insertAtEnd(30);
        deleteAtEnd();
        display();
        // reverse();
        // System.out.println("after reverse");
        // display();
        
    }
    
}



