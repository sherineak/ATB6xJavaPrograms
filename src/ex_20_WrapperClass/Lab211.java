package ex_20_WrapperClass;

public class Lab211 {
    public static void main(String[] args) {
        Integer b = 10;
        // primitive --> Wrapper
        // Wrapper  --> Primitive

        int x = 123;
        //String s1 = x;
        //String s1 = (String)x;   // To covert integer to string not possible
        String s1 = String.valueOf(x);
        System.out.println(s1);

        Character ch = 'a';
        char a3 = ch;  // Wrapper to Primitive - unboxing automatically happened , like open a candy

        Boolean c = true;
        Long l = 34l;
        Double d = 3.4;
        Float f1 = 3.2f;
        // Wrapper class covert a primitive data type into Object

        Integer intOb = Integer.valueOf(5);
        System.out.println(intOb);

        Integer a2 = 89;  // Autoboxing (Primitive ( 89) --> Wrapper(Automatically)

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.min(2,4));
        System.out.println(Integer.max(4,2));


        //Integer a11 = new Integer(10);  // Jdk 9 its removed
        Integer b12 = Integer.valueOf(10);

    }
}
