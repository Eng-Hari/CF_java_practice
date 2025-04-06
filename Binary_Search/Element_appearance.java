package curiousfreeks_pracrice.Binary_Search;

import java.util.Arrays;

public class Element_appearance {

    public static void main(String[] args) {

        int arr[] = {1, 1, 2, 2, 3, 4, 4};
        System.out.println(accurence(arr));

    }

    public static int accurence(int[] arr) {
        int i = 0, j = arr.length - 1;
        Arrays.sort(arr);
        while (i < j) {
            int mid = i + (j - i) / 2;
            if (mid % 2 != 0) {
                mid--;
            }
            if (arr[mid] == arr[mid + 1]) {
                i = mid + 2;
            } else {
                j = mid;
            }
        }
        return arr[i];
    }

}
