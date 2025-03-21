<<<<<<< HEAD
package Recursion;

public class Factorial {

    public static void main(String[] args) {

        System.out.println("THe factorial of n is : " + facto(5));
    }

    static int facto(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }
        return n * facto(n - 1);
    }
}
=======
package Recursion;

public class Factorial {

    public static void main(String[] args) {

        System.out.println("THe factorial of n is : " + facto(5));
    }

    static int facto(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }
        return n * facto(n - 1);
    }
}
>>>>>>> 1aa1f938fabb8589f1a790850df1e9d4ae1223f2
