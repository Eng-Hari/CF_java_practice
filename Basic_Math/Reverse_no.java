
public class Reverse_no {

    public static void main(String[] args) {
        int num = 325345;
        while (num > 0) {
            int digit = num % 10;
            System.out.print(digit);
            num /= 10;
        }
    }
}
