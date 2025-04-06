package Two_Pointer;

import java.util.ArrayList;
import java.util.List;

public class Union_two_arrays {

    public static void main(String[] args) {
        int arr1[] = {1, 2, 3, 4, 5}, arr2[] = {1, 2, 3, 6, 7};
        List<Integer> result = unionarray(arr1, arr2);
        System.out.println(result);
    }

    public static List<Integer> unionarray(int arr1[], int arr2[]) {

        List<Integer> union = new ArrayList<>();

        int i = 0, j = 0;
        int last = Integer.MIN_VALUE;
        while (i < arr1.length && j < arr1.length) {

            if (arr1[i] == arr2[j]) {
                if (arr1[i] != last) {
                    union.add(arr1[i]);
                    last = arr1[i];
                }
                i++;
                j++;
            } else if (arr1[i] < arr2[j]) {
                if (arr1[i] != last) {
                    union.add(arr1[i]);
                    last = arr1[i];
                }
                i++;
            } else {
                if (arr2[j] != last) {
                    union.add(arr2[j]);
                    last = arr2[j];
                }
                j++;
            }
        }

        while (i < arr1.length) {
            if (arr1[i] != last) {
                union.add(arr1[i]);
                last = arr1[i];
            }
            i++;
        }

        while (j < arr2.length) {
            if (arr2[j] != last) {
                union.add(arr2[j]);
                last = arr2[j];
            }
            j++;
        }
        return union;
    }

}
