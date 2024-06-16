public class CheckBST {

    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
        }
    }

    static boolean check(Node root,int prev){
        if(root==null)
        return true;

        if(check(root.left, prev)==false)
        return false;

        if(root.data<=prev)
        return false;

        prev=root.data;
        return check(root.right, prev);
    }

    public static void main(String[] args) {
        Node root = new Node(4);  
        root.left = new Node(23);  
        root.right = new Node(5);  
        root.left.left = new Node(1);  
        root.left.right = new Node(3);
        int prev=Integer.MIN_VALUE;
        System.out.println( check(root, prev));
    }
    
}
