
import java.util.ArrayList;
import java.util.PriorityQueue;

public class MergeKsortedArray {

    static class Triplet implements Comparable<Triplet>{
        int value;
        int aPos;
        int vPos;
        Triplet(int value,int aPos,int vPos){
            this.value=value;
            this.aPos=aPos;
            this.vPos=vPos;
        }

        public int compareTo(Triplet t){
            return Integer.compare(this.value,t.value);
        }

    }


    static ArrayList<Integer> mergeArray(ArrayList<ArrayList<Integer>>arr){
            ArrayList<Integer>res=new ArrayList<>();
            PriorityQueue<Triplet>pq=new PriorityQueue<Triplet>();

            for (int i = 0; i < arr.size(); i++) {
                pq.add(new Triplet(arr.get(i).get(0), i, 0));
            }

            while(!pq.isEmpty()){
                Triplet curr=pq.poll();
                res.add(curr.value);
                int ap=curr.aPos;
                int vp=curr.vPos;
                if(vp+1<arr.get(ap).size()){
                    pq.add(new Triplet(arr.get(ap).get(vp+1), ap, vp+1));
                }
            }

            return res;

    }

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer> > arr=new ArrayList<ArrayList<Integer>>();
	
    ArrayList<Integer> a1 = new ArrayList<Integer>(); 
        a1.add(10); 
        a1.add(20);
        a1.add(30);
        arr.add(a1); 
  
        ArrayList<Integer> a2 = new ArrayList<Integer>(); 
        a2.add(5);
        a2.add(15);
        arr.add(a2); 
  
        ArrayList<Integer> a3 = new ArrayList<Integer>(); 
        a3.add(1); 
        a3.add(9); 
        a3.add(11);
        a3.add(18);
        arr.add(a3);
        
        ArrayList<Integer> res = mergeArray(arr); 

        System.out.println("Merged array is " ); 
        for (int x : res) 
            System.out.print(x + " ");
    }


    
}
