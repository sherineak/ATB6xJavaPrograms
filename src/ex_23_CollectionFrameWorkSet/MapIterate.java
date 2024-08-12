package ex_23_CollectionFrameWorkSet;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapIterate {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Orange",1);
        map.put("Banana",2);
        map.put("Apple",1);


        //1. Using for-each loop with entrySet()
        //This method allows you to iterate over the key-value pairs in the map.
        for (Map.Entry<String,Integer> entry : map.entrySet()){
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + " : " + value);
        }

        //2. Using for-each loop with keySet()
        //If you only need the keys, you can iterate over the keySet() and then use each key to get the corresponding value.

        for(String key : map.keySet()){
            Integer value = map.get(key);
            System.out.println(key +":"+ value);
        }

       //3. Using for-each loop with values()
        //If you only need the values and not the keys, you can iterate over the values() collection.
        for (Integer value : map.values()){
            System.out.println(value);
        }

                //4. Using an Iterator
        //If you prefer using an Iterator, here's how you can do it with entrySet():

        Iterator <Map.Entry<String, Integer>> itr = map.entrySet().iterator();
        while(itr.hasNext()){
            Map.Entry<String,Integer> entry = itr.next();
            System.out.println(entry.getKey()+ " :" +entry.getValue());
        }
    }
}
