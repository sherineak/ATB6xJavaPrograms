package ex_23_CollectionFrameWorkSet;

public class Lab257 {
    public static void main(String[] args) {
        printF(3,4);
        printF("Sherine","Celine");

    }

    private static <T> void printF(T i, T i1) {
        System.out.println(i);
        System.out.println(i1);
    }


}
