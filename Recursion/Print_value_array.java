<<<<<<< HEAD
package Recursion;

public class Print_value_array {

    public static void main(String[] args) {

        int a[] = {1, 2, 3, 4, 5};
        arr(a, 5, 0);
    }

    public static void arr(int a[], int n, int i) {
        if (i >= n) {
            return;
        }
        System.out.println(a[i]);
        arr(a, n, i + 1);
    }
}
=======
package Recursion;

public class Print_value_array {

    public static void main(String[] args) {

        int a[] = {1, 2, 3, 4, 5};
        arr(a, 5, 0);
    }

    public static void arr(int a[], int n, int i) {
        if (i >= n) {
            return;
        }
        System.out.println(a[i]);
        arr(a, n, i + 1);
    }
}
>>>>>>> 1aa1f938fabb8589f1a790850df1e9d4ae1223f2
