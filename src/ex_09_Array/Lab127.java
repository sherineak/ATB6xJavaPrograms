package ex_09_Array;

public class Lab127 {
    public static void main(String[] args) {
        // = ref
        // .equals -> value or content bot only for string's String.class, not for Array's Object.class
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {1, 2, 3, 4, 5};

        System.out.println(arr1);
        System.out.println(arr2);
        System.out.println(arr1==arr2);  // compare the reference or location

        int[] arr3 = arr1;
        System.out.println(arr1==arr3);

        System.out.println(arr1.equals(arr2));     // Objecrs.java    --> its for compare or check reference

        String s1 = "Sherine";
        String s2 = "Sherine";

        System.out.println(s1.equals(s2));    // Content Strings.java  -> It's for compare or check content




    }

}
