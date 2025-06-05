package Strings;

import java.util.Arrays;

public class Longest_prefix {

    public static String longestCommonPrefix(String arr[]) {
        if (arr == null || arr.length == 0) {
            return "";
        }

        // Sort array
        Arrays.sort(arr);

        String first = arr[0];
        String last = arr[arr.length - 1];

        int index = -1;
        int len = Math.min(first.length(), last.length());

        for (int i = 0; i < len; i++) {
            if (first.charAt(i) != last.charAt(i)) {
                break;
            }
            index = i;
        }

        if (index == -1) {
            return "";
        } else {
            return first.substring(0, index + 1);
        }
    }

    // You can add a main method to test
    public static void main(String[] args) {
        String[] arr = {"flower", "flow", "flight"};
        System.out.println("Longest Common Prefix: " + longestCommonPrefix(arr));  // Output: "fl"

        String[] arr2 = {"dog", "racecar", "car"};
        System.out.println("Longest Common Prefix: " + longestCommonPrefix(arr2));  // Output: ""
    }
}
