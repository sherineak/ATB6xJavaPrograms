package ex_15_Multi_level_Inheritance.apiAutomation;

public class Test1 extends BaseTest{
    void accessSQLandExcel(){
        openExcelFile();
        openSqlConnection();
        System.out.println(API_Version);   // Attribute in grandParent
        System.out.println(version);   // Attribute in father
    }
    void openJson(){
        System.out.println("Test");
    }
}
