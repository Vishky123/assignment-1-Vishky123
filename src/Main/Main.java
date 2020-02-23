package Main;

import Defination.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String firstname, lastname, email, mobno, option;
        ContactAdd contactadd = new ContactAdd();
        ContactView view = new ContactView();
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
                    mobno = null;
                    System.out.println("You have chosen to add a new contact: \n" +
                            "Please enter the name of the Person");
                    System.out.print("First Name:");
                    firstname = sc.next().trim();
                    System.out.print("Last Name:");
                    lastname = sc.next().trim();
                    System.out.print("Contact Number:");
                    mobno = sc.next();
                    if (mobno.length() != 10 || mobno.matches("a-zA-Z")) {
                        System.out.println("Invalid Number");
                        continue;

                    } else {
                        mobileno.add(mobno);
                        for (int i = 0; i < 100; i++) {
                            System.out.print("Would you like to add another contact number? (y/n):");
                            option = sc.next();
                            sc.nextLine();
                            if (option.equals("y") || option.equals("Y")) {
                                System.out.println("Contact Number:");
                                mobno = sc.next();
                                mobileno.add(mobno);
                            } else {
                                break;
                            }
                        }
                    }
                    System.out.print("Email Address:  ");
                    email = sc.next().trim();
                    sc.nextLine();
                    contactadd.newContact(firstname, lastname, mobileno, email);
                    System.out.println(DataStructure.getConlist());
                    break;
                case 2:
                    view.printAllContact();
                    break;
                case 3:
                    ContactSearch search = new ContactSearch();
                    System.out.print("Enter the full name: ");
                    sc.nextLine();
                    String seaarch1 = sc.nextLine();
                    search.searchContact(seaarch1);
                    break;
                case 4:
                    ContactDelete delete = new ContactDelete();

                    delete.deleteContact();
                    break;
                case 5:
                    System.out.println("----------------------exit---------------------");
                    loop = false;
                    break;

                default:
                    System.out.print("Enter thre Valid Option.");
                    break;
            }
        }
    }
}
