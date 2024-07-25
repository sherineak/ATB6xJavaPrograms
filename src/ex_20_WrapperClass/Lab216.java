package ex_20_WrapperClass;

public class Lab216 {
    public static void main(String[] args) {
        APIENDPOINTS e = APIENDPOINTS.Login;

        switch (e){
            case Login -> System.out.println("Login Page code should be executed");
            case Dashboard -> System.out.println("Dashboard should ne executed");
        }
    }
}
