
public class Factorial_zeros_count {

    public static void main(String[] args) {
        int n = 15;
        int fact = 1;
        int count = 0;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        while (fact > 0) {
            int zero = fact % 10;
            if (zero == 0) {
                count++;
            }
            fact /= 10;
        }
        System.out.println("The no. of zeros are :" + count);
    }
}
