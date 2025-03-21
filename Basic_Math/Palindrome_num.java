
public class Palindrome_num {

    public static void main(String[] args) {
        int num = 12321;
        int rev = 0;
        int original = num;
        while (num > 0) {
            int digit = num % 10;
            rev = rev * 10 + digit;
            num /= 10;
        }
        if (rev == original) {
            System.out.println("Palindrome");
        } else {
            System.out.println("not a palindrome");
        }
    }
}
