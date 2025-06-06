package Binary_Search_Adv;
// public class Sort_rotated_min {
//     public static int findMin(int[] arr) {
//         int left = 0, right = arr.length - 1;
//         while (left < right) {
//             int mid = left + (right - left) / 2;
//             // Check if mid is the minimum element
//             if (mid > 0 && arr[mid] < arr[mid - 1]) {
//                 return arr[mid];
//             }
//             if (mid < arr.length - 1 && arr[mid] > arr[mid + 1]) {
//                 return arr[mid + 1];
//             }
//             // Decide which half to search
//             if (arr[mid] >= arr[left]) {
//                 // Left half is sorted, so the minimum is in the right half
//                 left = mid + 1;
//             } else {
//                 // Right half is sorted, so the minimum is in the left half
//                 right = mid - 1;
//             }
//         }
//         return arr[left]; // or arr[right], both should be the same at this point
//     }
//     public static void main(String[] args) {
//         int[] rotatedArray = {4, 5, 6, 7, 0, 1, 2};
//         System.out.println("Minimum element in rotated array: " + findMin(rotatedArray));
//     }
// }
//Alternatively, you can use the following code snippet to find the minimum element in a rotated sorted array:

public class Sort_rotated_min {

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

        return arr[left]; // Both left and right will point to the minimum
    }

    public static void main(String[] args) {
        int[] rotatedArray = {4, 5, 6, 7, 0, 1, 2};
        System.out.println("Minimum element in rotated array: " + findMin(rotatedArray));
    }
}
