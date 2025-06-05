package Strings;

public class Rotate_string {

    public static void main(String[] args) {
        String s = "abcde";
        String goal = "deabc";

        boolean isMatch = false;

        if (s.length() == goal.length()) {
            for (int i = 0; i < s.length(); i++) {
                String rotated = s.substring(i) + s.substring(0, i);
                if (rotated.equals(goal)) {
                    isMatch = true;
                    break;
                }
            }
        }

        System.out.println(isMatch); // true
    }
}
