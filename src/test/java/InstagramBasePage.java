import org.openqa.selenium.WebDriver;

 abstract public class InstagramBasePage {
    protected WebDriver webDriver;

    public InstagramBasePage (WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public String getCurrentUrl (){
        return webDriver.getCurrentUrl();
    }

    public String getCurrentTittle (){
        return webDriver.getTitle();
    }


}
