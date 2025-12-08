package Sorting;

import java.util.Arrays;
public class MergeSortExample {

    public static void main(String[] args) {

        int[] arr = {15, 2, 5, 11, 12, 1};

        System.out.println("Before sort:");
        printArray(arr);

        mergeSort(arr, 0, arr.length - 1);

        System.out.println("After sort:");
        printArray(arr);
    }

    // 🔹 Main mergeSort function (Divide)
    public static void mergeSort(int[] arr, int left, int right) {
        if (left >= right) {
            return; // single element (already sorted)
        }

        int mid = left + (right - left) / 2;

        // Sort left half
        mergeSort(arr, left, mid);
        // Sort right half
        mergeSort(arr, mid + 1, right);

        // Merge the two sorted halves
        merge(arr, left, mid, right);
    }

    // 🔹 Merge function (Conquer + Combine)
    public static void merge(int[] arr, int left, int mid, int right) {
        // Sizes of two subarrays
        int n1 = mid - left + 1;
        int n2 = right - mid;

        // Temp arrays
        int[] L = new int[n1];
        int[] R = new int[n2];

        // Copy data to temp arrays
        for (int i = 0; i < n1; i++) {
            L[i] = arr[left + i];
        }
        for (int j = 0; j < n2; j++) {
            R[j] = arr[mid + 1 + j];
        }

        // Merge temp arrays back to arr[l..r]
        int i = 0;    // index for L
        int j = 0;    // index for R
        int k = left; // index for main arr

        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements of L[], if any
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        // Copy remaining elements of R[], if any
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    // Utility to print array
    public static void printArray(int[] arr) {
        for (int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();
    }
}
