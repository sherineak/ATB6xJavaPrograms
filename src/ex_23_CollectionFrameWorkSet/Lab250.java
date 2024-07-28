package ex_23_CollectionFrameWorkSet;

import java.util.HashSet;
import java.util.Set;

public class Lab250 {
    public static void main(String[] args) {
       // Given an array of integers , return an array of the unique elements.
        //Input : [1,2,2,3,4,4,5]
        //Output : [1,2,3,4,5]

        int[] input = {1,2,2,3,4,4,5};
        Set<Integer> uniqueSet = new HashSet<>();
        Set<Integer> seen = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();
        for (int num : input){
            System.out.println(num); // with duplicate
            uniqueSet.add(num);   // set
        }
        System.out.println(uniqueSet);

        // How to print duplicate element

        for(int num : input){
            if(!seen.add(num)){

                duplicates.add(num);
                System.out.println(num);
            }

        }
        System.out.println("Duplicate elements are: " +duplicates);


    }
}
