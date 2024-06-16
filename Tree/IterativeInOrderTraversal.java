
import java.util.ArrayDeque;

public class IterativeInOrderTraversal {

    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
        }
    }


    static void InOrder(Node root){
        ArrayDeque<Node>q=new ArrayDeque<>();
        Node curr=root;
        while(curr!=null||!q.isEmpty()){
            while(curr!=null){
                q.push(curr);
                curr=curr.left;
            }
            curr=q.pop();
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
        InOrder(root);

    }
    
}
