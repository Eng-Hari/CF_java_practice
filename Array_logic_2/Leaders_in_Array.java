package Array_logic_2;

public class Leaders_in_Array {

    public static void main(String[] args) {

        int arr[] = {16, 17, 4, 3, 5, 2};
        int n = arr.length;
        int result[] = new int[n];

        int max = arr[n - 1];
        int j = 0;
        result[j++] = max;

        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] >= max) {
                max = arr[i];
                result[j++] = max;
            }

        }

        for (int i = j - 1; i >= 0; i--) {
            System.out.print(result[i] + " ");
        }

    }
}
