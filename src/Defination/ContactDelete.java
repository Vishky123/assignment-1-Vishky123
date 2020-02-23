package Defination;

import Adts.ContactDeleteAdt;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class ContactDelete<E> implements ContactDeleteAdt<E> {
    Scanner sc = new Scanner(System.in);

    @Override
    public boolean deleteContact() {
//        ArrayList contacts = new ArrayList(DataStructure.getConlist());
        System.out.println("Here are all your contact");
        ArrayList contactNames = new ArrayList();
        ArrayList contacts = new ArrayList(DataStructure.getConlist());
        for (int i = 0; i < contacts.size(); i++) {
            ArrayList contact = new ArrayList((Collection) contacts.get(i));
            contactNames.add(contact.get(0) + " " + contact.get(1));
        }
        Collections.sort(contactNames, String.CASE_INSENSITIVE_ORDER);
        for (int i = 0; i < contactNames.size(); i++) {
            System.out.println(contactNames.get(i).toString());
        }
        System.out.print("Enter the Full name: ");
        String del = sc.nextLine();
        for (int i = 0; i < contacts.size(); i++) {
            ArrayList contact = new ArrayList((Collection) contacts.get(i));
            if ((contact.get(0) + " " + contact.get(1)).equals(del)) {
                DataStructure.removeContact(i);
                System.out.println("Contact Delete Sucessfully");
                return true;
            }
        }
        return false;
    }
}
