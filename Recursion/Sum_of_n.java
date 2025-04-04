//package Recursion;
// public class Sum_of_n {
//     public static void main(String[] args) {
//         int n = 5;
//         System.out.println(sum(5));
//     }
//     public static int sum(int n) {
//         if (n == 1) {
//             return 1;
//         }
//         return n + sum(n - 1);
//     }
// }
package Recursion;

public class Sum_of_n {

    public static void main(String[] args) {
        int n = 5;
        System.out.println(sumof(n));

    }

    public static int sumof(int n) {
        if (n == 0) {
            return 0;
        }

        return n + sumof(n - 1);

    }
}

// recursice call will be 
//     5+ sumof(4)=> 4+ sum(3) => 3+sumof(2) => 2+sumof(1) => 1+somof(0)=> 0 is the base case it return 0
//     1+0 => 2+1 =>3+3 => 4+6 => 5+10 = 15
