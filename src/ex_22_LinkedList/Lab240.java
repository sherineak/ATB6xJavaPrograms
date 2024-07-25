package ex_22_LinkedList;

import java.util.*;

public class Lab240 {
    public static void main(String[] args) {
        // LinkedLIst and list same , difference is how it will store
        List courseList = new LinkedList();
        courseList.add("Manual");
        courseList.add("java automation");
        courseList.add("python Automation");
        courseList.add("Api AUtomation");
        courseList.add("SDET BluePrint");
        System.out.println(courseList);

        Vector<String> v2 = new Vector<>();
        v2.add("ATB");
        v2.add("MTB");
        v2.add("BluePrint");

        // Vector printed using Enumeration, its old class (legacy class), its similar to Iteration , But iteration can use with all other

        Enumeration e = v2.elements();
            while (e.hasMoreElements()){
                System.out.println(e.nextElement());
        }
    }
}
