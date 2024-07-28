package ex_23_CollectionFrameWorkSet;

import java.util.*;

public class Lab253 {
    public static void main(String[] args) {
        Map<String, Object> map1 = new HashMap<>();
       Map<String, Integer> map2 = new WeakHashMap<>();  // if not been used keys , it will delete from memory using WeakhaspMap , it is more optimized way//
        Map<String, Integer> map3 = new TreeMap<>(); // Natural sorting
        Map<String,Integer> map4 = new LinkedHashMap<>(); //Maintaining Order
        map2.put("Id1", 1);
        map2.put("Id2", 3);
        map2.put("Id3", 4);
        map2.put("Id4", 5);
        System.out.println(map2);
        System.out.println(map2.isEmpty());
        System.out.println(map2.size());
        System.out.println(map2.containsKey("Id1"));
        System.out.println(map2.containsValue(5));
        System.out.println(map2.keySet());
        System.out.println(map2.values());
    }
}
