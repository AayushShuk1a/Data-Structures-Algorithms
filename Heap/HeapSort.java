public class HeapSort {


    //Ascending Sorted Array
    static void BuildHeapAsec(int arr[]){
        for(int i=(arr.length/2)-1;i>=0;i--)
        HeapifyAsec(arr,arr.length,i);
    }

    static void HeapifyAsec(int arr[],int n,int i){   //Max-Heap
        int largest=i;
        int lh=(2*i)+1;
        int rh=(2*i)+2;

        if(lh<n&&arr[lh]>arr[largest])
        largest=lh;

        if(rh<n&&arr[rh]>arr[largest])
        largest=rh;

        if(largest!=i)
        {
            int temp=arr[i];
            arr[i]=arr[largest];
            arr[largest]=temp;
            HeapifyAsec(arr,n, largest);
        }

    }

    static void sortAsec(int arr[]){
        BuildHeapAsec(arr);
        for(int i=arr.length-1;i>=0;i--){
            int temp=arr[0];
            arr[0]=arr[i];
            arr[i]=temp;
            HeapifyAsec(arr,i, 0);
        }
    }

    //Descending Sorted Array
    
    static void BuildHeapDesc(int arr[]){
        for(int i=(arr.length/2)-1;i>=0;i--)
        DescHeapify(arr,arr.length,i);
    }

    static void DescHeapify(int arr[],int n,int i){   //Min-Heap
        int smallest=i;
        int lh=(2*i)+1;
        int rh=(2*i)+2;

        if(lh<n&&arr[lh]<arr[smallest])
        smallest=lh;

        if(rh<n&&arr[rh]<arr[smallest])
        smallest=rh;

        if(smallest!=i)
        {
            int temp=arr[i];
            arr[i]=arr[smallest];
            arr[smallest]=temp;
            DescHeapify(arr,n, smallest);
        }

    }


    static void sortDesc(int arr[]){
        BuildHeapDesc(arr);
        for(int i=arr.length-1;i>=0;i--){
            int temp=arr[0];
            arr[0]=arr[i];
            arr[i]=temp;
            DescHeapify(arr,i, 0);
        }
    }

    
	static void printArray(int arr[]) 
	{ 
		int n = arr.length; 
		for (int i=0; i<n; ++i) 
			System.out.print(arr[i]+" "); 
		System.out.println(); 
	} 
 
	public static void main(String args[]) 
	{ 
		int arr[] = {10,12,8,6,15,11,9}; 
		sortAsec(arr); 

		System.out.println(" Ascending Sorted array is"); 
		printArray(arr); 


        sortDesc(arr); 

		System.out.println(" Descending Sorted array is"); 
		printArray(arr); 
	} 
    
}
