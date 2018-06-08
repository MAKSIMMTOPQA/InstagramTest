import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InstagramLoginPage extends InstagramBasePage{


    @FindBy(xpath = "//a[@href='/accounts/login/']")
    private WebElement enterField;


    public InstagramLoginPage(WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(webDriver, this);
    }



    public InstagramSingInPage singIn(){
        enterField.click();
        return new InstagramSingInPage(webDriver);
     }

}
