package ex_23_CollectionFrameWorkSet;
import java.util.HashMap;
import java.util.Map;

public class Lab252 {
    public static void main(String[] args) {
        // Map  : key value Pair
        // API TESTING
        Map<String, Object> studentMAp = new HashMap<>();  // Object can access all data types
        studentMAp.put("First Name", "Sherine");
        studentMAp.put("First Name", "Mariyam");  // as Map key is unique, if there is duplicate keys , it will consider latest one only

        studentMAp.put("Roll no", 112);
        studentMAp.put("Course", "Java Automation");
        studentMAp.put("isFemale", true);
        System.out.println(studentMAp);
        System.out.println(studentMAp.get("First Name"));
        System.out.println(studentMAp.get("Roll no"));
        System.out.println(studentMAp.isEmpty());
        System.out.println(studentMAp.containsKey("Course"));
        System.out.println(studentMAp.containsValue(112));
        System.out.println(studentMAp.keySet());  // get all key values  , keys are alwyas uiques
        System.out.println(studentMAp.values()); // print all values


        for(Map.Entry<String, Object> item : studentMAp.entrySet()){
            System.out.println(item.getKey()+ " " +item.getValue());
        }



    }
}
