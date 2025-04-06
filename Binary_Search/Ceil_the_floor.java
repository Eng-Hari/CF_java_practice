package curiousfreeks_pracrice.Binary_Search;

import java.util.Arrays;

public class Ceil_the_floor {

    public static void main(String[] args) {
        int x = 3;
        int[] arr = {4, 5, 6, 8, 9};
        System.out.println(Arrays.toString(sort(x, arr)));

    }

    static int[] sort(int x, int[] arr) {
        int n = arr.length;
        int floor = -1;
        int ceil = -1;
        Arrays.sort(arr);
        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                return new int[]{x, x};
            } else if (arr[i] < x) {
                floor = arr[i];
            } else if (arr[i] > x) {
                ceil = arr[i];
                break;
            }
        }
        return new int[]{floor, ceil};
    }

}


// Time complexity  = o(n);
