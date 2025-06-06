package Recursion;

public class Fibnocii_series_memo {

    public static void main(String[] args) {
        int n = 10;
        int[] memo = new int[n + 1];
        for (int i = 0; i < n; i++) {
            System.out.println(fibno(i, memo));
        }
    }

    public static int fibno(int n, int[] memo) {

        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }

        if (memo[n] != 0) {
            return memo[n];
        }

        memo[n] = fibno(n - 1, memo) + fibno(n - 2, memo);

        return memo[n];
    }

}
