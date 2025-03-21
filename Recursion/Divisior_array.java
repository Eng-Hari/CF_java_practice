<<<<<<< HEAD
package Recursion;

public class Divisior_array {

    public static void main(String[] args) {
        divisior(6, 1);
    }

    static void divisior(int n, int i) {
        if (i > n) {
            return;
        }
        if (n % i == 0) {
            System.out.println(i);
        }

        divisior(n, i + 1);
    }

}
=======
package Recursion;

public class Divisior_array {

    public static void main(String[] args) {
        divisior(6, 1);
    }

    static void divisior(int n, int i) {
        if (i > n) {
            return;
        }
        if (n % i == 0) {
            System.out.println(i);
        }

        divisior(n, i + 1);
    }

}
>>>>>>> 1aa1f938fabb8589f1a790850df1e9d4ae1223f2
