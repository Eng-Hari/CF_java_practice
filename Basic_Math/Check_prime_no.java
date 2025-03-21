
public class Check_prime_no {

    public static void main(String[] args) {

        int n = 10;  // Change this value to test other numbers
        boolean isPrime = true;

        if (n <= 1) {
            System.out.println("Invalid input!");
            return;
        }

        if (n == 2) {
            System.out.println("It's a prime");
            return;
        }
        for (int j = 2; j <= Math.sqrt(n); j += 2) {
            if (n % j == 0) {
                isPrime = false;
                break;
            }
        }

        System.out.println(isPrime ? "It's a prime" : "It's not a prime");
    }
}
