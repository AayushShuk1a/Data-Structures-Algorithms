public class CheckBalanceTree {

    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
        }
    }

    static int checkBalance(Node root){
        if(root==null)
        return 0;

        int lh=checkBalance(root.left);
        if(lh==-1)
        return -1;

        int rh=checkBalance(root.right);
        if(rh==-1)
        return -1;

        if(Math.abs(lh-rh)>1)
        return -1;
        else
        return Math.max(lh,rh)+1;
    }

    public static void main(String[] args) {
        Node root = new Node(20);
        root.left= new Node(30);
        root.right=new Node(40);
        root.left.left=new Node(45);
        root.right.left= new Node(50);
        root.right.right=new Node(60);
        root.right.right.left=new Node(70);

        if(checkBalance(root)>=0)
        System.out.println(true);
        else
        System.out.println(false);
    }
    
}
