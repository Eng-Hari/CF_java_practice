
public class Kth_digit {

    public static void main(String[] args) {
        int a = 5, b = 2, k = 2;
        long power = (long) Math.pow(a, b); // finds the 5^2 = 25
        //System.out.print(power);
        int i = 1;
        while (power > 0) {
            long ans = power % 10; // pick the last digit and store it to ans -> 5
            if (k == i) { // (k=2 == i=1) loop not proceed
                System.out.println(ans);
                break;//prevent from running overtime
            }
            i++; // i=1 incremented to 2
            power = power / 10; // eliminate the last digit of power 25 -> 2

        }

    }

}
