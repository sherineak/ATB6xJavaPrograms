package ex_21_collection_Framework_Arrays;


import java.util.ArrayList;
import java.util.List;

public class Lab233 {
    public static void main(String[] args) {
        List<String> mylist = new ArrayList();      // if you force only string under the list can use <String>, diamond operator
        //List<String> mylist = new ArrayList<String>(); its optional now  to specify the in  right side
        mylist.add("Sherine");
        mylist.add("preet");
        //mylist.add(123);
        //mylist.add(true);
        System.out.println(mylist);

    }
}