package Sliding_Window;

public class Longest_subarray {

    public static void main(String[] args) {
        int[] a = {1, 2, 1, 1, 1}; // sample input
        int k = 3;

        int n = a.length;
        int i = 0, j = 0;
        int sum = 0, maxLen = 0;

        while (j < n) {
            sum += a[j];

            if (sum < k) {
                j++;
            } else if (sum > k) {
                while (sum > k) {
                    sum -= a[i];
                    i++;
                }
            }

            if (sum == k) {
                maxLen = Math.max(maxLen, j - i + 1);
            }

            j++;
        }

        System.out.println("Length of longest subarray with sum " + k + " is: " + maxLen);
    }
}
