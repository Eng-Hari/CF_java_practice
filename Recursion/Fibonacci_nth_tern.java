<<<<<<< HEAD
package Recursion;

public class Fibonacci_nth_tern {

    public static void main(String[] args) {
        int n = 10;
        System.out.println("The nth term of fibono : " + fibono(n));
    }

    public static int fibono(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return fibono(n - 1) + fibono(n - 2);
    }
}
=======
package Recursion;

public class Fibonacci_nth_tern {

    public static void main(String[] args) {
        int n = 10;
        System.out.println("The nth term of fibono : " + fibono(n));
    }

    public static int fibono(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return fibono(n - 1) + fibono(n - 2);
    }
}
>>>>>>> 1aa1f938fabb8589f1a790850df1e9d4ae1223f2
