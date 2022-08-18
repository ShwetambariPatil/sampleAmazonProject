import org.junit.After;
import org.junit.Before;
import pages.BasePage;

import java.io.IOException;

/**
 * Created by shweta on 03-11-2016.
 */
public class BaseTest {
    BasePage basePage = new BasePage();
    @Before
    public void setUP() throws IOException {
        basePage.openBrowser();
    }



    @After
    public void tearDown()
    {
        basePage.closeBrowser();
    }
}
