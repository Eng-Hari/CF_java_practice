package Binary_Search_Adv;

public class Capacity_shipping_packages {

    // Helper method to calculate how many days
    // it would take to ship all packages if the ship's capacity is 'cap'
    private int getdays(int[] weights, int cap) {
        int days = 1;  // Start counting from day 1
        int sum = 0;   // Current weight loaded on the ship for the day

        // Loop through each package weight
        for (int w : weights) {
            if (sum + w <= cap) {
                // If adding this package doesn't exceed capacity,
                // add it to current day's load
                sum += w;
            } else {
                // Otherwise, we need another day,
                // so increase day count and reset sum to current package
                days++;
                sum = w;
            }
        }
        return days;  // Return how many days needed with capacity 'cap'
    }

    // Main method to find the minimum ship capacity
    // to ship all packages within 'days' days
    public int shipWithinDays(int[] weights, int days) {
        int low = 0;   // Minimum possible capacity = max single package weight
        int high = 0;  // Maximum possible capacity = sum of all package weights

        // Find boundaries for binary search
        for (int w : weights) {
            low = Math.max(low, w);  // At least the heaviest package weight
            high += w;               // Sum of all weights for maximum capacity
        }

        int ans = high;  // Start answer with the max capacity possible

        // Binary search between low and high to find minimum capacity
        while (low <= high) {
            int mid = low + (high - low) / 2;  // Mid capacity to test
            int requiredDays = getdays(weights, mid);  // Days needed for capacity mid

            if (requiredDays <= days) {
                // If we can ship within the required days,
                // try to find a smaller capacity
                ans = mid;
                high = mid - 1;
            } else {
                // If it takes more days, increase capacity
                low = mid + 1;
            }
        }

        return ans;  // Return the smallest capacity found
    }

    // Main method for local testing
    public static void main(String[] args) {
        Capacity_shipping_packages obj = new Capacity_shipping_packages();

        int[] weights = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int days = 5;

        int minCapacity = obj.shipWithinDays(weights, days);
        System.out.println("Minimum ship capacity to ship within " + days + " days: " + minCapacity);
        // Expected output: 15
    }
}
