import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static java.lang.Thread.sleep;

public class InstagramHomePage extends InstagramBasePage {

    @FindBy(xpath ="//button[contains(@class, 'HoLwm')]" )
    WebElement noticeField;
    @FindBy(xpath = "//div[contains(@class, 'wUAXj')]")
    WebElement searchMyFriend;
    @FindBy(xpath ="//input[@class='XTCLo zyHYP']" )
    WebElement searchMyFriendsenter;
    @FindBy(xpath = "//a[contains(@class, 'yCE8d')]")
    WebElement searchResults;

    public InstagramHomePage(WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(webDriver, this);
    }


    public void like() throws InterruptedException {
        noticeField.click();
        sleep(2000);

    }
     //В поле вести имя для поиска в инстраграме
     public InstagramAntonFoundPage SearchEnter() throws InterruptedException {
            searchMyFriend.click();
            searchMyFriendsenter.sendKeys("");
            sleep(2000);
            searchResults.click();
            return new InstagramAntonFoundPage(webDriver);

        }

}
