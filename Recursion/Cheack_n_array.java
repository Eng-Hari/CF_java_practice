package Recursion;

public class Cheack_n_array {

    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5};
        System.out.println(arr(a, 5, 0, 5));
    }

    public static int arr(int a[], int n, int i, int target) {
        if (i >= n) {
            return -1;
        }
        if (target == a[i]) {
            return i;
        } else {
            return arr(a, n, i + 1, target);
        }
    }
}
