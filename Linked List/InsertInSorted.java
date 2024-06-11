public class InsertInSorted {

    static Node head;
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
        }
    }

    static void Insert(int x){
        Node temp=new Node(x);
        if(head==null){
            head=temp;
            return;
        }

        if(head.data>x){
            temp.next=head;
            head=temp;
            return;
        }

        Node curr=head;
        while(curr.next!=null&&curr.next.data<x){
            curr=curr.next;
        }

        temp.next=curr.next;
        curr.next=temp;
    }

    static void display(){
        Node curr=head;
        while(curr!=null){
            System.out.print(curr.data+" ");
            curr=curr.next;
        }
    }

    public static void main(String[] args) {

        Insert(20);
        Insert(30);
        Insert(25);
        display();
        
    }

    
}
