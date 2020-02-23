package Defination;

import Adts.ContactSearchAdt;

import java.util.ArrayList;

public class ContactSearch<E> implements ContactSearchAdt<E> {
    @Override
    public void searchContact(String name) {
        ArrayList contacts = new ArrayList(DataStructure.getConlist());

    }
}
