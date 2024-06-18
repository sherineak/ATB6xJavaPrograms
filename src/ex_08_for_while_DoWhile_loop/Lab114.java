package ex_08_for_while_DoWhile_loop;

public class Lab114 {
    public static void main(String[] args) {
        // Write a pgm to find even and odd number using CONTINUE

        for (int i =1; i<=10 ; i++){
            if(i%2==0){
                System.out.println("Even number -->" +i);
                continue;
            }
            System.out.println("Odd Number-->"+i);
        }
    }
}
