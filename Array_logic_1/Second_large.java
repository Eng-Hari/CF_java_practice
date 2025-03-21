//package Array_logic_1.java;

public class Second_large {

    public static void main(String[] args) {
        int a[] = {5, 4, 6, 8, 2};
        int max = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }

        for (int i = 0; i < a.length; i++) {
            if (a[i] > max2 && a[i] != max) {
                max2 = a[i];
            }
        }
        System.out.println(max2);
    }
}
