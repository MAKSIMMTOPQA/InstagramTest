import org.testng.annotations.Test;

import static java.lang.Thread.sleep;

public class InstagramTest extends InstagramBaseTest {


    @Test
    public void InstagramSuccessLikeTest() throws InterruptedException {
        InstagramSingInPage instagramSingInPage = instagramLoginPage.singIn();
        sleep (3000);
        InstagramHomePage instagramHomePage = instagramSingInPage.enter();
        sleep(2000);

        instagramHomePage.like();
        InstagramAntonFoundPage instagramAntonFoundPage = instagramHomePage.SearchEnter();
        sleep(3000);
        sleep(2000);
        instagramAntonFoundPage.likeAndComment();
        sleep(2000);

        WriteCommentPage writeCommentPage = instagramAntonFoundPage.writenewcomment();

        writeCommentPage.writecommentToFriend();
        writeCommentPage.sendComment();



    }







}
