package ex_10_Array2D_string_StringBuilder_StringBuffer;

public class Lab138 {
    public static void main(String[] args) {
        // 2 row and 3 column
        int[][] array_2d = {
                {32,12,11},
                {32, 13, 12}
        };

        for (int i =0; i<array_2d.length;i++){ // row 0,1
            for(int j=0; j<array_2d[i].length;j++){  // Column 0,1,2
                System.out.println(array_2d[i][j]);

            }

        }
    }
}
