package pages;

import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

/**
 * Created by  shweta on 03-11-2016.
 */
public class BooksPage extends BasePage{

public BooksPage goToproductPage(){

    driver.findElement(By.linkText("Children's Books")).click();///select children books
  // driver.findElement(By.linkText("Canon")).click();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    return this;
}
}
