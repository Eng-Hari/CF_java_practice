// count the prime no.

import java.util.Scanner;

public class Primeee_here {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the value for n : ");
            int n = sc.nextInt();

            int count = 0;
            for (int i = 2; i <= n; i++) {
                boolean isprime = true;
                for (int j = 2; j <= i / 2; j++) {
                    if (i % j == 0) {
                        isprime = false;
                        break;
                    }
                }
                if (isprime) {
                    count++;
                }

            }
            System.out.println(count);
        }
    }
}
