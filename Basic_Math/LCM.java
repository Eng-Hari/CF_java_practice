
public class LCM {

    public static void main(String[] args) {
        int a = 12, b = 28;

        int gcd = findGCD(a, b);
        int lcm = (a * b) / gcd;

        System.out.println("LCM = " + lcm);
    }

    public static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
