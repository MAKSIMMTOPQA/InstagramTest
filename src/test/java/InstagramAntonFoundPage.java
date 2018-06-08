import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

import static java.lang.Thread.sleep;

public class InstagramAntonFoundPage extends InstagramBasePage {


    @FindBy(xpath ="//button[contains(@class, '_6VtSN ')]")
    WebElement subscribeButton;
    @FindBy(xpath = "//div[@class='_9AhH0']")
    private List<WebElement> pictureAmsterdam;
//    @FindBy(xpath = "//span[@class='Szr5J ptsdu ']")
//    WebElement likeButton;



    public InstagramAntonFoundPage(WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(webDriver, this);
    }


    public void likeAndComment (){
        subscribeButton.click();
        }

     public WriteCommentPage writenewcomment() throws InterruptedException {
      pictureAmsterdam.get(1).click();
      sleep(2000);
      return new WriteCommentPage(webDriver);
     }
}
