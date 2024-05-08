package ex_16042024;

import ex_11042024.ClassNames.True;

public class Lab035 {
    public static void main(String[] args) {
        // || - OR
        // T || T -> T
        // T || F -> F
        // F || T -> T
        // F || F -> F
        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(false || true);
        System.out.println(false || false);
    }
}
