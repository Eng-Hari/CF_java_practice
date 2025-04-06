package Two_Pointer;

import java.util.Arrays;

public class Difference {

    public static void main(String[] args) {
        int arr[] = {5, 20, 3, 2, 5, 80};
        int target = 78;
        boolean found = difference(arr, target);
        System.out.println(found);
    }

    public static boolean difference(int arr[], int x) {

        Arrays.sort(arr);
        int i = 0, j = 1;

        while (i < arr.length && j < arr.length) {

            if (i != j && arr[j] - arr[i] == x) {
                return true;
            } else if (arr[j] - arr[i] < x) {
                j++;
            } else {
                i++;
            }

            if (i == j) {  // to avooid infinity loop while meet an long array 
                j++;
            }

        }

        return false;
    }

}
