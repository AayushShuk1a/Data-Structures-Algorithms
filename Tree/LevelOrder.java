
import java.util.ArrayDeque;

public class LevelOrder {

    static class Node {

        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    static void LevelOrderTraversal(Node root) {
        ArrayDeque<Node> q = new ArrayDeque<>();
        q.offer(root);
        while (!q.isEmpty()) {
            int count = q.size();
            for (int i = 0; i < count; i++) {
                Node curr = q.poll();
                System.out.print(curr.data + " ");
                if (curr.left != null) {
                    q.offer(curr.left);
                }
                if (curr.right != null) {
                    q.offer(curr.right);
                }
            }
            System.out.println(" ");
            
        }
    }

    public static   void main(String[] args) {
        Node root = new Node(20);
        root.left= new Node(30);
        root.right=new Node(40);
        root.left.left=new Node(45);
        root.right.left= new Node(50);
        root.right.right=new Node(60);
        root.right.right.left=new Node(70);
        LevelOrderTraversal(root);
}
    
}
