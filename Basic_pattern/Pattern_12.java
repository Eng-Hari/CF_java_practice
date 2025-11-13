
public class Pattern_12 {

    public static void main(String[] args) {
        int n = 4;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * (i) - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n - 1; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * (i) - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}




int rows = 2 * n - 1;

for (int i = 1; i <= rows; i++) {

    int level = i <= n ? i : (rows - i + 1);

    int spaces = n - level;
    int stars = 2 * level - 1;

    StringBuilder sb = new StringBuilder();

    for (int s = 0; s < spaces; s++) sb.append(' ');
    for (int s = 0; s < stars; s++) sb.append('*');

    System.out.println(sb);
}






import java.util.*;

public class Demo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = 4;
 // *
//   ***
//  *****
// *******
//  *****
//   ***
//    *

        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");

            }

            for (int k = 1; k <= (i * 2) - 1; k++) {
                System.out.print("*");
            }

            System.out.println();

        }

        for (int i = 2; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= (i * 2) - 1; k++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}

// *****
//  ***
//   *
//  ***
// *****




int n = 3; // height of top (center is row 3)
int rows = 2 * n - 1; // total rows = 5

for (int i = 1; i <= rows; i++) {
    
    // Convert bottom rows to top-equivalent using symmetry
    int level = i <= n ? i : rows - i + 1;

    int spaces = level - 1;
    int stars = 2 * (n - level) + 1;

    for (int s = 1; s <= spaces; s++) System.out.print(" ");
    for (int s = 1; s <= stars; s++) System.out.print("*");

    System.out.println();
}

