package Binary_Search_Adv;

import java.util.Arrays;

public class Aggressive_cows {

    public static int aggressiveCows(int[] stalls, int k) {
        // Step 1: Sort the stalls to place cows greedily
        Arrays.sort(stalls);

        int low = 1; // Minimum possible distance
        int high = stalls[stalls.length - 1] - stalls[0]; // Maximum possible distance
        int result = 0;

        // Step 2: Binary Search on the minimum distance
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (canPlaceCows(stalls, k, mid)) {
                result = mid;     // Try for a larger minimum distance
                low = mid + 1;
            } else {
                high = mid - 1;   // Try a smaller distance
            }
        }

        return result;
    }

    // Helper method to check if cows can be placed with at least 'minDist' apart
    private static boolean canPlaceCows(int[] stalls, int k, int minDist) {
        int count = 1;
        int lastPos = stalls[0];

        for (int i = 1; i < stalls.length; i++) {
            if (stalls[i] - lastPos >= minDist) {
                count++;
                lastPos = stalls[i];
                if (count == k) {
                    return true;
                }
            }
        }

        return false;
    }

    // Main method for testing
    public static void main(String[] args) {
        int[] stalls = {1, 2, 8, 4, 9};
        int k = 3;

        int result = aggressiveCows(stalls, k);
        System.out.println("Largest minimum distance: " + result);
    }
}
