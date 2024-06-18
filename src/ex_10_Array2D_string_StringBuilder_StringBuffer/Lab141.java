package ex_10_Array2D_string_StringBuilder_StringBuffer;

public class Lab141 {
    public static void main(String[] args) {
        int[] arra = { 34, 32, 12};
        // for each loop below good for array
        for(int item : arra){
            System.out.println(item);
        }
        System.out.println("____");
        // OR normal for loop
        for(int i =0; i< arra.length; i++){
            System.out.println(arra[i]);
        }
    }
}
