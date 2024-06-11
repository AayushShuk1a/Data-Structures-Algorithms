public class RemoveDuplicatesFromSorted {

    static Node head;
    static void RemoveDuplicates(){
        Node curr=head;
        while(curr!=null&&curr.next!=null){
            if(curr.data==curr.next.data){
                curr.next=curr.next.next;
            }else{
                curr=curr.next;
            }
        }
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

    static void display(){
        Node curr=head;
        while(curr!=null){
            System.out.print(curr.data+" ");
            curr=curr.next;
        }
    }
    

    public static void main(String[] args) {
        int arr[]={4,5,5,5,6,7,7,8,9,9,10};
        insertArray(arr);
        display();
        RemoveDuplicates();
        System.out.println(" ");
        display();

        
    }
}
