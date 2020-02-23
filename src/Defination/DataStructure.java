package Defination;

import java.util.ArrayList;

public class DataStructure {
    private static ArrayList conlist = new ArrayList<>();

    public static ArrayList getConlist() {
        return conlist;
    }

    public static void setConlist(ArrayList conlist) {
        DataStructure.conlist.add(conlist);
    }

    public static void removecontact(int index) {
        DataStructure.conlist.remove(index);
    }
}
