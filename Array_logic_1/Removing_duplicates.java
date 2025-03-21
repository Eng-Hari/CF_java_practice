
public class Removing_duplicates {

    public static void main(String[] args) {
        int a[] = {1, 2, 2, 2, 3, 4, 5, 5, 6, 7, 8, 8, 9, 9, 9};
        int n = a.length;
        int j = 0;

        for (int i = 0; i < n - 1; i++) {
            if (a[i] != a[i + 1]) {
                a[j] = a[i];
                j++;
            }
            //a[j] = a[i - n];
        }
        a[j] = a[n - 1];
        j++;
        for (int i = 0; i < j; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
