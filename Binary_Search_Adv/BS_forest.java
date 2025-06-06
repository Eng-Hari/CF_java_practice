package Binary_Search_Adv;

public class BS_forest {

    // Function to find the cutting height H
    // so that the total wood collected equals exactly k.
    // If not possible, return -1.
    public static int find_height(int tree[], int n, int k) {
        int low = 0;      // Minimum possible height to cut (cut at ground level)
        int high = 0;     // Maximum possible height to cut (max tree height)

        // Find the tallest tree height to set the upper boundary of binary search
        for (int height : tree) {
            if (height > high) {
                high = height;
            }
        }

        int ans = -1;  // Default answer if no exact match found

        // Binary search between low and high heights
        while (low <= high) {
            // Mid is the current guess for cutting height
            int mid = low + (high - low) / 2;
            long totalWood = 0;  // Total wood collected if cut at mid

            // Calculate total wood collected by cutting all trees at height mid
            for (int height : tree) {
                if (height > mid) {
                    totalWood += (height - mid);  // Wood collected from this tree
                }
            }

            if (totalWood == k) {
                // If we got exactly k wood, record this height as answer
                ans = mid;
                break;  // stop searching as we found exact answer
            } else if (totalWood > k) {
                // If collected wood is more than needed,
                // try to cut at a higher height to reduce wood collected
                low = mid + 1;
            } else {
                // If collected wood is less than needed,
                // cut at lower height to collect more wood
                high = mid - 1;
            }
        }

        return ans;  // Return the exact height or -1 if no solution
    }

    public static void main(String[] args) {
        int[] tree = {2, 3, 6, 2, 4};
        int n = tree.length;
        int k = 4;

        int height = find_height(tree, n, k);
        System.out.println("Cutting height: " + height);  // Expected output: 3
    }
}
