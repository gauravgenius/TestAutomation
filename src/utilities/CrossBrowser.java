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
		public void verifyTitle(String browsername)
		{
			if (browsername.equalsIgnoreCase("firefox"))
			{
				//System.setProperty("webdriver.gecko.driver", "C:\\geckodriver-v0.19.1-win64\\geckodriver.exe");
				driver = new FirefoxDriver();
			}
			else if (browsername.equalsIgnoreCase("chrome"))
			{
				System.setProperty("webdriver.chrome.driver","/home/kumar/Selenium/chromedriver");
				driver = new ChromeDriver();
			}
			else if (browsername.equalsIgnoreCase("IE"))
			{
				System.setProperty("webdriver.ie.driver", "C:\\IEDriverServer_x64_3.6.0\\IEDriverServer.exe");
				driver = new InternetExplorerDriver();
			}
			driver.manage().window().maximize();
			driver.get("https://www.google.com");
			//System.out.println(driver.getPageSource());
		}
}

