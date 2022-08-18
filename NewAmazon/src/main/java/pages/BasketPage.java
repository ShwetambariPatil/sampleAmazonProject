package pages;

import org.apache.http.util.Asserts;
import org.openqa.selenium.By;
import org.junit.Assert;

/**
 * Created by Shweta on 03-11-2016.
 */
public class BasketPage extends BasePage {

    String basketBook;
    String basketbookPrice;
    String basketGlitter;
    String basketGlitterPrice;

    public BasketPage CheckBasketBook()
{

    basketBook = driver.findElement(By.linkText("The Midnight Gang")).getText();
    basketbookPrice = driver.findElement(By.cssSelector(".a-size-medium a-color-price sc-price sc-white-space-nowrap sc-product-price sc-price-sign a-text-bold")).getText();


    return this;
}


public BasketPage CheckBasketGlitter()
{


    return this;
}

}
