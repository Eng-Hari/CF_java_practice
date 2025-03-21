//Prob 2: Write a program to check whether a triangle can be formed with the given values for the angles.

import java.util.Scanner;

public class Prob2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the three value to check that forming a triangle : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        sc.close();
        if (a + b + c == 180) {
            System.out.println("Its forming a tiangle");
        } else {
            System.out.println("Its not a triangle");
        }
    }

}
