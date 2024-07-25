package ex_21_collection_Framework_Arrays;

import java.util.List;

public class Lab231 {
    public static void main(String[] args) {
        //Shopping - milk , butter, bread, cheese    --> 4 elements

        //Collection Framework - How you can store elements
        //1.List (interface: its incomplete )  --> it's implemented by classes  ArrayList, linkedList, Stack, Vector
//        List shopping_list = List.of("milk","butter","cheese");
//        System.out.println(shopping_list);
//        System.out.println(shopping_list.size());   // length

        //List can contain duplicates
        List fruits = List.of("Orange","Apple","banana","Apple");  // it's a static function it will call first load a class
        System.out.println(fruits);
        System.out.println(fruits.size());

//        List my_10th_marks = List.of(91,92,100,99);
        //List different_data_types = List.of("Sherine",100, true);

        System.out.println(fruits.get(0));
        System.out.println(fruits.indexOf("Apple")); //  it will return first occurrence of element apple

        //IsEmpty
        System.out.println(fruits.isEmpty());
        fruits.add("grapes");   // list is an interface  , as its interface , it will execute static method, once class load class loads eg list.of
        System.out.println(fruits); // UnsupportedOperationException



    }
}
