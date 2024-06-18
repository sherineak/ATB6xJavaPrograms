package ex_10_Array2D_string_StringBuilder_StringBuffer;

public class Task_transpose_2Darray {
    public static void main(String[] args) {
        //Write a Java method to transpose a given 2D array or matrix

        //Creating Matrix
        int original[][] = {
                {1, 3, 4},
                {2, 4, 3},
                {3, 5, 6}
        };
        // creating another matrix to store transpose of matrix
        int transpose[][] = new int[3][3];  // 3 rows and 3 columns

        //code to transpose a matrix
        for(int i =0; i<3;i++){
            for( int j=0; j<3 ; j++){
                transpose[j][i]=original[i][j];
                //transpose[i][j]=original[j][i]    or this one also correct

            }
        }

        System.out.println("Printing a matrix without transpose");

        for(int i =0; i <3; i++){
            for(int j=0 ; j< 3 ; j++){
                System.out.print(original[i][j]+"");
            }
            System.out.println(); // new line
        }

        System.out.println("Printing a matrix after transpose");
        for(int i =0 ; i < 3 ; i++ ){
            for (int j=0; j < 3; j++){
                System.out.print(transpose[i][j] +" ");
            }
            System.out.println(); //new line
        }
    }
}
