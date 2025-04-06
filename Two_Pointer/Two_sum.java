package Two_Pointer;

import java.util.Arrays;
// public class Two_sum {
//     public static void main(String[] args) {
//         int arr[] = {1, 4, 45, 6, 10, 8};
//         int target = 16;
//         List<Integer> result = twosum(arr, target);
//         System.out.println(result);
//     }
//     public static List<Integer> twosum(int arr[], int x) {
//         List<Integer> sum = new ArrayList<>();
//         Arrays.sort(arr);
//         int i = 0, j = arr.length - 1;
//         while (i < j) {
//             if (arr[i] + arr[j] == x) {
//                 sum.add(arr[i]);
//                 sum.add(arr[j]);
//                 return sum;
//             } else if (arr[i] + arr[j] > x) {
//                 j--;
//             } else {
//                 i++;
//             }
//         }
//         return sum;
//     }
// }

public class Two_sum {

    public static void main(String[] args) {
        int arr[] = {1, 4, 45, 6, 10, 8};
        int target = 16;
        boolean found = twosum(arr, target);
        System.out.println(found);
    }

    public static boolean twosum(int arr[], int x) {

        Arrays.sort(arr);

        int i = 0, j = arr.length - 1;

        while (i < j) {
            if (arr[i] + arr[j] == x) {
                return true;
            } else if (arr[i] + arr[j] > x) {
                j--;
            } else {
                i++;
            }
        }

        return false;
    }
}
