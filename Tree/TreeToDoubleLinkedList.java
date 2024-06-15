

public class TreeToDoubleLinkedList {
    static Node prev=null;
    static Node head;

    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
        }
    }

    static Node Convert(Node root){
        if(root==null)
        return root;

        Convert(root.left);
        
        if(prev==null){
            head=root;
        }else{
            root.left=prev;
            prev.right=root;
        }
        prev=root;
        Convert(root.right);
        return head;

    }

    static void Display(){
        Node curr=head;
        while(curr!=null){
            System.out.print(curr.data+" ");
            curr=curr.right;
        }
    }


    public static void main(String[] args) {
        Node root = new Node(20);
        root.left= new Node(30);
        root.right=new Node(40);
        root.left.left=new Node(45);
        root.right.left= new Node(50);
        root.right.right=new Node(60);
        root.right.right.left=new Node(70);
        Convert(root);
        Display();

    }
  
}
