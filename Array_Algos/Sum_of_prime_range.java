
import java.util.Scanner;

public class Sum_of_prime_range {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the range of arrar : ");
            int n = sc.nextInt();
            System.out.println("ENter the value for rage L and R : ");
            int L = sc.nextInt();
            int R = sc.nextInt();

            //validate L and R
            if (L < 2) {
                L = 2;
                // if L=1  => 1 is not prime so we start from 2 to n
            }

            if (R > n) {
                R = n;
                // while n=10 but R=11 => R>n => we set R as nth value R will be 10 not 11
            }

            //int n=30;
            boolean[] isprime = new boolean[n + 1];

            for (int i = 2; i <= n; i++) {
                isprime[i] = true;
            }
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (isprime[i]) {
                    for (int j = i * i; j <= n; j += i) {
                        isprime[j] = false;
                    }
                }
            }
            int sum = 0;
            for (int i = L; i <= R; i++) {

                if (isprime[i]) {
                    sum += i;
                    // System.out.println(i);
                }

            }
            System.out.println(sum);
        }
    }
}
