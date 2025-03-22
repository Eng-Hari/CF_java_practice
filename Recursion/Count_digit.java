package Recursion;

public class Count_digit {

    public static void main(String[] args) {

        System.out.println(count(53543));

    }

    static int count(int n) {
        if (n == 0) {
            return 0;
        }
        return 1 + count(n / 10);
    }
}
