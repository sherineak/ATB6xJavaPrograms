package ex_09_Array;

public class Task_Max_Salary {
    public static void main(String[] args) {
        //Find the max salary in the input arrays {30,50,60,98,10, 100,90, -1, -3}
        int[] salary = {30,50,60,98,10, 100,92,-1,-3};
        //int max = 0;    OR below //if take negative value as input, this logic will fail if initialize as zero, so below is a good advice
        int max=Integer.MIN_VALUE;     // minimum value of integer - 2147483648 its a range ,

        for(int i =0; i<salary.length;i++){
            if(salary[i]>max){
            max = salary[i];
            }

        }
        System.out.println("Maximum salary is" +max);
//
//        int j =0;
//        while(j<salary.length){
//            if(salary[j]>max){
//                max = salary[j];
//            }
//            j++;
//        }
//
//        System.out.println("Max salary using while loop "+ max);


    }
}
