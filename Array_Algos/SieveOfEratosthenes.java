
// public class Sieve_of_eraostheness {
//     public static void main(String[] args) {
//         // to find prime using algoritham
//         int n = 200;
//         // int a[] = {0};
//         int a[] = new int[n + 1];
//         for (int i = 2; i <= Math.sqrt(n); i++) {
//             if (a[i] == 0) {
//                 for (int j = i * i; j <= n; j = j + i) {
//                     a[j] = 1;
//                 }
//             }
//         }
//         for (int i = 2; i <= n; i++) {
//             if (a[i] == 0) {
//                 System.out.println(i);
//             }
//         }
//     }
// }
public class SieveOfEratosthenes {

    public static void main(String[] args) {
        // To find prime numbers up to 'n' using the Sieve of Eratosthenes algorithm
        int n = 200;
        boolean isPrime[] = new boolean[n + 1];

        // Initialize all elements as true (prime)
        for (int i = 2; i <= n; i++) {
            isPrime[i] = true;
        }

        // Mark non-prime numbers
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= n; j += i) {
                    isPrime[j] = false; // Mark multiples of 'i' as non-prime
                }
            }
        }

        // Print all prime numbers
        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) {
                System.out.println(i);
            }
        }
    }
}
