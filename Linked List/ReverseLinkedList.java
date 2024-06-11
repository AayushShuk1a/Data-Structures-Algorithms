public class ReverseLinkedList {

    static Node head;
    static void Reverse(){
        if(head==null)
        return;

        if(head.next==null)
        return;

        Node prev=null;
        Node curr=head;

        while(curr!=null){
            Node next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }

        head=prev;
    }

    static void display(){
        Node curr=head;

        while(curr!=null){
            System.out.print(curr.data+" ");
            curr=curr.next;
        }
        System.out.println(" ");
    }

    static void insertArray(int arr[]){

        Node temp=new Node(arr[0]);
        head=temp;

        for(int i=1;i<arr.length;i++){
            Node newNode=new Node(arr[i]);
            temp.next=newNode;
            temp=newNode;
        }
    }
    

    public static void main(String[] args) {
        int arr[]={4,5,6,7,8,9,10};
        insertArray(arr);
        display();
        System.out.println("Reverse");
        Reverse();
        display();
        
    
    }
    
}
