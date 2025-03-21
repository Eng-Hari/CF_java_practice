package Array_logic_2;

public class Count_invertion {
// how many swaps need to make the array sorted
// just need not to swap just count the swapable element presnt in the array

    public static void main(String[] args) {
        int a[] = {2, 4, 1, 3, 5};
        int n = a.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] > a[j]) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }

}
