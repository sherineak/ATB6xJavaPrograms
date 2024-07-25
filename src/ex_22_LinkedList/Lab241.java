package ex_22_LinkedList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lab241 {
    public static void main(String[] args) {
        //Interview Questions

//        List stringList = null;    // NullPointerException ->  Runtime exceptions in Java : its unchecked exception
//        stringList.add("Automation");


        List<Integer> myMarks = new ArrayList<>();
        myMarks.add(100);
        myMarks.add(98);
        myMarks.add(99);
        // TO sort these number by using collection class, - it's a proper and concrete class with method sort
        Collections.sort(myMarks);
        System.out.println(myMarks);

    }
}
