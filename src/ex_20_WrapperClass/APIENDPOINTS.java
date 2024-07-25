package ex_20_WrapperClass;

public enum APIENDPOINTS {
    Home("https://App.vwo.com","Home"),
    Login("https://App.vwo.com/Login","Login"),
    Dashboard("https://App.vwo.com/Dashboard","Dashboard");


    String Url;
    String page;
    //Home --> https://App.vwo.com
    //Login --> https://App.vwo.com/Login
    //Dashboard --> https://App.vwo.com/Dashboard


    APIENDPOINTS(String url, String page) {
        Url = url;
        this.page = page;
    }

    public String getUrl() {
        return Url;
    }

    public void setUrl(String url) {
        Url = url;
    }

    public String getPage() {
        return page;
    }

    public void setPage(String page) {
        this.page = page;
    }
}
