
public class Min_max_prodect {

    public static void main(String[] args) {
        int[] arr1 = {5, 7, 9, 3, 6, 2};
        int[] arr2 = {1, 2, 6, 1, 9};

        int max1 = Integer.MIN_VALUE;//asign the smalles value of integer to max1
        //now max1 is having smallest value
        int min2 = Integer.MAX_VALUE;//asign the largest value in integer t0 min2
        //now min2 id=s having largest value
        for (int num : arr1) {
            max1 = Math.max(max1, num);
            //the smalles value is compared with array value to get large
        }
        for (int num : arr2) {
            min2 = Math.min(min2, num);
            //the largest value is compared with array value to get small
        }
        System.out.println(max1 * min2);
    }
}
