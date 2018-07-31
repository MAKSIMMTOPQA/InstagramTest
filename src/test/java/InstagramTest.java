import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static java.lang.Thread.sleep;

public class InstagramTest extends InstagramBaseTest {


    @DataProvider
    public Object[][] validDataProvider() {
        return new Object[][]{
                { "iteatest@i.ua", "1q2w3e_4r5t" },

        };
    }

    @Test (dataProvider="validDataProvider")
    public void InstagramSuccessLikeTest (String email, String password) throws InterruptedException {
        InstagramSingInPage instagramSingInPage = instagramLoginPage.singIn();
        sleep (3000);
        InstagramHomePage instagramHomePage = instagramSingInPage.enter(email, password);
        sleep(2000);

        instagramHomePage.like();
        InstagramAntonFoundPage instagramAntonFoundPage = instagramHomePage.SearchEnter();
        sleep(3000);
        sleep(2000);
        instagramAntonFoundPage.likeAndComment();
        sleep(2000);
        Assert.assertEquals(instagramAntonFoundPage.getCurrentUrl("dfsdf" "fdsfsdf"));
        WriteCommentPage writeCommentPage = instagramAntonFoundPage.writenewcomment();

        writeCommentPage.writecommentToFriend();
        writeCommentPage.sendComment();



    }







}
