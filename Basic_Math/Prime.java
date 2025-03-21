
public class Prime {

    public static void main(String[] args) {
        int n = 10;
        boolean isprime = true;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                isprime = false;
                break;
            }
        }
        if (isprime) {
            System.out.println("Its a prime");
        } else {
            System.out.println("Its not a prime");
        }
    }

}
