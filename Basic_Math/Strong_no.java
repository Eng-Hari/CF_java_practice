
public class Strong_no {

    public static void main(String[] args) {
        int n = 145;

        if (n == digit(n)) {

            System.out.println(n + " Strong");

        } else {
            System.out.println(n + " Not Strong");
        }

    }

    public static int digit(int n) {
        int ans = 0;
        while (n > 0) {
            ans += fact(n % 10);
            n /= 10;
        }
        return ans;
    }

    public static int fact(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}
