
public class Sum_of_fifth_power {

    public static void main(String[] args) {
        int n = 3, sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += (i * i * i * i * i);
        }
        System.out.println(sum);
    }
}
