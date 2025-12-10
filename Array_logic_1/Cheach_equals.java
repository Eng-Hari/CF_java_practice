
import java.util.Arrays;

public class Cheach_equals {

    public static void main(String[] args) {
        int a[] = {1, 2, 5, 4, 0};
        int b[] = {2, 4, 5, 0, 1};

        if (a.length != b.length) {
            System.out.println("false");
            return;
        }
        Arrays.sort(a);
        Arrays.sort(b);
        // if (Arrays.equals(a, b)) {
        //     System.out.println("true");
        // } else {
        //     System.out.println("false");
        // }
        System.out.println(Arrays.equals(a, b));
    }
//or
private static boolean check(int[] a, int[] b) {
        if (a.length != b.length) {
            return false;
        }

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : a) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (int num : b) {
            if (!map.containsKey(num)) {
                return false;
            }

            map.put(num, map.get(num) - 1);

            if (map.get(num) == 0) {
                map.remove(num);
            }
        }
        return map.isEmpty();

    }

}


