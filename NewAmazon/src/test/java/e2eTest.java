import org.junit.Test;
import pages.BasketPage;
import pages.BooksPage;
import pages.ProductPage;

/**
 * Created by Shweta on 03-11-2016.
 */
public class e2eTest extends BaseTest{
   // BasePage basePage = new BasePage();

    BasketPage basketPage = new BasketPage();
    BooksPage cameraPage= new BooksPage();
    ProductPage productPage = new ProductPage();

@Test
public void userJourney()
{
    basePage.gotoBooksPage();
    cameraPage.goToproductPage();
    productPage.selectBook().selectBookBuyingOption().addToBasket().gotoAddToBasketPage();
}

}
