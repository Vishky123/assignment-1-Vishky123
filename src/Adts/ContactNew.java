package Adts;

import java.util.ArrayList;

public interface ContactNew<E> {
    boolean newContact(String Firstname, String Lastname, ArrayList MobileNO, String Email);
}
