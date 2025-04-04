package Recursion;

public class Sum_of_digit {

    public static void main(String[] args) {

        System.out.println(sum(342));
    }

    public static int sum(int n) {
        if (n == 0) {
            return 0;
        }

        return (n % 10) + sum(n / 10);
    }
}
