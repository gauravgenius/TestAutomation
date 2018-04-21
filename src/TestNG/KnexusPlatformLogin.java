package TestNG;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

//@Author(author = "Gaurav Katiyar",date = "April 20, 2018")
public class KnexusPlatformLogin {

    WebDriver driver;

    @BeforeClass
    public void init(){
        System.setProperty("webdriver.chrome.driver","D:/Drivers/chromedriver.exe");
        driver.get("");
    }
}
