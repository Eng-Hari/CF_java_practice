// find the no. of divisiors

public class Divisior_3 {

    public static void main(String[] args) {
        int n = 36;
        int count = 0;
        for (int i = 1; i <= Math.sqrt(n); i++) {
            //cheack upto sqrt of n => 36 -> 6, 64 -> 8
            if (n % i == 0) { //cheach for divisior
                if (i % 3 == 0) { // cheack for divisable of 3
                    count++;
                }
                if ((n / i != i) && (n / i) % 3 == 0) {
                    // loop to cheach the divisior beyond the sqrt value and to avoid repeted value
                    count++;
                }
            }
        }
        System.out.println(count);

    }
}
// optimized approch for finding the divisiors and it divisable of 3

