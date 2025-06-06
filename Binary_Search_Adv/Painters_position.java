package Binary_Search_Adv;

public class Painters_position {

    public static int minTime(int[] arr, int k) {
        int low = getMax(arr);
        int high = getSum(arr);
        int result = high;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (canPaint(arr, k, mid)) {
                result = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return result;
    }

    private static boolean canPaint(int[] arr, int k, int maxTime) {
        int painters = 1;
        int currentSum = 0;

        for (int len : arr) {
            if (currentSum + len > maxTime) {
                painters++;
                currentSum = len;

                if (painters > k) {
                    return false;
                }
            } else {
                currentSum += len;
            }
        }

        return true;
    }

    private static int getMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int num : arr) {
            max = Math.max(max, num);
        }
        return max;
    }

    private static int getSum(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] boards = {10, 20, 30, 40};
        int k = 2; // number of painters

        int result = minTime(boards, k);
        System.out.println("Minimum time to paint all boards: " + result);
    }
}
