public class ConstructTreeFromInOrderAndPreOrder {

    static int preIndex=0;
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
        }
    }
    static Node Construct(int pre[],int in[],int is,int ie){
        if(is>ie)return null;
        Node root=new Node(pre[preIndex++]);
        int inIndex=is;
        for(int i=is;i<=ie;i++){
            if(in[i]==root.data){
                inIndex=i;
                break;
            }
        }

        root.left=Construct(pre, in, is, inIndex-1);
        root.right=Construct(pre, in, inIndex+1, ie);
        return root;
    }

    static void display(Node root){
        if(root!=null){
            display(root.left);
            System.out.print(root.data+" ");    
            display(root.right);
        }
    }

    public static void main(String[] args) {
        int[] preOrder={20,30,45,40,50,60,70};
        int[] inOrder={45,30,20,50,40,70,60};
        Node root=Construct(preOrder,inOrder,0,preOrder.length-1);
        display(root);

    }
    
}
