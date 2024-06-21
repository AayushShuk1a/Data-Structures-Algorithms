
import java.util.Arrays;

public class ActivitySelectionProblem {
    
    static class Activity implements Comparable<Activity>{
        int finish;
        int start;
        Activity(int start,int finish){
            this.start=start;
            this.finish=finish;
        }

        public int compareTo(Activity a){
            return this.finish-a.finish;
        }
    }

    static int maxActivity(Activity arr[]){
        Arrays.sort(arr);
        int res=1;
        int prev=0;

        for(int i=1;i<arr.length;i++){
            if(arr[i].start>=arr[prev].finish){
                res++;
                prev=i;
            }
        }

        return res;
    }




    public static void main(String[] args) {
        Activity arr[] = {new Activity(12, 25), 
            new Activity(10, 20), 
            new Activity(20, 30),
            new Activity(30,35)}; 
            
            System.out.println(maxActivity(arr));
    }
}
