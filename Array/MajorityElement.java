public class MajorityElement {

    static int find(int arr[]){
        int ele=arr[0];
        int count=1;

        for(int i=1;i<arr.length;i++)
        {
            if(count==0)
           {
            ele=arr[i];
            count=0; 
           }

           if(ele==arr[i])
           count++;
           else
           count--;

           
        }

        count=0;
        
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==ele)
            count++;

        }

        if(count>arr.length/2)
        return ele;
        else
        return -1;

       
    }


    public static void main(String[] args) {
        int arr[]={3, 3, 4, 2, 4, 4, 2, 4};
        System.out.println(find(arr));
    }
    
}
