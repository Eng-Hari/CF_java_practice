
public class Ass_0s1s2s {
    //Dutch national flag algorithm

    public static void main(String[] args) {
        int a[] = {1, 0, 2, 1, 0, 2, 1, 2, 0};
        sortarray(a);
        for (int value : a) {
            System.out.print(value + " ");
        }

    }

    public static void sortarray(int a[]) {
        int low = 0, mid = 0, high = a.length - 1;
        while (mid <= high) {
            switch (a[mid]) {
                case 0 -> {
                    swap(a, low, mid);
                    low++;
                    mid++;
                }
                case 1 ->
                    mid++;
                case 2 -> {
                    swap(a, mid, high);
                    high--;
                }
            }

        }
    }

    public static void swap(int a[], int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

}
