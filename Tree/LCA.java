public class LCA {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
        }
    }

    static Node findLCA(Node root,int n1,int n2){
        if(root==null)
        return null;

        if(root.data==n1||root.data==n2){
            return root;
        }

        Node LCA1=findLCA(root.left, n1, n2);
        Node LCA2=findLCA(root.right, n1, n2);
        if(LCA1!=null&&LCA2!=null)
        return root;

        if(LCA1!=null)
        return LCA1;
        else
        return LCA2;
    }

    public static void main(String[] args) {
        Node root = new Node(20);
        root.left= new Node(30);
        root.right=new Node(40);
        root.left.left=new Node(45);
        root.right.left= new Node(50);
        root.right.right=new Node(60);
        root.right.right.left=new Node(70);
        Node LCA=findLCA(root, 45, 70);
        System.out.print(LCA.data);
    }
    
}
