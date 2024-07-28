package ex_23_CollectionFrameWorkSet;

import java.util.*;

public class Lab254 {
    public static void main(String[] args) {
        Map<String,String> map1 = new HashMap<>();
        map1.put("First name", "Sherine");
        map1.put("Phone Number", "123445444");
        map1.put("sate","Kerala");
        map1.put("Country","India");
        map1.put("Pin","32133");
        //System.out.println(map1);

        Map<String,String> map2 = new HashMap<>();
        map2.put("First name", "Preethi");
        map2.put("Phone Number", "123445444");
        map2.put("sate","Kerala");
        map2.put("Country","India");
        map2.put("Pin","32133");
        //System.out.println(map2);

        List list = new ArrayList<>();
        list.add(map2);
        list.add(map1);
        System.out.println(list);
        System.out.println(list.get(0));
        System.out.println(list.get(1));



    }
}
