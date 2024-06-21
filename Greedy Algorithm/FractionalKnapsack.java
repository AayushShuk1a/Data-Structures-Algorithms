
import java.util.Arrays;

public class FractionalKnapsack {

    static class Item implements Comparable<Item>{
        int wt;
        int val;
        Item(int w,int v){
            this.wt=w;
            this.val=v;
        }

        public int compareTo(Item i){
            return (this.wt*i.val)-(i.wt*this.val);
        }
    }

    static double KnapSack(Item arr[],int w){
        Arrays.sort(arr);
        double res=0;

        for(int i=0;i<arr.length;i++){
            if(arr[i].wt<w){
                res+=arr[i].val;
                w-=arr[i].wt;
            }else{
                res+=arr[i].val*((double)w/(double)arr[i].wt);
                break;
            }
        }


        return res;
    }

    public static void main(String[] args) {
        Item arr[] = {new Item(10, 60), 
            new Item(40, 40), 
            new Item(20, 100),
            new Item(30, 120)};

        System.out.println(KnapSack(arr, 50));
    }
    
}
