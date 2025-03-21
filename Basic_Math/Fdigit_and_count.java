//first  digit of no. and count

public class Fdigit_and_count {

    public static void main(String[] args) {
        int n = 234234;
        int count = 0;
        int num = 0;
        while (n > 0) {
            num = n % 10;
            count++;
            n /= 10;
        }
        System.out.println("The first digit is : " + num);
        System.out.println("THe total no. of digits : " + count);
    }
}
