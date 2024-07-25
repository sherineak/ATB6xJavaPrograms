package ex_21_collection_Framework_Arrays;

public class Lab230 {
    public static void main(String[] args) {

    // how to create an array
        int[] arr = new int[5];
        // length of the array - 5
        // index starts from  0 to 4
        System.out.println(arr.length);
        // problem with array is : fixed size problem with array
        // can we increase the size of array ? no , we can't increase the size of the same object
        //a.sort();      - not possible to sort
// dis advantage of array" -Only can store Integer  - its homogenous in nature
        arr[0]= 10;
    }
}
