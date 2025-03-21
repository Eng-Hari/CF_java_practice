
import java.util.Arrays;

public class Cheach_equals {

    public static void main(String[] args) {
        int a[] = {1, 2, 5, 4, 0};
        int b[] = {2, 4, 5, 0, 1};

        if (a.length != b.length) {
            System.out.println("false");
        }
        Arrays.sort(a);
        Arrays.sort(b);
        if (Arrays.equals(a, b)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
