
import java.util.ArrayDeque;

public class MaximumWidth {

    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
        }
    }

    static int maxWidth(Node root){
        ArrayDeque<Node>q=new ArrayDeque<>();
        q.offer(root);
        int res=Integer.MIN_VALUE;
        while(!q.isEmpty()){
            int count=q.size();
            res=Math.max(res, count);
            for(int i=0;i<count;i++){
                Node curr=q.poll();
                if(curr.left!=null){
                    q.offer(curr.left);
                }
                if(curr.right!=null)
                q.offer(curr.right);
            }
        }

        return res;
    }

    public static void main(String[] args) {
        Node root = new Node(20);
        root.left= new Node(30);
        root.right=new Node(40);
        root.left.left=new Node(45);
        root.right.left= new Node(50);
        root.right.right=new Node(60);
        root.right.right.left=new Node(70);
        System.out.println(maxWidth(root));
    }
    
}
