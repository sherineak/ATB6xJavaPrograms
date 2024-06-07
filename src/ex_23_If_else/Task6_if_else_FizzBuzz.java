package ex_23_If_else;

public class Task6_if_else_FizzBuzz {
    public static void main(String[] args) {
        /*
Java program to print numbers from 1 to 100
However, for multiples of 3, print "Fizz" instead of the number,
for multiples of 5, print "Buzz",
for numbers that are multiples of both 3 and 5, print "FizzBuzz"
*/


        for(int i=1;i<100; i++){
            if(i%3==0){
                System.out.println(i+" is Fizz");
            } else if (i%5==0) {
                System.out.println(i+" is Buzz");
            }else if (i%3==0 && i%5==0){
                System.out.println(i+" Is FizzBuzz");
            }else {
                System.out.println(i);
            }
        }
    }
}
