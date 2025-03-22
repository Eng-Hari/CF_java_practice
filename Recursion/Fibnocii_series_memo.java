package Recursion;

public class Fibnocii_series_memo {

    public static void main(String[] args) {
        int n = 5;
        int[] memo = new int[n + 1];
        System.out.println("The " + n + "th term of fibnocii series is : " + fibno(n, memo));
    }

    public static int fibno(int n, int[] memo) {

        if (memo[n] != 0) {
            return memo[n];
        }

        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }

        memo[n] = fibno(n - 1, memo) + fibno(n - 2, memo);

        return memo[n];
    }
}
