package ex_11_Functions;

public class Lab159 {
    public static void main(String[] args) {
        openBrowser();
        testLoginPage1();
        testLoginPage("Page 1");
        closeBrowser();

        openBrowser();
        testLoginPage("Page 2");
        closeBrowser();

        openBrowser();
        testLoginPage("Page 3");
        closeBrowser();

    }
    static void openBrowser(){
        System.out.println("Chrome browser Opened");
    }
    static void testLoginPage1(){
        System.out.println("Testing page 1 opened");
    }
    static void testLoginPage(String page){
        System.out.println("Testing --> "+page);
    }
    static void closeBrowser(){
        System.out.println("Chrome Browser closed");
    }
}
