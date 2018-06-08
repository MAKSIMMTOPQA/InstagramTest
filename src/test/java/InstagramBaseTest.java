import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class InstagramBaseTest {

    WebDriver webDriver;
    InstagramLoginPage instagramLoginPage;

    @BeforeMethod
    public void before() {
        WebDriverManager.chromedriver().setup();

        webDriver = new ChromeDriver();
        webDriver.get("https://www.instagram.com/");
        instagramLoginPage = new InstagramLoginPage(webDriver);
    }

    @AfterMethod
    public void after() {
        webDriver.close();
    }
}