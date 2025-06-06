package Binary_Search_Adv;

public class Killing_spree {

    // Helper method to calculate how many days it takes to ship all packages
    // if the ship capacity is 'cap'.
    private int getdays(int[] weights, int cap) {
        int days = 1;  // Start with day 1
        int sum = 0;   // Current total weight loaded on the ship for the day

        // Iterate over each package weight
        for (int w : weights) {
            if (sum + w <= cap) {
                // If adding this package doesn't exceed capacity, add it to current load
                sum += w;
            } else {
                // Otherwise, increment the day count and start a new load with current package
                days++;
                sum = w;
            }
        }
        return days;  // Return total days required with capacity 'cap'
    }

    // Main method to find the minimum ship capacity to ship all packages within 'days'
    public int shipWithinDays(int[] weights, int days) {
        int low = 0;   // Minimum capacity possible (at least max package weight)
        int high = 0;  // Maximum capacity possible (sum of all package weights)

        // Calculate low and high boundaries for binary search
        for (int w : weights) {
            low = Math.max(low, w);  // Capacity must be at least as heavy as the heaviest package
            high += w;               // Total sum of all packages weights
        }

        int ans = high;  // Initialize answer with the highest possible capacity

        // Binary search to find the minimal capacity that ships within 'days'
        while (low <= high) {
            int mid = low + (high - low) / 2;       // Midpoint capacity to test
            int requiredDays = getdays(weights, mid);  // Days needed if capacity is mid

            if (requiredDays <= days) {
                // If we can ship in 'days' or less with this capacity,
                // try to find smaller capacity by moving 'high' down
                ans = mid;
                high = mid - 1;
            } else {
                // If more days are needed, increase capacity by moving 'low' up
                low = mid + 1;
            }
        }

        return ans;  // Return the minimal capacity found
    }

    public static void main(String[] args) {
        Killing_spree ks = new Killing_spree();

        int[] weights = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int days = 5;

        int minCapacity = ks.shipWithinDays(weights, days);
        System.out.println("Minimum ship capacity to ship within " + days + " days: " + minCapacity);
        // Expected output: 15
    }

}
