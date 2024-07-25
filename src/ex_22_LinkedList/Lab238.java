package ex_22_LinkedList;

import java.util.ArrayList;
import java.util.List;

public class Lab238 {
    public static void main(String[] args) {
        //List - Arraylist, LinkedList, Vector, Stack
        //Set - HashSet, LinkedHashSet, TreeSet
        //Map - HashMap, LinkedHashMap, TreeMap
        //Queue - PriorityQueue, LinkedLIst
        //Hashtable, properties

        List<String> courseList = new ArrayList<String>();   // String data type
        courseList.add("Manual");
        courseList.add("java automation");
        courseList.add("python Automation");
        courseList.add("Api AUtomation");
        courseList.add("SDET BluePrint");


        List numList = new ArrayList();   // this list not specify any data type, if not mentioned any dta type then by default its object
        numList.add(100);
        numList.add(78);
        numList.add(99);

        numList.addAll(courseList);  // it add all the elements from courseList and combine
        System.out.println(numList);





    }
}
