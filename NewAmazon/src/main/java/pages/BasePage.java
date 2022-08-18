package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

/**
 * Created by Yogesh on 03-11-2016.
 */
public class BasePage {
    public static WebDriver driver;

    public void openBrowser() throws FileNotFoundException,IOException {
        Properties properties=new Properties();
        FileInputStream fileInputStream=new FileInputStream("src/test/Resources/config.properties");
        properties.load(fileInputStream);

        String url= properties.getProperty("url");
        String browser= properties.getProperty("browser");



        if(browser.matches("firefox")){
            driver=new FirefoxDriver();
        }
        else if(browser.matches("chrome")){
            try {
                System.setProperty("webdriver.chrome.driver","src/main/browser/chromedriver.exe");//open browser
                driver = new ChromeDriver();
            } catch (Exception e) {
                System.out.println("FAILURE: Browser did not load: ");
            }

        }
        else if(browser.matches("safari")){
            driver=new SafariDriver();
        }
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }




    public void gotoBooksPage(){

        driver.findElement(By.cssSelector(".nav-line-2")).click();/////////select books
       driver.findElement(By.linkText("Books")).click();
    }


    public void searchProduct()
    {
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Stargazer Glitter Fix Gel Perfect For Applying Glitter..");//search glitter Fix
        driver.findElement(By.cssSelector(".nav-input")).click();
    }
    public void closeBrowser() {
        driver.quit();
    }


}
