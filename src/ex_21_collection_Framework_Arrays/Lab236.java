package ex_21_collection_Framework_Arrays;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Lab236 {
    public static void main(String[] args) {

        // Array list is not thread Safe,its fast
     List myList = new ArrayList();
     myList.add("Sherine");
     myList.add("Mariyam");
     myList.add("Preethi");
     myList.remove("preethi");
        System.out.println(myList);

        //Vector is a thread safe - its one by one operation , Its slow

        Vector v = new Vector();
        v.add("sherine");
        v.add("Mariyam");
        v.add("Preethi");
        v.remove("Preehi");
        //v.remove("sherine");
        System.out.println(v);

        // most of the time Arraylist is using ,  but based on the requirement


    }
}
