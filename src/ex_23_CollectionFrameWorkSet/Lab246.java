package ex_23_CollectionFrameWorkSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Lab246 {
    public static void main(String[] args) {
        Set courseSet = new HashSet();
        courseSet.add("Manual");
        courseSet.add("Java Automation");
        courseSet.add("Api Automation");
        courseSet.add("Python Automation");

        System.out.println(courseSet);
        for (Object o: courseSet){
            System.out.println(o);
        }
        Iterator it = courseSet.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

    }
}
