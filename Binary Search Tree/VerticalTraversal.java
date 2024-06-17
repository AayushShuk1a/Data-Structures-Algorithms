
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class VerticalTraversal {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
        }
    }

    static class Pair{
        Node node;
        int hd;
        Pair(Node node,int hd){
            this.node=node;
            this.hd=hd;
        }
    }

    static void VTraversal(Node root){
        ArrayDeque<Pair>q=new ArrayDeque<>();
        TreeMap<Integer,ArrayList<Integer>>mp=new TreeMap<>();
        q.offer(new Pair(root,0));
        while(!q.isEmpty()){
            Pair p=q.poll();
            Node curr=p.node;
            int hd=p.hd;
            if(mp.containsKey(hd)){
                mp.get(hd).add(curr.data);
            }
            else{
                ArrayList<Integer>al=new ArrayList<>();
                al.add(curr.data);
                mp.put(hd, al);
            }

            if(curr.left!=null){
                q.offer(new Pair(curr.left, hd-1));
            }

            if(curr.right!=null){
                q.offer(new Pair(curr.right, hd+1));
            }

        }

        for(Map.Entry<Integer,ArrayList<Integer>> i:mp.entrySet()){
            ArrayList<Integer>al=i.getValue();
            for(int j:al){
                System.out.print(j+" ");
            }
            System.out.println(" ");
        }
    }

    public static void main(String[] args) {
        Node root = new Node(10);  
        root.left = new Node(20);  
        root.right = new Node(30);  
        root.left.left = new Node(40);
        root.left.right = new Node(50);
        
        VTraversal(root);
    }
}
