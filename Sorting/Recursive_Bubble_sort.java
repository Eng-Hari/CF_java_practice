package Sorting;

import java.util.*;

public class Recursive_Bubble_sort {

    public static void main(String[] args) {
        int[] arr = {15, 9, 4, 5, 1};
        sort(arr, arr.length);
        System.out.println(Arrays.toString(arr));

    }

    public static void sort(int[] arr, int n) {
        if (n == 1) {
            return;
        }

        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                int temp = arr[i + 1];
                arr[i + 1] = arr[i];
                arr[i] = temp;
            }
        }
        sort(arr, n - 1);
    }
}
