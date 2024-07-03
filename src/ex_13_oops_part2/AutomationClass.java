package ex_13_oops_part2;

public class AutomationClass {
    String name;

    // realtime use of default constructor
    AutomationClass(){
    dataBaseConnection();
    excelOpenConnection();
    }

    void dataBaseConnection(){
        System.out.println("Data base connection has been created");
    }
    void excelOpenConnection(){
        System.out.println("Excel opened");
    }
// Parameterized constructor
    AutomationClass(String name) {
        this.name = name;
    }

    void test1(){
        System.out.println("Test Case1");
    }
    void test2(){
        System.out.println("Test Case2");
    }

    public static void main(String[] args) {

        AutomationClass c1 = new AutomationClass();
        AutomationClass c2 = new AutomationClass("TC2");
        c1.test1();
        c2.test2();
        System.out.println(c2.name);

    }
}
