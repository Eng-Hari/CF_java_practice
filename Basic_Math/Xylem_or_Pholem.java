package curiousfreeks_pracrice.Basic_Math;

public class Xylem_or_Pholem {

    public static void main(String[] args) {
        int n = 32436;
        int m = n;
        int ld = n % 10;
        n /= 10;

        int fd = 0;
        int mid = 0;

        while (n > 9) {

            int digit = n % 10;

            mid += digit;

            n /= 10;

        }
        fd = n % 10;
        int ans = ld + fd;
        System.out.println(ans == mid);
    }
}
