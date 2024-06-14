public class SizeAndMax {

    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
        }
    }

    static int Size(Node root){
        if(root==null){
            return 0;
        }
        else
        {
            return 1+Size(root.left)+Size(root.right);
        }
    }

    static int getMax(Node root){
        if(root==null)
        {
            return Integer.MIN_VALUE;
        }
        else{
            return Math.max(root.data,Math.max(getMax(root.left), getMax(root.right)));
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

        System.out.println(Size(root));
        System.out.println(getMax(root));
    }
    
}
