
public class Move_zero_end {

//     public static void main(String[] args) {
//         int a[] = {1, 2, 0, 4, 3, 0, 5};
//         movezero(a);
//         for (int value : a) {
//             System.out.print(value + " ");
//         }
//     }
//     public static void movezero(int a[]) {
//         int j = 0;
//         for (int i = 0; i < a.length; i++) {
//             if (a[i] != 0) {
//                 a[j] = a[i];
//                 j++;
//             }
//         }
//         for (int i = j; i < a.length; i++) {
//             a[j] = 0;
//             j++;
//         }
//     }
// }
// public class MoveZeroInplace {

// Inplace replacement approach
    public static void main(String[] args) {
        int a[] = {1, 2, 0, 4, 3, 0, 5, 0};
        moveZeroInplace(a);
        for (int value : a) {
            System.out.print(value + " ");
        }
    }

    public static void moveZeroInplace(int a[]) {
        int j = 0; // Position to place the next non-zero element

        // Traverse and swap non-zero elements to the front
        for (int i = 0; i < a.length; i++) {
            if (a[i] != 0) {
                // Swap only when necessary
                if (i != j) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
                j++;
            }
        }
    }
}
