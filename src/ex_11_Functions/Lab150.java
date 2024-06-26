package ex_11_Functions;

public class Lab150 {
    public static void main(String[] args) {
        //No return type - functions : Define -> call

        //Return Something
        int result = sum_of_two_number();
//        double resul = sum_of_two_number(); // Its possible becoz double is a bigger basket
//        byte res = (byte) sum_of_two_number();  // narrow , explicit casting
        System.out.println(result);

    }

    static int sum_of_two_number() {
        return 5+6;
    }
}
