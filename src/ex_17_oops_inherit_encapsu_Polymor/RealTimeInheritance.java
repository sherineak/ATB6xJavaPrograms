package ex_17_oops_inherit_encapsu_Polymor;

public class RealTimeInheritance {
    public static void main(String[] args) {
        BaseClass b = new test1(); // Dynamic Dispatch
        b.setBrowser("Edge",true);
        System.out.println(b.getBrowser());
        b.openBrowser();
        b.closeBrowser();
    }


}
class test1 extends BaseClass{   //Single inheritance

    @Override         // Method overriding , override the methods of  base/parent/super class
    public void setBrowser(String browser, boolean isAuth) {
        super.setBrowser(browser, isAuth);
    }
}

class BaseClass{
    private String browser;

    public String getBrowser() {                      //encapsulation getter
        return browser;
    }

    public void setBrowser(String browser,boolean isAuth) {         // encapsulation setter
        if(isAuth){
            this.browser = browser;
        }else {
            System.out.println("Not allowed");
        }
    }

    void openBrowser(){
        System.out.println("Chrome Browser");
    }
    void openBrowser(String BrowserName){        // method Overloading
        System.out.println("Chrome Browser" +BrowserName);
    }
    void closeBrowser(){
        System.out.println("Close Browser");
    }
}