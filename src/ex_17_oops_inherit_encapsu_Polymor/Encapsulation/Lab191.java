package ex_17_oops_inherit_encapsu_Polymor.Encapsulation;

public class Lab191 {
    public static void main(String[] args) {
       vwoLogin vw = new vwoLogin("Admin","admin123");
       // hidden

        vw.username = "sher";  // hacker can change password
        System.out.println(vw.username);



    }
}
    class  vwoLogin{
     public String username;
     private String password;

        public vwoLogin(String username, String password) {
            this.username = username;
            this.password = password;
        }
    }


