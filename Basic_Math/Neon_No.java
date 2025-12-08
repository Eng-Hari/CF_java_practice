package curiousfreeks_pracrice.Basic_Math;

public class Neon_No {

    public static void main(String[] args) {
        int num = 11;
        int ans = pow(num);

        System.out.println((ans == num) ? "Neon" : "Not a Neon");

    }

    public static int pow(int n) {

        int res = (int) Math.pow(n, 2);

        return digit(res);
    }

    public static int digit(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;

        }

        return sum;
    }

}
