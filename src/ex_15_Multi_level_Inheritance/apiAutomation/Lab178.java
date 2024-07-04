package ex_15_Multi_level_Inheritance.apiAutomation;

public class Lab178 {
    public static void main(String[] args) {
//        Test1 t1 = new Test1();
//        t1.openSqlConnection();
//        int a = t1.API_Version;
//        System.out.println(t1.version);

        CommonToAll c = new Test1();
        c.openExcelFile();
        c.openJson();
    }
}
