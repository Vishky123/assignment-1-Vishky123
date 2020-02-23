package Main;

import Defination.ContactAdd;
import Defination.ContactDelete;
import Defination.ContactSearch;
import Defination.ContactView;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String firstname, lastname, email, mobno, option;
        int choice;
        ArrayList mobileno = new ArrayList();
        System.out.println("Welcome to Vishal's Contact List");
        Scanner sc = new Scanner(System.in);
        boolean loop = true;
        while (loop) {
            System.out.println("Press 1 to add new contact.\nPress 2 to view all contacts.\nPress 3 for search for a contact.\nPress 4 to delete a contact.\nPress 5 to exit program.");
            choice = sc.nextInt();


            switch (choice) {
                case 1:
                    System.out.println("You have chosen to add a new contact: \n" +
                            "Please enter the name of the Person");
                    System.out.print("First Name:");
                    firstname = sc.next().trim();
                    System.out.print("\nLast Name:");
                    lastname = sc.next().trim();
                    System.out.print("\nContact Number");
                    mobno = sc.next();
                    if (mobno.length() != 10 || mobno.matches("a-zA-Z")) {
                        System.out.println("Invalid Number");
                        continue;

                    } else {
                        mobileno.add(mobno);
                        for (int i = 0; i < 100; i++) {
                            System.out.println("Would you like to add another contact number? (y/n):");
                            option = sc.next();
                            if (option == "y" || option == "Y") {
                                mobileno.add(sc.nextInt());
                            } else {
                                break;
                            }
                        }
                    }
                    System.out.println("Email Address:  ");
                    email = sc.next().trim();
                    ContactAdd contactadd = new ContactAdd();
                    contactadd.newContact(firstname, lastname, mobileno, email);
                    break;
                case 2:
                    ContactView view = new ContactView();
                    view.printAllContact();
                    break;
                case 3:
                    ContactSearch search = new ContactSearch();
                    System.out.println("Enter the full name ");
                    search.searchContact(sc.next().trim());
                    break;
                case 4:
                    ContactDelete delete = new ContactDelete();
                    System.out.println("Enter the Full name ");
                    delete.deleteContact(sc.next().trim());
                    break;
                case 5:
                    break;
            }
    }
}
