package Recursion;

public class Factorial {

    public static void main(String[] args) {

        System.out.println("THe factorial of n is : " + facto(5));
    }

    static int facto(int n) {
        if (n == 0) {
            return 1;
        } else if (n == 1) {
            return 1;
        }
        return n * facto(n - 1);
    }
}
