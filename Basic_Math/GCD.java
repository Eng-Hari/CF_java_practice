
import java.util.Scanner;

public class GCD {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the value for a :");
            int a = sc.nextInt();
            System.out.println("Enter the value for b :");
            int b = sc.nextInt();
            int gcd = 1;

            
            for (int i = 1; i <= Math.min(a, b); i++) { // user to find mim no. abong two no.
                if ((a % i == 0) && (b % i == 0)) {     // getting commom divisior
                    gcd = i;
                }
            }
            System.out.println(gcd);
        }
    }
}
