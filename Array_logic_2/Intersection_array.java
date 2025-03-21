package Array_logic_2;

public class Intersection_array {

    public static void main(String[] args) {
        int a[] = {1, 2, 2, 1};
        int b[] = {2, 2};
        int n = a.length;
        int m = b.length;
        int res[] = new int[n + m];
        int k = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (a[i] == b[j]) {
                    int flag = 1;
                    for (int h = 0; h < k; h++) {
                        if (a[i] == res[h]) {
                            flag = 0;
                            break;
                        }
                    }
                    if (flag == 1) {
                        res[k++] = a[i];
                    }
                }
            }
        }
        for (int i = 0; i < k; i++) {
            System.out.println(res[i]);
        }
    }
}
