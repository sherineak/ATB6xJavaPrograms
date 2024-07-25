package ex_22_LinkedList;

import java.util.Comparator;
import java.util.function.ToIntFunction;

//class SortById implements Comparator {
// // Pls check for reference  Recorded section
//
//    @Override
//    public int compare(Student o1, Student o2) {
//        return Integer.compare(o1.getId(), o2.getId());
//    }
//}
//
//    @Override
//    public int compare(Object o1, Object o2) {
//        return 0;
//    }
//}


public class Student implements Comparable<Student>{
    @Override
    public int compareTo(Student o) {
        return Integer.compare(this.id,o.id);
    }

    Integer id;
    String name;

    // Prameterized constructor
    public Student(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
 // to print student using override method

    @Override
    public String toString() {
        return "Student : id=" + id + ", name='" + name + "'";
    }
    }
