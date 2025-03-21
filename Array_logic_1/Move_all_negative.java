
import java.util.*;

public class Move_all_negative {

    public static void main(String[] args) {
        int a[] = {1, -1, 2, 3, -5, 6, 7, -9, 8, -12};
// use list fot solving this problem
        List<Integer> neg = new ArrayList<>();
        List<Integer> pos = new ArrayList<>();
        for (int num : a) {
            if (num > 0) {
                pos.add(num);
            } else {
                neg.add(num);
            }
        }
        int j = 0;
        for (int num : pos) {
            a[j] = num;
            j++;
        }
        for (int num : neg) {
            a[j] = num;
            j++;
        }
        System.out.println(Arrays.toString(a));

    }
}
