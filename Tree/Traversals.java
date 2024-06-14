public class Traversals {

    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
        }
    }

    static void Inorder(Node root){
        if(root!=null){
            Inorder(root.left);
            System.out.print(root.data+" ");
            Inorder(root.right);
        }
    }


    static void PreOrder(Node root){
        if(root!=null){
            System.out.print(root.data+" ");
            PreOrder(root.left);
            PreOrder(root.right);
        }
    }

    static void PostOrder(Node root){
        if(root!=null){
            PostOrder(root.left);
            PostOrder(root.right);
            System.out.print(root.data+" ");
        }
    }

    public static void main(String[] args) {
        Node root=new Node(20);
        root.left=new Node(30);
        root.right=new Node(40);
        root.right.left=new Node(50);
        root.right.right=new Node(60);
        Inorder(root);
        System.out.println(" ");
        PreOrder(root);
        System.out.println(" ");
        PostOrder(root);
    }
    
}
