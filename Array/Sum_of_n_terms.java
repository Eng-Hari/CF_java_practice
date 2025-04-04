
public class Sum_of_n_terms {
//1^3+2^3+3^3+4^3+5^3 = 225

    public static void main(String[] args) {
        int n = 5, sum = 0;
        for (int i = 1; i <= n; i++) {
            //sum += i * i * i;
            sum += (double) Math.pow(i, 3);
        }
        System.err.println(sum);
    }
}
