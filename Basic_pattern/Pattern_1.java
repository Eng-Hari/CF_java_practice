
public class Pattern_1 {

    public static void main(String[] args) {
        int n = 4;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}


class Pattern1 {
    public static void main(String[] args) {
        int n = 15;
        int i = 1;
        int total = n * n;  // total number of stars
        int count = 0;

        while (count < total) {
            System.out.print("*");
            count++;
            
            // print a new line after every n stars
            if (count % n == 0) {
                System.out.println();
            }
        }
    }
}
