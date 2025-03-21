
public class Special_series {

    public static void main(String[] args) {
        int n = 5;
        int sum = 0, seriesterm = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
            seriesterm += (sum);
        }
        System.out.println(seriesterm);
    }
}
