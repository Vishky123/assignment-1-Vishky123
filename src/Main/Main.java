package Main;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String firstname, lastname, emal, mobno;
        int choice;
        ArrayList mobileno = new ArrayList();
        System.out.println("Welcome to Vishal's Contact List");
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Press 1 to add new contact.\n Press 2 to view all contacts.\nPress 3 for search for a contact.\nPress 4 to delete a contact.\nPress 5 to exit program.");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("You have chosen to add a new contact: \n" +
                            "Please enter the name of the Person");
                    System.out.print("First Name:");
                    firstname = sc.next();
                    System.out.print("\nLast Name:");
                    lastname = sc.next();
                    System.out.print("\nContact Number");
                    mobno = sc.next();
                    if (mobno.length() != 10 || mobno.matches("a-zA-Z")) ;
                {

                }
            }
        }
    }
}
