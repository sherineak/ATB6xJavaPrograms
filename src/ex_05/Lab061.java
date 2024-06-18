package ex_05;

public class Lab061 {
    public static void main(String[] args) {
        String s1 = "Sherine";
        // |0|1|2|3|4|5|6|
        char c = s1.charAt(0);
        System.out.println(c);

        boolean result = s1.contains("h"); // true
        boolean result1 = s1.contains("P");  // false
        System.out.println(result);
        System.out.println(result1);

        //s1.concat("Antony");   // there is no string Assignment happened
        String s2 = s1.concat(" Antony");
        System.out.println(s2);
    }
}
