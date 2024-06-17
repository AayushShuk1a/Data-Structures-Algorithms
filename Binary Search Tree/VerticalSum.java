
import java.util.Map;
import java.util.TreeMap;

public class VerticalSum {

    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
        }
    }

    static void SumVertical(Node root,int hd,TreeMap<Integer,Integer>mp){
        if(root==null)
        return;

        SumVertical(root.left, hd-1, mp);
        int pSum=(mp.get(hd)==null)?0:mp.get(hd);
        pSum+=root.data;
        mp.put(hd, pSum);
        SumVertical(root.right, hd+1, mp);
    }

    static void Vsum(Node root){
        TreeMap<Integer,Integer>mp=new TreeMap<Integer,Integer>();
        SumVertical(root, 0, mp);
        for(Map.Entry sum:mp.entrySet()){
            System.out.print(sum.getValue()+" ");
        }
    }

    public static void main(String[] args) {
        Node root = new Node(10);  
        root.left = new Node(20);  
        root.right = new Node(50);  
        root.left.left = new Node(30);
        root.left.right = new Node(40);
        
        Vsum(root);
    }
}
    

