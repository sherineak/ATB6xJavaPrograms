package ex_08_for_while_DoWhile_loop;

public class Lab109 {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++ ){

            if (i == 5){
                break;
            }
            System.out.println(i);      // Checking break condition , then will print
            // i =1
            // i =2
            // i =3
            // i =4
            // i =5    --> Out of loop
        }
    }
}
