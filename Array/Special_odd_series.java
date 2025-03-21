
public class Special_odd_series {

    public static void main(String[] args) {
        int n = 5;
        int sum = 0, specialterm = 0;
        for (int i = 1; i <= (2 * n - 1); i += 2) {
            // to find the odd number the logic formula is (2n-1)
            // the increment is to add the value to i by 2 -> 1,3,5,7,9...
            sum += i;   //summ of the no. upto n
            specialterm += sum;
            // sum the value with each add no.
            // 1 + (1+3) + (1+3+5) + (1+3+5+7)....
        }
        System.out.println(specialterm);
    }
}
