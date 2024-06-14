

public class PrintNodesAtKDistance {

    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
        }
    }

    static int Height(Node root){
        if(root==null)
        return 0;
        else
        return Math.max(Height(root.left),Height(root.right))+1;
    }

    static void PrintDistanceK(Node root,int k){
        if(root==null)
        return;

        if(k==0){
            System.out.print(root.data+" ");
            return;
        }
        else
        {
            PrintDistanceK(root.left,k-1);
            PrintDistanceK(root.right, k-1);
        }

        
    }


    public static void main(String[] args) {
        Node root=new Node(20);
        root.left=new Node(30);
        root.right=new Node(40);
        root.right.left=new Node(50);
        root.right.right=new Node(60);
        root.right.right.left=new Node(70);
        System.out.println(Height(root));
        PrintDistanceK(root,3);
    }

    
    
}
