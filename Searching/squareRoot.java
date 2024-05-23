
public class squareRoot {

    static int findSquareRoot(int x) {
        int low = 1, high = x, mid, res;

        while (low <= high) {
            mid = (low + high) / 2;
            res = mid * mid;
            if (res == x) {
                return mid; 
            }else if (res < x) {
                low = mid + 1; 
            }else {
                high = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        System.out.println(findSquareRoot(12));
    }

}
