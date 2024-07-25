package ex_21_collection_Framework_Arrays;

import java.util.ArrayList;
import java.util.List;

public class Lab232 {
    public static void main(String[] args) {

        ArrayList arrList1 = new ArrayList();
        // Add, remove, clear , contains, indexOf , isEmpty etc
        // addAll, removeAll, retainAll, containsALl
        List mylist = new ArrayList();     // Dynamic Dispatch ,

        ArrayList myList1 = new ArrayList();
        mylist.add("Sherine");
        mylist.add("Riyan");
        mylist.add("Royce");
        mylist.add("Davis");
        System.out.println(mylist);
        System.out.println(mylist.size());

        mylist.remove("Sherine");
        System.out.println(mylist);
        mylist.clear();
        System.out.println(mylist);
        System.out.println(mylist.isEmpty());
        mylist.add("Sherine");
        mylist.add("Riyan");
        mylist.add("Royce");
        mylist.add("Davis");
        // if add , always add in the end
        mylist.set(1,"celine");  // its replace the element at the specified position
        System.out.println(mylist);

        mylist.add(99);
        mylist.add(true);

        // how to print
        for(int i = 0 ;i < mylist.size();i++ ){
            System.out.println(mylist.get(i));
        }
        // for each loop
        for(Object obj : mylist){
            System.out.println(obj);
        }
    }
}
