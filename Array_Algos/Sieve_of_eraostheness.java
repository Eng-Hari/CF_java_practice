
public class Sieve_of_eraostheness {

    public static void main(String[] args) {
        // to find prime using algoritham
        int n = 200;
        // int a[] = {0};
        int a[] = new int[n + 1];
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (a[i] == 0) {
                for (int j = i * i; j <= n; j = j + i) {
                    a[j] = 1;
                }
            }
        }
        for (int i = 2; i <= n; i++) {
            if (a[i] == 0) {
                System.out.println(i);
            }
        }
    }
}
