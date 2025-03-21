
import java.util.Scanner;

public class Prime_no_till_n {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the value to print prime no. : ");
            int n = sc.nextInt();
            for (int i = 2; i <= n; i++) {
                int flag = 1;
                for (int j = 2; j <= i / 2; j++) {
                    if (i % j == 0) {
                        flag = 0;
                        break;
                    }
                }
                if (flag == 1) {
                    System.out.print(i + " ");
                }
            }
        }
    }
}
