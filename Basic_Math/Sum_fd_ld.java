
public class Sum_fd_ld {

    public static void main(String[] args) {
        int n = 12345;
        if (n < 10) {
            System.out.println(n);//cheak no. for 2 digit
        }
        int ld = n % 10; //assign the last digit of n to ld
        int fd = 0; //declare fd before loop for peinting later
        while (n > 0) {
            fd = n % 10;
            n /= 10;
        }
        System.out.println(ld + fd);
    }
}
