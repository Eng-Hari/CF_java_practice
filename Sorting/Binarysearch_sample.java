package Sorting;

public class Binarysearch_sample {

    public static void main(String[] args) {

        int a[] = {1, 2, 5, 6, 7, 8, 9, 10, 15, 19};
        System.out.println(binary(5, 10, a));
    }

    public static int binary(int x, int n, int[] a) {
        int low = 0, high = n - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (a[mid] == x) {
                return mid;
            } else if (a[mid] > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

}
