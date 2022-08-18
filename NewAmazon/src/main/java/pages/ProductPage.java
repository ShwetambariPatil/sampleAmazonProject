package pages;

import org.openqa.selenium.By;

/**
 * Created by Shweta on 03-11-2016.
 */
public class ProductPage extends BasePage {
  public   String bookName;
    public String bookPrice;
    public String glitterName;
    public String glitterPrice;

public ProductPage selectBook()
{

    driver.findElement(By.linkText("Fiction")).click();//select friction book
   bookName = driver.findElement(By.linkText("The Midnight Gang")).getText();///select midnight gang book
    driver.findElement(By.linkText("The Midnight Gang")).click();
    return this;
}

public ProductPage selectBookBuyingOption()
{
//    driver.findElement(By.linkText("See All Buying Options")).click();
    bookPrice =driver.findElement(By.cssSelector(".a-size-base a-color-price s-price a-text-bold")).getText();//get price of book
    return this;
}


public ProductPage addToBasket()
{
    driver.findElement(By.linkText("Add to Basket")).click();//add to basket
    return this;
}


public ProductPage gotoAddToBasketPage()
{
driver.findElement(By.cssSelector("#nav-cart")).click();
    return this;
}

public ProductPage selectGlitterProduct()
{
glitterName = driver.findElement(By.linkText("Stargazer Glitter Fix Gel Perfect For Applying Glitter To The Body!")).getText();//get glitter product name
    driver.findElement(By.linkText("Stargazer Glitter Fix Gel Perfect For Applying Glitter To The Body!")).click();
    glitterPrice = driver.findElement(By.cssSelector("#priceblock_ourprice")).getText();//get glitter product price
    return this;
}


}

