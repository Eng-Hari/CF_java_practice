
public class Cheack_sorted {

    public static void main(String[] args) {
        int a[] = {10, 20, 30, 40, 50};
        boolean issorted = true;
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] > a[i + 1]) {
                issorted = false;
            }
        }
        if (issorted) {
            System.out.println("true");
        } else {
            System.out.println("False");
        }
    }
}
