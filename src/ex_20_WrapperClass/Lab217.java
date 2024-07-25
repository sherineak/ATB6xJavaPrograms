package ex_20_WrapperClass;

public class Lab217 {
    public static void main(String[] args) {
        APIENDPOINTS end = APIENDPOINTS.Login;
        System.out.println(end.getPage());
        //driver.get(ref.getUrl)   selenium code
        System.out.println(end.getUrl());
    }
}
