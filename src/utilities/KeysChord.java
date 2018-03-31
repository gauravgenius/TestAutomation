package utilities;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class KeysChord {
	@Test
	  public void TestMethod() throws InterruptedException
	  {
		 System.setProperty("webdriver.chrome.driver", "/home/kumar/Selenium/chromedriver");	    
		 WebDriver driver = new ChromeDriver();
	     driver.get("http://www.google.com/");
	     Thread.sleep(3000);
	     String selectLinkOpeninNewTab = Keys.chord(Keys.CONTROL,Keys.RETURN); 
	     driver.findElement(By.linkText("Gmail")).sendKeys(selectLinkOpeninNewTab);
	     Thread.sleep(3000);
	     ArrayList<String> tab = new ArrayList<String> (driver.getWindowHandles());								
		driver.switchTo().window(tab.get(1));
	   } 
}
