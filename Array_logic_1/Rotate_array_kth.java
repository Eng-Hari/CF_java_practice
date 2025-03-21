
public class Rotate_array_kth {

    //rotate array as per the k times
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5, 6, 7};
        int n = a.length;
        int b[] = new int[n];
        int k = 3, j = 0;

        for (int i = n - k; i < n; i++) {
            b[j] = a[i];
            j++;
        }
        for (int i = 0; i < n - k; i++) {
            b[j] = a[i];
            j++;
        }
        for (int i = 0; i < n; i++) {
            a[i] = b[i];
        }
        for (int value : a) {
            System.out.print(value + " ");
        }

    }
}
