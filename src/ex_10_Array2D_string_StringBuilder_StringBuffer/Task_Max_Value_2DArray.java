package ex_10_Array2D_string_StringBuilder_StringBuffer;

public class Task_Max_Value_2DArray {
    public static void main(String[] args) {
        //Write - Java method to find the maximum value in a 2D array. - O/P - 9

        int[][] array_2d = {
                {23,45,67,24},
                {34, 56, 72,456},
                {1, 4, 5, 7}
        };
        int max = Integer.MIN_VALUE;
        for(int i =0; i<array_2d.length;i++){
            for(int j=0; j<array_2d[i].length;j++){
                if(array_2d[i][j] > max){
                    max = array_2d[i][j];

                }
            }
        }
        System.out.println("Max value is " +max);
    }

}
