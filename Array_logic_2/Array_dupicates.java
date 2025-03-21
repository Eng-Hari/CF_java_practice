package Array_logic_2;

import java.util.Arrays;

public class Array_dupicates {

    public static void main(String[] args) {
        int a[] = {1, 2, 3, 1, 2, 3};
        Arrays.sort(a);
        int n = a.length;
        int dup[] = new int[n];

        int j = 0;
        for (int i = 0; i < n - 1; i++) {
            if (a[i] == a[i + 1]) {
                if (j == 0 || dup[j - 1] != a[i]) {
                    dup[j] = a[i];
                    j++;
                }
            }
        }
        for (int i = 0; i < j; i++) {
            System.out.println(dup[i]);
        }

    }
}
