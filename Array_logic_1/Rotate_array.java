
public class Rotate_array {

    public static void main(String[] args) {
        int a[] = {2, 3, 4, 5, 1};
        int temp = a[a.length - 1];
        for (int i = a.length - 1; i > 0; i--) {
            a[i] = a[i - 1];
        }
        a[0] = temp;
        for (int value : a) {
            System.out.print(value + " ");
        }
    }
}
