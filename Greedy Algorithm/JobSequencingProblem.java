
import java.util.Arrays;

public class JobSequencingProblem {

    static class job implements Comparable<job>{
        int deadline;
        int profit;
        job(int d,int p){
            this.deadline=d;
            this.profit=p;
        }

        public int compareTo(job j){
            return j.profit-this.profit;
        }

    }

    static int maxProfit(job arr[]){
        int res=0;
        Arrays.sort(arr);
        int maxDeadline=0;

        for(job j:arr){
            maxDeadline=Math.max(maxDeadline,j.deadline);
        }

        boolean[] slots=new boolean[maxDeadline];

        for(int i=0;i<arr.length;i++){
            int j=Math.min(maxDeadline-1,arr[i].deadline-1);

            while(j>=0){
                if(!slots[j]){
                    res+=arr[i].profit;
                    slots[j]=true;
                    break;
                }

                j--;
            }
        }

        return res;
    }

    public static void main(String[] args) {
        job arr[] = {
            new job(2, 100),
            new job(1, 19),
            new job(2, 27),
            new job(1, 25),
            new job(3, 15)
        };

        System.out.println("Maximum profit is " + maxProfit(arr));
    }
    
}
