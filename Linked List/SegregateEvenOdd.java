public class SegregateEvenOdd {

    static Node head;
    static void Segregate(){
        Node es=null,ee=null,os=null,oe=null;

        Node curr=head;
        while(curr!=null){
            int x=curr.data;
            if(x%2==0){
                if(es==null){
                    es=ee=curr;
                }
                else
                {
                    ee.next=curr;
                    ee=curr;
                }
            }
            else{
                if(os==null){
                    os=oe=curr;
                }else{
                    oe.next=curr;
                    oe=curr;
                }
            }

            curr=curr.next;
        }

        if(os==null||es==null){
            head=head;
            return;
        }

        ee.next=os;
        oe.next=null;
        head=es;
    }


    static void display(){
        Node curr=head;
        while(curr!=null){
            System.out.print(curr.data+" ");
            curr=curr.next;
        }
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
        System.out.println(" ");
        Segregate();
        display();
    }

    
    
}
