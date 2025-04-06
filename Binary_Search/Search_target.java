package curiousfreeks_pracrice.Binary_Search;

public class Search_target {

    // search the target in sorted and rotated array
    public static void main(String[] args) {
        int arr[] = {5, 6, 7, 8, 9, 10, 1, 2, 3};
        System.out.println(findTarget(arr, 1));
    }

    public static int findTarget(int arr[], int x) {
        int i = 0, j = arr.length - 1;

        while (i <= j) {

            int mid = i + (j - i) / 2;

            if (arr[mid] == x) {
                return mid;
            }
            if (arr[i] <= arr[mid]) {

                if (x < arr[mid] && x >= arr[i]) {
                    j = mid - 1;

                } else {
                    i = mid + 1;
                }

            } else {

                if (arr[mid] < x && x <= arr[j]) {
                    i = mid + 1;

                } else {
                    j = mid - 1;
                }
            }
        }
        return -1;
    }
}
