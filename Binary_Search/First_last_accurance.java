package curiousfreeks_pracrice.Binary_Search;

import java.util.Arrays;

public class First_last_accurance {

    public static void main(String[] args) {

        int[] arr = {3, 4, 4, 4, 4, 6, 7, 8};
        int x = 4;
        int[] result = findFirstandLast(arr, x);
        System.out.println(Arrays.toString(result));
    }

    public static int[] findFirstandLast(int[] arr, int x) {
        int first = binarySearch(arr, x, true);
        int last = binarySearch(arr, x, false);
        return new int[]{first, last};
    }

    public static int binarySearch(int[] arr, int x, boolean first) {
        int i = 0, j = arr.length - 1, ans = -1;

        while (i <= j) {
            int mid = i + (j - i) / 2;

            if (arr[mid] == x) {
                ans = mid;
                if (first) {
                    j = mid - 1;
                } else {
                    i = mid + 1;
                }
            } else if (arr[mid] < x) {
                i = mid + 1;
            } else {
                j = mid - 1;
            }
        }
        return ans;
    }

}
