package Binary_Search_Adv;

public class Kth_rotation {

    public static int findMin(int[] arr) {
        int left = 0, right = arr.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            // If middle element is greater than the rightmost, min is in the right half
            if (arr[mid] > arr[right]) {
                left = mid + 1;
            } else {
                // Mid could be the minimum or it's in the left half
                right = mid;
            }
        }

        return left; // Both left and right will point to the minimum
    }

    public static void main(String[] args) {
        int[] rotatedArray = {5, 1, 2, 3, 4};
        System.out.println("No. of rotatation : " + findMin(rotatedArray));
    }
}
