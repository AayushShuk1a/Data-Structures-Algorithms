
public class MergeSort {

    static void merge(int arr[], int l, int m, int r) {

        int leftSize = m - l + 1;
        int rightSize = r - m;

        int[] L = new int[leftSize];
        int[] R = new int[rightSize];

        for (int i = 0; i < leftSize; i++) {
            L[i] = arr[l + i];
        }

        for (int i = 0; i < rightSize; i++) {
            R[i] = arr[m + i + 1];
        }

        int i = 0, j = 0;
        int k = l;

        while (i < leftSize && j < rightSize) {

            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }

            k++;

        }

        while (i < leftSize) {
            arr[k] = L[i];
            k++;
            i++;
        }

        while (j < rightSize) {
            arr[k] = R[j];
            j++;
            k++;
        }

    }

    static void sort(int arr[], int l, int r) {
        if (r > l) {
            int m = l + (r - l) / 2;
            sort(arr, l, m);
            sort(arr, m + 1, r);
            merge(arr, l, m, r);
        }
    }

    public static void main(String[] args) {
        int arr[] = {23, 12, 34, 22, 55, 11, 45, 76};

        sort(arr, 0, arr.length - 1);

        for (int i : arr) {
            System.out.print(i + " ");
        }

    }

}
