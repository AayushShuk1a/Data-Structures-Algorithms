public class BinarySearchTree {

    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
        }
    }

    static boolean search(Node root,int x){
        if(root==null)
        return false;
        Node curr=root;
        while(curr!=null){
            if(curr.data==x)
            return true;
            else if(x<curr.data)
            curr=curr.left;
            else
            curr=curr.right;
        }

        return false;
    }

    static Node getSuccessor(Node root){
        Node curr=root.right;
        while(curr!=null&&curr.left!=null)
        {
            curr=curr.left;
        }
        return curr;
    }

    static Node Delete(Node root,int x){
        if(root==null)
        return root;
        if(x<root.data){
            root.left=Delete(root.left, x);
        }
        else if(x>root.data){
            root.right=Delete(root.right, x);
        }
        else{
            if(root.left==null)
            return root.right;
            else if(root.right==null)
            return root.left;
            else{
                Node suc=getSuccessor(root);
                root.data=suc.data;
                root.right=Delete(root.right, suc.data);
            }
        }

        return root;
    }

    static Node insert(Node root,int x){
        Node temp=new Node(x);
        Node curr=root,parent=null;
        while(curr!=null){
            parent=curr;
            if(x<curr.data)
            curr=curr.left;
            else if(x>curr.data)
            curr=curr.right;
            else
            return temp;
        }

        if(parent==null)
        return temp;
        else if(x>parent.data)
        parent.right=temp;
        else
        parent.left=temp;
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
        Node root=new Node(15);
    	root.left=new Node(5);
    	root.left.left=new Node(3);
    	root.right=new Node(20);
    	root.right.left=new Node(18);
    	root.right.left.left=new Node(16);
    	root.right.right=new Node(80);
        //System.out.println(search(root, 19));
        root=insert(root, 24);
        display(root);
        
        
    }
    
}
