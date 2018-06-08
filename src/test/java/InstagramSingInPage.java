import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static java.lang.Thread.sleep;

public class InstagramSingInPage extends InstagramBasePage {


    @FindBy(xpath = "//input[@aria-label='Номер телефона, имя пользователя или эл. адрес']")
    WebElement nameField;
    @FindBy(xpath = "//input[@aria-label='Пароль']")
    WebElement passwordField;
    @FindBy(xpath = "//button[contains(@class, '_5f5mN')]")
    WebElement enterButton;

    public InstagramSingInPage(WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(webDriver, this);
    }


    //В поле вести свои данные

    public InstagramHomePage enter() throws InterruptedException {
        nameField.sendKeys("");
        passwordField.sendKeys("");

        enterButton.click();
        sleep(2000);
        return new InstagramHomePage(webDriver);
        }


}
