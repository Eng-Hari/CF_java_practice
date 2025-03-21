
public class Perfect_no {

    public static void main(String[] args) {
        int n = 36, sum = 1;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                sum = sum + i;
                if (n / i != i) {
                    sum = sum + (n / i);
                }
            }
        }
        if (sum == n) {
            System.out.println("Perfect no."); 
        }else {
            System.out.println("its not a perfect no.");
        }
    }
}
