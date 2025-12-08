package curiousfreeks_pracrice.Basic_Math;

public class Happy_Unhappy {

    public static void main(String[] args) {
        int n = 49;
        int ans = digit(n);

        System.out.println((ans == 1) ? "Happy No." : "Un Happy No.");
    }

    public static int digit(int n) {

        if (n == 1) {
            return 1;
        }
        if (n == 4) {
            return 0;
        }
        int pow = 0;

        // int m = n;
        while (n > 0) {
            int digit = n % 10;
            pow += digit * digit;
            n /= 10;
        }

        return digit(pow);
    }
}
