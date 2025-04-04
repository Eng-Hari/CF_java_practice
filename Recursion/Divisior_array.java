package Recursion;

public class Divisior_array {
// to find the divisor of n from 1 to n

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
