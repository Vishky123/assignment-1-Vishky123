package Defination;

import Adts.ContactViewAdt;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ContactView<E> implements ContactViewAdt {
    @Override
    public Object printAllContact() {
        System.out.println("Here are all your contact");
        ArrayList contactNames = new ArrayList();
        ArrayList contacts = new ArrayList(DataStructure.getConlist());
        for (int i = 0; i < contacts.size(); i++) {
            ArrayList contact = new ArrayList((Collection) contacts.get(i));
            contactNames.add(contact.get(0));
        }
        Collections.sort(contactNames);
        for (int i = 0; i < contactNames.size(); i++) {
            System.out.println(contactNames.get(i).toString());

        }


        return null;
    }
}

