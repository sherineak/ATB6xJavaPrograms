package ex_08_for_while_DoWhile_loop;

public class Lab113 {
    public static void main(String[] args) {

        for (int i = 1; i<=10; i++){
            System.out.println(i);
            if(i == 5){
                continue;
            }
            System.out.println("After!!");
        }
    }
}
