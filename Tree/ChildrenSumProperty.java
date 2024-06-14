public class ChildrenSumProperty {

    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
        }
    }

    static boolean CheckChildrenSum(Node root){

        if(root==null)
        return true;

        if(root.left==null&&root.right==null)
        return true;

        int sum=0;
        if(root.left!=null)
        sum+=root.left.data;

        if(root.right!=null)
        sum+=root.right.data;


        return ((root.data==sum)&&CheckChildrenSum(root.left)&&CheckChildrenSum(root.right));

    }


    public static void main(String[] args) {
        Node root=new Node(20);
    	root.left=new Node(8);
    	root.right=new Node(12);
    	root.right.left=new Node(3);
    	root.right.right=new Node(9);

        System.out.println(CheckChildrenSum(root));
    }
    
}
