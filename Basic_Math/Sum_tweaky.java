
public class Sum_tweaky {

    public static void main(String[] args) {
        int n = 5346;
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        System.out.println(sum);
    }
}
