package Sliding_Window;

public class Max_subarray_K {

    public static void main(String[] args) {
        int[] a = {2, 1, 5, 1, 3, 2}; // Input array
        int n = a.length;            // Length of array
        int k = 3;                   // Window size (subarray size)

        int i = 0, j = 0;            // i = start of window, j = end of window
        int sum = 0;                 // To store current window sum
        int maxSum = 0;              // To track maximum sum found so far

        // Sliding window loop
        while (j < n) {
            // If current window size is less than k, just expand the window
            if (j - i + 1 < k) {
                sum += a[j];  // Add current element to sum
                j++;          // Expand window by moving 'j' to right
            } // If current window size is exactly k
            else if (j - i + 1 == k) {
                sum += a[j];  // Add current element to sum

                // Update maxSum if current sum is greater
                maxSum = Math.max(maxSum, sum);

                // Slide the window: remove the starting element
                sum -= a[i];
                i++;  // Move start pointer forward
                j++;  // Move end pointer forward
            }
        }

        // Print the result
        System.out.println("Maximum sum of subarray of size " + k + " is: " + maxSum);
    }
}
