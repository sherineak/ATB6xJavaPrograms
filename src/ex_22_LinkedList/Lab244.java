package ex_22_LinkedList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lab244 {
    public static void main(String[] args) {
//        List myMarks = new ArrayList<>();
//        myMarks.add(100);
//        myMarks.add(98);
//        myMarks.add(88);
//
//        Collections.sort(myMarks);
//        System.out.println(myMarks);   // these myMarks list are same data types , so it can sort easily


        Student student =new Student(5,"Sherine");
        Student student1 = new Student(1,"Preethi");
        Student student2 = new Student(2,"Minnu");

        List<Student> students = new ArrayList<>();
        students.add(student);
        students.add(student1);
        students.add(student2);
        Collections.sort(students);
        System.out.println(students);
        // So using comparable possible to sort only one
        //to sort depends on user input by id , by name , ascending or descending can use Comparator in separate class


    }
}
