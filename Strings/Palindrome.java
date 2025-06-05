package Strings;

public class Palindrome {

    public static void main(String[] args) {
        String str = "malayalam";
        int i = 0, j = str.length() - 1;
        boolean palindrome = true;

        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                palindrome = false;
                break;
            }
            i++;
            j--;
        }

        if (palindrome) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
    }
}
