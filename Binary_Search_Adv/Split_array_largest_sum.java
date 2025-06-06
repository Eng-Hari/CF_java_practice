package Binary_Search_Adv;

public class Split_array_largest_sum {

    public static int splitArray(int[] nums, int k) {
        int low = getMax(nums);
        int high = getSum(nums);
        int result = high;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (canSplit(nums, k, mid)) {
                result = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return result;
    }

    private static boolean canSplit(int[] nums, int k, int maxSum) {
        int count = 1;
        int currentSum = 0;

        for (int num : nums) {
            if (currentSum + num > maxSum) {
                count++;
                currentSum = num;
                if (count > k) {
                    return false;
                }
            } else {
                currentSum += num;
            }
        }

        return true;
    }

    private static int getMax(int[] nums) {
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            max = Math.max(max, num);
        }
        return max;
    }

    private static int getSum(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        return sum;
    }

    // Main method for testing
    public static void main(String[] args) {
        int[] nums = {7, 2, 5, 10, 8};
        int k = 2;

        int result = splitArray(nums, k);
        System.out.println("Minimum largest sum after split: " + result);
    }
}
