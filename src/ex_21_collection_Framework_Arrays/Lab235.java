package ex_21_collection_Framework_Arrays;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.SequencedCollection;

public class Lab235 {
    public static void main(String[] args) {
        ArrayList myList = new ArrayList(); // Child Reference (CR) = Child Object(CO)
        List myList1 = new ArrayList();// FR --> CO
        SequencedCollection myList2 = new ArrayList(); // GF --> CO
        Collection myList3 = new ArrayList(); //GGF --> CO

        //Array list - Behind the een it users , Dynamic Array
        //Size filled around 90 , its double the size automatically

        //Size is dynamic
        // DUplicate is allowed
        //Insertion Order is preserved
        // Heterogeneous objects are allowed
        //mull insertion is possible

        myList.add("sherine");
        myList.add("Antony");
        myList.add("MAriyam");
        myList.add(null);
        System.out.println(myList);
        System.out.println(myList.size());
        myList.remove("Antony");
        System.out.println(myList);


    }
}
