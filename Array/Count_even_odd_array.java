
public class Count_even_odd_array {

    public static void main(String[] args) {
        int n = 6;
        int even = 0, odd = 0;
        int arr[] = {1, 2, 3, 4, 5, 6};
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        System.out.println("Even :" + even + " \n" + "Odd :" + odd);
    }
}
