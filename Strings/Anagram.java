package Strings;

public class Anagram {

    public static boolean areAnagrams(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }

        int[] freq = new int[26]; // only for lowercase a-z

        for (int i = 0; i < s1.length(); i++) {
            freq[s1.charAt(i) - 'a']++;
            freq[s2.charAt(i) - 'a']--;
        }

        for (int count : freq) {
            if (count != 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String s1 = "listen";
        String s2 = "silent";

        System.out.println("Are '" + s1 + "' and '" + s2 + "' anagrams? " + areAnagrams(s1, s2));

        String s3 = "rat";
        String s4 = "car";

        System.out.println("Are '" + s3 + "' and '" + s4 + "' anagrams? " + areAnagrams(s3, s4));
    }
}
