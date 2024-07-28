package ex_23_CollectionFrameWorkSet;

import java.util.TreeSet;

public class Lab248 {
    public static void main(String[] args) {
        TreeSet numSet = new TreeSet<>();
        numSet.add(50);
        numSet.add(30);
        numSet.add(10);
        numSet.add("Sherine"); //java.lang.ClassCastException . In treeSet not allowed different data type , if not mentioned any data type while creating Object

        System.out.println(numSet);

    }
}
