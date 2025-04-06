package curiousfreeks_pracrice.Array_logic_1;

import java.util.Arrays;

public class Merge_sorted_array {

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;

        merge(nums1, m, nums2, n);

        System.out.println("Merged Array: " + Arrays.toString(nums1));
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;         // pointer at end of real elements in nums1
        int j = n - 1;         // pointer at end of nums2
        int k = m + n - 1;     // pointer at end of nums1's total capacity

        while (i >= 0 && j >= 0) {
            if (nums1[i] <= nums2[j]) {
                nums1[k--] = nums2[j--];
            } else {
                nums1[k--] = nums1[i--];
            }
        }

        // Copy remaining elements of nums2, if any
        while (j >= 0) {
            nums1[k--] = nums2[j--];
        }
    }

}
