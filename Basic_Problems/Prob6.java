// Write a program to take x and print multiples of x till 1000.

import java.util.Scanner;

public class Prob6 {

    public static void main(String[] args) {
        System.out.println("Enter the value for x : ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        for (int i = 0; i <= 1000; i += x) {
            System.out.println(i);
        }
        sc.close();
    }
}
