public class MaximumAppearingElement {

    static int find(int left[],int right[]){

        int []freq=new int[101];

        for(int i=0;i<left.length;i++)
        {
            freq[left[i]]++;
            freq[right[i]]--;
        }

        int res=0;

        for(int i=1;i<100;i++)
        {
            freq[i]+=freq[i-1];
            if(freq[i]>freq[res])
            res=i;

        }


        return res;
    }


    public static void main(String[] args) {
        int L[ ] = {1, 5, 9, 13, 21}, R[ ] = {15, 8, 12, 20, 24};
        System.out.println(find(L, R));
    }
    
}
