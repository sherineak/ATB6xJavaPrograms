package ex_10_Array2D_string_StringBuilder_StringBuffer;

public class Task_Element_Exists_2D {
    public static void main(String[] args) {

        // Write a Java method to check if a given element exists in a 2D array. ( element =8) , true
        int[][] array_2d = {
                {24, 45, 5},
                {34, 67, 2},
                {34, 78, 19}
        };

        int a = 0;

        for(int i = 0; i<array_2d.length;i++){
            for(int j=0; j<array_2d[i].length ; j++){
                if(array_2d[i][j] == 60){
                    a = 1;

                }
            }
        }
        if(a == 1){
            System.out.println(true);
        }else {
            System.out.println(false);
        }
    }
}
