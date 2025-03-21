
public class Smallest_element_array {

    public static void main(String[] args) {
        int n = 8;

        int arr[] = {5, 7, 34, 67, 2, 56, 5, 8};
        int smallest = arr[0];
        for (int i = 0; i < n; i++) {
            if (smallest > arr[i]) {
                smallest = arr[i];
            }

        }
        System.out.println(smallest);
    }
}
