public class FreqInSortedArray {

    static void CountFreq(int arr[]){

        int freq;
        int n=arr.length-1;
        for(int i=0;i<=n;i++)
        {
            freq=1;
            while(i<n&&arr[i]==arr[i+1])
            {
                freq++;
                i++;
            }

            System.out.println(arr[i]+"->"+freq);
        }

    }

    public static void main(String[] args) {
        int arr[]={10,10,10,30,40,40};
        CountFreq(arr);
    }
    
}
