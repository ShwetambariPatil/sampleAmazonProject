package utils;

import org.openqa.selenium.By;
import pages.BasePage;

/**
 * Created by Yogesh on 03-11-2016.
 */
public class CommonUtils extends BasePage {

    public static void EnterGivenText(By element, String text)
    {
        driver.findElement(element).sendKeys(text);

    }


    public static void click( By Element)
    {
        driver.findElement(Element).click();
    }



    public static boolean isTextPresent(String text) {
        return getVisibleText().contains(text);
    }

    public static String getVisibleText() {

        return driver.findElement(By.tagName("body")).getText();
    }

}
