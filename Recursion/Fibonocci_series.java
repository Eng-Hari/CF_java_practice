package Recursion;

public class Fibonocci_series {

    public static void main(String[] args) {
        // fibnocci 0,1,1,2,3,5,8,13,21,34....
        int n = 10;
        for (int i = 0; i < n; i++) {
            System.out.println(fibno(i));
        }
    }

    public static int fibno(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return fibno(n - 1) + fibno(n - 2);
    }
}
