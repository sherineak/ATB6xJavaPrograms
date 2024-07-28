package ex_23_CollectionFrameWorkSet;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Lab249  {
    public static void main(String[] args) {
        Set<Integer> inegerset1 = new HashSet();
       inegerset1.add(123);
       inegerset1.add(12);
       inegerset1.add(12345);
       inegerset1.add(123456);
        System.out.println(inegerset1);

        Set<Integer> inegerset2 = new LinkedHashSet<>();
        inegerset2.add(123);
        inegerset2.add(12);
        inegerset2.add(12345);
        inegerset2.add(123456);
        System.out.println(inegerset2);

        Set inegerset3 = new TreeSet();
        inegerset3.add("Sherine");
        inegerset3.add("Antony");
        inegerset3.add("Mariyam");
        System.out.println(inegerset3);





    }
}
