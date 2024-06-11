public class NthNodeFromEnd {

    static Node head;
    static int find(int n){
        if(head==null)
        return -1;

        Node first=head;
        for(int i=0;i<n;i++){
            if(first==null)
            return -1;
            first=first.next;
        }

        Node second=head;

        while(first!=null){
            first=first.next;
            second=second.next;
        }

        return second.data;
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
        int arr[]={4,5,6,7,8,9,10};
        insertArray(arr);
        System.out.println(find(2));
    
    }
}


