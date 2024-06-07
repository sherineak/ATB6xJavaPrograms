package ex_25_Switch;

public class Lab087 {
    public static void main(String[] args) {
    int itemCode = 005;
            switch(itemCode){
              case 001 -> System.out.println("Its a laptop");
              case 002,003 -> System.out.println("Its a desktop");
                default -> System.out.println("Hello");
            }

            char c ='Z';
            switch (c){
                case 'a','e','i','o','u' -> System.out.println("Vowel");
                default -> System.out.println("Consonant");
            }
    }
}
