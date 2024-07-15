package ex_18_Abstraction.abstractKeyword.Class_ex.Real_ex;

public class TC2_Mozilla extends BaseClass {
    @Override
    String openBrowser() {
        System.out.println("Open mozilla firefox browser");
        return "";
    }

    @Override
    String closeBrowser() {
        System.out.println("Closing browser");
        return "";
    }
}
