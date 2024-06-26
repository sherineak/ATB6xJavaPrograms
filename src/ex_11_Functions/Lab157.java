package ex_11_Functions;

public class Lab157 {
    public static void main(String[] args) {
    f1();
    f2();
    String[] names = {"Sherine", "Antony"};
    f1(names);

    String[] name2 = new String[2];
    name2[0] = "Riyan";
    name2[1] = "Royce";
    f3(name2);
 }
    static void f3(String[] name2) {
        for(String name:name2){
            System.out.println(name);
        }
        // OR
        for(int i =0 ; i<name2.length;i++){
            System.out.println(name2[i]);
        }
    }

    static void f1(String[] a){
        for(String name : a){
            System.out.println(name);
        }
 }
 static void f1(){
        f2();   // call a function f2 inside other function f1
     System.out.println("f1");
 }
 static void f2(){
     System.out.println("f2");
 }
}