

class countDigits{

    static int count(int n){
        int res=0;
        while(n>0)
        {
            n=n/10;
            res++;
        }

        return res;
    }


    public static void main(String[] args) {
        int number=981086;
        System.out.println(count(number));
    }

}


