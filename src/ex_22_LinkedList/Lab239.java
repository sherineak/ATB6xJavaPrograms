package ex_22_LinkedList;

import com.sun.source.tree.WhileLoopTree;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Lab239 {
    public static void main(String[] args) {
        List courseList = new ArrayList();
        courseList.add("Manual");
        courseList.add("java automation");
        courseList.add("python Automation");
        courseList.add("Api AUtomation");
        courseList.add("SDET BluePrint");
        courseList.add(123);
        courseList.add(2.34f);
        courseList.add(true);

        // Iterator is used to iterate over the ArrayList, LinkedList an multipl e other collection frameworks

        Iterator itr = courseList.iterator();
        while (itr.hasNext()) {
            {
                System.out.println(itr.next());
            }

            for (Object clist : courseList) {
                System.out.println(clist);
            }

            for (int i = 0; i < courseList.size(); i++) {
                System.out.println(courseList.get(i));
            }
            //ListIterator only available LinkedLst, ArrayList
            //List Iterator  can fo previous also, all others like for loop , for each loop and Iterator go only forward
            ListIterator liItr = courseList.listIterator();
            while (liItr.hasNext()) {
                System.out.println(liItr.next());
            }

            //List Iterator  can go previous (reverse)
            ListIterator ltr = courseList.listIterator(courseList.size());
            while (ltr.hasPrevious()) {
                System.out.println(ltr.hasPrevious());
            }

        }
    }
} 

