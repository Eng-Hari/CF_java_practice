// package Recursion;
// public class Print_1_n {
//     public static void main(String[] args) {
//         int n = 10;
//         number(1, n);
//     }
//     public static void number(int current, int n) {
//         if (current > n) {
//             return;
//         }
//         System.out.println(current);
//         number(current + 1, n);
//     }
// }
//Alternative way
package Recursion;

public class Print_1_n {

    public static void main(String[] args) {
        //    int n = 10;
        print(10);
    }

    public static void print(int n) {
        if (n > 0) {
            print(n - 1);
            System.out.println(n);
        }
    }
}
