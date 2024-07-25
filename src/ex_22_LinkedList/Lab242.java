package ex_22_LinkedList;

import java.util.Collections;
import java.util.Vector;

public class Lab242 {
    public static void main(String[] args) {
        Vector v = new Vector<>();
        v.add(91);
        v.add(100);
        v.add(98);
        Collections.sort(v);
        System.out.println(v);
    }
}
