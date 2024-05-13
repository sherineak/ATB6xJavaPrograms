package ex_20042024;

public class Lab063 {
    public static void main(String[] args) {
        String password = "Welcome@123";
        String pass_u = password.toLowerCase();

        System.out.println(password == pass_u); // Check reference
        System.out.println(password == pass_u); // Check reference
        System.out.println(password.equals(pass_u)); // Check values
        System.out.println(password.equalsIgnoreCase(pass_u)); // not checking lower case or upper case

        System.out.println(password.substring(0,3));
        System.out.println(password.indexOf("m"));
    }
}
