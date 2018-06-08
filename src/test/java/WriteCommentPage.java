
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.awt.image.Kernel;

import static java.lang.Thread.sleep;

public class WriteCommentPage extends InstagramBasePage {
    @FindBy(xpath = "//span[@class='Szr5J ptsdu ']")
    WebElement likeButton;
    @FindBy(xpath ="//textarea[@aria-label='Добавьте комментарий...']")
    WebElement writecommentField;

    public WriteCommentPage(WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(webDriver, this);
    }

    public void writecommentToFriend() throws InterruptedException {

        likeButton.click();
        writecommentField.click();
        sleep(1000);
        writecommentField.sendKeys("eeeeee,bro");
        sleep(2000);

    }
    public void sendComment() throws InterruptedException {
        writecommentField.sendKeys(Keys.ENTER);
        sleep(1000);
    }
}
