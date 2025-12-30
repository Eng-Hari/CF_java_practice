package Sorting;

import java.util.*;

public class Recursive_Insertion_sort {

    public static void main(String[] args) {
        int[] arr = {15, 9, 5, 12, 1};
        // System.out.println(sort(arr, arr.length));
        Insertion_sort_rec(arr, arr.length);
        System.out.println(Arrays.toString(arr));
    }

    public static void Insertion_sort_rec(int[] arr, int n) {
        if (n <= 1) {
            return;
        }

        Insertion_sort_rec(arr, n - 1);

        int key = arr[n - 1];
        int j = n - 2;
        while (j >= 0 && key < arr[j]) {
            arr[j + 1] = arr[j];
            j--;
        }
        arr[j + 1] = key;

    }
}
