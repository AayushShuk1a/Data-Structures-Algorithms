
import java.util.PriorityQueue;

public class HuffmanCoding {

    static class Node{
        char ch;
        int freq;
        Node left;
        Node right;

        Node(char ch,int f,Node l,Node r){
            this.ch=ch;
            this.freq=f;
            this.left=l;
            this.right=r;
        }
    }

    static void printRec(Node root,String str){
        if(root.ch!='$'){
            System.out.println(root.ch+":"+str);
            return;
        }

        printRec(root.left, str+"0");
        printRec(root.right, str+"1");
    }

    static void printHuffmanTree(char[] arr,int[] freq){
        PriorityQueue<Node>pq=new PriorityQueue<>((n1,n2)->n1.freq-n2.freq);

        for(int i=0;i<arr.length;i++){
            pq.add(new Node(arr[i], freq[i], null, null));
        }

        while(pq.size()>1){
            Node l=pq.poll();
            Node r=pq.poll();
            pq.add(new Node('$', l.freq+r.freq, l, r));
        }

        printRec(pq.peek(),"");
    }


    public static void main(String[] args) {
        printHuffmanTree(new char[]{'a', 'd', 'e', 'f'}, new int[]{30, 40, 80, 60});
    }
    
}
