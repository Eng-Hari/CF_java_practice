
public class Rotate_array_kth {
//     //rotate array as per the k times
//     public static void main(String[] args) {
//         int a[] = {1, 2, 3, 4, 5, 6, 7};
//         int n = a.length;
//         int b[] = new int[n];
//         int k = 3, j = 0;
//         for (int i = n - k; i < n; i++) {
//             b[j] = a[i];
//             j++;
//         }
//         for (int i = 0; i < n - k; i++) {
//             b[j] = a[i];
//             j++;
//         }
//         for (int i = 0; i < n; i++) {
//             a[i] = b[i];
//         }
//         for (int value : a) {
//             System.out.print(value + " ");
//         }
//     }
// }
//public class Rotate_array_Kth {
// Inplace replacement method

    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        rotate(a, k);
        for (int value : a) {
            System.out.print(value + " ");
        }
    }

    public static void rotate(int[] a, int k) {
        int n = a.length;
        k = k % n;  // Handle cases where k > n

        // Step 1: Reverse the entire array
        reverse(a, 0, n - 1);

        // Step 2: Reverse the first k elements
        reverse(a, 0, k - 1);

        // Step 3: Reverse the remaining n - k elements
        reverse(a, k, n - 1);
    }

    public static void reverse(int[] a, int start, int end) {
        while (start < end) {
            int temp = a[start];
            a[start] = a[end];
            a[end] = temp;
            start++;
            end--;
        }
    }
}
