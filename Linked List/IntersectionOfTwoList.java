
public class IntersectionOfTwoList {

    static Node List1;
    static Node List2;
    static int getCount(Node curr){
        int count=0;

        while(curr!=null){
            count++;
            curr=curr.next;
        }

        return count;
    }

    static int getIntersection(){
        Node temp1=List1;
        Node temp2=List2;

        int c1=getCount(temp1);
        int c2=getCount(temp2);

        temp1=List1;
        temp2=List2;

        if(c1>c2){
            for(int i=1;i<=c1-c2;i++){
                temp1=temp1.next;
            }
        }
        else{
            for(int i=1;i<=c2-c1;i++){
                temp2=temp2.next;
            }
        }

    while(temp1!=null&&temp2!=null){
        if(temp1==temp2)
        return temp1.data;

        temp1=temp1.next;
        temp2=temp2.next;
    }

    return -1;
    }


    public static void main(String[] args) 
	{ 
		List1 = new Node(3); 
		List1.next = new Node(6); 
		List1.next.next = new Node(9); 
		List1.next.next.next = new Node(15); 
		List1.next.next.next.next = new Node(30); 

	    List2 = new Node(10); 
		List2.next = List1.next.next.next; 
		List2.next.next = List1.next.next.next.next; 

		System.out.println(getIntersection()); 
	} 
    
}
