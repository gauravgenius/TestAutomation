package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowser {
	WebDriver driver;
	
	@Test
	@Parameters("browser")
	public void launchBrowser(String browsername){
			
			if (browsername.equalsIgnoreCase("firefox")){
				System.setProperty("webdriver.gecko.driver", "C:/WebDrivers/geckodriver.exe");
				driver = new FirefoxDriver();
			}
			
			else if (browsername.equalsIgnoreCase("chrome")){
				System.setProperty("webdriver.chrome.driver","/home/kumar/Selenium/chromedriver");
				driver = new ChromeDriver();
			}
			
			else if (browsername.equalsIgnoreCase("IE")){
				System.setProperty("webdriver.gecko.driver", "C:/WebDrivers/MicrosoftWebDriver.exe");
				driver = new InternetExplorerDriver();
			}
			
			else {
				System.out.print("Associated browser not found");
				System.exit(1);
			}
			
			driver.get("https://www.google.com");
			System.out.println(driver.getPageSource());
		}
}

