<<<<<<< HEAD
package Recursion;

public class Sum_of_array {

    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5};
        System.out.println(arr(a, 5, 0));
    }

    public static int arr(int a[], int n, int i) {
        if (i >= n) {
            return 0;
        }
        return a[i] + arr(a, n, i + 1);
    }
}
=======
package Recursion;

public class Sum_of_array {

    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5};
        System.out.println(arr(a, 5, 0));
    }

    public static int arr(int a[], int n, int i) {
        if (i >= n) {
            return 0;
        }
        return a[i] + arr(a, n, i + 1);
    }
}
>>>>>>> 1aa1f938fabb8589f1a790850df1e9d4ae1223f2
