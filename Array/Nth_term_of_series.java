
public class Nth_term_of_series {

    public static void main(String[] args) {
        // question will be 1,3,6,10,15,21....
        // here to find the nth value for that we have to find
        // difference between each eement
        //1 3 6 10 15 21...
        //1 2 3 4  5  6...
        // add i to the numer series from 0 to n
        int sum = 0;
        int n = 3;
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }
        System.out.println(sum);
    }
}
