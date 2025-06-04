package Sliding_Window;

public class Max_sum_contigues_subarray {

// Kadane's Algorithm 
    public static void main(String[] args) {
        int[] a = {-2, 1, -3, 4, -1, 2, 1, -5, 4}; // Example input
        int n = a.length;

        int sumfirst = 0; // Tracks the sum of the current subarray
        int sumend = 0;   // Stores the maximum sum found so far

        for (int i = 0; i < n; i++) {
            // Add current element to the current subarray sum
            sumfirst = a[i] + sumfirst;

            // If current subarray sum becomes negative, reset it to 0
            if (sumfirst < 0) {
                sumfirst = 0;
            }

            // Update max sum if current subarray sum is greater
            if (sumend < sumfirst) {
                sumend = sumfirst;
            }
        }

        // Print the result
        System.out.println("Maximum Sum of Contiguous Subarray: " + sumend);
    }
}
