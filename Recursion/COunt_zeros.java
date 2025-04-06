package Recursion;

public class COunt_zeros {

    public static void main(String[] args) {
        // int n = 2030;
        System.out.println(countzero(2030));
    }

    public static int countzero(int n) {
        if (n % 10 == n) {  // condition to cheack n is single digit
            if (n % 10 == 0) {
                return 1;
            } else {
                return 0;
            }
        }

        if (n % 10 == 0) {
            return 1 + countzero(n / 10);
        } else {
            return countzero(n / 10);
        }

    }
}
