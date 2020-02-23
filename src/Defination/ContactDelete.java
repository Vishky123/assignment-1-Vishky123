package Defination;

import Adts.ContactDeleteAdt;

import java.util.ArrayList;

public class ContactDelete<E> implements ContactDeleteAdt<E> {
    @Override
    public boolean deleteContact(String name) {
        ArrayList contact = new ArrayList(DataStructure.getConlist());

        return true;
    }
}
