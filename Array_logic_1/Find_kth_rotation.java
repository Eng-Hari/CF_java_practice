
public class Find_kth_rotation {

    public static void main(String[] args) {
        int a[] = {4, 5, 1, 2, 3};
        int x = -1;
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] > a[i + 1]) {
                x = i;
                break;
            }
        }
        if (x != -1) {
            System.out.println("The array rotate by :" + (x + 1));
        } else {
            System.out.println("No rotation needed");
        }
    }
}
