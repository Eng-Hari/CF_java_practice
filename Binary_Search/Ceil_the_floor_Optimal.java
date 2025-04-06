package curiousfreeks_pracrice.Binary_Search;

import java.util.Arrays;

public class Ceil_the_floor_Optimal {

    public static void main(String[] args) {
        int x = 6;
        int[] arr = {4, 5, 7, 8, 9};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(sort(x, arr)));
    }

    static int[] sort(int x, int[] arr) {
        int n = arr.length;
        int floor = -1;
        int ceil = -1;

        int i = 0, j = n - 1;

        while (i <= j) {
            int mid = i + (j - i) / 2;

            if (arr[mid] == x) {
                ceil = arr[mid];
                break;
            } else if (arr[mid] > x) {
                ceil = arr[mid];
                j = mid - 1;
            } else {
                i = mid + 1;
            }
        }

        i = 0;
        j = n - 1;

        while (i <= j) {
            int mid = i + (j - i) / 2;
            if (arr[mid] == x) {
                floor = arr[mid];
                break;
            } else if (arr[mid] < x) {
                floor = arr[mid];
                i = mid + 1;
            } else {
                j = mid - 1;
            }
        }

        return new int[]{floor, ceil};

    }

}

// Time complexity  = o(n log n);
