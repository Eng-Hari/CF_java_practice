/*Prob 1 : Write a program that takes an integer, then a string,
 then a char from the user and prints them in the screen. */
import java.util.Scanner;

public class Prob1 {

    public static void main(String[] args) {
        int num;
        String name;
        char char_value;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the integer : ");
            num = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter the string : ");
            name = sc.nextLine();
            System.out.println("Enter the char : ");
            char_value = sc.next().charAt(0);
        }
        System.out.println("The integer is : " + num);
        System.out.println("The string is : " + name);
        System.out.println("The character is : " + char_value);
    }
}
