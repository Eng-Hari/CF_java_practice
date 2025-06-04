package Sliding_Window;

import java.util.HashMap;

public class Longest_K_unique_sunstring {

    public static int longestKSubstr(String s, int k) {
        int i = 0, j = 0, maxLen = -1;
        HashMap<Character, Integer> map = new HashMap<>();

        while (j < s.length()) {
            // Add character at j to map
            map.put(s.charAt(j), map.getOrDefault(s.charAt(j), 0) + 1);

            // If we have more than K unique chars, shrink window
            while (map.size() > k) {
                char leftChar = s.charAt(i);
                map.put(leftChar, map.get(leftChar) - 1);
                if (map.get(leftChar) == 0) {
                    map.remove(leftChar);
                }
                i++;
            }

            // If exactly K unique chars, update maxLen
            if (map.size() == k) {
                maxLen = Math.max(maxLen, j - i + 1);
            }

            j++;
        }

        return maxLen;
    }

    public static void main(String[] args) {
        String s = "aabacbebebe";
        int k = 3;
        System.out.println(longestKSubstr(s, k)); // Output: 7
    }
}
