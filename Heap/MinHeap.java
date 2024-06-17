public class MinHeap {
    static int size;
    int capacity;
    static int[] arr;
    MinHeap(int c){
        this.capacity=c;
        size=0;
        arr=new int[c];
    }

    static int left(int i){
        return (2*i+1);
    }

    static int right(int i){
        return (2*i+2);
    }

    static int parent(int i){
        return (i-1)/2;
    }

    public void insert(int x){
        if(size==capacity)
        return;

        size++;
        arr[size-1]=x;
        for(int i=size-1;i!=0&&arr[parent(i)]>arr[i];i=parent(i)){
            int temp=arr[i];
            arr[i]=arr[parent(i)];
            arr[parent(i)]=temp;
        }
    }

    static void Heapify(int i){
        int smallest=i;
        int lt=left(i);
        int rt=right(i);

        if(lt<size&&arr[lt]<arr[smallest])
        smallest=lt;

        if(rt<size&&arr[rt]<arr[smallest])
        smallest=rt;

        if(smallest!=i){
            int temp=arr[smallest];
            arr[smallest]=arr[i];
            arr[i]=temp;
            Heapify(i);
        }


    }

    static int extractMin(){
        if(size<=0)
        return Integer.MIN_VALUE;

        if(size==1)
        {
            size--;
            return arr[0];
        }

        int temp=arr[0];
        arr[0]=arr[size-1];
        arr[size-1]=temp;
        size--;
        Heapify(0);
        return arr[size];

    }

    static void decreaseKey(int i,int x){
        arr[i]=x;
        while(i!=0&&arr[i]<arr[parent(i)]){
            int temp=arr[i];
            arr[i]=arr[parent(i)];
            arr[parent(i)]=temp;
            i=parent(i);
        }
    }

    static void DeleteKey(int i){
        decreaseKey(i, Integer.MIN_VALUE);
        extractMin();
    }

     static void Display(){
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        MinHeap m=new MinHeap(15);
        m.insert(20);
        m.insert(15);
        m.insert(45);
        m.insert(30);
        m.insert(17);
        DeleteKey(2);
        Display();
    }
    
}
