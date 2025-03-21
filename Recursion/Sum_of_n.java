<<<<<<< HEAD
package Recursion;

public class Sum_of_n {

    public static void main(String[] args) {
        int n = 5;
        System.out.println(sum(5));
    }

    public static int sum(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sum(n - 1);
    }
}
=======
package Recursion;

public class Sum_of_n {

    public static void main(String[] args) {
        int n = 5;
        System.out.println(sum(5));
    }

    public static int sum(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sum(n - 1);
    }
}
>>>>>>> 1aa1f938fabb8589f1a790850df1e9d4ae1223f2
