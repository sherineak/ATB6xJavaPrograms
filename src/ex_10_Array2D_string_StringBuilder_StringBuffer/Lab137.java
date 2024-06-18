package ex_10_Array2D_string_StringBuilder_StringBuffer;

public class Lab137 {
    public static void main(String[] args) {
        // Arrays are collection of similar data types
        // 2D Array


        int[][] array_2d_2 = new int[3][3];   //3 * 3 matrix
        //  |0,0,0|    by default
        //  |0,0,0|    by default
        //  |0,0,0|    by default

        array_2d_2[0][0] = 34;
        //  |34,0,0|
        //  |0,0,0|
        //  |0,0,0|

        array_2d_2[0][1] = 12;
        //  |34,12,0|
        //  |0,0,0|
        //  |0,0,0|
        array_2d_2[0][2] = 11;
        //  |34,12,0|
        //  |0,0,0|
        //  |0,0,0|

        // 3D -> XYZ

        int[][] array_2D= {
                {34,12,11},
                {34,12,34},
                {11,23,98}
        };
        // to print 2D, there wil be 2 loops , one loop inside another loop

        for(int i=0; i< array_2D.length;i++){  // row 0,1,2
            for(int j=0; j<array_2D[i].length;j++){ //column 0,1,2
                System.out.println(array_2D[i][j]);
            }
        }
       // i = 0 , j-> 0,1,2
        //i= 1 , j -> 0,1,2
        //i =2 , j-> 0,1,2




    }
}
