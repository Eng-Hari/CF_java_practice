package curiousfreeks_pracrice.Binary_Search;

import java.util.Arrays;

public class Missing_no {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 8};
        Arrays.sort(arr);
        int ans = missingelement(arr);
        System.out.println("Missing no. " + ans);
    }

    public static int missingelement(int[] arr) {
        int n = arr.length;
        int i = 0, j = n - 1;

        while (i <= j) {
            int mid = i + (j - i) / 2;

            if (arr[mid] == mid + 1) {
                i = mid + 1;
            } else {
                j = mid - 1;
            }

        }
        return i + 1;
    }
}
