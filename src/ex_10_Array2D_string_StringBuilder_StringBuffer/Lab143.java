package ex_10_Array2D_string_StringBuilder_StringBuffer;

public class Lab143 {
    public static void main(String[] args) {
        String s1 = "Sherine";   // String constant pool
        String s2 = new String("Antony");  // Heap or Object Area

        // String  - immutable -> once created can't be modified or changed


        StringBuffer sBuffer = new StringBuffer("Sherine");
        sBuffer.append("Antony");
        sBuffer.reverse();    // reverse not available in string only StringBuffer and String builder
        System.out.println(sBuffer);

        StringBuilder sBuilder = new StringBuilder("Sherine");
        sBuilder.append("Antony");

        String password = "pass@123";
        password = "pass";  // here 2 strings has been created for variable 'password '


    }
}
