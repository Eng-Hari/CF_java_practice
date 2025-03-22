package Recursion;

public class Cheach_sorted_array {

    public static void main(String[] args) {
        int a[] = {2, 3, 7, 5, 6};
        System.out.println(arr(a, 5, 0));
    }

    static boolean arr(int a[], int n, int i) {
        if (i >= n - 1) {
            return true;
        }
        if (a[i] > a[i + 1]) {
            return false;
        }
        return arr(a, n, i + 1);
    }
}
