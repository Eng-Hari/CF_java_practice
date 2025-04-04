package Sorting;

import java.util.Arrays;

public class Merge_sort {

    public static void main(String[] args) {
        int arr[] = {11, 13, 12, 2, 3, 5};
        System.out.println("Original Array  : " + Arrays.toString(arr));
        mergesort(arr, 0, arr.length - 1);
        System.out.println("Sorted Array : " + Arrays.toString(arr));

    }

    static void mergesort(int[] arr, int left, int right) {
        if (left < right) { // base case condition

            int mid = left + (right - left) / 2;

            mergesort(arr, left, mid);
            mergesort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }

    static void merge(int[] arr, int left, int mid, int right) {

        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] leftarr = new int[n1];
        int[] rightarr = new int[n2];

        for (int i = 0; i < n1; i++) {
            leftarr[i] = arr[left + i];
        }
        for (int j = 0; j < n2; j++) {
            rightarr[j] = arr[mid + 1 + j];
        }

        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2) {
            if (leftarr[i] <= rightarr[j]) {
                arr[k++] = leftarr[i++];

            } else {
                arr[k++] = rightarr[j++];

            }
        }

        while (i < n1) {
            arr[k++] = leftarr[i++];
        }
        while (j < n2) {
            arr[k++] = rightarr[j++];
        }
    }

}
