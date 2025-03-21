/*Prob 4: Write a program using switch case which takes a value and prints the respective Size.
If size is 29 then its small

If size is 30 then its Medium

If size is 38 then its Large

If size is 42 then its XLarge

If size is not any of the above then Invalid. */
import java.util.Scanner;

public class Prob4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your size :");
        int size = sc.nextInt();
        sc.close();
        switch (size) {
            case 29 ->
                System.out.println("Small");
            case 30 ->
                System.out.println("Medium");
            case 38 ->
                System.out.println("Large");
            case 42 ->
                System.out.println("XLarge");
            default ->
                System.out.println("Invalid ");
        }
    }

}
