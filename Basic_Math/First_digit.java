
public class First_digit {

    public static void main(String[] args) {
        int n = 3456;
        while (n > 0) {
            int fd = n % 10;
            n /= 10;
            if (n == 0) {
                System.out.println(fd);
            }
        }
    }

}
