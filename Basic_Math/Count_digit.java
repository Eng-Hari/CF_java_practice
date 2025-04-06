package Basic_Math;

public class Count_digit {

    public static void main(String[] args) {
        int num = 9879;
        int count = 0;
        while (num > 0) {
            num /= 10;
            count++;
        }
        System.out.print(count);
    }
}
