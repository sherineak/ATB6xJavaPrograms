package ex_23_CollectionFrameWorkSet;
import java.util.HashSet;
import java.util.Set;

public class Lab245 {
    public static void main(String[] args) {
        Set<String> fruits = new HashSet<>();

        // Interview :// How Hashset Work?
        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Banana");
        fruits.add("apple"); // Its case sensitive , so it will list
        fruits.add("Apple");  // it will remove duplicates
        //fruits.add(123);  we declared as Set is String
        System.out.println(fruits);
        System.out.println(fruits.size());
        System.out.println(fruits.isEmpty());
        System.out.println(fruits.contains("Apple"));
        System.out.println(fruits.remove("Apple"));
        System.out.println(fruits);
        fruits.clear(); // will remove
        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Banana");


    }
}
