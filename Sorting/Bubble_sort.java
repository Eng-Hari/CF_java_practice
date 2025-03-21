package Sorting;

public class Bubble_sort {

    public static void main(String[] args) {
        int n = 5;
        int a[] = {6, 5, 4, 2, 1};
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        for (int value : a) {
            System.out.print(value + " ");
        }

    }
}
