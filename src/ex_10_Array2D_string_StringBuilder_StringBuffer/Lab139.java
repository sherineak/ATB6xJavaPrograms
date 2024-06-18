package ex_10_Array2D_string_StringBuilder_StringBuffer;

public class Lab139 {
    public static void main(String[] args) {
        // 3 row and 2  column
        int[][] array_2d = {
                {34, 12},
                {32, 11},
                {30, 10}
        };

        for (int i =0; i<array_2d.length;i++){  // row 0, 1, 2
            for(int j =0; j<array_2d[i].length;j++){  // Column 0,1
                System.out.println(array_2d[i][j]);
            }
        }
    }
}
