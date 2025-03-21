
public class Third_largest {

    public static void main(String[] args) {
        int a[] = {5, 6, 4, 7, 89, 2, 5, 6, 45};

        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int max3 = Integer.MIN_VALUE;

        for (int i = 0; i < a.length; i++) {
            if (a[i] > max1) {
                max3 = max2;
                max2 = max1;
                max1 = a[i];
            } else if (a[i] > max2) {
                max3 = max2;
                max2 = a[i];
            } else if (a[i] > max3) {
                max3 = a[i];
            }

        }
        System.out.println(max3);

    }
}
