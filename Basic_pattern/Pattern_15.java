/*
input : 3
output
123
456
789
 */
public class Pattern_15 {

    public static void main(String[] args) {
        int n = 3;
        int count = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(count);
                count++;
            }
            System.out.println();
        }
    }
}
