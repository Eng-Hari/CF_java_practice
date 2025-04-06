package Two_Pointer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Intersection_two_arrays {

    public static void main(String[] args) {
        int arr1[] = {1, 2, 4, 5, 6}, arr2[] = {2, 4, 5, 6, 8};
        List<Integer> result = intersection(arr1, arr2);
        System.out.println(result);
    }

    public static List<Integer> intersection(int arr1[], int arr2[]) {
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        List<Integer> intersect = new ArrayList<>();
        int i = 0, j = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] == arr2[j]) {
                if (intersect.isEmpty() || intersect.get(intersect.size() - 1) != arr1[i]) {
                    intersect.add(arr1[i]);
                }
                i++;
                j++;
            } else if (arr1[i] < arr2[j]) {
                i++;
            } else {
                j++;
            }
        }
        return intersect;
    }

}
