
public class Largest_element_array {

    public static void main(String[] args) {
        int n = 7;
        int arr[] = {1, 2, 24, 5, 48, 9, 56};
        int large = arr[0]; // assume 1st value is large
        for (int i = 0; i < n; i++) {
            if (large < arr[i]) { // compare array element with large  
                large = arr[i]; // large element become large value
            }
        }
        System.out.println(large);
    }
}
