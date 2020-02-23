package Defination;

import Adts.ContactDeleteAdt;

import java.util.ArrayList;
import java.util.Collection;

public class ContactDelete<E> implements ContactDeleteAdt<E> {
    @Override
    public boolean deleteContact(String name) {
        ArrayList contacts = new ArrayList(DataStructure.getConlist());
        for (int i = 0; i < contacts.size(); i++) {
            ArrayList contact = new ArrayList((Collection) contacts.get(i));
            if ((contact.get(0) + "" + contact.get(1)).equals(name)) {
                DataStructure.removeContact(i);
                return true;
            }
        }
        return false;
    }
}
