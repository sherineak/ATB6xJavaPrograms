package ex_22_LinkedList;

import java.util.Stack;

public class Lab243 {
    public static void main(String[] args) {
        Stack<String> st = new Stack<>();
        st.push("A");
        st.push("B");
        st.push("C");
        st.add("D");
        System.out.println(st);

//        st.pop();
//        System.out.println(st);
        System.out.println(st.peek());
        System.out.println(st);
    }
}
