package ex_01_Array;

public class Lab124 {
    public static void main(String[] args) {
        int[] ages = {27, 31, 32, 33, 34};   // Its fixed element

        int[] age2 = new int[5];
        //case 2 - Here by default value of all the element wil be zero and case update value
        System.out.println(age2[0]);
        System.out.println(age2[4]);

        age2[4] = 11;
        System.out.println(age2[4]);


        String[] break_fast = {"Idli","Dohsa","milk","oats"};
        System.out.println(break_fast.length);



    }
}
