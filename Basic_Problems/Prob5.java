
//Write a program which takes two values x and y. Prints x for y number of times.
import java.util.Scanner;

public class Prob5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value for x and y : ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        sc.close();
        for (int i = 0; i < y; i++) {
            System.out.println(x);
        }
    }
}
