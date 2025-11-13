
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
