
public class Sum_of_n_terms {

    public static void main(String[] args) {
        int n = 5, sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i * i * i;
        }
        System.err.println(sum);
    }
}
