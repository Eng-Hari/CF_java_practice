//Write a program to get firstName and lastName
// and n as input and print fullName that is firstName+lastName for n times.

import java.util.Scanner;

public class Prob7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ente rthe first name : ");
        String firstname = sc.next();
        System.out.println("Enter the last name :");
        String lastname = sc.next();

        System.out.println("Enter the no. for print n time :");
        int x = sc.nextInt();
        sc.close();

        int i = 0;
        while (i < x) {
            System.out.println(firstname + lastname);
            i++;
        }
    }
}
