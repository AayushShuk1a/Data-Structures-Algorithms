public class CountInverse {

    static int invCount(int arr[],int l,int r)
    {
        int res=0;
        if(l<r)
        {
            int m=(r+l)/2;
            res+=invCount(arr, l, m);
            res+=invCount(arr, m+1, r);
            res+=countInverse(arr,l,m,r);
        }

        return res;
    }


    static int countInverse(int arr[],int l,int m,int r){
        int res=0;

        int leftSize=m-l+1;
        int rightSize=r-m;

        int[] L=new int[leftSize];
        int[] R=new int[rightSize];

        for(int i=0;i<leftSize;i++)
        {
            L[i]=arr[l+i];
        }

        for(int i=0;i<rightSize;i++)
        {
            R[i]=arr[m+1+i];
        }

        int i=0,j=0,k=l;

        while(i<leftSize&&j<rightSize)
        {
            if(L[i]<=R[j])
            {
                arr[k++]=L[i++];
            }
            else
            {
                arr[k++]=R[j++];
                res+=leftSize-i;
            }

        }   

        while(i<leftSize)
        {
            arr[k++]=L[i++];
        }

        while(j<rightSize)
        {
            arr[k++]=R[j++];
        }

        return res;
    }

    public static void main(String[] args) {
        int arr[]={2,4,1,3,5};
        System.out.println(invCount(arr, 0, arr.length-1));
    }
    
}
