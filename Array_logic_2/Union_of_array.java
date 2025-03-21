package Array_logic_2;

public class Union_of_array {

    public static int unionarray(int x[], int res[], int k) {
        int y = x.length;
        // int count = 0;
        for (int i = 0; i < y; i++) {
            int flag = 1;
            for (int j = 0; j < k; j++) {
                if (x[i] == res[j]) {
                    flag = 0;
                    break;
                }
            }
            if (flag == 1) {
                res[k++] = x[i];

            }
        }
        return k;

    }

    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5};
        int b[] = {2, 3, 5, 5, 6, 7, 8};
        int n = a.length;
        int m = b.length;
        int res[] = new int[n + m];
        int k = 0;

        k = unionarray(a, res, k);
        k = unionarray(b, res, k);

        for (int i = 0; i < k; i++) {
            System.out.print(res[i] + " ");
        }
    }
}
